# SwaggerClient::PurchaseCalculatedTaxSummaryForService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_of_lines** | **Integer** | Count of lines | [optional] 
**subtotal** | **Float** | sum of all line tax attribute | [optional] 
**total_tax** | **Float** | sum of all line lineAmount attribute | [optional] 
**grand_total** | **Float** | sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute | [optional] 
**tax_by_type** | [**PurchaseCalculatedTaxSummaryForServiceTaxByType**](PurchaseCalculatedTaxSummaryForServiceTaxByType.md) |  | [optional] 


