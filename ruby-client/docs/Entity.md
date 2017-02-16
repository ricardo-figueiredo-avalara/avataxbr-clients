# SwaggerClient::Entity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Entity name, official name (Razão Social) | [optional] 
**role** | **String** | - &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO  | [optional] 
**type** | [**EntityType**](EntityType.md) |  | 
**federal_tax_id** | **String** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | 
**city_tax_id** | **String** | City Tax ID | [optional] 
**state_tax_id** | **String** | State Tax ID | [optional] 
**suframa** | **String** | Suframa ID | [optional] 
**phone** | **String** | Entity Phone | [optional] 
**tax_regime** | **String** |  | [optional] 
**email** | **String** | Entity Email | [optional] 
**subject_to_srf1234** | **BOOLEAN** | Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) | [optional] 


