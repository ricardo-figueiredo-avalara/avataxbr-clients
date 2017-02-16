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
    /// Filter this message application to specified tax cases. - taxtype - jurisdictionType 
    /// </summary>
    [DataContract]
    public partial class LegalReasonTaxScope :  IEquatable<LegalReasonTaxScope>, IValidatableObject
    {
        /// <summary>
        /// This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 
        /// </summary>
        /// <value>This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TaxTypeEnum
        {
            
            /// <summary>
            /// Enum NONE for "NONE"
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE,
            
            /// <summary>
            /// Enum INSS for "INSS"
            /// </summary>
            [EnumMember(Value = "INSS")]
            INSS,
            
            /// <summary>
            /// Enum IRRF for "IRRF"
            /// </summary>
            [EnumMember(Value = "IRRF")]
            IRRF,
            
            /// <summary>
            /// Enum IRPJ for "IRPJ"
            /// </summary>
            [EnumMember(Value = "IRPJ")]
            IRPJ,
            
            /// <summary>
            /// Enum PIS for "PIS"
            /// </summary>
            [EnumMember(Value = "PIS")]
            PIS,
            
            /// <summary>
            /// Enum COFINS for "COFINS"
            /// </summary>
            [EnumMember(Value = "COFINS")]
            COFINS,
            
            /// <summary>
            /// Enum CSLL for "CSLL"
            /// </summary>
            [EnumMember(Value = "CSLL")]
            CSLL,
            
            /// <summary>
            /// Enum IPI for "IPI"
            /// </summary>
            [EnumMember(Value = "IPI")]
            IPI,
            
            /// <summary>
            /// Enum ICMS for "ICMS"
            /// </summary>
            [EnumMember(Value = "ICMS")]
            ICMS,
            
            /// <summary>
            /// Enum II for "II"
            /// </summary>
            [EnumMember(Value = "II")]
            II,
            
            /// <summary>
            /// Enum IOF for "IOF"
            /// </summary>
            [EnumMember(Value = "IOF")]
            IOF,
            
            /// <summary>
            /// Enum ISS for "ISS"
            /// </summary>
            [EnumMember(Value = "ISS")]
            ISS,
            
            /// <summary>
            /// Enum APROXTOTALTAX for "APROXTOTALTAX"
            /// </summary>
            [EnumMember(Value = "APROXTOTALTAX")]
            APROXTOTALTAX
        }

        /// <summary>
        /// These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 
        /// </summary>
        /// <value>These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SpecializedTaxTypeEnum
        {
            
            /// <summary>
            /// Enum Icms for "icms"
            /// </summary>
            [EnumMember(Value = "icms")]
            Icms,
            
            /// <summary>
            /// Enum IcmsSt for "icmsSt"
            /// </summary>
            [EnumMember(Value = "icmsSt")]
            IcmsSt,
            
            /// <summary>
            /// Enum IcmsStSd for "icmsStSd"
            /// </summary>
            [EnumMember(Value = "icmsStSd")]
            IcmsStSd,
            
            /// <summary>
            /// Enum IcmsPartOwn for "icmsPartOwn"
            /// </summary>
            [EnumMember(Value = "icmsPartOwn")]
            IcmsPartOwn,
            
            /// <summary>
            /// Enum IcmsPartDest for "icmsPartDest"
            /// </summary>
            [EnumMember(Value = "icmsPartDest")]
            IcmsPartDest,
            
            /// <summary>
            /// Enum IcmsDifaFCP for "icmsDifaFCP"
            /// </summary>
            [EnumMember(Value = "icmsDifaFCP")]
            IcmsDifaFCP,
            
            /// <summary>
            /// Enum IcmsDifaDest for "icmsDifaDest"
            /// </summary>
            [EnumMember(Value = "icmsDifaDest")]
            IcmsDifaDest,
            
            /// <summary>
            /// Enum IcmsDifaRemet for "icmsDifaRemet"
            /// </summary>
            [EnumMember(Value = "icmsDifaRemet")]
            IcmsDifaRemet,
            
            /// <summary>
            /// Enum IcmsRf for "icmsRf"
            /// </summary>
            [EnumMember(Value = "icmsRf")]
            IcmsRf,
            
            /// <summary>
            /// Enum IcmsDeson for "icmsDeson"
            /// </summary>
            [EnumMember(Value = "icmsDeson")]
            IcmsDeson,
            
            /// <summary>
            /// Enum IcmsCredsn for "icmsCredsn"
            /// </summary>
            [EnumMember(Value = "icmsCredsn")]
            IcmsCredsn,
            
            /// <summary>
            /// Enum Pis for "pis"
            /// </summary>
            [EnumMember(Value = "pis")]
            Pis,
            
            /// <summary>
            /// Enum PisSt for "pisSt"
            /// </summary>
            [EnumMember(Value = "pisSt")]
            PisSt,
            
            /// <summary>
            /// Enum Cofins for "cofins"
            /// </summary>
            [EnumMember(Value = "cofins")]
            Cofins,
            
            /// <summary>
            /// Enum CofinsSt for "cofinsSt"
            /// </summary>
            [EnumMember(Value = "cofinsSt")]
            CofinsSt,
            
            /// <summary>
            /// Enum Ipi for "ipi"
            /// </summary>
            [EnumMember(Value = "ipi")]
            Ipi,
            
            /// <summary>
            /// Enum IpiReturned for "ipiReturned"
            /// </summary>
            [EnumMember(Value = "ipiReturned")]
            IpiReturned,
            
            /// <summary>
            /// Enum Ii for "ii"
            /// </summary>
            [EnumMember(Value = "ii")]
            Ii,
            
            /// <summary>
            /// Enum Iof for "iof"
            /// </summary>
            [EnumMember(Value = "iof")]
            Iof
        }

        /// <summary>
        /// Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 
        /// </summary>
        /// <value>Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum JurisdictionTypeEnum
        {
            
            /// <summary>
            /// Enum NONE for "NONE"
            /// </summary>
            [EnumMember(Value = "NONE")]
            NONE,
            
            /// <summary>
            /// Enum City for "City"
            /// </summary>
            [EnumMember(Value = "City")]
            City,
            
            /// <summary>
            /// Enum State for "State"
            /// </summary>
            [EnumMember(Value = "State")]
            State,
            
            /// <summary>
            /// Enum Country for "Country"
            /// </summary>
            [EnumMember(Value = "Country")]
            Country
        }

        /// <summary>
        /// This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 
        /// </summary>
        /// <value>This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' </value>
        [DataMember(Name="taxType", EmitDefaultValue=false)]
        public TaxTypeEnum? TaxType { get; set; }
        /// <summary>
        /// These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 
        /// </summary>
        /// <value>These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' </value>
        [DataMember(Name="specializedTaxType", EmitDefaultValue=false)]
        public SpecializedTaxTypeEnum? SpecializedTaxType { get; set; }
        /// <summary>
        /// Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 
        /// </summary>
        /// <value>Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' </value>
        [DataMember(Name="jurisdictionType", EmitDefaultValue=false)]
        public JurisdictionTypeEnum? JurisdictionType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="LegalReasonTaxScope" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected LegalReasonTaxScope() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="LegalReasonTaxScope" /> class.
        /// </summary>
        /// <param name="TaxType">This is the Tax Type to apply legal messages. - &#39;NONE&#39; - &#39;INSS&#39; - &#39;IRRF&#39; - &#39;IRPJ&#39; - &#39;PIS&#39; - &#39;COFINS&#39; - &#39;CSLL&#39; - &#39;IPI&#39; - &#39;ICMS&#39; - &#39;II&#39; - &#39;IOF&#39; - &#39;ISS&#39; - &#39;APROXTOTALTAX&#39;  (required).</param>
        /// <param name="SpecializedTaxType">These are the specific tax types to which a message may be applied - &#39;icms&#39; - &#39;icmsSt&#39; - &#39;icmsStSd&#39; - &#39;icmsPartOwn&#39; - &#39;icmsPartDest&#39; - &#39;icmsDifaFCP&#39; - &#39;icmsDifaDest&#39; - &#39;icmsDifaRemet&#39; - &#39;icmsRf&#39; - &#39;icmsDeson&#39; - &#39;icmsCredsn&#39; - &#39;pis&#39; - &#39;pisSt&#39; - &#39;cofins&#39; - &#39;cofinsSt&#39; - &#39;ipi&#39; - &#39;ipiReturned&#39; - &#39;ii&#39; - &#39;iof&#39; .</param>
        /// <param name="JurisdictionType">Types of jurisdiction - &#39;NONE&#39; - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  (required).</param>
        /// <param name="JurisdictionIbgeCode">Code to identify the Jurisdiction.</param>
        public LegalReasonTaxScope(TaxTypeEnum? TaxType = default(TaxTypeEnum?), SpecializedTaxTypeEnum? SpecializedTaxType = default(SpecializedTaxTypeEnum?), JurisdictionTypeEnum? JurisdictionType = default(JurisdictionTypeEnum?), string JurisdictionIbgeCode = default(string))
        {
            // to ensure "TaxType" is required (not null)
            if (TaxType == null)
            {
                throw new InvalidDataException("TaxType is a required property for LegalReasonTaxScope and cannot be null");
            }
            else
            {
                this.TaxType = TaxType;
            }
            // to ensure "JurisdictionType" is required (not null)
            if (JurisdictionType == null)
            {
                throw new InvalidDataException("JurisdictionType is a required property for LegalReasonTaxScope and cannot be null");
            }
            else
            {
                this.JurisdictionType = JurisdictionType;
            }
            this.SpecializedTaxType = SpecializedTaxType;
            this.JurisdictionIbgeCode = JurisdictionIbgeCode;
        }
        
        /// <summary>
        /// Code to identify the Jurisdiction
        /// </summary>
        /// <value>Code to identify the Jurisdiction</value>
        [DataMember(Name="jurisdictionIbgeCode", EmitDefaultValue=false)]
        public string JurisdictionIbgeCode { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class LegalReasonTaxScope {\n");
            sb.Append("  TaxType: ").Append(TaxType).Append("\n");
            sb.Append("  SpecializedTaxType: ").Append(SpecializedTaxType).Append("\n");
            sb.Append("  JurisdictionType: ").Append(JurisdictionType).Append("\n");
            sb.Append("  JurisdictionIbgeCode: ").Append(JurisdictionIbgeCode).Append("\n");
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
            return this.Equals(obj as LegalReasonTaxScope);
        }

        /// <summary>
        /// Returns true if LegalReasonTaxScope instances are equal
        /// </summary>
        /// <param name="other">Instance of LegalReasonTaxScope to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(LegalReasonTaxScope other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.TaxType == other.TaxType ||
                    this.TaxType != null &&
                    this.TaxType.Equals(other.TaxType)
                ) && 
                (
                    this.SpecializedTaxType == other.SpecializedTaxType ||
                    this.SpecializedTaxType != null &&
                    this.SpecializedTaxType.Equals(other.SpecializedTaxType)
                ) && 
                (
                    this.JurisdictionType == other.JurisdictionType ||
                    this.JurisdictionType != null &&
                    this.JurisdictionType.Equals(other.JurisdictionType)
                ) && 
                (
                    this.JurisdictionIbgeCode == other.JurisdictionIbgeCode ||
                    this.JurisdictionIbgeCode != null &&
                    this.JurisdictionIbgeCode.Equals(other.JurisdictionIbgeCode)
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
                if (this.TaxType != null)
                    hash = hash * 59 + this.TaxType.GetHashCode();
                if (this.SpecializedTaxType != null)
                    hash = hash * 59 + this.SpecializedTaxType.GetHashCode();
                if (this.JurisdictionType != null)
                    hash = hash * 59 + this.JurisdictionType.GetHashCode();
                if (this.JurisdictionIbgeCode != null)
                    hash = hash * 59 + this.JurisdictionIbgeCode.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            yield break;
        }
    }

}