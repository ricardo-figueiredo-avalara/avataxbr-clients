# Company

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** | string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company | [default to null]
**OfficialName** | **string** | Official Company name (Razão Social) | [default to null]
**Name** | **string** | Company name (DBA - Nome de Fantasia),  Used to identify branches/subsidiaries with same name | [default to null]
**EntityType** | [**EntityType**](EntityType.md) |  | [default to null]
**SubjectToSRF1234** | **bool** | Company has participation of state-owned capital (it will be considerated like a government entity) | [optional] [default to null]
**FederalTaxRegime** | [**FederalTaxRegime**](FederalTaxRegime.md) |  | [default to null]
**PisSubjectTo** | **string** | this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn&#39;t mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules.  | [optional] [default to null]
**CofinsSubjectTo** | **string** | this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn&#39;t mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules.  | [optional] [default to null]
**CsllSubjectTo** | **string** | this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn&#39;t mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules.  | [optional] [default to null]
**ReceiptsAreFullNoCumulativePisCofins** | **bool** | When th company is REAL PROFIT usually it operates under a Non-Cumulative PIS/COFINS regime But exist some services that are always Cumulative regime. If the company has all receipts from Non-Cumulative services this flag will be set to True. This flag informs special conditions to credit of PIS/COFINS when this company is out of Free zone and  purchases from Free Zone Company Quando uma empresa fora da Zona Franca adquire uma produto ou serviço de uma empresa situada na Zona Franca de Manaus, o crédito de PIS E COFINS segue estas aliquotas diferenciadas. Fundamentação, art. 5º da Instrução Normativa SRF nº 546/2005; art. 3º, § 12 da Lei nº 10.637/2002; art. 3º, § 17 da Lei nº 10.833/2003; art. 4º da Lei nº 11.307/2006. DESTINATÁRIO ALÍQUOTAS PIS COFINS a) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure a Contribuição para o PIS/PASEP no regime de não-cumulatividade débito 0,65% 3% crédito 1% 4,6% c) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure o imposto de renda com base no lucro real e que tenha sua receita, total ou parcialmente, excluída do regime de incidência não-cumulativa da Contribuição para o PIS/PASEP débito 1,3% 6% crédito 1,65% 7,6%  | [optional] [default to null]
**InssWithholdSubjectTo** | **bool** | On purchase transaction, to force withholding INSS this Flag can be set to True | [optional] [default to null]
**IssWithholdSubjectTo** | **bool** | On purchase transaction, to force withhold ISS this Flag can be set to True | [optional] [default to null]
**IrrfWithholdSubjectTo** | **bool** | On purchase transaction, if this flag is FALSE, the system will not withhold IRRF. if this flag is TRUE the system will analise other rules to define if will have witholding  | [optional] [default to null]
**IcmsRateForSimplestaxregime** | **float64** | Actual ICMS Rate for this company (if the company is Tax Regime Simplified). Aliquota de ICMS da companhia caso Optante do Simples  | [optional] [default to null]
**IsExemptByGrossRevenueForSimplestaxregime** | **bool** | ICMS Exempt when Tax Regime is Simplified because total gross revenue is bellow amount defined by state (see PARANÁ State) Isenção do ICMS no Simples Nacional para faixa de receita bruta  | [optional] [default to null]
**Configuration** | [**CompanyConfiguration**](Company_configuration.md) |  | [optional] [default to null]
**MailServer** | [**CompanyMailServer**](Company_mailServer.md) |  | [optional] [default to null]
**AuthorizedToDownloadNFe** | [**[]CompanyAuthorizedToDownloadNFe**](Company_authorizedToDownloadNFe.md) | Person or company authorized to downloadNFe | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


