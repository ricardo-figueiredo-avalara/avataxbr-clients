
# ProcessScenario

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code. | 
**stockImpact** | **Boolean** | Inform that the process has inventory impact. |  [optional]
**financialImpact** | **Boolean** | Inform that the process has financial impact. |  [optional]
**cstIPI** | [**CstIPIEnum**](#CstIPIEnum) | Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  |  [optional]
**ipiLegalTaxClass** | **String** | Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D;  |  [optional]
**accruablePISTaxation** | [**AccruablePISTaxationEnum**](#AccruablePISTaxationEnum) | Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE - &#39;O&#39; # OTHER - &#39;OZ&#39;# OTHER AND ZERO VALUES  |  [optional]
**pisExemptLegalReasonCode** | **String** | Reference to a tax reason record ID. |  [optional]
**pisExemptLegalReason** | **String** | When specifi reason, this field has the description |  [optional]
**accruableCOFINSTaxation** | [**AccruableCOFINSTaxationEnum**](#AccruableCOFINSTaxationEnum) | Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;H&#39;  # SUSPENDED - &#39;N&#39;  # NO TAXABLE     - &#39;O&#39;  # OTHER - &#39;OZ&#39; # OTHER AND ZERO VALUES  |  [optional]
**cofinsExemptLegalReasonCode** | **String** | When exempt, taxable with zero, suspended, not taxable, this field holds the official code number |  [optional]
**cofinsExemptLegalReason** | **String** | When specifi reason, this field has the description |  [optional]
**allowIPIcreditWhenInGoing** | **Boolean** | Inform that the process allow IPI credit to Input process |  [optional]
**icmsConf** | [**List&lt;IcmsTaxConf&gt;**](IcmsTaxConf.md) | the map key is state code |  [optional]
**name** | **String** | Process name to Identify this configuration | 
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**wayType** | [**WayTypeEnum**](#WayTypeEnum) | inform if the transaction is an operation to internalizing (receive) item or value |  [optional]
**goal** | [**GoalEnum**](#GoalEnum) | - &#39;Normal&#39; # Normal - &#39;Complementary&#39; # Complemento de Valores - &#39;Voided&#39; # Anulação - &#39;Replacement&#39; # Substituto - &#39;Return&#39; # Devolução ou retorno - &#39;Adjustment&#39; # Ajuste  |  [optional]
**overWriteCFOP** | **Boolean** | inform that the configuration process overwrites the cfop configuration. |  [optional]
**cfops** | [**List&lt;CfopConf&gt;**](CfopConf.md) |  |  [optional]


<a name="CstIPIEnum"></a>
## Enum: CstIPIEnum
Name | Value
---- | -----
T | &quot;T&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
N | &quot;N&quot;
I | &quot;I&quot;
O | &quot;O&quot;
OZ | &quot;OZ&quot;


<a name="AccruablePISTaxationEnum"></a>
## Enum: AccruablePISTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
N | &quot;N&quot;
O | &quot;O&quot;
OZ | &quot;OZ&quot;


<a name="AccruableCOFINSTaxationEnum"></a>
## Enum: AccruableCOFINSTaxationEnum
Name | Value
---- | -----
T | &quot;T&quot;
Z | &quot;Z&quot;
E | &quot;E&quot;
H | &quot;H&quot;
N | &quot;N&quot;
O | &quot;O&quot;
OZ | &quot;OZ&quot;


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



