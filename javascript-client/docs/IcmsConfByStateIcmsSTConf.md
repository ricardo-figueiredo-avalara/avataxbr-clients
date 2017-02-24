# AvaTaxBrazil.IcmsConfByStateIcmsSTConf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasReductionOfMVAForSimples** | **Boolean** | inform that substituted is tax regime Simplified the operation MVA will be reduced | [optional] 
**reductionOfMVAForSimples** | **Number** | mva reduction when substituted is tax regime Simplified. | [optional] 
**calcMode** | **String** | how this ICMS-ST will be calculed for itens linked to this configuration | [optional] 
**mvaRate** | **Number** | ICMS-ST mva rate to define calc base | [optional] 
**icmsStBaseDiscount** | **Number** | ICMS rate - Redução da BC ICMS ST (%) | [optional] 
**srp** | **Number** | SRP or MSRP amount base for this ICMS-ST configuration | [optional] 
**srpUnit** | **String** | unit used to srv amount value | [optional] 


<a name="CalcModeEnum"></a>
## Enum: CalcModeEnum


* `BYMVARATE` (value: `"BYMVARATE"`)

* `SRP` (value: `"SRP"`)

* `MSRP` (value: `"MSRP"`)




