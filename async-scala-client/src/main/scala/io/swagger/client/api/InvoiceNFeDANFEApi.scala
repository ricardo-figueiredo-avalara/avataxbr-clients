package io.swagger.client.api

import java.io.File
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class InvoiceNFeDANFEApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def nfePrint(authorization: String,
      key: String)(implicit reader: ClientResponseReader[File]): Future[File] = {
    // create path and map variables
    val path = (addFmt("/invoices/nfe/{key}")
        replaceAll ("\\{" + "key" + "\\}",key.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling InvoiceNFeDANFEApi->nfePrint")

    if (key == null) throw new Exception("Missing required parameter 'key' when calling InvoiceNFeDANFEApi->nfePrint")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
