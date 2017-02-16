package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LineForGoods_adi (
  addNumber: Integer,  // aditional sequence number (1 to 100)
sequentialNumber: Integer,  // sequential item number for this adi, sequence number (1 to 999)
manufacturerCode: String,  // Manufatorer erp internal code
adiDiscount: Option[Double],  // This decimal 13 integers and 2 decimals, aditional adi discount
drawbackNumber: Option[String]  // Drawback number
)
