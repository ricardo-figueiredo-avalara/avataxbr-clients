# IO.Swagger.Model.EntityForGoods
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Entity name, official name (Razão Social) | [optional] 
**Role** | **string** | - &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO  | [optional] 
**Type** | [**EntityType**](EntityType.md) |  | 
**FederalTaxId** | **string** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | 
**CityTaxId** | **string** | City Tax ID | [optional] 
**StateTaxId** | **string** | State Tax ID | [optional] 
**Suframa** | **string** | Suframa ID | [optional] 
**Phone** | **string** | Entity Phone | [optional] 
**TaxRegime** | **string** |  | [optional] 
**Email** | **string** | Entity Email | [optional] 
**SubjectToSRF1234** | **bool?** | Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) | [optional] 
**IcmsTaxPayer** | **bool?** | Inform if the entity is ICMS tax payer. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

