package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class NRef_refNF (
  stateCd: StateEnum,  // State code of fiscal Document creator
yymm: String,  // year and month of fiscal document creation
federalTaxId: String,  // fiscal document creator federalTaxId
serie: String,  // fiscal document serie
number: String  // fiscal document number
)
