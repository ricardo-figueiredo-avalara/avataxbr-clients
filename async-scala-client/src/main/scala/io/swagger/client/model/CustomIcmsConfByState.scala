package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class CustomIcmsConfByState (
  code: String,  // Identify the IcmsConfState in namespace
state: StateEnum,
name: Option[String],  // name for this configuration
startDate: Option[DateTime],  // date when this configuration values starts
expirationDate: Option[DateTime],  // date when this configuration values expire
inactive: Option[Boolean],  // set this configuration to Inactive
subjectToST: Option[Boolean],  // inform that the item linked to this configuration is subject to ICMS ST on this state
icmsCST: Option[String],  // On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED 
calcMode: Option[String],  // how this ICMS will be calculed for itens linked to this configuration
discountRateForMonoPhase: Option[Double],  // discount if the item is subject to monophase PIS/COFINS for transactions inside state
rate: Option[Double],  // ICMS rate
icmsBaseDiscount: Option[Double],  // ICMS rate
msrp: Option[Double],  // SRP or MMSRP amount base for this icms configuration
mvaRate: Option[Double],  // ICMS mva rate to define calc base
msrpUnit: Option[String],  // unit used to SRP amount value
icmsLegalReason: Option[String],  // Code for the ICM legal reason, this message will be placed on invoice.
fcpRate: Option[Double],  // Fundo de Combate à pobreza / Fund Against Poverty
icmsSTConf: Option[IcmsConfByState_icmsSTConf],
icmsInterStateConf: Option[List[IcmsConfInterState]],  // the map key is state code
companyId: UUID  // Company ID
)
