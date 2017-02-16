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
    /// LineForGoodsCalculatedTaxTaxByType
    /// </summary>
    [DataContract]
    public partial class LineForGoodsCalculatedTaxTaxByType :  IEquatable<LineForGoodsCalculatedTaxTaxByType>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="LineForGoodsCalculatedTaxTaxByType" /> class.
        /// </summary>
        /// <param name="Icms">Icms.</param>
        /// <param name="IcmsSt">IcmsSt.</param>
        /// <param name="IcmsStSd">IcmsStSd.</param>
        /// <param name="IcmsPartOwn">IcmsPartOwn.</param>
        /// <param name="IcmsPartDest">IcmsPartDest.</param>
        /// <param name="IcmsDifaFCP">IcmsDifaFCP.</param>
        /// <param name="IcmsDifaDest">IcmsDifaDest.</param>
        /// <param name="IcmsDifaRemet">IcmsDifaRemet.</param>
        /// <param name="IcmsRf">IcmsRf.</param>
        /// <param name="IcmsDeson">IcmsDeson.</param>
        /// <param name="IcmsCredsn">IcmsCredsn.</param>
        /// <param name="Pis">Pis.</param>
        /// <param name="PisSt">PisSt.</param>
        /// <param name="Cofins">Cofins.</param>
        /// <param name="CofinsSt">CofinsSt.</param>
        /// <param name="Ipi">Ipi.</param>
        /// <param name="IpiReturned">IpiReturned.</param>
        /// <param name="Ii">Ii.</param>
        /// <param name="Iof">Iof.</param>
        /// <param name="AproxtribState">AproxtribState.</param>
        /// <param name="AproxtribFed">AproxtribFed.</param>
        public LineForGoodsCalculatedTaxTaxByType(TaxByTypeTax Icms = default(TaxByTypeTax), TaxByTypeTax IcmsSt = default(TaxByTypeTax), TaxByTypeTax IcmsStSd = default(TaxByTypeTax), TaxByTypeTax IcmsPartOwn = default(TaxByTypeTax), TaxByTypeTax IcmsPartDest = default(TaxByTypeTax), TaxByTypeTax IcmsDifaFCP = default(TaxByTypeTax), TaxByTypeTax IcmsDifaDest = default(TaxByTypeTax), TaxByTypeTax IcmsDifaRemet = default(TaxByTypeTax), TaxByTypeTax IcmsRf = default(TaxByTypeTax), TaxByTypeTax IcmsDeson = default(TaxByTypeTax), TaxByTypeTax IcmsCredsn = default(TaxByTypeTax), TaxByTypeTax Pis = default(TaxByTypeTax), TaxByTypeTax PisSt = default(TaxByTypeTax), TaxByTypeTax Cofins = default(TaxByTypeTax), TaxByTypeTax CofinsSt = default(TaxByTypeTax), TaxByTypeTax Ipi = default(TaxByTypeTax), TaxByTypeTax IpiReturned = default(TaxByTypeTax), TaxByTypeTax Ii = default(TaxByTypeTax), TaxByTypeTax Iof = default(TaxByTypeTax), TaxByTypeTax AproxtribState = default(TaxByTypeTax), TaxByTypeTax AproxtribFed = default(TaxByTypeTax))
        {
            this.Icms = Icms;
            this.IcmsSt = IcmsSt;
            this.IcmsStSd = IcmsStSd;
            this.IcmsPartOwn = IcmsPartOwn;
            this.IcmsPartDest = IcmsPartDest;
            this.IcmsDifaFCP = IcmsDifaFCP;
            this.IcmsDifaDest = IcmsDifaDest;
            this.IcmsDifaRemet = IcmsDifaRemet;
            this.IcmsRf = IcmsRf;
            this.IcmsDeson = IcmsDeson;
            this.IcmsCredsn = IcmsCredsn;
            this.Pis = Pis;
            this.PisSt = PisSt;
            this.Cofins = Cofins;
            this.CofinsSt = CofinsSt;
            this.Ipi = Ipi;
            this.IpiReturned = IpiReturned;
            this.Ii = Ii;
            this.Iof = Iof;
            this.AproxtribState = AproxtribState;
            this.AproxtribFed = AproxtribFed;
        }
        
        /// <summary>
        /// Gets or Sets Icms
        /// </summary>
        [DataMember(Name="icms", EmitDefaultValue=false)]
        public TaxByTypeTax Icms { get; set; }
        /// <summary>
        /// Gets or Sets IcmsSt
        /// </summary>
        [DataMember(Name="icmsSt", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsSt { get; set; }
        /// <summary>
        /// Gets or Sets IcmsStSd
        /// </summary>
        [DataMember(Name="icmsStSd", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsStSd { get; set; }
        /// <summary>
        /// Gets or Sets IcmsPartOwn
        /// </summary>
        [DataMember(Name="icmsPartOwn", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsPartOwn { get; set; }
        /// <summary>
        /// Gets or Sets IcmsPartDest
        /// </summary>
        [DataMember(Name="icmsPartDest", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsPartDest { get; set; }
        /// <summary>
        /// Gets or Sets IcmsDifaFCP
        /// </summary>
        [DataMember(Name="icmsDifaFCP", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsDifaFCP { get; set; }
        /// <summary>
        /// Gets or Sets IcmsDifaDest
        /// </summary>
        [DataMember(Name="icmsDifaDest", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsDifaDest { get; set; }
        /// <summary>
        /// Gets or Sets IcmsDifaRemet
        /// </summary>
        [DataMember(Name="icmsDifaRemet", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsDifaRemet { get; set; }
        /// <summary>
        /// Gets or Sets IcmsRf
        /// </summary>
        [DataMember(Name="icmsRf", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsRf { get; set; }
        /// <summary>
        /// Gets or Sets IcmsDeson
        /// </summary>
        [DataMember(Name="icmsDeson", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsDeson { get; set; }
        /// <summary>
        /// Gets or Sets IcmsCredsn
        /// </summary>
        [DataMember(Name="icmsCredsn", EmitDefaultValue=false)]
        public TaxByTypeTax IcmsCredsn { get; set; }
        /// <summary>
        /// Gets or Sets Pis
        /// </summary>
        [DataMember(Name="pis", EmitDefaultValue=false)]
        public TaxByTypeTax Pis { get; set; }
        /// <summary>
        /// Gets or Sets PisSt
        /// </summary>
        [DataMember(Name="pisSt", EmitDefaultValue=false)]
        public TaxByTypeTax PisSt { get; set; }
        /// <summary>
        /// Gets or Sets Cofins
        /// </summary>
        [DataMember(Name="cofins", EmitDefaultValue=false)]
        public TaxByTypeTax Cofins { get; set; }
        /// <summary>
        /// Gets or Sets CofinsSt
        /// </summary>
        [DataMember(Name="cofinsSt", EmitDefaultValue=false)]
        public TaxByTypeTax CofinsSt { get; set; }
        /// <summary>
        /// Gets or Sets Ipi
        /// </summary>
        [DataMember(Name="ipi", EmitDefaultValue=false)]
        public TaxByTypeTax Ipi { get; set; }
        /// <summary>
        /// Gets or Sets IpiReturned
        /// </summary>
        [DataMember(Name="ipiReturned", EmitDefaultValue=false)]
        public TaxByTypeTax IpiReturned { get; set; }
        /// <summary>
        /// Gets or Sets Ii
        /// </summary>
        [DataMember(Name="ii", EmitDefaultValue=false)]
        public TaxByTypeTax Ii { get; set; }
        /// <summary>
        /// Gets or Sets Iof
        /// </summary>
        [DataMember(Name="iof", EmitDefaultValue=false)]
        public TaxByTypeTax Iof { get; set; }
        /// <summary>
        /// Gets or Sets AproxtribState
        /// </summary>
        [DataMember(Name="aproxtribState", EmitDefaultValue=false)]
        public TaxByTypeTax AproxtribState { get; set; }
        /// <summary>
        /// Gets or Sets AproxtribFed
        /// </summary>
        [DataMember(Name="aproxtribFed", EmitDefaultValue=false)]
        public TaxByTypeTax AproxtribFed { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LineForGoodsCalculatedTaxTaxByType {\n");
            sb.Append("  Icms: ").Append(Icms).Append("\n");
            sb.Append("  IcmsSt: ").Append(IcmsSt).Append("\n");
            sb.Append("  IcmsStSd: ").Append(IcmsStSd).Append("\n");
            sb.Append("  IcmsPartOwn: ").Append(IcmsPartOwn).Append("\n");
            sb.Append("  IcmsPartDest: ").Append(IcmsPartDest).Append("\n");
            sb.Append("  IcmsDifaFCP: ").Append(IcmsDifaFCP).Append("\n");
            sb.Append("  IcmsDifaDest: ").Append(IcmsDifaDest).Append("\n");
            sb.Append("  IcmsDifaRemet: ").Append(IcmsDifaRemet).Append("\n");
            sb.Append("  IcmsRf: ").Append(IcmsRf).Append("\n");
            sb.Append("  IcmsDeson: ").Append(IcmsDeson).Append("\n");
            sb.Append("  IcmsCredsn: ").Append(IcmsCredsn).Append("\n");
            sb.Append("  Pis: ").Append(Pis).Append("\n");
            sb.Append("  PisSt: ").Append(PisSt).Append("\n");
            sb.Append("  Cofins: ").Append(Cofins).Append("\n");
            sb.Append("  CofinsSt: ").Append(CofinsSt).Append("\n");
            sb.Append("  Ipi: ").Append(Ipi).Append("\n");
            sb.Append("  IpiReturned: ").Append(IpiReturned).Append("\n");
            sb.Append("  Ii: ").Append(Ii).Append("\n");
            sb.Append("  Iof: ").Append(Iof).Append("\n");
            sb.Append("  AproxtribState: ").Append(AproxtribState).Append("\n");
            sb.Append("  AproxtribFed: ").Append(AproxtribFed).Append("\n");
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
            return this.Equals(obj as LineForGoodsCalculatedTaxTaxByType);
        }

        /// <summary>
        /// Returns true if LineForGoodsCalculatedTaxTaxByType instances are equal
        /// </summary>
        /// <param name="other">Instance of LineForGoodsCalculatedTaxTaxByType to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LineForGoodsCalculatedTaxTaxByType other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Icms == other.Icms ||
                    this.Icms != null &&
                    this.Icms.Equals(other.Icms)
                ) && 
                (
                    this.IcmsSt == other.IcmsSt ||
                    this.IcmsSt != null &&
                    this.IcmsSt.Equals(other.IcmsSt)
                ) && 
                (
                    this.IcmsStSd == other.IcmsStSd ||
                    this.IcmsStSd != null &&
                    this.IcmsStSd.Equals(other.IcmsStSd)
                ) && 
                (
                    this.IcmsPartOwn == other.IcmsPartOwn ||
                    this.IcmsPartOwn != null &&
                    this.IcmsPartOwn.Equals(other.IcmsPartOwn)
                ) && 
                (
                    this.IcmsPartDest == other.IcmsPartDest ||
                    this.IcmsPartDest != null &&
                    this.IcmsPartDest.Equals(other.IcmsPartDest)
                ) && 
                (
                    this.IcmsDifaFCP == other.IcmsDifaFCP ||
                    this.IcmsDifaFCP != null &&
                    this.IcmsDifaFCP.Equals(other.IcmsDifaFCP)
                ) && 
                (
                    this.IcmsDifaDest == other.IcmsDifaDest ||
                    this.IcmsDifaDest != null &&
                    this.IcmsDifaDest.Equals(other.IcmsDifaDest)
                ) && 
                (
                    this.IcmsDifaRemet == other.IcmsDifaRemet ||
                    this.IcmsDifaRemet != null &&
                    this.IcmsDifaRemet.Equals(other.IcmsDifaRemet)
                ) && 
                (
                    this.IcmsRf == other.IcmsRf ||
                    this.IcmsRf != null &&
                    this.IcmsRf.Equals(other.IcmsRf)
                ) && 
                (
                    this.IcmsDeson == other.IcmsDeson ||
                    this.IcmsDeson != null &&
                    this.IcmsDeson.Equals(other.IcmsDeson)
                ) && 
                (
                    this.IcmsCredsn == other.IcmsCredsn ||
                    this.IcmsCredsn != null &&
                    this.IcmsCredsn.Equals(other.IcmsCredsn)
                ) && 
                (
                    this.Pis == other.Pis ||
                    this.Pis != null &&
                    this.Pis.Equals(other.Pis)
                ) && 
                (
                    this.PisSt == other.PisSt ||
                    this.PisSt != null &&
                    this.PisSt.Equals(other.PisSt)
                ) && 
                (
                    this.Cofins == other.Cofins ||
                    this.Cofins != null &&
                    this.Cofins.Equals(other.Cofins)
                ) && 
                (
                    this.CofinsSt == other.CofinsSt ||
                    this.CofinsSt != null &&
                    this.CofinsSt.Equals(other.CofinsSt)
                ) && 
                (
                    this.Ipi == other.Ipi ||
                    this.Ipi != null &&
                    this.Ipi.Equals(other.Ipi)
                ) && 
                (
                    this.IpiReturned == other.IpiReturned ||
                    this.IpiReturned != null &&
                    this.IpiReturned.Equals(other.IpiReturned)
                ) && 
                (
                    this.Ii == other.Ii ||
                    this.Ii != null &&
                    this.Ii.Equals(other.Ii)
                ) && 
                (
                    this.Iof == other.Iof ||
                    this.Iof != null &&
                    this.Iof.Equals(other.Iof)
                ) && 
                (
                    this.AproxtribState == other.AproxtribState ||
                    this.AproxtribState != null &&
                    this.AproxtribState.Equals(other.AproxtribState)
                ) && 
                (
                    this.AproxtribFed == other.AproxtribFed ||
                    this.AproxtribFed != null &&
                    this.AproxtribFed.Equals(other.AproxtribFed)
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
                if (this.Icms != null)
                    hash = hash * 59 + this.Icms.GetHashCode();
                if (this.IcmsSt != null)
                    hash = hash * 59 + this.IcmsSt.GetHashCode();
                if (this.IcmsStSd != null)
                    hash = hash * 59 + this.IcmsStSd.GetHashCode();
                if (this.IcmsPartOwn != null)
                    hash = hash * 59 + this.IcmsPartOwn.GetHashCode();
                if (this.IcmsPartDest != null)
                    hash = hash * 59 + this.IcmsPartDest.GetHashCode();
                if (this.IcmsDifaFCP != null)
                    hash = hash * 59 + this.IcmsDifaFCP.GetHashCode();
                if (this.IcmsDifaDest != null)
                    hash = hash * 59 + this.IcmsDifaDest.GetHashCode();
                if (this.IcmsDifaRemet != null)
                    hash = hash * 59 + this.IcmsDifaRemet.GetHashCode();
                if (this.IcmsRf != null)
                    hash = hash * 59 + this.IcmsRf.GetHashCode();
                if (this.IcmsDeson != null)
                    hash = hash * 59 + this.IcmsDeson.GetHashCode();
                if (this.IcmsCredsn != null)
                    hash = hash * 59 + this.IcmsCredsn.GetHashCode();
                if (this.Pis != null)
                    hash = hash * 59 + this.Pis.GetHashCode();
                if (this.PisSt != null)
                    hash = hash * 59 + this.PisSt.GetHashCode();
                if (this.Cofins != null)
                    hash = hash * 59 + this.Cofins.GetHashCode();
                if (this.CofinsSt != null)
                    hash = hash * 59 + this.CofinsSt.GetHashCode();
                if (this.Ipi != null)
                    hash = hash * 59 + this.Ipi.GetHashCode();
                if (this.IpiReturned != null)
                    hash = hash * 59 + this.IpiReturned.GetHashCode();
                if (this.Ii != null)
                    hash = hash * 59 + this.Ii.GetHashCode();
                if (this.Iof != null)
                    hash = hash * 59 + this.Iof.GetHashCode();
                if (this.AproxtribState != null)
                    hash = hash * 59 + this.AproxtribState.GetHashCode();
                if (this.AproxtribFed != null)
                    hash = hash * 59 + this.AproxtribFed.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}
