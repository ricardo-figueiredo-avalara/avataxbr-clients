package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class IcmsConfInterState (
  state: Option[StateEnum],
calcMode: Option[String],  // how this ICMS will be calculed for itens linked to this configuration
discountRateForMonoPhase: Option[Double],  // discount if the item is subject to monophase PIS/COFINS when operation interstate
rate: Option[Double],  // ICMS rate
fcpRate: Option[Double],  // FCP rate (Fundo de Combate à Probreza / Fund Against Poverty
icmsBaseDiscount: Option[Double],  // ICMS rate
msrp: Option[Double],  // SRP or MMSRP amount base for this icms configuration
mvaRate: Option[Double],  // ICMS MVA rate to define calc base
msrpUnit: Option[String],  // unit used to SRP amount value
icmsLegalReason: Option[String],  // Code for the ICM legal reason, this message will be placed on invoice.
icmsSTConf: Option[IcmsConfInterState_icmsSTConf]
)
