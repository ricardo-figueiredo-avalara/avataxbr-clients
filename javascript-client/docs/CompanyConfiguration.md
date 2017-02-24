# AvaTaxBrazil.CompanyConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate** | **String** | digital certificate A1 model, p12, encoded by base64 | [optional] 
**certificatepwd** | **String** | certificate password | [optional] 
**certificateexpiration** | **Date** | expiration date of this certificate | [optional] 
**logo** | **String** | company logo image encoded by base64 | [optional] 
**tpImpNFe** | **String** | how the document will be printed - &#39;0&#39; # without DANFE; - &#39;1&#39; # DANFe Letter; - &#39;2&#39; # DANFe Landscape;  | [optional] 
**tpImpNFCe** | **String** | how the document will be printed - &#39;0&#39; # without DANFE; - &#39;4&#39; # DANFe NFC-e; - &#39;5&#39; # DANFe NFC-e e-mail  | [optional] 


<a name="TpImpNFeEnum"></a>
## Enum: TpImpNFeEnum


* `0` (value: `"0"`)

* `1` (value: `"1"`)

* `2` (value: `"2"`)




<a name="TpImpNFCeEnum"></a>
## Enum: TpImpNFCeEnum


* `0` (value: `"0"`)

* `4` (value: `"4"`)

* `5` (value: `"5"`)




