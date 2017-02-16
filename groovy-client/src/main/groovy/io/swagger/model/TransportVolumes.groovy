package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class TransportVolumes {

  /* Quantity of packages transported */
  String qVol = null

  /* package type */
  String specie = null

  /* brand */
  String brand = null

  /* packages numeration */
  String volumeNumeration = null

  /* net weight using Kg */
  Double netWeight = null

  /* gross weight using Kg */
  Double grossWeight = null

    List<String> seal = new ArrayList<String>()
  

}

