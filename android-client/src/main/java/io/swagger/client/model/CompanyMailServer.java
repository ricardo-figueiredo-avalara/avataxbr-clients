/**
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CompanyMailServer {
  
  @SerializedName("user")
  private String user = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("smtpAddress")
  private String smtpAddress = null;
  @SerializedName("port")
  private Integer port = null;
  @SerializedName("emailFrom")
  private String emailFrom = null;
  public enum ProtocolEnum {
     ssl,  tls, 
  };
  @SerializedName("protocol")
  private ProtocolEnum protocol = null;
  @SerializedName("templatemessageToEmail")
  private String templatemessageToEmail = null;

  /**
   * User for login on email server
   **/
  @ApiModelProperty(value = "User for login on email server")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   * Password to login on email server
   **/
  @ApiModelProperty(value = "Password to login on email server")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * smtp address to email server
   **/
  @ApiModelProperty(value = "smtp address to email server")
  public String getSmtpAddress() {
    return smtpAddress;
  }
  public void setSmtpAddress(String smtpAddress) {
    this.smtpAddress = smtpAddress;
  }

  /**
   * port
   **/
  @ApiModelProperty(value = "port")
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }

  /**
   * email address to identify the sender e-mail, to send a XML and DANFE
   **/
  @ApiModelProperty(value = "email address to identify the sender e-mail, to send a XML and DANFE")
  public String getEmailFrom() {
    return emailFrom;
  }
  public void setEmailFrom(String emailFrom) {
    this.emailFrom = emailFrom;
  }

  /**
   * protocol SSL or TLS
   **/
  @ApiModelProperty(value = "protocol SSL or TLS")
  public ProtocolEnum getProtocol() {
    return protocol;
  }
  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  /**
   * Message to add to email body
   **/
  @ApiModelProperty(value = "Message to add to email body")
  public String getTemplatemessageToEmail() {
    return templatemessageToEmail;
  }
  public void setTemplatemessageToEmail(String templatemessageToEmail) {
    this.templatemessageToEmail = templatemessageToEmail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyMailServer companyMailServer = (CompanyMailServer) o;
    return (this.user == null ? companyMailServer.user == null : this.user.equals(companyMailServer.user)) &&
        (this.password == null ? companyMailServer.password == null : this.password.equals(companyMailServer.password)) &&
        (this.smtpAddress == null ? companyMailServer.smtpAddress == null : this.smtpAddress.equals(companyMailServer.smtpAddress)) &&
        (this.port == null ? companyMailServer.port == null : this.port.equals(companyMailServer.port)) &&
        (this.emailFrom == null ? companyMailServer.emailFrom == null : this.emailFrom.equals(companyMailServer.emailFrom)) &&
        (this.protocol == null ? companyMailServer.protocol == null : this.protocol.equals(companyMailServer.protocol)) &&
        (this.templatemessageToEmail == null ? companyMailServer.templatemessageToEmail == null : this.templatemessageToEmail.equals(companyMailServer.templatemessageToEmail));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.user == null ? 0: this.user.hashCode());
    result = 31 * result + (this.password == null ? 0: this.password.hashCode());
    result = 31 * result + (this.smtpAddress == null ? 0: this.smtpAddress.hashCode());
    result = 31 * result + (this.port == null ? 0: this.port.hashCode());
    result = 31 * result + (this.emailFrom == null ? 0: this.emailFrom.hashCode());
    result = 31 * result + (this.protocol == null ? 0: this.protocol.hashCode());
    result = 31 * result + (this.templatemessageToEmail == null ? 0: this.templatemessageToEmail.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyMailServer {\n");
    
    sb.append("  user: ").append(user).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  smtpAddress: ").append(smtpAddress).append("\n");
    sb.append("  port: ").append(port).append("\n");
    sb.append("  emailFrom: ").append(emailFrom).append("\n");
    sb.append("  protocol: ").append(protocol).append("\n");
    sb.append("  templatemessageToEmail: ").append(templatemessageToEmail).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
