# IO.Swagger.Model.LineForGoodsDi
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomsValue** | **double?** | customs value, valor aduaneiro (II Block of NFe) | [optional] [default to null]
**DiNumber** | **string** | Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | [default to null]
**RegisterDateDI** | **DateTime?** | Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | [default to null]
**ClearanceSite** | **string** | Clerance Site Local do desembaraço aduaneiro  | [default to null]
**ClearanceState** | [**StateEnum**](StateEnum.md) | Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro  | [default to null]
**ClearanceDate** | **DateTime?** | Clerance date | [optional] [default to null]
**TransportDIType** | **string** | - &#39;1&#39; # Maritima - &#39;2&#39; # Fluvial - &#39;3&#39; # Lacustre - &#39;4&#39; # Aerea - &#39;5&#39; # Postal - &#39;6&#39; # Ferroviaria - &#39;7&#39; # Rodoviaria - &#39;8&#39; # Conduto - &#39;9&#39; # Meios Proprios - &#39;10&#39; # Entrada/Saida Ficta  | [default to null]
**AfrmmValue** | **double?** | Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante]  | [optional] [default to null]
**IntermediateType** | **string** | - &#39;1&#39; # On One&#39;s Own [1-por conta propria] - &#39;2&#39; # On Behalf And Order [2-por conta e ordem] - &#39;3&#39; # Order [3-encomenda]  | [default to null]
**BuyerFederalTaxID** | **string** | Buyer federal tax id CNPJ do comprador ou encomendante  | [optional] [default to null]
**BuyerState** | [**StateEnum**](StateEnum.md) | Buyer sate Estado do comprador ou encomendante  | [optional] [default to null]
**ExporterCode** | **string** | Exporter code | [optional] [default to null]
**Adi** | [**List&lt;LineForGoodsAdi&gt;**](LineForGoodsAdi.md) | aditional import declaration | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

