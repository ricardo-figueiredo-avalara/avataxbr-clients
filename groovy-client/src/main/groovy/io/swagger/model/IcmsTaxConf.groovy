package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.IcmsTaxConfBase;
import io.swagger.model.StateEnum;
import java.util.List;
@Canonical
class IcmsTaxConf {

    StateEnum state = null

  /* On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED  */
  String icmsCST = null

  /* Message to add to NF when this configuration is used */
  String messageCode = null

  /* the mapping key is state code / A chave do mapeamento é o código do Estado. */
  List<IcmsTaxConfBase> relationShip = new ArrayList<IcmsTaxConfBase>()
  

}

