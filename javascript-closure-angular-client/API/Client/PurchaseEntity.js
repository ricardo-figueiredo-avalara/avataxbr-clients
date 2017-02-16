goog.provide('API.Client.PurchaseEntity');

/**
 * @record
 */
API.Client.PurchaseEntity = function() {}

/**
 * Legal Name of Service buyer.
 * @type {!string}
 * @export
 */
API.Client.PurchaseEntity.prototype.name;

/**
 * @type {!API.Client.EntityType}
 * @export
 */
API.Client.PurchaseEntity.prototype.type;

/**
 * Entity Email
 * @type {!string}
 * @export
 */
API.Client.PurchaseEntity.prototype.email;

/**
 * CNPJ/CPF of Sales Buyer. If CPF, pattern is '[0-9]{11}' if CNPJ, pattern is '[0-9]{14}'
 * @type {!string}
 * @export
 */
API.Client.PurchaseEntity.prototype.cnpjcpf;

/**
 * City Tax ID
 * @type {!string}
 * @export
 */
API.Client.PurchaseEntity.prototype.cityTaxId;

/**
 * State Tax ID
 * @type {!string}
 * @export
 */
API.Client.PurchaseEntity.prototype.stateTaxId;

/**
 * Suframa ID
 * @type {!string}
 * @export
 */
API.Client.PurchaseEntity.prototype.suframa;

/**
 * Entity Phone
 * @type {!string}
 * @export
 */
API.Client.PurchaseEntity.prototype.phone;

/**
 * @type {!API.Client.FederalTaxRegime}
 * @export
 */
API.Client.PurchaseEntity.prototype.taxRegime;

/**
 * Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.
 * @type {!boolean}
 * @export
 */
API.Client.PurchaseEntity.prototype.hasCpom;

/**
 * These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.
 * @type {!boolean}
 * @export
 */
API.Client.PurchaseEntity.prototype.subjectWithholdingIrrf;

/**
 * The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.
 * @type {!number}
 * @export
 */
API.Client.PurchaseEntity.prototype.inssPreviousContrib;

/**
 * The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.
 * @type {!number}
 * @export
 */
API.Client.PurchaseEntity.prototype.inssBasisDiscount;

/**
 * When Seller is Simples regime, the seller needs send RF rate.
 * @type {!number}
 * @export
 */
API.Client.PurchaseEntity.prototype.issRfRate;

