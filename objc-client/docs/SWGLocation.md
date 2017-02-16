# SWGLocation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**street** | **NSString*** | Street Name | [optional] 
**neighborhood** | **NSString*** | Neighborhood Name | [optional] 
**zipcode** | **NSString*** | Brazilian Zip Code | 
**cityCode** | **NSString*** | City Code (IBGE) | [optional] 
**cityName** | **NSString*** | City Name | [optional] 
**state** | [**SWGStateEnum***](SWGStateEnum.md) |  | [optional] 
**countryCode** | **NSString*** | Country Code | [optional] [default to @"0"]
**country** | **NSString*** | Use ISO 3166-1 alpha-3 codes | [optional] [default to @"BRA"]
**number** | **NSString*** | House number | [optional] 
**complement** | **NSString*** | Any other information about the address (Room, Suite, Floor, etc)). | [optional] 
**phone** | **NSString*** | Phone number | [optional] 
**companyId** | **NSString*** | Company ID | 
**code** | **NSString*** | this property identify the location, it is unique for this company | 
**type** | **NSString*** | this property identify the location, it is unique for this company | 
**email** | **NSString*** | Email | [optional] 
**federalTaxId** | **NSString*** | Federal tax id, CNPJ or CPF | [optional] 
**stateTaxId** | **NSString*** | state tax id for this location | [optional] 
**secondaryStateTaxId** | [**NSArray&lt;SWGLocationSecondaryStateTaxId&gt;***](SWGLocationSecondaryStateTaxId.md) |  | [optional] 
**cityTaxId** | **NSString*** | City Tax ID | [optional] 
**suframa** | **NSString*** |  | [optional] 
**mainActivity** | **NSString*** | Main location activity | [optional] 
**nfseProcessModel** | **NSString*** | - &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


