package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StateEnum;
@Canonical
class IpbtConfItem {

    StateEnum state = null

    Double federalTax = null

    Double importTax = null

    Double stateTax = null

    Double cityTax = null

    String source = null
  

}

