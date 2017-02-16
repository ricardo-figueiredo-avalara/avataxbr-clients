# LineForGoodsDi

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customs_value** | **double** | customs value, valor aduaneiro (II Block of NFe) | [optional] 
**di_number** | **string** | Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | 
**register_date_di** | [**\DateTime**](Date.md) | Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | 
**clearance_site** | **string** | Clerance Site Local do desembaraço aduaneiro | 
**clearance_state** | [**\Swagger\Client\Model\StateEnum**](StateEnum.md) | Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro | 
**clearance_date** | [**\DateTime**](Date.md) | Clerance date | [optional] 
**transport_di_type** | **string** | - &#39;1&#39; # Maritima - &#39;2&#39; # Fluvial - &#39;3&#39; # Lacustre - &#39;4&#39; # Aerea - &#39;5&#39; # Postal - &#39;6&#39; # Ferroviaria - &#39;7&#39; # Rodoviaria - &#39;8&#39; # Conduto - &#39;9&#39; # Meios Proprios - &#39;10&#39; # Entrada/Saida Ficta | 
**afrmm_value** | **double** | Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] | [optional] 
**intermediate_type** | **string** | - &#39;1&#39; # On One&#39;s Own [1-por conta propria] - &#39;2&#39; # On Behalf And Order [2-por conta e ordem] - &#39;3&#39; # Order [3-encomenda] | 
**buyer_federal_tax_id** | **string** | Buyer federal tax id CNPJ do comprador ou encomendante | [optional] 
**buyer_state** | [**\Swagger\Client\Model\StateEnum**](StateEnum.md) | Buyer sate Estado do comprador ou encomendante | [optional] 
**exporter_code** | **string** | Exporter code | [optional] 
**adi** | [**\Swagger\Client\Model\LineForGoodsAdi[]**](LineForGoodsAdi.md) | aditional import declaration | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


