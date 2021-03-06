
# DetailsCalculatedTaxItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**locationType** | **String** | This string captures the applicable location type. Location used for calc. Buyer or Seller |  [optional]
**jurisdictionName** | **String** | Jurisdiction used for calctax amount |  [optional]
**jurisdictionType** | [**JurisdictionTypeEnum**](#JurisdictionTypeEnum) | Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39;  |  [optional]
**taxType** | [**TaxTypeEnum**](#TaxTypeEnum) | Tax identificator |  [optional]
**rateType** | **String** | Name of configuration rate |  [optional]
**scenario** | **String** | This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in. |  [optional]
**subtotalTaxable** | **Double** | This decimal captures how much of the lineAmount was taxable by this tax, calc base |  [optional]
**rate** | **Double** | This decimal captures the tax rate for this tax.3.00 (3%) |  [optional]
**tax** | **Double** | This decimal captures how much of the lineAmount was taxable by this tax |  [optional]
**exemptionCode** | **String** | This string is required if is exempt |  [optional]
**significantLocations** | **List&lt;String&gt;** | This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address |  [optional]
**taxRuleType** | [**TaxRuleTypeEnum**](#TaxRuleTypeEnum) | This string with type of rule |  [optional]
**source** | [**CSTTableAEnum**](CSTTableAEnum.md) |  |  [optional]
**cstB** | [**CSTTableBEnum**](CSTTableBEnum.md) |  |  [optional]
**cst** | **String** |  |  [optional]
**modBC** | **String** |  |  [optional]
**pMVA** | **Double** | Percent of Value-added margin (%) |  [optional]
**pRedBC** | **Double** | calc base percent of discount |  [optional]
**pBCOp** | **Double** | percent of calc base of own icms |  [optional]
**ufst** | [**StateEnum**](StateEnum.md) |  |  [optional]
**calcMode** | [**CalcModelEnum**](CalcModelEnum.md) |  |  [optional]
**legalTaxClass** | **Integer** | Legal tax classificação for IPI (enquadramento tributário) |  [optional]
**legalTaxClassDC** | **Integer** | Legal tax classificação for IPI (enquadramento) for Drinks and Cigarettes |  [optional]
**cnpjProd** | **String** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; Federal tax ID of real manufacturer, nly for exportation  |  [optional]
**sealCode** | **String** | Seal Code for ipi tax control (código do selo para controle de IPI) |  [optional]
**sealQuantity** | **String** | Seal Code for ipi tax control (código do selo para controle de IPI) |  [optional]
**icmsInterPartRate** | **Double** | percent of icms apportionment between two states |  [optional]
**icmsSesonReason** | [**ICMSSesonReason**](ICMSSesonReason.md) |  |  [optional]
**perQuantityReturned** | **Double** | percent of merchandise returned |  [optional]


<a name="JurisdictionTypeEnum"></a>
## Enum: JurisdictionTypeEnum
Name | Value
---- | -----
CITY | &quot;City&quot;
STATE | &quot;State&quot;
COUNTRY | &quot;Country&quot;


<a name="TaxTypeEnum"></a>
## Enum: TaxTypeEnum
Name | Value
---- | -----
ICMS | &quot;icms&quot;
ICMSST | &quot;icmsSt&quot;
ICMSSTSD | &quot;icmsStSd&quot;
ICMSPARTOWN | &quot;icmsPartOwn&quot;
ICMSPARTDEST | &quot;icmsPartDest&quot;
ICMSDIFAFCP | &quot;icmsDifaFCP&quot;
ICMSDIFADEST | &quot;icmsDifaDest&quot;
ICMSDIFAREMET | &quot;icmsDifaRemet&quot;
ICMSRF | &quot;icmsRf&quot;
ICMSDESON | &quot;icmsDeson&quot;
ICMSCREDSN | &quot;icmsCredsn&quot;
PIS | &quot;pis&quot;
PISST | &quot;pisSt&quot;
COFINS | &quot;cofins&quot;
COFINSST | &quot;cofinsSt&quot;
IPI | &quot;ipi&quot;
IPIRETURNED | &quot;ipiReturned&quot;
II | &quot;ii&quot;
IOF | &quot;iof&quot;
APROXTRIBSTATE | &quot;aproxtribState&quot;
APROXTRIBFED | &quot;aproxtribFed&quot;
APROXTRIB | &quot;aproxtrib&quot;


<a name="TaxRuleTypeEnum"></a>
## Enum: TaxRuleTypeEnum
Name | Value
---- | -----
SELLER | &quot;SELLER&quot;
BUYER | &quot;BUYER&quot;
TRANSACTION | &quot;TRANSACTION&quot;
ITEM | &quot;ITEM&quot;
TAX | &quot;TAX&quot;



