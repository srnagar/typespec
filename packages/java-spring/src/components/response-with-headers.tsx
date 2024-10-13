import { code } from "@alloy-js/core";
import * as jv from "@alloy-js/java";
import { springFramework } from "../spring/libraries/index.js";

/**
 * Used to represent a response that contains headers. Wraps the actual
 * response object.
 */
export function ResponseWithHeaders() {
  // prettier-ignore
  const multiValueMap = (
    <>
      {springFramework.MultiValueMap}<jv.Generics types={["String", "String"]} />
    </>
  );

  return (
    <jv.SourceFile path="ResponseWithHeaders.java">
      <jv.Class
        public
        name="ResponseWithHeaders"
        generics={{
          T: null,
        }}
      >
        <jv.Variable private type="T" name="response" />
        <jv.Variable private type={multiValueMap} name="headers" />
        <jv.Constructor
          public
          parameters={{
            response: "T",
            headers: multiValueMap,
          }}
        >
          {code`
            this.response = response;
            this.headers = headers;
          `}
        </jv.Constructor>
        <jv.Constructor
          public
          parameters={{
            headers: multiValueMap,
          }}
        >
          {code`
            this.response = null;
            this.headers = headers;
          `}
        </jv.Constructor>

        <jv.Method name="getResponse" return="T" public>
          return this.response;
        </jv.Method>

        <jv.Method name="setResponse" public parameters={{ response: "T" }}>
          this.response = response;
        </jv.Method>

        <jv.Method name="getHeaders" return={multiValueMap} public>
          return this.headers;
        </jv.Method>

        <jv.Method name="setHeaders" public parameters={{ headers: multiValueMap }}>
          this.headers = headers;
        </jv.Method>
      </jv.Class>
    </jv.SourceFile>
  );
}