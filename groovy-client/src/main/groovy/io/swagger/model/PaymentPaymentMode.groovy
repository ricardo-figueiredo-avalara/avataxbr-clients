package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PaymentPaymentMode {

  /* Payment mode - '01' # Dinheiro - '02' # Cheque - '03' # Cartão de Crédito - '04' # Cartão de Débito - '05' # Crédito Loja - '10' # Vale Alimentação - '11' # Vale Refeição - '12' # Vale Presente - '13' # Vale Combustível - '99' # Outros  */
  String mode = null

  /* payment value */
  Double value = null

  /* - '1' # Payment integrated with system, - '2' # Payment not integrated with system  */
  String cardTpIntegration = null

  /* Federal tax id of accrediting card (credenciadora do cartão) */
  String cardCNPJ = null

  /* card brand - '01' # Visa - '02' # Mastercard - '03' # American Express - '04' # Sorocred - '99' # Other  */
  String cardBrand = null

  /* transaction authorization number */
  String cardAuthorization = null
  

}

