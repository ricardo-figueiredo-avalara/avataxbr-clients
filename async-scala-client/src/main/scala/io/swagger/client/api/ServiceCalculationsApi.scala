package io.swagger.client.api

import io.swagger.client.model.Message
import io.swagger.client.model.PaymentTransactionIn
import io.swagger.client.model.PaymentTransactionOut
import io.swagger.client.model.PurchaseTransactionIn
import io.swagger.client.model.PurchaseTransactionOut
import io.swagger.client.model.ReceiptTransactionIn
import io.swagger.client.model.ReceiptTransactionOut
import io.swagger.client.model.SalesTransactionIn
import io.swagger.client.model.SalesTransactionOut
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class ServiceCalculationsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization: String,
      accountId: UUID,
      companyCode: String,
      transactionType: String,
      documentCode: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString)
        replaceAll ("\\{" + "companyCode" + "\\}",companyCode.toString)
        replaceAll ("\\{" + "transactionType" + "\\}",transactionType.toString)
        replaceAll ("\\{" + "documentCode" + "\\}",documentCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    if (companyCode == null) throw new Exception("Missing required parameter 'companyCode' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    if (transactionType == null) throw new Exception("Missing required parameter 'transactionType' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    if (documentCode == null) throw new Exception("Missing required parameter 'documentCode' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(authorization: String,
      accountId: UUID,
      companyCode: String,
      transactionType: String,
      documentCode: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString)
        replaceAll ("\\{" + "companyCode" + "\\}",companyCode.toString)
        replaceAll ("\\{" + "transactionType" + "\\}",transactionType.toString)
        replaceAll ("\\{" + "documentCode" + "\\}",documentCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost")

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost")

    if (companyCode == null) throw new Exception("Missing required parameter 'companyCode' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost")

    if (transactionType == null) throw new Exception("Missing required parameter 'transactionType' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost")

    if (documentCode == null) throw new Exception("Missing required parameter 'documentCode' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization: String,
      accountId: UUID,
      companyCode: String,
      transactionType: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/calculations/account/{accountId}/company/{companyCode}/{transactionType}")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString)
        replaceAll ("\\{" + "companyCode" + "\\}",companyCode.toString)
        replaceAll ("\\{" + "transactionType" + "\\}",transactionType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet")

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet")

    if (companyCode == null) throw new Exception("Missing required parameter 'companyCode' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet")

    if (transactionType == null) throw new Exception("Missing required parameter 'transactionType' when calling ServiceCalculationsApi->calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def calculationsservicePaymentPost(authorization: String,
      body: PaymentTransactionIn)(implicit reader: ClientResponseReader[PaymentTransactionOut], writer: RequestWriter[PaymentTransactionIn]): Future[PaymentTransactionOut] = {
    // create path and map variables
    val path = (addFmt("/calculations?service-payment"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceCalculationsApi->calculationsservicePaymentPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceCalculationsApi->calculationsservicePaymentPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def calculationsservicePurchasePost(authorization: String,
      body: PurchaseTransactionIn)(implicit reader: ClientResponseReader[PurchaseTransactionOut], writer: RequestWriter[PurchaseTransactionIn]): Future[PurchaseTransactionOut] = {
    // create path and map variables
    val path = (addFmt("/calculations?service-purchase"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceCalculationsApi->calculationsservicePurchasePost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceCalculationsApi->calculationsservicePurchasePost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def calculationsserviceReceiptPost(authorization: String,
      body: ReceiptTransactionIn)(implicit reader: ClientResponseReader[ReceiptTransactionOut], writer: RequestWriter[ReceiptTransactionIn]): Future[ReceiptTransactionOut] = {
    // create path and map variables
    val path = (addFmt("/calculations?service-receipt"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceCalculationsApi->calculationsserviceReceiptPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceCalculationsApi->calculationsserviceReceiptPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def calculationsserviceSalesPost(authorization: String,
      body: SalesTransactionIn)(implicit reader: ClientResponseReader[SalesTransactionOut], writer: RequestWriter[SalesTransactionIn]): Future[SalesTransactionOut] = {
    // create path and map variables
    val path = (addFmt("/calculations?service-sales"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceCalculationsApi->calculationsserviceSalesPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceCalculationsApi->calculationsserviceSalesPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
