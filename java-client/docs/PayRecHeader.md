
# PayRecHeader

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39;  | 
**documentCode** | **String** | This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored |  [optional]
**currency** | **String** | currency code. &#39;BRL&#39; for Brazilian Reais. |  [optional]
**transactionDate** | [**LocalDate**](LocalDate.md) | This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed) | 
**taxCalculationDate** | [**LocalDate**](LocalDate.md) | accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions. |  [optional]
**paymentMode** | [**PaymentModeEnum**](#PaymentModeEnum) | - &#39;CALCULATE&#39; - &#39;ASIS&#39; When ASIS, the transaction is stored without executing tax determination (no Calculation).  | 


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
SALE | &quot;Sale&quot;
PURCHASE | &quot;Purchase&quot;
PAYMENT | &quot;Payment&quot;
RECEIPT | &quot;Receipt&quot;


<a name="PaymentModeEnum"></a>
## Enum: PaymentModeEnum
Name | Value
---- | -----
CALCULATE | &quot;CALCULATE&quot;
ASIS | &quot;ASIS&quot;



