package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class NRef_refFarmerNF (
  stateCd: StateEnum,  // State code of fiscal Document creator, farmer
yymm: String,  // year and month of fiscal document creation
federalTaxId: String,  // fiscal document creator farmer federalTaxId
stateTaxId: String,  // fiscal document creator, farmer stateTaxId
model: String,  // Document Fiscal model - &#39;04&#39; # FARMER DOCUMENT - &#39;01&#39; # DETACHED DOCUMENT - AVULSO 
serie: String,  // fiscal document serie
number: String  // fiscal document number
)
