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
    /// Fuel
    /// </summary>
    [DataContract]
    public partial class Fuel :  IEquatable<Fuel>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Fuel" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Fuel() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Fuel" /> class.
        /// </summary>
        /// <param name="ProdANPCode">ProdANPCode (required).</param>
        /// <param name="PerMixGN">percentage of natural gas (GLP).</param>
        /// <param name="AuthorizationCodeCODIF">AuthorizationCodeCODIF.</param>
        /// <param name="QuantityOnRoomTemperature">This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. .</param>
        /// <param name="StateCodeOfUndUser">state where fuel was used (required).</param>
        /// <param name="Cide">Cide.</param>
        /// <param name="PumpNumber">PumpNumber.</param>
        public Fuel(string ProdANPCode = default(string), double? PerMixGN = default(double?), string AuthorizationCodeCODIF = default(string), double? QuantityOnRoomTemperature = default(double?), StateEnum StateCodeOfUndUser = default(StateEnum), FuelCide Cide = default(FuelCide), FuelPumpNumber PumpNumber = default(FuelPumpNumber))
        {
            // to ensure "ProdANPCode" is required (not null)
            if (ProdANPCode == null)
            {
                throw new InvalidDataException("ProdANPCode is a required property for Fuel and cannot be null");
            }
            else
            {
                this.ProdANPCode = ProdANPCode;
            }
            // to ensure "StateCodeOfUndUser" is required (not null)
            if (StateCodeOfUndUser == null)
            {
                throw new InvalidDataException("StateCodeOfUndUser is a required property for Fuel and cannot be null");
            }
            else
            {
                this.StateCodeOfUndUser = StateCodeOfUndUser;
            }
            this.PerMixGN = PerMixGN;
            this.AuthorizationCodeCODIF = AuthorizationCodeCODIF;
            this.QuantityOnRoomTemperature = QuantityOnRoomTemperature;
            this.Cide = Cide;
            this.PumpNumber = PumpNumber;
        }
        
        /// <summary>
        /// Gets or Sets ProdANPCode
        /// </summary>
        [DataMember(Name="prodANPCode", EmitDefaultValue=false)]
        public string ProdANPCode { get; set; }
        /// <summary>
        /// percentage of natural gas (GLP)
        /// </summary>
        /// <value>percentage of natural gas (GLP)</value>
        [DataMember(Name="perMixGN", EmitDefaultValue=false)]
        public double? PerMixGN { get; set; }
        /// <summary>
        /// Gets or Sets AuthorizationCodeCODIF
        /// </summary>
        [DataMember(Name="authorizationCodeCODIF", EmitDefaultValue=false)]
        public string AuthorizationCodeCODIF { get; set; }
        /// <summary>
        /// This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. 
        /// </summary>
        /// <value>This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. </value>
        [DataMember(Name="quantityOnRoomTemperature", EmitDefaultValue=false)]
        public double? QuantityOnRoomTemperature { get; set; }
        /// <summary>
        /// state where fuel was used
        /// </summary>
        /// <value>state where fuel was used</value>
        [DataMember(Name="stateCodeOfUndUser", EmitDefaultValue=false)]
        public StateEnum StateCodeOfUndUser { get; set; }
        /// <summary>
        /// Gets or Sets Cide
        /// </summary>
        [DataMember(Name="cide", EmitDefaultValue=false)]
        public FuelCide Cide { get; set; }
        /// <summary>
        /// Gets or Sets PumpNumber
        /// </summary>
        [DataMember(Name="pumpNumber", EmitDefaultValue=false)]
        public FuelPumpNumber PumpNumber { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Fuel {\n");
            sb.Append("  ProdANPCode: ").Append(ProdANPCode).Append("\n");
            sb.Append("  PerMixGN: ").Append(PerMixGN).Append("\n");
            sb.Append("  AuthorizationCodeCODIF: ").Append(AuthorizationCodeCODIF).Append("\n");
            sb.Append("  QuantityOnRoomTemperature: ").Append(QuantityOnRoomTemperature).Append("\n");
            sb.Append("  StateCodeOfUndUser: ").Append(StateCodeOfUndUser).Append("\n");
            sb.Append("  Cide: ").Append(Cide).Append("\n");
            sb.Append("  PumpNumber: ").Append(PumpNumber).Append("\n");
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
            return this.Equals(obj as Fuel);
        }

        /// <summary>
        /// Returns true if Fuel instances are equal
        /// </summary>
        /// <param name="other">Instance of Fuel to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Fuel other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.ProdANPCode == other.ProdANPCode ||
                    this.ProdANPCode != null &&
                    this.ProdANPCode.Equals(other.ProdANPCode)
                ) && 
                (
                    this.PerMixGN == other.PerMixGN ||
                    this.PerMixGN != null &&
                    this.PerMixGN.Equals(other.PerMixGN)
                ) && 
                (
                    this.AuthorizationCodeCODIF == other.AuthorizationCodeCODIF ||
                    this.AuthorizationCodeCODIF != null &&
                    this.AuthorizationCodeCODIF.Equals(other.AuthorizationCodeCODIF)
                ) && 
                (
                    this.QuantityOnRoomTemperature == other.QuantityOnRoomTemperature ||
                    this.QuantityOnRoomTemperature != null &&
                    this.QuantityOnRoomTemperature.Equals(other.QuantityOnRoomTemperature)
                ) && 
                (
                    this.StateCodeOfUndUser == other.StateCodeOfUndUser ||
                    this.StateCodeOfUndUser != null &&
                    this.StateCodeOfUndUser.Equals(other.StateCodeOfUndUser)
                ) && 
                (
                    this.Cide == other.Cide ||
                    this.Cide != null &&
                    this.Cide.Equals(other.Cide)
                ) && 
                (
                    this.PumpNumber == other.PumpNumber ||
                    this.PumpNumber != null &&
                    this.PumpNumber.Equals(other.PumpNumber)
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
                if (this.ProdANPCode != null)
                    hash = hash * 59 + this.ProdANPCode.GetHashCode();
                if (this.PerMixGN != null)
                    hash = hash * 59 + this.PerMixGN.GetHashCode();
                if (this.AuthorizationCodeCODIF != null)
                    hash = hash * 59 + this.AuthorizationCodeCODIF.GetHashCode();
                if (this.QuantityOnRoomTemperature != null)
                    hash = hash * 59 + this.QuantityOnRoomTemperature.GetHashCode();
                if (this.StateCodeOfUndUser != null)
                    hash = hash * 59 + this.StateCodeOfUndUser.GetHashCode();
                if (this.Cide != null)
                    hash = hash * 59 + this.Cide.GetHashCode();
                if (this.PumpNumber != null)
                    hash = hash * 59 + this.PumpNumber.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // ProdANPCode (string) pattern
            Regex regexProdANPCode = new Regex(@"[0-9]{9}", RegexOptions.CultureInvariant);
            if (false == regexProdANPCode.Match(this.ProdANPCode).Success)
            {
                yield return new ValidationResult("Invalid value for ProdANPCode, must match a pattern of /[0-9]{9}/.", new [] { "ProdANPCode" });
            }

            // AuthorizationCodeCODIF (string) pattern
            Regex regexAuthorizationCodeCODIF = new Regex(@"[0-9]{1,21}", RegexOptions.CultureInvariant);
            if (false == regexAuthorizationCodeCODIF.Match(this.AuthorizationCodeCODIF).Success)
            {
                yield return new ValidationResult("Invalid value for AuthorizationCodeCODIF, must match a pattern of /[0-9]{1,21}/.", new [] { "AuthorizationCodeCODIF" });
            }

            yield break;
        }
    }

}
