package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Error;
import java.util.List;
@Canonical
class ValidationError {

    String message = null

    List<Error> errors = new ArrayList<Error>()
  

}

