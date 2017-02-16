package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesTaxByTypeDetail (
  locationType: Option[String],  // This string captures the applicable location type. Location used for calc. Buyer or Seller
jurisdictionName: Option[String],  // Jurisdiction used for calctax amount
jurisdictionType: Option[String],  // Type of jurisdiction - &#39;city&#39; - &#39;state&#39; - &#39;country&#39; 
taxType: Option[String],  // Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39; 
rateType: Option[String],  // Name of configuration rate
scenario: Option[String],  // This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
subtotalTaxable: Option[Double],  // This decimal captures how much of the lineAmount was taxable by this tax, calc base
subtotalExempt: Option[Double],  // This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.
rate: Option[Double],  // This decimal captures the tax rate for this tax.3.00 (3%)
tax: Option[Double],  // This decimal captures how much of the lineAmount was taxable by this tax
exemptionCode: Option[String],  // This string is required if is exempt
significantLocations: Option[List[String]],  // This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address
taxRuleType: Option[String]  // This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39; 
)
