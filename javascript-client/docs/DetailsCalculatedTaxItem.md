# AvaTaxBrazil.DetailsCalculatedTaxItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source** | [**CSTTableAEnum**](CSTTableAEnum.md) |  | [optional] 
**cstB** | [**CSTTableBEnum**](CSTTableBEnum.md) |  | [optional] 
**cst** | **String** |  | [optional] 
**modBC** | **String** |  | [optional] 
**pMVA** | **Number** | Percent of Value-added margin (%) | [optional] 
**pRedBC** | **Number** | calc base percent of discount | [optional] 
**pBCOp** | **Number** | percent of calc base of own icms | [optional] 
**ufst** | [**StateEnum**](StateEnum.md) |  | [optional] 
**calcMode** | [**CalcModelEnum**](CalcModelEnum.md) |  | [optional] 
**legalTaxClass** | **Number** | Legal tax classificação for IPI (enquadramento tributário) | [optional] 
**legalTaxClassDC** | **Number** | Legal tax classificação for IPI (enquadramento) for Drinks and Cigarettes | [optional] 
**cnpjProd** | **String** | CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39; Federal tax ID of real manufacturer, nly for exportation  | [optional] 
**sealCode** | **String** | Seal Code for ipi tax control (código do selo para controle de IPI) | [optional] 
**sealQuantity** | **String** | Seal Code for ipi tax control (código do selo para controle de IPI) | [optional] 
**icmsInterPartRate** | **Number** | percent of icms apportionment between two states | [optional] 
**icmsSesonReason** | [**ICMSSesonReason**](ICMSSesonReason.md) |  | [optional] 
**perQuantityReturned** | **Number** | percent of merchandise returned | [optional] 


