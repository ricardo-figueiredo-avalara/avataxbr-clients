
# Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**street** | **String** | Street Name |  [optional]
**neighborhood** | **String** | Neighborhood Name |  [optional]
**zipcode** | **String** | Brazilian Zip Code | 
**cityCode** | **String** | City Code (IBGE) |  [optional]
**cityName** | **String** | City Name |  [optional]
**state** | [**StateEnum**](StateEnum.md) |  |  [optional]
**countryCode** | **String** | Country Code |  [optional]
**country** | **String** | Use ISO 3166-1 alpha-3 codes |  [optional]
**number** | **String** | House number |  [optional]
**complement** | **String** | Any other information about the address (Room, Suite, Floor, etc)). |  [optional]
**phone** | **String** | Phone number |  [optional]
**companyId** | [**UUID**](UUID.md) | Company ID | 
**code** | **String** | this property identify the location, it is unique for this company | 
**type** | [**TypeEnum**](#TypeEnum) | this property identify the location, it is unique for this company | 
**email** | **String** | Email |  [optional]
**federalTaxId** | **String** | Federal tax id, CNPJ or CPF |  [optional]
**stateTaxId** | **String** | state tax id for this location |  [optional]
**secondaryStateTaxId** | [**List&lt;LocationSecondaryStateTaxId&gt;**](LocationSecondaryStateTaxId.md) |  |  [optional]
**cityTaxId** | **String** | City Tax ID |  [optional]
**suframa** | **String** |  |  [optional]
**mainActivity** | [**MainActivityEnum**](#MainActivityEnum) | Main location activity |  [optional]
**nfseProcessModel** | [**NfseProcessModelEnum**](#NfseProcessModelEnum) | - &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----


<a name="MainActivityEnum"></a>
## Enum: MainActivityEnum
Name | Value
---- | -----


<a name="NfseProcessModelEnum"></a>
## Enum: NfseProcessModelEnum
Name | Value
---- | -----



