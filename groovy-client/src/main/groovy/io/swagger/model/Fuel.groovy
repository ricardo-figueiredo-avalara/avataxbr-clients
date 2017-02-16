package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FuelCide;
import io.swagger.model.FuelPumpNumber;
import io.swagger.model.StateEnum;
@Canonical
class Fuel {

    String prodANPCode = null

  /* percentage of natural gas (GLP) */
  Double perMixGN = null

    String authorizationCodeCODIF = null

  /* This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente.  */
  Double quantityOnRoomTemperature = null

  /* state where fuel was used */
  StateEnum stateCodeOfUndUser = null

    FuelCide cide = null

    FuelPumpNumber pumpNumber = null
  

}

