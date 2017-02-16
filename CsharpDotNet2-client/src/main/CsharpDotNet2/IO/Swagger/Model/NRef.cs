using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Referenced Invoices The invoice can be one of this types, - &#39;refNFe - Eletronic Invoice&#39; - &#39;refCTE - Transport Invoice&#39; - &#39;refECF - Reatail Cupom&#39; - &#39;refNF  - Invoice model 1 or 1A&#39; - &#39;refFarmerNF - farmer invoice&#39; 
  /// </summary>
  [DataContract]
  public class NRef {
    /// <summary>
    /// Gets or Sets Type
    /// </summary>
    [DataMember(Name="type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "type")]
    public string Type { get; set; }

    /// <summary>
    /// Gets or Sets RefNFe
    /// </summary>
    [DataMember(Name="refNFe", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "refNFe")]
    public string RefNFe { get; set; }

    /// <summary>
    /// Gets or Sets RefCTe
    /// </summary>
    [DataMember(Name="refCTe", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "refCTe")]
    public string RefCTe { get; set; }

    /// <summary>
    /// Gets or Sets RefECF
    /// </summary>
    [DataMember(Name="refECF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "refECF")]
    public NRefRefECF RefECF { get; set; }

    /// <summary>
    /// Gets or Sets RefNF
    /// </summary>
    [DataMember(Name="refNF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "refNF")]
    public NRefRefNF RefNF { get; set; }

    /// <summary>
    /// Gets or Sets RefFarmerNF
    /// </summary>
    [DataMember(Name="refFarmerNF", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "refFarmerNF")]
    public NRefRefFarmerNF RefFarmerNF { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class NRef {\n");
      sb.Append("  Type: ").Append(Type).Append("\n");
      sb.Append("  RefNFe: ").Append(RefNFe).Append("\n");
      sb.Append("  RefCTe: ").Append(RefCTe).Append("\n");
      sb.Append("  RefECF: ").Append(RefECF).Append("\n");
      sb.Append("  RefNF: ").Append(RefNF).Append("\n");
      sb.Append("  RefFarmerNF: ").Append(RefFarmerNF).Append("\n");
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
