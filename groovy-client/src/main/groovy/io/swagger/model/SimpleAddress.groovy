package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StateEnum;
@Canonical
class SimpleAddress {

  /* Address */
  String line1 = null

  /* Number */
  String line2 = null

  /* District */
  String line3 = null

    String city = null

  /* Brazilian Zip Code */
  String zipcode = null

    StateEnum state = null

  /* Use ISO 3166-1 alpha-3 codes */
  String country = "BRA"
  

}

