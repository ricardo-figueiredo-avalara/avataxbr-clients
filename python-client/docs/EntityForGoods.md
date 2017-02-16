# EntityForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Entity name, official name (Razão Social) | [optional] 
**role** | **str** | - &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO  | [optional] 
**type** | [**EntityType**](EntityType.md) |  | 
**federal_tax_id** | **str** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | 
**city_tax_id** | **str** | City Tax ID | [optional] 
**state_tax_id** | **str** | State Tax ID | [optional] 
**suframa** | **str** | Suframa ID | [optional] 
**phone** | **str** | Entity Phone | [optional] 
**tax_regime** | **str** |  | [optional] 
**email** | **str** | Entity Email | [optional] 
**subject_to_srf1234** | **bool** | Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) | [optional] 
**icms_tax_payer** | **bool** | Inform if the entity is ICMS tax payer. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


