goog.provide('API.Client.Company_mailServer');

/**
 * @record
 */
API.Client.CompanyMailServer = function() {}

/**
 * User for login on email server
 * @type {!string}
 * @export
 */
API.Client.CompanyMailServer.prototype.user;

/**
 * Password to login on email server
 * @type {!string}
 * @export
 */
API.Client.CompanyMailServer.prototype.password;

/**
 * smtp address to email server
 * @type {!string}
 * @export
 */
API.Client.CompanyMailServer.prototype.smtpAddress;

/**
 * port
 * @type {!number}
 * @export
 */
API.Client.CompanyMailServer.prototype.port;

/**
 * email address to identify the sender e-mail, to send a XML and DANFE
 * @type {!string}
 * @export
 */
API.Client.CompanyMailServer.prototype.emailFrom;

/**
 * protocol SSL or TLS
 * @type {!string}
 * @export
 */
API.Client.CompanyMailServer.prototype.protocol;

/**
 * Message to add to email body
 * @type {!string}
 * @export
 */
API.Client.CompanyMailServer.prototype.templatemessageToEmail;

/** @enum {string} */
API.Client.CompanyMailServer.ProtocolEnum = { 
  ssl: 'ssl',
  tls: 'tls',
}
