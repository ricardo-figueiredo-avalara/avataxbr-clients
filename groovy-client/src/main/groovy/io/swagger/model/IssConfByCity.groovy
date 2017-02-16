package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.IssConfServiceList;
import io.swagger.model.StateEnum;
import java.util.List;
@Canonical
class IssConfByCity {

  /* City Code (IBGE) */
  Long cityCode = null

    String name = null

    StateEnum state = null

    Boolean issWhDestOtherCities = null

    Boolean issWhDestSameCity = null

    Boolean issWhOriginUnregSeller = null

    List<IssConfServiceList> serviceList = new ArrayList<IssConfServiceList>()
  

}

