
# CustomProcessScenario

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code. | 
**stockImpact** | **Boolean** | Inform that the process has inventory impact. |  [optional]
**financialImpact** | **Boolean** | Inform that the process has financial impact. |  [optional]
**cstIPI** | [**CstIPIEnum**](#CstIPIEnum) | Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune  |  [optional]
**ipiLegalTaxClass** | **String** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  |  [optional]
**accruablePISTaxation** | [**AccruablePISTaxationEnum**](#AccruablePISTaxationEnum) | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  |  [optional]
**pisExemptLegalReasonCode** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number |  [optional]
**pisExemptLegalReason** | **String** | When specifi reason, this field has the description |  [optional]
**accruableCOFINSTaxation** | [**AccruableCOFINSTaxationEnum**](#AccruableCOFINSTaxationEnum) | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE  |  [optional]
**cofinsExemptLegalReasonCode** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number |  [optional]
**cofinsExemptLegalReason** | **String** | When specifi reason, this field has the description |  [optional]
**allowIPIcreditWhenInGoing** | **Boolean** | Inform that the process allow IPI credit to Input process |  [optional]
**icmsConf** | [**List&lt;IcmsTaxConf&gt;**](IcmsTaxConf.md) | the map key is state code |  [optional]
**name** | **String** | Process name to Identify this configuration | 
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**wayType** | [**WayTypeEnum**](#WayTypeEnum) | inform if the transaction is an operation to internalizing (receive) item or value |  [optional]
**goal** | [**GoalEnum**](#GoalEnum) |  |  [optional]
**overWriteCFOP** | **Boolean** | inform that the configuration process overwrites the cfop configuration. |  [optional]
**cfops** | [**List&lt;CfopConf&gt;**](CfopConf.md) |  |  [optional]
**companyId** | **String** | Company ID | 


<a name="CstIPIEnum"></a>
## Enum: CstIPIEnum
Name | Value
---- | -----
_50 | &quot;50&quot;
_51 | &quot;51&quot;
_52 | &quot;52&quot;
_53 | &quot;53&quot;
_54 | &quot;54&quot;


<a name="AccruablePISTaxationEnum"></a>
## Enum: AccruablePISTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
N | &quot;N&quot;


<a name="AccruableCOFINSTaxationEnum"></a>
## Enum: AccruableCOFINSTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
N | &quot;N&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SALES | &quot;SALES&quot;
PURCHASE | &quot;PURCHASE&quot;
SALES_RETURN | &quot;SALES_RETURN&quot;
PURCHASE_RETURN | &quot;PURCHASE_RETURN&quot;
TRANSFER_RETURN | &quot;TRANSFER_RETURN&quot;
SHIPPING | &quot;SHIPPING&quot;
SHIPPING_RETURN | &quot;SHIPPING_RETURN&quot;
TRANSFER | &quot;TRANSFER&quot;
RECEIPT_AJUSTE | &quot;RECEIPT_AJUSTE&quot;
TRANSFER_AJUSTE | &quot;TRANSFER_AJUSTE&quot;


<a name="WayTypeEnum"></a>
## Enum: WayTypeEnum
Name | Value
---- | -----
IN | &quot;in&quot;
OUT | &quot;out&quot;


<a name="GoalEnum"></a>
## Enum: GoalEnum
Name | Value
---- | -----
NORMAL | &quot;Normal&quot;
COMPLEMENTARY | &quot;Complementary&quot;
VOIDED | &quot;Voided&quot;
REPLACEMENT | &quot;Replacement&quot;
RETURN | &quot;Return&quot;
ADJUSTMENT | &quot;Adjustment&quot;



