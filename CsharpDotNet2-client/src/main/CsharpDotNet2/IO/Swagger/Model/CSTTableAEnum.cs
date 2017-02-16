using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// Source of product or merchandise, - &#39;0&#39; # National goods - &#39;except those treated in codes 3,4, 5 and 8 - &#39;1&#39; # Imported directly by seller, except those in code 6 - &#39;2&#39; # Foreign goods - &#39;Acquired in the internal market (inside Brazil), except those in code 7 - &#39;3&#39; # Merchandise or goods with imported content above 40% and with less than or equal to 70% - &#39;4&#39; # National goods from production following &#39;standard basic processes&#39; as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - &#39;5&#39; # National goods - &#39;Merchandise or goods with imported content equal or below 40% - &#39;6&#39; # Foreign goods - &#39;Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - &#39;7&#39; # Foreign goods - &#39;Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - &#39;8&#39; # Merchandise or goods with imported content above 70% 
  /// </summary>
  [DataContract]
  public class CSTTableAEnum {

    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CSTTableAEnum {\n");
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
