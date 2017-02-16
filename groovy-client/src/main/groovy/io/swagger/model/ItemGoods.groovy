package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ItemSimple;
@Canonical
class ItemGoods {

  /* Company ID */
  String companyId = null

  /* ERP Code */
  String code = null

  /* Agast Code */
  String agast = null

  /* Item Description */
  String description = null

  /* Seal Code for ipi tax control (código do selo para controle de IPI) */
  String sealCode = null

  /* Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação) */
  String nFCI = null

  /* this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas.  */
  Boolean isIcmsStSubstitute = null

  /* - '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70%  */
  String source = null

    String productType = null

  /* Item is merchandise but will be considered product */
  Boolean manufacturerEquivalent = null

  /* Inform that this item will have rights to aprropriate IPI credit */
  Boolean appropriateIPIcreditWhenInGoing = null

  /* Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE */
  Boolean usuallyAppropriatePISCOFINSCredit = null

  /* The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount */
  Boolean isPisCofinsEstimatedCredit = null

  /* - '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação  */
  String piscofinsRevenueType = null

  /* Discount allowed on icms base when PIS/COFINS are Monophase */
  Double icmsBaseDiscountForMonoPhaseSocialContr = null

  /* tax substitution code - Codigo especificador da Substuicao Tributaria */
  String cest = null

  /* GTIN NUMBER */
  String cean = null

  /* Nomenclatura de Valor aduaneio e Estatístico - NCM extension code */
  String nve = null

    String salesUnit = null

  /* factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
  Double salesUnitIPIfactor = null

  /* factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
  Double salesUnitIcmsfactor = null

  /* factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
  Double salesUnitIcmsStfactor = null

  /* factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
  Double salesUnitPisCofinsfactor = null

    String purchaseUnit = null

  /* factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
  Double purchaseUnitIPIfactor = null

  /* factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
  Double purchaseUnitIcmsfactor = null

  /* factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
  Double purchaseUnitIcmsStfactor = null

  /* factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta) */
  Double purchaseUnitPisCofinsfactor = null

  /* When the product is new, and will be retail, firt time that it exit it is subject to IPI */
  Boolean firstUse = null
  

}

