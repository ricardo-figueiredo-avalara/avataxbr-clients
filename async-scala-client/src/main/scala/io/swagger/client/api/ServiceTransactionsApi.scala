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
import io.swagger.client.model.StateTransition
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class ServiceTransactionsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(authorization: String,
      accountId: UUID,
      companyCode: String,
      transactionType: String,
      documentCode: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString)
        replaceAll ("\\{" + "companyCode" + "\\}",companyCode.toString)
        replaceAll ("\\{" + "transactionType" + "\\}",transactionType.toString)
        replaceAll ("\\{" + "documentCode" + "\\}",documentCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    if (companyCode == null) throw new Exception("Missing required parameter 'companyCode' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    if (transactionType == null) throw new Exception("Missing required parameter 'transactionType' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    if (documentCode == null) throw new Exception("Missing required parameter 'documentCode' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost(authorization: String,
      accountId: UUID,
      companyCode: String,
      transactionType: String,
      documentCode: String,
      body: StateTransition)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[StateTransition]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/transactions/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/stateTransitions")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString)
        replaceAll ("\\{" + "companyCode" + "\\}",companyCode.toString)
        replaceAll ("\\{" + "transactionType" + "\\}",transactionType.toString)
        replaceAll ("\\{" + "documentCode" + "\\}",documentCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost")

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost")

    if (companyCode == null) throw new Exception("Missing required parameter 'companyCode' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost")

    if (transactionType == null) throw new Exception("Missing required parameter 'transactionType' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost")

    if (documentCode == null) throw new Exception("Missing required parameter 'documentCode' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeStateTransitionsPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(authorization: String,
      accountId: UUID,
      companyCode: String,
      transactionType: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/transactions/account/{accountId}/company/{companyCode}/{transactionType}")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString)
        replaceAll ("\\{" + "companyCode" + "\\}",companyCode.toString)
        replaceAll ("\\{" + "transactionType" + "\\}",transactionType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet")

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet")

    if (companyCode == null) throw new Exception("Missing required parameter 'companyCode' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet")

    if (transactionType == null) throw new Exception("Missing required parameter 'transactionType' when calling ServiceTransactionsApi->transactionsAccountAccountIdCompanyCompanyCodeTransactionTypeGet")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def transactionsservicePaymentPost(authorization: String,
      body: PaymentTransactionIn)(implicit reader: ClientResponseReader[PaymentTransactionOut], writer: RequestWriter[PaymentTransactionIn]): Future[PaymentTransactionOut] = {
    // create path and map variables
    val path = (addFmt("/transactions?service-payment"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceTransactionsApi->transactionsservicePaymentPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceTransactionsApi->transactionsservicePaymentPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def transactionsservicePurchasePost(authorization: String,
      body: PurchaseTransactionIn)(implicit reader: ClientResponseReader[PurchaseTransactionOut], writer: RequestWriter[PurchaseTransactionIn]): Future[PurchaseTransactionOut] = {
    // create path and map variables
    val path = (addFmt("/transactions?service-purchase"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceTransactionsApi->transactionsservicePurchasePost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceTransactionsApi->transactionsservicePurchasePost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def transactionsserviceReceiptPost(authorization: String,
      body: ReceiptTransactionIn)(implicit reader: ClientResponseReader[ReceiptTransactionOut], writer: RequestWriter[ReceiptTransactionIn]): Future[ReceiptTransactionOut] = {
    // create path and map variables
    val path = (addFmt("/transactions?service-receipt"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceTransactionsApi->transactionsserviceReceiptPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceTransactionsApi->transactionsserviceReceiptPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def transactionsserviceSalesPost(authorization: String,
      body: SalesTransactionIn)(implicit reader: ClientResponseReader[SalesTransactionOut], writer: RequestWriter[SalesTransactionIn]): Future[SalesTransactionOut] = {
    // create path and map variables
    val path = (addFmt("/transactions?service-sales"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling ServiceTransactionsApi->transactionsserviceSalesPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ServiceTransactionsApi->transactionsserviceSalesPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
