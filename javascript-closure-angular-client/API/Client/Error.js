goog.provide('API.Client.Error');

/**
 * @record
 */
API.Client.Error = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.Error.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.message;

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.field;

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.value;

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.in;

/** @enum {string} */
API.Client.Error.InEnum = { 
  params: 'params',
  body: 'body',
  query: 'query',
}
