package io.swagger.model;

import io.swagger.model.SefazInvoiceBasicStatus;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class SefazInvoiceStatus  {
  
  @ApiModelProperty(example = "null", value = "")
  private String code = null;
  @ApiModelProperty(example = "null", value = "")
  private String desc = null;
  @ApiModelProperty(example = "null", value = "")
  private String protocol = null;
  @ApiModelProperty(example = "null", value = "")
  private String rec = null;
  @ApiModelProperty(example = "null", value = "")
  private javax.xml.datatype.XMLGregorianCalendar date = null;

@XmlType(name="EnvironmentEnum")
@XmlEnum(String.class)
public enum EnvironmentEnum {

    @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2"));


    private String value;

    EnvironmentEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EnvironmentEnum fromValue(String v) {
        for (EnvironmentEnum b : EnvironmentEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- '1' # Ambiente de Produção - '2' # Ambiente de Homologação ")
  private EnvironmentEnum environment = null;
  @ApiModelProperty(example = "null", value = "")
  private String appVersion = null;

 /**
   * Get code
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * Get desc
   * @return desc
  **/
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }
 /**
   * Get protocol
   * @return protocol
  **/
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }
 /**
   * Get rec
   * @return rec
  **/
  public String getRec() {
    return rec;
  }
  public void setRec(String rec) {
    this.rec = rec;
  }
 /**
   * Get date
   * @return date
  **/
  public javax.xml.datatype.XMLGregorianCalendar getDate() {
    return date;
  }
  public void setDate(javax.xml.datatype.XMLGregorianCalendar date) {
    this.date = date;
  }
 /**
   * - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
   * @return environment
  **/
  public EnvironmentEnum getEnvironment() {
    return environment;
  }
  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }
 /**
   * Get appVersion
   * @return appVersion
  **/
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SefazInvoiceStatus {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    rec: ").append(toIndentedString(rec)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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

