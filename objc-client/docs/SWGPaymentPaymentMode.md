# SWGPaymentPaymentMode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | **NSString*** | Payment mode - &#39;01&#39; # Dinheiro - &#39;02&#39; # Cheque - &#39;03&#39; # Cartão de Crédito - &#39;04&#39; # Cartão de Débito - &#39;05&#39; # Crédito Loja - &#39;10&#39; # Vale Alimentação - &#39;11&#39; # Vale Refeição - &#39;12&#39; # Vale Presente - &#39;13&#39; # Vale Combustível - &#39;99&#39; # Outros  | 
**value** | **NSNumber*** | payment value | 
**cardTpIntegration** | **NSString*** | - &#39;1&#39; # Payment integrated with system, - &#39;2&#39; # Payment not integrated with system  | [optional] 
**cardCNPJ** | **NSString*** | Federal tax id of accrediting card (credenciadora do cartão) | [optional] 
**cardBrand** | **NSString*** | card brand - &#39;01&#39; # Visa - &#39;02&#39; # Mastercard - &#39;03&#39; # American Express - &#39;04&#39; # Sorocred - &#39;99&#39; # Other  | [optional] 
**cardAuthorization** | **NSString*** | transaction authorization number | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


