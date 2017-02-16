package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ServiceItemTaxRatePeriod;
@Canonical
class ServiceItemTaxRate {

    String taxType = null

    String rateType = null

    Double rate = null

    Boolean isExempt = null

    Double discount = null

    Integer zone1 = null

    Integer zone2 = null

    ServiceItemTaxRatePeriod period = null

    String reason = null

    String message = null
  

}

