package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.SalesHeaderIn;
import io.swagger.model.SalesLinesIn;
import java.util.List;
@Canonical
class SalesTransactionIn {

    SalesHeaderIn header = null

    List<SalesLinesIn> lines = new ArrayList<SalesLinesIn>()
  

}

