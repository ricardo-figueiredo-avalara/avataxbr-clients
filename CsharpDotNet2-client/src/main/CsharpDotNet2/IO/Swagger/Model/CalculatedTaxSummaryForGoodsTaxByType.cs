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
  public class CalculatedTaxSummaryForGoodsTaxByType {
    /// <summary>
    /// Gets or Sets Icms
    /// </summary>
    [DataMember(Name="icms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icms")]
    public TaxByTypeSummaryForGoods Icms { get; set; }

    /// <summary>
    /// Gets or Sets IcmsSt
    /// </summary>
    [DataMember(Name="icmsSt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsSt")]
    public TaxByTypeSummaryForGoods IcmsSt { get; set; }

    /// <summary>
    /// Gets or Sets IcmsStSd
    /// </summary>
    [DataMember(Name="icmsStSd", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsStSd")]
    public TaxByTypeSummaryForGoods IcmsStSd { get; set; }

    /// <summary>
    /// Gets or Sets IcmsPartOwn
    /// </summary>
    [DataMember(Name="icmsPartOwn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsPartOwn")]
    public TaxByTypeSummaryForGoods IcmsPartOwn { get; set; }

    /// <summary>
    /// Gets or Sets IcmsPartDest
    /// </summary>
    [DataMember(Name="icmsPartDest", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsPartDest")]
    public TaxByTypeSummaryForGoods IcmsPartDest { get; set; }

    /// <summary>
    /// Gets or Sets IcmsDifaFCP
    /// </summary>
    [DataMember(Name="icmsDifaFCP", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsDifaFCP")]
    public TaxByTypeSummaryForGoods IcmsDifaFCP { get; set; }

    /// <summary>
    /// Gets or Sets IcmsDifaDest
    /// </summary>
    [DataMember(Name="icmsDifaDest", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsDifaDest")]
    public TaxByTypeSummaryForGoods IcmsDifaDest { get; set; }

    /// <summary>
    /// Gets or Sets IcmsDifaRemet
    /// </summary>
    [DataMember(Name="icmsDifaRemet", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsDifaRemet")]
    public TaxByTypeSummaryForGoods IcmsDifaRemet { get; set; }

    /// <summary>
    /// Gets or Sets IcmsRf
    /// </summary>
    [DataMember(Name="icmsRf", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsRf")]
    public TaxByTypeSummaryForGoods IcmsRf { get; set; }

    /// <summary>
    /// Gets or Sets IcmsDeson
    /// </summary>
    [DataMember(Name="icmsDeson", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsDeson")]
    public TaxByTypeSummaryForGoods IcmsDeson { get; set; }

    /// <summary>
    /// Gets or Sets IcmsCredsn
    /// </summary>
    [DataMember(Name="icmsCredsn", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsCredsn")]
    public TaxByTypeSummaryForGoods IcmsCredsn { get; set; }

    /// <summary>
    /// Gets or Sets Pis
    /// </summary>
    [DataMember(Name="pis", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pis")]
    public TaxByTypeSummaryForGoods Pis { get; set; }

    /// <summary>
    /// Gets or Sets PisSt
    /// </summary>
    [DataMember(Name="pisSt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pisSt")]
    public TaxByTypeSummaryForGoods PisSt { get; set; }

    /// <summary>
    /// Gets or Sets Cofins
    /// </summary>
    [DataMember(Name="cofins", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofins")]
    public TaxByTypeSummaryForGoods Cofins { get; set; }

    /// <summary>
    /// Gets or Sets CofinsSt
    /// </summary>
    [DataMember(Name="cofinsSt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cofinsSt")]
    public TaxByTypeSummaryForGoods CofinsSt { get; set; }

    /// <summary>
    /// Gets or Sets Ipi
    /// </summary>
    [DataMember(Name="ipi", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ipi")]
    public TaxByTypeSummaryForGoods Ipi { get; set; }

    /// <summary>
    /// Gets or Sets IpiReturned
    /// </summary>
    [DataMember(Name="ipiReturned", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ipiReturned")]
    public TaxByTypeSummaryForGoods IpiReturned { get; set; }

    /// <summary>
    /// Gets or Sets Ii
    /// </summary>
    [DataMember(Name="ii", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ii")]
    public TaxByTypeSummaryForGoods Ii { get; set; }

    /// <summary>
    /// Gets or Sets Iof
    /// </summary>
    [DataMember(Name="iof", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "iof")]
    public TaxByTypeSummaryForGoods Iof { get; set; }

    /// <summary>
    /// Gets or Sets AproxtribState
    /// </summary>
    [DataMember(Name="aproxtribState", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aproxtribState")]
    public TaxByTypeSummaryForGoods AproxtribState { get; set; }

    /// <summary>
    /// Gets or Sets AproxtribFed
    /// </summary>
    [DataMember(Name="aproxtribFed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aproxtribFed")]
    public TaxByTypeSummaryForGoods AproxtribFed { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CalculatedTaxSummaryForGoodsTaxByType {\n");
      sb.Append("  Icms: ").Append(Icms).Append("\n");
      sb.Append("  IcmsSt: ").Append(IcmsSt).Append("\n");
      sb.Append("  IcmsStSd: ").Append(IcmsStSd).Append("\n");
      sb.Append("  IcmsPartOwn: ").Append(IcmsPartOwn).Append("\n");
      sb.Append("  IcmsPartDest: ").Append(IcmsPartDest).Append("\n");
      sb.Append("  IcmsDifaFCP: ").Append(IcmsDifaFCP).Append("\n");
      sb.Append("  IcmsDifaDest: ").Append(IcmsDifaDest).Append("\n");
      sb.Append("  IcmsDifaRemet: ").Append(IcmsDifaRemet).Append("\n");
      sb.Append("  IcmsRf: ").Append(IcmsRf).Append("\n");
      sb.Append("  IcmsDeson: ").Append(IcmsDeson).Append("\n");
      sb.Append("  IcmsCredsn: ").Append(IcmsCredsn).Append("\n");
      sb.Append("  Pis: ").Append(Pis).Append("\n");
      sb.Append("  PisSt: ").Append(PisSt).Append("\n");
      sb.Append("  Cofins: ").Append(Cofins).Append("\n");
      sb.Append("  CofinsSt: ").Append(CofinsSt).Append("\n");
      sb.Append("  Ipi: ").Append(Ipi).Append("\n");
      sb.Append("  IpiReturned: ").Append(IpiReturned).Append("\n");
      sb.Append("  Ii: ").Append(Ii).Append("\n");
      sb.Append("  Iof: ").Append(Iof).Append("\n");
      sb.Append("  AproxtribState: ").Append(AproxtribState).Append("\n");
      sb.Append("  AproxtribFed: ").Append(AproxtribFed).Append("\n");
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
