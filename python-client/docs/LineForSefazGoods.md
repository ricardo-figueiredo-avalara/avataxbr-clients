# LineForSefazGoods

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**line_code** | **int** | This string is a unique identifier for this line in the transaction | 
**item_code** | **str** | This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states. | 
**avalara_goods_and_services_type** | **str** | AGAST CODE for itemCode | [optional] 
**number_of_items** | **float** | This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1 | [default to 1.0]
**returned_percentage_amount** | **float** | when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v &gt;&#x3D;0.00 and v &lt;&#x3D; 100.00 | [optional] 
**line_unit_price** | **float** | This decimal 11 integers and 1 to 10 decimals captures the unit price of this line. | [optional] 
**line_amount** | **float** | In its simplest form lineAmount &#x3D; (item price * numberOfItems). If taxIncluded is &#39;true&#39;, lineAmount &#x3D; (item price * numberOfItems + tax). | 
**item_description** | **str** | This string captures the description of the item represented by this line, will be used LC 116 | 
**line_taxed_discount** | **float** | Discount conditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**line_untaxed_discount** | **float** | discount unconditional, This decimal 13 integers and 0 to 2 decimals | [optional] 
**use_type** | **str** | This is a enumeration folowing table | 
**process_scenario** | **str** | Reference to process configurantion of this transaction, See ProcessScenario definition | 
**cfop** | **int** | Fiscal Operation Code of transport service | [optional] 
**has_stock_impact** | **bool** | return if this transaction has stock impact for this process or CFOP | [optional] 
**has_finantial_impact** | **bool** | return if this transaction has finantial impact for this process or CFOP | [optional] 
**freight_amount** | **float** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**insurance_amount** | **float** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**other_cost_amount** | **float** | This decimal 13 integers and 0 to 2 decimals | [optional] 
**ind_tot_type** | **bool** | The item value will compose the invoice total value. | [optional] [default to True]
**order_number** | **str** | order number, information used for B2B control process | [optional] 
**order_item_number** | **str** | number of the item from order number, information used for B2B control process | [optional] 
**fci_number** | **str** | Gloal Unique identifier (Importation form) | [optional] 
**recopi_number** | **str** | RECOPI number | [optional] 
**inf_ad_prod** | **str** | additional information about product (referenced standard, complementary info, etc) | [optional] 
**vehicle** | [**Vehicle**](Vehicle.md) |  | [optional] 
**medicine** | [**Medicine**](Medicine.md) |  | [optional] 
**weapon** | [**Weapon**](Weapon.md) |  | [optional] 
**fuel** | [**Fuel**](Fuel.md) |  | [optional] 
**entity_is_icms_substitute** | **bool** | Inform that for this item the Entity referenced is ICMS Substitute | [optional] 
**is_transport_icms_withheld** | **bool** | Inform that this item has ICMS withheld for transport value service. | [optional] 
**icms_tax_relief** | [**LineForGoodsIcmsTaxRelief**](LineForGoodsIcmsTaxRelief.md) |  | [optional] 
**export** | [**list[LineForGoodsExport]**](LineForGoodsExport.md) | Exportation detail | [optional] 
**di** | [**list[LineForGoodsDi]**](LineForGoodsDi.md) | Import declaration | [optional] 
**calculated_tax** | [**LineForGoodsCalculatedTax**](LineForGoodsCalculatedTax.md) |  | [optional] 
**extend** | [**AgastExtendForSefaz**](AgastExtendForSefaz.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


