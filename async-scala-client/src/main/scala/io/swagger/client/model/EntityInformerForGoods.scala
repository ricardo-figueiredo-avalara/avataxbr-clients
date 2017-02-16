package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class EntityInformerForGoods (
  _type: Option[EntityType],
taxRegime: Option[FederalTaxRegime],
federalTaxRegime: Option[EntityInformerForGoods_federalTaxRegime],
cityCode: Option[String],
address: Option[Address],
details: Option[Any],
icmsTaxPayer: Option[Boolean]
)
