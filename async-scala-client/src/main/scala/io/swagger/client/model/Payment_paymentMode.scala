package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Payment_paymentMode (
  mode: String,  // Payment mode - &#39;01&#39; # Dinheiro - &#39;02&#39; # Cheque - &#39;03&#39; # Cartão de Crédito - &#39;04&#39; # Cartão de Débito - &#39;05&#39; # Crédito Loja - &#39;10&#39; # Vale Alimentação - &#39;11&#39; # Vale Refeição - &#39;12&#39; # Vale Presente - &#39;13&#39; # Vale Combustível - &#39;99&#39; # Outros 
value: Double,  // payment value
cardTpIntegration: Option[String],  // - &#39;1&#39; # Payment integrated with system, - &#39;2&#39; # Payment not integrated with system 
cardCNPJ: Option[String],  // Federal tax id of accrediting card (credenciadora do cartão)
cardBrand: Option[String],  // card brand - &#39;01&#39; # Visa - &#39;02&#39; # Mastercard - &#39;03&#39; # American Express - &#39;04&#39; # Sorocred - &#39;99&#39; # Other 
cardAuthorization: Option[String]  // transaction authorization number
)
