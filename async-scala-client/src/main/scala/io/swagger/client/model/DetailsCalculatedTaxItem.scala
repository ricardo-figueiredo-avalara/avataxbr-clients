package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class DetailsCalculatedTaxItem (
  locationType: Option[String],  // This string captures the applicable location type. Location used for calc. Buyer or Seller
jurisdictionName: Option[String],  // Jurisdiction used for calctax amount
jurisdictionType: Option[String],  // Type of jurisdiction
taxType: Option[String],  // Tax identificator
rateType: Option[String],  // Name of configuration rate
scenario: Option[String],  // This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
subtotalTaxable: Option[Double],  // This decimal captures how much of the lineAmount was taxable by this tax, calc base
rate: Option[Double],  // This decimal captures the tax rate for this tax.3.00 (3%)
tax: Option[Double],  // This decimal captures how much of the lineAmount was taxable by this tax
exemptionCode: Option[String],  // This string is required if is exempt
significantLocations: Option[List[String]],  // This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address
taxRuleType: Option[String],  // This string with type of rule
source: Option[Integer],
cstB: Option[String],
modBC: Option[String],
cst: Option[String]
)
