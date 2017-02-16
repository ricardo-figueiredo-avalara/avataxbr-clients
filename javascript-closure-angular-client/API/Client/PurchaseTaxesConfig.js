goog.provide('API.Client.PurchaseTaxesConfig');

/**
 * @record
 */
API.Client.PurchaseTaxesConfig = function() {}

/**
 * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.entityAccruableCOFINSTaxation;

/**
 * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.entityAccruableCSLLTaxation;

/**
 * ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE=0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.entityAccruablePISTaxation;

/**
 * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.accruableCOFINSExempCodeTaxation;

/**
 * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code.
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.accruablePISExempCodeTaxation;

/**
 * When Code is 999 the user system need send the custom reason to Exemption
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.accruablePISExemptReasonTaxation;

/**
 * When Code is 999 the user system need send the custom reason to Exemption
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.accruableCOFINSExemptReasonTaxation;

/**
 * CSLL no withholding Custom Reason
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.accruableCSLLExemptReasonTaxation;

/**
 * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
 * @type {!boolean}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.withholdingPIS;

/**
 * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
 * @type {!boolean}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.withholdingCOFINS;

/**
 * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
 * @type {!boolean}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.withholdingCSLL;

/**
 * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
 * @type {!boolean}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.withholdingIRRF;

/**
 * COFINS no withholding Custom Reason
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.withholdCOFINSExemptReasonTaxation;

/**
 * CSLL no withholding Custom Reason
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.withholdCSLLExemptReasonTaxation;

/**
 * PIS no withholding Custom Reason
 * @type {!string}
 * @export
 */
API.Client.PurchaseTaxesConfig.prototype.withholdPISExemptReasonTaxation;

/** @enum {string} */
API.Client.PurchaseTaxesConfig.EntityAccruableCOFINSTaxationEnum = { 
  T: 'T',
  N: 'N',
  Z: 'Z',
  E: 'E',
  H: 'H',
  S: 'S',
}
/** @enum {string} */
API.Client.PurchaseTaxesConfig.EntityAccruableCSLLTaxationEnum = { 
  T: 'T',
  E: 'E',
}
/** @enum {string} */
API.Client.PurchaseTaxesConfig.EntityAccruablePISTaxationEnum = { 
  T: 'T',
  N: 'N',
  Z: 'Z',
  E: 'E',
  H: 'H',
  S: 'S',
}
