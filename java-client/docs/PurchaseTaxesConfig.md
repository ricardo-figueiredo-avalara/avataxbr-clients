
# PurchaseTaxesConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityAccruableCOFINSTaxation** | [**EntityAccruableCOFINSTaxationEnum**](#EntityAccruableCOFINSTaxationEnum) | ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE&#x3D;0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE  |  [optional]
**entityAccruableCSLLTaxation** | [**EntityAccruableCSLLTaxationEnum**](#EntityAccruableCSLLTaxationEnum) | ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.   This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT  |  [optional]
**entityAccruablePISTaxation** | [**EntityAccruablePISTaxationEnum**](#EntityAccruablePISTaxationEnum) | ATTENTION SELLER POINT OF VIEW. There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. T TAXABLE, N NOT TAXABLE, Z TAXABLE WITH RATE&#x3D;0.00, E EXEMPT, H SUSPENDED, S SPECIFIC RATE - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE  |  [optional]
**accruableCOFINSExempCodeTaxation** | **String** | This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code. |  [optional]
**accruablePISExempCodeTaxation** | **String** | This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption. When not Taxable of Seller point of view this field has the reason code. |  [optional]
**accruablePISExemptReasonTaxation** | **String** | When Code is 999 the user system need send the custom reason to Exemption |  [optional]
**accruableCOFINSExemptReasonTaxation** | **String** | When Code is 999 the user system need send the custom reason to Exemption |  [optional]
**accruableCSLLExemptReasonTaxation** | **String** | CSLL no withholding Custom Reason |  [optional]
**withholdingPIS** | **Boolean** | Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings. |  [optional]
**withholdingCOFINS** | **Boolean** | Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings. |  [optional]
**withholdingCSLL** | **Boolean** | Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings. |  [optional]
**withholdingIRRF** | **Boolean** | Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings. |  [optional]
**withholdCOFINSExemptReasonTaxation** | **String** | COFINS no withholding Custom Reason |  [optional]
**withholdCSLLExemptReasonTaxation** | **String** | CSLL no withholding Custom Reason |  [optional]
**withholdPISExemptReasonTaxation** | **String** | PIS no withholding Custom Reason |  [optional]


<a name="EntityAccruableCOFINSTaxationEnum"></a>
## Enum: EntityAccruableCOFINSTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
N | &quot;N&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
S | &quot;S&quot;


<a name="EntityAccruableCSLLTaxationEnum"></a>
## Enum: EntityAccruableCSLLTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
E | &quot;E&quot;


<a name="EntityAccruablePISTaxationEnum"></a>
## Enum: EntityAccruablePISTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
N | &quot;N&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
S | &quot;S&quot;



