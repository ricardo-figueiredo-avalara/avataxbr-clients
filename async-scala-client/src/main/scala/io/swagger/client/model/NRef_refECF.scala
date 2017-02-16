package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class NRef_refECF (
  nECF: String,  // ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
nCOO: String,  // Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
modECF: String  // Fiscal document model - &#39;2B&#39; # coupon tax not ECF - &#39;2C&#39; # PDV coupon tax - &#39;2D&#39; # ECF coupon tax 
)