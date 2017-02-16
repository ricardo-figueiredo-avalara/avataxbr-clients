# SWGTaxTypeRate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taxType** | [**SWGTaxType***](SWGTaxType.md) |  | 
**taxModel** | **NSString*** | Tax can be calculated by rate or by quantity | 
**rate** | **NSNumber*** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**srvAmount** | **NSNumber*** | Specific tax rate ex 3.5 (3.5%) | [optional] 
**quantityUnidBase** | **NSString*** |  | [optional] 
**specializationType** | **NSString*** |  | [optional] 
**exemptionReasonCode** | **NSString*** | UUID Reference to an item in the LegalReason store.  | [optional] 
**customExemptionReasonDescription** | **NSString*** | Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 &#x3D; Other).  | [optional] 
**withholding** | [**SWGTaxTypeRateWithholding***](SWGTaxTypeRateWithholding.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


