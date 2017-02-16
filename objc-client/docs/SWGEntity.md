# SWGEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **NSString*** | Entity name, official name (Razão Social) | [optional] 
**role** | **NSString*** | - &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO  | [optional] 
**type** | [**SWGEntityType***](SWGEntityType.md) |  | 
**federalTaxId** | **NSString*** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | 
**cityTaxId** | **NSString*** | City Tax ID | [optional] 
**stateTaxId** | **NSString*** | State Tax ID | [optional] 
**suframa** | **NSString*** | Suframa ID | [optional] 
**phone** | **NSString*** | Entity Phone | [optional] 
**taxRegime** | **NSString*** |  | [optional] 
**email** | **NSString*** | Entity Email | [optional] 
**subjectToSRF1234** | **NSNumber*** | Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


