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
import org.joda.time.DateTime;

/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class InlineResponse2003 {
  @SerializedName("contingency")
  private Boolean contingency = null;

  @SerializedName("startDate")
  private DateTime startDate = null;

  @SerializedName("finishDate")
  private DateTime finishDate = null;

  public InlineResponse2003 contingency(Boolean contingency) {
    this.contingency = contingency;
    return this;
  }

   /**
   * Get contingency
   * @return contingency
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getContingency() {
    return contingency;
  }

  public void setContingency(Boolean contingency) {
    this.contingency = contingency;
  }

  public InlineResponse2003 startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public InlineResponse2003 finishDate(DateTime finishDate) {
    this.finishDate = finishDate;
    return this;
  }

   /**
   * Get finishDate
   * @return finishDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getFinishDate() {
    return finishDate;
  }

  public void setFinishDate(DateTime finishDate) {
    this.finishDate = finishDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.contingency, inlineResponse2003.contingency) &&
        Objects.equals(this.startDate, inlineResponse2003.startDate) &&
        Objects.equals(this.finishDate, inlineResponse2003.finishDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contingency, startDate, finishDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    contingency: ").append(toIndentedString(contingency)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
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

