goog.provide('API.Client.SalesTaxesConfig');

/**
 * @record
 */
API.Client.SalesTaxesConfig = function() {}

/**
 * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
 * @type {!string}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.accruableCOFINSTaxation;

/**
 * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
 * @type {!string}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.accruableCSLLTaxation;

/**
 * There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
 * @type {!string}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.accruablePISTaxation;

/**
 * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
 * @type {!string}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.accruableCOFINSExempCodeTaxation;

/**
 * This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
 * @type {!string}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.accruablePISExempCodeTaxation;

/**
 * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
 * @type {!boolean}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.withholdingCOFINS;

/**
 * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
 * @type {!boolean}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.withholdingCSLL;

/**
 * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
 * @type {!boolean}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.withholdingIRRF;

/**
 * Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
 * @type {!boolean}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.withholdingPIS;

/**
 * When property withholdingIRRF is false is mandatory inform the reason
 * @type {!string}
 * @export
 */
API.Client.SalesTaxesConfig.prototype.withholdIRRFExemptReasonTaxation;

/** @enum {string} */
API.Client.SalesTaxesConfig.AccruableCOFINSTaxationEnum = { 
  T: 'T',
  N: 'N',
  Z: 'Z',
  E: 'E',
  H: 'H',
  S: 'S',
}
/** @enum {string} */
API.Client.SalesTaxesConfig.AccruableCSLLTaxationEnum = { 
  T: 'T',
  E: 'E',
}
/** @enum {string} */
API.Client.SalesTaxesConfig.AccruablePISTaxationEnum = { 
  T: 'T',
  N: 'N',
  Z: 'Z',
  E: 'E',
  H: 'H',
  S: 'S',
}
