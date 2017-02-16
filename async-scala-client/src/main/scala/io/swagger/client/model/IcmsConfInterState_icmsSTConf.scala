package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class IcmsConfInterState_icmsSTConf (
  protocolType: Option[String],
hasReductionOfMVAForSimples: Option[Boolean],  // inform that substituted is tax regime Simplified the operation MVA will be reduced
reductionOfMVAForSimples: Option[Double],  // MVA reduction when substituted is tax regime Simplified.
calcMode: Option[String],  // how this ICMS-ST will be calculed for itens linked to this configuration
icmsStBaseDiscount: Option[Double],  // ICMS rate - Redução da BC ICMS ST (%)
mvaRate: Option[Double],  // ICMS-ST MVA rate to define calc base
srp: Option[Double],  // SRP or MSRP amount base for this ICMS-ST configuration
srpUnit: Option[String]  // unit used to SRP amount value
)
