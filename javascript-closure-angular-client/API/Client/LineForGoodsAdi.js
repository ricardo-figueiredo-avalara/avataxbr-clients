goog.provide('API.Client.LineForGoods_adi');

/**
 * @record
 */
API.Client.LineForGoodsAdi = function() {}

/**
 * aditional sequence number (1 to 100)
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsAdi.prototype.addNumber;

/**
 * sequential item number for this adi, sequence number (1 to 999)
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsAdi.prototype.sequentialNumber;

/**
 * Manufatorer erp internal code
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsAdi.prototype.manufacturerCode;

/**
 * This decimal 13 integers and 2 decimals, aditional adi discount
 * @type {!number}
 * @export
 */
API.Client.LineForGoodsAdi.prototype.adiDiscount;

/**
 * Drawback number
 * @type {!string}
 * @export
 */
API.Client.LineForGoodsAdi.prototype.drawbackNumber;

