import { BaseType, ModelProperty, Value } from "@typespec/compiler";
import { $, defineKit } from "@typespec/compiler/typekit";
import { getAuthentication, HttpAuth } from "@typespec/http";
import { Client } from "../../interfaces.js";
import { AccessKit, getAccess, getName, NameKit } from "./utils.js";

export interface SdkCredential extends BaseType {
  kind: "Credential";
  scheme: HttpAuth;
}

export interface SdkModelPropertyKit extends NameKit<ModelProperty>, AccessKit<ModelProperty> {
  /**
   * Returns whether it's an endpoint parameter or not.
   *
   * @param type whether it's an endpoint parameter or not
   */
  isEndpoint(client: Client, type: ModelProperty): boolean;

  /**
   * Get credential information from the model property. Returns undefined if the credential parameter
   */
  getCredentialAuth(client: Client, type: ModelProperty): HttpAuth[] | undefined;

  /**
   * Returns whether the property is a discriminator on the model it's on.
   */
  isDiscriminator(type: ModelProperty): boolean;
  /**
   * Returns whehter it's a credential parameter or not.
   *
   * @param type: model property we are checking to see if is a credential parameter
   */
  isCredential(client: Client, modelProperty: ModelProperty): boolean;

  /**
   * Returns whether the model property is part of the client's initialization or not.
   */
  isOnClient(modelProperty: ModelProperty): boolean;

  /**
   * Returns whether the model property has a client default value or not.
   */
  getClientDefaultValue(client: Client, modelProperty: ModelProperty): Value | undefined;

  /**
   * Get access of a property
   */
  getAccess(modelProperty: ModelProperty): "public" | "internal";
}

interface TypeKit {
  modelProperty: SdkModelPropertyKit;
}

declare module "@typespec/compiler/typekit" {
  // eslint-disable-next-line @typescript-eslint/no-empty-object-type
  interface ModelPropertyKit extends SdkModelPropertyKit {}
}

defineKit<TypeKit>({
  modelProperty: {
    isEndpoint(client, type) {
      const clientParams = $.client.getParameters(client);
      return type.name === "endpoint" && Boolean(clientParams.find((p) => p === type));
    },
    isCredential(modelProperty) {
      return modelProperty.name === "credential";
    },
    // eslint-disable-next-line @typescript-eslint/no-unused-vars
    isOnClient(modelProperty) {
      return false;
    },
    getClientDefaultValue(client, modelProperty) {
      if ($.modelProperty.isEndpoint(client, modelProperty)) {
        return modelProperty.defaultValue;
      }
      return undefined
    },
    getCredentialAuth(client, type) {
      const isCredential = $.client
        .getParameters(client)
        .find((p) => p.name === "credential" && p === type);
      if (!isCredential || type.type.kind !== "String") return undefined;
      const scheme = type.type.value;
      return getAuthentication($.program, client.service)
        ?.options.flatMap((o) => o.schemes)
        .filter((s) => s.type === scheme);
    },
    isDiscriminator(type) {
      const sourceModel = type.model;
      if (!sourceModel) return false;
      const disc = $.model.getDiscriminatorProperty(sourceModel);
      return disc === type;
    },
    getAccess(modelProperty) {
      return getAccess(modelProperty);
    },
    getName(modelProperty) {
      return getName(modelProperty);
    },
  },
});
