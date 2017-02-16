goog.provide('API.Client.Agast_codeType');

/**
 * @record
 */
API.Client.AgastCodeType = function() {}

/**
 * - 'NCM' - 'NBS' - 'LC116' - 'SERVICE UNREGULATED' 
 * @type {!number}
 * @export
 */
API.Client.AgastCodeType.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.AgastCodeType.prototype.name;

/** @enum {string} */
API.Client.AgastCodeType.NameEnum = { 
  NCM: 'NCM',
  NBS: 'NBS',
  LC116: 'LC116',
  SERVICE UNREGULATED: 'SERVICE UNREGULATED',
}
