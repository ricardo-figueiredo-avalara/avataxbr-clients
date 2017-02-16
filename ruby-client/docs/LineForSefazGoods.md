# SwaggerClient::LineForSefazGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_code** | **Integer** | This string is a unique identifier for this line in the transaction | 
**item_code** | **String** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**avalara_goods_and_services_type** | **String** | AGAST CODE for itemCode | [optional] 
**number_of_items** | **Float** | This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [default to 1.0]
**returned_percentage_amount** | **Float** | when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v &gt;&#x3D;0.00 and v &lt;&#x3D; 100.00 | [optional] 
**line_unit_price** | **Float** | This decimal 11 integers and 1 to 10 decimals captures the unit price of this line. | [optional] 
**line_amount** | **Float** | In its simplest form lineAmount &#x3D; (item price * numberOfItems). If taxIncluded is &#39;true&#39;, lineAmount &#x3D; (item price * numberOfItems + tax). | 
**item_description** | **String** | This string captures the description of the item represented by this line, will be used LC 116 | 
**line_taxed_discount** | **Float** | Discount conditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**line_untaxed_discount** | **Float** | discount unconditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**use_type** | **String** | This is a enumeration folowing table | 
**process_scenario** | **String** | Reference to process configurantion of this transaction, See ProcessScenario definition | 
**cfop** | **Integer** | Fiscal Operation Code of transport service | [optional] 
**has_stock_impact** | **BOOLEAN** | return if this transaction has stock impact for this process or CFOP | [optional] 
**has_finantial_impact** | **BOOLEAN** | return if this transaction has finantial impact for this process or CFOP | [optional] 
**freight_amount** | **Float** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**insurance_amount** | **Float** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**other_cost_amount** | **Float** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**ind_tot_type** | **BOOLEAN** | The item value will compose the invoice total value. | [optional] [default to true]
**order_number** | **String** | order number, information used for B2B control process | [optional] 
**order_item_number** | **String** | number of the item from order number, information used for B2B control process | [optional] 
**fci_number** | **String** | Gloal Unique identifier (Importation form) | [optional] 
**recopi_number** | **String** | RECOPI number | [optional] 
**inf_ad_prod** | **String** | additional information about product (referenced standard, complementary info, etc) | [optional] 
**vehicle** | [**Vehicle**](Vehicle.md) |  | [optional] 
**medicine** | [**Medicine**](Medicine.md) |  | [optional] 
**weapon** | [**Weapon**](Weapon.md) |  | [optional] 
**fuel** | [**Fuel**](Fuel.md) |  | [optional] 
**entity_is_icms_substitute** | **BOOLEAN** | Inform that for this item the Entity referenced is ICMS Substitute | [optional] 
**is_transport_icms_withheld** | **BOOLEAN** | Inform that this item has ICMS withheld for transport value service. | [optional] 
**icms_tax_relief** | [**LineForGoodsIcmsTaxRelief**](LineForGoodsIcmsTaxRelief.md) |  | [optional] 
**export** | [**Array&lt;LineForGoodsExport&gt;**](LineForGoodsExport.md) | Exportation detail | [optional] 
**di** | [**Array&lt;LineForGoodsDi&gt;**](LineForGoodsDi.md) | Import declaration | [optional] 
**calculated_tax** | [**LineForGoodsCalculatedTax**](LineForGoodsCalculatedTax.md) |  | [optional] 
**extend** | [**AgastExtendForSefaz**](AgastExtendForSefaz.md) |  | [optional] 


