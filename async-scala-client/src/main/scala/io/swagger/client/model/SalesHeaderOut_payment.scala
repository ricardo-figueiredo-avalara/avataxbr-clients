package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesHeaderOut_payment (
  terms: Option[PaymentTerms],
withholdingMode: Option[WithholdingMode],  // To avoid having to verify multiple attributes from a Invoice at the time of funds collection which subject to Tax Withholding, this attribute will allow a referenced Invoice to be quickly checked for withholdings during the cash transaction. This is an SALES.Transaction attribute to be consisted in the Tax Engine that can be used during the receivable process. The values are enumeration where each letter identify if that tax has been withheld PCC,xxx, PCx, PxC ...
installments: Option[List[InstallmentComplete]]  // installments
)
