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
    /// FuelCide
    /// </summary>
    [DataContract]
    public partial class FuelCide :  IEquatable<FuelCide>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FuelCide" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FuelCide() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FuelCide" /> class.
        /// </summary>
        /// <param name="BaseCalcCIDE">percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals (required).</param>
        /// <param name="RateCIDE">percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$ (required).</param>
        /// <param name="ValueCIDE">percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$ (required).</param>
        public FuelCide(double? BaseCalcCIDE = default(double?), double? RateCIDE = default(double?), double? ValueCIDE = default(double?))
        {
            // to ensure "BaseCalcCIDE" is required (not null)
            if (BaseCalcCIDE == null)
            {
                throw new InvalidDataException("BaseCalcCIDE is a required property for FuelCide and cannot be null");
            }
            else
            {
                this.BaseCalcCIDE = BaseCalcCIDE;
            }
            // to ensure "RateCIDE" is required (not null)
            if (RateCIDE == null)
            {
                throw new InvalidDataException("RateCIDE is a required property for FuelCide and cannot be null");
            }
            else
            {
                this.RateCIDE = RateCIDE;
            }
            // to ensure "ValueCIDE" is required (not null)
            if (ValueCIDE == null)
            {
                throw new InvalidDataException("ValueCIDE is a required property for FuelCide and cannot be null");
            }
            else
            {
                this.ValueCIDE = ValueCIDE;
            }
        }
        
        /// <summary>
        /// percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals
        /// </summary>
        /// <value>percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals</value>
        [DataMember(Name="baseCalcCIDE", EmitDefaultValue=false)]
        public double? BaseCalcCIDE { get; set; }
        /// <summary>
        /// percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$
        /// </summary>
        /// <value>percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$</value>
        [DataMember(Name="rateCIDE", EmitDefaultValue=false)]
        public double? RateCIDE { get; set; }
        /// <summary>
        /// percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$
        /// </summary>
        /// <value>percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$</value>
        [DataMember(Name="valueCIDE", EmitDefaultValue=false)]
        public double? ValueCIDE { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FuelCide {\n");
            sb.Append("  BaseCalcCIDE: ").Append(BaseCalcCIDE).Append("\n");
            sb.Append("  RateCIDE: ").Append(RateCIDE).Append("\n");
            sb.Append("  ValueCIDE: ").Append(ValueCIDE).Append("\n");
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
            return this.Equals(obj as FuelCide);
        }

        /// <summary>
        /// Returns true if FuelCide instances are equal
        /// </summary>
        /// <param name="other">Instance of FuelCide to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FuelCide other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.BaseCalcCIDE == other.BaseCalcCIDE ||
                    this.BaseCalcCIDE != null &&
                    this.BaseCalcCIDE.Equals(other.BaseCalcCIDE)
                ) && 
                (
                    this.RateCIDE == other.RateCIDE ||
                    this.RateCIDE != null &&
                    this.RateCIDE.Equals(other.RateCIDE)
                ) && 
                (
                    this.ValueCIDE == other.ValueCIDE ||
                    this.ValueCIDE != null &&
                    this.ValueCIDE.Equals(other.ValueCIDE)
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
                if (this.BaseCalcCIDE != null)
                    hash = hash * 59 + this.BaseCalcCIDE.GetHashCode();
                if (this.RateCIDE != null)
                    hash = hash * 59 + this.RateCIDE.GetHashCode();
                if (this.ValueCIDE != null)
                    hash = hash * 59 + this.ValueCIDE.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
