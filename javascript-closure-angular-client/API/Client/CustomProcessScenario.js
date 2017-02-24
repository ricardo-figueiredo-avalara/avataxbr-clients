goog.provide('API.Client.CustomProcessScenario');

/**
 * @record
 */
API.Client.CustomProcessScenario = function() {}

/**
 * Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.code;

/**
 * Inform that the process has inventory impact.
 * @type {!boolean}
 * @export
 */
API.Client.CustomProcessScenario.prototype.stockImpact;

/**
 * Inform that the process has financial impact.
 * @type {!boolean}
 * @export
 */
API.Client.CustomProcessScenario.prototype.financialImpact;

/**
 * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.cstIPI;

/**
 * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.ipiLegalTaxClass;

/**
 * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.accruablePISTaxation;

/**
 * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.pisExemptLegalReasonCode;

/**
 * When specifi reason, this field has the description
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.pisExemptLegalReason;

/**
 * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.accruableCOFINSTaxation;

/**
 * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.cofinsExemptLegalReasonCode;

/**
 * When specifi reason, this field has the description
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.cofinsExemptLegalReason;

/**
 * Inform that the process allow IPI credit to Input process
 * @type {!boolean}
 * @export
 */
API.Client.CustomProcessScenario.prototype.allowIPIcreditWhenInGoing;

/**
 * the map key is state code
 * @type {!Array<!API.Client.IcmsTaxConf>}
 * @export
 */
API.Client.CustomProcessScenario.prototype.icmsConf;

/**
 * Process name to Identify this configuration
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.type;

/**
 * inform if the transaction is an operation to internalizing (receive) item or value
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.wayType;

/**
 * @type {!string}
 * @export
 */
API.Client.CustomProcessScenario.prototype.goal;

/**
 * inform that the configuration process overwrites the cfop configuration.
 * @type {!boolean}
 * @export
 */
API.Client.CustomProcessScenario.prototype.overWriteCFOP;

/**
 * @type {!Array<!API.Client.CfopConf>}
 * @export
 */
API.Client.CustomProcessScenario.prototype.cfops;

/**
 * Company ID
 * @type {!API.Client.UUID}
 * @export
 */
API.Client.CustomProcessScenario.prototype.companyId;

/** @enum {string} */
API.Client.CustomProcessScenario.CstIPIEnum = { 
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
API.Client.CustomProcessScenario.AccruablePISTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
  O: 'O',
  OZ: 'OZ',
}
/** @enum {string} */
API.Client.CustomProcessScenario.AccruableCOFINSTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
  O: 'O',
  OZ: 'OZ',
}
/** @enum {string} */
API.Client.CustomProcessScenario.TypeEnum = { 
  SALES: 'SALES',
  PURCHASE: 'PURCHASE',
  SALES_RETURN: 'SALES_RETURN',
  PURCHASE_RETURN: 'PURCHASE_RETURN',
  TRANSFER_RETURN: 'TRANSFER_RETURN',
  SHIPPING: 'SHIPPING',
  SHIPPING_RETURN: 'SHIPPING_RETURN',
  TRANSFER: 'TRANSFER',
  RECEIPT_AJUSTE: 'RECEIPT_AJUSTE',
  TRANSFER_AJUSTE: 'TRANSFER_AJUSTE',
}
/** @enum {string} */
API.Client.CustomProcessScenario.WayTypeEnum = { 
  in: 'in',
  out: 'out',
}
/** @enum {string} */
API.Client.CustomProcessScenario.GoalEnum = { 
  Normal: 'Normal',
  Complementary: 'Complementary',
  Voided: 'Voided',
  Replacement: 'Replacement',
  Return: 'Return',
  Adjustment: 'Adjustment',
}
