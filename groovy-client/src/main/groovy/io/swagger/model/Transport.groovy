package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.TransportVolumes;
import io.swagger.model.VehicleTransp;
import java.util.List;
@Canonical
class Transport {

  /* Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - 'transporter' - 'withholdICMSTransport' - 'volumes' - 'vehicle'  */
  String modFreight = null

  /* Forces witholding of ICMS on transport amount (freight) */
  Boolean withholdICMSTransport = null

  /* Packages */
  List<TransportVolumes> volumes = new ArrayList<TransportVolumes>()

    VehicleTransp vehicle = null
  

}

