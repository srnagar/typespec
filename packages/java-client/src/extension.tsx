import { rename, resolveFQN } from "@alloy-js/core";

const main = resolveFQN("Main.Main");
rename(main, "Hello");


const id = resolveFQN("Main.id.id");
rename(id, "myId");
