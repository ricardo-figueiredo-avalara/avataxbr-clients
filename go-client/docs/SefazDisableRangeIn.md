# SefazDisableRangeIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CompanyLocation** | **string** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | [optional] [default to null]
**TransactionModel** | **string** | This string indicates the type of transaction for which tax should be calculated. - &#39;55&#39; # Nota Fiscal Eletrônica (NF-e) - &#39;65&#39; # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e)  | [optional] [default to null]
**InvoiceSerial** | **int32** | Invoice number, sequential unique by invoice serial (Número da nota fiscal)  | [optional] [default to null]
**Year** | **float32** |  | [optional] [default to null]
**Message** | **string** |  | [optional] [default to null]
**InvoiceNumberInit** | **float32** | First number of disable range. | [optional] [default to null]
**InvoiceNumberEnd** | **float32** | Last number of disable range. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


