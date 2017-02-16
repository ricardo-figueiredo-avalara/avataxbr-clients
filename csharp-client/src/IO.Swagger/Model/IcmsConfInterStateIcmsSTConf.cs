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
    /// IcmsConfInterStateIcmsSTConf
    /// </summary>
    [DataContract]
    public partial class IcmsConfInterStateIcmsSTConf :  IEquatable<IcmsConfInterStateIcmsSTConf>, IValidatableObject
    {
        /// <summary>
        /// Gets or Sets ProtocolType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ProtocolTypeEnum
        {
            
            /// <summary>
            /// Enum COVENANT for "COVENANT"
            /// </summary>
            [EnumMember(Value = "COVENANT")]
            COVENANT,
            
            /// <summary>
            /// Enum PROTOCOL for "PROTOCOL"
            /// </summary>
            [EnumMember(Value = "PROTOCOL")]
            PROTOCOL,
            
            /// <summary>
            /// Enum NOTHING for "NOTHING"
            /// </summary>
            [EnumMember(Value = "NOTHING")]
            NOTHING
        }

        /// <summary>
        /// how this ICMS-ST will be calculed for itens linked to this configuration
        /// </summary>
        /// <value>how this ICMS-ST will be calculed for itens linked to this configuration</value>
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
            /// Enum MSRP for "MSRP"
            /// </summary>
            [EnumMember(Value = "MSRP")]
            MSRP
        }

        /// <summary>
        /// Gets or Sets ProtocolType
        /// </summary>
        [DataMember(Name="protocolType", EmitDefaultValue=false)]
        public ProtocolTypeEnum? ProtocolType { get; set; }
        /// <summary>
        /// how this ICMS-ST will be calculed for itens linked to this configuration
        /// </summary>
        /// <value>how this ICMS-ST will be calculed for itens linked to this configuration</value>
        [DataMember(Name="calcMode", EmitDefaultValue=false)]
        public CalcModeEnum? CalcMode { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="IcmsConfInterStateIcmsSTConf" /> class.
        /// </summary>
        /// <param name="ProtocolType">ProtocolType.</param>
        /// <param name="HasReductionOfMVAForSimples">inform that substituted is tax regime Simplified the operation MVA will be reduced.</param>
        /// <param name="ReductionOfMVAForSimples">MVA reduction when substituted is tax regime Simplified..</param>
        /// <param name="CalcMode">how this ICMS-ST will be calculed for itens linked to this configuration.</param>
        /// <param name="IcmsStBaseDiscount">ICMS rate - Redução da BC ICMS ST (%).</param>
        /// <param name="MvaRate">ICMS-ST MVA rate to define calc base.</param>
        /// <param name="Srp">SRP or MSRP amount base for this ICMS-ST configuration.</param>
        /// <param name="SrpUnit">unit used to SRP amount value.</param>
        public IcmsConfInterStateIcmsSTConf(ProtocolTypeEnum? ProtocolType = default(ProtocolTypeEnum?), bool? HasReductionOfMVAForSimples = default(bool?), double? ReductionOfMVAForSimples = default(double?), CalcModeEnum? CalcMode = default(CalcModeEnum?), double? IcmsStBaseDiscount = default(double?), double? MvaRate = default(double?), double? Srp = default(double?), string SrpUnit = default(string))
        {
            this.ProtocolType = ProtocolType;
            this.HasReductionOfMVAForSimples = HasReductionOfMVAForSimples;
            this.ReductionOfMVAForSimples = ReductionOfMVAForSimples;
            this.CalcMode = CalcMode;
            this.IcmsStBaseDiscount = IcmsStBaseDiscount;
            this.MvaRate = MvaRate;
            this.Srp = Srp;
            this.SrpUnit = SrpUnit;
        }
        
        /// <summary>
        /// inform that substituted is tax regime Simplified the operation MVA will be reduced
        /// </summary>
        /// <value>inform that substituted is tax regime Simplified the operation MVA will be reduced</value>
        [DataMember(Name="hasReductionOfMVAForSimples", EmitDefaultValue=false)]
        public bool? HasReductionOfMVAForSimples { get; set; }
        /// <summary>
        /// MVA reduction when substituted is tax regime Simplified.
        /// </summary>
        /// <value>MVA reduction when substituted is tax regime Simplified.</value>
        [DataMember(Name="reductionOfMVAForSimples", EmitDefaultValue=false)]
        public double? ReductionOfMVAForSimples { get; set; }
        /// <summary>
        /// ICMS rate - Redução da BC ICMS ST (%)
        /// </summary>
        /// <value>ICMS rate - Redução da BC ICMS ST (%)</value>
        [DataMember(Name="icmsStBaseDiscount", EmitDefaultValue=false)]
        public double? IcmsStBaseDiscount { get; set; }
        /// <summary>
        /// ICMS-ST MVA rate to define calc base
        /// </summary>
        /// <value>ICMS-ST MVA rate to define calc base</value>
        [DataMember(Name="mvaRate", EmitDefaultValue=false)]
        public double? MvaRate { get; set; }
        /// <summary>
        /// SRP or MSRP amount base for this ICMS-ST configuration
        /// </summary>
        /// <value>SRP or MSRP amount base for this ICMS-ST configuration</value>
        [DataMember(Name="srp", EmitDefaultValue=false)]
        public double? Srp { get; set; }
        /// <summary>
        /// unit used to SRP amount value
        /// </summary>
        /// <value>unit used to SRP amount value</value>
        [DataMember(Name="srpUnit", EmitDefaultValue=false)]
        public string SrpUnit { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IcmsConfInterStateIcmsSTConf {\n");
            sb.Append("  ProtocolType: ").Append(ProtocolType).Append("\n");
            sb.Append("  HasReductionOfMVAForSimples: ").Append(HasReductionOfMVAForSimples).Append("\n");
            sb.Append("  ReductionOfMVAForSimples: ").Append(ReductionOfMVAForSimples).Append("\n");
            sb.Append("  CalcMode: ").Append(CalcMode).Append("\n");
            sb.Append("  IcmsStBaseDiscount: ").Append(IcmsStBaseDiscount).Append("\n");
            sb.Append("  MvaRate: ").Append(MvaRate).Append("\n");
            sb.Append("  Srp: ").Append(Srp).Append("\n");
            sb.Append("  SrpUnit: ").Append(SrpUnit).Append("\n");
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
            return this.Equals(obj as IcmsConfInterStateIcmsSTConf);
        }

        /// <summary>
        /// Returns true if IcmsConfInterStateIcmsSTConf instances are equal
        /// </summary>
        /// <param name="other">Instance of IcmsConfInterStateIcmsSTConf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IcmsConfInterStateIcmsSTConf other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ProtocolType == other.ProtocolType ||
                    this.ProtocolType != null &&
                    this.ProtocolType.Equals(other.ProtocolType)
                ) && 
                (
                    this.HasReductionOfMVAForSimples == other.HasReductionOfMVAForSimples ||
                    this.HasReductionOfMVAForSimples != null &&
                    this.HasReductionOfMVAForSimples.Equals(other.HasReductionOfMVAForSimples)
                ) && 
                (
                    this.ReductionOfMVAForSimples == other.ReductionOfMVAForSimples ||
                    this.ReductionOfMVAForSimples != null &&
                    this.ReductionOfMVAForSimples.Equals(other.ReductionOfMVAForSimples)
                ) && 
                (
                    this.CalcMode == other.CalcMode ||
                    this.CalcMode != null &&
                    this.CalcMode.Equals(other.CalcMode)
                ) && 
                (
                    this.IcmsStBaseDiscount == other.IcmsStBaseDiscount ||
                    this.IcmsStBaseDiscount != null &&
                    this.IcmsStBaseDiscount.Equals(other.IcmsStBaseDiscount)
                ) && 
                (
                    this.MvaRate == other.MvaRate ||
                    this.MvaRate != null &&
                    this.MvaRate.Equals(other.MvaRate)
                ) && 
                (
                    this.Srp == other.Srp ||
                    this.Srp != null &&
                    this.Srp.Equals(other.Srp)
                ) && 
                (
                    this.SrpUnit == other.SrpUnit ||
                    this.SrpUnit != null &&
                    this.SrpUnit.Equals(other.SrpUnit)
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
                if (this.ProtocolType != null)
                    hash = hash * 59 + this.ProtocolType.GetHashCode();
                if (this.HasReductionOfMVAForSimples != null)
                    hash = hash * 59 + this.HasReductionOfMVAForSimples.GetHashCode();
                if (this.ReductionOfMVAForSimples != null)
                    hash = hash * 59 + this.ReductionOfMVAForSimples.GetHashCode();
                if (this.CalcMode != null)
                    hash = hash * 59 + this.CalcMode.GetHashCode();
                if (this.IcmsStBaseDiscount != null)
                    hash = hash * 59 + this.IcmsStBaseDiscount.GetHashCode();
                if (this.MvaRate != null)
                    hash = hash * 59 + this.MvaRate.GetHashCode();
                if (this.Srp != null)
                    hash = hash * 59 + this.Srp.GetHashCode();
                if (this.SrpUnit != null)
                    hash = hash * 59 + this.SrpUnit.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // SrpUnit (string) maxLength
            if(this.SrpUnit != null && this.SrpUnit.Length > 6)
            {
                yield return new ValidationResult("Invalid value for SrpUnit, length must be less than 6.", new [] { "SrpUnit" });
            }

            yield break;
        }
    }

}