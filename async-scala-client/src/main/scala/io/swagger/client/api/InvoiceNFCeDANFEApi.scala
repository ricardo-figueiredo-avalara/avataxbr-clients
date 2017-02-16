package io.swagger.client.api

import java.io.File
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class InvoiceNFCeDANFEApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def invoicesNfceKeyGet(authorization: String,
      key: String)(implicit reader: ClientResponseReader[File]): Future[File] = {
    // create path and map variables
    val path = (addFmt("/invoices/nfce/{key}")
        replaceAll ("\\{" + "key" + "\\}",key.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceNFCeDANFEApi->invoicesNfceKeyGet")

    if (key == null) throw new Exception("Missing required parameter 'key' when calling InvoiceNFCeDANFEApi->invoicesNfceKeyGet")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
