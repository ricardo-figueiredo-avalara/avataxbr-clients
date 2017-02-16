# Br16Api.CalculatedTaxSummaryForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberOfLines** | **Number** | Count of lines | [optional] 
**taxedDiscount** | **Number** | sum of all line taxed discounts | [optional] 
**untaxedDiscount** | **Number** | sum of all line untaxed discounts | [optional] 
**subtotal** | **Number** | sum of all line lineAmount attribute | [optional] 
**totalTax** | **Number** | sum of all line tax attribute | [optional] 
**grandTotal** | **Number** | sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute | [optional] 
**taxByType** | [**CalculatedTaxSummaryForGoodsTaxByType**](CalculatedTaxSummaryForGoodsTaxByType.md) |  | [optional] 


