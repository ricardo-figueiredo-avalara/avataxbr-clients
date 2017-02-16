# Go API client for swagger

This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

## Overview
This API client was generated by the [swagger-codegen](https://github.com/swagger-api/swagger-codegen) project.  By using the [swagger-spec](https://github.com/swagger-api/swagger-spec) from a remote server, you can easily generate an API client.

- API version: 1.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.GoClientCodegen

## Installation
Put the package under your project folder and add the following in import:
```
    "./swagger"
```

## Documentation for API Endpoints

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AGASTApi* | [**AgastsCodeGet**](docs/AGASTApi.md#agastscodeget) | **Get** /agasts/{code} | 
*AGASTApi* | [**CreateAgast**](docs/AGASTApi.md#createagast) | **Post** /agasts | Create agast
*AGASTApi* | [**DeleteAgast**](docs/AGASTApi.md#deleteagast) | **Delete** /agasts/{code} | 
*AGASTApi* | [**GetAgastList**](docs/AGASTApi.md#getagastlist) | **Get** /agasts | 
*AGASTApi* | [**UpdateAgast**](docs/AGASTApi.md#updateagast) | **Put** /agasts/{code} | Update agast
*AccountApi* | [**AccountsAccountIdCompaniesGet**](docs/AccountApi.md#accountsaccountidcompaniesget) | **Get** /accounts/{accountId}/companies | Retrieve Companies by account
*AccountApi* | [**CreateAccountCompany**](docs/AccountApi.md#createaccountcompany) | **Post** /accounts/{accountId}/companies | Create company and your data configuration
*AddressApi* | [**GetZipCode**](docs/AddressApi.md#getzipcode) | **Get** /addresses/{zipcode} | 
*AuthApi* | [**AuthPost**](docs/AuthApi.md#authpost) | **Post** /auth | authorization
*CompanyApi* | [**CompaniesGet**](docs/CompanyApi.md#companiesget) | **Get** /companies | Retrieve Companies by account
*CompanyApi* | [**CreateCompany**](docs/CompanyApi.md#createcompany) | **Post** /companies | Create company and your data configuration
*CompanyApi* | [**DeleteAccountCompany**](docs/CompanyApi.md#deleteaccountcompany) | **Delete** /accounts/{accountId}/companies/{companyId} | 
*CompanyApi* | [**DeleteCompany**](docs/CompanyApi.md#deletecompany) | **Delete** /companies/{companyId} | 
*CompanyApi* | [**InfoCompany**](docs/CompanyApi.md#infocompany) | **Get** /companies/{companyId} | Get company information and your data configuration
*CompanyApi* | [**UpdateCompany**](docs/CompanyApi.md#updatecompany) | **Put** /companies/{companyId} | Update company information and your data configuration
*CompanyAGASTApi* | [**CompaniesCompanyIdAgastsCodeGet**](docs/CompanyAGASTApi.md#companiescompanyidagastscodeget) | **Get** /companies/{companyId}/agasts/{code} | 
*CompanyAGASTApi* | [**CompaniesCompanyIdAgastsGet**](docs/CompanyAGASTApi.md#companiescompanyidagastsget) | **Get** /companies/{companyId}/agasts | 
*CompanyAGASTApi* | [**CreateCustomAgast**](docs/CompanyAGASTApi.md#createcustomagast) | **Post** /companies/{companyId}/agasts | Create custom agast for one company
*CompanyAGASTApi* | [**DeleteAgast**](docs/CompanyAGASTApi.md#deleteagast) | **Delete** /companies/{companyId}/agasts/{code} | 
*CompanyAGASTApi* | [**UpdateCustomAgast**](docs/CompanyAGASTApi.md#updatecustomagast) | **Put** /companies/{companyId}/agasts/{code} | Update custom agast for one company
*CompanyFilesApi* | [**CompaniesCompanyIdNfseCertificateDelete**](docs/CompanyFilesApi.md#companiescompanyidnfsecertificatedelete) | **Delete** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**CompaniesCompanyIdNfseCertificateGet**](docs/CompanyFilesApi.md#companiescompanyidnfsecertificateget) | **Get** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**CompaniesCompanyIdNfseCertificatePost**](docs/CompanyFilesApi.md#companiescompanyidnfsecertificatepost) | **Post** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**CompaniesCompanyIdNfseCertificatePut**](docs/CompanyFilesApi.md#companiescompanyidnfsecertificateput) | **Put** /companies/{companyId}/nfse-certificate | 
*CompanyICMSApi* | [**CompaniesCompanyIdIcmsGet**](docs/CompanyICMSApi.md#companiescompanyidicmsget) | **Get** /companies/{companyId}/icms | 
*CompanyICMSApi* | [**CompaniesCompanyIdIcmsStateGet**](docs/CompanyICMSApi.md#companiescompanyidicmsstateget) | **Get** /companies/{companyId}/icms/{state} | 
*CompanyICMSApi* | [**CreateICMS**](docs/CompanyICMSApi.md#createicms) | **Post** /companies/{companyId}/icms | Create custom ICMS tax for one company
*CompanyICMSApi* | [**DeleteCustomIcmsConfByState**](docs/CompanyICMSApi.md#deletecustomicmsconfbystate) | **Delete** /companies/{companyId}/icms/{state} | 
*CompanyICMSApi* | [**UpdateCustomIcmsConfByState**](docs/CompanyICMSApi.md#updatecustomicmsconfbystate) | **Put** /companies/{companyId}/icms/{state} | Update custom agast for one company
*CompanyItemCPOMServiceApi* | [**CompaniesCompanyIdItemsCodeCpomCityCodeGet**](docs/CompanyItemCPOMServiceApi.md#companiescompanyiditemscodecpomcitycodeget) | **Get** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*CompanyItemCPOMServiceApi* | [**CompaniesCompanyIdItemsCodeCpomGet**](docs/CompanyItemCPOMServiceApi.md#companiescompanyiditemscodecpomget) | **Get** /companies/{companyId}/items/{code}/cpom | 
*CompanyItemCPOMServiceApi* | [**CreateItemCPOM**](docs/CompanyItemCPOMServiceApi.md#createitemcpom) | **Post** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
*CompanyItemCPOMServiceApi* | [**DeleteItemCPOM**](docs/CompanyItemCPOMServiceApi.md#deleteitemcpom) | **Delete** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*CompanyItemCPOMServiceApi* | [**UpdateItemCPOM**](docs/CompanyItemCPOMServiceApi.md#updateitemcpom) | **Put** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company
*CompanyItemGoodsApi* | [**CompaniesCompanyIdItemsCodeChangeCodePut**](docs/CompanyItemGoodsApi.md#companiescompanyiditemscodechangecodeput) | **Put** /companies/{companyId}/items/{code}/change-code | 
*CompanyItemGoodsApi* | [**CompaniesCompanyIdItemsCodegoodsGet**](docs/CompanyItemGoodsApi.md#companiescompanyiditemscodegoodsget) | **Get** /companies/{companyId}/items/{code}?goods | 
*CompanyItemGoodsApi* | [**CompaniesCompanyIdItemsgoodsGet**](docs/CompanyItemGoodsApi.md#companiescompanyiditemsgoodsget) | **Get** /companies/{companyId}/items?goods | 
*CompanyItemGoodsApi* | [**CreateItem**](docs/CompanyItemGoodsApi.md#createitem) | **Post** /companies/{companyId}/items?goods | Create custom agast for one company
*CompanyItemGoodsApi* | [**DeleteItem**](docs/CompanyItemGoodsApi.md#deleteitem) | **Delete** /companies/{companyId}/items/{code}?goods | 
*CompanyItemGoodsApi* | [**UpdateItem**](docs/CompanyItemGoodsApi.md#updateitem) | **Put** /companies/{companyId}/items/{code}?goods | Update custom agast for one company
*CompanyItemServiceApi* | [**CompaniesCompanyIdItemsCodeChangeCodePut**](docs/CompanyItemServiceApi.md#companiescompanyiditemscodechangecodeput) | **Put** /companies/{companyId}/items/{code}/change-code | 
*CompanyItemServiceApi* | [**CompaniesCompanyIdItemsCodeserviceGet**](docs/CompanyItemServiceApi.md#companiescompanyiditemscodeserviceget) | **Get** /companies/{companyId}/items/{code}?service | 
*CompanyItemServiceApi* | [**CompaniesCompanyIdItemsserviceGet**](docs/CompanyItemServiceApi.md#companiescompanyiditemsserviceget) | **Get** /companies/{companyId}/items?service | 
*CompanyItemServiceApi* | [**CreateItemService**](docs/CompanyItemServiceApi.md#createitemservice) | **Post** /companies/{companyId}/items?service | Create custom agast for one company
*CompanyItemServiceApi* | [**DeleteItemService**](docs/CompanyItemServiceApi.md#deleteitemservice) | **Delete** /companies/{companyId}/items/{code}?service | 
*CompanyItemServiceApi* | [**UpdateItemService**](docs/CompanyItemServiceApi.md#updateitemservice) | **Put** /companies/{companyId}/items/{code}?service | Update custom agast for one company
*CompanyLocationApi* | [**CompaniesCompanyIdLocationsCodeGet**](docs/CompanyLocationApi.md#companiescompanyidlocationscodeget) | **Get** /companies/{companyId}/locations/{code} | 
*CompanyLocationApi* | [**CompaniesCompanyIdLocationsGet**](docs/CompanyLocationApi.md#companiescompanyidlocationsget) | **Get** /companies/{companyId}/locations | 
*CompanyLocationApi* | [**CreateLocation**](docs/CompanyLocationApi.md#createlocation) | **Post** /companies/{companyId}/locations | Create new location for company
*CompanyLocationApi* | [**DeleteLocation**](docs/CompanyLocationApi.md#deletelocation) | **Delete** /companies/{companyId}/locations/{code} | 
*CompanyLocationApi* | [**UpdateLocation**](docs/CompanyLocationApi.md#updatelocation) | **Put** /companies/{companyId}/locations/{code} | Update location for company
*CompanyProcessApi* | [**CompaniesCompanyIdProcessCodeGet**](docs/CompanyProcessApi.md#companiescompanyidprocesscodeget) | **Get** /companies/{companyId}/process/{code} | 
*CompanyProcessApi* | [**CompaniesCompanyIdProcessGet**](docs/CompanyProcessApi.md#companiescompanyidprocessget) | **Get** /companies/{companyId}/process | 
*CompanyProcessApi* | [**CreateCustomProcessScenario**](docs/CompanyProcessApi.md#createcustomprocessscenario) | **Post** /companies/{companyId}/process | Create custom process tax for one company
*CompanyProcessApi* | [**DeleteCustomProcessScenario**](docs/CompanyProcessApi.md#deletecustomprocessscenario) | **Delete** /companies/{companyId}/process/{code} | 
*CompanyProcessApi* | [**UpdateCustomProcessScenario**](docs/CompanyProcessApi.md#updatecustomprocessscenario) | **Put** /companies/{companyId}/process/{code} | Update custom agast for one company
*CompanyTaxRatesApi* | [**CompaniesCompanyIdTaxratesGet**](docs/CompanyTaxRatesApi.md#companiescompanyidtaxratesget) | **Get** /companies/{companyId}/taxrates | 
*CompanyTaxRatesApi* | [**CompaniesCompanyIdTaxratesTaxTypeGet**](docs/CompanyTaxRatesApi.md#companiescompanyidtaxratestaxtypeget) | **Get** /companies/{companyId}/taxrates/{taxType} | 
*CompanyTaxRatesApi* | [**CreateCustomTaxes**](docs/CompanyTaxRatesApi.md#createcustomtaxes) | **Post** /companies/{companyId}/taxrates | Create custom agast for one company
*CompanyTaxRatesApi* | [**DeleteCustomTaxes**](docs/CompanyTaxRatesApi.md#deletecustomtaxes) | **Delete** /companies/{companyId}/taxrates/{taxType} | 
*CompanyTaxRatesApi* | [**UpdateCustomTaxes**](docs/CompanyTaxRatesApi.md#updatecustomtaxes) | **Put** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company
*GoodsCalculationsApi* | [**CalculationsgoodsPurchasePost**](docs/GoodsCalculationsApi.md#calculationsgoodspurchasepost) | **Post** /calculations?goods-purchase | Calculation Method
*GoodsCalculationsApi* | [**CalculationsgoodsSalesPost**](docs/GoodsCalculationsApi.md#calculationsgoodssalespost) | **Post** /calculations?goods-sales | Calculation Method
*GoodsTransactionsApi* | [**TransactionsgoodsPurchasePost**](docs/GoodsTransactionsApi.md#transactionsgoodspurchasepost) | **Post** /transactions?goods-purchase | Transaction Method
*GoodsTransactionsApi* | [**TransactionsgoodsSalesPost**](docs/GoodsTransactionsApi.md#transactionsgoodssalespost) | **Post** /transactions?goods-sales | Transaction Method
*InvoiceContingencyApi* | [**InvoiceDropContingency**](docs/InvoiceContingencyApi.md#invoicedropcontingency) | **Delete** /invoices/contingency/{state} | Invoice Drop Contingency per State
*InvoiceContingencyApi* | [**InvoiceSetContingency**](docs/InvoiceContingencyApi.md#invoicesetcontingency) | **Put** /invoices/contingency/{state} | Invoice Set Contingency per State
*InvoiceContingencyApi* | [**InvoiceVerifyContingency**](docs/InvoiceContingencyApi.md#invoiceverifycontingency) | **Get** /invoices/contingency/{state} | Invoice Verify Contingency per State
*InvoiceNFCeDANFEApi* | [**InvoicesNfceKeyGet**](docs/InvoiceNFCeDANFEApi.md#invoicesnfcekeyget) | **Get** /invoices/nfce/{key} | NFCe Danfe Print
*InvoiceNFeDANFEApi* | [**NfePrint**](docs/InvoiceNFeDANFEApi.md#nfeprint) | **Get** /invoices/nfe/{key} | Retrieve Danfe
*InvoiceSEFAZApi* | [**InvoicesSefazDelete**](docs/InvoiceSEFAZApi.md#invoicessefazdelete) | **Delete** /invoices/sefaz | Disable Range e-Invoice
*InvoiceSEFAZApi* | [**InvoicesSefazKeyDelete**](docs/InvoiceSEFAZApi.md#invoicessefazkeydelete) | **Delete** /invoices/sefaz/{key} | Cancel invoice
*InvoiceSEFAZApi* | [**InvoicesSefazKeyGet**](docs/InvoiceSEFAZApi.md#invoicessefazkeyget) | **Get** /invoices/sefaz/{key} | Retrieve invoice
*InvoiceSEFAZApi* | [**InvoicesSefazKeyLookupGet**](docs/InvoiceSEFAZApi.md#invoicessefazkeylookupget) | **Get** /invoices/sefaz/{key}/lookup | Retrieve invoice
*InvoiceSEFAZApi* | [**InvoicesSefazKeyPut**](docs/InvoiceSEFAZApi.md#invoicessefazkeyput) | **Put** /invoices/sefaz/{key} | Fix Letter
*InvoiceSEFAZApi* | [**InvoicesSefazPost**](docs/InvoiceSEFAZApi.md#invoicessefazpost) | **Post** /invoices/sefaz | Send an e-Invoice
*InvoiceSEFAZApi* | [**InvoicesSefazStatusGet**](docs/InvoiceSEFAZApi.md#invoicessefazstatusget) | **Get** /invoices/sefaz/status | Retrieve Status of SEFAZ Server
*InvoiceSettingsApi* | [**InvoiceSettings**](docs/InvoiceSettingsApi.md#invoicesettings) | **Get** /invoices/settings | Invoice Settigns
*LegalReasonApi* | [**CreateReason_**](docs/LegalReasonApi.md#createreason_) | **Post** /taxconf/legal-reason | Create Legal Reason.
*LegalReasonApi* | [**DeleteReason_**](docs/LegalReasonApi.md#deletereason_) | **Delete** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
*LegalReasonApi* | [**GetReason_**](docs/LegalReasonApi.md#getreason_) | **Get** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
*LegalReasonApi* | [**ListReason**](docs/LegalReasonApi.md#listreason) | **Get** /taxconf/legal-reason | List Legal Reasons.
*LegalReasonApi* | [**UpdateReason_**](docs/LegalReasonApi.md#updatereason_) | **Put** /taxconf/legal-reason | Update Legal Reason.
*ServiceCalculationsApi* | [**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](docs/ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget) | **Get** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
*ServiceCalculationsApi* | [**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](docs/ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodetransactionspost) | **Post** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
*ServiceCalculationsApi* | [**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](docs/ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypeget) | **Get** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
*ServiceCalculationsApi* | [**CalculationsservicePaymentPost**](docs/ServiceCalculationsApi.md#calculationsservicepaymentpost) | **Post** /calculations?service-payment | Calculation Method
*ServiceCalculationsApi* | [**CalculationsservicePurchasePost**](docs/ServiceCalculationsApi.md#calculationsservicepurchasepost) | **Post** /calculations?service-purchase | Calculation Method
*ServiceCalculationsApi* | [**CalculationsserviceReceiptPost**](docs/ServiceCalculationsApi.md#calculationsservicereceiptpost) | **Post** /calculations?service-receipt | Calculation Method
*ServiceCalculationsApi* | [**CalculationsserviceSalesPost**](docs/ServiceCalculationsApi.md#calculationsservicesalespost) | **Post** /calculations?service-sales | Calculation Method
*ServiceTransactionsApi* | [**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](docs/ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget) | **Get** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
*ServiceTransactionsApi* | [**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**](docs/ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodestatetransitionspost) | **Post** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
*ServiceTransactionsApi* | [**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](docs/ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypeget) | **Get** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
*ServiceTransactionsApi* | [**TransactionsservicePaymentPost**](docs/ServiceTransactionsApi.md#transactionsservicepaymentpost) | **Post** /transactions?service-payment | Calculation Method
*ServiceTransactionsApi* | [**TransactionsservicePurchasePost**](docs/ServiceTransactionsApi.md#transactionsservicepurchasepost) | **Post** /transactions?service-purchase | Calculation Method
*ServiceTransactionsApi* | [**TransactionsserviceReceiptPost**](docs/ServiceTransactionsApi.md#transactionsservicereceiptpost) | **Post** /transactions?service-receipt | Calculation Method
*ServiceTransactionsApi* | [**TransactionsserviceSalesPost**](docs/ServiceTransactionsApi.md#transactionsservicesalespost) | **Post** /transactions?service-sales | Calculation Method
*TaxConfCFOPApi* | [**CreateCfop**](docs/TaxConfCFOPApi.md#createcfop) | **Post** /taxconf/cfop | create a new CFOP configuration
*TaxConfCFOPApi* | [**DeleteCfop**](docs/TaxConfCFOPApi.md#deletecfop) | **Delete** /taxconf/cfop/{code} | disable a CFOP.
*TaxConfCFOPApi* | [**GetCfop**](docs/TaxConfCFOPApi.md#getcfop) | **Get** /taxconf/cfop/{code} | get CFOP information.
*TaxConfCFOPApi* | [**GetCfopList**](docs/TaxConfCFOPApi.md#getcfoplist) | **Get** /taxconf/cfop | retrive list of CFOP.
*TaxConfCFOPApi* | [**UpdateCfop**](docs/TaxConfCFOPApi.md#updatecfop) | **Put** /taxconf/cfop/{code} | update a CFOP configuration
*TaxConfIBPTApi* | [**CreateIbptConf**](docs/TaxConfIBPTApi.md#createibptconf) | **Post** /taxconf/ibpt | create a new Process Type configuration
*TaxConfIBPTApi* | [**DeleteIbptConf**](docs/TaxConfIBPTApi.md#deleteibptconf) | **Delete** /taxconf/ibpt/{code} | disable a IBPT.
*TaxConfIBPTApi* | [**GetIbptConf**](docs/TaxConfIBPTApi.md#getibptconf) | **Get** /taxconf/ibpt/{code} | get IBPT information.
*TaxConfIBPTApi* | [**GetIbptConfList**](docs/TaxConfIBPTApi.md#getibptconflist) | **Get** /taxconf/ibpt | retrive list of IBPT.
*TaxConfIBPTApi* | [**UpdateIbptConf**](docs/TaxConfIBPTApi.md#updateibptconf) | **Put** /taxconf/ibpt/{code} | update a Process Type configuration
*TaxConfICMSApi* | [**CreateIcmsconfstate**](docs/TaxConfICMSApi.md#createicmsconfstate) | **Post** /taxconf/icms/{state} | create a new ICMS Configuration
*TaxConfICMSApi* | [**DeleteIcmsConf**](docs/TaxConfICMSApi.md#deleteicmsconf) | **Delete** /taxconf/icms/{state}/{code} | disable a ICMS by State.
*TaxConfICMSApi* | [**GetIcmsConfByState**](docs/TaxConfICMSApi.md#geticmsconfbystate) | **Get** /taxconf/icms/{state}/{code} | get ICMS information by State.
*TaxConfICMSApi* | [**GetIcmsList**](docs/TaxConfICMSApi.md#geticmslist) | **Get** /taxconf/icms/{state} | retrive list of ICMS.
*TaxConfICMSApi* | [**GetIcmsList_0**](docs/TaxConfICMSApi.md#geticmslist_0) | **Get** /taxconf/icms-search/ | retrive list of ICMS.
*TaxConfICMSApi* | [**UpdateIcmsconfstate**](docs/TaxConfICMSApi.md#updateicmsconfstate) | **Put** /taxconf/icms/{state}/{code} | update a IcmsConf State,
*TaxConfISSApi* | [**CreateIssConfByCity**](docs/TaxConfISSApi.md#createissconfbycity) | **Post** /taxconf/iss | create a new ISS Configuration
*TaxConfISSApi* | [**DeleteIssConf**](docs/TaxConfISSApi.md#deleteissconf) | **Delete** /taxconf/iss/{cityCode} | disable a ISS by City Code.
*TaxConfISSApi* | [**GetIssConfByCity**](docs/TaxConfISSApi.md#getissconfbycity) | **Get** /taxconf/iss/{cityCode} | get ISS information by City Code.
*TaxConfISSApi* | [**GetIssList**](docs/TaxConfISSApi.md#getisslist) | **Get** /taxconf/iss | retrive list of ISS
*TaxConfISSApi* | [**UpdateIssConfByCity**](docs/TaxConfISSApi.md#updateissconfbycity) | **Put** /taxconf/iss/{cityCode} | update a ISS by City Code.
*TaxConfProcessApi* | [**CreateProcess**](docs/TaxConfProcessApi.md#createprocess) | **Post** /taxconf/process | create a new Process Type configuration
*TaxConfProcessApi* | [**DeleteProcess**](docs/TaxConfProcessApi.md#deleteprocess) | **Delete** /taxconf/process/{code} | disable a Process.
*TaxConfProcessApi* | [**GetProcess**](docs/TaxConfProcessApi.md#getprocess) | **Get** /taxconf/process/{code} | get Process information.
*TaxConfProcessApi* | [**GetProcessList**](docs/TaxConfProcessApi.md#getprocesslist) | **Get** /taxconf/process | retrive list of Process.
*TaxConfProcessApi* | [**UpdateProcess**](docs/TaxConfProcessApi.md#updateprocess) | **Put** /taxconf/process/{code} | update a Process Type configuration


## Documentation For Models

 - [AccountCompany](docs/AccountCompany.md)
 - [AdditionalInformation](docs/AdditionalInformation.md)
 - [AdditionalInformationProcRef](docs/AdditionalInformationProcRef.md)
 - [Address](docs/Address.md)
 - [Agast](docs/Agast.md)
 - [AgastCodeType](docs/AgastCodeType.md)
 - [AgastExtendForSefaz](docs/AgastExtendForSefaz.md)
 - [AgastIcmsConf](docs/AgastIcmsConf.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [CalcModelEnum](docs/CalcModelEnum.md)
 - [CalculatedTaxSummaryForGoods](docs/CalculatedTaxSummaryForGoods.md)
 - [CalculatedTaxSummaryForGoodsTaxByType](docs/CalculatedTaxSummaryForGoodsTaxByType.md)
 - [CfopConf](docs/CfopConf.md)
 - [Company](docs/Company.md)
 - [CompanyAuthorizedToDownloadNFe](docs/CompanyAuthorizedToDownloadNFe.md)
 - [CompanyConfiguration](docs/CompanyConfiguration.md)
 - [CompanyMailServer](docs/CompanyMailServer.md)
 - [CstIcmsEnum](docs/CstIcmsEnum.md)
 - [CstPistCofinsEnum](docs/CstPistCofinsEnum.md)
 - [CstTableAEnum](docs/CstTableAEnum.md)
 - [CstTableBEnum](docs/CstTableBEnum.md)
 - [CustomAgast](docs/CustomAgast.md)
 - [CustomIcmsConfByState](docs/CustomIcmsConfByState.md)
 - [CustomProcessScenario](docs/CustomProcessScenario.md)
 - [CustomTaxTypeRate](docs/CustomTaxTypeRate.md)
 - [DefaultLocations](docs/DefaultLocations.md)
 - [DetailsCalculatedTax](docs/DetailsCalculatedTax.md)
 - [DetailsCalculatedTaxItem](docs/DetailsCalculatedTaxItem.md)
 - [Entity](docs/Entity.md)
 - [EntityForGoods](docs/EntityForGoods.md)
 - [EntityInformerForGoods](docs/EntityInformerForGoods.md)
 - [EntityInformerForGoodsFederalTaxRegime](docs/EntityInformerForGoodsFederalTaxRegime.md)
 - [EntityLocation](docs/EntityLocation.md)
 - [EntityType](docs/EntityType.md)
 - [ExportInfo](docs/ExportInfo.md)
 - [FederalTaxRegime](docs/FederalTaxRegime.md)
 - [Fuel](docs/Fuel.md)
 - [FuelCide](docs/FuelCide.md)
 - [FuelPumpNumber](docs/FuelPumpNumber.md)
 - [HeaderBaseInfo](docs/HeaderBaseInfo.md)
 - [HeaderForGoods](docs/HeaderForGoods.md)
 - [HeaderForGoodsParticipants](docs/HeaderForGoodsParticipants.md)
 - [IbptConf](docs/IbptConf.md)
 - [IcmsConfByState](docs/IcmsConfByState.md)
 - [IcmsConfByStateIcmsStConf](docs/IcmsConfByStateIcmsStConf.md)
 - [IcmsConfInterState](docs/IcmsConfInterState.md)
 - [IcmsConfInterStateIcmsStConf](docs/IcmsConfInterStateIcmsStConf.md)
 - [IcmsTaxConf](docs/IcmsTaxConf.md)
 - [IcmsTaxConfBase](docs/IcmsTaxConfBase.md)
 - [InformerForGoods](docs/InformerForGoods.md)
 - [InformerForGoodsCsts](docs/InformerForGoodsCsts.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse201](docs/InlineResponse201.md)
 - [InstallmentComplete](docs/InstallmentComplete.md)
 - [IpbtConfItem](docs/IpbtConfItem.md)
 - [IssConfByCity](docs/IssConfByCity.md)
 - [IssConfServiceList](docs/IssConfServiceList.md)
 - [IssConfServiceListTaxRate](docs/IssConfServiceListTaxRate.md)
 - [IssConfServiceListTaxRateIbpt](docs/IssConfServiceListTaxRateIbpt.md)
 - [ItemCpom](docs/ItemCpom.md)
 - [ItemGoods](docs/ItemGoods.md)
 - [ItemSimple](docs/ItemSimple.md)
 - [LegalReason](docs/LegalReason.md)
 - [LegalReasonReferencedProcesses](docs/LegalReasonReferencedProcesses.md)
 - [LegalReasonTaxScope](docs/LegalReasonTaxScope.md)
 - [LineForGoods](docs/LineForGoods.md)
 - [LineForGoodsAdi](docs/LineForGoodsAdi.md)
 - [LineForGoodsCalculatedTax](docs/LineForGoodsCalculatedTax.md)
 - [LineForGoodsCalculatedTaxTaxByType](docs/LineForGoodsCalculatedTaxTaxByType.md)
 - [LineForGoodsDi](docs/LineForGoodsDi.md)
 - [LineForGoodsExport](docs/LineForGoodsExport.md)
 - [LineForGoodsIcmsTaxRelief](docs/LineForGoodsIcmsTaxRelief.md)
 - [LineForGoodsIndExport](docs/LineForGoodsIndExport.md)
 - [LineForSefazGoods](docs/LineForSefazGoods.md)
 - [Location](docs/Location.md)
 - [LocationSecondaryStateTaxId](docs/LocationSecondaryStateTaxId.md)
 - [Medicine](docs/Medicine.md)
 - [Message](docs/Message.md)
 - [ModelError](docs/ModelError.md)
 - [NRef](docs/NRef.md)
 - [NRefRefEcf](docs/NRefRefEcf.md)
 - [NRefRefFarmerNf](docs/NRefRefFarmerNf.md)
 - [NRefRefNf](docs/NRefRefNf.md)
 - [PayRecCalculatedTaxSummaryForService](docs/PayRecCalculatedTaxSummaryForService.md)
 - [PayRecCalculatedTaxSummaryForServiceTaxByType](docs/PayRecCalculatedTaxSummaryForServiceTaxByType.md)
 - [PayRecHeader](docs/PayRecHeader.md)
 - [PayRecLinesIn](docs/PayRecLinesIn.md)
 - [PayRecLinesOut](docs/PayRecLinesOut.md)
 - [Payment](docs/Payment.md)
 - [PaymentBill](docs/PaymentBill.md)
 - [PaymentCalculatedTax](docs/PaymentCalculatedTax.md)
 - [PaymentInstallment](docs/PaymentInstallment.md)
 - [PaymentLinesIn](docs/PaymentLinesIn.md)
 - [PaymentPaymentMode](docs/PaymentPaymentMode.md)
 - [PaymentTaxByType](docs/PaymentTaxByType.md)
 - [PaymentTerms](docs/PaymentTerms.md)
 - [PaymentTransactionIn](docs/PaymentTransactionIn.md)
 - [PaymentTransactionOut](docs/PaymentTransactionOut.md)
 - [PccWithholdingMode](docs/PccWithholdingMode.md)
 - [PointOfOrderOrigin](docs/PointOfOrderOrigin.md)
 - [ProcessScenario](docs/ProcessScenario.md)
 - [ProcessingInfo](docs/ProcessingInfo.md)
 - [PurchaseCalculatedTax](docs/PurchaseCalculatedTax.md)
 - [PurchaseCalculatedTaxSummaryForService](docs/PurchaseCalculatedTaxSummaryForService.md)
 - [PurchaseCalculatedTaxSummaryForServiceTaxByType](docs/PurchaseCalculatedTaxSummaryForServiceTaxByType.md)
 - [PurchaseDefaultLocations](docs/PurchaseDefaultLocations.md)
 - [PurchaseEntity](docs/PurchaseEntity.md)
 - [PurchaseHeaderIn](docs/PurchaseHeaderIn.md)
 - [PurchaseHeaderInPayment](docs/PurchaseHeaderInPayment.md)
 - [PurchaseHeaderOut](docs/PurchaseHeaderOut.md)
 - [PurchaseHeaderOutPayment](docs/PurchaseHeaderOutPayment.md)
 - [PurchaseInfo](docs/PurchaseInfo.md)
 - [PurchaseInstallmentIn](docs/PurchaseInstallmentIn.md)
 - [PurchaseLinesIn](docs/PurchaseLinesIn.md)
 - [PurchaseLinesOut](docs/PurchaseLinesOut.md)
 - [PurchaseTaxByType](docs/PurchaseTaxByType.md)
 - [PurchaseTaxByTypeDetail](docs/PurchaseTaxByTypeDetail.md)
 - [PurchaseTaxesConfig](docs/PurchaseTaxesConfig.md)
 - [PurchaseTransactionIn](docs/PurchaseTransactionIn.md)
 - [PurchaseTransactionOut](docs/PurchaseTransactionOut.md)
 - [ReceiptTransactionIn](docs/ReceiptTransactionIn.md)
 - [ReceiptTransactionOut](docs/ReceiptTransactionOut.md)
 - [SalesCalculatedTax](docs/SalesCalculatedTax.md)
 - [SalesCalculatedTaxSummaryForService](docs/SalesCalculatedTaxSummaryForService.md)
 - [SalesCalculatedTaxSummaryForServiceTaxByType](docs/SalesCalculatedTaxSummaryForServiceTaxByType.md)
 - [SalesDefaultLocations](docs/SalesDefaultLocations.md)
 - [SalesEntity](docs/SalesEntity.md)
 - [SalesHeaderIn](docs/SalesHeaderIn.md)
 - [SalesHeaderInPayment](docs/SalesHeaderInPayment.md)
 - [SalesHeaderOut](docs/SalesHeaderOut.md)
 - [SalesHeaderOutPayment](docs/SalesHeaderOutPayment.md)
 - [SalesInstallmentIn](docs/SalesInstallmentIn.md)
 - [SalesLinesIn](docs/SalesLinesIn.md)
 - [SalesLinesInTaxDeductions](docs/SalesLinesInTaxDeductions.md)
 - [SalesLinesOut](docs/SalesLinesOut.md)
 - [SalesLinesOutTaxDeductions](docs/SalesLinesOutTaxDeductions.md)
 - [SalesTaxByType](docs/SalesTaxByType.md)
 - [SalesTaxByTypeDetail](docs/SalesTaxByTypeDetail.md)
 - [SalesTaxesConfig](docs/SalesTaxesConfig.md)
 - [SalesTransactionIn](docs/SalesTransactionIn.md)
 - [SalesTransactionOut](docs/SalesTransactionOut.md)
 - [SefazDisableRangeIn](docs/SefazDisableRangeIn.md)
 - [SefazInvoiceBasicStatus](docs/SefazInvoiceBasicStatus.md)
 - [SefazInvoiceStatus](docs/SefazInvoiceStatus.md)
 - [SefazItDeleteIn](docs/SefazItDeleteIn.md)
 - [SefazItGetOut](docs/SefazItGetOut.md)
 - [SefazItPutIn](docs/SefazItPutIn.md)
 - [SefazPostOut](docs/SefazPostOut.md)
 - [ServiceItemTaxRate](docs/ServiceItemTaxRate.md)
 - [ServiceItemTaxRatePeriod](docs/ServiceItemTaxRatePeriod.md)
 - [ServiceRendered](docs/ServiceRendered.md)
 - [SimpleAddress](docs/SimpleAddress.md)
 - [StateEnum](docs/StateEnum.md)
 - [StateTransition](docs/StateTransition.md)
 - [TaxByTypeSummaryForGoods](docs/TaxByTypeSummaryForGoods.md)
 - [TaxByTypeSummaryForService](docs/TaxByTypeSummaryForService.md)
 - [TaxByTypeSummaryJurisdiction](docs/TaxByTypeSummaryJurisdiction.md)
 - [TaxByTypeSummaryJurisdictionForGoods](docs/TaxByTypeSummaryJurisdictionForGoods.md)
 - [TaxByTypeTax](docs/TaxByTypeTax.md)
 - [TaxConf](docs/TaxConf.md)
 - [TaxType](docs/TaxType.md)
 - [TaxTypeRate](docs/TaxTypeRate.md)
 - [TaxTypeRateWithholding](docs/TaxTypeRateWithholding.md)
 - [TransactionForGoodsIn](docs/TransactionForGoodsIn.md)
 - [TransactionForGoodsOut](docs/TransactionForGoodsOut.md)
 - [TransactionForSefazGoods](docs/TransactionForSefazGoods.md)
 - [TransactionForSefazGoodsList](docs/TransactionForSefazGoodsList.md)
 - [Transport](docs/Transport.md)
 - [TransportVolumes](docs/TransportVolumes.md)
 - [ValidationError](docs/ValidationError.md)
 - [Vehicle](docs/Vehicle.md)
 - [VehicleId](docs/VehicleId.md)
 - [VehicleTransp](docs/VehicleTransp.md)
 - [Weapon](docs/Weapon.md)
 - [WithholdDef](docs/WithholdDef.md)
 - [WithholdingMode](docs/WithholdingMode.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author


