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
    /// VehicleID
    /// </summary>
    [DataContract]
    public partial class VehicleID :  IEquatable<VehicleID>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleID" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VehicleID() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleID" /> class.
        /// </summary>
        /// <param name="LicensePlate">LicensePlate (required).</param>
        /// <param name="StateCode">StateCode (required).</param>
        /// <param name="Rtnc">Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT).</param>
        public VehicleID(string LicensePlate = default(string), StateEnum StateCode = default(StateEnum), string Rtnc = default(string))
        {
            // to ensure "LicensePlate" is required (not null)
            if (LicensePlate == null)
            {
                throw new InvalidDataException("LicensePlate is a required property for VehicleID and cannot be null");
            }
            else
            {
                this.LicensePlate = LicensePlate;
            }
            // to ensure "StateCode" is required (not null)
            if (StateCode == null)
            {
                throw new InvalidDataException("StateCode is a required property for VehicleID and cannot be null");
            }
            else
            {
                this.StateCode = StateCode;
            }
            this.Rtnc = Rtnc;
        }
        
        /// <summary>
        /// Gets or Sets LicensePlate
        /// </summary>
        [DataMember(Name="licensePlate", EmitDefaultValue=false)]
        public string LicensePlate { get; set; }
        /// <summary>
        /// Gets or Sets StateCode
        /// </summary>
        [DataMember(Name="stateCode", EmitDefaultValue=false)]
        public StateEnum StateCode { get; set; }
        /// <summary>
        /// Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)
        /// </summary>
        /// <value>Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT)</value>
        [DataMember(Name="rtnc", EmitDefaultValue=false)]
        public string Rtnc { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class VehicleID {\n");
            sb.Append("  LicensePlate: ").Append(LicensePlate).Append("\n");
            sb.Append("  StateCode: ").Append(StateCode).Append("\n");
            sb.Append("  Rtnc: ").Append(Rtnc).Append("\n");
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
            return this.Equals(obj as VehicleID);
        }

        /// <summary>
        /// Returns true if VehicleID instances are equal
        /// </summary>
        /// <param name="other">Instance of VehicleID to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VehicleID other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.LicensePlate == other.LicensePlate ||
                    this.LicensePlate != null &&
                    this.LicensePlate.Equals(other.LicensePlate)
                ) && 
                (
                    this.StateCode == other.StateCode ||
                    this.StateCode != null &&
                    this.StateCode.Equals(other.StateCode)
                ) && 
                (
                    this.Rtnc == other.Rtnc ||
                    this.Rtnc != null &&
                    this.Rtnc.Equals(other.Rtnc)
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
                if (this.LicensePlate != null)
                    hash = hash * 59 + this.LicensePlate.GetHashCode();
                if (this.StateCode != null)
                    hash = hash * 59 + this.StateCode.GetHashCode();
                if (this.Rtnc != null)
                    hash = hash * 59 + this.Rtnc.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // LicensePlate (string) pattern
            Regex regexLicensePlate = new Regex(@"[A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3}", RegexOptions.CultureInvariant);
            if (false == regexLicensePlate.Match(this.LicensePlate).Success)
            {
                yield return new ValidationResult("Invalid value for LicensePlate, must match a pattern of /[A-Z]{2,3}[0-9]{4}|[A-Z]{3,4}[0-9]{3}/.", new [] { "LicensePlate" });
            }

            // Rtnc (string) maxLength
            if(this.Rtnc != null && this.Rtnc.Length > 20)
            {
                yield return new ValidationResult("Invalid value for Rtnc, length must be less than 20.", new [] { "Rtnc" });
            }

            yield break;
        }
    }

}
