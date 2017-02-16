# SwaggerClient::Fuel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prod_anp_code** | **String** |  | 
**per_mix_gn** | **Float** | percentage of natural gas (GLP) | [optional] 
**authorization_code_codif** | **String** |  | [optional] 
**quantity_on_room_temperature** | **Float** | This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente.  | [optional] 
**state_code_of_und_user** | [**StateEnum**](StateEnum.md) | state where fuel was used | 
**cide** | [**FuelCide**](FuelCide.md) |  | [optional] 
**pump_number** | [**FuelPumpNumber**](FuelPumpNumber.md) |  | [optional] 


