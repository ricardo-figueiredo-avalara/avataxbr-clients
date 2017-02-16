goog.provide('API.Client.PurchaseInfo');

/**
 * @record
 */
API.Client.PurchaseInfo = function() {}

/**
 * Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas 
 * @type {!string}
 * @export
 */
API.Client.PurchaseInfo.prototype.governmentOrder;

/**
 * Order info Informação do pedido 
 * @type {!string}
 * @export
 */
API.Client.PurchaseInfo.prototype.orderNumber;

/**
 * Agreement info Informação do contrato 
 * @type {!string}
 * @export
 */
API.Client.PurchaseInfo.prototype.contractNumber;

