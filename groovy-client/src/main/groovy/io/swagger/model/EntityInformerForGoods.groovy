package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.EntityInformerForGoodsFederalTaxRegime;
import io.swagger.model.EntityType;
import io.swagger.model.FederalTaxRegime;
@Canonical
class EntityInformerForGoods {

    EntityType type = null

    FederalTaxRegime taxRegime = null

    EntityInformerForGoodsFederalTaxRegime federalTaxRegime = null

    String cityCode = null

    Address address = null

    Object details = null

    Boolean icmsTaxPayer = null
  

}

