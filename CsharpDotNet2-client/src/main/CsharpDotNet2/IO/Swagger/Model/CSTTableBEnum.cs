using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - &#39;00&#39; # Taxed in its totality - &#39;10&#39; # Taxed and subject to tax substitution (ICMS ST) - &#39;20&#39; # Taxed with Tax Base Reduction - &#39;30&#39; # Exempt /Not Taxed and subject to tax Substitution (ICMS#ST) - &#39;40&#39; # Tax Exempt - &#39;41&#39; # Not Taxed - &#39;50&#39; # Taxes Suspended - &#39;51&#39; # Taxes Diferred - &#39;60&#39; # ICMS Tax already collected through Substituition (ICMS ST) - &#39;70&#39; # Taxed with Tax Base Reduction and subject to Tax Subsititution (ICMS ST) - &#39;90&#39; # Others 
  /// </summary>
  [DataContract]
  public class CSTTableBEnum {

    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CSTTableBEnum {\n");
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
