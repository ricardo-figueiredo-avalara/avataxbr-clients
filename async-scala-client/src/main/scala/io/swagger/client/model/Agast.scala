package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Agast (
  code: String,  // Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
description: Option[String],  // Agast Description
hsCode: Option[String],  // harmonized code, NCM or LC 116
ex: Option[Integer],  // hsCode Exception for IPI tax
cest: Option[String],  // tax substitution code - Codigo especificador da Substuicao Tributaria
cean: Option[String],  // GTIN NUMBER
codeType: Option[Agast_codeType],
cstIPI: Option[String],  // Inform if this process is subject to IPI taxation on output process - &#39;T&#39;  # TAXABLE - &#39;Z&#39;  # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39;  # EXEMPT - &#39;N&#39;  # NO TAXABLE     - &#39;I&#39;  # IMMUNE 
ipiLegalTaxClass: Option[String],  // Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D; 
pisCofinsTaxReporting: Option[String],  // when the company is Real Profit inform if this item is cumulative or no cumulative by default
accruablePISTaxation: Option[String],  // Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE 
pisExemptLegalReasonCode: Option[String],  // When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
pisExemptLegalReason: Option[String],  // When specified a reason, this field holds the reason&#39;s description
accruableCOFINSTaxation: Option[String],  // Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE 
cofinsExemptLegalReasonCode: Option[String],  // When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
cofinsExemptLegalReason: Option[String],  // When specified a reason, this field holds the reason&#39;s description
accruableCSLLTaxation: Option[String],  // Inform if this item by nature is subject to CSLL taxation or exempt - &#39;T&#39; # TAXABLE - &#39;E&#39; # EXEMPT 
csllExemptLegalReason: Option[String],
csllExemptLegalReasonCode: Option[String],
withholding: Option[Agast_withholding],
issDueatDestination: Option[Boolean],  // for service items with City Jurisdiction, inform where the ISS tax is due
pisCofinsCreditNotAllowed: Option[Boolean],  // on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
issTaxation: Option[String],  // - &#39;T&#39; # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO&#39; - &#39;E&#39; # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - &#39;F&#39; # EXEMPT - &#39;A&#39; # SUSPENDED FOR ADMINISTRATIVE REASON - &#39;L&#39; # SUSPENDED FOR LEGAL DECISION - &#39;I&#39; # IMMUNE 
federalTaxRate: Option[List[TaxTypeRate]],  // This is an array of tax object related to an agast.
specialProductClass: Option[String],
icmsConf: Option[List[Agast_icmsConf]]  // One per State
)
