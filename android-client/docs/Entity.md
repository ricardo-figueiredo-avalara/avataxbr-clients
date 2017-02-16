
# Entity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Entity name, official name (Razão Social) |  [optional]
**role** | [**RoleEnum**](#RoleEnum) | - &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO  |  [optional]
**type** | [**EntityType**](EntityType.md) |  | 
**federalTaxId** | **String** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; | 
**cityTaxId** | **String** | City Tax ID |  [optional]
**stateTaxId** | **String** | State Tax ID |  [optional]
**suframa** | **String** | Suframa ID |  [optional]
**phone** | **String** | Entity Phone |  [optional]
**taxRegime** | [**TaxRegimeEnum**](#TaxRegimeEnum) |  |  [optional]
**email** | **String** | Entity Email |  [optional]
**subjectToSRF1234** | **Boolean** | Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234) |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----


<a name="TaxRegimeEnum"></a>
## Enum: TaxRegimeEnum
Name | Value
---- | -----



