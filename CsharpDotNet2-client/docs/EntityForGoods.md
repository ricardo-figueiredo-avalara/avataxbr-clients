# IO.Swagger.Model.EntityForGoods
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Entity name, official name (Razão Social) | [optional] [default to null]
**Role** | **string** | - &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO  | [optional] [default to null]
**Type** | [**EntityType**](EntityType.md) |  | [default to null]
**FederalTaxId** | **string** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | [default to null]
**CityTaxId** | **string** | City Tax ID | [optional] [default to null]
**StateTaxId** | **string** | State Tax ID | [optional] [default to null]
**Suframa** | **string** | Suframa ID | [optional] [default to null]
**Phone** | **string** | Entity Phone | [optional] [default to null]
**TaxRegime** | **string** |  | [optional] [default to null]
**Email** | **string** | Entity Email | [optional] [default to null]
**SubjectToSRF1234** | **bool?** | Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) | [optional] [default to null]
**IcmsTaxPayer** | **bool?** | Inform if the entity is ICMS tax payer. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

