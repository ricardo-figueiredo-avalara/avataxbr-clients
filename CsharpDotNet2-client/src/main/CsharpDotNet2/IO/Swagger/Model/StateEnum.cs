using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// State Abreviation: - &#39;AC&#39; - &#39;AL&#39; - &#39;AP&#39; - &#39;AM&#39; - &#39;BA&#39; - &#39;CE&#39; - &#39;DF&#39; - &#39;ES&#39; - &#39;GO&#39; - &#39;MA&#39; - &#39;MT&#39; - &#39;MS&#39; - &#39;MG&#39; - &#39;PA&#39; - &#39;PB&#39; - &#39;PR&#39; - &#39;PE&#39; - &#39;PI&#39; - &#39;RJ&#39; - &#39;RN&#39; - &#39;RS&#39; - &#39;RO&#39; - &#39;RR&#39; - &#39;SC&#39; - &#39;SP&#39; - &#39;SE&#39; - &#39;TO&#39; 
  /// </summary>
  [DataContract]
  public class StateEnum {

    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class StateEnum {\n");
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
