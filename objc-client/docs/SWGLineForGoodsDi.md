# SWGLineForGoodsDi

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customsValue** | **NSNumber*** | customs value, valor aduaneiro (II Block of NFe) | [optional] 
**diNumber** | **NSString*** | Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | 
**registerDateDI** | **NSDate*** | Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | 
**clearanceSite** | **NSString*** | Clerance Site Local do desembaraço aduaneiro  | 
**clearanceState** | [**SWGStateEnum***](SWGStateEnum.md) | Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro  | 
**clearanceDate** | **NSDate*** | Clerance date | [optional] 
**transportDIType** | **NSString*** | - &#39;1&#39; # Maritima - &#39;2&#39; # Fluvial - &#39;3&#39; # Lacustre - &#39;4&#39; # Aerea - &#39;5&#39; # Postal - &#39;6&#39; # Ferroviaria - &#39;7&#39; # Rodoviaria - &#39;8&#39; # Conduto - &#39;9&#39; # Meios Proprios - &#39;10&#39; # Entrada/Saida Ficta  | 
**afrmmValue** | **NSNumber*** | Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante]  | [optional] 
**intermediateType** | **NSString*** | - &#39;1&#39; # On One&#39;s Own [1-por conta propria] - &#39;2&#39; # On Behalf And Order [2-por conta e ordem] - &#39;3&#39; # Order [3-encomenda]  | 
**buyerFederalTaxID** | **NSString*** | Buyer federal tax id CNPJ do comprador ou encomendante  | [optional] 
**buyerState** | [**SWGStateEnum***](SWGStateEnum.md) | Buyer sate Estado do comprador ou encomendante  | [optional] 
**exporterCode** | **NSString*** | Exporter code | [optional] 
**adi** | [**NSArray&lt;SWGLineForGoodsAdi&gt;***](SWGLineForGoodsAdi.md) | aditional import declaration | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


