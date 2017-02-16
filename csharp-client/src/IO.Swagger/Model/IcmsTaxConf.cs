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
    /// IcmsTaxConf
    /// </summary>
    [DataContract]
    public partial class IcmsTaxConf :  IEquatable<IcmsTaxConf>, IValidatableObject
    {
        /// <summary>
        /// On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
        /// </summary>
        /// <value>On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED </value>
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
        /// On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 
        /// </summary>
        /// <value>On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED </value>
        [DataMember(Name="icmsCST", EmitDefaultValue=false)]
        public IcmsCSTEnum? IcmsCST { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="IcmsTaxConf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected IcmsTaxConf() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="IcmsTaxConf" /> class.
        /// </summary>
        /// <param name="State">State (required).</param>
        /// <param name="IcmsCST">On sales process inform the CST hat the item linked to this configuration is subject to - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED .</param>
        /// <param name="MessageCode">Message to add to NF when this configuration is used.</param>
        /// <param name="RelationShip">the mapping key is state code / A chave do mapeamento é o código do Estado..</param>
        public IcmsTaxConf(StateEnum State = default(StateEnum), IcmsCSTEnum? IcmsCST = default(IcmsCSTEnum?), string MessageCode = default(string), List<IcmsTaxConfBase> RelationShip = default(List<IcmsTaxConfBase>))
        {
            // to ensure "State" is required (not null)
            if (State == null)
            {
                throw new InvalidDataException("State is a required property for IcmsTaxConf and cannot be null");
            }
            else
            {
                this.State = State;
            }
            this.IcmsCST = IcmsCST;
            this.MessageCode = MessageCode;
            this.RelationShip = RelationShip;
        }
        
        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name="state", EmitDefaultValue=false)]
        public StateEnum State { get; set; }
        /// <summary>
        /// Message to add to NF when this configuration is used
        /// </summary>
        /// <value>Message to add to NF when this configuration is used</value>
        [DataMember(Name="messageCode", EmitDefaultValue=false)]
        public string MessageCode { get; set; }
        /// <summary>
        /// the mapping key is state code / A chave do mapeamento é o código do Estado.
        /// </summary>
        /// <value>the mapping key is state code / A chave do mapeamento é o código do Estado.</value>
        [DataMember(Name="relationShip", EmitDefaultValue=false)]
        public List<IcmsTaxConfBase> RelationShip { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class IcmsTaxConf {\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  IcmsCST: ").Append(IcmsCST).Append("\n");
            sb.Append("  MessageCode: ").Append(MessageCode).Append("\n");
            sb.Append("  RelationShip: ").Append(RelationShip).Append("\n");
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
            return this.Equals(obj as IcmsTaxConf);
        }

        /// <summary>
        /// Returns true if IcmsTaxConf instances are equal
        /// </summary>
        /// <param name="other">Instance of IcmsTaxConf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IcmsTaxConf other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.State == other.State ||
                    this.State != null &&
                    this.State.Equals(other.State)
                ) && 
                (
                    this.IcmsCST == other.IcmsCST ||
                    this.IcmsCST != null &&
                    this.IcmsCST.Equals(other.IcmsCST)
                ) && 
                (
                    this.MessageCode == other.MessageCode ||
                    this.MessageCode != null &&
                    this.MessageCode.Equals(other.MessageCode)
                ) && 
                (
                    this.RelationShip == other.RelationShip ||
                    this.RelationShip != null &&
                    this.RelationShip.SequenceEqual(other.RelationShip)
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
                if (this.State != null)
                    hash = hash * 59 + this.State.GetHashCode();
                if (this.IcmsCST != null)
                    hash = hash * 59 + this.IcmsCST.GetHashCode();
                if (this.MessageCode != null)
                    hash = hash * 59 + this.MessageCode.GetHashCode();
                if (this.RelationShip != null)
                    hash = hash * 59 + this.RelationShip.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // MessageCode (string) maxLength
            if(this.MessageCode != null && this.MessageCode.Length > 60)
            {
                yield return new ValidationResult("Invalid value for MessageCode, length must be less than 60.", new [] { "MessageCode" });
            }

            yield break;
        }
    }

}