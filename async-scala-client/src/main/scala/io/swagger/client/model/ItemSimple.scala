package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ItemSimple (
  companyId: UUID,  // Company ID
code: String,  // ERP Code
agast: String,  // Agast Code
description: Option[String]  // Item Description
)
