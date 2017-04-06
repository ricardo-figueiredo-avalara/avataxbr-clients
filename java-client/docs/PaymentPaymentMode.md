
# PaymentPaymentMode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | [**ModeEnum**](#ModeEnum) | Payment mode - &#39;01&#39; # Dinheiro - &#39;02&#39; # Cheque - &#39;03&#39; # Cartão de Crédito - &#39;04&#39; # Cartão de Débito - &#39;05&#39; # Crédito Loja - &#39;10&#39; # Vale Alimentação - &#39;11&#39; # Vale Refeição - &#39;12&#39; # Vale Presente - &#39;13&#39; # Vale Combustível - &#39;99&#39; # Outros  | 
**value** | **Double** | payment value | 
**cardTpIntegration** | [**CardTpIntegrationEnum**](#CardTpIntegrationEnum) | - &#39;1&#39; # Payment integrated with system, - &#39;2&#39; # Payment not integrated with system  |  [optional]
**cardCNPJ** | **String** | Federal tax id of accrediting card (credenciadora do cartão) |  [optional]
**cardBrand** | [**CardBrandEnum**](#CardBrandEnum) | card brand - &#39;01&#39; # Visa - &#39;02&#39; # Mastercard - &#39;03&#39; # American Express - &#39;04&#39; # Sorocred - &#39;99&#39; # Other  |  [optional]
**cardAuthorization** | **String** | transaction authorization number |  [optional]


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_05 | &quot;05&quot;
_10 | &quot;10&quot;
_11 | &quot;11&quot;
_12 | &quot;12&quot;
_13 | &quot;13&quot;
_99 | &quot;99&quot;


<a name="CardTpIntegrationEnum"></a>
## Enum: CardTpIntegrationEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;


<a name="CardBrandEnum"></a>
## Enum: CardBrandEnum
Name | Value
---- | -----
_01 | &quot;01&quot;
_02 | &quot;02&quot;
_03 | &quot;03&quot;
_04 | &quot;04&quot;
_99 | &quot;99&quot;



