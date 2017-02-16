using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Using the placing reference in PCC for PIS (P), COFINS (C) and COFINS (C).  x &#x3D; tax is not subject to withholding.  - &#39;xxx&#39; - &#39;PCC&#39; - &#39;PCx&#39; - &#39;PxC&#39; - &#39;Pxx&#39; - &#39;xCC&#39; - &#39;xxC&#39; - &#39;xCx&#39; 
  /// </summary>
  [DataContract]
  public class WithholdingMode {

    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class WithholdingMode {\n");
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
