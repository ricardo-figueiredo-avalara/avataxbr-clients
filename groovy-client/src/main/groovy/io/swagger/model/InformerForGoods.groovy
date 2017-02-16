package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
import io.swagger.model.EntityInformerForGoods;
import io.swagger.model.HeaderForGoods;
import io.swagger.model.InformerForGoodsCsts;
import io.swagger.model.LineForGoods;
@Canonical
class InformerForGoods {

    HeaderForGoods header = null

    LineForGoods line = null

    EntityInformerForGoods company = null

    EntityInformerForGoods entity = null

    EntityInformerForGoods emitter = null

    EntityInformerForGoods receiver = null

    EntityInformerForGoods transporter = null

    InformerForGoodsCsts csts = null

    BigDecimal amount = null

    BigDecimal discount = null

    BigDecimal quantity = null

    BigDecimal unitPrice = null

    BigDecimal freightAmount = null

    BigDecimal insuranceAmount = null

    BigDecimal otherCostAmount = null

    BigDecimal exemptValue = null
  

}

