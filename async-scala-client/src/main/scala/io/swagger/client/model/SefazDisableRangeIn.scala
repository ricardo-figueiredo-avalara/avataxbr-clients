package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SefazDisableRangeIn (
  companyLocation: Option[String],  // This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
transactionModel: Option[String],  // This string indicates the type of transaction for which tax should be calculated. - &#39;55&#39; # Nota Fiscal Eletrônica (NF-e) - &#39;65&#39; # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 
invoiceSerial: Option[Integer],  // Invoice number, sequential unique by invoice serial (Número da nota fiscal) 
year: Option[Number],
message: Option[String],
invoiceNumberInit: Option[Number],  // First number of disable range.
invoiceNumberEnd: Option[Number]  // Last number of disable range.
)
