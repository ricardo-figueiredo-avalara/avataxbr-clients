package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PurchaseInfo (
  governmentOrder: Option[String],  // Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas 
orderNumber: Option[String],  // Order info Informação do pedido 
contractNumber: Option[String]  // Agreement info Informação do contrato 
)
