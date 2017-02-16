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
  public class AgastExtendForSefaz {
    /// <summary>
    /// harmonized code, NCM or LC 116
    /// </summary>
    /// <value>harmonized code, NCM or LC 116</value>
    [DataMember(Name="hsCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hsCode")]
    public string HsCode { get; set; }

    /// <summary>
    /// hsCode Exception for IPI tax
    /// </summary>
    /// <value>hsCode Exception for IPI tax</value>
    [DataMember(Name="ex", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ex")]
    public int? Ex { get; set; }

    /// <summary>
    /// tax substitution code - Codigo especificador da Substuicao Tributaria
    /// </summary>
    /// <value>tax substitution code - Codigo especificador da Substuicao Tributaria</value>
    [DataMember(Name="cest", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cest")]
    public string Cest { get; set; }

    /// <summary>
    /// GTIN NUMBER
    /// </summary>
    /// <value>GTIN NUMBER</value>
    [DataMember(Name="cean", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cean")]
    public string Cean { get; set; }

    /// <summary>
    /// Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
    /// </summary>
    /// <value>Nomenclatura de Valor aduaneio e Estatístico - NCM extension code</value>
    [DataMember(Name="nve", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nve")]
    public string Nve { get; set; }

    /// <summary>
    /// Sales Unit
    /// </summary>
    /// <value>Sales Unit</value>
    [DataMember(Name="unit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "unit")]
    public string Unit { get; set; }

    /// <summary>
    /// Sales Taxable Unit
    /// </summary>
    /// <value>Sales Taxable Unit</value>
    [DataMember(Name="unitTaxable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "unitTaxable")]
    public string UnitTaxable { get; set; }

    /// <summary>
    /// Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
    /// </summary>
    /// <value>Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)</value>
    [DataMember(Name="nFCI", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nFCI")]
    public string NFCI { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AgastExtendForSefaz {\n");
      sb.Append("  HsCode: ").Append(HsCode).Append("\n");
      sb.Append("  Ex: ").Append(Ex).Append("\n");
      sb.Append("  Cest: ").Append(Cest).Append("\n");
      sb.Append("  Cean: ").Append(Cean).Append("\n");
      sb.Append("  Nve: ").Append(Nve).Append("\n");
      sb.Append("  Unit: ").Append(Unit).Append("\n");
      sb.Append("  UnitTaxable: ").Append(UnitTaxable).Append("\n");
      sb.Append("  NFCI: ").Append(NFCI).Append("\n");
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
