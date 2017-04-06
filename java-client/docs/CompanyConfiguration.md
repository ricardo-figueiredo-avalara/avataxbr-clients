
# CompanyConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate** | **String** | digital certificate A1 model, p12, encoded by base64 |  [optional]
**certificatepwd** | **String** | certificate password |  [optional]
**certificateexpiration** | [**DateTime**](DateTime.md) | expiration date of this certificate |  [optional]
**logo** | **String** | company logo image encoded by base64 |  [optional]
**tpImpNFe** | [**TpImpNFeEnum**](#TpImpNFeEnum) | how the document will be printed - &#39;0&#39; # without DANFE; - &#39;1&#39; # DANFe Letter; - &#39;2&#39; # DANFe Landscape;  |  [optional]
**tpImpNFCe** | [**TpImpNFCeEnum**](#TpImpNFCeEnum) | how the document will be printed - &#39;0&#39; # without DANFE; - &#39;4&#39; # DANFe NFC-e; - &#39;5&#39; # DANFe NFC-e e-mail  |  [optional]


<a name="TpImpNFeEnum"></a>
## Enum: TpImpNFeEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;


<a name="TpImpNFCeEnum"></a>
## Enum: TpImpNFCeEnum
Name | Value
---- | -----
_0 | &quot;0&quot;
_4 | &quot;4&quot;
_5 | &quot;5&quot;



