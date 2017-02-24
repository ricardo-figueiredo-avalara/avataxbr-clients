# AvaTaxBrazil.CfopConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**description** | **String** |  | [optional] 
**wayType** | **String** | inform if the transaction is an operation to internalizing item or value | [optional] 
**codInState** | **Number** | CFOP code (tax code operation) when the transactions are within the same state. | [optional] 
**codOtherState** | **Number** | CFOP code (tax code operation) when the transactions are to another state. | [optional] 
**codOtherCountry** | **Number** | CFOP code (tax code operation) when the transactions are to another country. | [optional] 
**cstICMSSameState** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] 
**cstICMSOtherState** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] 
**cstICMSOtherCountry** | [**CstIcmsEnum**](CstIcmsEnum.md) |  | [optional] 
**productType** | **String** | this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic | [optional] 
**operationToTaxPayerOtherState** | **Boolean** | field used to indicate an operation to ICMS tax payer | [optional] 
**operationWithST** | **Boolean** | field used to indicate an operation to items sibject to ICMS-ST | [optional] 
**operationToFreeZone** | **Boolean** | field used to indicate an operation to free zone | [optional] 
**specificForProductClass** | **String** | field used to indicate an operation to some product class specifically | [optional] 


<a name="WayTypeEnum"></a>
## Enum: WayTypeEnum


* `in` (value: `"in"`)

* `out` (value: `"out"`)




<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum


* `FOR PRODUCT` (value: `"FOR PRODUCT"`)

* `FOR MERCHANDISE` (value: `"FOR MERCHANDISE"`)

* `NO RESTRICTION` (value: `"NO RESTRICTION"`)




<a name="SpecificForProductClassEnum"></a>
## Enum: SpecificForProductClassEnum


* `OTHERS` (value: `"OTHERS"`)

* `COMMUNICATION` (value: `"COMMUNICATION"`)

* `ENERGY` (value: `"ENERGY"`)

* `TRANSPORT` (value: `"TRANSPORT"`)

* `FUEL AND LUBRIFICANT` (value: `"FUEL AND LUBRIFICANT"`)

* `VEHICLE` (value: `"VEHICLE"`)

* `ALCOHOLIC BEVERAGES` (value: `"ALCOHOLIC BEVERAGES"`)

* `WEAPONS` (value: `"WEAPONS"`)

* `AMMO` (value: `"AMMO"`)

* `PERFUM` (value: `"PERFUM"`)

* `TOBACCO` (value: `"TOBACCO"`)




