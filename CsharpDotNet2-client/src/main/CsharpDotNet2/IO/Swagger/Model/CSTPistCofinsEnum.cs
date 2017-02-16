using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - &#39;01&#39; # Operação Tributável com Alíquota Básica - &#39;02&#39; # Operação Tributável com Alíquota Diferenciada - &#39;03&#39; # Operação Tributável com Alíquota por Unidade de Medida de Produto - &#39;04&#39; # Operação Tributável Monofásica - &#39;Revenda a Alíquota Zero - &#39;05&#39; # Operação Tributável por Substituição Tributária - &#39;06&#39; # Operação Tributável a Alíquota Zero - &#39;07&#39; # Operação Isenta da Contribuição - &#39;08&#39; # Operação sem Incidência da Contribuição - &#39;09&#39; # Operação com Suspensão da Contribuição - &#39;49&#39; # Outras Operações de Saída - &#39;50&#39; # Operação com Direito a Crédito - &#39;Vinculada Exclusivamente a Receita Tributada no Mercado Interno - &#39;51&#39; # Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno - &#39;52&#39; # Operação com Direito a Crédito - &#39;Vinculada Exclusivamente a Receita de Exportação - &#39;53&#39; # Operação com Direito a Crédito - &#39;Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - &#39;54&#39; # Operação com Direito a Crédito - &#39;Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - &#39;55&#39; # Operação com Direito a Crédito - &#39;Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - &#39;56&#39; # Operação com Direito a Crédito - &#39;Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - &#39;60&#39; # Crédito Presumido - &#39;Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno - &#39;61&#39; # Crédito Presumido - &#39;Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno - &#39;62&#39; # Crédito Presumido - &#39;Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação - &#39;63&#39; # Crédito Presumido - &#39;Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - &#39;64&#39; # Crédito Presumido - &#39;Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - &#39;65&#39; # Crédito Presumido - &#39;Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - &#39;66&#39; # Crédito Presumido - &#39;Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - &#39;67&#39; # Crédito Presumido - &#39;Outras Operações - &#39;70&#39; # Operação de Aquisição sem Direito a Crédito - &#39;71&#39; # Operação de Aquisição com Isenção - &#39;72&#39; # Operação de Aquisição com Suspensão - &#39;73&#39; # Operação de Aquisição a Alíquota Zero - &#39;74&#39; # Operação de Aquisição sem Incidência da Contribuição - &#39;75&#39; # Operação de Aquisição por Substituição Tributária - &#39;98&#39; # Outras Operações de Entrada - &#39;99&#39; # Outras Operações 
  /// </summary>
  [DataContract]
  public class CSTPistCofinsEnum {

    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CSTPistCofinsEnum {\n");
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
