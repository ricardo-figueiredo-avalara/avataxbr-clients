package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class PayRecHeader (
  accountId: String,  // This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
companyCode: String,  // This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
transactionType: String,  // This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; 
documentCode: Option[String],  // This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
currency: String,  // currency code. &#39;BRL&#39; for Brazilian Reais.
transactionDate: Date,  // This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
taxCalculationDate: Option[Date],  // accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
vendorCode: String,  // This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
paymentMode: String  // - &#39;CALCULATE&#39; - &#39;ASIS&#39; When ASIS, the transaction is stored without executing tax determination (no Calculation). 
)