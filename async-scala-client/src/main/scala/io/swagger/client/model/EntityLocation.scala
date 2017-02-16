package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class EntityLocation (
  street: Option[String],  // Street Name
neighborhood: Option[String],  // Neighborhood Name
zipcode: String,  // Brazilian Zip Code
cityCode: Option[String],  // City Code (IBGE)
cityName: Option[String],  // City Name
state: Option[StateEnum],
countryCode: Option[String],  // Country Code
country: Option[String]  // Use ISO 3166-1 alpha-3 codes
)
