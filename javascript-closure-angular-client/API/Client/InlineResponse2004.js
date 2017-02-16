goog.provide('API.Client.inline_response_200_4');

/**
 * @record
 */
API.Client.InlineResponse2004 = function() {}

/**
 * - '1' # Ambiente de Produção - '2' # Ambiente de Homologação                 
 * @type {!string}
 * @export
 */
API.Client.InlineResponse2004.prototype.environment;

/** @enum {string} */
API.Client.InlineResponse2004.EnvironmentEnum = { 
  1: '1',
  2: '2',
}
