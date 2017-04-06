
# AgastExtendForSefaz

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hsCode** | **String** | harmonized code, NCM or LC 116 |  [optional]
**ex** | **Integer** | hsCode Exception for IPI tax |  [optional]
**cest** | **String** | tax substitution code - Codigo especificador da Substuicao Tributaria |  [optional]
**cean** | **String** | GTIN NUMBER |  [optional]
**nve** | **String** | Nomenclatura de Valor aduaneio e Estatístico - NCM extension code |  [optional]
**unit** | **String** | Sales Unit |  [optional]
**unitTaxable** | **String** | Sales Taxable Unit |  [optional]
**nFCI** | **String** | Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação) |  [optional]
**goal** | [**GoalEnum**](#GoalEnum) | - &#39;Normal&#39; # Normal - &#39;Complementary&#39; # Complemento de Valores - &#39;Voided&#39; # Anulação - &#39;Replacement&#39; # Substituto - &#39;Return&#39; # Devolução ou retorno - &#39;Adjustment&#39; # Ajuste  |  [optional]


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



