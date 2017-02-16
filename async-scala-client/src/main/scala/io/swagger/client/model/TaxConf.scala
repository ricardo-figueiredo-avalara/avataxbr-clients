package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class TaxConf (
  code: String,  // main unique identificator
stockImpact: Option[Boolean],  // Inform that the process has inventory impact.
financialImpact: Option[Boolean],  // Inform that the process has financial impact.
cstIPI: Option[String],  // Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune 
ipiLegalTaxClass: Option[String],  // Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D; 
accruablePISTaxation: Option[String],  // Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE 
pisExemptLegalReasonCode: Option[String],  // When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
pisExemptLegalReason: Option[String],  // When specifi reason, this field has the description
accruableCOFINSTaxation: Option[String],  // Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE 
cofinsExemptLegalReasonCode: Option[String],  // When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
cofinsExemptLegalReason: Option[String],  // When specifi reason, this field has the description
allowIPIcreditWhenInGoing: Option[Boolean],  // Inform that the process allow IPI credit to Input process
icmsConf: Option[List[IcmsTaxConf]]  // the map key is state code
)
