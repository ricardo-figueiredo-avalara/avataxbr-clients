# IO.Swagger.Model.Location
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Street** | **string** | Street Name | [optional] 
**Neighborhood** | **string** | Neighborhood Name | [optional] 
**Zipcode** | **string** | Brazilian Zip Code | 
**CityCode** | **string** | City Code (IBGE) | [optional] 
**CityName** | **string** | City Name | [optional] 
**State** | [**StateEnum**](StateEnum.md) |  | [optional] 
**CountryCode** | **string** | Country Code | [optional] [default to "0"]
**Country** | **string** | Use ISO 3166-1 alpha-3 codes | [optional] [default to "BRA"]
**Number** | **string** | House number | [optional] 
**Complement** | **string** | Any other information about the address (Room, Suite, Floor, etc)). | [optional] 
**Phone** | **string** | Phone number | [optional] 
**CompanyId** | **Guid?** | Company ID | 
**Code** | **string** | this property identify the location, it is unique for this company | 
**Type** | **string** | this property identify the location, it is unique for this company | 
**Email** | **string** | Email | [optional] 
**FederalTaxId** | **string** | Federal tax id, CNPJ or CPF | [optional] 
**StateTaxId** | **string** | state tax id for this location | [optional] 
**SecondaryStateTaxId** | [**List&lt;LocationSecondaryStateTaxId&gt;**](LocationSecondaryStateTaxId.md) |  | [optional] 
**CityTaxId** | **string** | City Tax ID | [optional] 
**Suframa** | **string** |  | [optional] 
**MainActivity** | **string** | Main location activity | [optional] 
**NfseProcessModel** | **string** | - &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

