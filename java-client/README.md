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
        String authorization = "authorization_example"; // String | Bearer {auth}
        Agast body = new Agast(); // Agast | Transaction Message
        try {
            InlineResponse201 result = apiInstance.createAgast(authorization, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AGASTApi#createAgast");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AGASTApi* | [**createAgast**](docs/AGASTApi.md#createAgast) | **POST** /agasts | Create agast
*AGASTApi* | [**deleteAgast**](docs/AGASTApi.md#deleteAgast) | **DELETE** /agasts/{code} | Delete Agast
*AGASTApi* | [**getAgast**](docs/AGASTApi.md#getAgast) | **GET** /agasts/{code} | Get agast
*AGASTApi* | [**getAgastList**](docs/AGASTApi.md#getAgastList) | **GET** /agasts | 
*AGASTApi* | [**updateAgast**](docs/AGASTApi.md#updateAgast) | **PUT** /agasts/{code} | Update agast
*AccountApi* | [**createAccountCompany**](docs/AccountApi.md#createAccountCompany) | **POST** /accounts/{accountId}/companies | Create company and your data configuration
*AccountApi* | [**getCompaniesList**](docs/AccountApi.md#getCompaniesList) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
*AddressApi* | [**getZipCode**](docs/AddressApi.md#getZipCode) | **GET** /addresses/{zipcode} | 
*AuthApi* | [**getAuthorization**](docs/AuthApi.md#getAuthorization) | **POST** /v2/auth | authorization
*AuthApi* | [**getAuthorization2**](docs/AuthApi.md#getAuthorization2) | **POST** /auth | authorization
*CompanyApi* | [**createCompany**](docs/CompanyApi.md#createCompany) | **POST** /companies | Create company and your data configuration
*CompanyApi* | [**deleteAccountCompany**](docs/CompanyApi.md#deleteAccountCompany) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
*CompanyApi* | [**deleteCompany**](docs/CompanyApi.md#deleteCompany) | **DELETE** /companies/{companyId} | 
*CompanyApi* | [**getCompaniesList**](docs/CompanyApi.md#getCompaniesList) | **GET** /companies | Retrieve Companies by account
*CompanyApi* | [**infoCompany**](docs/CompanyApi.md#infoCompany) | **GET** /companies/{companyId} | Get company information and your data configuration
*CompanyApi* | [**updateCompany**](docs/CompanyApi.md#updateCompany) | **PUT** /companies/{companyId} | Update company information and your data configuration
*CompanyAGASTApi* | [**createCustomAgast**](docs/CompanyAGASTApi.md#createCustomAgast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
*CompanyAGASTApi* | [**deleteCustomAgast**](docs/CompanyAGASTApi.md#deleteCustomAgast) | **DELETE** /companies/{companyId}/agasts/{code} | 
*CompanyAGASTApi* | [**getCompanyAgast**](docs/CompanyAGASTApi.md#getCompanyAgast) | **GET** /companies/{companyId}/agasts/{code} | 
*CompanyAGASTApi* | [**getCompanyAgastList**](docs/CompanyAGASTApi.md#getCompanyAgastList) | **GET** /companies/{companyId}/agasts | 
*CompanyAGASTApi* | [**updateCustomAgast**](docs/CompanyAGASTApi.md#updateCustomAgast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company
*CompanyFilesApi* | [**deleteCompanyServiceCertificate**](docs/CompanyFilesApi.md#deleteCompanyServiceCertificate) | **DELETE** /companies/{companyId}/certificate | 
*CompanyFilesApi* | [**getCompanyServiceCertificate**](docs/CompanyFilesApi.md#getCompanyServiceCertificate) | **GET** /companies/{companyId}/certificate | 
*CompanyFilesApi* | [**postCompanyServiceCertificate**](docs/CompanyFilesApi.md#postCompanyServiceCertificate) | **POST** /companies/{companyId}/certificate | 
*CompanyFilesApi* | [**updateCompanyServiceCertificate**](docs/CompanyFilesApi.md#updateCompanyServiceCertificate) | **PUT** /companies/{companyId}/certificate | 
*CompanyICMSApi* | [**createICMS**](docs/CompanyICMSApi.md#createICMS) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
*CompanyICMSApi* | [**deleteCustomIcmsConfByState**](docs/CompanyICMSApi.md#deleteCustomIcmsConfByState) | **DELETE** /companies/{companyId}/icms/{state} | 
*CompanyICMSApi* | [**getCompanyICMS**](docs/CompanyICMSApi.md#getCompanyICMS) | **GET** /companies/{companyId}/icms/{state} | 
*CompanyICMSApi* | [**getCompanyICMSList**](docs/CompanyICMSApi.md#getCompanyICMSList) | **GET** /companies/{companyId}/icms | 
*CompanyICMSApi* | [**updateCustomIcmsConfByState**](docs/CompanyICMSApi.md#updateCustomIcmsConfByState) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company
*CompanyItemCPOMServiceApi* | [**createItemCPOM**](docs/CompanyItemCPOMServiceApi.md#createItemCPOM) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
*CompanyItemCPOMServiceApi* | [**deleteItemCPOM**](docs/CompanyItemCPOMServiceApi.md#deleteItemCPOM) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*CompanyItemCPOMServiceApi* | [**getCompanyCpomCity**](docs/CompanyItemCPOMServiceApi.md#getCompanyCpomCity) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*CompanyItemCPOMServiceApi* | [**getCompanyCpomList**](docs/CompanyItemCPOMServiceApi.md#getCompanyCpomList) | **GET** /companies/{companyId}/items/{code}/cpom | 
*CompanyItemCPOMServiceApi* | [**updateItemCPOM**](docs/CompanyItemCPOMServiceApi.md#updateItemCPOM) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company
*CompanyItemGoodsApi* | [**companyItemsChangeCode**](docs/CompanyItemGoodsApi.md#companyItemsChangeCode) | **PUT** /companies/{companyId}/items/{code}/change-code | 
*CompanyItemGoodsApi* | [**createItem**](docs/CompanyItemGoodsApi.md#createItem) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
*CompanyItemGoodsApi* | [**deleteItem**](docs/CompanyItemGoodsApi.md#deleteItem) | **DELETE** /companies/{companyId}/items/{code}?goods | 
*CompanyItemGoodsApi* | [**getCompanyItemsGoods**](docs/CompanyItemGoodsApi.md#getCompanyItemsGoods) | **GET** /companies/{companyId}/items/{code}?goods | 
*CompanyItemGoodsApi* | [**getCompanyItemsGoodsList**](docs/CompanyItemGoodsApi.md#getCompanyItemsGoodsList) | **GET** /companies/{companyId}/items?goods | 
*CompanyItemGoodsApi* | [**updateItem**](docs/CompanyItemGoodsApi.md#updateItem) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company
*CompanyItemServiceApi* | [**companyItemsChangeCode**](docs/CompanyItemServiceApi.md#companyItemsChangeCode) | **PUT** /companies/{companyId}/items/{code}/change-code | 
*CompanyItemServiceApi* | [**createItemService**](docs/CompanyItemServiceApi.md#createItemService) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
*CompanyItemServiceApi* | [**deleteItemService**](docs/CompanyItemServiceApi.md#deleteItemService) | **DELETE** /companies/{companyId}/items/{code}?service | 
*CompanyItemServiceApi* | [**getCompanyItemsService**](docs/CompanyItemServiceApi.md#getCompanyItemsService) | **GET** /companies/{companyId}/items/{code}?service | 
*CompanyItemServiceApi* | [**getCompanyItemsServiceList**](docs/CompanyItemServiceApi.md#getCompanyItemsServiceList) | **GET** /companies/{companyId}/items?service | 
*CompanyItemServiceApi* | [**updateItemService**](docs/CompanyItemServiceApi.md#updateItemService) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company
*CompanyLocationApi* | [**createLocation**](docs/CompanyLocationApi.md#createLocation) | **POST** /companies/{companyId}/locations | Create new location for company
*CompanyLocationApi* | [**deleteLocation**](docs/CompanyLocationApi.md#deleteLocation) | **DELETE** /companies/{companyId}/locations/{code} | 
*CompanyLocationApi* | [**getCompanyLocation**](docs/CompanyLocationApi.md#getCompanyLocation) | **GET** /companies/{companyId}/locations/{code} | 
*CompanyLocationApi* | [**getCompanyLocationsList**](docs/CompanyLocationApi.md#getCompanyLocationsList) | **GET** /companies/{companyId}/locations | 
*CompanyLocationApi* | [**updateLocation**](docs/CompanyLocationApi.md#updateLocation) | **PUT** /companies/{companyId}/locations/{code} | Update location for company
*CompanyProcessApi* | [**createCustomProcessScenario**](docs/CompanyProcessApi.md#createCustomProcessScenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
*CompanyProcessApi* | [**deleteCustomProcessScenario**](docs/CompanyProcessApi.md#deleteCustomProcessScenario) | **DELETE** /companies/{companyId}/process/{code} | 
*CompanyProcessApi* | [**getCompanyProcess**](docs/CompanyProcessApi.md#getCompanyProcess) | **GET** /companies/{companyId}/process/{code} | 
*CompanyProcessApi* | [**getCompanyProcessList**](docs/CompanyProcessApi.md#getCompanyProcessList) | **GET** /companies/{companyId}/process | 
*CompanyProcessApi* | [**updateCustomProcessScenario**](docs/CompanyProcessApi.md#updateCustomProcessScenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company
*CompanyTaxRatesApi* | [**createCustomTaxes**](docs/CompanyTaxRatesApi.md#createCustomTaxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
*CompanyTaxRatesApi* | [**deleteCustomTaxes**](docs/CompanyTaxRatesApi.md#deleteCustomTaxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
*CompanyTaxRatesApi* | [**getCompanyCustomTax**](docs/CompanyTaxRatesApi.md#getCompanyCustomTax) | **GET** /companies/{companyId}/taxrates/{taxType} | 
*CompanyTaxRatesApi* | [**getCompanyTaxRatesList**](docs/CompanyTaxRatesApi.md#getCompanyTaxRatesList) | **GET** /companies/{companyId}/taxrates | 
*CompanyTaxRatesApi* | [**updateCustomTaxes**](docs/CompanyTaxRatesApi.md#updateCustomTaxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company
*GoodsCalculationsApi* | [**calculationGood**](docs/GoodsCalculationsApi.md#calculationGood) | **POST** /calculations?goods | Calculation Method
*GoodsTransactionsApi* | [**transactionGoodsPurchase**](docs/GoodsTransactionsApi.md#transactionGoodsPurchase) | **POST** /transactions?goods | Transaction Method
*GooodsCalculationsApi* | [**retrieveGoodsTransactionDocument**](docs/GooodsCalculationsApi.md#retrieveGoodsTransactionDocument) | **GET** /calculations/goods/{transactionType}/{documentCode} | Retrieve goods transactions
*InvoiceContingencyApi* | [**invoiceDropContingency**](docs/InvoiceContingencyApi.md#invoiceDropContingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
*InvoiceContingencyApi* | [**invoiceSetContingency**](docs/InvoiceContingencyApi.md#invoiceSetContingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
*InvoiceContingencyApi* | [**invoiceVerifyContingency**](docs/InvoiceContingencyApi.md#invoiceVerifyContingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State
*InvoiceNFCEDANFEApi* | [**nfcePrint**](docs/InvoiceNFCEDANFEApi.md#nfcePrint) | **GET** /invoices/nfce/{key} | NFCe Danfe Print
*InvoiceNFEDANFEApi* | [**nfePrint**](docs/InvoiceNFEDANFEApi.md#nfePrint) | **GET** /invoices/nfe/{key} | Retrieve Danfe
*InvoiceSEFAZApi* | [**cancelInvoice**](docs/InvoiceSEFAZApi.md#cancelInvoice) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
*InvoiceSEFAZApi* | [**disableRange**](docs/InvoiceSEFAZApi.md#disableRange) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
*InvoiceSEFAZApi* | [**fixLetter**](docs/InvoiceSEFAZApi.md#fixLetter) | **PUT** /invoices/sefaz/{key} | Fix Letter
*InvoiceSEFAZApi* | [**retrieveInvoice**](docs/InvoiceSEFAZApi.md#retrieveInvoice) | **GET** /invoices/sefaz/{key} | Retrieve invoice
*InvoiceSEFAZApi* | [**retrieveInvoiceLookup**](docs/InvoiceSEFAZApi.md#retrieveInvoiceLookup) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
*InvoiceSEFAZApi* | [**retrieveStatus**](docs/InvoiceSEFAZApi.md#retrieveStatus) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server
*InvoiceSEFAZApi* | [**sendInvoice**](docs/InvoiceSEFAZApi.md#sendInvoice) | **POST** /invoices/sefaz | Send an e-Invoice
*InvoiceServiceApi* | [**cancelInvoiceService**](docs/InvoiceServiceApi.md#cancelInvoiceService) | **DELETE** /invoices/service/{key} | Cancel e-Invoice Service
*InvoiceServiceApi* | [**retrieveInvoiceService**](docs/InvoiceServiceApi.md#retrieveInvoiceService) | **GET** /invoices/service/{key} | Retrieve e-Invoice Service
*InvoiceServiceApi* | [**sendInvoiceService**](docs/InvoiceServiceApi.md#sendInvoiceService) | **POST** /invoices/service | Send an e-Invoice Service
*InvoiceSettingsApi* | [**invoiceSettings**](docs/InvoiceSettingsApi.md#invoiceSettings) | **GET** /invoices/settings | Invoice Settigns
*LegalReasonApi* | [**createReason_**](docs/LegalReasonApi.md#createReason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
*LegalReasonApi* | [**deleteReason_**](docs/LegalReasonApi.md#deleteReason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
*LegalReasonApi* | [**getReason_**](docs/LegalReasonApi.md#getReason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
*LegalReasonApi* | [**listReason**](docs/LegalReasonApi.md#listReason) | **GET** /taxconf/legal-reason | List Legal Reasons.
*LegalReasonApi* | [**updateReason_**](docs/LegalReasonApi.md#updateReason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.
*ServiceCalculationsApi* | [**calculationServicePayment**](docs/ServiceCalculationsApi.md#calculationServicePayment) | **POST** /calculations?service-payment | Calculation Method
*ServiceCalculationsApi* | [**calculationServicePurchase**](docs/ServiceCalculationsApi.md#calculationServicePurchase) | **POST** /calculations?service-purchase | Calculation Method
*ServiceCalculationsApi* | [**calculationServiceReceipt**](docs/ServiceCalculationsApi.md#calculationServiceReceipt) | **POST** /calculations?service-receipt | Calculation Method
*ServiceCalculationsApi* | [**calculationServiceSales**](docs/ServiceCalculationsApi.md#calculationServiceSales) | **POST** /calculations?service-sales | Calculation Method
*ServiceCalculationsApi* | [**convertServiceCalculatioToTransaction**](docs/ServiceCalculationsApi.md#convertServiceCalculatioToTransaction) | **POST** /calculations/service/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
*ServiceCalculationsApi* | [**retrieveGoodsTransactions**](docs/ServiceCalculationsApi.md#retrieveGoodsTransactions) | **GET** /calculations/goods/{transactionType} | Retrieve goods transactions
*ServiceCalculationsApi* | [**retrieveServiceTransactionDocument**](docs/ServiceCalculationsApi.md#retrieveServiceTransactionDocument) | **GET** /calculations/service/{transactionType}/{documentCode} | Retrieve service transactions
*ServiceCalculationsApi* | [**retrieveServiceTransactions**](docs/ServiceCalculationsApi.md#retrieveServiceTransactions) | **GET** /calculations/service/{transactionType} | Retrieve service transactions
*ServiceTransactionsApi* | [**retrieveServiceTransactions**](docs/ServiceTransactionsApi.md#retrieveServiceTransactions) | **GET** /transactions/service/{transactionType} | Retrieve service transactions
*ServiceTransactionsApi* | [**singleServiceTransaction**](docs/ServiceTransactionsApi.md#singleServiceTransaction) | **GET** /transactions/service/{transactionType}/{documentCode} | Retrieve service transactions
*ServiceTransactionsApi* | [**transactionServicePayment**](docs/ServiceTransactionsApi.md#transactionServicePayment) | **POST** /transactions?service-payment | Calculation Method
*ServiceTransactionsApi* | [**transactionServiceReceipt**](docs/ServiceTransactionsApi.md#transactionServiceReceipt) | **POST** /transactions?service-receipt | Calculation Method
*ServiceTransactionsApi* | [**transactionServiceSales**](docs/ServiceTransactionsApi.md#transactionServiceSales) | **POST** /transactions?service-purchase | Calculation Method
*ServiceTransactionsApi* | [**transactionServiceStateTransaction**](docs/ServiceTransactionsApi.md#transactionServiceStateTransaction) | **POST** /transactions/service/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
*ServiceTransactionsApi* | [**transactionServicesSales**](docs/ServiceTransactionsApi.md#transactionServicesSales) | **POST** /transactions?service-sales | Calculation Method
*TaxConfCFOPApi* | [**createCfop**](docs/TaxConfCFOPApi.md#createCfop) | **POST** /taxconf/cfop | create a new CFOP configuration
*TaxConfCFOPApi* | [**deleteCfop**](docs/TaxConfCFOPApi.md#deleteCfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
*TaxConfCFOPApi* | [**getCfop**](docs/TaxConfCFOPApi.md#getCfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
*TaxConfCFOPApi* | [**getCfopList**](docs/TaxConfCFOPApi.md#getCfopList) | **GET** /taxconf/cfop | retrive list of CFOP.
*TaxConfCFOPApi* | [**updateCfop**](docs/TaxConfCFOPApi.md#updateCfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration
*TaxConfIBPTApi* | [**createIbptFromCSV**](docs/TaxConfIBPTApi.md#createIbptFromCSV) | **POST** /taxconf/ibpt/{state} | create a new Process Type configuration
*TaxConfIBPTApi* | [**deleteIbptFromState**](docs/TaxConfIBPTApi.md#deleteIbptFromState) | **DELETE** /taxconf/ibpt/{state} | disable a IBPT.
*TaxConfICMSApi* | [**createIcmsconfstate**](docs/TaxConfICMSApi.md#createIcmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
*TaxConfICMSApi* | [**deleteIcmsConf**](docs/TaxConfICMSApi.md#deleteIcmsConf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
*TaxConfICMSApi* | [**getIcmsConfByState**](docs/TaxConfICMSApi.md#getIcmsConfByState) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
*TaxConfICMSApi* | [**getIcmsList**](docs/TaxConfICMSApi.md#getIcmsList) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
*TaxConfICMSApi* | [**getIcmsListSearch**](docs/TaxConfICMSApi.md#getIcmsListSearch) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
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

 - [AbrasfItDeleteIn](docs/AbrasfItDeleteIn.md)
 - [AbrasfItGetOut](docs/AbrasfItGetOut.md)
 - [AbrasfPostOut](docs/AbrasfPostOut.md)
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
 - [CsvIbptList](docs/CsvIbptList.md)
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
 - [ICMSSesonReason](docs/ICMSSesonReason.md)
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
 - [TransactionForAbrasf](docs/TransactionForAbrasf.md)
 - [TransactionForAbrasfList](docs/TransactionForAbrasfList.md)
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



