# AvaTaxBrazil.IcmsConfInterStateIcmsSTConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**protocolType** | **String** |  | [optional] 
**hasReductionOfMVAForSimples** | **Boolean** | inform that substituted is tax regime Simplified the operation MVA will be reduced | [optional] 
**reductionOfMVAForSimples** | **Number** | MVA reduction when substituted is tax regime Simplified. | [optional] 
**calcMode** | **String** | how this ICMS-ST will be calculed for itens linked to this configuration | [optional] 
**icmsStBaseDiscount** | **Number** | ICMS rate - Redução da BC ICMS ST (%) | [optional] 
**mvaRate** | **Number** | ICMS-ST MVA rate to define calc base | [optional] 
**srp** | **Number** | SRP or MSRP amount base for this ICMS-ST configuration | [optional] 
**srpUnit** | **String** | unit used to SRP amount value | [optional] 


<a name="ProtocolTypeEnum"></a>
## Enum: ProtocolTypeEnum


* `COVENANT` (value: `"COVENANT"`)

* `PROTOCOL` (value: `"PROTOCOL"`)

* `NOTHING` (value: `"NOTHING"`)




<a name="CalcModeEnum"></a>
## Enum: CalcModeEnum


* `BYMVARATE` (value: `"BYMVARATE"`)

* `SRP` (value: `"SRP"`)

* `MSRP` (value: `"MSRP"`)




