package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.IcmsTaxConf;
import java.util.List;
@Canonical
class TaxConf {

  /* main unique identificator */
  String code = null

  /* Inform that the process has inventory impact. */
  Boolean stockImpact = null

  /* Inform that the process has financial impact. */
  Boolean financialImpact = null

  /* Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune  */
  String cstIPI = null

  /* Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU=  */
  String ipiLegalTaxClass = null

  /* Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE  */
  String accruablePISTaxation = null

  /* When exempt, taxable with zero, suspended, not taxable, this field holds the official code number */
  String pisExemptLegalReasonCode = null

  /* When specifi reason, this field has the description */
  String pisExemptLegalReason = null

  /* Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE  */
  String accruableCOFINSTaxation = null

  /* When exempt, taxable with zero, suspended, not taxable, this field holds the official code number */
  String cofinsExemptLegalReasonCode = null

  /* When specifi reason, this field has the description */
  String cofinsExemptLegalReason = null

  /* Inform that the process allow IPI credit to Input process */
  Boolean allowIPIcreditWhenInGoing = null

  /* the map key is state code */
  List<IcmsTaxConf> icmsConf = new ArrayList<IcmsTaxConf>()
  

}

