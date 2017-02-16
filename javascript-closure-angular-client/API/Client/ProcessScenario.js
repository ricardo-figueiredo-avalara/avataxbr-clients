goog.provide('API.Client.ProcessScenario');

/**
 * @record
 */
API.Client.ProcessScenario = function() {}

/**
 * Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.code;

/**
 * Inform that the process has inventory impact.
 * @type {!boolean}
 * @export
 */
API.Client.ProcessScenario.prototype.stockImpact;

/**
 * Inform that the process has financial impact.
 * @type {!boolean}
 * @export
 */
API.Client.ProcessScenario.prototype.financialImpact;

/**
 * Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.cstIPI;

/**
 * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.ipiLegalTaxClass;

/**
 * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.accruablePISTaxation;

/**
 * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.pisExemptLegalReasonCode;

/**
 * When specifi reason, this field has the description
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.pisExemptLegalReason;

/**
 * Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.accruableCOFINSTaxation;

/**
 * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.cofinsExemptLegalReasonCode;

/**
 * When specifi reason, this field has the description
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.cofinsExemptLegalReason;

/**
 * Inform that the process allow IPI credit to Input process
 * @type {!boolean}
 * @export
 */
API.Client.ProcessScenario.prototype.allowIPIcreditWhenInGoing;

/**
 * the map key is state code
 * @type {!Array<!API.Client.IcmsTaxConf>}
 * @export
 */
API.Client.ProcessScenario.prototype.icmsConf;

/**
 * Process name to Identify this configuration
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.type;

/**
 * inform if the transaction is an operation to internalizing (receive) item or value
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.wayType;

/**
 * @type {!string}
 * @export
 */
API.Client.ProcessScenario.prototype.goal;

/**
 * inform that the configuration process overwrites the cfop configuration.
 * @type {!boolean}
 * @export
 */
API.Client.ProcessScenario.prototype.overWriteCFOP;

/**
 * @type {!Array<!API.Client.CfopConf>}
 * @export
 */
API.Client.ProcessScenario.prototype.cfops;

/** @enum {string} */
API.Client.ProcessScenario.CstIPIEnum = { 
  50: '50',
  51: '51',
  52: '52',
  53: '53',
  54: '54',
}
/** @enum {string} */
API.Client.ProcessScenario.AccruablePISTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
}
/** @enum {string} */
API.Client.ProcessScenario.AccruableCOFINSTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
}
/** @enum {string} */
API.Client.ProcessScenario.TypeEnum = { 
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
API.Client.ProcessScenario.WayTypeEnum = { 
  in: 'in',
  out: 'out',
}
/** @enum {string} */
API.Client.ProcessScenario.GoalEnum = { 
  Normal: 'Normal',
  Complementary: 'Complementary',
  Voided: 'Voided',
  Replacement: 'Replacement',
  Return: 'Return',
  Adjustment: 'Adjustment',
}
