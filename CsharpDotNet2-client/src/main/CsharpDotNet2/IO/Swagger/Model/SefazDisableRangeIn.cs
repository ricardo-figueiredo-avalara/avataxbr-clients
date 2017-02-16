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
  public class SefazDisableRangeIn {
    /// <summary>
    /// This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
    /// </summary>
    /// <value>This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity</value>
    [DataMember(Name="companyLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "companyLocation")]
    public string CompanyLocation { get; set; }

    /// <summary>
    /// This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
    /// </summary>
    /// <value>This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) </value>
    [DataMember(Name="transactionModel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "transactionModel")]
    public string TransactionModel { get; set; }

    /// <summary>
    /// Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
    /// </summary>
    /// <value>Invoice number, sequential unique by invoice serial (Número da nota fiscal) </value>
    [DataMember(Name="invoiceSerial", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invoiceSerial")]
    public int? InvoiceSerial { get; set; }

    /// <summary>
    /// Gets or Sets Year
    /// </summary>
    [DataMember(Name="year", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "year")]
    public double? Year { get; set; }

    /// <summary>
    /// Gets or Sets Message
    /// </summary>
    [DataMember(Name="message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "message")]
    public string Message { get; set; }

    /// <summary>
    /// First number of disable range.
    /// </summary>
    /// <value>First number of disable range.</value>
    [DataMember(Name="invoiceNumberInit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invoiceNumberInit")]
    public double? InvoiceNumberInit { get; set; }

    /// <summary>
    /// Last number of disable range.
    /// </summary>
    /// <value>Last number of disable range.</value>
    [DataMember(Name="invoiceNumberEnd", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invoiceNumberEnd")]
    public double? InvoiceNumberEnd { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SefazDisableRangeIn {\n");
      sb.Append("  CompanyLocation: ").Append(CompanyLocation).Append("\n");
      sb.Append("  TransactionModel: ").Append(TransactionModel).Append("\n");
      sb.Append("  InvoiceSerial: ").Append(InvoiceSerial).Append("\n");
      sb.Append("  Year: ").Append(Year).Append("\n");
      sb.Append("  Message: ").Append(Message).Append("\n");
      sb.Append("  InvoiceNumberInit: ").Append(InvoiceNumberInit).Append("\n");
      sb.Append("  InvoiceNumberEnd: ").Append(InvoiceNumberEnd).Append("\n");
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
