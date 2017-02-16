# Br16Api.PaymentPaymentMode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | **String** | Payment mode - &#39;01&#39; # Dinheiro - &#39;02&#39; # Cheque - &#39;03&#39; # Cartão de Crédito - &#39;04&#39; # Cartão de Débito - &#39;05&#39; # Crédito Loja - &#39;10&#39; # Vale Alimentação - &#39;11&#39; # Vale Refeição - &#39;12&#39; # Vale Presente - &#39;13&#39; # Vale Combustível - &#39;99&#39; # Outros  | 
**value** | **Number** | payment value | 
**cardTpIntegration** | **String** | - &#39;1&#39; # Payment integrated with system, - &#39;2&#39; # Payment not integrated with system  | [optional] 
**cardCNPJ** | **String** | Federal tax id of accrediting card (credenciadora do cartão) | [optional] 
**cardBrand** | **String** | card brand - &#39;01&#39; # Visa - &#39;02&#39; # Mastercard - &#39;03&#39; # American Express - &#39;04&#39; # Sorocred - &#39;99&#39; # Other  | [optional] 
**cardAuthorization** | **String** | transaction authorization number | [optional] 


<a name="ModeEnum"></a>
## Enum: ModeEnum


* `01` (value: `"01"`)

* `02` (value: `"02"`)

* `03` (value: `"03"`)

* `04` (value: `"04"`)

* `05` (value: `"05"`)

* `10` (value: `"10"`)

* `11` (value: `"11"`)

* `12` (value: `"12"`)

* `13` (value: `"13"`)

* `99` (value: `"99"`)




<a name="CardTpIntegrationEnum"></a>
## Enum: CardTpIntegrationEnum


* `1` (value: `"1"`)

* `2` (value: `"2"`)




<a name="CardBrandEnum"></a>
## Enum: CardBrandEnum


* `01` (value: `"01"`)

* `02` (value: `"02"`)

* `03` (value: `"03"`)

* `04` (value: `"04"`)

* `99` (value: `"99"`)




