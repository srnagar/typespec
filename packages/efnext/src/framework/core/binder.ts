import { createContext } from "./context.js";

export interface OutputDeclaration {
  name: string;
  scope: Scope;
  refkey: unknown;
}

export interface ScopeBase {
  kind: string;
  bindings: Map<string, OutputDeclaration>;
  bindingsByKey: Map<unknown, OutputDeclaration>;
  children: Map<string, Scope>;
  parent: Scope | undefined;
  binder: Binder;
  meta: any;
}

// could include package scope
export type Scope = LocalScope | ModuleScope | GlobalScope;

export interface LocalScope extends ScopeBase {
  kind: "local";
  name: string;
  parent: Scope;
  children: Map<string, LocalScope>;
}

export interface ModuleScope extends ScopeBase {
  kind: "module";
  path: string;
  /** could probably grow to include namespace etc. */
  children: Map<string, LocalScope | ModuleScope>;
  parent: GlobalScope; // dunno if modules should be able to nest...
}

export interface GlobalScope extends ScopeBase {
  kind: "global";
  parent: undefined;
  children: Map<string, ModuleScope | LocalScope>;
}

export const BinderContext = createContext<Binder>();

export interface Binder {
  createLocalScope(name: string, parent: LocalScope | undefined, meta?: unknown): LocalScope;
  createModuleScope(path: string, meta?: unknown): ModuleScope;
  createDeclaration(name: string, scope?: LocalScope, refkey?: unknown): void;
  resolveDeclarationByKey(
    currentScope: LocalScope,
    refkey: unknown
  ): ResolutionResult | ResolutionFailure;
  resolveOrWaitForDeclaration(
    currentScope: LocalScope,
    refkey: unknown
  ): Promise<ResolutionResult | ResolutionFailure>;
}

export interface ResolutionFailure {
  resolved: false;
}

export interface ResolutionResult {
  resolved: true;
  targetDeclaration: OutputDeclaration;
  pathUp: Scope[];
  pathDown: Scope[];
  commonScope: Scope | undefined;
}

export function createOutputBinder(): Binder {
  const binder: Binder = {
    createLocalScope,
    createModuleScope,
    createDeclaration,
    resolveDeclarationByKey,
    resolveOrWaitForDeclaration,
  };

  const globalScope: GlobalScope = {
    kind: "global",
    bindings: new Map(),
    bindingsByKey: new Map(),
    children: new Map(),
    parent: undefined,
    binder,
    meta: {},
  };

  const knownDeclarations = new Map<unknown, OutputDeclaration>();
  const waitingDeclarations = new Map<unknown, ((value: unknown) => void)[]>();
  return binder;

  function createLocalScope(name: string, parent: Scope = globalScope, meta?: unknown): LocalScope {
    const scope: LocalScope = {
      kind: "local",
      name,
      bindings: new Map(),
      bindingsByKey: new Map(),
      children: new Map(),
      parent,
      binder,
      meta,
    };

    if (parent) {
      parent.children.set(name, scope);
    }

    return scope;
  }

  function createModuleScope(path: string, meta?: unknown): ModuleScope {
    const scope: ModuleScope = {
      kind: "module",
      path,
      bindings: new Map(),
      bindingsByKey: new Map(),
      children: new Map(),
      parent: globalScope,
      binder,
      meta,
    };

    globalScope.children.set(path, scope);

    return scope;
  }

  function createDeclaration(name: string, scope: Scope = globalScope, refkey: unknown) {
    const declaration: OutputDeclaration = {
      name,
      scope,
      refkey,
    };

    const targetScope = scope ? scope : globalScope;
    targetScope.bindings.set(name, declaration);
    knownDeclarations.set(refkey, declaration);
    if (waitingDeclarations.has(refkey)) {
      const cbs = waitingDeclarations.get(refkey)!;
      for (const cb of cbs) {
        console.log("Resolving for", (refkey as any).name);
        cb(declaration);
      }
    }
    return declaration;
  }

  // todo: handle key not yet found because its yet to be declared
  function resolveDeclarationByKey(
    currentScope: LocalScope,
    key: unknown
  ): ResolutionFailure | ResolutionResult {
    const targetDeclaration = knownDeclarations.get(key);
    if (!targetDeclaration) {
      return { resolved: false };
    }
    const targetScope = targetDeclaration.scope;
    const targetChain = scopeChain(targetScope);
    const currentChain = scopeChain(currentScope);
    let diffStart = 0;
    while (
      targetChain[diffStart] &&
      currentChain[diffStart] &&
      targetChain[diffStart] === currentChain[diffStart]
    ) {
      diffStart++;
    }

    const pathUp = currentChain.slice(diffStart);
    const pathDown = targetChain.slice(diffStart);
    const commonScope = targetChain[diffStart - 1] ?? null;

    return { resolved: true, pathUp, pathDown, commonScope, targetDeclaration };
  }

  async function resolveOrWaitForDeclaration(scope: LocalScope, refkey: unknown) {
    if (!knownDeclarations.has(refkey)) {
      await declarationAvailable(refkey);
    }

    return resolveDeclarationByKey(scope, refkey);
  }

  function declarationAvailable(refkey: unknown) {
    if (!waitingDeclarations.has(refkey)) {
      waitingDeclarations.set(refkey, []);
    }

    const waitingList = waitingDeclarations.get(refkey);
    return new Promise((resolve) => {
      waitingList?.push(resolve);
    });
  }

  function scopeChain(scope: Scope | undefined) {
    const chain = [];
    while (scope) {
      chain.unshift(scope);
      scope = scope.parent;
    }

    return chain;
  }
}
