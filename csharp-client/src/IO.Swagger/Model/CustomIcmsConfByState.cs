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
    /// CustomIcmsConfByState
    /// </summary>
    [DataContract]
    public partial class CustomIcmsConfByState :  IEquatable<CustomIcmsConfByState>, IValidatableObject
    {
        /// <summary>
        /// On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
        /// </summary>
        /// <value>On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum IcmsCSTEnum
        {
            
            /// <summary>
            /// Enum _00 for "00"
            /// </summary>
            [EnumMember(Value = "00")]
            _00,
            
            /// <summary>
            /// Enum _20 for "20"
            /// </summary>
            [EnumMember(Value = "20")]
            _20,
            
            /// <summary>
            /// Enum _40 for "40"
            /// </summary>
            [EnumMember(Value = "40")]
            _40,
            
            /// <summary>
            /// Enum _41 for "41"
            /// </summary>
            [EnumMember(Value = "41")]
            _41,
            
            /// <summary>
            /// Enum _50 for "50"
            /// </summary>
            [EnumMember(Value = "50")]
            _50
        }

        /// <summary>
        /// how this ICMS will be calculed for itens linked to this configuration
        /// </summary>
        /// <value>how this ICMS will be calculed for itens linked to this configuration</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CalcModeEnum
        {
            
            /// <summary>
            /// Enum BYMVARATE for "BYMVARATE"
            /// </summary>
            [EnumMember(Value = "BYMVARATE")]
            BYMVARATE,
            
            /// <summary>
            /// Enum SRP for "SRP"
            /// </summary>
            [EnumMember(Value = "SRP")]
            SRP,
            
            /// <summary>
            /// Enum MMSRP for "MMSRP"
            /// </summary>
            [EnumMember(Value = "MMSRP")]
            MMSRP,
            
            /// <summary>
            /// Enum OPERATIONAMOUNT for "OPERATIONAMOUNT"
            /// </summary>
            [EnumMember(Value = "OPERATIONAMOUNT")]
            OPERATIONAMOUNT
        }

        /// <summary>
        /// On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
        /// </summary>
        /// <value>On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED </value>
        [DataMember(Name="icmsCST", EmitDefaultValue=false)]
        public IcmsCSTEnum? IcmsCST { get; set; }
        /// <summary>
        /// how this ICMS will be calculed for itens linked to this configuration
        /// </summary>
        /// <value>how this ICMS will be calculed for itens linked to this configuration</value>
        [DataMember(Name="calcMode", EmitDefaultValue=false)]
        public CalcModeEnum? CalcMode { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomIcmsConfByState" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CustomIcmsConfByState() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomIcmsConfByState" /> class.
        /// </summary>
        /// <param name="Code">Identify the IcmsConfState in namespace (required).</param>
        /// <param name="State">State (required).</param>
        /// <param name="Name">name for this configuration.</param>
        /// <param name="StartDate">date when this configuration values starts.</param>
        /// <param name="ExpirationDate">date when this configuration values expire.</param>
        /// <param name="Inactive">set this configuration to Inactive.</param>
        /// <param name="SubjectToST">inform that the item linked to this configuration is subject to ICMS ST on this state.</param>
        /// <param name="IcmsCST">On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED .</param>
        /// <param name="CalcMode">how this ICMS will be calculed for itens linked to this configuration.</param>
        /// <param name="DiscountRateForMonoPhase">discount if the item is subject to monophase PIS/COFINS for transactions inside state.</param>
        /// <param name="Rate">ICMS rate.</param>
        /// <param name="IcmsBaseDiscount">ICMS rate.</param>
        /// <param name="Msrp">SRP or MMSRP amount base for this icms configuration.</param>
        /// <param name="MvaRate">ICMS mva rate to define calc base.</param>
        /// <param name="MsrpUnit">unit used to SRP amount value.</param>
        /// <param name="IcmsLegalReason">Code for the ICM legal reason, this message will be placed on invoice..</param>
        /// <param name="FcpRate">Fundo de Combate à pobreza / Fund Against Poverty.</param>
        /// <param name="IcmsSTConf">IcmsSTConf.</param>
        /// <param name="IcmsInterStateConf">the map key is state code.</param>
        /// <param name="CompanyId">Company ID (required).</param>
        public CustomIcmsConfByState(string Code = default(string), StateEnum State = default(StateEnum), string Name = default(string), DateTime? StartDate = default(DateTime?), DateTime? ExpirationDate = default(DateTime?), bool? Inactive = default(bool?), bool? SubjectToST = default(bool?), IcmsCSTEnum? IcmsCST = default(IcmsCSTEnum?), CalcModeEnum? CalcMode = default(CalcModeEnum?), double? DiscountRateForMonoPhase = default(double?), double? Rate = default(double?), double? IcmsBaseDiscount = default(double?), double? Msrp = default(double?), double? MvaRate = default(double?), string MsrpUnit = default(string), string IcmsLegalReason = default(string), double? FcpRate = default(double?), IcmsConfByStateIcmsSTConf IcmsSTConf = default(IcmsConfByStateIcmsSTConf), List<IcmsConfInterState> IcmsInterStateConf = default(List<IcmsConfInterState>), Guid? CompanyId = default(Guid?))
        {
            // to ensure "Code" is required (not null)
            if (Code == null)
            {
                throw new InvalidDataException("Code is a required property for CustomIcmsConfByState and cannot be null");
            }
            else
            {
                this.Code = Code;
            }
            // to ensure "State" is required (not null)
            if (State == null)
            {
                throw new InvalidDataException("State is a required property for CustomIcmsConfByState and cannot be null");
            }
            else
            {
                this.State = State;
            }
            // to ensure "CompanyId" is required (not null)
            if (CompanyId == null)
            {
                throw new InvalidDataException("CompanyId is a required property for CustomIcmsConfByState and cannot be null");
            }
            else
            {
                this.CompanyId = CompanyId;
            }
            this.Name = Name;
            this.StartDate = StartDate;
            this.ExpirationDate = ExpirationDate;
            this.Inactive = Inactive;
            this.SubjectToST = SubjectToST;
            this.IcmsCST = IcmsCST;
            this.CalcMode = CalcMode;
            this.DiscountRateForMonoPhase = DiscountRateForMonoPhase;
            this.Rate = Rate;
            this.IcmsBaseDiscount = IcmsBaseDiscount;
            this.Msrp = Msrp;
            this.MvaRate = MvaRate;
            this.MsrpUnit = MsrpUnit;
            this.IcmsLegalReason = IcmsLegalReason;
            this.FcpRate = FcpRate;
            this.IcmsSTConf = IcmsSTConf;
            this.IcmsInterStateConf = IcmsInterStateConf;
        }
        
        /// <summary>
        /// Identify the IcmsConfState in namespace
        /// </summary>
        /// <value>Identify the IcmsConfState in namespace</value>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }
        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public StateEnum State { get; set; }
        /// <summary>
        /// name for this configuration
        /// </summary>
        /// <value>name for this configuration</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }
        /// <summary>
        /// date when this configuration values starts
        /// </summary>
        /// <value>date when this configuration values starts</value>
        [DataMember(Name="startDate", EmitDefaultValue=false)]
        public DateTime? StartDate { get; set; }
        /// <summary>
        /// date when this configuration values expire
        /// </summary>
        /// <value>date when this configuration values expire</value>
        [DataMember(Name="expirationDate", EmitDefaultValue=false)]
        public DateTime? ExpirationDate { get; set; }
        /// <summary>
        /// set this configuration to Inactive
        /// </summary>
        /// <value>set this configuration to Inactive</value>
        [DataMember(Name="inactive", EmitDefaultValue=false)]
        public bool? Inactive { get; set; }
        /// <summary>
        /// inform that the item linked to this configuration is subject to ICMS ST on this state
        /// </summary>
        /// <value>inform that the item linked to this configuration is subject to ICMS ST on this state</value>
        [DataMember(Name="subjectToST", EmitDefaultValue=false)]
        public bool? SubjectToST { get; set; }
        /// <summary>
        /// discount if the item is subject to monophase PIS/COFINS for transactions inside state
        /// </summary>
        /// <value>discount if the item is subject to monophase PIS/COFINS for transactions inside state</value>
        [DataMember(Name="discountRateForMonoPhase", EmitDefaultValue=false)]
        public double? DiscountRateForMonoPhase { get; set; }
        /// <summary>
        /// ICMS rate
        /// </summary>
        /// <value>ICMS rate</value>
        [DataMember(Name="rate", EmitDefaultValue=false)]
        public double? Rate { get; set; }
        /// <summary>
        /// ICMS rate
        /// </summary>
        /// <value>ICMS rate</value>
        [DataMember(Name="icmsBaseDiscount", EmitDefaultValue=false)]
        public double? IcmsBaseDiscount { get; set; }
        /// <summary>
        /// SRP or MMSRP amount base for this icms configuration
        /// </summary>
        /// <value>SRP or MMSRP amount base for this icms configuration</value>
        [DataMember(Name="msrp", EmitDefaultValue=false)]
        public double? Msrp { get; set; }
        /// <summary>
        /// ICMS mva rate to define calc base
        /// </summary>
        /// <value>ICMS mva rate to define calc base</value>
        [DataMember(Name="mvaRate", EmitDefaultValue=false)]
        public double? MvaRate { get; set; }
        /// <summary>
        /// unit used to SRP amount value
        /// </summary>
        /// <value>unit used to SRP amount value</value>
        [DataMember(Name="msrpUnit", EmitDefaultValue=false)]
        public string MsrpUnit { get; set; }
        /// <summary>
        /// Code for the ICM legal reason, this message will be placed on invoice.
        /// </summary>
        /// <value>Code for the ICM legal reason, this message will be placed on invoice.</value>
        [DataMember(Name="icmsLegalReason", EmitDefaultValue=false)]
        public string IcmsLegalReason { get; set; }
        /// <summary>
        /// Fundo de Combate à pobreza / Fund Against Poverty
        /// </summary>
        /// <value>Fundo de Combate à pobreza / Fund Against Poverty</value>
        [DataMember(Name="fcpRate", EmitDefaultValue=false)]
        public double? FcpRate { get; set; }
        /// <summary>
        /// Gets or Sets IcmsSTConf
        /// </summary>
        [DataMember(Name="icmsSTConf", EmitDefaultValue=false)]
        public IcmsConfByStateIcmsSTConf IcmsSTConf { get; set; }
        /// <summary>
        /// the map key is state code
        /// </summary>
        /// <value>the map key is state code</value>
        [DataMember(Name="icmsInterStateConf", EmitDefaultValue=false)]
        public List<IcmsConfInterState> IcmsInterStateConf { get; set; }
        /// <summary>
        /// Company ID
        /// </summary>
        /// <value>Company ID</value>
        [DataMember(Name="companyId", EmitDefaultValue=false)]
        public Guid? CompanyId { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CustomIcmsConfByState {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  ExpirationDate: ").Append(ExpirationDate).Append("\n");
            sb.Append("  Inactive: ").Append(Inactive).Append("\n");
            sb.Append("  SubjectToST: ").Append(SubjectToST).Append("\n");
            sb.Append("  IcmsCST: ").Append(IcmsCST).Append("\n");
            sb.Append("  CalcMode: ").Append(CalcMode).Append("\n");
            sb.Append("  DiscountRateForMonoPhase: ").Append(DiscountRateForMonoPhase).Append("\n");
            sb.Append("  Rate: ").Append(Rate).Append("\n");
            sb.Append("  IcmsBaseDiscount: ").Append(IcmsBaseDiscount).Append("\n");
            sb.Append("  Msrp: ").Append(Msrp).Append("\n");
            sb.Append("  MvaRate: ").Append(MvaRate).Append("\n");
            sb.Append("  MsrpUnit: ").Append(MsrpUnit).Append("\n");
            sb.Append("  IcmsLegalReason: ").Append(IcmsLegalReason).Append("\n");
            sb.Append("  FcpRate: ").Append(FcpRate).Append("\n");
            sb.Append("  IcmsSTConf: ").Append(IcmsSTConf).Append("\n");
            sb.Append("  IcmsInterStateConf: ").Append(IcmsInterStateConf).Append("\n");
            sb.Append("  CompanyId: ").Append(CompanyId).Append("\n");
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
            return this.Equals(obj as CustomIcmsConfByState);
        }

        /// <summary>
        /// Returns true if CustomIcmsConfByState instances are equal
        /// </summary>
        /// <param name="other">Instance of CustomIcmsConfByState to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomIcmsConfByState other)
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
                    this.State == other.State ||
                    this.State != null &&
                    this.State.Equals(other.State)
                ) && 
                (
                    this.Name == other.Name ||
                    this.Name != null &&
                    this.Name.Equals(other.Name)
                ) && 
                (
                    this.StartDate == other.StartDate ||
                    this.StartDate != null &&
                    this.StartDate.Equals(other.StartDate)
                ) && 
                (
                    this.ExpirationDate == other.ExpirationDate ||
                    this.ExpirationDate != null &&
                    this.ExpirationDate.Equals(other.ExpirationDate)
                ) && 
                (
                    this.Inactive == other.Inactive ||
                    this.Inactive != null &&
                    this.Inactive.Equals(other.Inactive)
                ) && 
                (
                    this.SubjectToST == other.SubjectToST ||
                    this.SubjectToST != null &&
                    this.SubjectToST.Equals(other.SubjectToST)
                ) && 
                (
                    this.IcmsCST == other.IcmsCST ||
                    this.IcmsCST != null &&
                    this.IcmsCST.Equals(other.IcmsCST)
                ) && 
                (
                    this.CalcMode == other.CalcMode ||
                    this.CalcMode != null &&
                    this.CalcMode.Equals(other.CalcMode)
                ) && 
                (
                    this.DiscountRateForMonoPhase == other.DiscountRateForMonoPhase ||
                    this.DiscountRateForMonoPhase != null &&
                    this.DiscountRateForMonoPhase.Equals(other.DiscountRateForMonoPhase)
                ) && 
                (
                    this.Rate == other.Rate ||
                    this.Rate != null &&
                    this.Rate.Equals(other.Rate)
                ) && 
                (
                    this.IcmsBaseDiscount == other.IcmsBaseDiscount ||
                    this.IcmsBaseDiscount != null &&
                    this.IcmsBaseDiscount.Equals(other.IcmsBaseDiscount)
                ) && 
                (
                    this.Msrp == other.Msrp ||
                    this.Msrp != null &&
                    this.Msrp.Equals(other.Msrp)
                ) && 
                (
                    this.MvaRate == other.MvaRate ||
                    this.MvaRate != null &&
                    this.MvaRate.Equals(other.MvaRate)
                ) && 
                (
                    this.MsrpUnit == other.MsrpUnit ||
                    this.MsrpUnit != null &&
                    this.MsrpUnit.Equals(other.MsrpUnit)
                ) && 
                (
                    this.IcmsLegalReason == other.IcmsLegalReason ||
                    this.IcmsLegalReason != null &&
                    this.IcmsLegalReason.Equals(other.IcmsLegalReason)
                ) && 
                (
                    this.FcpRate == other.FcpRate ||
                    this.FcpRate != null &&
                    this.FcpRate.Equals(other.FcpRate)
                ) && 
                (
                    this.IcmsSTConf == other.IcmsSTConf ||
                    this.IcmsSTConf != null &&
                    this.IcmsSTConf.Equals(other.IcmsSTConf)
                ) && 
                (
                    this.IcmsInterStateConf == other.IcmsInterStateConf ||
                    this.IcmsInterStateConf != null &&
                    this.IcmsInterStateConf.SequenceEqual(other.IcmsInterStateConf)
                ) && 
                (
                    this.CompanyId == other.CompanyId ||
                    this.CompanyId != null &&
                    this.CompanyId.Equals(other.CompanyId)
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
                if (this.State != null)
                    hash = hash * 59 + this.State.GetHashCode();
                if (this.Name != null)
                    hash = hash * 59 + this.Name.GetHashCode();
                if (this.StartDate != null)
                    hash = hash * 59 + this.StartDate.GetHashCode();
                if (this.ExpirationDate != null)
                    hash = hash * 59 + this.ExpirationDate.GetHashCode();
                if (this.Inactive != null)
                    hash = hash * 59 + this.Inactive.GetHashCode();
                if (this.SubjectToST != null)
                    hash = hash * 59 + this.SubjectToST.GetHashCode();
                if (this.IcmsCST != null)
                    hash = hash * 59 + this.IcmsCST.GetHashCode();
                if (this.CalcMode != null)
                    hash = hash * 59 + this.CalcMode.GetHashCode();
                if (this.DiscountRateForMonoPhase != null)
                    hash = hash * 59 + this.DiscountRateForMonoPhase.GetHashCode();
                if (this.Rate != null)
                    hash = hash * 59 + this.Rate.GetHashCode();
                if (this.IcmsBaseDiscount != null)
                    hash = hash * 59 + this.IcmsBaseDiscount.GetHashCode();
                if (this.Msrp != null)
                    hash = hash * 59 + this.Msrp.GetHashCode();
                if (this.MvaRate != null)
                    hash = hash * 59 + this.MvaRate.GetHashCode();
                if (this.MsrpUnit != null)
                    hash = hash * 59 + this.MsrpUnit.GetHashCode();
                if (this.IcmsLegalReason != null)
                    hash = hash * 59 + this.IcmsLegalReason.GetHashCode();
                if (this.FcpRate != null)
                    hash = hash * 59 + this.FcpRate.GetHashCode();
                if (this.IcmsSTConf != null)
                    hash = hash * 59 + this.IcmsSTConf.GetHashCode();
                if (this.IcmsInterStateConf != null)
                    hash = hash * 59 + this.IcmsInterStateConf.GetHashCode();
                if (this.CompanyId != null)
                    hash = hash * 59 + this.CompanyId.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // Code (string) maxLength
            if(this.Code != null && this.Code.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Code, length must be less than 60.", new [] { "Code" });
            }

            // Name (string) maxLength
            if(this.Name != null && this.Name.Length > 60)
            {
                yield return new ValidationResult("Invalid value for Name, length must be less than 60.", new [] { "Name" });
            }

            // MsrpUnit (string) maxLength
            if(this.MsrpUnit != null && this.MsrpUnit.Length > 6)
            {
                yield return new ValidationResult("Invalid value for MsrpUnit, length must be less than 6.", new [] { "MsrpUnit" });
            }

            // IcmsLegalReason (string) maxLength
            if(this.IcmsLegalReason != null && this.IcmsLegalReason.Length > 60)
            {
                yield return new ValidationResult("Invalid value for IcmsLegalReason, length must be less than 60.", new [] { "IcmsLegalReason" });
            }

            yield break;
        }
    }

}
