package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.DetailsCalculatedTaxItem;
import io.swagger.model.LineForGoodsCalculatedTaxTaxByType;
import java.util.List;
@Canonical
class LineForGoodsCalculatedTax {

    LineForGoodsCalculatedTaxTaxByType taxByType = null

    Double tax = null

    List<DetailsCalculatedTaxItem> details = new ArrayList<DetailsCalculatedTaxItem>()
  

}

