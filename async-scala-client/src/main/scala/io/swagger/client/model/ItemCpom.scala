package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ItemCpom (
  companyId: UUID,  // Company ID
cityCode: String,  // IBGE city code
itemCode: String,  // ERP Code
code: String  // Code in City
)
