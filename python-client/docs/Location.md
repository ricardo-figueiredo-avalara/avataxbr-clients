# Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**street** | **str** | Street Name | [optional] 
**neighborhood** | **str** | Neighborhood Name | [optional] 
**zipcode** | **str** | Brazilian Zip Code | 
**city_code** | **str** | City Code (IBGE) | [optional] 
**city_name** | **str** | City Name | [optional] 
**state** | [**StateEnum**](StateEnum.md) |  | [optional] 
**country_code** | **str** | Country Code | [optional] [default to '0']
**country** | **str** | Use ISO 3166-1 alpha-3 codes | [optional] [default to 'BRA']
**number** | **str** | House number | [optional] 
**complement** | **str** | Any other information about the address (Room, Suite, Floor, etc)). | [optional] 
**phone** | **str** | Phone number | [optional] 
**company_id** | **str** | Company ID | 
**code** | **str** | this property identify the location, it is unique for this company | 
**type** | **str** | this property identify the location, it is unique for this company | 
**email** | **str** | Email | [optional] 
**federal_tax_id** | **str** | Federal tax id, CNPJ or CPF | [optional] 
**state_tax_id** | **str** | state tax id for this location | [optional] 
**secondary_state_tax_id** | [**list[LocationSecondaryStateTaxId]**](LocationSecondaryStateTaxId.md) |  | [optional] 
**city_tax_id** | **str** | City Tax ID | [optional] 
**suframa** | **str** |  | [optional] 
**main_activity** | **str** | Main location activity | [optional] 
**nfse_process_model** | **str** | - &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


