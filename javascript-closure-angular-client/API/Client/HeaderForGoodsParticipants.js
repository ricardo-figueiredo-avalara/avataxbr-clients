goog.provide('API.Client.HeaderForGoods_participants');

/**
 * List of transaction participants, Seller, Buyer, Carrier
 * @record
 */
API.Client.HeaderForGoodsParticipants = function() {}

/**
 * @type {!API.Client.EntityForGoods}
 * @export
 */
API.Client.HeaderForGoodsParticipants.prototype.entity;

/**
 * @type {!API.Client.EntityForGoods}
 * @export
 */
API.Client.HeaderForGoodsParticipants.prototype.transporter;

