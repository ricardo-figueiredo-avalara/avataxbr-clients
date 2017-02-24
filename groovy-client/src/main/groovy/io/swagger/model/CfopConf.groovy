package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CstIcmsEnum;
import io.swagger.model.IcmsTaxConf;
import io.swagger.model.TaxConf;
import java.util.List;
@Canonical
class CfopConf {

  /* main unique identificator */
  String code = null

  /* Inform that the process has inventory impact. */
  Boolean stockImpact = null

  /* Inform that the process has financial impact. */
  Boolean financialImpact = null

  /* Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES  */
  String cstIPI = null

  /* Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU=  */
  String ipiLegalTaxClass = null

  /* Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES  */
  String accruablePISTaxation = null

  /* When exempt, taxable with zero, suspended, not taxable, this field holds the official code number */
  String pisExemptLegalReasonCode = null

  /* When specifi reason, this field has the description */
  String pisExemptLegalReason = null

  /* Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES  */
  String accruableCOFINSTaxation = null

  /* When exempt, taxable with zero, suspended, not taxable, this field holds the official code number */
  String cofinsExemptLegalReasonCode = null

  /* When specifi reason, this field has the description */
  String cofinsExemptLegalReason = null

  /* Inform that the process allow IPI credit to Input process */
  Boolean allowIPIcreditWhenInGoing = null

  /* the map key is state code */
  List<IcmsTaxConf> icmsConf = new ArrayList<IcmsTaxConf>()

    String name = null

    String description = null

  /* inform if the transaction is an operation to internalizing item or value */
  String wayType = null

  /* CFOP code (tax code operation) when the transactions are within the same state. */
  Integer codInState = null

  /* CFOP code (tax code operation) when the transactions are to another state. */
  Integer codOtherState = null

  /* CFOP code (tax code operation) when the transactions are to another country. */
  Integer codOtherCountry = null

    CstIcmsEnum cstICMSSameState = null

    CstIcmsEnum cstICMSOtherState = null

    CstIcmsEnum cstICMSOtherCountry = null

  /* this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic */
  String productType = null

  /* field used to indicate an operation to ICMS tax payer */
  Boolean operationToTaxPayerOtherState = null

  /* field used to indicate an operation to items sibject to ICMS-ST */
  Boolean operationWithST = null

  /* field used to indicate an operation to free zone */
  Boolean operationToFreeZone = null

  /* field used to indicate an operation to some product class specifically */
  String specificForProductClass = null
  

}

