package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Weapon {

  /* - '0' # restrict use - '1' # public use  */
  String weaponRestrictionType = null

    String serieNumber = null

  /* Barrel's serial number. Número de série do cano  */
  String gunBarrelSerieNumber = null

  /* weapon description */
  String weaponDescription = null
  

}

