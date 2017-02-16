/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import io.swagger.client.model.SefazInvoiceBasicStatus;
import java.util.Date;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class SefazInvoiceStatus {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("desc")
  private String desc = null;
  @SerializedName("protocol")
  private String protocol = null;
  @SerializedName("rec")
  private String rec = null;
  @SerializedName("date")
  private Date date = null;
  public enum EnvironmentEnum {
     1,  2, 
  };
  @SerializedName("environment")
  private EnvironmentEnum environment = null;
  @SerializedName("appVersion")
  private String appVersion = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDesc() {
    return desc;
  }
  public void setDesc(String desc) {
    this.desc = desc;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRec() {
    return rec;
  }
  public void setRec(String rec) {
    this.rec = rec;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
   **/
  @ApiModelProperty(value = "- '1' # Ambiente de Produção - '2' # Ambiente de Homologação ")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }
  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SefazInvoiceStatus sefazInvoiceStatus = (SefazInvoiceStatus) o;
    return (this.code == null ? sefazInvoiceStatus.code == null : this.code.equals(sefazInvoiceStatus.code)) &&
        (this.desc == null ? sefazInvoiceStatus.desc == null : this.desc.equals(sefazInvoiceStatus.desc)) &&
        (this.protocol == null ? sefazInvoiceStatus.protocol == null : this.protocol.equals(sefazInvoiceStatus.protocol)) &&
        (this.rec == null ? sefazInvoiceStatus.rec == null : this.rec.equals(sefazInvoiceStatus.rec)) &&
        (this.date == null ? sefazInvoiceStatus.date == null : this.date.equals(sefazInvoiceStatus.date)) &&
        (this.environment == null ? sefazInvoiceStatus.environment == null : this.environment.equals(sefazInvoiceStatus.environment)) &&
        (this.appVersion == null ? sefazInvoiceStatus.appVersion == null : this.appVersion.equals(sefazInvoiceStatus.appVersion));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.desc == null ? 0: this.desc.hashCode());
    result = 31 * result + (this.protocol == null ? 0: this.protocol.hashCode());
    result = 31 * result + (this.rec == null ? 0: this.rec.hashCode());
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.environment == null ? 0: this.environment.hashCode());
    result = 31 * result + (this.appVersion == null ? 0: this.appVersion.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SefazInvoiceStatus {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  desc: ").append(desc).append("\n");
    sb.append("  protocol: ").append(protocol).append("\n");
    sb.append("  rec: ").append(rec).append("\n");
    sb.append("  date: ").append(date).append("\n");
    sb.append("  environment: ").append(environment).append("\n");
    sb.append("  appVersion: ").append(appVersion).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}