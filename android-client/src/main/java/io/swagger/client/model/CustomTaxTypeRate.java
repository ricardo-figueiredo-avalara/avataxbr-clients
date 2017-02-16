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

import io.swagger.client.model.TaxType;
import io.swagger.client.model.TaxTypeRate;
import io.swagger.client.model.TaxTypeRateWithholding;
import java.util.UUID;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CustomTaxTypeRate {
  
  @SerializedName("taxType")
  private TaxType taxType = null;
  public enum TaxModelEnum {
     rate,  srf, 
  };
  @SerializedName("taxModel")
  private TaxModelEnum taxModel = null;
  @SerializedName("rate")
  private Double rate = null;
  @SerializedName("srvAmount")
  private Double srvAmount = null;
  @SerializedName("quantityUnidBase")
  private String quantityUnidBase = null;
  public enum SpecializationTypeEnum {
     basic,  monophase,  taxSubstitution, 
  };
  @SerializedName("specializationType")
  private SpecializationTypeEnum specializationType = null;
  @SerializedName("exemptionReasonCode")
  private String exemptionReasonCode = null;
  @SerializedName("customExemptionReasonDescription")
  private String customExemptionReasonDescription = null;
  @SerializedName("withholding")
  private TaxTypeRateWithholding withholding = null;
  @SerializedName("companyId")
  private UUID companyId = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TaxType getTaxType() {
    return taxType;
  }
  public void setTaxType(TaxType taxType) {
    this.taxType = taxType;
  }

  /**
   * Tax can be calculated by rate or by quantity
   **/
  @ApiModelProperty(required = true, value = "Tax can be calculated by rate or by quantity")
  public TaxModelEnum getTaxModel() {
    return taxModel;
  }
  public void setTaxModel(TaxModelEnum taxModel) {
    this.taxModel = taxModel;
  }

  /**
   * Specific tax rate ex 3.5 (3.5%)
   **/
  @ApiModelProperty(value = "Specific tax rate ex 3.5 (3.5%)")
  public Double getRate() {
    return rate;
  }
  public void setRate(Double rate) {
    this.rate = rate;
  }

  /**
   * Specific tax rate ex 3.5 (3.5%)
   **/
  @ApiModelProperty(value = "Specific tax rate ex 3.5 (3.5%)")
  public Double getSrvAmount() {
    return srvAmount;
  }
  public void setSrvAmount(Double srvAmount) {
    this.srvAmount = srvAmount;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQuantityUnidBase() {
    return quantityUnidBase;
  }
  public void setQuantityUnidBase(String quantityUnidBase) {
    this.quantityUnidBase = quantityUnidBase;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public SpecializationTypeEnum getSpecializationType() {
    return specializationType;
  }
  public void setSpecializationType(SpecializationTypeEnum specializationType) {
    this.specializationType = specializationType;
  }

  /**
   * UUID Reference to an item in the LegalReason store. 
   **/
  @ApiModelProperty(value = "UUID Reference to an item in the LegalReason store. ")
  public String getExemptionReasonCode() {
    return exemptionReasonCode;
  }
  public void setExemptionReasonCode(String exemptionReasonCode) {
    this.exemptionReasonCode = exemptionReasonCode;
  }

  /**
   * Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 = Other). 
   **/
  @ApiModelProperty(value = "Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 = Other). ")
  public String getCustomExemptionReasonDescription() {
    return customExemptionReasonDescription;
  }
  public void setCustomExemptionReasonDescription(String customExemptionReasonDescription) {
    this.customExemptionReasonDescription = customExemptionReasonDescription;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public TaxTypeRateWithholding getWithholding() {
    return withholding;
  }
  public void setWithholding(TaxTypeRateWithholding withholding) {
    this.withholding = withholding;
  }

  /**
   * Company ID
   **/
  @ApiModelProperty(required = true, value = "Company ID")
  public UUID getCompanyId() {
    return companyId;
  }
  public void setCompanyId(UUID companyId) {
    this.companyId = companyId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomTaxTypeRate customTaxTypeRate = (CustomTaxTypeRate) o;
    return (this.taxType == null ? customTaxTypeRate.taxType == null : this.taxType.equals(customTaxTypeRate.taxType)) &&
        (this.taxModel == null ? customTaxTypeRate.taxModel == null : this.taxModel.equals(customTaxTypeRate.taxModel)) &&
        (this.rate == null ? customTaxTypeRate.rate == null : this.rate.equals(customTaxTypeRate.rate)) &&
        (this.srvAmount == null ? customTaxTypeRate.srvAmount == null : this.srvAmount.equals(customTaxTypeRate.srvAmount)) &&
        (this.quantityUnidBase == null ? customTaxTypeRate.quantityUnidBase == null : this.quantityUnidBase.equals(customTaxTypeRate.quantityUnidBase)) &&
        (this.specializationType == null ? customTaxTypeRate.specializationType == null : this.specializationType.equals(customTaxTypeRate.specializationType)) &&
        (this.exemptionReasonCode == null ? customTaxTypeRate.exemptionReasonCode == null : this.exemptionReasonCode.equals(customTaxTypeRate.exemptionReasonCode)) &&
        (this.customExemptionReasonDescription == null ? customTaxTypeRate.customExemptionReasonDescription == null : this.customExemptionReasonDescription.equals(customTaxTypeRate.customExemptionReasonDescription)) &&
        (this.withholding == null ? customTaxTypeRate.withholding == null : this.withholding.equals(customTaxTypeRate.withholding)) &&
        (this.companyId == null ? customTaxTypeRate.companyId == null : this.companyId.equals(customTaxTypeRate.companyId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.taxType == null ? 0: this.taxType.hashCode());
    result = 31 * result + (this.taxModel == null ? 0: this.taxModel.hashCode());
    result = 31 * result + (this.rate == null ? 0: this.rate.hashCode());
    result = 31 * result + (this.srvAmount == null ? 0: this.srvAmount.hashCode());
    result = 31 * result + (this.quantityUnidBase == null ? 0: this.quantityUnidBase.hashCode());
    result = 31 * result + (this.specializationType == null ? 0: this.specializationType.hashCode());
    result = 31 * result + (this.exemptionReasonCode == null ? 0: this.exemptionReasonCode.hashCode());
    result = 31 * result + (this.customExemptionReasonDescription == null ? 0: this.customExemptionReasonDescription.hashCode());
    result = 31 * result + (this.withholding == null ? 0: this.withholding.hashCode());
    result = 31 * result + (this.companyId == null ? 0: this.companyId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomTaxTypeRate {\n");
    
    sb.append("  taxType: ").append(taxType).append("\n");
    sb.append("  taxModel: ").append(taxModel).append("\n");
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("  srvAmount: ").append(srvAmount).append("\n");
    sb.append("  quantityUnidBase: ").append(quantityUnidBase).append("\n");
    sb.append("  specializationType: ").append(specializationType).append("\n");
    sb.append("  exemptionReasonCode: ").append(exemptionReasonCode).append("\n");
    sb.append("  customExemptionReasonDescription: ").append(customExemptionReasonDescription).append("\n");
    sb.append("  withholding: ").append(withholding).append("\n");
    sb.append("  companyId: ").append(companyId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}