/* 
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
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
    /// LineForGoodsAdi
    /// </summary>
    [DataContract]
    public partial class LineForGoodsAdi :  IEquatable<LineForGoodsAdi>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LineForGoodsAdi" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LineForGoodsAdi() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LineForGoodsAdi" /> class.
        /// </summary>
        /// <param name="AddNumber">aditional sequence number (1 to 100) (required).</param>
        /// <param name="SequentialNumber">sequential item number for this adi, sequence number (1 to 999) (required).</param>
        /// <param name="ManufacturerCode">Manufatorer erp internal code (required).</param>
        /// <param name="AdiDiscount">This decimal 13 integers and 2 decimals, aditional adi discount.</param>
        /// <param name="DrawbackNumber">Drawback number.</param>
        public LineForGoodsAdi(int? AddNumber = default(int?), int? SequentialNumber = default(int?), string ManufacturerCode = default(string), double? AdiDiscount = default(double?), string DrawbackNumber = default(string))
        {
            // to ensure "AddNumber" is required (not null)
            if (AddNumber == null)
            {
                throw new InvalidDataException("AddNumber is a required property for LineForGoodsAdi and cannot be null");
            }
            else
            {
                this.AddNumber = AddNumber;
            }
            // to ensure "SequentialNumber" is required (not null)
            if (SequentialNumber == null)
            {
                throw new InvalidDataException("SequentialNumber is a required property for LineForGoodsAdi and cannot be null");
            }
            else
            {
                this.SequentialNumber = SequentialNumber;
            }
            // to ensure "ManufacturerCode" is required (not null)
            if (ManufacturerCode == null)
            {
                throw new InvalidDataException("ManufacturerCode is a required property for LineForGoodsAdi and cannot be null");
            }
            else
            {
                this.ManufacturerCode = ManufacturerCode;
            }
            this.AdiDiscount = AdiDiscount;
            this.DrawbackNumber = DrawbackNumber;
        }
        
        /// <summary>
        /// aditional sequence number (1 to 100)
        /// </summary>
        /// <value>aditional sequence number (1 to 100)</value>
        [DataMember(Name="addNumber", EmitDefaultValue=false)]
        public int? AddNumber { get; set; }
        /// <summary>
        /// sequential item number for this adi, sequence number (1 to 999)
        /// </summary>
        /// <value>sequential item number for this adi, sequence number (1 to 999)</value>
        [DataMember(Name="sequentialNumber", EmitDefaultValue=false)]
        public int? SequentialNumber { get; set; }
        /// <summary>
        /// Manufatorer erp internal code
        /// </summary>
        /// <value>Manufatorer erp internal code</value>
        [DataMember(Name="manufacturerCode", EmitDefaultValue=false)]
        public string ManufacturerCode { get; set; }
        /// <summary>
        /// This decimal 13 integers and 2 decimals, aditional adi discount
        /// </summary>
        /// <value>This decimal 13 integers and 2 decimals, aditional adi discount</value>
        [DataMember(Name="adiDiscount", EmitDefaultValue=false)]
        public double? AdiDiscount { get; set; }
        /// <summary>
        /// Drawback number
        /// </summary>
        /// <value>Drawback number</value>
        [DataMember(Name="drawbackNumber", EmitDefaultValue=false)]
        public string DrawbackNumber { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LineForGoodsAdi {\n");
            sb.Append("  AddNumber: ").Append(AddNumber).Append("\n");
            sb.Append("  SequentialNumber: ").Append(SequentialNumber).Append("\n");
            sb.Append("  ManufacturerCode: ").Append(ManufacturerCode).Append("\n");
            sb.Append("  AdiDiscount: ").Append(AdiDiscount).Append("\n");
            sb.Append("  DrawbackNumber: ").Append(DrawbackNumber).Append("\n");
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
            return this.Equals(obj as LineForGoodsAdi);
        }

        /// <summary>
        /// Returns true if LineForGoodsAdi instances are equal
        /// </summary>
        /// <param name="other">Instance of LineForGoodsAdi to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LineForGoodsAdi other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.AddNumber == other.AddNumber ||
                    this.AddNumber != null &&
                    this.AddNumber.Equals(other.AddNumber)
                ) && 
                (
                    this.SequentialNumber == other.SequentialNumber ||
                    this.SequentialNumber != null &&
                    this.SequentialNumber.Equals(other.SequentialNumber)
                ) && 
                (
                    this.ManufacturerCode == other.ManufacturerCode ||
                    this.ManufacturerCode != null &&
                    this.ManufacturerCode.Equals(other.ManufacturerCode)
                ) && 
                (
                    this.AdiDiscount == other.AdiDiscount ||
                    this.AdiDiscount != null &&
                    this.AdiDiscount.Equals(other.AdiDiscount)
                ) && 
                (
                    this.DrawbackNumber == other.DrawbackNumber ||
                    this.DrawbackNumber != null &&
                    this.DrawbackNumber.Equals(other.DrawbackNumber)
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
                if (this.AddNumber != null)
                    hash = hash * 59 + this.AddNumber.GetHashCode();
                if (this.SequentialNumber != null)
                    hash = hash * 59 + this.SequentialNumber.GetHashCode();
                if (this.ManufacturerCode != null)
                    hash = hash * 59 + this.ManufacturerCode.GetHashCode();
                if (this.AdiDiscount != null)
                    hash = hash * 59 + this.AdiDiscount.GetHashCode();
                if (this.DrawbackNumber != null)
                    hash = hash * 59 + this.DrawbackNumber.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // ManufacturerCode (string) maxLength
            if(this.ManufacturerCode != null && this.ManufacturerCode.Length > 60)
            {
                yield return new ValidationResult("Invalid value for ManufacturerCode, length must be less than 60.", new [] { "ManufacturerCode" });
            }

            // ManufacturerCode (string) minLength
            if(this.ManufacturerCode != null && this.ManufacturerCode.Length < 1)
            {
                yield return new ValidationResult("Invalid value for ManufacturerCode, length must be greater than 1.", new [] { "ManufacturerCode" });
            }

            // DrawbackNumber (string) minLength
            if(this.DrawbackNumber != null && this.DrawbackNumber.Length < 1)
            {
                yield return new ValidationResult("Invalid value for DrawbackNumber, length must be greater than 1.", new [] { "DrawbackNumber" });
            }

            // DrawbackNumber (string) pattern
            Regex regexDrawbackNumber = new Regex(@"[0-9]{0,11}", RegexOptions.CultureInvariant);
            if (false == regexDrawbackNumber.Match(this.DrawbackNumber).Success)
            {
                yield return new ValidationResult("Invalid value for DrawbackNumber, must match a pattern of /[0-9]{0,11}/.", new [] { "DrawbackNumber" });
            }

            yield break;
        }
    }

}
