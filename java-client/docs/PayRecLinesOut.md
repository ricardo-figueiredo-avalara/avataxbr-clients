
# PayRecLinesOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineCode** | **Integer** | Installment number in this document |  [optional]
**lineType** | [**LineTypeEnum**](#LineTypeEnum) |  |  [optional]
**itemCode** | **String** | Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. | 
**itemDescription** | **String** | Free description about this payment |  [optional]
**itemDocNumber** | **String** | Installment number, when paid AS IS |  [optional]
**lineUntaxedPenality** | **Double** | Penalty, usually because paid after due date |  [optional]
**lineUntaxedDiscount** | **Double** | unconditional discounts |  [optional]
**lineAmount** | **Double** | GrossAmount of this installment line |  [optional]
**lineNetValue** | **Double** | Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes |  [optional]
**withholdingMode** | [**WithholdingMode**](WithholdingMode.md) | x is because not subject of this tax independent of Threshold |  [optional]
**calculatedTax** | [**PaymentCalculatedTax**](PaymentCalculatedTax.md) |  |  [optional]


<a name="LineTypeEnum"></a>
## Enum: LineTypeEnum
Name | Value
---- | -----
INSTALLMENT | &quot;installment&quot;



