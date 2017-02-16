# PayRecLinesOut

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_code** | **int** | Installment number in this document | [optional] 
**line_type** | **string** |  | [optional] 
**item_code** | **string** | Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. | 
**item_description** | **string** | Free description about this payment | [optional] 
**item_doc_number** | **string** | Installment number, when paid AS IS | [optional] 
**line_untaxed_penality** | **double** | Penalty, usually because paid after due date | [optional] 
**line_untaxed_discount** | **double** | unconditional discounts | [optional] 
**line_amount** | **double** | GrossAmount of this installment line | [optional] 
**line_net_value** | **double** | Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes | [optional] 
**withholding_mode** | [**\Swagger\Client\Model\WithholdingMode**](WithholdingMode.md) | x is because not subject of this tax independent of Threshold | [optional] 
**calculated_tax** | [**\Swagger\Client\Model\PaymentCalculatedTax**](PaymentCalculatedTax.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


