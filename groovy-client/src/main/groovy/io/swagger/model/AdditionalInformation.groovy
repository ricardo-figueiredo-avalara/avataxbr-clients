package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AdditionalInformationProcRef;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class AdditionalInformation {

  /* Additional information of fiscal interest */
  String fiscalInfo = null

  /* Additional information of user interest */
  String complementaryInfo = null

  /* Referenced Process */
  List<AdditionalInformationProcRef> procRef = new ArrayList<AdditionalInformationProcRef>()
  

}

