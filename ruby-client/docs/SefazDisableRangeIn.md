# SwaggerClient::SefazDisableRangeIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company_location** | **String** | This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity | [optional] 
**transaction_model** | **String** | This string indicates the type of transaction for which tax should be calculated. - &#39;55&#39; # Nota Fiscal Eletrônica (NF-e) - &#39;65&#39; # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e)  | [optional] 
**invoice_serial** | **Integer** | Invoice number, sequential unique by invoice serial (Número da nota fiscal)  | [optional] 
**year** | **Float** |  | [optional] 
**message** | **String** |  | [optional] 
**invoice_number_init** | **Float** | First number of disable range. | [optional] 
**invoice_number_end** | **Float** | Last number of disable range. | [optional] 


