package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class SalesHeaderOut (
  accountId: String,  // This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
companyCode: String,  // This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
transactionType: String,  // This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; 
documentCode: Option[String],  // This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
currency: String,  // currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot;
transactionDate: Date,  // This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
taxCalculationDate: Option[Date],  // accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
companyLocation: String,  // This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
customerCode: String,  // This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
purchaseOrderNumber: Option[String],  // The number of Purchase Order
rpsNumber: Option[Integer],  // Provisional receipt services, sequencial number maintained by the client application, unique by serie
rpsSerie: Option[String],  // set name identifier for rps number sequency.
discriminationIn: Option[String],  // Service discrimination, free description about service
entity: Option[SalesEntity],
payment: Option[SalesHeaderOut_payment],
taxesConfig: Option[SalesTaxesConfig],
defaultLocations: Option[SalesDefaultLocations],
discriminationOut: Option[String],  // Invoice discrimination, it is discriminationIn plus automatic messages
xml: Option[String],  // RPS XML or NFSe XML generated, when the client system doesn&#39;t have EDI with government then BR16 return RPS when transaction is created.
ediSyncState: Option[String]  // Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - &#39;STORED&#39; - &#39;WAITING APPROVAL&#39; - &#39;AUTHORIZED&#39; - &#39;AUTHORIZED with NOTE&#39; - &#39;ERROR&#39; - &#39;CANCELED REPLACED&#39; - &#39;CANCELED&#39; - &#39;CANCELLATION REQUESTED&#39; 
)
