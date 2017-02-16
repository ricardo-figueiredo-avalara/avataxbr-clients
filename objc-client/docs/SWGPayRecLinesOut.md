# SWGPayRecLinesOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lineCode** | **NSNumber*** | Installment number in this document | [optional] 
**lineType** | **NSString*** |  | [optional] 
**itemCode** | **NSString*** | Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. | 
**itemDescription** | **NSString*** | Free description about this payment | [optional] 
**itemDocNumber** | **NSString*** | Installment number, when paid AS IS | [optional] 
**lineUntaxedPenality** | **NSNumber*** | Penalty, usually because paid after due date | [optional] 
**lineUntaxedDiscount** | **NSNumber*** | unconditional discounts | [optional] 
**lineAmount** | **NSNumber*** | GrossAmount of this installment line | [optional] 
**lineNetValue** | **NSNumber*** | Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes | [optional] 
**withholdingMode** | [**SWGWithholdingMode***](SWGWithholdingMode.md) | x is because not subject of this tax independent of Threshold | [optional] 
**calculatedTax** | [**SWGPaymentCalculatedTax***](SWGPaymentCalculatedTax.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


