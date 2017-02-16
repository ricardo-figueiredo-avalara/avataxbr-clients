/* 
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;

namespace IO.Swagger.Model
{
    /// <summary>
    /// PurchaseTransactionIn
    /// </summary>
    [DataContract]
    public partial class PurchaseTransactionIn :  IEquatable<PurchaseTransactionIn>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseTransactionIn" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PurchaseTransactionIn() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseTransactionIn" /> class.
        /// </summary>
        /// <param name="Header">Header (required).</param>
        /// <param name="Lines">Lines (required).</param>
        public PurchaseTransactionIn(PurchaseHeaderIn Header = default(PurchaseHeaderIn), List<PurchaseLinesIn> Lines = default(List<PurchaseLinesIn>))
        {
            // to ensure "Header" is required (not null)
            if (Header == null)
            {
                throw new InvalidDataException("Header is a required property for PurchaseTransactionIn and cannot be null");
            }
            else
            {
                this.Header = Header;
            }
            // to ensure "Lines" is required (not null)
            if (Lines == null)
            {
                throw new InvalidDataException("Lines is a required property for PurchaseTransactionIn and cannot be null");
            }
            else
            {
                this.Lines = Lines;
            }
        }
        
        /// <summary>
        /// Gets or Sets Header
        /// </summary>
        [DataMember(Name="header", EmitDefaultValue=false)]
        public PurchaseHeaderIn Header { get; set; }
        /// <summary>
        /// Gets or Sets Lines
        /// </summary>
        [DataMember(Name="lines", EmitDefaultValue=false)]
        public List<PurchaseLinesIn> Lines { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PurchaseTransactionIn {\n");
            sb.Append("  Header: ").Append(Header).Append("\n");
            sb.Append("  Lines: ").Append(Lines).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            return this.Equals(obj as PurchaseTransactionIn);
        }

        /// <summary>
        /// Returns true if PurchaseTransactionIn instances are equal
        /// </summary>
        /// <param name="other">Instance of PurchaseTransactionIn to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PurchaseTransactionIn other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Header == other.Header ||
                    this.Header != null &&
                    this.Header.Equals(other.Header)
                ) && 
                (
                    this.Lines == other.Lines ||
                    this.Lines != null &&
                    this.Lines.SequenceEqual(other.Lines)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            // credit: http://stackoverflow.com/a/263416/677735
            unchecked // Overflow is fine, just wrap
            {
                int hash = 41;
                // Suitable nullity checks etc, of course :)
                if (this.Header != null)
                    hash = hash * 59 + this.Header.GetHashCode();
                if (this.Lines != null)
                    hash = hash * 59 + this.Lines.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}