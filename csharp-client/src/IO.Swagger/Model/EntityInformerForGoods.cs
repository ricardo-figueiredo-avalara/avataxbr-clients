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
    /// EntityInformerForGoods
    /// </summary>
    [DataContract]
    public partial class EntityInformerForGoods :  IEquatable<EntityInformerForGoods>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityInformerForGoods" /> class.
        /// </summary>
        /// <param name="Type">Type.</param>
        /// <param name="TaxRegime">TaxRegime.</param>
        /// <param name="FederalTaxRegime">FederalTaxRegime.</param>
        /// <param name="CityCode">CityCode.</param>
        /// <param name="Address">Address.</param>
        /// <param name="Details">Details.</param>
        /// <param name="IcmsTaxPayer">IcmsTaxPayer.</param>
        public EntityInformerForGoods(EntityType Type = default(EntityType), FederalTaxRegime TaxRegime = default(FederalTaxRegime), EntityInformerForGoodsFederalTaxRegime FederalTaxRegime = default(EntityInformerForGoodsFederalTaxRegime), string CityCode = default(string), Address Address = default(Address), Object Details = default(Object), bool? IcmsTaxPayer = default(bool?))
        {
            this.Type = Type;
            this.TaxRegime = TaxRegime;
            this.FederalTaxRegime = FederalTaxRegime;
            this.CityCode = CityCode;
            this.Address = Address;
            this.Details = Details;
            this.IcmsTaxPayer = IcmsTaxPayer;
        }
        
        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public EntityType Type { get; set; }
        /// <summary>
        /// Gets or Sets TaxRegime
        /// </summary>
        [DataMember(Name="taxRegime", EmitDefaultValue=false)]
        public FederalTaxRegime TaxRegime { get; set; }
        /// <summary>
        /// Gets or Sets FederalTaxRegime
        /// </summary>
        [DataMember(Name="federalTaxRegime", EmitDefaultValue=false)]
        public EntityInformerForGoodsFederalTaxRegime FederalTaxRegime { get; set; }
        /// <summary>
        /// Gets or Sets CityCode
        /// </summary>
        [DataMember(Name="cityCode", EmitDefaultValue=false)]
        public string CityCode { get; set; }
        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name="address", EmitDefaultValue=false)]
        public Address Address { get; set; }
        /// <summary>
        /// Gets or Sets Details
        /// </summary>
        [DataMember(Name="details", EmitDefaultValue=false)]
        public Object Details { get; set; }
        /// <summary>
        /// Gets or Sets IcmsTaxPayer
        /// </summary>
        [DataMember(Name="icmsTaxPayer", EmitDefaultValue=false)]
        public bool? IcmsTaxPayer { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class EntityInformerForGoods {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  TaxRegime: ").Append(TaxRegime).Append("\n");
            sb.Append("  FederalTaxRegime: ").Append(FederalTaxRegime).Append("\n");
            sb.Append("  CityCode: ").Append(CityCode).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
            sb.Append("  IcmsTaxPayer: ").Append(IcmsTaxPayer).Append("\n");
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
            return this.Equals(obj as EntityInformerForGoods);
        }

        /// <summary>
        /// Returns true if EntityInformerForGoods instances are equal
        /// </summary>
        /// <param name="other">Instance of EntityInformerForGoods to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityInformerForGoods other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Type == other.Type ||
                    this.Type != null &&
                    this.Type.Equals(other.Type)
                ) && 
                (
                    this.TaxRegime == other.TaxRegime ||
                    this.TaxRegime != null &&
                    this.TaxRegime.Equals(other.TaxRegime)
                ) && 
                (
                    this.FederalTaxRegime == other.FederalTaxRegime ||
                    this.FederalTaxRegime != null &&
                    this.FederalTaxRegime.Equals(other.FederalTaxRegime)
                ) && 
                (
                    this.CityCode == other.CityCode ||
                    this.CityCode != null &&
                    this.CityCode.Equals(other.CityCode)
                ) && 
                (
                    this.Address == other.Address ||
                    this.Address != null &&
                    this.Address.Equals(other.Address)
                ) && 
                (
                    this.Details == other.Details ||
                    this.Details != null &&
                    this.Details.Equals(other.Details)
                ) && 
                (
                    this.IcmsTaxPayer == other.IcmsTaxPayer ||
                    this.IcmsTaxPayer != null &&
                    this.IcmsTaxPayer.Equals(other.IcmsTaxPayer)
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
                if (this.Type != null)
                    hash = hash * 59 + this.Type.GetHashCode();
                if (this.TaxRegime != null)
                    hash = hash * 59 + this.TaxRegime.GetHashCode();
                if (this.FederalTaxRegime != null)
                    hash = hash * 59 + this.FederalTaxRegime.GetHashCode();
                if (this.CityCode != null)
                    hash = hash * 59 + this.CityCode.GetHashCode();
                if (this.Address != null)
                    hash = hash * 59 + this.Address.GetHashCode();
                if (this.Details != null)
                    hash = hash * 59 + this.Details.GetHashCode();
                if (this.IcmsTaxPayer != null)
                    hash = hash * 59 + this.IcmsTaxPayer.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
