# IO.Swagger.Model.Location
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Street** | **string** | Street Name | [optional] [default to null]
**Neighborhood** | **string** | Neighborhood Name | [optional] [default to null]
**Zipcode** | **string** | Brazilian Zip Code | [default to null]
**CityCode** | **string** | City Code (IBGE) | [optional] [default to null]
**CityName** | **string** | City Name | [optional] [default to null]
**State** | [**StateEnum**](StateEnum.md) |  | [optional] [default to null]
**CountryCode** | **string** | Country Code | [optional] [default to null]
**Country** | **string** | Use ISO 3166-1 alpha-3 codes | [optional] [default to null]
**Number** | **string** | House number | [optional] [default to null]
**Complement** | **string** | Any other information about the address (Room, Suite, Floor, etc)). | [optional] [default to null]
**Phone** | **string** | Phone number | [optional] [default to null]
**CompanyId** | **Guid?** | Company ID | [default to null]
**Code** | **string** | this property identify the location, it is unique for this company | [default to null]
**Type** | **string** | this property identify the location, it is unique for this company | [default to null]
**Email** | **string** | Email | [optional] [default to null]
**FederalTaxId** | **string** | Federal tax id, CNPJ or CPF | [optional] [default to null]
**StateTaxId** | **string** | state tax id for this location | [optional] [default to null]
**SecondaryStateTaxId** | [**List&lt;LocationSecondaryStateTaxId&gt;**](LocationSecondaryStateTaxId.md) |  | [optional] [default to null]
**CityTaxId** | **string** | City Tax ID | [optional] [default to null]
**Suframa** | **string** |  | [optional] [default to null]
**MainActivity** | **string** | Main location activity | [optional] [default to null]
**NfseProcessModel** | **string** | - &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

