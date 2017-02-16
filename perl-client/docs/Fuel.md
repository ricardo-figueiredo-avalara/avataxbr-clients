# WWW::SwaggerClient::Object::Fuel

## Load the model package
```perl
use WWW::SwaggerClient::Object::Fuel;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prod_anp_code** | **string** |  | 
**per_mix_gn** | **double** | percentage of natural gas (GLP) | [optional] 
**authorization_code_codif** | **string** |  | [optional] 
**quantity_on_room_temperature** | **double** | This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente.  | [optional] 
**state_code_of_und_user** | [**StateEnum**](StateEnum.md) | state where fuel was used | 
**cide** | [**FuelCide**](FuelCide.md) |  | [optional] 
**pump_number** | [**FuelPumpNumber**](FuelPumpNumber.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


