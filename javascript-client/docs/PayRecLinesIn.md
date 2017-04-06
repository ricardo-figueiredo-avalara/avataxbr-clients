# AvaTaxBrazil.PayRecLinesIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineCode** | **Number** | Installment number in this document | [optional] 
**lineType** | **String** |  | [optional] 
**itemCode** | **String** | Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. | 
**itemDescription** | **String** | Free description about this payment | [optional] 
**itemDocNumber** | **String** | Installment number, when paid AS IS | [optional] 
**lineUntaxedPenality** | **Number** | Penalty, usually because paid after due date | [optional] 
**lineUntaxedDiscount** | **Number** | unconditional discounts | [optional] 


<a name="LineTypeEnum"></a>
## Enum: LineTypeEnum


* `installment` (value: `"installment"`)




