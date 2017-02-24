goog.provide('API.Client.CfopConf');

/**
 * @record
 */
API.Client.CfopConf = function() {}

/**
 * main unique identificator
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.code;

/**
 * Inform that the process has inventory impact.
 * @type {!boolean}
 * @export
 */
API.Client.CfopConf.prototype.stockImpact;

/**
 * Inform that the process has financial impact.
 * @type {!boolean}
 * @export
 */
API.Client.CfopConf.prototype.financialImpact;

/**
 * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.cstIPI;

/**
 * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.ipiLegalTaxClass;

/**
 * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.accruablePISTaxation;

/**
 * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.pisExemptLegalReasonCode;

/**
 * When specifi reason, this field has the description
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.pisExemptLegalReason;

/**
 * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.accruableCOFINSTaxation;

/**
 * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.cofinsExemptLegalReasonCode;

/**
 * When specifi reason, this field has the description
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.cofinsExemptLegalReason;

/**
 * Inform that the process allow IPI credit to Input process
 * @type {!boolean}
 * @export
 */
API.Client.CfopConf.prototype.allowIPIcreditWhenInGoing;

/**
 * the map key is state code
 * @type {!Array<!API.Client.IcmsTaxConf>}
 * @export
 */
API.Client.CfopConf.prototype.icmsConf;

/**
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.description;

/**
 * inform if the transaction is an operation to internalizing item or value
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.wayType;

/**
 * CFOP code (tax code operation) when the transactions are within the same state.
 * @type {!number}
 * @export
 */
API.Client.CfopConf.prototype.codInState;

/**
 * CFOP code (tax code operation) when the transactions are to another state.
 * @type {!number}
 * @export
 */
API.Client.CfopConf.prototype.codOtherState;

/**
 * CFOP code (tax code operation) when the transactions are to another country.
 * @type {!number}
 * @export
 */
API.Client.CfopConf.prototype.codOtherCountry;

/**
 * @type {!API.Client.CstIcmsEnum}
 * @export
 */
API.Client.CfopConf.prototype.cstICMSSameState;

/**
 * @type {!API.Client.CstIcmsEnum}
 * @export
 */
API.Client.CfopConf.prototype.cstICMSOtherState;

/**
 * @type {!API.Client.CstIcmsEnum}
 * @export
 */
API.Client.CfopConf.prototype.cstICMSOtherCountry;

/**
 * this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.productType;

/**
 * field used to indicate an operation to ICMS tax payer
 * @type {!boolean}
 * @export
 */
API.Client.CfopConf.prototype.operationToTaxPayerOtherState;

/**
 * field used to indicate an operation to items sibject to ICMS-ST
 * @type {!boolean}
 * @export
 */
API.Client.CfopConf.prototype.operationWithST;

/**
 * field used to indicate an operation to free zone
 * @type {!boolean}
 * @export
 */
API.Client.CfopConf.prototype.operationToFreeZone;

/**
 * field used to indicate an operation to some product class specifically
 * @type {!string}
 * @export
 */
API.Client.CfopConf.prototype.specificForProductClass;

/** @enum {string} */
API.Client.CfopConf.CstIPIEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
  I: 'I',
  O: 'O',
  OZ: 'OZ',
}
/** @enum {string} */
API.Client.CfopConf.AccruablePISTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
  O: 'O',
  OZ: 'OZ',
}
/** @enum {string} */
API.Client.CfopConf.AccruableCOFINSTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
  O: 'O',
  OZ: 'OZ',
}
/** @enum {string} */
API.Client.CfopConf.WayTypeEnum = { 
  in: 'in',
  out: 'out',
}
/** @enum {string} */
API.Client.CfopConf.ProductTypeEnum = { 
  FOR PRODUCT: 'FOR PRODUCT',
  FOR MERCHANDISE: 'FOR MERCHANDISE',
  NO RESTRICTION: 'NO RESTRICTION',
}
/** @enum {string} */
API.Client.CfopConf.SpecificForProductClassEnum = { 
  OTHERS: 'OTHERS',
  COMMUNICATION: 'COMMUNICATION',
  ENERGY: 'ENERGY',
  TRANSPORT: 'TRANSPORT',
  FUEL AND LUBRIFICANT: 'FUEL AND LUBRIFICANT',
  VEHICLE: 'VEHICLE',
  ALCOHOLIC BEVERAGES: 'ALCOHOLIC BEVERAGES',
  WEAPONS: 'WEAPONS',
  AMMO: 'AMMO',
  PERFUM: 'PERFUM',
  TOBACCO: 'TOBACCO',
}
