package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LineForGoods_indExport (
  registerNumber: String,  // Exportation register number
accessKey: String,  // invoice access key received to export
quantity: Double  // This decimal 11 integers and 0 to 4 decimals, quantity exported in real
)
