# SwaggerClient::Location

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**street** | **String** | Street Name | [optional] 
**neighborhood** | **String** | Neighborhood Name | [optional] 
**zipcode** | **String** | Brazilian Zip Code | 
**city_code** | **String** | City Code (IBGE) | [optional] 
**city_name** | **String** | City Name | [optional] 
**state** | [**StateEnum**](StateEnum.md) |  | [optional] 
**country_code** | **String** | Country Code | [optional] [default to &quot;0&quot;]
**country** | **String** | Use ISO 3166-1 alpha-3 codes | [optional] [default to &quot;BRA&quot;]
**number** | **String** | House number | [optional] 
**complement** | **String** | Any other information about the address (Room, Suite, Floor, etc)). | [optional] 
**phone** | **String** | Phone number | [optional] 
**company_id** | **String** | Company ID | 
**code** | **String** | this property identify the location, it is unique for this company | 
**type** | **String** | this property identify the location, it is unique for this company | 
**email** | **String** | Email | [optional] 
**federal_tax_id** | **String** | Federal tax id, CNPJ or CPF | [optional] 
**state_tax_id** | **String** | state tax id for this location | [optional] 
**secondary_state_tax_id** | [**Array&lt;LocationSecondaryStateTaxId&gt;**](LocationSecondaryStateTaxId.md) |  | [optional] 
**city_tax_id** | **String** | City Tax ID | [optional] 
**suframa** | **String** |  | [optional] 
**main_activity** | **String** | Main location activity | [optional] 
**nfse_process_model** | **String** | - &#39;edi&#39; # City hall has web service and the integration is automatic - &#39;xml&#39; # Create RPS specific to City, bat does not have webservice integration - &#39;rps&#39; # Create a generic RPS, NF is by hands  | [optional] 


