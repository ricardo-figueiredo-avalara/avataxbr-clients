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
    /// PurchaseInfo
    /// </summary>
    [DataContract]
    public partial class PurchaseInfo :  IEquatable<PurchaseInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseInfo" /> class.
        /// </summary>
        /// <param name="GovernmentOrder">Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas .</param>
        /// <param name="OrderNumber">Order info Informação do pedido .</param>
        /// <param name="ContractNumber">Agreement info Informação do contrato .</param>
        public PurchaseInfo(string GovernmentOrder = default(string), string OrderNumber = default(string), string ContractNumber = default(string))
        {
            this.GovernmentOrder = GovernmentOrder;
            this.OrderNumber = OrderNumber;
            this.ContractNumber = ContractNumber;
        }
        
        /// <summary>
        /// Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas 
        /// </summary>
        /// <value>Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas </value>
        [DataMember(Name="governmentOrder", EmitDefaultValue=false)]
        public string GovernmentOrder { get; set; }
        /// <summary>
        /// Order info Informação do pedido 
        /// </summary>
        /// <value>Order info Informação do pedido </value>
        [DataMember(Name="orderNumber", EmitDefaultValue=false)]
        public string OrderNumber { get; set; }
        /// <summary>
        /// Agreement info Informação do contrato 
        /// </summary>
        /// <value>Agreement info Informação do contrato </value>
        [DataMember(Name="contractNumber", EmitDefaultValue=false)]
        public string ContractNumber { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PurchaseInfo {\n");
            sb.Append("  GovernmentOrder: ").Append(GovernmentOrder).Append("\n");
            sb.Append("  OrderNumber: ").Append(OrderNumber).Append("\n");
            sb.Append("  ContractNumber: ").Append(ContractNumber).Append("\n");
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
            return this.Equals(obj as PurchaseInfo);
        }

        /// <summary>
        /// Returns true if PurchaseInfo instances are equal
        /// </summary>
        /// <param name="other">Instance of PurchaseInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PurchaseInfo other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.GovernmentOrder == other.GovernmentOrder ||
                    this.GovernmentOrder != null &&
                    this.GovernmentOrder.Equals(other.GovernmentOrder)
                ) && 
                (
                    this.OrderNumber == other.OrderNumber ||
                    this.OrderNumber != null &&
                    this.OrderNumber.Equals(other.OrderNumber)
                ) && 
                (
                    this.ContractNumber == other.ContractNumber ||
                    this.ContractNumber != null &&
                    this.ContractNumber.Equals(other.ContractNumber)
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
                if (this.GovernmentOrder != null)
                    hash = hash * 59 + this.GovernmentOrder.GetHashCode();
                if (this.OrderNumber != null)
                    hash = hash * 59 + this.OrderNumber.GetHashCode();
                if (this.ContractNumber != null)
                    hash = hash * 59 + this.ContractNumber.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // GovernmentOrder (string) maxLength
            if(this.GovernmentOrder != null && this.GovernmentOrder.Length > 22)
            {
                yield return new ValidationResult("Invalid value for GovernmentOrder, length must be less than 22.", new [] { "GovernmentOrder" });
            }

            // GovernmentOrder (string) minLength
            if(this.GovernmentOrder != null && this.GovernmentOrder.Length < 1)
            {
                yield return new ValidationResult("Invalid value for GovernmentOrder, length must be greater than 1.", new [] { "GovernmentOrder" });
            }

            // OrderNumber (string) maxLength
            if(this.OrderNumber != null && this.OrderNumber.Length > 60)
            {
                yield return new ValidationResult("Invalid value for OrderNumber, length must be less than 60.", new [] { "OrderNumber" });
            }

            // OrderNumber (string) minLength
            if(this.OrderNumber != null && this.OrderNumber.Length < 1)
            {
                yield return new ValidationResult("Invalid value for OrderNumber, length must be greater than 1.", new [] { "OrderNumber" });
            }

            // ContractNumber (string) maxLength
            if(this.ContractNumber != null && this.ContractNumber.Length > 60)
            {
                yield return new ValidationResult("Invalid value for ContractNumber, length must be less than 60.", new [] { "ContractNumber" });
            }

            // ContractNumber (string) minLength
            if(this.ContractNumber != null && this.ContractNumber.Length < 1)
            {
                yield return new ValidationResult("Invalid value for ContractNumber, length must be greater than 1.", new [] { "ContractNumber" });
            }

            yield break;
        }
    }

}