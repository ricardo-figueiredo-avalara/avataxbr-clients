package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Payment (
  installmentsTerms: Option[Integer],  // Installment terms - 0 # cash - 1 # on terms - 2 # other 
bill: Option[Payment_bill],
installment: Option[List[Payment_installment]],
paymentMode: Option[List[Payment_paymentMode]]
)
