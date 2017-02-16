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
  public class CompanyMailServer {
    /// <summary>
    /// User for login on email server
    /// </summary>
    /// <value>User for login on email server</value>
    [DataMember(Name="user", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user")]
    public string User { get; set; }

    /// <summary>
    /// Password to login on email server
    /// </summary>
    /// <value>Password to login on email server</value>
    [DataMember(Name="password", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "password")]
    public string Password { get; set; }

    /// <summary>
    /// smtp address to email server
    /// </summary>
    /// <value>smtp address to email server</value>
    [DataMember(Name="smtpAddress", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "smtpAddress")]
    public string SmtpAddress { get; set; }

    /// <summary>
    /// port
    /// </summary>
    /// <value>port</value>
    [DataMember(Name="port", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "port")]
    public int? Port { get; set; }

    /// <summary>
    /// email address to identify the sender e-mail, to send a XML and DANFE
    /// </summary>
    /// <value>email address to identify the sender e-mail, to send a XML and DANFE</value>
    [DataMember(Name="emailFrom", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "emailFrom")]
    public string EmailFrom { get; set; }

    /// <summary>
    /// protocol SSL or TLS
    /// </summary>
    /// <value>protocol SSL or TLS</value>
    [DataMember(Name="protocol", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "protocol")]
    public string Protocol { get; set; }

    /// <summary>
    /// Message to add to email body
    /// </summary>
    /// <value>Message to add to email body</value>
    [DataMember(Name="templatemessageToEmail", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "templatemessageToEmail")]
    public string TemplatemessageToEmail { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class CompanyMailServer {\n");
      sb.Append("  User: ").Append(User).Append("\n");
      sb.Append("  Password: ").Append(Password).Append("\n");
      sb.Append("  SmtpAddress: ").Append(SmtpAddress).Append("\n");
      sb.Append("  Port: ").Append(Port).Append("\n");
      sb.Append("  EmailFrom: ").Append(EmailFrom).Append("\n");
      sb.Append("  Protocol: ").Append(Protocol).Append("\n");
      sb.Append("  TemplatemessageToEmail: ").Append(TemplatemessageToEmail).Append("\n");
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
