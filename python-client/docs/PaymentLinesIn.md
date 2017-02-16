# PaymentLinesIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_code** | **int** | Installment number in this document | [optional] 
**line_type** | **str** |  | [optional] 
**item_code** | **str** | Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. | 
**item_description** | **str** | Free description about this payment | [optional] 
**item_doc_number** | **str** | Installment number, when paid AS IS | [optional] 
**line_untaxed_penality** | **float** | Penalty, usually because paid after due date | [optional] 
**line_untaxed_discount** | **float** | unconditional discounts | [optional] 
**line_net_value** | **float** | Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


