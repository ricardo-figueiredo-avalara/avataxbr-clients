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
  public class NRefRefECF {
    /// <summary>
    /// ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
    /// </summary>
    /// <value>ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e </value>
    [DataMember(Name="nECF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nECF")]
    public string NECF { get; set; }

    /// <summary>
    /// Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
    /// </summary>
    /// <value>Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e </value>
    [DataMember(Name="nCOO", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nCOO")]
    public string NCOO { get; set; }

    /// <summary>
    /// Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
    /// </summary>
    /// <value>Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax </value>
    [DataMember(Name="modECF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "modECF")]
    public string ModECF { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class NRefRefECF {\n");
      sb.Append("  NECF: ").Append(NECF).Append("\n");
      sb.Append("  NCOO: ").Append(NCOO).Append("\n");
      sb.Append("  ModECF: ").Append(ModECF).Append("\n");
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
