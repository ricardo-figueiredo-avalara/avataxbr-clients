package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StateEnum;
@Canonical
class VehicleID {

    String licensePlate = null

    StateEnum stateCode = null

  /* Cargo Transport National Register, Registro Nacional de Transportador de Carga (ANTT) */
  String rtnc = null
  

}

