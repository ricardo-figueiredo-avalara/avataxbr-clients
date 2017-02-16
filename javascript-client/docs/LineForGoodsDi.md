# Br16Api.LineForGoodsDi

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customsValue** | **Number** | customs value, valor aduaneiro (II Block of NFe) | [optional] 
**diNumber** | **String** | Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | 
**registerDateDI** | **Date** | Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) | 
**clearanceSite** | **String** | Clerance Site Local do desembaraço aduaneiro  | 
**clearanceState** | [**StateEnum**](StateEnum.md) | Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro  | 
**clearanceDate** | **Date** | Clerance date | [optional] 
**transportDIType** | **String** | - &#39;1&#39; # Maritima - &#39;2&#39; # Fluvial - &#39;3&#39; # Lacustre - &#39;4&#39; # Aerea - &#39;5&#39; # Postal - &#39;6&#39; # Ferroviaria - &#39;7&#39; # Rodoviaria - &#39;8&#39; # Conduto - &#39;9&#39; # Meios Proprios - &#39;10&#39; # Entrada/Saida Ficta  | 
**afrmmValue** | **Number** | Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante]  | [optional] 
**intermediateType** | **String** | - &#39;1&#39; # On One&#39;s Own [1-por conta propria] - &#39;2&#39; # On Behalf And Order [2-por conta e ordem] - &#39;3&#39; # Order [3-encomenda]  | 
**buyerFederalTaxID** | **String** | Buyer federal tax id CNPJ do comprador ou encomendante  | [optional] 
**buyerState** | [**StateEnum**](StateEnum.md) | Buyer sate Estado do comprador ou encomendante  | [optional] 
**exporterCode** | **String** | Exporter code | [optional] 
**adi** | [**[LineForGoodsAdi]**](LineForGoodsAdi.md) | aditional import declaration | 


<a name="TransportDITypeEnum"></a>
## Enum: TransportDITypeEnum


* `1` (value: `"1"`)

* `2` (value: `"2"`)

* `3` (value: `"3"`)

* `4` (value: `"4"`)

* `5` (value: `"5"`)

* `6` (value: `"6"`)

* `7` (value: `"7"`)

* `8` (value: `"8"`)

* `9` (value: `"9"`)

* `10` (value: `"10"`)




<a name="IntermediateTypeEnum"></a>
## Enum: IntermediateTypeEnum


* `1` (value: `"1"`)

* `2` (value: `"2"`)

* `3` (value: `"3"`)




