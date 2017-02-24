/*
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

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SefazInvoiceBasicStatus;
import org.joda.time.DateTime;

/**
 * SefazInvoiceStatus
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T19:47:57.099Z")
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
  private DateTime date = null;

  /**
   * - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
   */
  public enum EnvironmentEnum {
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("2")
    _2("2");

    private String value;

    EnvironmentEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("environment")
  private EnvironmentEnum environment = null;

  @SerializedName("appVersion")
  private String appVersion = null;

  public SefazInvoiceStatus code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SefazInvoiceStatus desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Get desc
   * @return desc
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SefazInvoiceStatus protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public SefazInvoiceStatus rec(String rec) {
    this.rec = rec;
    return this;
  }

   /**
   * Get rec
   * @return rec
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRec() {
    return rec;
  }

  public void setRec(String rec) {
    this.rec = rec;
  }

  public SefazInvoiceStatus date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public SefazInvoiceStatus environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

   /**
   * - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 
   * @return environment
  **/
  @ApiModelProperty(example = "null", value = "- '1' # Ambiente de Produção - '2' # Ambiente de Homologação ")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public SefazInvoiceStatus appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Get appVersion
   * @return appVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SefazInvoiceStatus sefazInvoiceStatus = (SefazInvoiceStatus) o;
    return Objects.equals(this.code, sefazInvoiceStatus.code) &&
        Objects.equals(this.desc, sefazInvoiceStatus.desc) &&
        Objects.equals(this.protocol, sefazInvoiceStatus.protocol) &&
        Objects.equals(this.rec, sefazInvoiceStatus.rec) &&
        Objects.equals(this.date, sefazInvoiceStatus.date) &&
        Objects.equals(this.environment, sefazInvoiceStatus.environment) &&
        Objects.equals(this.appVersion, sefazInvoiceStatus.appVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, desc, protocol, rec, date, environment, appVersion);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

