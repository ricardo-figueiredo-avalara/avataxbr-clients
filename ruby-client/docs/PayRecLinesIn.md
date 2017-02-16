# SwaggerClient::PayRecLinesIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_code** | **Integer** | Installment number in this document | [optional] 
**line_type** | **String** |  | [optional] 
**item_code** | **String** | Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. | 
**item_description** | **String** | Free description about this payment | [optional] 
**item_doc_number** | **String** | Installment number, when paid AS IS | [optional] 
**line_untaxed_penality** | **Float** | Penalty, usually because paid after due date | [optional] 
**line_untaxed_discount** | **Float** | unconditional discounts | [optional] 


