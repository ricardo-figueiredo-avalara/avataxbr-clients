package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PurchaseHeaderIn;
import io.swagger.model.PurchaseLinesIn;
import java.util.List;
@Canonical
class PurchaseTransactionIn {

    PurchaseHeaderIn header = null

    List<PurchaseLinesIn> lines = new ArrayList<PurchaseLinesIn>()
  

}

