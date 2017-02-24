package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class ItemGoods (
  companyId: UUID,  // Company ID
code: String,  // ERP Code
agast: String,  // Agast Code
description: Option[String],  // Item Description
sealCode: String,  // Seal Code for ipi tax control (código do selo para controle de IPI)
nFCI: Option[String],  // Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
isIcmsStSubstitute: Option[Boolean],  // this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. 
source: Option[String],  // - &#39;0&#39; # National goods - except those treated in codes 3,4, 5 and 8 - &#39;1&#39; # Foreign goods - Imported directly by seller, except those in code 6 - &#39;2&#39; # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - &#39;3&#39; # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - &#39;4&#39; # National goods from production following &#39;standard basic processes&#39; as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - &#39;5&#39; # National goods - Merchandise or goods with imported content equal or below 40% - &#39;6&#39; # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - &#39;7&#39; # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - &#39;8&#39; # National goods - Merchandise or goods with imported content above 70% 
productType: Option[String],
manufacturerEquivalent: Option[Boolean],  // Item is merchandise but will be considered product
appropriateIPIcreditWhenInGoing: Option[Boolean],  // Inform that this item will have rights to aprropriate IPI credit
usuallyAppropriatePISCOFINSCredit: Option[Boolean],  // Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE
isPisCofinsEstimatedCredit: Option[Boolean],  // The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount
piscofinsRevenueType: Option[String],  // - &#39;01&#39; # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - &#39;02&#39; # Exclusivamente a Receita Não Tributada no Mercado Interno - &#39;03&#39; # Exclusivamente a Receita de Exportação - &#39;04&#39; # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - &#39;05&#39; # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - &#39;06&#39; # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - &#39;07&#39; # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação 
icmsBaseDiscountForMonoPhaseSocialContr: Option[Double],  // Discount allowed on icms base when PIS/COFINS are Monophase
cean: Option[String],  // GTIN NUMBER
nve: Option[String],  // Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
salesUnit: Option[String],
salesUnitIPIfactor: Option[Double],  // factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
salesUnitIcmsfactor: Option[Double],  // factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
salesUnitIcmsStfactor: Option[Double],  // factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
salesUnitPisCofinsfactor: Option[Double],  // factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
purchaseUnit: Option[String],
purchaseUnitIPIfactor: Option[Double],  // factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
purchaseUnitIcmsfactor: Option[Double],  // factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
purchaseUnitIcmsStfactor: Option[Double],  // factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
purchaseUnitPisCofinsfactor: Option[Double],  // factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
firstUse: Option[Boolean]  // When the product is new, and will be retail, firt time that it exit it is subject to IPI
)
