package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class NRef (
  _type: Option[String],
refNFe: Option[String],
refCTe: Option[String],
refECF: Option[NRef_refECF],
refNF: Option[NRef_refNF],
refFarmerNF: Option[NRef_refFarmerNF]
)
