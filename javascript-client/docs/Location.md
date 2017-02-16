# Br16Api.Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyId** | **String** | Company ID | 
**code** | **String** | this property identify the location, it is unique for this company | 
**type** | **String** | this property identify the location, it is unique for this company | 
**email** | **String** | Email | [optional] 
**federalTaxId** | **String** | Federal tax id, CNPJ or CPF | [optional] 
**stateTaxId** | **String** | state tax id for this location | [optional] 
**secondaryStateTaxId** | [**[LocationSecondaryStateTaxId]**](LocationSecondaryStateTaxId.md) |  | [optional] 
**cityTaxId** | **String** | City Tax ID | [optional] 
**suframa** | **String** |  | [optional] 
**mainActivity** | **String** | Main location activity | [optional] 
**nfseProcessModel** | **String** | - &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands  | [optional] 


<a name="TypeEnum"></a>
## Enum: TypeEnum


* `ShipFrom` (value: `"ShipFrom"`)

* `ShipTo` (value: `"ShipTo"`)

* `ServiceRendered` (value: `"ServiceRendered"`)




<a name="MainActivityEnum"></a>
## Enum: MainActivityEnum


* `commerce` (value: `"commerce"`)

* `industry` (value: `"industry"`)

* `service` (value: `"service"`)




<a name="NfseProcessModelEnum"></a>
## Enum: NfseProcessModelEnum


* `edi` (value: `"edi"`)

* `xml` (value: `"xml"`)

* `rps` (value: `"rps"`)




