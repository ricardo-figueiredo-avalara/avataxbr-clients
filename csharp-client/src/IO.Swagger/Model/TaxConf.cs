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
    /// TaxConf
    /// </summary>
    [DataContract]
    public partial class TaxConf :  IEquatable<TaxConf>, IValidatableObject
    {
        /// <summary>
        /// Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
        /// </summary>
        /// <value>Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CstIPIEnum
        {
            
            /// <summary>
            /// Enum T for "T"
            /// </summary>
            [EnumMember(Value = "T")]
            T,
            
            /// <summary>
            /// Enum Z for "Z"
            /// </summary>
            [EnumMember(Value = "Z")]
            Z,
            
            /// <summary>
            /// Enum E for "E"
            /// </summary>
            [EnumMember(Value = "E")]
            E,
            
            /// <summary>
            /// Enum H for "H"
            /// </summary>
            [EnumMember(Value = "H")]
            H,
            
            /// <summary>
            /// Enum N for "N"
            /// </summary>
            [EnumMember(Value = "N")]
            N,
            
            /// <summary>
            /// Enum I for "I"
            /// </summary>
            [EnumMember(Value = "I")]
            I,
            
            /// <summary>
            /// Enum O for "O"
            /// </summary>
            [EnumMember(Value = "O")]
            O,
            
            /// <summary>
            /// Enum OZ for "OZ"
            /// </summary>
            [EnumMember(Value = "OZ")]
            OZ
        }

        /// <summary>
        /// Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
        /// </summary>
        /// <value>Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AccruablePISTaxationEnum
        {
            
            /// <summary>
            /// Enum T for "T"
            /// </summary>
            [EnumMember(Value = "T")]
            T,
            
            /// <summary>
            /// Enum Z for "Z"
            /// </summary>
            [EnumMember(Value = "Z")]
            Z,
            
            /// <summary>
            /// Enum E for "E"
            /// </summary>
            [EnumMember(Value = "E")]
            E,
            
            /// <summary>
            /// Enum H for "H"
            /// </summary>
            [EnumMember(Value = "H")]
            H,
            
            /// <summary>
            /// Enum N for "N"
            /// </summary>
            [EnumMember(Value = "N")]
            N,
            
            /// <summary>
            /// Enum O for "O"
            /// </summary>
            [EnumMember(Value = "O")]
            O,
            
            /// <summary>
            /// Enum OZ for "OZ"
            /// </summary>
            [EnumMember(Value = "OZ")]
            OZ
        }

        /// <summary>
        /// Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
        /// </summary>
        /// <value>Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AccruableCOFINSTaxationEnum
        {
            
            /// <summary>
            /// Enum T for "T"
            /// </summary>
            [EnumMember(Value = "T")]
            T,
            
            /// <summary>
            /// Enum Z for "Z"
            /// </summary>
            [EnumMember(Value = "Z")]
            Z,
            
            /// <summary>
            /// Enum E for "E"
            /// </summary>
            [EnumMember(Value = "E")]
            E,
            
            /// <summary>
            /// Enum H for "H"
            /// </summary>
            [EnumMember(Value = "H")]
            H,
            
            /// <summary>
            /// Enum N for "N"
            /// </summary>
            [EnumMember(Value = "N")]
            N,
            
            /// <summary>
            /// Enum O for "O"
            /// </summary>
            [EnumMember(Value = "O")]
            O,
            
            /// <summary>
            /// Enum OZ for "OZ"
            /// </summary>
            [EnumMember(Value = "OZ")]
            OZ
        }

        /// <summary>
        /// Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
        /// </summary>
        /// <value>Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES </value>
        [DataMember(Name="cstIPI", EmitDefaultValue=false)]
        public CstIPIEnum? CstIPI { get; set; }
        /// <summary>
        /// Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
        /// </summary>
        /// <value>Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES </value>
        [DataMember(Name="accruablePISTaxation", EmitDefaultValue=false)]
        public AccruablePISTaxationEnum? AccruablePISTaxation { get; set; }
        /// <summary>
        /// Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
        /// </summary>
        /// <value>Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES </value>
        [DataMember(Name="accruableCOFINSTaxation", EmitDefaultValue=false)]
        public AccruableCOFINSTaxationEnum? AccruableCOFINSTaxation { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TaxConf() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TaxConf" /> class.
        /// </summary>
        /// <param name="Code">main unique identificator (required).</param>
        /// <param name="StockImpact">Inform that the process has inventory impact..</param>
        /// <param name="FinancialImpact">Inform that the process has financial impact..</param>
        /// <param name="CstIPI">Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES .</param>
        /// <param name="IpiLegalTaxClass">Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D; .</param>
        /// <param name="AccruablePISTaxation">Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE - &#39;O&#39; # OTHER - &#39;OZ&#39;# OTHER AND ZERO VALUES .</param>
        /// <param name="PisExemptLegalReasonCode">When exempt, taxable with zero, suspended, not taxable, this field holds the official code number.</param>
        /// <param name="PisExemptLegalReason">When specifi reason, this field has the description.</param>
        /// <param name="AccruableCOFINSTaxation">Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES .</param>
        /// <param name="CofinsExemptLegalReasonCode">When exempt, taxable with zero, suspended, not taxable, this field holds the official code number.</param>
        /// <param name="CofinsExemptLegalReason">When specifi reason, this field has the description.</param>
        /// <param name="AllowIPIcreditWhenInGoing">Inform that the process allow IPI credit to Input process.</param>
        /// <param name="IcmsConf">the map key is state code.</param>
        public TaxConf(string Code = default(string), bool? StockImpact = default(bool?), bool? FinancialImpact = default(bool?), CstIPIEnum? CstIPI = default(CstIPIEnum?), string IpiLegalTaxClass = default(string), AccruablePISTaxationEnum? AccruablePISTaxation = default(AccruablePISTaxationEnum?), string PisExemptLegalReasonCode = default(string), string PisExemptLegalReason = default(string), AccruableCOFINSTaxationEnum? AccruableCOFINSTaxation = default(AccruableCOFINSTaxationEnum?), string CofinsExemptLegalReasonCode = default(string), string CofinsExemptLegalReason = default(string), bool? AllowIPIcreditWhenInGoing = default(bool?), List<IcmsTaxConf> IcmsConf = default(List<IcmsTaxConf>))
        {
            // to ensure "Code" is required (not null)
            if (Code == null)
            {
                throw new InvalidDataException("Code is a required property for TaxConf and cannot be null");
            }
            else
            {
                this.Code = Code;
            }
            this.StockImpact = StockImpact;
            this.FinancialImpact = FinancialImpact;
            this.CstIPI = CstIPI;
            this.IpiLegalTaxClass = IpiLegalTaxClass;
            this.AccruablePISTaxation = AccruablePISTaxation;
            this.PisExemptLegalReasonCode = PisExemptLegalReasonCode;
            this.PisExemptLegalReason = PisExemptLegalReason;
            this.AccruableCOFINSTaxation = AccruableCOFINSTaxation;
            this.CofinsExemptLegalReasonCode = CofinsExemptLegalReasonCode;
            this.CofinsExemptLegalReason = CofinsExemptLegalReason;
            this.AllowIPIcreditWhenInGoing = AllowIPIcreditWhenInGoing;
            this.IcmsConf = IcmsConf;
        }
        
        /// <summary>
        /// main unique identificator
        /// </summary>
        /// <value>main unique identificator</value>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }
        /// <summary>
        /// Inform that the process has inventory impact.
        /// </summary>
        /// <value>Inform that the process has inventory impact.</value>
        [DataMember(Name="stockImpact", EmitDefaultValue=false)]
        public bool? StockImpact { get; set; }
        /// <summary>
        /// Inform that the process has financial impact.
        /// </summary>
        /// <value>Inform that the process has financial impact.</value>
        [DataMember(Name="financialImpact", EmitDefaultValue=false)]
        public bool? FinancialImpact { get; set; }
        /// <summary>
        /// Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D; 
        /// </summary>
        /// <value>Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D; </value>
        [DataMember(Name="ipiLegalTaxClass", EmitDefaultValue=false)]
        public string IpiLegalTaxClass { get; set; }
        /// <summary>
        /// When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
        /// </summary>
        /// <value>When exempt, taxable with zero, suspended, not taxable, this field holds the official code number</value>
        [DataMember(Name="pisExemptLegalReasonCode", EmitDefaultValue=false)]
        public string PisExemptLegalReasonCode { get; set; }
        /// <summary>
        /// When specifi reason, this field has the description
        /// </summary>
        /// <value>When specifi reason, this field has the description</value>
        [DataMember(Name="pisExemptLegalReason", EmitDefaultValue=false)]
        public string PisExemptLegalReason { get; set; }
        /// <summary>
        /// When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
        /// </summary>
        /// <value>When exempt, taxable with zero, suspended, not taxable, this field holds the official code number</value>
        [DataMember(Name="cofinsExemptLegalReasonCode", EmitDefaultValue=false)]
        public string CofinsExemptLegalReasonCode { get; set; }
        /// <summary>
        /// When specifi reason, this field has the description
        /// </summary>
        /// <value>When specifi reason, this field has the description</value>
        [DataMember(Name="cofinsExemptLegalReason", EmitDefaultValue=false)]
        public string CofinsExemptLegalReason { get; set; }
        /// <summary>
        /// Inform that the process allow IPI credit to Input process
        /// </summary>
        /// <value>Inform that the process allow IPI credit to Input process</value>
        [DataMember(Name="allowIPIcreditWhenInGoing", EmitDefaultValue=false)]
        public bool? AllowIPIcreditWhenInGoing { get; set; }
        /// <summary>
        /// the map key is state code
        /// </summary>
        /// <value>the map key is state code</value>
        [DataMember(Name="icmsConf", EmitDefaultValue=false)]
        public List<IcmsTaxConf> IcmsConf { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TaxConf {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  StockImpact: ").Append(StockImpact).Append("\n");
            sb.Append("  FinancialImpact: ").Append(FinancialImpact).Append("\n");
            sb.Append("  CstIPI: ").Append(CstIPI).Append("\n");
            sb.Append("  IpiLegalTaxClass: ").Append(IpiLegalTaxClass).Append("\n");
            sb.Append("  AccruablePISTaxation: ").Append(AccruablePISTaxation).Append("\n");
            sb.Append("  PisExemptLegalReasonCode: ").Append(PisExemptLegalReasonCode).Append("\n");
            sb.Append("  PisExemptLegalReason: ").Append(PisExemptLegalReason).Append("\n");
            sb.Append("  AccruableCOFINSTaxation: ").Append(AccruableCOFINSTaxation).Append("\n");
            sb.Append("  CofinsExemptLegalReasonCode: ").Append(CofinsExemptLegalReasonCode).Append("\n");
            sb.Append("  CofinsExemptLegalReason: ").Append(CofinsExemptLegalReason).Append("\n");
            sb.Append("  AllowIPIcreditWhenInGoing: ").Append(AllowIPIcreditWhenInGoing).Append("\n");
            sb.Append("  IcmsConf: ").Append(IcmsConf).Append("\n");
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
            return this.Equals(obj as TaxConf);
        }

        /// <summary>
        /// Returns true if TaxConf instances are equal
        /// </summary>
        /// <param name="other">Instance of TaxConf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TaxConf other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.Code == other.Code ||
                    this.Code != null &&
                    this.Code.Equals(other.Code)
                ) && 
                (
                    this.StockImpact == other.StockImpact ||
                    this.StockImpact != null &&
                    this.StockImpact.Equals(other.StockImpact)
                ) && 
                (
                    this.FinancialImpact == other.FinancialImpact ||
                    this.FinancialImpact != null &&
                    this.FinancialImpact.Equals(other.FinancialImpact)
                ) && 
                (
                    this.CstIPI == other.CstIPI ||
                    this.CstIPI != null &&
                    this.CstIPI.Equals(other.CstIPI)
                ) && 
                (
                    this.IpiLegalTaxClass == other.IpiLegalTaxClass ||
                    this.IpiLegalTaxClass != null &&
                    this.IpiLegalTaxClass.Equals(other.IpiLegalTaxClass)
                ) && 
                (
                    this.AccruablePISTaxation == other.AccruablePISTaxation ||
                    this.AccruablePISTaxation != null &&
                    this.AccruablePISTaxation.Equals(other.AccruablePISTaxation)
                ) && 
                (
                    this.PisExemptLegalReasonCode == other.PisExemptLegalReasonCode ||
                    this.PisExemptLegalReasonCode != null &&
                    this.PisExemptLegalReasonCode.Equals(other.PisExemptLegalReasonCode)
                ) && 
                (
                    this.PisExemptLegalReason == other.PisExemptLegalReason ||
                    this.PisExemptLegalReason != null &&
                    this.PisExemptLegalReason.Equals(other.PisExemptLegalReason)
                ) && 
                (
                    this.AccruableCOFINSTaxation == other.AccruableCOFINSTaxation ||
                    this.AccruableCOFINSTaxation != null &&
                    this.AccruableCOFINSTaxation.Equals(other.AccruableCOFINSTaxation)
                ) && 
                (
                    this.CofinsExemptLegalReasonCode == other.CofinsExemptLegalReasonCode ||
                    this.CofinsExemptLegalReasonCode != null &&
                    this.CofinsExemptLegalReasonCode.Equals(other.CofinsExemptLegalReasonCode)
                ) && 
                (
                    this.CofinsExemptLegalReason == other.CofinsExemptLegalReason ||
                    this.CofinsExemptLegalReason != null &&
                    this.CofinsExemptLegalReason.Equals(other.CofinsExemptLegalReason)
                ) && 
                (
                    this.AllowIPIcreditWhenInGoing == other.AllowIPIcreditWhenInGoing ||
                    this.AllowIPIcreditWhenInGoing != null &&
                    this.AllowIPIcreditWhenInGoing.Equals(other.AllowIPIcreditWhenInGoing)
                ) && 
                (
                    this.IcmsConf == other.IcmsConf ||
                    this.IcmsConf != null &&
                    this.IcmsConf.SequenceEqual(other.IcmsConf)
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
                if (this.Code != null)
                    hash = hash * 59 + this.Code.GetHashCode();
                if (this.StockImpact != null)
                    hash = hash * 59 + this.StockImpact.GetHashCode();
                if (this.FinancialImpact != null)
                    hash = hash * 59 + this.FinancialImpact.GetHashCode();
                if (this.CstIPI != null)
                    hash = hash * 59 + this.CstIPI.GetHashCode();
                if (this.IpiLegalTaxClass != null)
                    hash = hash * 59 + this.IpiLegalTaxClass.GetHashCode();
                if (this.AccruablePISTaxation != null)
                    hash = hash * 59 + this.AccruablePISTaxation.GetHashCode();
                if (this.PisExemptLegalReasonCode != null)
                    hash = hash * 59 + this.PisExemptLegalReasonCode.GetHashCode();
                if (this.PisExemptLegalReason != null)
                    hash = hash * 59 + this.PisExemptLegalReason.GetHashCode();
                if (this.AccruableCOFINSTaxation != null)
                    hash = hash * 59 + this.AccruableCOFINSTaxation.GetHashCode();
                if (this.CofinsExemptLegalReasonCode != null)
                    hash = hash * 59 + this.CofinsExemptLegalReasonCode.GetHashCode();
                if (this.CofinsExemptLegalReason != null)
                    hash = hash * 59 + this.CofinsExemptLegalReason.GetHashCode();
                if (this.AllowIPIcreditWhenInGoing != null)
                    hash = hash * 59 + this.AllowIPIcreditWhenInGoing.GetHashCode();
                if (this.IcmsConf != null)
                    hash = hash * 59 + this.IcmsConf.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // Code (string) maxLength
            if(this.Code != null && this.Code.Length > 40)
            {
                yield return new ValidationResult("Invalid value for Code, length must be less than 40.", new [] { "Code" });
            }

            // PisExemptLegalReasonCode (string) maxLength
            if(this.PisExemptLegalReasonCode != null && this.PisExemptLegalReasonCode.Length > 3)
            {
                yield return new ValidationResult("Invalid value for PisExemptLegalReasonCode, length must be less than 3.", new [] { "PisExemptLegalReasonCode" });
            }

            // PisExemptLegalReason (string) maxLength
            if(this.PisExemptLegalReason != null && this.PisExemptLegalReason.Length > 1024)
            {
                yield return new ValidationResult("Invalid value for PisExemptLegalReason, length must be less than 1024.", new [] { "PisExemptLegalReason" });
            }

            // CofinsExemptLegalReasonCode (string) maxLength
            if(this.CofinsExemptLegalReasonCode != null && this.CofinsExemptLegalReasonCode.Length > 3)
            {
                yield return new ValidationResult("Invalid value for CofinsExemptLegalReasonCode, length must be less than 3.", new [] { "CofinsExemptLegalReasonCode" });
            }

            // CofinsExemptLegalReason (string) maxLength
            if(this.CofinsExemptLegalReason != null && this.CofinsExemptLegalReason.Length > 1024)
            {
                yield return new ValidationResult("Invalid value for CofinsExemptLegalReason, length must be less than 1024.", new [] { "CofinsExemptLegalReason" });
            }

            yield break;
        }
    }

}
