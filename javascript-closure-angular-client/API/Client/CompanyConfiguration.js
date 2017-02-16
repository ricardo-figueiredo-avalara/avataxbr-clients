goog.provide('API.Client.Company_configuration');

/**
 * @record
 */
API.Client.CompanyConfiguration = function() {}

/**
 * digital certificate A1 model, p12, encoded by base64
 * @type {!string}
 * @export
 */
API.Client.CompanyConfiguration.prototype.certificate;

/**
 * certificate password
 * @type {!string}
 * @export
 */
API.Client.CompanyConfiguration.prototype.certificatepwd;

/**
 * expiration date of this certificate
 * @type {!Date}
 * @export
 */
API.Client.CompanyConfiguration.prototype.certificateexpiration;

/**
 * company logo image encoded by base64
 * @type {!string}
 * @export
 */
API.Client.CompanyConfiguration.prototype.logo;

/**
 * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; 
 * @type {!string}
 * @export
 */
API.Client.CompanyConfiguration.prototype.tpImpNFe;

/**
 * how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
 * @type {!string}
 * @export
 */
API.Client.CompanyConfiguration.prototype.tpImpNFCe;

/** @enum {string} */
API.Client.CompanyConfiguration.TpImpNFeEnum = { 
  0: '0',
  1: '1',
  2: '2',
}
/** @enum {string} */
API.Client.CompanyConfiguration.TpImpNFCeEnum = { 
  0: '0',
  4: '4',
  5: '5',
}
