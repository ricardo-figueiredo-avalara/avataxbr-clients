package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class IcmsConfByState_icmsSTConf (
  hasReductionOfMVAForSimples: Option[Boolean],  // inform that substituted is tax regime Simplified the operation MVA will be reduced
reductionOfMVAForSimples: Option[Double],  // mva reduction when substituted is tax regime Simplified.
calcMode: Option[String],  // how this ICMS-ST will be calculed for itens linked to this configuration
mvaRate: Option[Double],  // ICMS-ST mva rate to define calc base
icmsStBaseDiscount: Option[Double],  // ICMS rate - Redução da BC ICMS ST (%)
srp: Option[Double],  // SRP or MSRP amount base for this ICMS-ST configuration
srpUnit: Option[String]  // unit used to srv amount value
)
