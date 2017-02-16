package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Weapon (
  weaponRestrictionType: String,  // - &#39;0&#39; # restrict use - &#39;1&#39; # public use 
serieNumber: String,
gunBarrelSerieNumber: String,  // Barrel&#39;s serial number. Número de série do cano 
weaponDescription: String  // weapon description
)
