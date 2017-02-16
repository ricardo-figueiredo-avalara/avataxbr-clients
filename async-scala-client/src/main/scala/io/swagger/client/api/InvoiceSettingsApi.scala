package io.swagger.client.api

import io.swagger.client.model.Inline_response_200_4
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class InvoiceSettingsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def invoiceSettings()(implicit reader: ClientResponseReader[Inline_response_200_4]): Future[Inline_response_200_4] = {
    // create path and map variables
    val path = (addFmt("/invoices/settings"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
