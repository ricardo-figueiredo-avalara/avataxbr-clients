# AvaTaxBrazil.ProcessScenario

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Process name to Identify this configuration | 
**code** | **String** | Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code. | [optional] 
**type** | **String** |  | [optional] 
**wayType** | **String** | inform if the transaction is an operation to internalizing (receive) item or value | [optional] 
**goal** | **String** |  | [optional] 
**overWriteCFOP** | **Boolean** | inform that the configuration process overwrites the cfop configuration. | [optional] 
**cfops** | [**[CfopConf]**](CfopConf.md) |  | [optional] 


<a name="TypeEnum"></a>
## Enum: TypeEnum


* `SALES` (value: `"SALES"`)

* `PURCHASE` (value: `"PURCHASE"`)

* `SALES_RETURN` (value: `"SALES_RETURN"`)

* `PURCHASE_RETURN` (value: `"PURCHASE_RETURN"`)

* `TRANSFER_RETURN` (value: `"TRANSFER_RETURN"`)

* `SHIPPING` (value: `"SHIPPING"`)

* `SHIPPING_RETURN` (value: `"SHIPPING_RETURN"`)

* `TRANSFER` (value: `"TRANSFER"`)

* `RECEIPT_AJUSTE` (value: `"RECEIPT_AJUSTE"`)

* `TRANSFER_AJUSTE` (value: `"TRANSFER_AJUSTE"`)




<a name="WayTypeEnum"></a>
## Enum: WayTypeEnum


* `in` (value: `"in"`)

* `out` (value: `"out"`)




<a name="GoalEnum"></a>
## Enum: GoalEnum


* `Normal` (value: `"Normal"`)

* `Complementary` (value: `"Complementary"`)

* `Voided` (value: `"Voided"`)

* `Replacement` (value: `"Replacement"`)

* `Return` (value: `"Return"`)

* `Adjustment` (value: `"Adjustment"`)




