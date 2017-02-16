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
  public class CompanyConfiguration {
    /// <summary>
    /// digital certificate A1 model, p12, encoded by base64
    /// </summary>
    /// <value>digital certificate A1 model, p12, encoded by base64</value>
    [DataMember(Name="certificate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "certificate")]
    public string Certificate { get; set; }

    /// <summary>
    /// certificate password
    /// </summary>
    /// <value>certificate password</value>
    [DataMember(Name="certificatepwd", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "certificatepwd")]
    public string Certificatepwd { get; set; }

    /// <summary>
    /// expiration date of this certificate
    /// </summary>
    /// <value>expiration date of this certificate</value>
    [DataMember(Name="certificateexpiration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "certificateexpiration")]
    public DateTime? Certificateexpiration { get; set; }

    /// <summary>
    /// company logo image encoded by base64
    /// </summary>
    /// <value>company logo image encoded by base64</value>
    [DataMember(Name="logo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "logo")]
    public string Logo { get; set; }

    /// <summary>
    /// how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; 
    /// </summary>
    /// <value>how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; </value>
    [DataMember(Name="tpImpNFe", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tpImpNFe")]
    public string TpImpNFe { get; set; }

    /// <summary>
    /// how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
    /// </summary>
    /// <value>how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail </value>
    [DataMember(Name="tpImpNFCe", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "tpImpNFCe")]
    public string TpImpNFCe { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CompanyConfiguration {\n");
      sb.Append("  Certificate: ").Append(Certificate).Append("\n");
      sb.Append("  Certificatepwd: ").Append(Certificatepwd).Append("\n");
      sb.Append("  Certificateexpiration: ").Append(Certificateexpiration).Append("\n");
      sb.Append("  Logo: ").Append(Logo).Append("\n");
      sb.Append("  TpImpNFe: ").Append(TpImpNFe).Append("\n");
      sb.Append("  TpImpNFCe: ").Append(TpImpNFCe).Append("\n");
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
