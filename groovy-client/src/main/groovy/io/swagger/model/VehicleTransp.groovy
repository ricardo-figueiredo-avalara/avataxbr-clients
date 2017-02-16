package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.VehicleID;
import java.util.List;
@Canonical
class VehicleTransp {

    String type = null

    VehicleID automobile = null

  /* Trailer */
  List<VehicleID> trailer = new ArrayList<VehicleID>()

    String wagon = null

  /* Ferry */
  String ferry = null
  

}

