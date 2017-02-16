package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class CompanyMailServer  {
  
  @ApiModelProperty(example = "null", value = "User for login on email server")
  private String user = null;
  @ApiModelProperty(example = "null", value = "Password to login on email server")
  private String password = null;
  @ApiModelProperty(example = "null", value = "smtp address to email server")
  private String smtpAddress = null;
  @ApiModelProperty(example = "null", value = "port")
  private Integer port = null;
  @ApiModelProperty(example = "null", value = "email address to identify the sender e-mail, to send a XML and DANFE")
  private String emailFrom = null;

@XmlType(name="ProtocolEnum")
@XmlEnum(String.class)
public enum ProtocolEnum {

    @XmlEnumValue("ssl") SSL(String.valueOf("ssl")), @XmlEnumValue("tls") TLS(String.valueOf("tls"));


    private String value;

    ProtocolEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProtocolEnum fromValue(String v) {
        for (ProtocolEnum b : ProtocolEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "protocol SSL or TLS")
  private ProtocolEnum protocol = null;
  @ApiModelProperty(example = "null", value = "Message to add to email body")
  private String templatemessageToEmail = null;

 /**
   * User for login on email server
   * @return user
  **/
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }
 /**
   * Password to login on email server
   * @return password
  **/
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
 /**
   * smtp address to email server
   * @return smtpAddress
  **/
  public String getSmtpAddress() {
    return smtpAddress;
  }
  public void setSmtpAddress(String smtpAddress) {
    this.smtpAddress = smtpAddress;
  }
 /**
   * port
   * @return port
  **/
  public Integer getPort() {
    return port;
  }
  public void setPort(Integer port) {
    this.port = port;
  }
 /**
   * email address to identify the sender e-mail, to send a XML and DANFE
   * @return emailFrom
  **/
  public String getEmailFrom() {
    return emailFrom;
  }
  public void setEmailFrom(String emailFrom) {
    this.emailFrom = emailFrom;
  }
 /**
   * protocol SSL or TLS
   * @return protocol
  **/
  public ProtocolEnum getProtocol() {
    return protocol;
  }
  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }
 /**
   * Message to add to email body
   * @return templatemessageToEmail
  **/
  public String getTemplatemessageToEmail() {
    return templatemessageToEmail;
  }
  public void setTemplatemessageToEmail(String templatemessageToEmail) {
    this.templatemessageToEmail = templatemessageToEmail;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyMailServer {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    smtpAddress: ").append(toIndentedString(smtpAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    emailFrom: ").append(toIndentedString(emailFrom)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    templatemessageToEmail: ").append(toIndentedString(templatemessageToEmail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

