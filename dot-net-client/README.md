# dot-net-client

The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities. This API is exclusively for use by business with a physical presence in Brazil.

## Getting Started

```
using Avalara.AvaTax.Brazil.RestClient.Api;
using Avalara.AvaTax.Brazil.RestClient.Client;
using System;

namespace Avalara.AvaTax.AuthApiExample
{
    public class Program
    {
        static void Main(string[] args)
        {
            try
            {
                string user = "user_example";
                string password = "password_example";

                var authApi = new AuthApi(@"http://avataxbr-sandbox.avalarabrasil.com.br/v2");
                var responseAuth = authApi.AuthPostV1(user, password);
            }
            catch (ApiException e)
            {
                Console.WriteLine(string.Format("Exception when calling API: {0}", e.Message));
            }
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://avataxbr-sandbox.avalarabrasil.com.br/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AvaTaxBrazil.AuthApi* | **getAuthorization** | **POST** /v2/auth | authorization
*AvaTaxBrazil.AuthApi* | **getAuthorization2** | **POST** /auth | authorization
*AvaTaxBrazil.ServiceCalculationsApi* | **calculationServicePurchase**| **POST** /calculations?service-purchase | Calculation Method

## Author

Alexandre Carlos Luiz

