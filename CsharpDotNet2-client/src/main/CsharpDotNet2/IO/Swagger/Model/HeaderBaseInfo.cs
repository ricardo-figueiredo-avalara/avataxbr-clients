using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class HeaderBaseInfo {
    /// <summary>
    /// This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
    /// </summary>
    /// <value>This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.</value>
    [DataMember(Name="accountId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "accountId")]
    public string AccountId { get; set; }

    /// <summary>
    /// This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
    /// </summary>
    /// <value>This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company</value>
    [DataMember(Name="companyCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "companyCode")]
    public string CompanyCode { get; set; }

    /// <summary>
    /// This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
    /// </summary>
    /// <value>This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' </value>
    [DataMember(Name="transactionType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transactionType")]
    public string TransactionType { get; set; }

    /// <summary>
    /// This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
    /// </summary>
    /// <value>This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored</value>
    [DataMember(Name="documentCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "documentCode")]
    public string DocumentCode { get; set; }

    /// <summary>
    /// currency code / transactions must be in Brazilian Reais \"BRL\"
    /// </summary>
    /// <value>currency code / transactions must be in Brazilian Reais \"BRL\"</value>
    [DataMember(Name="currency", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "currency")]
    public string Currency { get; set; }

    /// <summary>
    /// This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
    /// </summary>
    /// <value>This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)</value>
    [DataMember(Name="transactionDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transactionDate")]
    public DateTime? TransactionDate { get; set; }

    /// <summary>
    /// accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
    /// </summary>
    /// <value>accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.</value>
    [DataMember(Name="taxCalculationDate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "taxCalculationDate")]
    public DateTime? TaxCalculationDate { get; set; }

    /// <summary>
    /// This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
    /// </summary>
    /// <value>This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity</value>
    [DataMember(Name="companyLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "companyLocation")]
    public string CompanyLocation { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class HeaderBaseInfo {\n");
      sb.Append("  AccountId: ").Append(AccountId).Append("\n");
      sb.Append("  CompanyCode: ").Append(CompanyCode).Append("\n");
      sb.Append("  TransactionType: ").Append(TransactionType).Append("\n");
      sb.Append("  DocumentCode: ").Append(DocumentCode).Append("\n");
      sb.Append("  Currency: ").Append(Currency).Append("\n");
      sb.Append("  TransactionDate: ").Append(TransactionDate).Append("\n");
      sb.Append("  TaxCalculationDate: ").Append(TaxCalculationDate).Append("\n");
      sb.Append("  CompanyLocation: ").Append(CompanyLocation).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
