package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class InformerForGoods (
  header: Option[HeaderForGoods],
line: Option[LineForGoods],
_company: Option[EntityInformerForGoods],
_entity: Option[EntityInformerForGoods],
emitter: Option[EntityInformerForGoods],
receiver: Option[EntityInformerForGoods],
transporter: Option[EntityInformerForGoods],
csts: Option[InformerForGoods_csts],
amount: Option[Number],
discount: Option[Number],
quantity: Option[Number],
unitPrice: Option[Number],
freightAmount: Option[Number],
insuranceAmount: Option[Number],
otherCostAmount: Option[Number],
exemptValue: Option[Number]
)
