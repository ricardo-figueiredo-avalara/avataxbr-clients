package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StateEnum;
@Canonical
class ExportInfo {

  /* shipping state */
  StateEnum shippingState = null

  /* shipping place */
  String place = null

  /* description of shipping place */
  String placeDescription = null
  

}

