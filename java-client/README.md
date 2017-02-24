# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AGASTApi;

import java.io.File;
import java.util.*;

public class AGASTApiExample {

    public static void main(String[] args) {
        
        AGASTApi apiInstance = new AGASTApi();
        String code = "code_example"; // String | Agast Code
        try {
            Agast result = apiInstance.agastsCodeGet(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AGASTApi#agastsCodeGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AGASTApi* | [**agastsCodeGet**](docs/AGASTApi.md#agastsCodeGet) | **GET** /agasts/{code} | 
*AGASTApi* | [**createAgast**](docs/AGASTApi.md#createAgast) | **POST** /agasts | Create agast
*AGASTApi* | [**deleteAgast**](docs/AGASTApi.md#deleteAgast) | **DELETE** /agasts/{code} | 
*AGASTApi* | [**getAgastList**](docs/AGASTApi.md#getAgastList) | **GET** /agasts | 
*AGASTApi* | [**updateAgast**](docs/AGASTApi.md#updateAgast) | **PUT** /agasts/{code} | Update agast
*AccountApi* | [**accountsAccountIdCompaniesGet**](docs/AccountApi.md#accountsAccountIdCompaniesGet) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
*AccountApi* | [**createAccountCompany**](docs/AccountApi.md#createAccountCompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration
*AddressApi* | [**getZipCode**](docs/AddressApi.md#getZipCode) | **GET** /addresses/{zipcode} | 
*AuthApi* | [**authPost**](docs/AuthApi.md#authPost) | **POST** /auth | authorization
*AuthApi* | [**v2AuthPost**](docs/AuthApi.md#v2AuthPost) | **POST** /v2/auth | authorization
*CompanyApi* | [**companiesGet**](docs/CompanyApi.md#companiesGet) | **GET** /companies | Retrieve Companies by account
*CompanyApi* | [**createCompany**](docs/CompanyApi.md#createCompany) | **POST** /companies | Create company and your data configuration
*CompanyApi* | [**deleteAccountCompany**](docs/CompanyApi.md#deleteAccountCompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
*CompanyApi* | [**deleteCompany**](docs/CompanyApi.md#deleteCompany) | **DELETE** /companies/{companyId} | 
*CompanyApi* | [**infoCompany**](docs/CompanyApi.md#infoCompany) | **GET** /companies/{companyId} | Get company information and your data configuration
*CompanyApi* | [**updateCompany**](docs/CompanyApi.md#updateCompany) | **PUT** /companies/{companyId} | Update company information and your data configuration
*CompanyAGASTApi* | [**companiesCompanyIdAgastsCodeGet**](docs/CompanyAGASTApi.md#companiesCompanyIdAgastsCodeGet) | **GET** /companies/{companyId}/agasts/{code} | 
*CompanyAGASTApi* | [**companiesCompanyIdAgastsGet**](docs/CompanyAGASTApi.md#companiesCompanyIdAgastsGet) | **GET** /companies/{companyId}/agasts | 
*CompanyAGASTApi* | [**createCustomAgast**](docs/CompanyAGASTApi.md#createCustomAgast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
*CompanyAGASTApi* | [**deleteAgast**](docs/CompanyAGASTApi.md#deleteAgast) | **DELETE** /companies/{companyId}/agasts/{code} | 
*CompanyAGASTApi* | [**updateCustomAgast**](docs/CompanyAGASTApi.md#updateCustomAgast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company
*CompanyFilesApi* | [**companiesCompanyIdNfseCertificateDelete**](docs/CompanyFilesApi.md#companiesCompanyIdNfseCertificateDelete) | **DELETE** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**companiesCompanyIdNfseCertificateGet**](docs/CompanyFilesApi.md#companiesCompanyIdNfseCertificateGet) | **GET** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**companiesCompanyIdNfseCertificatePost**](docs/CompanyFilesApi.md#companiesCompanyIdNfseCertificatePost) | **POST** /companies/{companyId}/nfse-certificate | 
*CompanyFilesApi* | [**companiesCompanyIdNfseCertificatePut**](docs/CompanyFilesApi.md#companiesCompanyIdNfseCertificatePut) | **PUT** /companies/{companyId}/nfse-certificate | 
*CompanyICMSApi* | [**companiesCompanyIdIcmsGet**](docs/CompanyICMSApi.md#companiesCompanyIdIcmsGet) | **GET** /companies/{companyId}/icms | 
*CompanyICMSApi* | [**companiesCompanyIdIcmsStateGet**](docs/CompanyICMSApi.md#companiesCompanyIdIcmsStateGet) | **GET** /companies/{companyId}/icms/{state} | 
*CompanyICMSApi* | [**createICMS**](docs/CompanyICMSApi.md#createICMS) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
*CompanyICMSApi* | [**deleteCustomIcmsConfByState**](docs/CompanyICMSApi.md#deleteCustomIcmsConfByState) | **DELETE** /companies/{companyId}/icms/{state} | 
*CompanyICMSApi* | [**updateCustomIcmsConfByState**](docs/CompanyICMSApi.md#updateCustomIcmsConfByState) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company
*CompanyItemCPOMServiceApi* | [**companiesCompanyIdItemsCodeCpomCityCodeGet**](docs/CompanyItemCPOMServiceApi.md#companiesCompanyIdItemsCodeCpomCityCodeGet) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*CompanyItemCPOMServiceApi* | [**companiesCompanyIdItemsCodeCpomGet**](docs/CompanyItemCPOMServiceApi.md#companiesCompanyIdItemsCodeCpomGet) | **GET** /companies/{companyId}/items/{code}/cpom | 
*CompanyItemCPOMServiceApi* | [**createItemCPOM**](docs/CompanyItemCPOMServiceApi.md#createItemCPOM) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
*CompanyItemCPOMServiceApi* | [**deleteItemCPOM**](docs/CompanyItemCPOMServiceApi.md#deleteItemCPOM) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*CompanyItemCPOMServiceApi* | [**updateItemCPOM**](docs/CompanyItemCPOMServiceApi.md#updateItemCPOM) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company
*CompanyItemGoodsApi* | [**companiesCompanyIdItemsCodeChangeCodePut**](docs/CompanyItemGoodsApi.md#companiesCompanyIdItemsCodeChangeCodePut) | **PUT** /companies/{companyId}/items/{code}/change-code | 
*CompanyItemGoodsApi* | [**companiesCompanyIdItemsCodegoodsGet**](docs/CompanyItemGoodsApi.md#companiesCompanyIdItemsCodegoodsGet) | **GET** /companies/{companyId}/items/{code}?goods | 
*CompanyItemGoodsApi* | [**companiesCompanyIdItemsgoodsGet**](docs/CompanyItemGoodsApi.md#companiesCompanyIdItemsgoodsGet) | **GET** /companies/{companyId}/items?goods | 
*CompanyItemGoodsApi* | [**createItem**](docs/CompanyItemGoodsApi.md#createItem) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
*CompanyItemGoodsApi* | [**deleteItem**](docs/CompanyItemGoodsApi.md#deleteItem) | **DELETE** /companies/{companyId}/items/{code}?goods | 
*CompanyItemGoodsApi* | [**updateItem**](docs/CompanyItemGoodsApi.md#updateItem) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company
*CompanyItemServiceApi* | [**companiesCompanyIdItemsCodeChangeCodePut**](docs/CompanyItemServiceApi.md#companiesCompanyIdItemsCodeChangeCodePut) | **PUT** /companies/{companyId}/items/{code}/change-code | 
*CompanyItemServiceApi* | [**companiesCompanyIdItemsCodeserviceGet**](docs/CompanyItemServiceApi.md#companiesCompanyIdItemsCodeserviceGet) | **GET** /companies/{companyId}/items/{code}?service | 
*CompanyItemServiceApi* | [**companiesCompanyIdItemsserviceGet**](docs/CompanyItemServiceApi.md#companiesCompanyIdItemsserviceGet) | **GET** /companies/{companyId}/items?service | 
*CompanyItemServiceApi* | [**createItemService**](docs/CompanyItemServiceApi.md#createItemService) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
*CompanyItemServiceApi* | [**deleteItemService**](docs/CompanyItemServiceApi.md#deleteItemService) | **DELETE** /companies/{companyId}/items/{code}?service | 
*CompanyItemServiceApi* | [**updateItemService**](docs/CompanyItemServiceApi.md#updateItemService) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company
*CompanyLocationApi* | [**companiesCompanyIdLocationsCodeGet**](docs/CompanyLocationApi.md#companiesCompanyIdLocationsCodeGet) | **GET** /companies/{companyId}/locations/{code} | 
*CompanyLocationApi* | [**companiesCompanyIdLocationsGet**](docs/CompanyLocationApi.md#companiesCompanyIdLocationsGet) | **GET** /companies/{companyId}/locations | 
*CompanyLocationApi* | [**createLocation**](docs/CompanyLocationApi.md#createLocation) | **POST** /companies/{companyId}/locations | Create new location for company
*CompanyLocationApi* | [**deleteLocation**](docs/CompanyLocationApi.md#deleteLocation) | **DELETE** /companies/{companyId}/locations/{code} | 
*CompanyLocationApi* | [**updateLocation**](docs/CompanyLocationApi.md#updateLocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company
*CompanyProcessApi* | [**companiesCompanyIdProcessCodeGet**](docs/CompanyProcessApi.md#companiesCompanyIdProcessCodeGet) | **GET** /companies/{companyId}/process/{code} | 
*CompanyProcessApi* | [**companiesCompanyIdProcessGet**](docs/CompanyProcessApi.md#companiesCompanyIdProcessGet) | **GET** /companies/{companyId}/process | 
*CompanyProcessApi* | [**createCustomProcessScenario**](docs/CompanyProcessApi.md#createCustomProcessScenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
*CompanyProcessApi* | [**deleteCustomProcessScenario**](docs/CompanyProcessApi.md#deleteCustomProcessScenario) | **DELETE** /companies/{companyId}/process/{code} | 
*CompanyProcessApi* | [**updateCustomProcessScenario**](docs/CompanyProcessApi.md#updateCustomProcessScenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company
*CompanyTaxRatesApi* | [**companiesCompanyIdTaxratesGet**](docs/CompanyTaxRatesApi.md#companiesCompanyIdTaxratesGet) | **GET** /companies/{companyId}/taxrates | 
*CompanyTaxRatesApi* | [**companiesCompanyIdTaxratesTaxTypeGet**](docs/CompanyTaxRatesApi.md#companiesCompanyIdTaxratesTaxTypeGet) | **GET** /companies/{companyId}/taxrates/{taxType} | 
*CompanyTaxRatesApi* | [**createCustomTaxes**](docs/CompanyTaxRatesApi.md#createCustomTaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
*CompanyTaxRatesApi* | [**deleteCustomTaxes**](docs/CompanyTaxRatesApi.md#deleteCustomTaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
*CompanyTaxRatesApi* | [**updateCustomTaxes**](docs/CompanyTaxRatesApi.md#updateCustomTaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company
*GoodsCalculationsApi* | [**calculationsgoodsPurchasePost**](docs/GoodsCalculationsApi.md#calculationsgoodsPurchasePost) | **POST** /calculations?goods-purchase | Calculation Method
*GoodsCalculationsApi* | [**calculationsgoodsSalesPost**](docs/GoodsCalculationsApi.md#calculationsgoodsSalesPost) | **POST** /calculations?goods-sales | Calculation Method
*GoodsTransactionsApi* | [**transactionsgoodsPurchasePost**](docs/GoodsTransactionsApi.md#transactionsgoodsPurchasePost) | **POST** /transactions?goods-purchase | Transaction Method
*GoodsTransactionsApi* | [**transactionsgoodsSalesPost**](docs/GoodsTransactionsApi.md#transactionsgoodsSalesPost) | **POST** /transactions?goods-sales | Transaction Method
*InvoiceContingencyApi* | [**invoiceDropContingency**](docs/InvoiceContingencyApi.md#invoiceDropContingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
*InvoiceContingencyApi* | [**invoiceSetContingency**](docs/InvoiceContingencyApi.md#invoiceSetContingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
*InvoiceContingencyApi* | [**invoiceVerifyContingency**](docs/InvoiceContingencyApi.md#invoiceVerifyContingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State
*InvoiceNFCeDANFEApi* | [**invoicesNfceKeyGet**](docs/InvoiceNFCeDANFEApi.md#invoicesNfceKeyGet) | **GET** /invoices/nfce/{key} | NFCe Danfe Print
*InvoiceNFeDANFEApi* | [**nfePrint**](docs/InvoiceNFeDANFEApi.md#nfePrint) | **GET** /invoices/nfe/{key} | Retrieve Danfe
*InvoiceSEFAZApi* | [**invoicesSefazDelete**](docs/InvoiceSEFAZApi.md#invoicesSefazDelete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
*InvoiceSEFAZApi* | [**invoicesSefazKeyDelete**](docs/InvoiceSEFAZApi.md#invoicesSefazKeyDelete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
*InvoiceSEFAZApi* | [**invoicesSefazKeyGet**](docs/InvoiceSEFAZApi.md#invoicesSefazKeyGet) | **GET** /invoices/sefaz/{key} | Retrieve invoice
*InvoiceSEFAZApi* | [**invoicesSefazKeyLookupGet**](docs/InvoiceSEFAZApi.md#invoicesSefazKeyLookupGet) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
*InvoiceSEFAZApi* | [**invoicesSefazKeyPut**](docs/InvoiceSEFAZApi.md#invoicesSefazKeyPut) | **PUT** /invoices/sefaz/{key} | Fix Letter
*InvoiceSEFAZApi* | [**invoicesSefazPost**](docs/InvoiceSEFAZApi.md#invoicesSefazPost) | **POST** /invoices/sefaz | Send an e-Invoice
*InvoiceSEFAZApi* | [**invoicesSefazStatusGet**](docs/InvoiceSEFAZApi.md#invoicesSefazStatusGet) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server
*InvoiceSettingsApi* | [**invoiceSettings**](docs/InvoiceSettingsApi.md#invoiceSettings) | **GET** /invoices/settings | Invoice Settigns
*LegalReasonApi* | [**createReason_**](docs/LegalReasonApi.md#createReason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
*LegalReasonApi* | [**deleteReason_**](docs/LegalReasonApi.md#deleteReason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
*LegalReasonApi* | [**getReason_**](docs/LegalReasonApi.md#getReason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
*LegalReasonApi* | [**listReason**](docs/LegalReasonApi.md#listReason) | **GET** /taxconf/legal-reason | List Legal Reasons.
*LegalReasonApi* | [**updateReason_**](docs/LegalReasonApi.md#updateReason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.
*ServiceCalculationsApi* | [**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](docs/ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
*ServiceCalculationsApi* | [**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost**](docs/ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
*ServiceCalculationsApi* | [**calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](docs/ServiceCalculationsApi.md#calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
*ServiceCalculationsApi* | [**calculationsservicePaymentPost**](docs/ServiceCalculationsApi.md#calculationsservicePaymentPost) | **POST** /calculations?service-payment | Calculation Method
*ServiceCalculationsApi* | [**calculationsservicePurchasePost**](docs/ServiceCalculationsApi.md#calculationsservicePurchasePost) | **POST** /calculations?service-purchase | Calculation Method
*ServiceCalculationsApi* | [**calculationsserviceReceiptPost**](docs/ServiceCalculationsApi.md#calculationsserviceReceiptPost) | **POST** /calculations?service-receipt | Calculation Method
*ServiceCalculationsApi* | [**calculationsserviceSalesPost**](docs/ServiceCalculationsApi.md#calculationsserviceSalesPost) | **POST** /calculations?service-sales | Calculation Method
*ServiceTransactionsApi* | [**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet**](docs/ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
*ServiceTransactionsApi* | [**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost**](docs/ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
*ServiceTransactionsApi* | [**transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet**](docs/ServiceTransactionsApi.md#transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
*ServiceTransactionsApi* | [**transactionsservicePaymentPost**](docs/ServiceTransactionsApi.md#transactionsservicePaymentPost) | **POST** /transactions?service-payment | Calculation Method
*ServiceTransactionsApi* | [**transactionsservicePurchasePost**](docs/ServiceTransactionsApi.md#transactionsservicePurchasePost) | **POST** /transactions?service-purchase | Calculation Method
*ServiceTransactionsApi* | [**transactionsserviceReceiptPost**](docs/ServiceTransactionsApi.md#transactionsserviceReceiptPost) | **POST** /transactions?service-receipt | Calculation Method
*ServiceTransactionsApi* | [**transactionsserviceSalesPost**](docs/ServiceTransactionsApi.md#transactionsserviceSalesPost) | **POST** /transactions?service-sales | Calculation Method
*TaxConfCFOPApi* | [**createCfop**](docs/TaxConfCFOPApi.md#createCfop) | **POST** /taxconf/cfop | create a new CFOP configuration
*TaxConfCFOPApi* | [**deleteCfop**](docs/TaxConfCFOPApi.md#deleteCfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
*TaxConfCFOPApi* | [**getCfop**](docs/TaxConfCFOPApi.md#getCfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
*TaxConfCFOPApi* | [**getCfopList**](docs/TaxConfCFOPApi.md#getCfopList) | **GET** /taxconf/cfop | retrive list of CFOP.
*TaxConfCFOPApi* | [**updateCfop**](docs/TaxConfCFOPApi.md#updateCfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration
*TaxConfIBPTApi* | [**createIbptConf**](docs/TaxConfIBPTApi.md#createIbptConf) | **POST** /taxconf/ibpt | create a new Process Type configuration
*TaxConfIBPTApi* | [**deleteIbptConf**](docs/TaxConfIBPTApi.md#deleteIbptConf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
*TaxConfIBPTApi* | [**getIbptConf**](docs/TaxConfIBPTApi.md#getIbptConf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
*TaxConfIBPTApi* | [**getIbptConfList**](docs/TaxConfIBPTApi.md#getIbptConfList) | **GET** /taxconf/ibpt | retrive list of IBPT.
*TaxConfIBPTApi* | [**updateIbptConf**](docs/TaxConfIBPTApi.md#updateIbptConf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration
*TaxConfICMSApi* | [**createIcmsconfstate**](docs/TaxConfICMSApi.md#createIcmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
*TaxConfICMSApi* | [**deleteIcmsConf**](docs/TaxConfICMSApi.md#deleteIcmsConf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
*TaxConfICMSApi* | [**getIcmsConfByState**](docs/TaxConfICMSApi.md#getIcmsConfByState) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
*TaxConfICMSApi* | [**getIcmsList**](docs/TaxConfICMSApi.md#getIcmsList) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
*TaxConfICMSApi* | [**getIcmsList_0**](docs/TaxConfICMSApi.md#getIcmsList_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
*TaxConfICMSApi* | [**updateIcmsconfstate**](docs/TaxConfICMSApi.md#updateIcmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,
*TaxConfISSApi* | [**createIssConfByCity**](docs/TaxConfISSApi.md#createIssConfByCity) | **POST** /taxconf/iss | create a new ISS Configuration
*TaxConfISSApi* | [**deleteIssConf**](docs/TaxConfISSApi.md#deleteIssConf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
*TaxConfISSApi* | [**getIssConfByCity**](docs/TaxConfISSApi.md#getIssConfByCity) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
*TaxConfISSApi* | [**getIssList**](docs/TaxConfISSApi.md#getIssList) | **GET** /taxconf/iss | retrive list of ISS
*TaxConfISSApi* | [**updateIssConfByCity**](docs/TaxConfISSApi.md#updateIssConfByCity) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.
*TaxConfProcessApi* | [**createProcess**](docs/TaxConfProcessApi.md#createProcess) | **POST** /taxconf/process | create a new Process Type configuration
*TaxConfProcessApi* | [**deleteProcess**](docs/TaxConfProcessApi.md#deleteProcess) | **DELETE** /taxconf/process/{code} | disable a Process.
*TaxConfProcessApi* | [**getProcess**](docs/TaxConfProcessApi.md#getProcess) | **GET** /taxconf/process/{code} | get Process information.
*TaxConfProcessApi* | [**getProcessList**](docs/TaxConfProcessApi.md#getProcessList) | **GET** /taxconf/process | retrive list of Process.
*TaxConfProcessApi* | [**updateProcess**](docs/TaxConfProcessApi.md#updateProcess) | **PUT** /taxconf/process/{code} | update a Process Type configuration


## Documentation for Models

 - [AccountCompany](docs/AccountCompany.md)
 - [AdditionalInformation](docs/AdditionalInformation.md)
 - [AdditionalInformationProcRef](docs/AdditionalInformationProcRef.md)
 - [Address](docs/Address.md)
 - [Agast](docs/Agast.md)
 - [AgastCodeType](docs/AgastCodeType.md)
 - [AgastExtendForSefaz](docs/AgastExtendForSefaz.md)
 - [AgastIcmsConf](docs/AgastIcmsConf.md)
 - [AgastWithholding](docs/AgastWithholding.md)
 - [AgastWithholdingCOFINS](docs/AgastWithholdingCOFINS.md)
 - [AgastWithholdingCSLL](docs/AgastWithholdingCSLL.md)
 - [AgastWithholdingPIS](docs/AgastWithholdingPIS.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [CSTPistCofinsEnum](docs/CSTPistCofinsEnum.md)
 - [CSTTableAEnum](docs/CSTTableAEnum.md)
 - [CSTTableBEnum](docs/CSTTableBEnum.md)
 - [CalcModelEnum](docs/CalcModelEnum.md)
 - [CalculatedTaxSummaryForGoods](docs/CalculatedTaxSummaryForGoods.md)
 - [CalculatedTaxSummaryForGoodsTaxByType](docs/CalculatedTaxSummaryForGoodsTaxByType.md)
 - [CfopConf](docs/CfopConf.md)
 - [Company](docs/Company.md)
 - [CompanyAuthorizedToDownloadNFe](docs/CompanyAuthorizedToDownloadNFe.md)
 - [CompanyConfiguration](docs/CompanyConfiguration.md)
 - [CompanyMailServer](docs/CompanyMailServer.md)
 - [CstIcmsEnum](docs/CstIcmsEnum.md)
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
 - [Error](docs/Error.md)
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
 - [IcmsConfByStateIcmsSTConf](docs/IcmsConfByStateIcmsSTConf.md)
 - [IcmsConfInterState](docs/IcmsConfInterState.md)
 - [IcmsConfInterStateIcmsSTConf](docs/IcmsConfInterStateIcmsSTConf.md)
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
 - [NRef](docs/NRef.md)
 - [NRefRefECF](docs/NRefRefECF.md)
 - [NRefRefFarmerNF](docs/NRefRefFarmerNF.md)
 - [NRefRefNF](docs/NRefRefNF.md)
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
 - [TransactionForGoodsIn](docs/TransactionForGoodsIn.md)
 - [TransactionForGoodsOut](docs/TransactionForGoodsOut.md)
 - [TransactionForSefazGoods](docs/TransactionForSefazGoods.md)
 - [TransactionForSefazGoodsList](docs/TransactionForSefazGoodsList.md)
 - [Transport](docs/Transport.md)
 - [TransportVolumes](docs/TransportVolumes.md)
 - [ValidationError](docs/ValidationError.md)
 - [Vehicle](docs/Vehicle.md)
 - [VehicleID](docs/VehicleID.md)
 - [VehicleTransp](docs/VehicleTransp.md)
 - [Weapon](docs/Weapon.md)
 - [WithholdingMode](docs/WithholdingMode.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



