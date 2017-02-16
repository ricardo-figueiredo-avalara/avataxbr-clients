package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Location (
  street: Option[String],  // Street Name
neighborhood: Option[String],  // Neighborhood Name
zipcode: String,  // Brazilian Zip Code
cityCode: Option[String],  // City Code (IBGE)
cityName: Option[String],  // City Name
state: Option[StateEnum],
countryCode: Option[String],  // Country Code
country: Option[String],  // Use ISO 3166-1 alpha-3 codes
number: Option[String],  // House number
complement: Option[String],  // Any other information about the address (Room, Suite, Floor, etc)).
phone: Option[String],  // Phone number
companyId: UUID,  // Company ID
code: String,  // this property identify the location, it is unique for this company
_type: String,  // this property identify the location, it is unique for this company
email: Option[String],  // Email
federalTaxId: Option[String],  // Federal tax id, CNPJ or CPF
stateTaxId: Option[String],  // state tax id for this location
secondaryStateTaxId: Option[List[Location_secondaryStateTaxId]],
cityTaxId: Option[String],  // City Tax ID
suframa: Option[String],
mainActivity: Option[String],  // Main location activity
nfseProcessModel: Option[String]  // - &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands 
)
