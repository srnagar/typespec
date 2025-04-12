// <auto-generated/>

#nullable disable

using System;
using System.ComponentModel;

namespace SampleTypeSpec
{
    /// <summary> The Thing_requiredLiteralString. </summary>
    public readonly partial struct ThingRequiredLiteralString : IEquatable<ThingRequiredLiteralString>
    {
        private readonly string _value;
        /// <summary> accept. </summary>
        private const string AcceptValue = "accept";

        /// <summary> Initializes a new instance of <see cref="ThingRequiredLiteralString"/>. </summary>
        /// <param name="value"> The value. </param>
        /// <exception cref="ArgumentNullException"> <paramref name="value"/> is null. </exception>
        public ThingRequiredLiteralString(string value)
        {
            Argument.AssertNotNull(value, nameof(value));

            _value = value;
        }

        /// <summary> accept. </summary>
        public static ThingRequiredLiteralString Accept { get; } = new ThingRequiredLiteralString(AcceptValue);

        /// <summary> Determines if two <see cref="ThingRequiredLiteralString"/> values are the same. </summary>
        /// <param name="left"> The left value to compare. </param>
        /// <param name="right"> The right value to compare. </param>
        public static bool operator ==(ThingRequiredLiteralString left, ThingRequiredLiteralString right) => left.Equals(right);

        /// <summary> Determines if two <see cref="ThingRequiredLiteralString"/> values are not the same. </summary>
        /// <param name="left"> The left value to compare. </param>
        /// <param name="right"> The right value to compare. </param>
        public static bool operator !=(ThingRequiredLiteralString left, ThingRequiredLiteralString right) => !left.Equals(right);

        /// <summary> Converts a string to a <see cref="ThingRequiredLiteralString"/>. </summary>
        /// <param name="value"> The value. </param>
        public static implicit operator ThingRequiredLiteralString(string value) => new ThingRequiredLiteralString(value);

        /// <param name="obj"> The object to compare. </param>
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override bool Equals(object obj) => obj is ThingRequiredLiteralString other && Equals(other);

        /// <param name="other"> The instance to compare. </param>
        public bool Equals(ThingRequiredLiteralString other) => string.Equals(_value, other._value, StringComparison.InvariantCultureIgnoreCase);

        /// <inheritdoc/>
        [EditorBrowsable(EditorBrowsableState.Never)]
        public override int GetHashCode() => _value != null ? StringComparer.InvariantCultureIgnoreCase.GetHashCode(_value) : 0;

        /// <inheritdoc/>
        public override string ToString() => _value;
    }
}
