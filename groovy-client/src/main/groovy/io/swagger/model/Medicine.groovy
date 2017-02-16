package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
@Canonical
class Medicine {

    String loteNumber = null

  /* This is a decimal type with 11 digits including 3 decimal positions. */
  Double loteQuantity = null

    Date manufactotyDate = null

    Date expirationDate = null

  /* This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user. */
  Double maxValueToEndUser = null
  

}

