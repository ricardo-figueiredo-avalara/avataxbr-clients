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
    /// SalesCalculatedTaxSummaryForService
    /// </summary>
    [DataContract]
    public partial class SalesCalculatedTaxSummaryForService :  IEquatable<SalesCalculatedTaxSummaryForService>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SalesCalculatedTaxSummaryForService" /> class.
        /// </summary>
        /// <param name="NumberOfLines">Count of lines.</param>
        /// <param name="Subtotal">sum of all line tax attribute.</param>
        /// <param name="TotalTax">sum of all line lineAmount attribute.</param>
        /// <param name="GrandTotal">sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute.</param>
        /// <param name="TaxByType">TaxByType.</param>
        public SalesCalculatedTaxSummaryForService(int? NumberOfLines = default(int?), double? Subtotal = default(double?), double? TotalTax = default(double?), double? GrandTotal = default(double?), SalesCalculatedTaxSummaryForServiceTaxByType TaxByType = default(SalesCalculatedTaxSummaryForServiceTaxByType))
        {
            this.NumberOfLines = NumberOfLines;
            this.Subtotal = Subtotal;
            this.TotalTax = TotalTax;
            this.GrandTotal = GrandTotal;
            this.TaxByType = TaxByType;
        }
        
        /// <summary>
        /// Count of lines
        /// </summary>
        /// <value>Count of lines</value>
        [DataMember(Name="numberOfLines", EmitDefaultValue=false)]
        public int? NumberOfLines { get; set; }
        /// <summary>
        /// sum of all line tax attribute
        /// </summary>
        /// <value>sum of all line tax attribute</value>
        [DataMember(Name="subtotal", EmitDefaultValue=false)]
        public double? Subtotal { get; set; }
        /// <summary>
        /// sum of all line lineAmount attribute
        /// </summary>
        /// <value>sum of all line lineAmount attribute</value>
        [DataMember(Name="totalTax", EmitDefaultValue=false)]
        public double? TotalTax { get; set; }
        /// <summary>
        /// sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
        /// </summary>
        /// <value>sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute</value>
        [DataMember(Name="grandTotal", EmitDefaultValue=false)]
        public double? GrandTotal { get; set; }
        /// <summary>
        /// Gets or Sets TaxByType
        /// </summary>
        [DataMember(Name="taxByType", EmitDefaultValue=false)]
        public SalesCalculatedTaxSummaryForServiceTaxByType TaxByType { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SalesCalculatedTaxSummaryForService {\n");
            sb.Append("  NumberOfLines: ").Append(NumberOfLines).Append("\n");
            sb.Append("  Subtotal: ").Append(Subtotal).Append("\n");
            sb.Append("  TotalTax: ").Append(TotalTax).Append("\n");
            sb.Append("  GrandTotal: ").Append(GrandTotal).Append("\n");
            sb.Append("  TaxByType: ").Append(TaxByType).Append("\n");
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
            return this.Equals(obj as SalesCalculatedTaxSummaryForService);
        }

        /// <summary>
        /// Returns true if SalesCalculatedTaxSummaryForService instances are equal
        /// </summary>
        /// <param name="other">Instance of SalesCalculatedTaxSummaryForService to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SalesCalculatedTaxSummaryForService other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.NumberOfLines == other.NumberOfLines ||
                    this.NumberOfLines != null &&
                    this.NumberOfLines.Equals(other.NumberOfLines)
                ) && 
                (
                    this.Subtotal == other.Subtotal ||
                    this.Subtotal != null &&
                    this.Subtotal.Equals(other.Subtotal)
                ) && 
                (
                    this.TotalTax == other.TotalTax ||
                    this.TotalTax != null &&
                    this.TotalTax.Equals(other.TotalTax)
                ) && 
                (
                    this.GrandTotal == other.GrandTotal ||
                    this.GrandTotal != null &&
                    this.GrandTotal.Equals(other.GrandTotal)
                ) && 
                (
                    this.TaxByType == other.TaxByType ||
                    this.TaxByType != null &&
                    this.TaxByType.Equals(other.TaxByType)
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
                if (this.NumberOfLines != null)
                    hash = hash * 59 + this.NumberOfLines.GetHashCode();
                if (this.Subtotal != null)
                    hash = hash * 59 + this.Subtotal.GetHashCode();
                if (this.TotalTax != null)
                    hash = hash * 59 + this.TotalTax.GetHashCode();
                if (this.GrandTotal != null)
                    hash = hash * 59 + this.GrandTotal.GetHashCode();
                if (this.TaxByType != null)
                    hash = hash * 59 + this.TaxByType.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
