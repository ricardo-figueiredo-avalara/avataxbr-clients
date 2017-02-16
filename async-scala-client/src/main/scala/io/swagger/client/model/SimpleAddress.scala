package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SimpleAddress (
  line1: String,  // Address
line2: String,  // Number
line3: String,  // District
city: Option[String],
zipcode: String,  // Brazilian Zip Code
state: Option[StateEnum],
country: String  // Use ISO 3166-1 alpha-3 codes
)
