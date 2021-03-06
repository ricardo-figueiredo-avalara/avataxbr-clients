# AvaTaxBrazil.PayRecHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | **String** | This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39;  | 
**documentCode** | **String** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored | [optional] 
**currency** | **String** | currency code. &#39;BRL&#39; for Brazilian Reais. | [optional] 
**transactionDate** | **Date** | This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) | 
**taxCalculationDate** | **Date** | accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. | [optional] 
**paymentMode** | **String** | - &#39;CALCULATE&#39; - &#39;ASIS&#39; When ASIS, the transaction is stored without executing tax determination (no Calculation).  | 


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum


* `Sale` (value: `"Sale"`)

* `Purchase` (value: `"Purchase"`)

* `Payment` (value: `"Payment"`)

* `Receipt` (value: `"Receipt"`)




<a name="PaymentModeEnum"></a>
## Enum: PaymentModeEnum


* `CALCULATE` (value: `"CALCULATE"`)

* `ASIS` (value: `"ASIS"`)




