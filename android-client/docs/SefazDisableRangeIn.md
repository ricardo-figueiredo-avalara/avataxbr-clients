
# SefazDisableRangeIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**companyLocation** | **String** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity |  [optional]
**transactionModel** | [**TransactionModelEnum**](#TransactionModelEnum) | This string indicates the type of transaction for which tax should be calculated. - &#39;55&#39; # Nota Fiscal Eletrônica (NF-e) - &#39;65&#39; # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e)  |  [optional]
**invoiceSerial** | **Integer** | Invoice number, sequential unique by invoice serial (Número da nota fiscal)  |  [optional]
**year** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**message** | **String** |  |  [optional]
**invoiceNumberInit** | [**BigDecimal**](BigDecimal.md) | First number of disable range. |  [optional]
**invoiceNumberEnd** | [**BigDecimal**](BigDecimal.md) | Last number of disable range. |  [optional]


<a name="TransactionModelEnum"></a>
## Enum: TransactionModelEnum
Name | Value
---- | -----



