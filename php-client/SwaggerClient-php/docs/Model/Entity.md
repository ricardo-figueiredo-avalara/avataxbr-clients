# Entity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Entity name, official name (Razão Social) | [optional] 
**role** | **string** | - &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO | [optional] 
**type** | [**\Swagger\Client\Model\EntityType**](EntityType.md) |  | 
**federal_tax_id** | **string** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | 
**city_tax_id** | **string** | City Tax ID | [optional] 
**state_tax_id** | **string** | State Tax ID | [optional] 
**suframa** | **string** | Suframa ID | [optional] 
**phone** | **string** | Entity Phone | [optional] 
**tax_regime** | **string** |  | [optional] 
**email** | **string** | Entity Email | [optional] 
**subject_to_srf1234** | **bool** | Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


