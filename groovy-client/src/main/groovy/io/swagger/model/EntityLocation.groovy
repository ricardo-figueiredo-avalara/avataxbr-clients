package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StateEnum;
@Canonical
class EntityLocation {

  /* Street Name */
  String street = null

  /* Neighborhood Name */
  String neighborhood = null

  /* Brazilian Zip Code */
  String zipcode = null

  /* City Code (IBGE) */
  String cityCode = null

  /* City Name */
  String cityName = null

    StateEnum state = null

  /* Country Code */
  String countryCode = "0"

  /* Use ISO 3166-1 alpha-3 codes */
  String country = "BRA"
  

}

