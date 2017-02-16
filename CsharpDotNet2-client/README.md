# IO.Swagger - the C# library for the BR16 - API

This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

This C# SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0
- SDK version: 1.0.0
- Build date: 2017-02-16T18:26:15.226Z
- Build package: io.swagger.codegen.languages.CsharpDotNet2ClientCodegen

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET 2.0

<a name="dependencies"></a>
## Dependencies
- Mono compiler
- Newtonsoft.Json.7.0.1
- RestSharp.Net2.1.1.11

Note: NuGet is downloaded by the mono compilation script and packages are installed with it. No dependency DLLs are bundled with this generator

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh compile-mono.sh`
- [Windows] TODO

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using IO.Swagger.IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.IO.Swagger.Model;
```
<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using IO.Swagger.Api;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {
            
            var apiInstance = new AGASTApi();
            var code = code_example;  // string | Agast Code

            try
            {
                Agast result = apiInstance.AgastsCodeGet(code);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AGASTApi.AgastsCodeGet: " + e.Message );
            }
        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AGASTApi* | [**AgastsCodeGet**](docs/AGASTApi.md#agastscodeget) | **GET** /agasts/{code} | 
*AGASTApi* | [**CreateAgast**](docs/AGASTApi.md#createagast) | **POST** /agasts | Create agast
*AGASTApi* | [**DeleteAgast**](docs/AGASTApi.md#deleteagast) | **DELETE** /agasts/{code} | 
*AGASTApi* | [**GetAgastList**](docs/AGASTApi.md#getagastlist) | **GET** /agasts | 
*AGASTApi* | [**UpdateAgast**](docs/AGASTApi.md#updateagast) | **PUT** /agasts/{code} | Update agast
*AccountApi* | [**AccountsAccountIdCompaniesGet**](docs/AccountApi.md#accountsaccountidcompaniesget) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
*AccountApi* | [**CreateAccountCompany**](docs/AccountApi.md#createaccountcompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration
*AddressApi* | [**GetZipCode**](docs/AddressApi.md#getzipcode) | **GET** /addresses/{zipcode} | 
*AuthApi* | [**AuthPost**](docs/AuthApi.md#authpost) | **POST** /auth | authorization
*CompanyApi* | [**CompaniesGet**](docs/CompanyApi.md#companiesget) | **GET** /companies | Retrieve Companies by account
*CompanyApi* | [**CreateCompany**](docs/CompanyApi.md#createcompany) | **POST** /companies | Create company and your data configuration
*CompanyApi* | [**DeleteAccountCompany**](docs/CompanyApi.md#deleteaccountcompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
*CompanyApi* | [**DeleteCompany**](docs/CompanyApi.md#deletecompany) | **DELETE** /companies/{companyId} | 
*CompanyApi* | [**InfoCompany**](docs/CompanyApi.md#infocompany) | **GET** /companies/{companyId} | Get company information and your data configuration
*CompanyApi* | [**UpdateCompany**](docs/CompanyApi.md#updatecompany) | **PUT** /companies/{companyId} | Update company information and your data configuration
*CompanyAGASTApi* | [**CompaniesCompanyIdAgastsCodeGet**](docs/CompanyAGASTApi.md#companiescompanyidagastscodeget) | **GET** /companies/{companyId}/agasts/{code} | 
*CompanyAGASTApi* | [**CompaniesCompanyIdAgastsGet**](docs/CompanyAGASTApi.md#companiescompanyidagastsget) | **GET** /companies/{companyId}/agasts | 
*CompanyAGASTApi* | [**CreateCustomAgast**](docs/CompanyAGASTApi.md#createcustomagast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
*CompanyAGASTApi* | [**DeleteAgast**](docs/CompanyAGASTApi.md#deleteagast) | **DELETE** /companies/{companyId}/agasts/{code} | 
*CompanyAGASTApi* | [**UpdateCustomAgast**](docs/CompanyAGASTApi.md#updatecustomagast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company
*CompanyFilesApi* | [**CompaniesCompanyIdNfseCertificateDelete**](docs/CompanyFilesApi.md#companiescompanyidnfsecertificatedelete) | **DELETE** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**CompaniesCompanyIdNfseCertificateGet**](docs/CompanyFilesApi.md#companiescompanyidnfsecertificateget) | **GET** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**CompaniesCompanyIdNfseCertificatePost**](docs/CompanyFilesApi.md#companiescompanyidnfsecertificatepost) | **POST** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**CompaniesCompanyIdNfseCertificatePut**](docs/CompanyFilesApi.md#companiescompanyidnfsecertificateput) | **PUT** /companies/{companyId}/nfse-certificate | 
*CompanyICMSApi* | [**CompaniesCompanyIdIcmsGet**](docs/CompanyICMSApi.md#companiescompanyidicmsget) | **GET** /companies/{companyId}/icms | 
*CompanyICMSApi* | [**CompaniesCompanyIdIcmsStateGet**](docs/CompanyICMSApi.md#companiescompanyidicmsstateget) | **GET** /companies/{companyId}/icms/{state} | 
*CompanyICMSApi* | [**CreateICMS**](docs/CompanyICMSApi.md#createicms) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
*CompanyICMSApi* | [**DeleteCustomIcmsConfByState**](docs/CompanyICMSApi.md#deletecustomicmsconfbystate) | **DELETE** /companies/{companyId}/icms/{state} | 
*CompanyICMSApi* | [**UpdateCustomIcmsConfByState**](docs/CompanyICMSApi.md#updatecustomicmsconfbystate) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company
*CompanyItemCPOMServiceApi* | [**CompaniesCompanyIdItemsCodeCpomCityCodeGet**](docs/CompanyItemCPOMServiceApi.md#companiescompanyiditemscodecpomcitycodeget) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*CompanyItemCPOMServiceApi* | [**CompaniesCompanyIdItemsCodeCpomGet**](docs/CompanyItemCPOMServiceApi.md#companiescompanyiditemscodecpomget) | **GET** /companies/{companyId}/items/{code}/cpom | 
*CompanyItemCPOMServiceApi* | [**CreateItemCPOM**](docs/CompanyItemCPOMServiceApi.md#createitemcpom) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
*CompanyItemCPOMServiceApi* | [**DeleteItemCPOM**](docs/CompanyItemCPOMServiceApi.md#deleteitemcpom) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*CompanyItemCPOMServiceApi* | [**UpdateItemCPOM**](docs/CompanyItemCPOMServiceApi.md#updateitemcpom) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company
*CompanyItemGoodsApi* | [**CompaniesCompanyIdItemsCodeChangeCodePut**](docs/CompanyItemGoodsApi.md#companiescompanyiditemscodechangecodeput) | **PUT** /companies/{companyId}/items/{code}/change-code | 
*CompanyItemGoodsApi* | [**CompaniesCompanyIdItemsCodegoodsGet**](docs/CompanyItemGoodsApi.md#companiescompanyiditemscodegoodsget) | **GET** /companies/{companyId}/items/{code}?goods | 
*CompanyItemGoodsApi* | [**CompaniesCompanyIdItemsgoodsGet**](docs/CompanyItemGoodsApi.md#companiescompanyiditemsgoodsget) | **GET** /companies/{companyId}/items?goods | 
*CompanyItemGoodsApi* | [**CreateItem**](docs/CompanyItemGoodsApi.md#createitem) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
*CompanyItemGoodsApi* | [**DeleteItem**](docs/CompanyItemGoodsApi.md#deleteitem) | **DELETE** /companies/{companyId}/items/{code}?goods | 
*CompanyItemGoodsApi* | [**UpdateItem**](docs/CompanyItemGoodsApi.md#updateitem) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company
*CompanyItemServiceApi* | [**CompaniesCompanyIdItemsCodeChangeCodePut**](docs/CompanyItemServiceApi.md#companiescompanyiditemscodechangecodeput) | **PUT** /companies/{companyId}/items/{code}/change-code | 
*CompanyItemServiceApi* | [**CompaniesCompanyIdItemsCodeserviceGet**](docs/CompanyItemServiceApi.md#companiescompanyiditemscodeserviceget) | **GET** /companies/{companyId}/items/{code}?service | 
*CompanyItemServiceApi* | [**CompaniesCompanyIdItemsserviceGet**](docs/CompanyItemServiceApi.md#companiescompanyiditemsserviceget) | **GET** /companies/{companyId}/items?service | 
*CompanyItemServiceApi* | [**CreateItemService**](docs/CompanyItemServiceApi.md#createitemservice) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
*CompanyItemServiceApi* | [**DeleteItemService**](docs/CompanyItemServiceApi.md#deleteitemservice) | **DELETE** /companies/{companyId}/items/{code}?service | 
*CompanyItemServiceApi* | [**UpdateItemService**](docs/CompanyItemServiceApi.md#updateitemservice) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company
*CompanyLocationApi* | [**CompaniesCompanyIdLocationsCodeGet**](docs/CompanyLocationApi.md#companiescompanyidlocationscodeget) | **GET** /companies/{companyId}/locations/{code} | 
*CompanyLocationApi* | [**CompaniesCompanyIdLocationsGet**](docs/CompanyLocationApi.md#companiescompanyidlocationsget) | **GET** /companies/{companyId}/locations | 
*CompanyLocationApi* | [**CreateLocation**](docs/CompanyLocationApi.md#createlocation) | **POST** /companies/{companyId}/locations | Create new location for company
*CompanyLocationApi* | [**DeleteLocation**](docs/CompanyLocationApi.md#deletelocation) | **DELETE** /companies/{companyId}/locations/{code} | 
*CompanyLocationApi* | [**UpdateLocation**](docs/CompanyLocationApi.md#updatelocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company
*CompanyProcessApi* | [**CompaniesCompanyIdProcessCodeGet**](docs/CompanyProcessApi.md#companiescompanyidprocesscodeget) | **GET** /companies/{companyId}/process/{code} | 
*CompanyProcessApi* | [**CompaniesCompanyIdProcessGet**](docs/CompanyProcessApi.md#companiescompanyidprocessget) | **GET** /companies/{companyId}/process | 
*CompanyProcessApi* | [**CreateCustomProcessScenario**](docs/CompanyProcessApi.md#createcustomprocessscenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
*CompanyProcessApi* | [**DeleteCustomProcessScenario**](docs/CompanyProcessApi.md#deletecustomprocessscenario) | **DELETE** /companies/{companyId}/process/{code} | 
*CompanyProcessApi* | [**UpdateCustomProcessScenario**](docs/CompanyProcessApi.md#updatecustomprocessscenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company
*CompanyTaxRatesApi* | [**CompaniesCompanyIdTaxratesGet**](docs/CompanyTaxRatesApi.md#companiescompanyidtaxratesget) | **GET** /companies/{companyId}/taxrates | 
*CompanyTaxRatesApi* | [**CompaniesCompanyIdTaxratesTaxTypeGet**](docs/CompanyTaxRatesApi.md#companiescompanyidtaxratestaxtypeget) | **GET** /companies/{companyId}/taxrates/{taxType} | 
*CompanyTaxRatesApi* | [**CreateCustomTaxes**](docs/CompanyTaxRatesApi.md#createcustomtaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
*CompanyTaxRatesApi* | [**DeleteCustomTaxes**](docs/CompanyTaxRatesApi.md#deletecustomtaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
*CompanyTaxRatesApi* | [**UpdateCustomTaxes**](docs/CompanyTaxRatesApi.md#updatecustomtaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company
*GoodsCalculationsApi* | [**CalculationsgoodsPurchasePost**](docs/GoodsCalculationsApi.md#calculationsgoodspurchasepost) | **POST** /calculations?goods-purchase | Calculation Method
*GoodsCalculationsApi* | [**CalculationsgoodsSalesPost**](docs/GoodsCalculationsApi.md#calculationsgoodssalespost) | **POST** /calculations?goods-sales | Calculation Method
*GoodsTransactionsApi* | [**TransactionsgoodsPurchasePost**](docs/GoodsTransactionsApi.md#transactionsgoodspurchasepost) | **POST** /transactions?goods-purchase | Transaction Method
*GoodsTransactionsApi* | [**TransactionsgoodsSalesPost**](docs/GoodsTransactionsApi.md#transactionsgoodssalespost) | **POST** /transactions?goods-sales | Transaction Method
*InvoiceContingencyApi* | [**InvoiceDropContingency**](docs/InvoiceContingencyApi.md#invoicedropcontingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
*InvoiceContingencyApi* | [**InvoiceSetContingency**](docs/InvoiceContingencyApi.md#invoicesetcontingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
*InvoiceContingencyApi* | [**InvoiceVerifyContingency**](docs/InvoiceContingencyApi.md#invoiceverifycontingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State
*InvoiceNFCeDANFEApi* | [**InvoicesNfceKeyGet**](docs/InvoiceNFCeDANFEApi.md#invoicesnfcekeyget) | **GET** /invoices/nfce/{key} | NFCe Danfe Print
*InvoiceNFeDANFEApi* | [**NfePrint**](docs/InvoiceNFeDANFEApi.md#nfeprint) | **GET** /invoices/nfe/{key} | Retrieve Danfe
*InvoiceSEFAZApi* | [**InvoicesSefazDelete**](docs/InvoiceSEFAZApi.md#invoicessefazdelete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
*InvoiceSEFAZApi* | [**InvoicesSefazKeyDelete**](docs/InvoiceSEFAZApi.md#invoicessefazkeydelete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
*InvoiceSEFAZApi* | [**InvoicesSefazKeyGet**](docs/InvoiceSEFAZApi.md#invoicessefazkeyget) | **GET** /invoices/sefaz/{key} | Retrieve invoice
*InvoiceSEFAZApi* | [**InvoicesSefazKeyLookupGet**](docs/InvoiceSEFAZApi.md#invoicessefazkeylookupget) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
*InvoiceSEFAZApi* | [**InvoicesSefazKeyPut**](docs/InvoiceSEFAZApi.md#invoicessefazkeyput) | **PUT** /invoices/sefaz/{key} | Fix Letter
*InvoiceSEFAZApi* | [**InvoicesSefazPost**](docs/InvoiceSEFAZApi.md#invoicessefazpost) | **POST** /invoices/sefaz | Send an e-Invoice
*InvoiceSEFAZApi* | [**InvoicesSefazStatusGet**](docs/InvoiceSEFAZApi.md#invoicessefazstatusget) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server
*InvoiceSettingsApi* | [**InvoiceSettings**](docs/InvoiceSettingsApi.md#invoicesettings) | **GET** /invoices/settings | Invoice Settigns
*LegalReasonApi* | [**CreateReason**](docs/LegalReasonApi.md#createreason) | **POST** /taxconf/legal-reason | Create Legal Reason.
*LegalReasonApi* | [**DeleteReason**](docs/LegalReasonApi.md#deletereason) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
*LegalReasonApi* | [**GetReason**](docs/LegalReasonApi.md#getreason) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
*LegalReasonApi* | [**ListReason**](docs/LegalReasonApi.md#listreason) | **GET** /taxconf/legal-reason | List Legal Reasons.
*LegalReasonApi* | [**UpdateReason**](docs/LegalReasonApi.md#updatereason) | **PUT** /taxconf/legal-reason | Update Legal Reason.
*ServiceCalculationsApi* | [**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](docs/ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
*ServiceCalculationsApi* | [**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](docs/ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypedocumentcodetransactionspost) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
*ServiceCalculationsApi* | [**CalculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](docs/ServiceCalculationsApi.md#calculationsaccountaccountidcompanycompanycodetransactiontypeget) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
*ServiceCalculationsApi* | [**CalculationsservicePaymentPost**](docs/ServiceCalculationsApi.md#calculationsservicepaymentpost) | **POST** /calculations?service-payment | Calculation Method
*ServiceCalculationsApi* | [**CalculationsservicePurchasePost**](docs/ServiceCalculationsApi.md#calculationsservicepurchasepost) | **POST** /calculations?service-purchase | Calculation Method
*ServiceCalculationsApi* | [**CalculationsserviceReceiptPost**](docs/ServiceCalculationsApi.md#calculationsservicereceiptpost) | **POST** /calculations?service-receipt | Calculation Method
*ServiceCalculationsApi* | [**CalculationsserviceSalesPost**](docs/ServiceCalculationsApi.md#calculationsservicesalespost) | **POST** /calculations?service-sales | Calculation Method
*ServiceTransactionsApi* | [**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](docs/ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodeget) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
*ServiceTransactionsApi* | [**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**](docs/ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypedocumentcodestatetransitionspost) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
*ServiceTransactionsApi* | [**TransactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](docs/ServiceTransactionsApi.md#transactionsaccountaccountidcompanycompanycodetransactiontypeget) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
*ServiceTransactionsApi* | [**TransactionsservicePaymentPost**](docs/ServiceTransactionsApi.md#transactionsservicepaymentpost) | **POST** /transactions?service-payment | Calculation Method
*ServiceTransactionsApi* | [**TransactionsservicePurchasePost**](docs/ServiceTransactionsApi.md#transactionsservicepurchasepost) | **POST** /transactions?service-purchase | Calculation Method
*ServiceTransactionsApi* | [**TransactionsserviceReceiptPost**](docs/ServiceTransactionsApi.md#transactionsservicereceiptpost) | **POST** /transactions?service-receipt | Calculation Method
*ServiceTransactionsApi* | [**TransactionsserviceSalesPost**](docs/ServiceTransactionsApi.md#transactionsservicesalespost) | **POST** /transactions?service-sales | Calculation Method
*TaxConfCFOPApi* | [**CreateCfop**](docs/TaxConfCFOPApi.md#createcfop) | **POST** /taxconf/cfop | create a new CFOP configuration
*TaxConfCFOPApi* | [**DeleteCfop**](docs/TaxConfCFOPApi.md#deletecfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
*TaxConfCFOPApi* | [**GetCfop**](docs/TaxConfCFOPApi.md#getcfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
*TaxConfCFOPApi* | [**GetCfopList**](docs/TaxConfCFOPApi.md#getcfoplist) | **GET** /taxconf/cfop | retrive list of CFOP.
*TaxConfCFOPApi* | [**UpdateCfop**](docs/TaxConfCFOPApi.md#updatecfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration
*TaxConfIBPTApi* | [**CreateIbptConf**](docs/TaxConfIBPTApi.md#createibptconf) | **POST** /taxconf/ibpt | create a new Process Type configuration
*TaxConfIBPTApi* | [**DeleteIbptConf**](docs/TaxConfIBPTApi.md#deleteibptconf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
*TaxConfIBPTApi* | [**GetIbptConf**](docs/TaxConfIBPTApi.md#getibptconf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
*TaxConfIBPTApi* | [**GetIbptConfList**](docs/TaxConfIBPTApi.md#getibptconflist) | **GET** /taxconf/ibpt | retrive list of IBPT.
*TaxConfIBPTApi* | [**UpdateIbptConf**](docs/TaxConfIBPTApi.md#updateibptconf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration
*TaxConfICMSApi* | [**CreateIcmsconfstate**](docs/TaxConfICMSApi.md#createicmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
*TaxConfICMSApi* | [**DeleteIcmsConf**](docs/TaxConfICMSApi.md#deleteicmsconf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
*TaxConfICMSApi* | [**GetIcmsConfByState**](docs/TaxConfICMSApi.md#geticmsconfbystate) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
*TaxConfICMSApi* | [**GetIcmsList**](docs/TaxConfICMSApi.md#geticmslist) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
*TaxConfICMSApi* | [**GetIcmsList_0**](docs/TaxConfICMSApi.md#geticmslist_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
*TaxConfICMSApi* | [**UpdateIcmsconfstate**](docs/TaxConfICMSApi.md#updateicmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,
*TaxConfISSApi* | [**CreateIssConfByCity**](docs/TaxConfISSApi.md#createissconfbycity) | **POST** /taxconf/iss | create a new ISS Configuration
*TaxConfISSApi* | [**DeleteIssConf**](docs/TaxConfISSApi.md#deleteissconf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
*TaxConfISSApi* | [**GetIssConfByCity**](docs/TaxConfISSApi.md#getissconfbycity) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
*TaxConfISSApi* | [**GetIssList**](docs/TaxConfISSApi.md#getisslist) | **GET** /taxconf/iss | retrive list of ISS
*TaxConfISSApi* | [**UpdateIssConfByCity**](docs/TaxConfISSApi.md#updateissconfbycity) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.
*TaxConfProcessApi* | [**CreateProcess**](docs/TaxConfProcessApi.md#createprocess) | **POST** /taxconf/process | create a new Process Type configuration
*TaxConfProcessApi* | [**DeleteProcess**](docs/TaxConfProcessApi.md#deleteprocess) | **DELETE** /taxconf/process/{code} | disable a Process.
*TaxConfProcessApi* | [**GetProcess**](docs/TaxConfProcessApi.md#getprocess) | **GET** /taxconf/process/{code} | get Process information.
*TaxConfProcessApi* | [**GetProcessList**](docs/TaxConfProcessApi.md#getprocesslist) | **GET** /taxconf/process | retrive list of Process.
*TaxConfProcessApi* | [**UpdateProcess**](docs/TaxConfProcessApi.md#updateprocess) | **PUT** /taxconf/process/{code} | update a Process Type configuration


<a name="documentation-for-models"></a>
## Documentation for Models

 - [IO.Swagger.Model.AccountCompany](docs/AccountCompany.md)
 - [IO.Swagger.Model.AdditionalInformation](docs/AdditionalInformation.md)
 - [IO.Swagger.Model.AdditionalInformationProcRef](docs/AdditionalInformationProcRef.md)
 - [IO.Swagger.Model.Address](docs/Address.md)
 - [IO.Swagger.Model.Agast](docs/Agast.md)
 - [IO.Swagger.Model.AgastCodeType](docs/AgastCodeType.md)
 - [IO.Swagger.Model.AgastExtendForSefaz](docs/AgastExtendForSefaz.md)
 - [IO.Swagger.Model.AgastIcmsConf](docs/AgastIcmsConf.md)
 - [IO.Swagger.Model.Body](docs/Body.md)
 - [IO.Swagger.Model.Body1](docs/Body1.md)
 - [IO.Swagger.Model.Body2](docs/Body2.md)
 - [IO.Swagger.Model.Body3](docs/Body3.md)
 - [IO.Swagger.Model.Body4](docs/Body4.md)
 - [IO.Swagger.Model.CSTPistCofinsEnum](docs/CSTPistCofinsEnum.md)
 - [IO.Swagger.Model.CSTTableAEnum](docs/CSTTableAEnum.md)
 - [IO.Swagger.Model.CSTTableBEnum](docs/CSTTableBEnum.md)
 - [IO.Swagger.Model.CalcModelEnum](docs/CalcModelEnum.md)
 - [IO.Swagger.Model.CalculatedTaxSummaryForGoods](docs/CalculatedTaxSummaryForGoods.md)
 - [IO.Swagger.Model.CalculatedTaxSummaryForGoodsTaxByType](docs/CalculatedTaxSummaryForGoodsTaxByType.md)
 - [IO.Swagger.Model.CfopConf](docs/CfopConf.md)
 - [IO.Swagger.Model.Company](docs/Company.md)
 - [IO.Swagger.Model.CompanyAuthorizedToDownloadNFe](docs/CompanyAuthorizedToDownloadNFe.md)
 - [IO.Swagger.Model.CompanyConfiguration](docs/CompanyConfiguration.md)
 - [IO.Swagger.Model.CompanyMailServer](docs/CompanyMailServer.md)
 - [IO.Swagger.Model.CstIcmsEnum](docs/CstIcmsEnum.md)
 - [IO.Swagger.Model.CustomAgast](docs/CustomAgast.md)
 - [IO.Swagger.Model.CustomIcmsConfByState](docs/CustomIcmsConfByState.md)
 - [IO.Swagger.Model.CustomProcessScenario](docs/CustomProcessScenario.md)
 - [IO.Swagger.Model.CustomTaxTypeRate](docs/CustomTaxTypeRate.md)
 - [IO.Swagger.Model.DefaultLocations](docs/DefaultLocations.md)
 - [IO.Swagger.Model.DetailsCalculatedTax](docs/DetailsCalculatedTax.md)
 - [IO.Swagger.Model.DetailsCalculatedTaxItem](docs/DetailsCalculatedTaxItem.md)
 - [IO.Swagger.Model.Entity](docs/Entity.md)
 - [IO.Swagger.Model.EntityForGoods](docs/EntityForGoods.md)
 - [IO.Swagger.Model.EntityInformerForGoods](docs/EntityInformerForGoods.md)
 - [IO.Swagger.Model.EntityInformerForGoodsFederalTaxRegime](docs/EntityInformerForGoodsFederalTaxRegime.md)
 - [IO.Swagger.Model.EntityLocation](docs/EntityLocation.md)
 - [IO.Swagger.Model.EntityType](docs/EntityType.md)
 - [IO.Swagger.Model.Error](docs/Error.md)
 - [IO.Swagger.Model.ExportInfo](docs/ExportInfo.md)
 - [IO.Swagger.Model.FederalTaxRegime](docs/FederalTaxRegime.md)
 - [IO.Swagger.Model.Fuel](docs/Fuel.md)
 - [IO.Swagger.Model.FuelCide](docs/FuelCide.md)
 - [IO.Swagger.Model.FuelPumpNumber](docs/FuelPumpNumber.md)
 - [IO.Swagger.Model.HeaderBaseInfo](docs/HeaderBaseInfo.md)
 - [IO.Swagger.Model.HeaderForGoods](docs/HeaderForGoods.md)
 - [IO.Swagger.Model.HeaderForGoodsParticipants](docs/HeaderForGoodsParticipants.md)
 - [IO.Swagger.Model.IbptConf](docs/IbptConf.md)
 - [IO.Swagger.Model.IcmsConfByState](docs/IcmsConfByState.md)
 - [IO.Swagger.Model.IcmsConfByStateIcmsSTConf](docs/IcmsConfByStateIcmsSTConf.md)
 - [IO.Swagger.Model.IcmsConfInterState](docs/IcmsConfInterState.md)
 - [IO.Swagger.Model.IcmsConfInterStateIcmsSTConf](docs/IcmsConfInterStateIcmsSTConf.md)
 - [IO.Swagger.Model.IcmsTaxConf](docs/IcmsTaxConf.md)
 - [IO.Swagger.Model.IcmsTaxConfBase](docs/IcmsTaxConfBase.md)
 - [IO.Swagger.Model.InformerForGoods](docs/InformerForGoods.md)
 - [IO.Swagger.Model.InformerForGoodsCsts](docs/InformerForGoodsCsts.md)
 - [IO.Swagger.Model.InlineResponse200](docs/InlineResponse200.md)
 - [IO.Swagger.Model.InlineResponse2001](docs/InlineResponse2001.md)
 - [IO.Swagger.Model.InlineResponse2002](docs/InlineResponse2002.md)
 - [IO.Swagger.Model.InlineResponse2003](docs/InlineResponse2003.md)
 - [IO.Swagger.Model.InlineResponse2004](docs/InlineResponse2004.md)
 - [IO.Swagger.Model.InlineResponse201](docs/InlineResponse201.md)
 - [IO.Swagger.Model.InstallmentComplete](docs/InstallmentComplete.md)
 - [IO.Swagger.Model.IpbtConfItem](docs/IpbtConfItem.md)
 - [IO.Swagger.Model.IssConfByCity](docs/IssConfByCity.md)
 - [IO.Swagger.Model.IssConfServiceList](docs/IssConfServiceList.md)
 - [IO.Swagger.Model.IssConfServiceListTaxRate](docs/IssConfServiceListTaxRate.md)
 - [IO.Swagger.Model.IssConfServiceListTaxRateIbpt](docs/IssConfServiceListTaxRateIbpt.md)
 - [IO.Swagger.Model.ItemCpom](docs/ItemCpom.md)
 - [IO.Swagger.Model.ItemGoods](docs/ItemGoods.md)
 - [IO.Swagger.Model.ItemSimple](docs/ItemSimple.md)
 - [IO.Swagger.Model.LegalReason](docs/LegalReason.md)
 - [IO.Swagger.Model.LegalReasonReferencedProcesses](docs/LegalReasonReferencedProcesses.md)
 - [IO.Swagger.Model.LegalReasonTaxScope](docs/LegalReasonTaxScope.md)
 - [IO.Swagger.Model.LineForGoods](docs/LineForGoods.md)
 - [IO.Swagger.Model.LineForGoodsAdi](docs/LineForGoodsAdi.md)
 - [IO.Swagger.Model.LineForGoodsCalculatedTax](docs/LineForGoodsCalculatedTax.md)
 - [IO.Swagger.Model.LineForGoodsCalculatedTaxTaxByType](docs/LineForGoodsCalculatedTaxTaxByType.md)
 - [IO.Swagger.Model.LineForGoodsDi](docs/LineForGoodsDi.md)
 - [IO.Swagger.Model.LineForGoodsExport](docs/LineForGoodsExport.md)
 - [IO.Swagger.Model.LineForGoodsIcmsTaxRelief](docs/LineForGoodsIcmsTaxRelief.md)
 - [IO.Swagger.Model.LineForGoodsIndExport](docs/LineForGoodsIndExport.md)
 - [IO.Swagger.Model.LineForSefazGoods](docs/LineForSefazGoods.md)
 - [IO.Swagger.Model.Location](docs/Location.md)
 - [IO.Swagger.Model.LocationSecondaryStateTaxId](docs/LocationSecondaryStateTaxId.md)
 - [IO.Swagger.Model.Medicine](docs/Medicine.md)
 - [IO.Swagger.Model.Message](docs/Message.md)
 - [IO.Swagger.Model.NRef](docs/NRef.md)
 - [IO.Swagger.Model.NRefRefECF](docs/NRefRefECF.md)
 - [IO.Swagger.Model.NRefRefFarmerNF](docs/NRefRefFarmerNF.md)
 - [IO.Swagger.Model.NRefRefNF](docs/NRefRefNF.md)
 - [IO.Swagger.Model.PayRecCalculatedTaxSummaryForService](docs/PayRecCalculatedTaxSummaryForService.md)
 - [IO.Swagger.Model.PayRecCalculatedTaxSummaryForServiceTaxByType](docs/PayRecCalculatedTaxSummaryForServiceTaxByType.md)
 - [IO.Swagger.Model.PayRecHeader](docs/PayRecHeader.md)
 - [IO.Swagger.Model.PayRecLinesIn](docs/PayRecLinesIn.md)
 - [IO.Swagger.Model.PayRecLinesOut](docs/PayRecLinesOut.md)
 - [IO.Swagger.Model.Payment](docs/Payment.md)
 - [IO.Swagger.Model.PaymentBill](docs/PaymentBill.md)
 - [IO.Swagger.Model.PaymentCalculatedTax](docs/PaymentCalculatedTax.md)
 - [IO.Swagger.Model.PaymentInstallment](docs/PaymentInstallment.md)
 - [IO.Swagger.Model.PaymentLinesIn](docs/PaymentLinesIn.md)
 - [IO.Swagger.Model.PaymentPaymentMode](docs/PaymentPaymentMode.md)
 - [IO.Swagger.Model.PaymentTaxByType](docs/PaymentTaxByType.md)
 - [IO.Swagger.Model.PaymentTerms](docs/PaymentTerms.md)
 - [IO.Swagger.Model.PaymentTransactionIn](docs/PaymentTransactionIn.md)
 - [IO.Swagger.Model.PaymentTransactionOut](docs/PaymentTransactionOut.md)
 - [IO.Swagger.Model.PccWithholdingMode](docs/PccWithholdingMode.md)
 - [IO.Swagger.Model.PointOfOrderOrigin](docs/PointOfOrderOrigin.md)
 - [IO.Swagger.Model.ProcessScenario](docs/ProcessScenario.md)
 - [IO.Swagger.Model.ProcessingInfo](docs/ProcessingInfo.md)
 - [IO.Swagger.Model.PurchaseCalculatedTax](docs/PurchaseCalculatedTax.md)
 - [IO.Swagger.Model.PurchaseCalculatedTaxSummaryForService](docs/PurchaseCalculatedTaxSummaryForService.md)
 - [IO.Swagger.Model.PurchaseCalculatedTaxSummaryForServiceTaxByType](docs/PurchaseCalculatedTaxSummaryForServiceTaxByType.md)
 - [IO.Swagger.Model.PurchaseDefaultLocations](docs/PurchaseDefaultLocations.md)
 - [IO.Swagger.Model.PurchaseEntity](docs/PurchaseEntity.md)
 - [IO.Swagger.Model.PurchaseHeaderIn](docs/PurchaseHeaderIn.md)
 - [IO.Swagger.Model.PurchaseHeaderInPayment](docs/PurchaseHeaderInPayment.md)
 - [IO.Swagger.Model.PurchaseHeaderOut](docs/PurchaseHeaderOut.md)
 - [IO.Swagger.Model.PurchaseHeaderOutPayment](docs/PurchaseHeaderOutPayment.md)
 - [IO.Swagger.Model.PurchaseInfo](docs/PurchaseInfo.md)
 - [IO.Swagger.Model.PurchaseInstallmentIn](docs/PurchaseInstallmentIn.md)
 - [IO.Swagger.Model.PurchaseLinesIn](docs/PurchaseLinesIn.md)
 - [IO.Swagger.Model.PurchaseLinesOut](docs/PurchaseLinesOut.md)
 - [IO.Swagger.Model.PurchaseTaxByType](docs/PurchaseTaxByType.md)
 - [IO.Swagger.Model.PurchaseTaxByTypeDetail](docs/PurchaseTaxByTypeDetail.md)
 - [IO.Swagger.Model.PurchaseTaxesConfig](docs/PurchaseTaxesConfig.md)
 - [IO.Swagger.Model.PurchaseTransactionIn](docs/PurchaseTransactionIn.md)
 - [IO.Swagger.Model.PurchaseTransactionOut](docs/PurchaseTransactionOut.md)
 - [IO.Swagger.Model.ReceiptTransactionIn](docs/ReceiptTransactionIn.md)
 - [IO.Swagger.Model.ReceiptTransactionOut](docs/ReceiptTransactionOut.md)
 - [IO.Swagger.Model.SalesCalculatedTax](docs/SalesCalculatedTax.md)
 - [IO.Swagger.Model.SalesCalculatedTaxSummaryForService](docs/SalesCalculatedTaxSummaryForService.md)
 - [IO.Swagger.Model.SalesCalculatedTaxSummaryForServiceTaxByType](docs/SalesCalculatedTaxSummaryForServiceTaxByType.md)
 - [IO.Swagger.Model.SalesDefaultLocations](docs/SalesDefaultLocations.md)
 - [IO.Swagger.Model.SalesEntity](docs/SalesEntity.md)
 - [IO.Swagger.Model.SalesHeaderIn](docs/SalesHeaderIn.md)
 - [IO.Swagger.Model.SalesHeaderInPayment](docs/SalesHeaderInPayment.md)
 - [IO.Swagger.Model.SalesHeaderOut](docs/SalesHeaderOut.md)
 - [IO.Swagger.Model.SalesHeaderOutPayment](docs/SalesHeaderOutPayment.md)
 - [IO.Swagger.Model.SalesInstallmentIn](docs/SalesInstallmentIn.md)
 - [IO.Swagger.Model.SalesLinesIn](docs/SalesLinesIn.md)
 - [IO.Swagger.Model.SalesLinesInTaxDeductions](docs/SalesLinesInTaxDeductions.md)
 - [IO.Swagger.Model.SalesLinesOut](docs/SalesLinesOut.md)
 - [IO.Swagger.Model.SalesLinesOutTaxDeductions](docs/SalesLinesOutTaxDeductions.md)
 - [IO.Swagger.Model.SalesTaxByType](docs/SalesTaxByType.md)
 - [IO.Swagger.Model.SalesTaxByTypeDetail](docs/SalesTaxByTypeDetail.md)
 - [IO.Swagger.Model.SalesTaxesConfig](docs/SalesTaxesConfig.md)
 - [IO.Swagger.Model.SalesTransactionIn](docs/SalesTransactionIn.md)
 - [IO.Swagger.Model.SalesTransactionOut](docs/SalesTransactionOut.md)
 - [IO.Swagger.Model.SefazDisableRangeIn](docs/SefazDisableRangeIn.md)
 - [IO.Swagger.Model.SefazInvoiceBasicStatus](docs/SefazInvoiceBasicStatus.md)
 - [IO.Swagger.Model.SefazInvoiceStatus](docs/SefazInvoiceStatus.md)
 - [IO.Swagger.Model.SefazItDeleteIn](docs/SefazItDeleteIn.md)
 - [IO.Swagger.Model.SefazItGetOut](docs/SefazItGetOut.md)
 - [IO.Swagger.Model.SefazItPutIn](docs/SefazItPutIn.md)
 - [IO.Swagger.Model.SefazPostOut](docs/SefazPostOut.md)
 - [IO.Swagger.Model.ServiceItemTaxRate](docs/ServiceItemTaxRate.md)
 - [IO.Swagger.Model.ServiceItemTaxRatePeriod](docs/ServiceItemTaxRatePeriod.md)
 - [IO.Swagger.Model.ServiceRendered](docs/ServiceRendered.md)
 - [IO.Swagger.Model.SimpleAddress](docs/SimpleAddress.md)
 - [IO.Swagger.Model.StateEnum](docs/StateEnum.md)
 - [IO.Swagger.Model.StateTransition](docs/StateTransition.md)
 - [IO.Swagger.Model.TaxByTypeSummaryForGoods](docs/TaxByTypeSummaryForGoods.md)
 - [IO.Swagger.Model.TaxByTypeSummaryForService](docs/TaxByTypeSummaryForService.md)
 - [IO.Swagger.Model.TaxByTypeSummaryJurisdiction](docs/TaxByTypeSummaryJurisdiction.md)
 - [IO.Swagger.Model.TaxByTypeSummaryJurisdictionForGoods](docs/TaxByTypeSummaryJurisdictionForGoods.md)
 - [IO.Swagger.Model.TaxByTypeTax](docs/TaxByTypeTax.md)
 - [IO.Swagger.Model.TaxConf](docs/TaxConf.md)
 - [IO.Swagger.Model.TaxType](docs/TaxType.md)
 - [IO.Swagger.Model.TaxTypeRate](docs/TaxTypeRate.md)
 - [IO.Swagger.Model.TaxTypeRateWithholding](docs/TaxTypeRateWithholding.md)
 - [IO.Swagger.Model.TransactionForGoodsIn](docs/TransactionForGoodsIn.md)
 - [IO.Swagger.Model.TransactionForGoodsOut](docs/TransactionForGoodsOut.md)
 - [IO.Swagger.Model.TransactionForSefazGoods](docs/TransactionForSefazGoods.md)
 - [IO.Swagger.Model.TransactionForSefazGoodsList](docs/TransactionForSefazGoodsList.md)
 - [IO.Swagger.Model.Transport](docs/Transport.md)
 - [IO.Swagger.Model.TransportVolumes](docs/TransportVolumes.md)
 - [IO.Swagger.Model.ValidationError](docs/ValidationError.md)
 - [IO.Swagger.Model.Vehicle](docs/Vehicle.md)
 - [IO.Swagger.Model.VehicleID](docs/VehicleID.md)
 - [IO.Swagger.Model.VehicleTransp](docs/VehicleTransp.md)
 - [IO.Swagger.Model.Weapon](docs/Weapon.md)
 - [IO.Swagger.Model.WithholdDef](docs/WithholdDef.md)
 - [IO.Swagger.Model.WithholdingMode](docs/WithholdingMode.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.