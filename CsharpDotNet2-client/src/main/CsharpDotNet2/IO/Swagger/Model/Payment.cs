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
  public class Payment {
    /// <summary>
    /// Installment terms - 0 # cash - 1 # on terms - 2 # other 
    /// </summary>
    /// <value>Installment terms - 0 # cash - 1 # on terms - 2 # other </value>
    [DataMember(Name="installmentsTerms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "installmentsTerms")]
    public int? InstallmentsTerms { get; set; }

    /// <summary>
    /// Gets or Sets Bill
    /// </summary>
    [DataMember(Name="bill", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "bill")]
    public PaymentBill Bill { get; set; }

    /// <summary>
    /// Gets or Sets Installment
    /// </summary>
    [DataMember(Name="installment", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "installment")]
    public List<PaymentInstallment> Installment { get; set; }

    /// <summary>
    /// Gets or Sets PaymentMode
    /// </summary>
    [DataMember(Name="paymentMode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "paymentMode")]
    public List<PaymentPaymentMode> PaymentMode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class Payment {\n");
      sb.Append("  InstallmentsTerms: ").Append(InstallmentsTerms).Append("\n");
      sb.Append("  Bill: ").Append(Bill).Append("\n");
      sb.Append("  Installment: ").Append(Installment).Append("\n");
      sb.Append("  PaymentMode: ").Append(PaymentMode).Append("\n");
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
