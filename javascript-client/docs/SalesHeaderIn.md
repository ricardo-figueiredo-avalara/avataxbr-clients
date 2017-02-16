# Br16Api.SalesHeaderIn

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customerCode** | **String** | This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company. | 
**purchaseOrderNumber** | **String** | The number of Purchase Order | [optional] 
**rpsNumber** | **Number** | Provisional receipt services, sequencial number maintained by the client application, unique by serie | [optional] 
**rpsSerie** | **String** | set name identifier for rps number sequency. | [optional] [default to &#39;0&#39;]
**discriminationIn** | **String** | Service discrimination, free description about service | [optional] 
**entity** | [**SalesEntity**](SalesEntity.md) |  | [optional] 
**payment** | [**SalesHeaderInPayment**](SalesHeaderInPayment.md) |  | [optional] 
**taxesConfig** | [**SalesTaxesConfig**](SalesTaxesConfig.md) |  | [optional] 
**defaultLocations** | [**SalesDefaultLocations**](SalesDefaultLocations.md) |  | [optional] 


