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
    /// Object with summary of all taxes returned by engine
    /// </summary>
    [DataContract]
    public partial class SalesCalculatedTaxSummaryForServiceTaxByType :  IEquatable<SalesCalculatedTaxSummaryForServiceTaxByType>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SalesCalculatedTaxSummaryForServiceTaxByType" /> class.
        /// </summary>
        /// <param name="PisRf">PisRf.</param>
        /// <param name="CofinsRf">CofinsRf.</param>
        /// <param name="CsllRf">CsllRf.</param>
        /// <param name="Irrf">Irrf.</param>
        /// <param name="InssRf">InssRf.</param>
        /// <param name="Pis">Pis.</param>
        /// <param name="Cofins">Cofins.</param>
        /// <param name="Csll">Csll.</param>
        /// <param name="IssRf">IssRf.</param>
        /// <param name="Iss">Iss.</param>
        /// <param name="AproxtribCity">AproxtribCity.</param>
        /// <param name="AproxtribFed">AproxtribFed.</param>
        /// <param name="Irpj">Irpj.</param>
        /// <param name="Inss">Inss.</param>
        public SalesCalculatedTaxSummaryForServiceTaxByType(TaxByTypeSummaryForService PisRf = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService CofinsRf = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService CsllRf = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService Irrf = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService InssRf = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService Pis = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService Cofins = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService Csll = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService IssRf = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService Iss = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService AproxtribCity = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService AproxtribFed = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService Irpj = default(TaxByTypeSummaryForService), TaxByTypeSummaryForService Inss = default(TaxByTypeSummaryForService))
        {
            this.PisRf = PisRf;
            this.CofinsRf = CofinsRf;
            this.CsllRf = CsllRf;
            this.Irrf = Irrf;
            this.InssRf = InssRf;
            this.Pis = Pis;
            this.Cofins = Cofins;
            this.Csll = Csll;
            this.IssRf = IssRf;
            this.Iss = Iss;
            this.AproxtribCity = AproxtribCity;
            this.AproxtribFed = AproxtribFed;
            this.Irpj = Irpj;
            this.Inss = Inss;
        }
        
        /// <summary>
        /// Gets or Sets PisRf
        /// </summary>
        [DataMember(Name="pisRf", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService PisRf { get; set; }
        /// <summary>
        /// Gets or Sets CofinsRf
        /// </summary>
        [DataMember(Name="cofinsRf", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService CofinsRf { get; set; }
        /// <summary>
        /// Gets or Sets CsllRf
        /// </summary>
        [DataMember(Name="csllRf", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService CsllRf { get; set; }
        /// <summary>
        /// Gets or Sets Irrf
        /// </summary>
        [DataMember(Name="irrf", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService Irrf { get; set; }
        /// <summary>
        /// Gets or Sets InssRf
        /// </summary>
        [DataMember(Name="inssRf", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService InssRf { get; set; }
        /// <summary>
        /// Gets or Sets Pis
        /// </summary>
        [DataMember(Name="pis", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService Pis { get; set; }
        /// <summary>
        /// Gets or Sets Cofins
        /// </summary>
        [DataMember(Name="cofins", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService Cofins { get; set; }
        /// <summary>
        /// Gets or Sets Csll
        /// </summary>
        [DataMember(Name="csll", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService Csll { get; set; }
        /// <summary>
        /// Gets or Sets IssRf
        /// </summary>
        [DataMember(Name="issRf", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService IssRf { get; set; }
        /// <summary>
        /// Gets or Sets Iss
        /// </summary>
        [DataMember(Name="iss", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService Iss { get; set; }
        /// <summary>
        /// Gets or Sets AproxtribCity
        /// </summary>
        [DataMember(Name="aproxtribCity", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService AproxtribCity { get; set; }
        /// <summary>
        /// Gets or Sets AproxtribFed
        /// </summary>
        [DataMember(Name="aproxtribFed", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService AproxtribFed { get; set; }
        /// <summary>
        /// Gets or Sets Irpj
        /// </summary>
        [DataMember(Name="irpj", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService Irpj { get; set; }
        /// <summary>
        /// Gets or Sets Inss
        /// </summary>
        [DataMember(Name="inss", EmitDefaultValue=false)]
        public TaxByTypeSummaryForService Inss { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SalesCalculatedTaxSummaryForServiceTaxByType {\n");
            sb.Append("  PisRf: ").Append(PisRf).Append("\n");
            sb.Append("  CofinsRf: ").Append(CofinsRf).Append("\n");
            sb.Append("  CsllRf: ").Append(CsllRf).Append("\n");
            sb.Append("  Irrf: ").Append(Irrf).Append("\n");
            sb.Append("  InssRf: ").Append(InssRf).Append("\n");
            sb.Append("  Pis: ").Append(Pis).Append("\n");
            sb.Append("  Cofins: ").Append(Cofins).Append("\n");
            sb.Append("  Csll: ").Append(Csll).Append("\n");
            sb.Append("  IssRf: ").Append(IssRf).Append("\n");
            sb.Append("  Iss: ").Append(Iss).Append("\n");
            sb.Append("  AproxtribCity: ").Append(AproxtribCity).Append("\n");
            sb.Append("  AproxtribFed: ").Append(AproxtribFed).Append("\n");
            sb.Append("  Irpj: ").Append(Irpj).Append("\n");
            sb.Append("  Inss: ").Append(Inss).Append("\n");
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
            return this.Equals(obj as SalesCalculatedTaxSummaryForServiceTaxByType);
        }

        /// <summary>
        /// Returns true if SalesCalculatedTaxSummaryForServiceTaxByType instances are equal
        /// </summary>
        /// <param name="other">Instance of SalesCalculatedTaxSummaryForServiceTaxByType to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SalesCalculatedTaxSummaryForServiceTaxByType other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.PisRf == other.PisRf ||
                    this.PisRf != null &&
                    this.PisRf.Equals(other.PisRf)
                ) && 
                (
                    this.CofinsRf == other.CofinsRf ||
                    this.CofinsRf != null &&
                    this.CofinsRf.Equals(other.CofinsRf)
                ) && 
                (
                    this.CsllRf == other.CsllRf ||
                    this.CsllRf != null &&
                    this.CsllRf.Equals(other.CsllRf)
                ) && 
                (
                    this.Irrf == other.Irrf ||
                    this.Irrf != null &&
                    this.Irrf.Equals(other.Irrf)
                ) && 
                (
                    this.InssRf == other.InssRf ||
                    this.InssRf != null &&
                    this.InssRf.Equals(other.InssRf)
                ) && 
                (
                    this.Pis == other.Pis ||
                    this.Pis != null &&
                    this.Pis.Equals(other.Pis)
                ) && 
                (
                    this.Cofins == other.Cofins ||
                    this.Cofins != null &&
                    this.Cofins.Equals(other.Cofins)
                ) && 
                (
                    this.Csll == other.Csll ||
                    this.Csll != null &&
                    this.Csll.Equals(other.Csll)
                ) && 
                (
                    this.IssRf == other.IssRf ||
                    this.IssRf != null &&
                    this.IssRf.Equals(other.IssRf)
                ) && 
                (
                    this.Iss == other.Iss ||
                    this.Iss != null &&
                    this.Iss.Equals(other.Iss)
                ) && 
                (
                    this.AproxtribCity == other.AproxtribCity ||
                    this.AproxtribCity != null &&
                    this.AproxtribCity.Equals(other.AproxtribCity)
                ) && 
                (
                    this.AproxtribFed == other.AproxtribFed ||
                    this.AproxtribFed != null &&
                    this.AproxtribFed.Equals(other.AproxtribFed)
                ) && 
                (
                    this.Irpj == other.Irpj ||
                    this.Irpj != null &&
                    this.Irpj.Equals(other.Irpj)
                ) && 
                (
                    this.Inss == other.Inss ||
                    this.Inss != null &&
                    this.Inss.Equals(other.Inss)
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
                if (this.PisRf != null)
                    hash = hash * 59 + this.PisRf.GetHashCode();
                if (this.CofinsRf != null)
                    hash = hash * 59 + this.CofinsRf.GetHashCode();
                if (this.CsllRf != null)
                    hash = hash * 59 + this.CsllRf.GetHashCode();
                if (this.Irrf != null)
                    hash = hash * 59 + this.Irrf.GetHashCode();
                if (this.InssRf != null)
                    hash = hash * 59 + this.InssRf.GetHashCode();
                if (this.Pis != null)
                    hash = hash * 59 + this.Pis.GetHashCode();
                if (this.Cofins != null)
                    hash = hash * 59 + this.Cofins.GetHashCode();
                if (this.Csll != null)
                    hash = hash * 59 + this.Csll.GetHashCode();
                if (this.IssRf != null)
                    hash = hash * 59 + this.IssRf.GetHashCode();
                if (this.Iss != null)
                    hash = hash * 59 + this.Iss.GetHashCode();
                if (this.AproxtribCity != null)
                    hash = hash * 59 + this.AproxtribCity.GetHashCode();
                if (this.AproxtribFed != null)
                    hash = hash * 59 + this.AproxtribFed.GetHashCode();
                if (this.Irpj != null)
                    hash = hash * 59 + this.Irpj.GetHashCode();
                if (this.Inss != null)
                    hash = hash * 59 + this.Inss.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
