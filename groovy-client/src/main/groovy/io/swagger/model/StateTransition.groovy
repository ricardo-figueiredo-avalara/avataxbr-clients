package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class StateTransition {

  /* - 'voided' - 'unvoided' - 'reconciled' - 'unreconciled' - 'filed' - 'unfiled' - 'filedByAvalara'  */
  String type = null

    String comment = null
  

}

