package io.swagger.client.api

import io.swagger.client.model.Message
import io.swagger.client.model.SefazDisableRangeIn
import io.swagger.client.model.SefazInvoiceBasicStatus
import io.swagger.client.model.SefazItDeleteIn
import io.swagger.client.model.SefazItGetOut
import io.swagger.client.model.SefazItPutIn
import io.swagger.client.model.SefazPostOut
import io.swagger.client.model.TransactionForSefazGoods
import io.swagger.client.model.TransactionForSefazGoodsList
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class InvoiceSEFAZApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def invoicesSefazDelete(authorization: String,
      body: SefazDisableRangeIn)(implicit reader: ClientResponseReader[SefazInvoiceBasicStatus], writer: RequestWriter[SefazDisableRangeIn]): Future[SefazInvoiceBasicStatus] = {
    // create path and map variables
    val path = (addFmt("/invoices/sefaz"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceSEFAZApi->invoicesSefazDelete")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling InvoiceSEFAZApi->invoicesSefazDelete")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invoicesSefazKeyDelete(authorization: String,
      key: String,
      body: SefazItDeleteIn)(implicit reader: ClientResponseReader[SefazInvoiceBasicStatus], writer: RequestWriter[SefazItDeleteIn]): Future[SefazInvoiceBasicStatus] = {
    // create path and map variables
    val path = (addFmt("/invoices/sefaz/{key}")
        replaceAll ("\\{" + "key" + "\\}",key.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceSEFAZApi->invoicesSefazKeyDelete")

    if (key == null) throw new Exception("Missing required parameter 'key' when calling InvoiceSEFAZApi->invoicesSefazKeyDelete")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling InvoiceSEFAZApi->invoicesSefazKeyDelete")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invoicesSefazKeyGet(authorization: String,
      key: String)(implicit reader: ClientResponseReader[SefazItGetOut]): Future[SefazItGetOut] = {
    // create path and map variables
    val path = (addFmt("/invoices/sefaz/{key}")
        replaceAll ("\\{" + "key" + "\\}",key.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceSEFAZApi->invoicesSefazKeyGet")

    if (key == null) throw new Exception("Missing required parameter 'key' when calling InvoiceSEFAZApi->invoicesSefazKeyGet")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invoicesSefazKeyLookupGet(authorization: String,
      key: String)(implicit reader: ClientResponseReader[TransactionForSefazGoodsList]): Future[TransactionForSefazGoodsList] = {
    // create path and map variables
    val path = (addFmt("/invoices/sefaz/{key}/lookup")
        replaceAll ("\\{" + "key" + "\\}",key.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceSEFAZApi->invoicesSefazKeyLookupGet")

    if (key == null) throw new Exception("Missing required parameter 'key' when calling InvoiceSEFAZApi->invoicesSefazKeyLookupGet")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invoicesSefazKeyPut(authorization: String,
      key: String,
      body: SefazItPutIn)(implicit reader: ClientResponseReader[SefazInvoiceBasicStatus], writer: RequestWriter[SefazItPutIn]): Future[SefazInvoiceBasicStatus] = {
    // create path and map variables
    val path = (addFmt("/invoices/sefaz/{key}")
        replaceAll ("\\{" + "key" + "\\}",key.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceSEFAZApi->invoicesSefazKeyPut")

    if (key == null) throw new Exception("Missing required parameter 'key' when calling InvoiceSEFAZApi->invoicesSefazKeyPut")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling InvoiceSEFAZApi->invoicesSefazKeyPut")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invoicesSefazPost(authorization: String,
      body: List[TransactionForSefazGoods])(implicit reader: ClientResponseReader[SefazPostOut], writer: RequestWriter[List[TransactionForSefazGoods]]): Future[SefazPostOut] = {
    // create path and map variables
    val path = (addFmt("/invoices/sefaz"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceSEFAZApi->invoicesSefazPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling InvoiceSEFAZApi->invoicesSefazPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invoicesSefazStatusGet(authorization: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/invoices/sefaz/status"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceSEFAZApi->invoicesSefazStatusGet")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
