package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Error {

    Integer code = null

    String message = null

    String field = null

    String value = null

    String in = null
  

}

