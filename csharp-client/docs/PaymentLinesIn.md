# IO.Swagger.Model.PaymentLinesIn
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LineCode** | **int?** | Installment number in this document | [optional] 
**LineType** | **string** |  | [optional] 
**ItemCode** | **string** | Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. | 
**ItemDescription** | **string** | Free description about this payment | [optional] 
**ItemDocNumber** | **string** | Installment number, when paid AS IS | [optional] 
**LineUntaxedPenality** | **double?** | Penalty, usually because paid after due date | [optional] 
**LineUntaxedDiscount** | **double?** | unconditional discounts | [optional] 
**LineNetValue** | **double?** | Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

