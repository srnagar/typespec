// <auto-generated/>

#nullable disable

using System;

namespace Payload.ContentNegotiation
{
    [AttributeUsage((AttributeTargets.Class | AttributeTargets.Struct), AllowMultiple = true, Inherited = true)]
    internal partial class CodeGenSerializationAttribute : Attribute
    {
        public CodeGenSerializationAttribute(string propertyName)
        {
            PropertyName = propertyName;
        }

        public CodeGenSerializationAttribute(string propertyName, string propertySerializationName)
        {
            PropertyName = propertyName;
            PropertySerializationName = propertySerializationName;
        }

        /// <summary> Gets or sets the property name which these hooks should apply to. </summary>
        public string PropertyName { get; }

        /// <summary> Gets or sets the serialization name of the property. </summary>
        public string PropertySerializationName { get; set; }

        /// <summary>
        /// Gets or sets the method name to use when serializing the property value (property name excluded).
        /// The signature of the serialization hook method must be or compatible with when invoking: private void SerializeHook(Utf8JsonWriter writer);
        /// </summary>
        public string SerializationValueHook { get; set; }

        /// <summary>
        /// Gets or sets the method name to use when deserializing the property value from the JSON.
        /// private static void DeserializationHook(JsonProperty property, ref TypeOfTheProperty propertyValue); // if the property is required
        /// private static void DeserializationHook(JsonProperty property, ref Optional&lt;TypeOfTheProperty&gt; propertyValue); // if the property is optional
        /// </summary>
        public string DeserializationValueHook { get; set; }
    }
}
