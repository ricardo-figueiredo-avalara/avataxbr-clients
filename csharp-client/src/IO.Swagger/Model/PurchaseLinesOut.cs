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
    /// PurchaseLinesOut
    /// </summary>
    [DataContract]
    public partial class PurchaseLinesOut :  IEquatable<PurchaseLinesOut>, IValidatableObject
    {
        /// <summary>
        /// Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' 
        /// </summary>
        /// <value>Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum UseTypeEnum
        {
            
            /// <summary>
            /// Enum Resale for "resale"
            /// </summary>
            [EnumMember(Value = "resale")]
            Resale,
            
            /// <summary>
            /// Enum Production for "production"
            /// </summary>
            [EnumMember(Value = "production")]
            Production,
            
            /// <summary>
            /// Enum Useorconsumption for "use or consumption"
            /// </summary>
            [EnumMember(Value = "use or consumption")]
            Useorconsumption,
            
            /// <summary>
            /// Enum Fixedassets for "fixed assets"
            /// </summary>
            [EnumMember(Value = "fixed assets")]
            Fixedassets
        }

        /// <summary>
        /// Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' 
        /// </summary>
        /// <value>Type of entity use associated with this line - 'resale' - 'production' - 'use or consumption' - 'fixed assets' </value>
        [DataMember(Name="useType", EmitDefaultValue=false)]
        public UseTypeEnum? UseType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseLinesOut" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PurchaseLinesOut() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseLinesOut" /> class.
        /// </summary>
        /// <param name="LineCode">This string is a unique identifier for this line in the transaction.</param>
        /// <param name="ItemCode">This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. (required).</param>
        /// <param name="NumberOfItems">This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 (default to 1.0).</param>
        /// <param name="LineAmount">This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems)..</param>
        /// <param name="ItemDescription">This string captures the description of the item represented by this line, will be used LC 116.</param>
        /// <param name="LineTaxedDiscount">Conditional discount.</param>
        /// <param name="LineUntaxedDiscount">Unconditional discount.</param>
        /// <param name="UseType">Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39; .</param>
        /// <param name="TaxDeductions">TaxDeductions.</param>
        /// <param name="AvalaraGoodsAndServicesType">AGAST CODE for itemCode.</param>
        /// <param name="LineNetValue">This decimal captures the value of lineAmount - lineTaxedDiscount - sum of withholding..</param>
        /// <param name="CalculatedTax">CalculatedTax.</param>
        public PurchaseLinesOut(int? LineCode = default(int?), string ItemCode = default(string), double? NumberOfItems = 1.0, double? LineAmount = default(double?), string ItemDescription = default(string), double? LineTaxedDiscount = default(double?), double? LineUntaxedDiscount = default(double?), UseTypeEnum? UseType = default(UseTypeEnum?), SalesLinesOutTaxDeductions TaxDeductions = default(SalesLinesOutTaxDeductions), string AvalaraGoodsAndServicesType = default(string), double? LineNetValue = default(double?), PurchaseCalculatedTax CalculatedTax = default(PurchaseCalculatedTax))
        {
            // to ensure "ItemCode" is required (not null)
            if (ItemCode == null)
            {
                throw new InvalidDataException("ItemCode is a required property for PurchaseLinesOut and cannot be null");
            }
            else
            {
                this.ItemCode = ItemCode;
            }
            this.LineCode = LineCode;
            // use default value if no "NumberOfItems" provided
            if (NumberOfItems == null)
            {
                this.NumberOfItems = 1.0;
            }
            else
            {
                this.NumberOfItems = NumberOfItems;
            }
            this.LineAmount = LineAmount;
            this.ItemDescription = ItemDescription;
            this.LineTaxedDiscount = LineTaxedDiscount;
            this.LineUntaxedDiscount = LineUntaxedDiscount;
            this.UseType = UseType;
            this.TaxDeductions = TaxDeductions;
            this.AvalaraGoodsAndServicesType = AvalaraGoodsAndServicesType;
            this.LineNetValue = LineNetValue;
            this.CalculatedTax = CalculatedTax;
        }
        
        /// <summary>
        /// This string is a unique identifier for this line in the transaction
        /// </summary>
        /// <value>This string is a unique identifier for this line in the transaction</value>
        [DataMember(Name="lineCode", EmitDefaultValue=false)]
        public int? LineCode { get; set; }
        /// <summary>
        /// This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
        /// </summary>
        /// <value>This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.</value>
        [DataMember(Name="itemCode", EmitDefaultValue=false)]
        public string ItemCode { get; set; }
        /// <summary>
        /// This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
        /// </summary>
        /// <value>This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1</value>
        [DataMember(Name="numberOfItems", EmitDefaultValue=false)]
        public double? NumberOfItems { get; set; }
        /// <summary>
        /// This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).
        /// </summary>
        /// <value>This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).</value>
        [DataMember(Name="lineAmount", EmitDefaultValue=false)]
        public double? LineAmount { get; set; }
        /// <summary>
        /// This string captures the description of the item represented by this line, will be used LC 116
        /// </summary>
        /// <value>This string captures the description of the item represented by this line, will be used LC 116</value>
        [DataMember(Name="itemDescription", EmitDefaultValue=false)]
        public string ItemDescription { get; set; }
        /// <summary>
        /// Conditional discount
        /// </summary>
        /// <value>Conditional discount</value>
        [DataMember(Name="lineTaxedDiscount", EmitDefaultValue=false)]
        public double? LineTaxedDiscount { get; set; }
        /// <summary>
        /// Unconditional discount
        /// </summary>
        /// <value>Unconditional discount</value>
        [DataMember(Name="lineUntaxedDiscount", EmitDefaultValue=false)]
        public double? LineUntaxedDiscount { get; set; }
        /// <summary>
        /// Gets or Sets TaxDeductions
        /// </summary>
        [DataMember(Name="taxDeductions", EmitDefaultValue=false)]
        public SalesLinesOutTaxDeductions TaxDeductions { get; set; }
        /// <summary>
        /// AGAST CODE for itemCode
        /// </summary>
        /// <value>AGAST CODE for itemCode</value>
        [DataMember(Name="avalaraGoodsAndServicesType", EmitDefaultValue=false)]
        public string AvalaraGoodsAndServicesType { get; set; }
        /// <summary>
        /// This decimal captures the value of lineAmount - lineTaxedDiscount - sum of withholding.
        /// </summary>
        /// <value>This decimal captures the value of lineAmount - lineTaxedDiscount - sum of withholding.</value>
        [DataMember(Name="lineNetValue", EmitDefaultValue=false)]
        public double? LineNetValue { get; set; }
        /// <summary>
        /// Gets or Sets CalculatedTax
        /// </summary>
        [DataMember(Name="calculatedTax", EmitDefaultValue=false)]
        public PurchaseCalculatedTax CalculatedTax { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PurchaseLinesOut {\n");
            sb.Append("  LineCode: ").Append(LineCode).Append("\n");
            sb.Append("  ItemCode: ").Append(ItemCode).Append("\n");
            sb.Append("  NumberOfItems: ").Append(NumberOfItems).Append("\n");
            sb.Append("  LineAmount: ").Append(LineAmount).Append("\n");
            sb.Append("  ItemDescription: ").Append(ItemDescription).Append("\n");
            sb.Append("  LineTaxedDiscount: ").Append(LineTaxedDiscount).Append("\n");
            sb.Append("  LineUntaxedDiscount: ").Append(LineUntaxedDiscount).Append("\n");
            sb.Append("  UseType: ").Append(UseType).Append("\n");
            sb.Append("  TaxDeductions: ").Append(TaxDeductions).Append("\n");
            sb.Append("  AvalaraGoodsAndServicesType: ").Append(AvalaraGoodsAndServicesType).Append("\n");
            sb.Append("  LineNetValue: ").Append(LineNetValue).Append("\n");
            sb.Append("  CalculatedTax: ").Append(CalculatedTax).Append("\n");
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
            return this.Equals(obj as PurchaseLinesOut);
        }

        /// <summary>
        /// Returns true if PurchaseLinesOut instances are equal
        /// </summary>
        /// <param name="other">Instance of PurchaseLinesOut to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PurchaseLinesOut other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.LineCode == other.LineCode ||
                    this.LineCode != null &&
                    this.LineCode.Equals(other.LineCode)
                ) && 
                (
                    this.ItemCode == other.ItemCode ||
                    this.ItemCode != null &&
                    this.ItemCode.Equals(other.ItemCode)
                ) && 
                (
                    this.NumberOfItems == other.NumberOfItems ||
                    this.NumberOfItems != null &&
                    this.NumberOfItems.Equals(other.NumberOfItems)
                ) && 
                (
                    this.LineAmount == other.LineAmount ||
                    this.LineAmount != null &&
                    this.LineAmount.Equals(other.LineAmount)
                ) && 
                (
                    this.ItemDescription == other.ItemDescription ||
                    this.ItemDescription != null &&
                    this.ItemDescription.Equals(other.ItemDescription)
                ) && 
                (
                    this.LineTaxedDiscount == other.LineTaxedDiscount ||
                    this.LineTaxedDiscount != null &&
                    this.LineTaxedDiscount.Equals(other.LineTaxedDiscount)
                ) && 
                (
                    this.LineUntaxedDiscount == other.LineUntaxedDiscount ||
                    this.LineUntaxedDiscount != null &&
                    this.LineUntaxedDiscount.Equals(other.LineUntaxedDiscount)
                ) && 
                (
                    this.UseType == other.UseType ||
                    this.UseType != null &&
                    this.UseType.Equals(other.UseType)
                ) && 
                (
                    this.TaxDeductions == other.TaxDeductions ||
                    this.TaxDeductions != null &&
                    this.TaxDeductions.Equals(other.TaxDeductions)
                ) && 
                (
                    this.AvalaraGoodsAndServicesType == other.AvalaraGoodsAndServicesType ||
                    this.AvalaraGoodsAndServicesType != null &&
                    this.AvalaraGoodsAndServicesType.Equals(other.AvalaraGoodsAndServicesType)
                ) && 
                (
                    this.LineNetValue == other.LineNetValue ||
                    this.LineNetValue != null &&
                    this.LineNetValue.Equals(other.LineNetValue)
                ) && 
                (
                    this.CalculatedTax == other.CalculatedTax ||
                    this.CalculatedTax != null &&
                    this.CalculatedTax.Equals(other.CalculatedTax)
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
                if (this.LineCode != null)
                    hash = hash * 59 + this.LineCode.GetHashCode();
                if (this.ItemCode != null)
                    hash = hash * 59 + this.ItemCode.GetHashCode();
                if (this.NumberOfItems != null)
                    hash = hash * 59 + this.NumberOfItems.GetHashCode();
                if (this.LineAmount != null)
                    hash = hash * 59 + this.LineAmount.GetHashCode();
                if (this.ItemDescription != null)
                    hash = hash * 59 + this.ItemDescription.GetHashCode();
                if (this.LineTaxedDiscount != null)
                    hash = hash * 59 + this.LineTaxedDiscount.GetHashCode();
                if (this.LineUntaxedDiscount != null)
                    hash = hash * 59 + this.LineUntaxedDiscount.GetHashCode();
                if (this.UseType != null)
                    hash = hash * 59 + this.UseType.GetHashCode();
                if (this.TaxDeductions != null)
                    hash = hash * 59 + this.TaxDeductions.GetHashCode();
                if (this.AvalaraGoodsAndServicesType != null)
                    hash = hash * 59 + this.AvalaraGoodsAndServicesType.GetHashCode();
                if (this.LineNetValue != null)
                    hash = hash * 59 + this.LineNetValue.GetHashCode();
                if (this.CalculatedTax != null)
                    hash = hash * 59 + this.CalculatedTax.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
