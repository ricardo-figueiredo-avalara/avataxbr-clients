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
    /// PurchaseHeaderOut
    /// </summary>
    [DataContract]
    public partial class PurchaseHeaderOut :  IEquatable<PurchaseHeaderOut>, IValidatableObject
    {
        /// <summary>
        /// This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
        /// </summary>
        /// <value>This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' </value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TransactionTypeEnum
        {
            
            /// <summary>
            /// Enum Sale for "Sale"
            /// </summary>
            [EnumMember(Value = "Sale")]
            Sale,
            
            /// <summary>
            /// Enum Purchase for "Purchase"
            /// </summary>
            [EnumMember(Value = "Purchase")]
            Purchase,
            
            /// <summary>
            /// Enum Payment for "Payment"
            /// </summary>
            [EnumMember(Value = "Payment")]
            Payment,
            
            /// <summary>
            /// Enum Receipt for "Receipt"
            /// </summary>
            [EnumMember(Value = "Receipt")]
            Receipt
        }

        /// <summary>
        /// currency code / transactions must be in Brazilian Reais \"BRL\"
        /// </summary>
        /// <value>currency code / transactions must be in Brazilian Reais \"BRL\"</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CurrencyEnum
        {
            
            /// <summary>
            /// Enum BRL for "BRL"
            /// </summary>
            [EnumMember(Value = "BRL")]
            BRL
        }

        /// <summary>
        /// This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
        /// </summary>
        /// <value>This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' </value>
        [DataMember(Name="transactionType", EmitDefaultValue=false)]
        public TransactionTypeEnum? TransactionType { get; set; }
        /// <summary>
        /// currency code / transactions must be in Brazilian Reais \"BRL\"
        /// </summary>
        /// <value>currency code / transactions must be in Brazilian Reais \"BRL\"</value>
        [DataMember(Name="currency", EmitDefaultValue=false)]
        public CurrencyEnum? Currency { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseHeaderOut" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PurchaseHeaderOut() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PurchaseHeaderOut" /> class.
        /// </summary>
        /// <param name="AccountId">This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line. (required).</param>
        /// <param name="CompanyCode">This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company (required).</param>
        /// <param name="TransactionType">This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39;  (required).</param>
        /// <param name="DocumentCode">This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored.</param>
        /// <param name="Currency">currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot; (required).</param>
        /// <param name="TransactionDate">This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) (required).</param>
        /// <param name="TaxCalculationDate">accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions..</param>
        /// <param name="CompanyLocation">This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity (required).</param>
        /// <param name="VendorCode">This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account. (required).</param>
        /// <param name="PurchaseOrderNumber">The number of Purchase Order.</param>
        /// <param name="Entity">Entity.</param>
        /// <param name="Payment">Payment.</param>
        /// <param name="TaxesConfig">TaxesConfig.</param>
        /// <param name="DefaultLocations">DefaultLocations.</param>
        public PurchaseHeaderOut(string AccountId = default(string), string CompanyCode = default(string), TransactionTypeEnum? TransactionType = default(TransactionTypeEnum?), string DocumentCode = default(string), CurrencyEnum? Currency = default(CurrencyEnum?), DateTime? TransactionDate = default(DateTime?), DateTime? TaxCalculationDate = default(DateTime?), string CompanyLocation = default(string), string VendorCode = default(string), string PurchaseOrderNumber = default(string), PurchaseEntity Entity = default(PurchaseEntity), PurchaseHeaderOutPayment Payment = default(PurchaseHeaderOutPayment), PurchaseTaxesConfig TaxesConfig = default(PurchaseTaxesConfig), PurchaseDefaultLocations DefaultLocations = default(PurchaseDefaultLocations))
        {
            // to ensure "AccountId" is required (not null)
            if (AccountId == null)
            {
                throw new InvalidDataException("AccountId is a required property for PurchaseHeaderOut and cannot be null");
            }
            else
            {
                this.AccountId = AccountId;
            }
            // to ensure "CompanyCode" is required (not null)
            if (CompanyCode == null)
            {
                throw new InvalidDataException("CompanyCode is a required property for PurchaseHeaderOut and cannot be null");
            }
            else
            {
                this.CompanyCode = CompanyCode;
            }
            // to ensure "TransactionType" is required (not null)
            if (TransactionType == null)
            {
                throw new InvalidDataException("TransactionType is a required property for PurchaseHeaderOut and cannot be null");
            }
            else
            {
                this.TransactionType = TransactionType;
            }
            // to ensure "Currency" is required (not null)
            if (Currency == null)
            {
                throw new InvalidDataException("Currency is a required property for PurchaseHeaderOut and cannot be null");
            }
            else
            {
                this.Currency = Currency;
            }
            // to ensure "TransactionDate" is required (not null)
            if (TransactionDate == null)
            {
                throw new InvalidDataException("TransactionDate is a required property for PurchaseHeaderOut and cannot be null");
            }
            else
            {
                this.TransactionDate = TransactionDate;
            }
            // to ensure "CompanyLocation" is required (not null)
            if (CompanyLocation == null)
            {
                throw new InvalidDataException("CompanyLocation is a required property for PurchaseHeaderOut and cannot be null");
            }
            else
            {
                this.CompanyLocation = CompanyLocation;
            }
            // to ensure "VendorCode" is required (not null)
            if (VendorCode == null)
            {
                throw new InvalidDataException("VendorCode is a required property for PurchaseHeaderOut and cannot be null");
            }
            else
            {
                this.VendorCode = VendorCode;
            }
            this.DocumentCode = DocumentCode;
            this.TaxCalculationDate = TaxCalculationDate;
            this.PurchaseOrderNumber = PurchaseOrderNumber;
            this.Entity = Entity;
            this.Payment = Payment;
            this.TaxesConfig = TaxesConfig;
            this.DefaultLocations = DefaultLocations;
        }
        
        /// <summary>
        /// This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
        /// </summary>
        /// <value>This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.</value>
        [DataMember(Name="accountId", EmitDefaultValue=false)]
        public string AccountId { get; set; }
        /// <summary>
        /// This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
        /// </summary>
        /// <value>This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company</value>
        [DataMember(Name="companyCode", EmitDefaultValue=false)]
        public string CompanyCode { get; set; }
        /// <summary>
        /// This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
        /// </summary>
        /// <value>This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored</value>
        [DataMember(Name="documentCode", EmitDefaultValue=false)]
        public string DocumentCode { get; set; }
        /// <summary>
        /// This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
        /// </summary>
        /// <value>This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)</value>
        [DataMember(Name="transactionDate", EmitDefaultValue=false)]
        public DateTime? TransactionDate { get; set; }
        /// <summary>
        /// accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
        /// </summary>
        /// <value>accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.</value>
        [DataMember(Name="taxCalculationDate", EmitDefaultValue=false)]
        public DateTime? TaxCalculationDate { get; set; }
        /// <summary>
        /// This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
        /// </summary>
        /// <value>This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity</value>
        [DataMember(Name="companyLocation", EmitDefaultValue=false)]
        public string CompanyLocation { get; set; }
        /// <summary>
        /// This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
        /// </summary>
        /// <value>This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.</value>
        [DataMember(Name="vendorCode", EmitDefaultValue=false)]
        public string VendorCode { get; set; }
        /// <summary>
        /// The number of Purchase Order
        /// </summary>
        /// <value>The number of Purchase Order</value>
        [DataMember(Name="purchaseOrderNumber", EmitDefaultValue=false)]
        public string PurchaseOrderNumber { get; set; }
        /// <summary>
        /// Gets or Sets Entity
        /// </summary>
        [DataMember(Name="entity", EmitDefaultValue=false)]
        public PurchaseEntity Entity { get; set; }
        /// <summary>
        /// Gets or Sets Payment
        /// </summary>
        [DataMember(Name="payment", EmitDefaultValue=false)]
        public PurchaseHeaderOutPayment Payment { get; set; }
        /// <summary>
        /// Gets or Sets TaxesConfig
        /// </summary>
        [DataMember(Name="taxesConfig", EmitDefaultValue=false)]
        public PurchaseTaxesConfig TaxesConfig { get; set; }
        /// <summary>
        /// Gets or Sets DefaultLocations
        /// </summary>
        [DataMember(Name="defaultLocations", EmitDefaultValue=false)]
        public PurchaseDefaultLocations DefaultLocations { get; set; }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PurchaseHeaderOut {\n");
            sb.Append("  AccountId: ").Append(AccountId).Append("\n");
            sb.Append("  CompanyCode: ").Append(CompanyCode).Append("\n");
            sb.Append("  TransactionType: ").Append(TransactionType).Append("\n");
            sb.Append("  DocumentCode: ").Append(DocumentCode).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  TransactionDate: ").Append(TransactionDate).Append("\n");
            sb.Append("  TaxCalculationDate: ").Append(TaxCalculationDate).Append("\n");
            sb.Append("  CompanyLocation: ").Append(CompanyLocation).Append("\n");
            sb.Append("  VendorCode: ").Append(VendorCode).Append("\n");
            sb.Append("  PurchaseOrderNumber: ").Append(PurchaseOrderNumber).Append("\n");
            sb.Append("  Entity: ").Append(Entity).Append("\n");
            sb.Append("  Payment: ").Append(Payment).Append("\n");
            sb.Append("  TaxesConfig: ").Append(TaxesConfig).Append("\n");
            sb.Append("  DefaultLocations: ").Append(DefaultLocations).Append("\n");
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
            return this.Equals(obj as PurchaseHeaderOut);
        }

        /// <summary>
        /// Returns true if PurchaseHeaderOut instances are equal
        /// </summary>
        /// <param name="other">Instance of PurchaseHeaderOut to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PurchaseHeaderOut other)
        {
            // credit: http://stackoverflow.com/a/10454552/677735
            if (other == null)
                return false;

            return 
                (
                    this.AccountId == other.AccountId ||
                    this.AccountId != null &&
                    this.AccountId.Equals(other.AccountId)
                ) && 
                (
                    this.CompanyCode == other.CompanyCode ||
                    this.CompanyCode != null &&
                    this.CompanyCode.Equals(other.CompanyCode)
                ) && 
                (
                    this.TransactionType == other.TransactionType ||
                    this.TransactionType != null &&
                    this.TransactionType.Equals(other.TransactionType)
                ) && 
                (
                    this.DocumentCode == other.DocumentCode ||
                    this.DocumentCode != null &&
                    this.DocumentCode.Equals(other.DocumentCode)
                ) && 
                (
                    this.Currency == other.Currency ||
                    this.Currency != null &&
                    this.Currency.Equals(other.Currency)
                ) && 
                (
                    this.TransactionDate == other.TransactionDate ||
                    this.TransactionDate != null &&
                    this.TransactionDate.Equals(other.TransactionDate)
                ) && 
                (
                    this.TaxCalculationDate == other.TaxCalculationDate ||
                    this.TaxCalculationDate != null &&
                    this.TaxCalculationDate.Equals(other.TaxCalculationDate)
                ) && 
                (
                    this.CompanyLocation == other.CompanyLocation ||
                    this.CompanyLocation != null &&
                    this.CompanyLocation.Equals(other.CompanyLocation)
                ) && 
                (
                    this.VendorCode == other.VendorCode ||
                    this.VendorCode != null &&
                    this.VendorCode.Equals(other.VendorCode)
                ) && 
                (
                    this.PurchaseOrderNumber == other.PurchaseOrderNumber ||
                    this.PurchaseOrderNumber != null &&
                    this.PurchaseOrderNumber.Equals(other.PurchaseOrderNumber)
                ) && 
                (
                    this.Entity == other.Entity ||
                    this.Entity != null &&
                    this.Entity.Equals(other.Entity)
                ) && 
                (
                    this.Payment == other.Payment ||
                    this.Payment != null &&
                    this.Payment.Equals(other.Payment)
                ) && 
                (
                    this.TaxesConfig == other.TaxesConfig ||
                    this.TaxesConfig != null &&
                    this.TaxesConfig.Equals(other.TaxesConfig)
                ) && 
                (
                    this.DefaultLocations == other.DefaultLocations ||
                    this.DefaultLocations != null &&
                    this.DefaultLocations.Equals(other.DefaultLocations)
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
                if (this.AccountId != null)
                    hash = hash * 59 + this.AccountId.GetHashCode();
                if (this.CompanyCode != null)
                    hash = hash * 59 + this.CompanyCode.GetHashCode();
                if (this.TransactionType != null)
                    hash = hash * 59 + this.TransactionType.GetHashCode();
                if (this.DocumentCode != null)
                    hash = hash * 59 + this.DocumentCode.GetHashCode();
                if (this.Currency != null)
                    hash = hash * 59 + this.Currency.GetHashCode();
                if (this.TransactionDate != null)
                    hash = hash * 59 + this.TransactionDate.GetHashCode();
                if (this.TaxCalculationDate != null)
                    hash = hash * 59 + this.TaxCalculationDate.GetHashCode();
                if (this.CompanyLocation != null)
                    hash = hash * 59 + this.CompanyLocation.GetHashCode();
                if (this.VendorCode != null)
                    hash = hash * 59 + this.VendorCode.GetHashCode();
                if (this.PurchaseOrderNumber != null)
                    hash = hash * 59 + this.PurchaseOrderNumber.GetHashCode();
                if (this.Entity != null)
                    hash = hash * 59 + this.Entity.GetHashCode();
                if (this.Payment != null)
                    hash = hash * 59 + this.Payment.GetHashCode();
                if (this.TaxesConfig != null)
                    hash = hash * 59 + this.TaxesConfig.GetHashCode();
                if (this.DefaultLocations != null)
                    hash = hash * 59 + this.DefaultLocations.GetHashCode();
                return hash;
            }
        }

        public IEnumerable<ValidationResult> Validate(ValidationContext validationContext)
        { 
            // CompanyCode (string) maxLength
            if(this.CompanyCode != null && this.CompanyCode.Length > 60)
            {
                yield return new ValidationResult("Invalid value for CompanyCode, length must be less than 60.", new [] { "CompanyCode" });
            }

            // CompanyLocation (string) maxLength
            if(this.CompanyLocation != null && this.CompanyLocation.Length > 64)
            {
                yield return new ValidationResult("Invalid value for CompanyLocation, length must be less than 64.", new [] { "CompanyLocation" });
            }

            yield break;
        }
    }

}
