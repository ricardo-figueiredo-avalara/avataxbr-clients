goog.provide('API.Client.LineForSefazGoods');

/**
 * @record
 */
API.Client.LineForSefazGoods = function() {}

/**
 * This string is a unique identifier for this line in the transaction
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.lineCode;

/**
 * This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.itemCode;

/**
 * AGAST CODE for itemCode
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.avalaraGoodsAndServicesType;

/**
 * This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.numberOfItems;

/**
 * when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.returnedPercentageAmount;

/**
 * This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.lineUnitPrice;

/**
 * In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.lineAmount;

/**
 * This string captures the description of the item represented by this line, will be used LC 116
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.itemDescription;

/**
 * Discount conditional, This decimal 13 integers and 0 to 2 decimals
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.lineTaxedDiscount;

/**
 * discount unconditional, This decimal 13 integers and 0 to 2 decimals
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.lineUntaxedDiscount;

/**
 * This is a enumeration folowing table
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.useType;

/**
 * Reference to process configurantion of this transaction, See ProcessScenario definition
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.processScenario;

/**
 * Fiscal Operation Code of transport service
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.cfop;

/**
 * return if this transaction has stock impact for this process or CFOP
 * @type {!boolean}
 * @export
 */
API.Client.LineForSefazGoods.prototype.hasStockImpact;

/**
 * return if this transaction has finantial impact for this process or CFOP
 * @type {!boolean}
 * @export
 */
API.Client.LineForSefazGoods.prototype.hasFinantialImpact;

/**
 * This decimal 13 integers and 0 to 2 decimals
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.freightAmount;

/**
 * This decimal 13 integers and 0 to 2 decimals
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.insuranceAmount;

/**
 * This decimal 13 integers and 0 to 2 decimals
 * @type {!number}
 * @export
 */
API.Client.LineForSefazGoods.prototype.otherCostAmount;

/**
 * The item value will compose the invoice total value.
 * @type {!boolean}
 * @export
 */
API.Client.LineForSefazGoods.prototype.indTotType;

/**
 * order number, information used for B2B control process
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.orderNumber;

/**
 * number of the item from order number, information used for B2B control process
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.orderItemNumber;

/**
 * Gloal Unique identifier (Importation form)
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.fciNumber;

/**
 * RECOPI number
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.recopiNumber;

/**
 * additional information about product (referenced standard, complementary info, etc)
 * @type {!string}
 * @export
 */
API.Client.LineForSefazGoods.prototype.infAdProd;

/**
 * @type {!API.Client.Vehicle}
 * @export
 */
API.Client.LineForSefazGoods.prototype.vehicle;

/**
 * @type {!API.Client.Medicine}
 * @export
 */
API.Client.LineForSefazGoods.prototype.medicine;

/**
 * @type {!API.Client.Weapon}
 * @export
 */
API.Client.LineForSefazGoods.prototype.weapon;

/**
 * @type {!API.Client.Fuel}
 * @export
 */
API.Client.LineForSefazGoods.prototype.fuel;

/**
 * Inform that for this item the Entity referenced is ICMS Substitute
 * @type {!boolean}
 * @export
 */
API.Client.LineForSefazGoods.prototype.entityIsIcmsSubstitute;

/**
 * Inform that this item has ICMS withheld for transport value service.
 * @type {!boolean}
 * @export
 */
API.Client.LineForSefazGoods.prototype.isTransportIcmsWithheld;

/**
 * @type {!API.Client.LineForGoods_icmsTaxRelief}
 * @export
 */
API.Client.LineForSefazGoods.prototype.icmsTaxRelief;

/**
 * Exportation detail
 * @type {!Array<!API.Client.LineForGoods_export>}
 * @export
 */
API.Client.LineForSefazGoods.prototype.export;

/**
 * Import declaration
 * @type {!Array<!API.Client.LineForGoods_di>}
 * @export
 */
API.Client.LineForSefazGoods.prototype.di;

/**
 * @type {!API.Client.LineForGoods_calculatedTax}
 * @export
 */
API.Client.LineForSefazGoods.prototype.calculatedTax;

/**
 * @type {!API.Client.AgastExtendForSefaz}
 * @export
 */
API.Client.LineForSefazGoods.prototype.extend;

/** @enum {string} */
API.Client.LineForSefazGoods.UseTypeEnum = { 
  use or consumption: 'use or consumption',
  resale: 'resale',
  agricultural production: 'agricultural production',
  production: 'production',
  use or consumption on business establishment: 'use or consumption on business establishment',
  use or consumption on transporter service establishment: 'use or consumption on transporter service establishment',
  use or consumption on communication service establishment: 'use or consumption on communication service establishment',
  use or consumption on demand by contract: 'use or consumption on demand by contract',
  use or consumption on energy supplier establishment: 'use or consumption on energy supplier establishment',
  use or consumption of fuel transaction type exportation: 'use or consumption of fuel transaction type exportation',
  fixed assets: 'fixed assets',
  resale export: 'resale export',
  resale icms exempt: 'resale icms exempt',
  resale buyer under the same icmsSt tax rule: 'resale buyer under the same icmsSt tax rule',
  transport of goods that don&#39;t need invoice (nf): 'transport of goods that don&#39;t need invoice (nf)',
}
