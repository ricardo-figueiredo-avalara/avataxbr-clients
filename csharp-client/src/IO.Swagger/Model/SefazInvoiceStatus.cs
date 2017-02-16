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
    /// SefazInvoiceStatus
    /// </summary>
    [DataContract]
    public partial class SefazInvoiceStatus :  IEquatable<SefazInvoiceStatus>, IValidatableObject
    {
        /// <summary>
        /// - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
        /// </summary>
        /// <value>- '1' # Ambiente de Produção - '2' # Ambiente de Homologação </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EnvironmentEnum
        {
            
            /// <summary>
            /// Enum _1 for "1"
            /// </summary>
            [EnumMember(Value = "1")]
            _1,
            
            /// <summary>
            /// Enum _2 for "2"
            /// </summary>
            [EnumMember(Value = "2")]
            _2
        }

        /// <summary>
        /// - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
        /// </summary>
        /// <value>- '1' # Ambiente de Produção - '2' # Ambiente de Homologação </value>
        [DataMember(Name="environment", EmitDefaultValue=false)]
        public EnvironmentEnum? Environment { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SefazInvoiceStatus" /> class.
        /// </summary>
        /// <param name="Code">Code.</param>
        /// <param name="Desc">Desc.</param>
        /// <param name="Protocol">Protocol.</param>
        /// <param name="Rec">Rec.</param>
        /// <param name="Date">Date.</param>
        /// <param name="Environment">- &#39;1&#39; # Ambiente de Produção - &#39;2&#39; # Ambiente de Homologação .</param>
        /// <param name="AppVersion">AppVersion.</param>
        public SefazInvoiceStatus(string Code = default(string), string Desc = default(string), string Protocol = default(string), string Rec = default(string), DateTime? Date = default(DateTime?), EnvironmentEnum? Environment = default(EnvironmentEnum?), string AppVersion = default(string))
        {
            this.Code = Code;
            this.Desc = Desc;
            this.Protocol = Protocol;
            this.Rec = Rec;
            this.Date = Date;
            this.Environment = Environment;
            this.AppVersion = AppVersion;
        }
        
        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name="code", EmitDefaultValue=false)]
        public string Code { get; set; }
        /// <summary>
        /// Gets or Sets Desc
        /// </summary>
        [DataMember(Name="desc", EmitDefaultValue=false)]
        public string Desc { get; set; }
        /// <summary>
        /// Gets or Sets Protocol
        /// </summary>
        [DataMember(Name="protocol", EmitDefaultValue=false)]
        public string Protocol { get; set; }
        /// <summary>
        /// Gets or Sets Rec
        /// </summary>
        [DataMember(Name="rec", EmitDefaultValue=false)]
        public string Rec { get; set; }
        /// <summary>
        /// Gets or Sets Date
        /// </summary>
        [DataMember(Name="date", EmitDefaultValue=false)]
        public DateTime? Date { get; set; }
        /// <summary>
        /// Gets or Sets AppVersion
        /// </summary>
        [DataMember(Name="appVersion", EmitDefaultValue=false)]
        public string AppVersion { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SefazInvoiceStatus {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Desc: ").Append(Desc).Append("\n");
            sb.Append("  Protocol: ").Append(Protocol).Append("\n");
            sb.Append("  Rec: ").Append(Rec).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Environment: ").Append(Environment).Append("\n");
            sb.Append("  AppVersion: ").Append(AppVersion).Append("\n");
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
            return this.Equals(obj as SefazInvoiceStatus);
        }

        /// <summary>
        /// Returns true if SefazInvoiceStatus instances are equal
        /// </summary>
        /// <param name="other">Instance of SefazInvoiceStatus to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SefazInvoiceStatus other)
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
                    this.Desc == other.Desc ||
                    this.Desc != null &&
                    this.Desc.Equals(other.Desc)
                ) && 
                (
                    this.Protocol == other.Protocol ||
                    this.Protocol != null &&
                    this.Protocol.Equals(other.Protocol)
                ) && 
                (
                    this.Rec == other.Rec ||
                    this.Rec != null &&
                    this.Rec.Equals(other.Rec)
                ) && 
                (
                    this.Date == other.Date ||
                    this.Date != null &&
                    this.Date.Equals(other.Date)
                ) && 
                (
                    this.Environment == other.Environment ||
                    this.Environment != null &&
                    this.Environment.Equals(other.Environment)
                ) && 
                (
                    this.AppVersion == other.AppVersion ||
                    this.AppVersion != null &&
                    this.AppVersion.Equals(other.AppVersion)
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
                if (this.Desc != null)
                    hash = hash * 59 + this.Desc.GetHashCode();
                if (this.Protocol != null)
                    hash = hash * 59 + this.Protocol.GetHashCode();
                if (this.Rec != null)
                    hash = hash * 59 + this.Rec.GetHashCode();
                if (this.Date != null)
                    hash = hash * 59 + this.Date.GetHashCode();
                if (this.Environment != null)
                    hash = hash * 59 + this.Environment.GetHashCode();
                if (this.AppVersion != null)
                    hash = hash * 59 + this.AppVersion.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // Code (string) pattern
            Regex regexCode = new Regex(@"\\d{3}", RegexOptions.CultureInvariant);
            if (false == regexCode.Match(this.Code).Success)
            {
                yield return new ValidationResult("Invalid value for Code, must match a pattern of /\\d{3}/.", new [] { "Code" });
            }

            yield break;
        }
    }

}
