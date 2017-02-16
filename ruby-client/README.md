# swagger_client

SwaggerClient - the Ruby gem for the BR16 - API

This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

This SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0
- Package version: 1.0.0
- Build package: io.swagger.codegen.languages.RubyClientCodegen

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build swagger_client.gemspec
```

Then either install the gem locally:

```shell
gem install ./swagger_client-1.0.0.gem
```
(for development, run `gem install --dev ./swagger_client-1.0.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'swagger_client', '~> 1.0.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/YOUR_GIT_USERNAME/YOUR_GIT_REPO, then add the following in the Gemfile:

    gem 'swagger_client', :git => 'https://github.com/YOUR_GIT_USERNAME/YOUR_GIT_REPO.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:
```ruby
# Load the gem
require 'swagger_client'

api_instance = SwaggerClient::AGASTApi.new

code = "code_example" # String | Agast Code


begin
  result = api_instance.agasts_code_get(code)
  p result
rescue SwaggerClient::ApiError => e
  puts "Exception when calling AGASTApi->agasts_code_get: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://br16-dev-app03.br.avalara.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SwaggerClient::AGASTApi* | [**agasts_code_get**](docs/AGASTApi.md#agasts_code_get) | **GET** /agasts/{code} | 
*SwaggerClient::AGASTApi* | [**create_agast**](docs/AGASTApi.md#create_agast) | **POST** /agasts | Create agast
*SwaggerClient::AGASTApi* | [**delete_agast**](docs/AGASTApi.md#delete_agast) | **DELETE** /agasts/{code} | 
*SwaggerClient::AGASTApi* | [**get_agast_list**](docs/AGASTApi.md#get_agast_list) | **GET** /agasts | 
*SwaggerClient::AGASTApi* | [**update_agast**](docs/AGASTApi.md#update_agast) | **PUT** /agasts/{code} | Update agast
*SwaggerClient::AccountApi* | [**accounts_account_id_companies_get**](docs/AccountApi.md#accounts_account_id_companies_get) | **GET** /accounts/{accountId}/companies | Retrieve Companies by account
*SwaggerClient::AccountApi* | [**create_account_company**](docs/AccountApi.md#create_account_company) | **POST** /accounts/{accountId}/companies | Create company and your data configuration
*SwaggerClient::AddressApi* | [**get_zip_code**](docs/AddressApi.md#get_zip_code) | **GET** /addresses/{zipcode} | 
*SwaggerClient::AuthApi* | [**auth_post**](docs/AuthApi.md#auth_post) | **POST** /auth | authorization
*SwaggerClient::CompanyApi* | [**companies_get**](docs/CompanyApi.md#companies_get) | **GET** /companies | Retrieve Companies by account
*SwaggerClient::CompanyApi* | [**create_company**](docs/CompanyApi.md#create_company) | **POST** /companies | Create company and your data configuration
*SwaggerClient::CompanyApi* | [**delete_account_company**](docs/CompanyApi.md#delete_account_company) | **DELETE** /accounts/{accountId}/companies/{companyId} | 
*SwaggerClient::CompanyApi* | [**delete_company**](docs/CompanyApi.md#delete_company) | **DELETE** /companies/{companyId} | 
*SwaggerClient::CompanyApi* | [**info_company**](docs/CompanyApi.md#info_company) | **GET** /companies/{companyId} | Get company information and your data configuration
*SwaggerClient::CompanyApi* | [**update_company**](docs/CompanyApi.md#update_company) | **PUT** /companies/{companyId} | Update company information and your data configuration
*SwaggerClient::CompanyAGASTApi* | [**companies_company_id_agasts_code_get**](docs/CompanyAGASTApi.md#companies_company_id_agasts_code_get) | **GET** /companies/{companyId}/agasts/{code} | 
*SwaggerClient::CompanyAGASTApi* | [**companies_company_id_agasts_get**](docs/CompanyAGASTApi.md#companies_company_id_agasts_get) | **GET** /companies/{companyId}/agasts | 
*SwaggerClient::CompanyAGASTApi* | [**create_custom_agast**](docs/CompanyAGASTApi.md#create_custom_agast) | **POST** /companies/{companyId}/agasts | Create custom agast for one company
*SwaggerClient::CompanyAGASTApi* | [**delete_agast**](docs/CompanyAGASTApi.md#delete_agast) | **DELETE** /companies/{companyId}/agasts/{code} | 
*SwaggerClient::CompanyAGASTApi* | [**update_custom_agast**](docs/CompanyAGASTApi.md#update_custom_agast) | **PUT** /companies/{companyId}/agasts/{code} | Update custom agast for one company
*SwaggerClient::CompanyFilesApi* | [**companies_company_id_nfse_certificate_delete**](docs/CompanyFilesApi.md#companies_company_id_nfse_certificate_delete) | **DELETE** /companies/{companyId}/nfse-certificate | 
*SwaggerClient::CompanyFilesApi* | [**companies_company_id_nfse_certificate_get**](docs/CompanyFilesApi.md#companies_company_id_nfse_certificate_get) | **GET** /companies/{companyId}/nfse-certificate | 
*SwaggerClient::CompanyFilesApi* | [**companies_company_id_nfse_certificate_post**](docs/CompanyFilesApi.md#companies_company_id_nfse_certificate_post) | **POST** /companies/{companyId}/nfse-certificate | 
*SwaggerClient::CompanyFilesApi* | [**companies_company_id_nfse_certificate_put**](docs/CompanyFilesApi.md#companies_company_id_nfse_certificate_put) | **PUT** /companies/{companyId}/nfse-certificate | 
*SwaggerClient::CompanyICMSApi* | [**companies_company_id_icms_get**](docs/CompanyICMSApi.md#companies_company_id_icms_get) | **GET** /companies/{companyId}/icms | 
*SwaggerClient::CompanyICMSApi* | [**companies_company_id_icms_state_get**](docs/CompanyICMSApi.md#companies_company_id_icms_state_get) | **GET** /companies/{companyId}/icms/{state} | 
*SwaggerClient::CompanyICMSApi* | [**create_icms**](docs/CompanyICMSApi.md#create_icms) | **POST** /companies/{companyId}/icms | Create custom ICMS tax for one company
*SwaggerClient::CompanyICMSApi* | [**delete_custom_icms_conf_by_state**](docs/CompanyICMSApi.md#delete_custom_icms_conf_by_state) | **DELETE** /companies/{companyId}/icms/{state} | 
*SwaggerClient::CompanyICMSApi* | [**update_custom_icms_conf_by_state**](docs/CompanyICMSApi.md#update_custom_icms_conf_by_state) | **PUT** /companies/{companyId}/icms/{state} | Update custom agast for one company
*SwaggerClient::CompanyItemCPOMServiceApi* | [**companies_company_id_items_code_cpom_city_code_get**](docs/CompanyItemCPOMServiceApi.md#companies_company_id_items_code_cpom_city_code_get) | **GET** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*SwaggerClient::CompanyItemCPOMServiceApi* | [**companies_company_id_items_code_cpom_get**](docs/CompanyItemCPOMServiceApi.md#companies_company_id_items_code_cpom_get) | **GET** /companies/{companyId}/items/{code}/cpom | 
*SwaggerClient::CompanyItemCPOMServiceApi* | [**create_item_cpom**](docs/CompanyItemCPOMServiceApi.md#create_item_cpom) | **POST** /companies/{companyId}/items/{code}/cpom | Create custom agast for one company
*SwaggerClient::CompanyItemCPOMServiceApi* | [**delete_item_cpom**](docs/CompanyItemCPOMServiceApi.md#delete_item_cpom) | **DELETE** /companies/{companyId}/items/{code}/cpom/{cityCode} | 
*SwaggerClient::CompanyItemCPOMServiceApi* | [**update_item_cpom**](docs/CompanyItemCPOMServiceApi.md#update_item_cpom) | **PUT** /companies/{companyId}/items/{code}/cpom/{cityCode} | Update custom agast for one company
*SwaggerClient::CompanyItemGoodsApi* | [**companies_company_id_items_code_change_code_put**](docs/CompanyItemGoodsApi.md#companies_company_id_items_code_change_code_put) | **PUT** /companies/{companyId}/items/{code}/change-code | 
*SwaggerClient::CompanyItemGoodsApi* | [**companies_company_id_items_codegoods_get**](docs/CompanyItemGoodsApi.md#companies_company_id_items_codegoods_get) | **GET** /companies/{companyId}/items/{code}?goods | 
*SwaggerClient::CompanyItemGoodsApi* | [**companies_company_id_itemsgoods_get**](docs/CompanyItemGoodsApi.md#companies_company_id_itemsgoods_get) | **GET** /companies/{companyId}/items?goods | 
*SwaggerClient::CompanyItemGoodsApi* | [**create_item**](docs/CompanyItemGoodsApi.md#create_item) | **POST** /companies/{companyId}/items?goods | Create custom agast for one company
*SwaggerClient::CompanyItemGoodsApi* | [**delete_item**](docs/CompanyItemGoodsApi.md#delete_item) | **DELETE** /companies/{companyId}/items/{code}?goods | 
*SwaggerClient::CompanyItemGoodsApi* | [**update_item**](docs/CompanyItemGoodsApi.md#update_item) | **PUT** /companies/{companyId}/items/{code}?goods | Update custom agast for one company
*SwaggerClient::CompanyItemServiceApi* | [**companies_company_id_items_code_change_code_put**](docs/CompanyItemServiceApi.md#companies_company_id_items_code_change_code_put) | **PUT** /companies/{companyId}/items/{code}/change-code | 
*SwaggerClient::CompanyItemServiceApi* | [**companies_company_id_items_codeservice_get**](docs/CompanyItemServiceApi.md#companies_company_id_items_codeservice_get) | **GET** /companies/{companyId}/items/{code}?service | 
*SwaggerClient::CompanyItemServiceApi* | [**companies_company_id_itemsservice_get**](docs/CompanyItemServiceApi.md#companies_company_id_itemsservice_get) | **GET** /companies/{companyId}/items?service | 
*SwaggerClient::CompanyItemServiceApi* | [**create_item_service**](docs/CompanyItemServiceApi.md#create_item_service) | **POST** /companies/{companyId}/items?service | Create custom agast for one company
*SwaggerClient::CompanyItemServiceApi* | [**delete_item_service**](docs/CompanyItemServiceApi.md#delete_item_service) | **DELETE** /companies/{companyId}/items/{code}?service | 
*SwaggerClient::CompanyItemServiceApi* | [**update_item_service**](docs/CompanyItemServiceApi.md#update_item_service) | **PUT** /companies/{companyId}/items/{code}?service | Update custom agast for one company
*SwaggerClient::CompanyLocationApi* | [**companies_company_id_locations_code_get**](docs/CompanyLocationApi.md#companies_company_id_locations_code_get) | **GET** /companies/{companyId}/locations/{code} | 
*SwaggerClient::CompanyLocationApi* | [**companies_company_id_locations_get**](docs/CompanyLocationApi.md#companies_company_id_locations_get) | **GET** /companies/{companyId}/locations | 
*SwaggerClient::CompanyLocationApi* | [**create_location**](docs/CompanyLocationApi.md#create_location) | **POST** /companies/{companyId}/locations | Create new location for company
*SwaggerClient::CompanyLocationApi* | [**delete_location**](docs/CompanyLocationApi.md#delete_location) | **DELETE** /companies/{companyId}/locations/{code} | 
*SwaggerClient::CompanyLocationApi* | [**update_location**](docs/CompanyLocationApi.md#update_location) | **PUT** /companies/{companyId}/locations/{code} | Update location for company
*SwaggerClient::CompanyProcessApi* | [**companies_company_id_process_code_get**](docs/CompanyProcessApi.md#companies_company_id_process_code_get) | **GET** /companies/{companyId}/process/{code} | 
*SwaggerClient::CompanyProcessApi* | [**companies_company_id_process_get**](docs/CompanyProcessApi.md#companies_company_id_process_get) | **GET** /companies/{companyId}/process | 
*SwaggerClient::CompanyProcessApi* | [**create_custom_process_scenario**](docs/CompanyProcessApi.md#create_custom_process_scenario) | **POST** /companies/{companyId}/process | Create custom process tax for one company
*SwaggerClient::CompanyProcessApi* | [**delete_custom_process_scenario**](docs/CompanyProcessApi.md#delete_custom_process_scenario) | **DELETE** /companies/{companyId}/process/{code} | 
*SwaggerClient::CompanyProcessApi* | [**update_custom_process_scenario**](docs/CompanyProcessApi.md#update_custom_process_scenario) | **PUT** /companies/{companyId}/process/{code} | Update custom agast for one company
*SwaggerClient::CompanyTaxRatesApi* | [**companies_company_id_taxrates_get**](docs/CompanyTaxRatesApi.md#companies_company_id_taxrates_get) | **GET** /companies/{companyId}/taxrates | 
*SwaggerClient::CompanyTaxRatesApi* | [**companies_company_id_taxrates_tax_type_get**](docs/CompanyTaxRatesApi.md#companies_company_id_taxrates_tax_type_get) | **GET** /companies/{companyId}/taxrates/{taxType} | 
*SwaggerClient::CompanyTaxRatesApi* | [**create_custom_taxes**](docs/CompanyTaxRatesApi.md#create_custom_taxes) | **POST** /companies/{companyId}/taxrates | Create custom agast for one company
*SwaggerClient::CompanyTaxRatesApi* | [**delete_custom_taxes**](docs/CompanyTaxRatesApi.md#delete_custom_taxes) | **DELETE** /companies/{companyId}/taxrates/{taxType} | 
*SwaggerClient::CompanyTaxRatesApi* | [**update_custom_taxes**](docs/CompanyTaxRatesApi.md#update_custom_taxes) | **PUT** /companies/{companyId}/taxrates/{taxType} | Update custom agast for one company
*SwaggerClient::GoodsCalculationsApi* | [**calculationsgoods_purchase_post**](docs/GoodsCalculationsApi.md#calculationsgoods_purchase_post) | **POST** /calculations?goods-purchase | Calculation Method
*SwaggerClient::GoodsCalculationsApi* | [**calculationsgoods_sales_post**](docs/GoodsCalculationsApi.md#calculationsgoods_sales_post) | **POST** /calculations?goods-sales | Calculation Method
*SwaggerClient::GoodsTransactionsApi* | [**transactionsgoods_purchase_post**](docs/GoodsTransactionsApi.md#transactionsgoods_purchase_post) | **POST** /transactions?goods-purchase | Transaction Method
*SwaggerClient::GoodsTransactionsApi* | [**transactionsgoods_sales_post**](docs/GoodsTransactionsApi.md#transactionsgoods_sales_post) | **POST** /transactions?goods-sales | Transaction Method
*SwaggerClient::InvoiceContingencyApi* | [**invoice_drop_contingency**](docs/InvoiceContingencyApi.md#invoice_drop_contingency) | **DELETE** /invoices/contingency/{state} | Invoice Drop Contingency per State
*SwaggerClient::InvoiceContingencyApi* | [**invoice_set_contingency**](docs/InvoiceContingencyApi.md#invoice_set_contingency) | **PUT** /invoices/contingency/{state} | Invoice Set Contingency per State
*SwaggerClient::InvoiceContingencyApi* | [**invoice_verify_contingency**](docs/InvoiceContingencyApi.md#invoice_verify_contingency) | **GET** /invoices/contingency/{state} | Invoice Verify Contingency per State
*SwaggerClient::InvoiceNFCeDANFEApi* | [**invoices_nfce_key_get**](docs/InvoiceNFCeDANFEApi.md#invoices_nfce_key_get) | **GET** /invoices/nfce/{key} | NFCe Danfe Print
*SwaggerClient::InvoiceNFeDANFEApi* | [**nfe_print**](docs/InvoiceNFeDANFEApi.md#nfe_print) | **GET** /invoices/nfe/{key} | Retrieve Danfe
*SwaggerClient::InvoiceSEFAZApi* | [**invoices_sefaz_delete**](docs/InvoiceSEFAZApi.md#invoices_sefaz_delete) | **DELETE** /invoices/sefaz | Disable Range e-Invoice
*SwaggerClient::InvoiceSEFAZApi* | [**invoices_sefaz_key_delete**](docs/InvoiceSEFAZApi.md#invoices_sefaz_key_delete) | **DELETE** /invoices/sefaz/{key} | Cancel invoice
*SwaggerClient::InvoiceSEFAZApi* | [**invoices_sefaz_key_get**](docs/InvoiceSEFAZApi.md#invoices_sefaz_key_get) | **GET** /invoices/sefaz/{key} | Retrieve invoice
*SwaggerClient::InvoiceSEFAZApi* | [**invoices_sefaz_key_lookup_get**](docs/InvoiceSEFAZApi.md#invoices_sefaz_key_lookup_get) | **GET** /invoices/sefaz/{key}/lookup | Retrieve invoice
*SwaggerClient::InvoiceSEFAZApi* | [**invoices_sefaz_key_put**](docs/InvoiceSEFAZApi.md#invoices_sefaz_key_put) | **PUT** /invoices/sefaz/{key} | Fix Letter
*SwaggerClient::InvoiceSEFAZApi* | [**invoices_sefaz_post**](docs/InvoiceSEFAZApi.md#invoices_sefaz_post) | **POST** /invoices/sefaz | Send an e-Invoice
*SwaggerClient::InvoiceSEFAZApi* | [**invoices_sefaz_status_get**](docs/InvoiceSEFAZApi.md#invoices_sefaz_status_get) | **GET** /invoices/sefaz/status | Retrieve Status of SEFAZ Server
*SwaggerClient::InvoiceSettingsApi* | [**invoice_settings**](docs/InvoiceSettingsApi.md#invoice_settings) | **GET** /invoices/settings | Invoice Settigns
*SwaggerClient::LegalReasonApi* | [**create_reason_**](docs/LegalReasonApi.md#create_reason_) | **POST** /taxconf/legal-reason | Create Legal Reason.
*SwaggerClient::LegalReasonApi* | [**delete_reason_**](docs/LegalReasonApi.md#delete_reason_) | **DELETE** /taxconf/legal-reason/{uuid} | Delete a Legal Reason entry.
*SwaggerClient::LegalReasonApi* | [**get_reason_**](docs/LegalReasonApi.md#get_reason_) | **GET** /taxconf/legal-reason/{uuid} | Get single Legal Reason.
*SwaggerClient::LegalReasonApi* | [**list_reason**](docs/LegalReasonApi.md#list_reason) | **GET** /taxconf/legal-reason | List Legal Reasons.
*SwaggerClient::LegalReasonApi* | [**update_reason_**](docs/LegalReasonApi.md#update_reason_) | **PUT** /taxconf/legal-reason | Update Legal Reason.
*SwaggerClient::ServiceCalculationsApi* | [**calculations_account_account_id_company_company_code_transaction_type_document_code_get**](docs/ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_document_code_get) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
*SwaggerClient::ServiceCalculationsApi* | [**calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post**](docs/ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post) | **POST** /calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions | Promote a calculation to transaction
*SwaggerClient::ServiceCalculationsApi* | [**calculations_account_account_id_company_company_code_transaction_type_get**](docs/ServiceCalculationsApi.md#calculations_account_account_id_company_company_code_transaction_type_get) | **GET** /calculations/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
*SwaggerClient::ServiceCalculationsApi* | [**calculationsservice_payment_post**](docs/ServiceCalculationsApi.md#calculationsservice_payment_post) | **POST** /calculations?service-payment | Calculation Method
*SwaggerClient::ServiceCalculationsApi* | [**calculationsservice_purchase_post**](docs/ServiceCalculationsApi.md#calculationsservice_purchase_post) | **POST** /calculations?service-purchase | Calculation Method
*SwaggerClient::ServiceCalculationsApi* | [**calculationsservice_receipt_post**](docs/ServiceCalculationsApi.md#calculationsservice_receipt_post) | **POST** /calculations?service-receipt | Calculation Method
*SwaggerClient::ServiceCalculationsApi* | [**calculationsservice_sales_post**](docs/ServiceCalculationsApi.md#calculationsservice_sales_post) | **POST** /calculations?service-sales | Calculation Method
*SwaggerClient::ServiceTransactionsApi* | [**transactions_account_account_id_company_company_code_transaction_type_document_code_get**](docs/ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_document_code_get) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode} | Retrieve transactions
*SwaggerClient::ServiceTransactionsApi* | [**transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post**](docs/ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post) | **POST** /transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions | Transaction State Transition
*SwaggerClient::ServiceTransactionsApi* | [**transactions_account_account_id_company_company_code_transaction_type_get**](docs/ServiceTransactionsApi.md#transactions_account_account_id_company_company_code_transaction_type_get) | **GET** /transactions/account/{accountId}/company/{companyCode}/{transactionType} | Retrieve transactions
*SwaggerClient::ServiceTransactionsApi* | [**transactionsservice_payment_post**](docs/ServiceTransactionsApi.md#transactionsservice_payment_post) | **POST** /transactions?service-payment | Calculation Method
*SwaggerClient::ServiceTransactionsApi* | [**transactionsservice_purchase_post**](docs/ServiceTransactionsApi.md#transactionsservice_purchase_post) | **POST** /transactions?service-purchase | Calculation Method
*SwaggerClient::ServiceTransactionsApi* | [**transactionsservice_receipt_post**](docs/ServiceTransactionsApi.md#transactionsservice_receipt_post) | **POST** /transactions?service-receipt | Calculation Method
*SwaggerClient::ServiceTransactionsApi* | [**transactionsservice_sales_post**](docs/ServiceTransactionsApi.md#transactionsservice_sales_post) | **POST** /transactions?service-sales | Calculation Method
*SwaggerClient::TaxConfCFOPApi* | [**create_cfop**](docs/TaxConfCFOPApi.md#create_cfop) | **POST** /taxconf/cfop | create a new CFOP configuration
*SwaggerClient::TaxConfCFOPApi* | [**delete_cfop**](docs/TaxConfCFOPApi.md#delete_cfop) | **DELETE** /taxconf/cfop/{code} | disable a CFOP.
*SwaggerClient::TaxConfCFOPApi* | [**get_cfop**](docs/TaxConfCFOPApi.md#get_cfop) | **GET** /taxconf/cfop/{code} | get CFOP information.
*SwaggerClient::TaxConfCFOPApi* | [**get_cfop_list**](docs/TaxConfCFOPApi.md#get_cfop_list) | **GET** /taxconf/cfop | retrive list of CFOP.
*SwaggerClient::TaxConfCFOPApi* | [**update_cfop**](docs/TaxConfCFOPApi.md#update_cfop) | **PUT** /taxconf/cfop/{code} | update a CFOP configuration
*SwaggerClient::TaxConfIBPTApi* | [**create_ibpt_conf**](docs/TaxConfIBPTApi.md#create_ibpt_conf) | **POST** /taxconf/ibpt | create a new Process Type configuration
*SwaggerClient::TaxConfIBPTApi* | [**delete_ibpt_conf**](docs/TaxConfIBPTApi.md#delete_ibpt_conf) | **DELETE** /taxconf/ibpt/{code} | disable a IBPT.
*SwaggerClient::TaxConfIBPTApi* | [**get_ibpt_conf**](docs/TaxConfIBPTApi.md#get_ibpt_conf) | **GET** /taxconf/ibpt/{code} | get IBPT information.
*SwaggerClient::TaxConfIBPTApi* | [**get_ibpt_conf_list**](docs/TaxConfIBPTApi.md#get_ibpt_conf_list) | **GET** /taxconf/ibpt | retrive list of IBPT.
*SwaggerClient::TaxConfIBPTApi* | [**update_ibpt_conf**](docs/TaxConfIBPTApi.md#update_ibpt_conf) | **PUT** /taxconf/ibpt/{code} | update a Process Type configuration
*SwaggerClient::TaxConfICMSApi* | [**create_icmsconfstate**](docs/TaxConfICMSApi.md#create_icmsconfstate) | **POST** /taxconf/icms/{state} | create a new ICMS Configuration
*SwaggerClient::TaxConfICMSApi* | [**delete_icms_conf**](docs/TaxConfICMSApi.md#delete_icms_conf) | **DELETE** /taxconf/icms/{state}/{code} | disable a ICMS by State.
*SwaggerClient::TaxConfICMSApi* | [**get_icms_conf_by_state**](docs/TaxConfICMSApi.md#get_icms_conf_by_state) | **GET** /taxconf/icms/{state}/{code} | get ICMS information by State.
*SwaggerClient::TaxConfICMSApi* | [**get_icms_list**](docs/TaxConfICMSApi.md#get_icms_list) | **GET** /taxconf/icms/{state} | retrive list of ICMS.
*SwaggerClient::TaxConfICMSApi* | [**get_icms_list_0**](docs/TaxConfICMSApi.md#get_icms_list_0) | **GET** /taxconf/icms-search/ | retrive list of ICMS.
*SwaggerClient::TaxConfICMSApi* | [**update_icmsconfstate**](docs/TaxConfICMSApi.md#update_icmsconfstate) | **PUT** /taxconf/icms/{state}/{code} | update a IcmsConf State,
*SwaggerClient::TaxConfISSApi* | [**create_iss_conf_by_city**](docs/TaxConfISSApi.md#create_iss_conf_by_city) | **POST** /taxconf/iss | create a new ISS Configuration
*SwaggerClient::TaxConfISSApi* | [**delete_iss_conf**](docs/TaxConfISSApi.md#delete_iss_conf) | **DELETE** /taxconf/iss/{cityCode} | disable a ISS by City Code.
*SwaggerClient::TaxConfISSApi* | [**get_iss_conf_by_city**](docs/TaxConfISSApi.md#get_iss_conf_by_city) | **GET** /taxconf/iss/{cityCode} | get ISS information by City Code.
*SwaggerClient::TaxConfISSApi* | [**get_iss_list**](docs/TaxConfISSApi.md#get_iss_list) | **GET** /taxconf/iss | retrive list of ISS
*SwaggerClient::TaxConfISSApi* | [**update_iss_conf_by_city**](docs/TaxConfISSApi.md#update_iss_conf_by_city) | **PUT** /taxconf/iss/{cityCode} | update a ISS by City Code.
*SwaggerClient::TaxConfProcessApi* | [**create_process**](docs/TaxConfProcessApi.md#create_process) | **POST** /taxconf/process | create a new Process Type configuration
*SwaggerClient::TaxConfProcessApi* | [**delete_process**](docs/TaxConfProcessApi.md#delete_process) | **DELETE** /taxconf/process/{code} | disable a Process.
*SwaggerClient::TaxConfProcessApi* | [**get_process**](docs/TaxConfProcessApi.md#get_process) | **GET** /taxconf/process/{code} | get Process information.
*SwaggerClient::TaxConfProcessApi* | [**get_process_list**](docs/TaxConfProcessApi.md#get_process_list) | **GET** /taxconf/process | retrive list of Process.
*SwaggerClient::TaxConfProcessApi* | [**update_process**](docs/TaxConfProcessApi.md#update_process) | **PUT** /taxconf/process/{code} | update a Process Type configuration


## Documentation for Models

 - [SwaggerClient::AccountCompany](docs/AccountCompany.md)
 - [SwaggerClient::AdditionalInformation](docs/AdditionalInformation.md)
 - [SwaggerClient::AdditionalInformationProcRef](docs/AdditionalInformationProcRef.md)
 - [SwaggerClient::Address](docs/Address.md)
 - [SwaggerClient::Agast](docs/Agast.md)
 - [SwaggerClient::AgastCodeType](docs/AgastCodeType.md)
 - [SwaggerClient::AgastExtendForSefaz](docs/AgastExtendForSefaz.md)
 - [SwaggerClient::AgastIcmsConf](docs/AgastIcmsConf.md)
 - [SwaggerClient::Body](docs/Body.md)
 - [SwaggerClient::Body1](docs/Body1.md)
 - [SwaggerClient::Body2](docs/Body2.md)
 - [SwaggerClient::Body3](docs/Body3.md)
 - [SwaggerClient::Body4](docs/Body4.md)
 - [SwaggerClient::CSTPistCofinsEnum](docs/CSTPistCofinsEnum.md)
 - [SwaggerClient::CSTTableAEnum](docs/CSTTableAEnum.md)
 - [SwaggerClient::CSTTableBEnum](docs/CSTTableBEnum.md)
 - [SwaggerClient::CalcModelEnum](docs/CalcModelEnum.md)
 - [SwaggerClient::CalculatedTaxSummaryForGoods](docs/CalculatedTaxSummaryForGoods.md)
 - [SwaggerClient::CalculatedTaxSummaryForGoodsTaxByType](docs/CalculatedTaxSummaryForGoodsTaxByType.md)
 - [SwaggerClient::CfopConf](docs/CfopConf.md)
 - [SwaggerClient::Company](docs/Company.md)
 - [SwaggerClient::CompanyAuthorizedToDownloadNFe](docs/CompanyAuthorizedToDownloadNFe.md)
 - [SwaggerClient::CompanyConfiguration](docs/CompanyConfiguration.md)
 - [SwaggerClient::CompanyMailServer](docs/CompanyMailServer.md)
 - [SwaggerClient::CstIcmsEnum](docs/CstIcmsEnum.md)
 - [SwaggerClient::CustomAgast](docs/CustomAgast.md)
 - [SwaggerClient::CustomIcmsConfByState](docs/CustomIcmsConfByState.md)
 - [SwaggerClient::CustomProcessScenario](docs/CustomProcessScenario.md)
 - [SwaggerClient::CustomTaxTypeRate](docs/CustomTaxTypeRate.md)
 - [SwaggerClient::DefaultLocations](docs/DefaultLocations.md)
 - [SwaggerClient::DetailsCalculatedTax](docs/DetailsCalculatedTax.md)
 - [SwaggerClient::DetailsCalculatedTaxItem](docs/DetailsCalculatedTaxItem.md)
 - [SwaggerClient::Entity](docs/Entity.md)
 - [SwaggerClient::EntityForGoods](docs/EntityForGoods.md)
 - [SwaggerClient::EntityInformerForGoods](docs/EntityInformerForGoods.md)
 - [SwaggerClient::EntityInformerForGoodsFederalTaxRegime](docs/EntityInformerForGoodsFederalTaxRegime.md)
 - [SwaggerClient::EntityLocation](docs/EntityLocation.md)
 - [SwaggerClient::EntityType](docs/EntityType.md)
 - [SwaggerClient::Error](docs/Error.md)
 - [SwaggerClient::ExportInfo](docs/ExportInfo.md)
 - [SwaggerClient::FederalTaxRegime](docs/FederalTaxRegime.md)
 - [SwaggerClient::Fuel](docs/Fuel.md)
 - [SwaggerClient::FuelCide](docs/FuelCide.md)
 - [SwaggerClient::FuelPumpNumber](docs/FuelPumpNumber.md)
 - [SwaggerClient::HeaderBaseInfo](docs/HeaderBaseInfo.md)
 - [SwaggerClient::HeaderForGoods](docs/HeaderForGoods.md)
 - [SwaggerClient::HeaderForGoodsParticipants](docs/HeaderForGoodsParticipants.md)
 - [SwaggerClient::IbptConf](docs/IbptConf.md)
 - [SwaggerClient::IcmsConfByState](docs/IcmsConfByState.md)
 - [SwaggerClient::IcmsConfByStateIcmsSTConf](docs/IcmsConfByStateIcmsSTConf.md)
 - [SwaggerClient::IcmsConfInterState](docs/IcmsConfInterState.md)
 - [SwaggerClient::IcmsConfInterStateIcmsSTConf](docs/IcmsConfInterStateIcmsSTConf.md)
 - [SwaggerClient::IcmsTaxConf](docs/IcmsTaxConf.md)
 - [SwaggerClient::IcmsTaxConfBase](docs/IcmsTaxConfBase.md)
 - [SwaggerClient::InformerForGoods](docs/InformerForGoods.md)
 - [SwaggerClient::InformerForGoodsCsts](docs/InformerForGoodsCsts.md)
 - [SwaggerClient::InlineResponse200](docs/InlineResponse200.md)
 - [SwaggerClient::InlineResponse2001](docs/InlineResponse2001.md)
 - [SwaggerClient::InlineResponse2002](docs/InlineResponse2002.md)
 - [SwaggerClient::InlineResponse2003](docs/InlineResponse2003.md)
 - [SwaggerClient::InlineResponse2004](docs/InlineResponse2004.md)
 - [SwaggerClient::InlineResponse201](docs/InlineResponse201.md)
 - [SwaggerClient::InstallmentComplete](docs/InstallmentComplete.md)
 - [SwaggerClient::IpbtConfItem](docs/IpbtConfItem.md)
 - [SwaggerClient::IssConfByCity](docs/IssConfByCity.md)
 - [SwaggerClient::IssConfServiceList](docs/IssConfServiceList.md)
 - [SwaggerClient::IssConfServiceListTaxRate](docs/IssConfServiceListTaxRate.md)
 - [SwaggerClient::IssConfServiceListTaxRateIbpt](docs/IssConfServiceListTaxRateIbpt.md)
 - [SwaggerClient::ItemCpom](docs/ItemCpom.md)
 - [SwaggerClient::ItemGoods](docs/ItemGoods.md)
 - [SwaggerClient::ItemSimple](docs/ItemSimple.md)
 - [SwaggerClient::LegalReason](docs/LegalReason.md)
 - [SwaggerClient::LegalReasonReferencedProcesses](docs/LegalReasonReferencedProcesses.md)
 - [SwaggerClient::LegalReasonTaxScope](docs/LegalReasonTaxScope.md)
 - [SwaggerClient::LineForGoods](docs/LineForGoods.md)
 - [SwaggerClient::LineForGoodsAdi](docs/LineForGoodsAdi.md)
 - [SwaggerClient::LineForGoodsCalculatedTax](docs/LineForGoodsCalculatedTax.md)
 - [SwaggerClient::LineForGoodsCalculatedTaxTaxByType](docs/LineForGoodsCalculatedTaxTaxByType.md)
 - [SwaggerClient::LineForGoodsDi](docs/LineForGoodsDi.md)
 - [SwaggerClient::LineForGoodsExport](docs/LineForGoodsExport.md)
 - [SwaggerClient::LineForGoodsIcmsTaxRelief](docs/LineForGoodsIcmsTaxRelief.md)
 - [SwaggerClient::LineForGoodsIndExport](docs/LineForGoodsIndExport.md)
 - [SwaggerClient::LineForSefazGoods](docs/LineForSefazGoods.md)
 - [SwaggerClient::Location](docs/Location.md)
 - [SwaggerClient::LocationSecondaryStateTaxId](docs/LocationSecondaryStateTaxId.md)
 - [SwaggerClient::Medicine](docs/Medicine.md)
 - [SwaggerClient::Message](docs/Message.md)
 - [SwaggerClient::NRef](docs/NRef.md)
 - [SwaggerClient::NRefRefECF](docs/NRefRefECF.md)
 - [SwaggerClient::NRefRefFarmerNF](docs/NRefRefFarmerNF.md)
 - [SwaggerClient::NRefRefNF](docs/NRefRefNF.md)
 - [SwaggerClient::PayRecCalculatedTaxSummaryForService](docs/PayRecCalculatedTaxSummaryForService.md)
 - [SwaggerClient::PayRecCalculatedTaxSummaryForServiceTaxByType](docs/PayRecCalculatedTaxSummaryForServiceTaxByType.md)
 - [SwaggerClient::PayRecHeader](docs/PayRecHeader.md)
 - [SwaggerClient::PayRecLinesIn](docs/PayRecLinesIn.md)
 - [SwaggerClient::PayRecLinesOut](docs/PayRecLinesOut.md)
 - [SwaggerClient::Payment](docs/Payment.md)
 - [SwaggerClient::PaymentBill](docs/PaymentBill.md)
 - [SwaggerClient::PaymentCalculatedTax](docs/PaymentCalculatedTax.md)
 - [SwaggerClient::PaymentInstallment](docs/PaymentInstallment.md)
 - [SwaggerClient::PaymentLinesIn](docs/PaymentLinesIn.md)
 - [SwaggerClient::PaymentPaymentMode](docs/PaymentPaymentMode.md)
 - [SwaggerClient::PaymentTaxByType](docs/PaymentTaxByType.md)
 - [SwaggerClient::PaymentTerms](docs/PaymentTerms.md)
 - [SwaggerClient::PaymentTransactionIn](docs/PaymentTransactionIn.md)
 - [SwaggerClient::PaymentTransactionOut](docs/PaymentTransactionOut.md)
 - [SwaggerClient::PccWithholdingMode](docs/PccWithholdingMode.md)
 - [SwaggerClient::PointOfOrderOrigin](docs/PointOfOrderOrigin.md)
 - [SwaggerClient::ProcessScenario](docs/ProcessScenario.md)
 - [SwaggerClient::ProcessingInfo](docs/ProcessingInfo.md)
 - [SwaggerClient::PurchaseCalculatedTax](docs/PurchaseCalculatedTax.md)
 - [SwaggerClient::PurchaseCalculatedTaxSummaryForService](docs/PurchaseCalculatedTaxSummaryForService.md)
 - [SwaggerClient::PurchaseCalculatedTaxSummaryForServiceTaxByType](docs/PurchaseCalculatedTaxSummaryForServiceTaxByType.md)
 - [SwaggerClient::PurchaseDefaultLocations](docs/PurchaseDefaultLocations.md)
 - [SwaggerClient::PurchaseEntity](docs/PurchaseEntity.md)
 - [SwaggerClient::PurchaseHeaderIn](docs/PurchaseHeaderIn.md)
 - [SwaggerClient::PurchaseHeaderInPayment](docs/PurchaseHeaderInPayment.md)
 - [SwaggerClient::PurchaseHeaderOut](docs/PurchaseHeaderOut.md)
 - [SwaggerClient::PurchaseHeaderOutPayment](docs/PurchaseHeaderOutPayment.md)
 - [SwaggerClient::PurchaseInfo](docs/PurchaseInfo.md)
 - [SwaggerClient::PurchaseInstallmentIn](docs/PurchaseInstallmentIn.md)
 - [SwaggerClient::PurchaseLinesIn](docs/PurchaseLinesIn.md)
 - [SwaggerClient::PurchaseLinesOut](docs/PurchaseLinesOut.md)
 - [SwaggerClient::PurchaseTaxByType](docs/PurchaseTaxByType.md)
 - [SwaggerClient::PurchaseTaxByTypeDetail](docs/PurchaseTaxByTypeDetail.md)
 - [SwaggerClient::PurchaseTaxesConfig](docs/PurchaseTaxesConfig.md)
 - [SwaggerClient::PurchaseTransactionIn](docs/PurchaseTransactionIn.md)
 - [SwaggerClient::PurchaseTransactionOut](docs/PurchaseTransactionOut.md)
 - [SwaggerClient::ReceiptTransactionIn](docs/ReceiptTransactionIn.md)
 - [SwaggerClient::ReceiptTransactionOut](docs/ReceiptTransactionOut.md)
 - [SwaggerClient::SalesCalculatedTax](docs/SalesCalculatedTax.md)
 - [SwaggerClient::SalesCalculatedTaxSummaryForService](docs/SalesCalculatedTaxSummaryForService.md)
 - [SwaggerClient::SalesCalculatedTaxSummaryForServiceTaxByType](docs/SalesCalculatedTaxSummaryForServiceTaxByType.md)
 - [SwaggerClient::SalesDefaultLocations](docs/SalesDefaultLocations.md)
 - [SwaggerClient::SalesEntity](docs/SalesEntity.md)
 - [SwaggerClient::SalesHeaderIn](docs/SalesHeaderIn.md)
 - [SwaggerClient::SalesHeaderInPayment](docs/SalesHeaderInPayment.md)
 - [SwaggerClient::SalesHeaderOut](docs/SalesHeaderOut.md)
 - [SwaggerClient::SalesHeaderOutPayment](docs/SalesHeaderOutPayment.md)
 - [SwaggerClient::SalesInstallmentIn](docs/SalesInstallmentIn.md)
 - [SwaggerClient::SalesLinesIn](docs/SalesLinesIn.md)
 - [SwaggerClient::SalesLinesInTaxDeductions](docs/SalesLinesInTaxDeductions.md)
 - [SwaggerClient::SalesLinesOut](docs/SalesLinesOut.md)
 - [SwaggerClient::SalesLinesOutTaxDeductions](docs/SalesLinesOutTaxDeductions.md)
 - [SwaggerClient::SalesTaxByType](docs/SalesTaxByType.md)
 - [SwaggerClient::SalesTaxByTypeDetail](docs/SalesTaxByTypeDetail.md)
 - [SwaggerClient::SalesTaxesConfig](docs/SalesTaxesConfig.md)
 - [SwaggerClient::SalesTransactionIn](docs/SalesTransactionIn.md)
 - [SwaggerClient::SalesTransactionOut](docs/SalesTransactionOut.md)
 - [SwaggerClient::SefazDisableRangeIn](docs/SefazDisableRangeIn.md)
 - [SwaggerClient::SefazInvoiceBasicStatus](docs/SefazInvoiceBasicStatus.md)
 - [SwaggerClient::SefazInvoiceStatus](docs/SefazInvoiceStatus.md)
 - [SwaggerClient::SefazItDeleteIn](docs/SefazItDeleteIn.md)
 - [SwaggerClient::SefazItGetOut](docs/SefazItGetOut.md)
 - [SwaggerClient::SefazItPutIn](docs/SefazItPutIn.md)
 - [SwaggerClient::SefazPostOut](docs/SefazPostOut.md)
 - [SwaggerClient::ServiceItemTaxRate](docs/ServiceItemTaxRate.md)
 - [SwaggerClient::ServiceItemTaxRatePeriod](docs/ServiceItemTaxRatePeriod.md)
 - [SwaggerClient::ServiceRendered](docs/ServiceRendered.md)
 - [SwaggerClient::SimpleAddress](docs/SimpleAddress.md)
 - [SwaggerClient::StateEnum](docs/StateEnum.md)
 - [SwaggerClient::StateTransition](docs/StateTransition.md)
 - [SwaggerClient::TaxByTypeSummaryForGoods](docs/TaxByTypeSummaryForGoods.md)
 - [SwaggerClient::TaxByTypeSummaryForService](docs/TaxByTypeSummaryForService.md)
 - [SwaggerClient::TaxByTypeSummaryJurisdiction](docs/TaxByTypeSummaryJurisdiction.md)
 - [SwaggerClient::TaxByTypeSummaryJurisdictionForGoods](docs/TaxByTypeSummaryJurisdictionForGoods.md)
 - [SwaggerClient::TaxByTypeTax](docs/TaxByTypeTax.md)
 - [SwaggerClient::TaxConf](docs/TaxConf.md)
 - [SwaggerClient::TaxType](docs/TaxType.md)
 - [SwaggerClient::TaxTypeRate](docs/TaxTypeRate.md)
 - [SwaggerClient::TaxTypeRateWithholding](docs/TaxTypeRateWithholding.md)
 - [SwaggerClient::TransactionForGoodsIn](docs/TransactionForGoodsIn.md)
 - [SwaggerClient::TransactionForGoodsOut](docs/TransactionForGoodsOut.md)
 - [SwaggerClient::TransactionForSefazGoods](docs/TransactionForSefazGoods.md)
 - [SwaggerClient::TransactionForSefazGoodsList](docs/TransactionForSefazGoodsList.md)
 - [SwaggerClient::Transport](docs/Transport.md)
 - [SwaggerClient::TransportVolumes](docs/TransportVolumes.md)
 - [SwaggerClient::ValidationError](docs/ValidationError.md)
 - [SwaggerClient::Vehicle](docs/Vehicle.md)
 - [SwaggerClient::VehicleID](docs/VehicleID.md)
 - [SwaggerClient::VehicleTransp](docs/VehicleTransp.md)
 - [SwaggerClient::Weapon](docs/Weapon.md)
 - [SwaggerClient::WithholdDef](docs/WithholdDef.md)
 - [SwaggerClient::WithholdingMode](docs/WithholdingMode.md)


## Documentation for Authorization

 All endpoints do not require authorization.
