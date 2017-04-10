# dot-net-client

The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities. This API is exclusively for use by business with a physical presence in Brazil.

## Getting Started

describe how to use.

## Documentation for API Endpoints

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AvaTaxBrazil.AuthApi* | [**getAuthorization**](docs/AuthApi.md#getAuthorization) | **POST** /v2/auth | authorization
*AvaTaxBrazil.AuthApi* | [**getAuthorization2**](docs/AuthApi.md#getAuthorization2) | **POST** /auth | authorization
*AvaTaxBrazil.ServiceCalculationsApi* | [**calculationServicePurchase**](docs/ServiceCalculationsApi.md#calculationServicePurchase) | **POST** /calculations?service-purchase | Calculation Method

## Author

Alexandre Carlos Luiz

