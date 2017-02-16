package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Agast;
import io.swagger.model.AgastCodeType;
import io.swagger.model.AgastIcmsConf;
import io.swagger.model.ArrayList;
import io.swagger.model.TaxTypeRate;
import java.util.List;
@Canonical
class CustomAgast {

  /* Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item. */
  String code = null

  /* Agast Description */
  String description = null

  /* harmonized code, NCM or LC 116 */
  String hsCode = null

  /* hsCode Exception for IPI tax */
  Integer ex = null

  /* tax substitution code - Codigo especificador da Substuicao Tributaria */
  String cest = null

  /* GTIN NUMBER */
  String cean = null

    AgastCodeType codeType = null

  /* Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune  */
  String cstIPI = null

  /* Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU=  */
  String ipiLegalTaxClass = null

  /* when the company is Real Profit inform if this item is cumulative or no cumulative by default */
  String pisCofinsTaxReporting = null

  /* Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE  */
  String accruablePISTaxation = null

  /* Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE  */
  String accruableCOFINSTaxation = null

  /* Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT  */
  String accruableCSLLTaxation = null

  /* for service items with City Jurisdiction, inform where the ISS tax is due */
  Boolean issDueatDestination = null

  /* on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative */
  Boolean pisCofinsCreditNotAllowed = null

  /* - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE  */
  String issTaxation = null

  /* This is an array of tax object related to an agast. */
  List<TaxTypeRate> federalTaxRate = new ArrayList<TaxTypeRate>()

    String specialProductClass = null

  /* One per State */
  List<AgastIcmsConf> icmsConf = new ArrayList<AgastIcmsConf>()

  /* Company ID */
  String companyId = null
  

}

