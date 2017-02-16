
# CustomIcmsConfByState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Identify the IcmsConfState in namespace | 
**state** | [**StateEnum**](StateEnum.md) |  | 
**name** | **String** | name for this configuration |  [optional]
**startDate** | [**DateTime**](DateTime.md) | date when this configuration values starts |  [optional]
**expirationDate** | [**DateTime**](DateTime.md) | date when this configuration values expire |  [optional]
**inactive** | **Boolean** | set this configuration to Inactive |  [optional]
**subjectToST** | **Boolean** | inform that the item linked to this configuration is subject to ICMS ST on this state |  [optional]
**icmsCST** | [**IcmsCSTEnum**](#IcmsCSTEnum) | On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - &#39;00&#39; # TAXABLE - &#39;20&#39; # TAXABLE WITH BASE DISCOUNT - &#39;40&#39; # EXEMPT - &#39;41&#39; # NOT TAXABLE - &#39;50&#39; # SUSPENDED  |  [optional]
**calcMode** | [**CalcModeEnum**](#CalcModeEnum) | how this ICMS will be calculed for itens linked to this configuration |  [optional]
**discountRateForMonoPhase** | **Double** | discount if the item is subject to monophase PIS/COFINS for transactions inside state |  [optional]
**rate** | **Double** | ICMS rate |  [optional]
**icmsBaseDiscount** | **Double** | ICMS rate |  [optional]
**msrp** | **Double** | SRP or MMSRP amount base for this icms configuration |  [optional]
**mvaRate** | **Double** | ICMS mva rate to define calc base |  [optional]
**msrpUnit** | **String** | unit used to SRP amount value |  [optional]
**icmsLegalReason** | **String** | Code for the ICM legal reason, this message will be placed on invoice. |  [optional]
**fcpRate** | **Double** | Fundo de Combate à pobreza / Fund Against Poverty |  [optional]
**icmsSTConf** | [**IcmsConfByStateIcmsSTConf**](IcmsConfByStateIcmsSTConf.md) |  |  [optional]
**icmsInterStateConf** | [**List&lt;IcmsConfInterState&gt;**](IcmsConfInterState.md) | the map key is state code |  [optional]
**companyId** | **String** | Company ID | 


<a name="IcmsCSTEnum"></a>
## Enum: IcmsCSTEnum
Name | Value
---- | -----
_00 | &quot;00&quot;
_20 | &quot;20&quot;
_40 | &quot;40&quot;
_41 | &quot;41&quot;
_50 | &quot;50&quot;


<a name="CalcModeEnum"></a>
## Enum: CalcModeEnum
Name | Value
---- | -----
BYMVARATE | &quot;BYMVARATE&quot;
SRP | &quot;SRP&quot;
MMSRP | &quot;MMSRP&quot;
OPERATIONAMOUNT | &quot;OPERATIONAMOUNT&quot;



