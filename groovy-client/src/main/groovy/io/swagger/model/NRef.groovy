package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.NRefRefECF;
import io.swagger.model.NRefRefFarmerNF;
import io.swagger.model.NRefRefNF;
@Canonical
class NRef {

    String type = null

    String refNFe = null

    String refCTe = null

    NRefRefECF refECF = null

    NRefRefNF refNF = null

    NRefRefFarmerNF refFarmerNF = null
  

}

