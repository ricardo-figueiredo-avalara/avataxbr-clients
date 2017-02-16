
# CalculatedTaxSummaryForGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numberOfLines** | **Integer** | Count of lines |  [optional]
**taxedDiscount** | **Double** | sum of all line taxed discounts |  [optional]
**untaxedDiscount** | **Double** | sum of all line untaxed discounts |  [optional]
**subtotal** | **Double** | sum of all line lineAmount attribute |  [optional]
**totalTax** | **Double** | sum of all line tax attribute |  [optional]
**grandTotal** | **Double** | sum of all line lineAmount attribute + sum of all line tax attribute not VAT - sum of all line lineTaxedDiscount attribute |  [optional]
**taxByType** | [**CalculatedTaxSummaryForGoodsTaxByType**](CalculatedTaxSummaryForGoodsTaxByType.md) |  |  [optional]



