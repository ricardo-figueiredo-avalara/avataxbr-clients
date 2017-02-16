# Br16Api.SalesHeaderOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discriminationOut** | **String** | Invoice discrimination, it is discriminationIn plus automatic messages | [optional] 
**xml** | **String** | RPS XML or NFSe XML generated, when the client system doesn&#39;t have EDI with government then BR16 return RPS when transaction is created. | [optional] 
**ediSyncState** | **String** | Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - &#39;STORED&#39; - &#39;WAITING APPROVAL&#39; - &#39;AUTHORIZED&#39; - &#39;AUTHORIZED with NOTE&#39; - &#39;ERROR&#39; - &#39;CANCELED REPLACED&#39; - &#39;CANCELED&#39; - &#39;CANCELLATION REQUESTED&#39;  | [optional] 
**payment** | [**SalesHeaderOutPayment**](SalesHeaderOutPayment.md) |  | [optional] 


<a name="EdiSyncStateEnum"></a>
## Enum: EdiSyncStateEnum


* `STORED` (value: `"STORED"`)

* `WAITING APPROVAL` (value: `"WAITING APPROVAL"`)

* `AUTHORIZED` (value: `"AUTHORIZED"`)

* `AUTHORIZED with NOTE` (value: `"AUTHORIZED with NOTE"`)

* `ERROR` (value: `"ERROR"`)

* `CANCELED REPLACED` (value: `"CANCELED REPLACED"`)

* `CANCELED` (value: `"CANCELED"`)

* `CANCELLATION REQUESTED` (value: `"CANCELLATION REQUESTED"`)




