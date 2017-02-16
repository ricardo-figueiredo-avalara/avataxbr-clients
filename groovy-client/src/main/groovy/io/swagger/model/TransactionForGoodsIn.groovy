package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HeaderForGoods;
import io.swagger.model.LineForGoods;
import java.util.List;
@Canonical
class TransactionForGoodsIn {

    HeaderForGoods header = null

    List<LineForGoods> lines = new ArrayList<LineForGoods>()
  

}

