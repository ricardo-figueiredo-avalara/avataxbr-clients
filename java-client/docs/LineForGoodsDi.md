
# LineForGoodsDi

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customsValue** | **Double** | customs value, valor aduaneiro (II Block of NFe) |  [optional]
**diNumber** | **String** | Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | 
**registerDateDI** | [**LocalDate**](LocalDate.md) | Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | 
**clearanceSite** | **String** | Clerance Site Local do desembaraço aduaneiro  | 
**clearanceState** | [**StateEnum**](StateEnum.md) | Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro  | 
**clearanceDate** | [**LocalDate**](LocalDate.md) | Clerance date |  [optional]
**transportDIType** | [**TransportDITypeEnum**](#TransportDITypeEnum) | - &#39;1&#39; # Maritima - &#39;2&#39; # Fluvial - &#39;3&#39; # Lacustre - &#39;4&#39; # Aerea - &#39;5&#39; # Postal - &#39;6&#39; # Ferroviaria - &#39;7&#39; # Rodoviaria - &#39;8&#39; # Conduto - &#39;9&#39; # Meios Proprios - &#39;10&#39; # Entrada/Saida Ficta  | 
**afrmmValue** | **Double** | Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante]  |  [optional]
**intermediateType** | [**IntermediateTypeEnum**](#IntermediateTypeEnum) | - &#39;1&#39; # On One&#39;s Own [1-por conta propria] - &#39;2&#39; # On Behalf And Order [2-por conta e ordem] - &#39;3&#39; # Order [3-encomenda]  | 
**buyerFederalTaxID** | **String** | Buyer federal tax id CNPJ do comprador ou encomendante  |  [optional]
**buyerState** | [**StateEnum**](StateEnum.md) | Buyer sate Estado do comprador ou encomendante  |  [optional]
**exporterCode** | **String** | Exporter code |  [optional]
**adi** | [**List&lt;LineForGoodsAdi&gt;**](LineForGoodsAdi.md) | aditional import declaration | 


<a name="TransportDITypeEnum"></a>
## Enum: TransportDITypeEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;
_4 | &quot;4&quot;
_5 | &quot;5&quot;
_6 | &quot;6&quot;
_7 | &quot;7&quot;
_8 | &quot;8&quot;
_9 | &quot;9&quot;
_10 | &quot;10&quot;


<a name="IntermediateTypeEnum"></a>
## Enum: IntermediateTypeEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_3 | &quot;3&quot;



