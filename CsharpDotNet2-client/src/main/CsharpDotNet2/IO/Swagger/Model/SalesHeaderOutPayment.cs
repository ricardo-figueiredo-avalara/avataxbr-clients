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
  public class SalesHeaderOutPayment {
    /// <summary>
    /// Gets or Sets Terms
    /// </summary>
    [DataMember(Name="terms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "terms")]
    public PaymentTerms Terms { get; set; }

    /// <summary>
    /// To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ...
    /// </summary>
    /// <value>To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ...</value>
    [DataMember(Name="withholdingMode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "withholdingMode")]
    public WithholdingMode WithholdingMode { get; set; }

    /// <summary>
    /// installments
    /// </summary>
    /// <value>installments</value>
    [DataMember(Name="installments", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "installments")]
    public List<InstallmentComplete> Installments { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SalesHeaderOutPayment {\n");
      sb.Append("  Terms: ").Append(Terms).Append("\n");
      sb.Append("  WithholdingMode: ").Append(WithholdingMode).Append("\n");
      sb.Append("  Installments: ").Append(Installments).Append("\n");
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
