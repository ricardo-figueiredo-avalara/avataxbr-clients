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

import io.swagger.client.model.PaymentTaxByType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Structure with value for each tax withhold value of this line
 **/
@ApiModel(description = "Structure with value for each tax withhold value of this line")
public class PaymentCalculatedTax {
  
  @SerializedName("taxByType")
  private PaymentTaxByType taxByType = null;
  @SerializedName("tax")
  private Double tax = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public PaymentTaxByType getTaxByType() {
    return taxByType;
  }
  public void setTaxByType(PaymentTaxByType taxByType) {
    this.taxByType = taxByType;
  }

  /**
   * Sum of tax type not VAT (Value Added Tax)
   **/
  @ApiModelProperty(value = "Sum of tax type not VAT (Value Added Tax)")
  public Double getTax() {
    return tax;
  }
  public void setTax(Double tax) {
    this.tax = tax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCalculatedTax paymentCalculatedTax = (PaymentCalculatedTax) o;
    return (this.taxByType == null ? paymentCalculatedTax.taxByType == null : this.taxByType.equals(paymentCalculatedTax.taxByType)) &&
        (this.tax == null ? paymentCalculatedTax.tax == null : this.tax.equals(paymentCalculatedTax.tax));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.taxByType == null ? 0: this.taxByType.hashCode());
    result = 31 * result + (this.tax == null ? 0: this.tax.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCalculatedTax {\n");
    
    sb.append("  taxByType: ").append(taxByType).append("\n");
    sb.append("  tax: ").append(tax).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}