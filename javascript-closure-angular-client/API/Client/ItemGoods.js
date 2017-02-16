goog.provide('API.Client.ItemGoods');

/**
 * @record
 */
API.Client.ItemGoods = function() {}

/**
 * Company ID
 * @type {!API.Client.UUID}
 * @export
 */
API.Client.ItemGoods.prototype.companyId;

/**
 * ERP Code
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.code;

/**
 * Agast Code
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.agast;

/**
 * Item Description
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.description;

/**
 * Seal Code for ipi tax control (código do selo para controle de IPI)
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.sealCode;

/**
 * Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.nFCI;

/**
 * this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. 
 * @type {!boolean}
 * @export
 */
API.Client.ItemGoods.prototype.isIcmsStSubstitute;

/**
 * - '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% 
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.source;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.productType;

/**
 * Item is merchandise but will be considered product
 * @type {!boolean}
 * @export
 */
API.Client.ItemGoods.prototype.manufacturerEquivalent;

/**
 * Inform that this item will have rights to aprropriate IPI credit
 * @type {!boolean}
 * @export
 */
API.Client.ItemGoods.prototype.appropriateIPIcreditWhenInGoing;

/**
 * Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE
 * @type {!boolean}
 * @export
 */
API.Client.ItemGoods.prototype.usuallyAppropriatePISCOFINSCredit;

/**
 * The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount
 * @type {!boolean}
 * @export
 */
API.Client.ItemGoods.prototype.isPisCofinsEstimatedCredit;

/**
 * - '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação 
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.piscofinsRevenueType;

/**
 * Discount allowed on icms base when PIS/COFINS are Monophase
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.icmsBaseDiscountForMonoPhaseSocialContr;

/**
 * tax substitution code - Codigo especificador da Substuicao Tributaria
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.cest;

/**
 * GTIN NUMBER
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.cean;

/**
 * Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.nve;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.salesUnit;

/**
 * factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.salesUnitIPIfactor;

/**
 * factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.salesUnitIcmsfactor;

/**
 * factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.salesUnitIcmsStfactor;

/**
 * factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.salesUnitPisCofinsfactor;

/**
 * @type {!string}
 * @export
 */
API.Client.ItemGoods.prototype.purchaseUnit;

/**
 * factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.purchaseUnitIPIfactor;

/**
 * factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.purchaseUnitIcmsfactor;

/**
 * factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.purchaseUnitIcmsStfactor;

/**
 * factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
 * @type {!number}
 * @export
 */
API.Client.ItemGoods.prototype.purchaseUnitPisCofinsfactor;

/**
 * When the product is new, and will be retail, firt time that it exit it is subject to IPI
 * @type {!boolean}
 * @export
 */
API.Client.ItemGoods.prototype.firstUse;

/** @enum {string} */
API.Client.ItemGoods.SourceEnum = { 
  0: '0',
  1: '1',
  2: '2',
  3: '3',
  4: '4',
  5: '5',
  6: '6',
  7: '7',
  8: '8',
}
/** @enum {string} */
API.Client.ItemGoods.ProductTypeEnum = { 
  FOR PRODUCT: 'FOR PRODUCT',
  FOR MERCHANDISE: 'FOR MERCHANDISE',
  NO RESTRICTION: 'NO RESTRICTION',
  SERVICE: 'SERVICE',
  FEEDSTOCK: 'FEEDSTOCK',
  FIXED ASSETS: 'FIXED ASSETS',
}
/** @enum {string} */
API.Client.ItemGoods.PiscofinsRevenueTypeEnum = { 
  01: '01',
  02: '02',
  03: '03',
  04: '04',
  05: '05',
  06: '06',
  07: '07',
}
