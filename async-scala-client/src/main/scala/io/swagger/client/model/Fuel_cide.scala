package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Fuel_cide (
  baseCalcCIDE: Double,  // percentage of natural gas (GLP), this decimal 12 integers and 0 to 4 decimals
rateCIDE: Double,  // percentage of natural gas (GLP), this decimal 11 integers and 0 to 4 decimals - R$
valueCIDE: Double  // percentage of natural gas (GLP), this decimal 13 integers and 2 decimals - R$
)
