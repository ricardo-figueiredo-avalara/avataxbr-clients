package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Transport (
  modFreight: String,  // Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - &#39;transporter&#39; - &#39;withholdICMSTransport&#39; - &#39;volumes&#39; - &#39;vehicle&#39; 
withholdICMSTransport: Option[Boolean],  // Forces witholding of ICMS on transport amount (freight)
volumes: Option[List[Transport_volumes]],  // Packages
vehicle: Option[VehicleTransp]
)
