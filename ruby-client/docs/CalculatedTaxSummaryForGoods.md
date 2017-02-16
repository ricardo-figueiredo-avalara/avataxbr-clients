# SwaggerClient::CalculatedTaxSummaryForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**number_of_lines** | **Integer** | Count of lines | [optional] 
**taxed_discount** | **Float** | sum of all line taxed discounts | [optional] 
**untaxed_discount** | **Float** | sum of all line untaxed discounts | [optional] 
**subtotal** | **Float** | sum of all line lineAmount attribute | [optional] 
**total_tax** | **Float** | sum of all line tax attribute | [optional] 
**grand_total** | **Float** | sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute | [optional] 
**tax_by_type** | [**CalculatedTaxSummaryForGoodsTaxByType**](CalculatedTaxSummaryForGoodsTaxByType.md) |  | [optional] 


