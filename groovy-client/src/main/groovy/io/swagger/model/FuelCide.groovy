package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FuelCide {

  /* percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals */
  Double baseCalcCIDE = null

  /* percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$ */
  Double rateCIDE = null

  /* percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$ */
  Double valueCIDE = null
  

}

