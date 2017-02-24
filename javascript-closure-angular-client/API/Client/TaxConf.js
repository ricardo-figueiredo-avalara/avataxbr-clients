goog.provide('API.Client.TaxConf');

/**
 * @record
 */
API.Client.TaxConf = function() {}

/**
 * main unique identificator
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.code;

/**
 * Inform that the process has inventory impact.
 * @type {!boolean}
 * @export
 */
API.Client.TaxConf.prototype.stockImpact;

/**
 * Inform that the process has financial impact.
 * @type {!boolean}
 * @export
 */
API.Client.TaxConf.prototype.financialImpact;

/**
 * Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.cstIPI;

/**
 * Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.ipiLegalTaxClass;

/**
 * Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.accruablePISTaxation;

/**
 * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.pisExemptLegalReasonCode;

/**
 * When specifi reason, this field has the description
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.pisExemptLegalReason;

/**
 * Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.accruableCOFINSTaxation;

/**
 * When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.cofinsExemptLegalReasonCode;

/**
 * When specifi reason, this field has the description
 * @type {!string}
 * @export
 */
API.Client.TaxConf.prototype.cofinsExemptLegalReason;

/**
 * Inform that the process allow IPI credit to Input process
 * @type {!boolean}
 * @export
 */
API.Client.TaxConf.prototype.allowIPIcreditWhenInGoing;

/**
 * the map key is state code
 * @type {!Array<!API.Client.IcmsTaxConf>}
 * @export
 */
API.Client.TaxConf.prototype.icmsConf;

/** @enum {string} */
API.Client.TaxConf.CstIPIEnum = { 
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
API.Client.TaxConf.AccruablePISTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
  O: 'O',
  OZ: 'OZ',
}
/** @enum {string} */
API.Client.TaxConf.AccruableCOFINSTaxationEnum = { 
  T: 'T',
  Z: 'Z',
  E: 'E',
  H: 'H',
  N: 'N',
  O: 'O',
  OZ: 'OZ',
}
