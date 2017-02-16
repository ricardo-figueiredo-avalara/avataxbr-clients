package io.swagger.client.api

import io.swagger.client.model.Body_4
import io.swagger.client.model.Inline_response_200_3
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class InvoiceContingencyApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def invoiceDropContingency(state: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/invoices/contingency/{state}")
        replaceAll ("\\{" + "state" + "\\}",state.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (state == null) throw new Exception("Missing required parameter 'state' when calling InvoiceContingencyApi->invoiceDropContingency")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invoiceSetContingency(state: String,
      body: Body_4)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Body_4]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/invoices/contingency/{state}")
        replaceAll ("\\{" + "state" + "\\}",state.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (state == null) throw new Exception("Missing required parameter 'state' when calling InvoiceContingencyApi->invoiceSetContingency")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling InvoiceContingencyApi->invoiceSetContingency")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invoiceVerifyContingency(state: String)(implicit reader: ClientResponseReader[Inline_response_200_3]): Future[Inline_response_200_3] = {
    // create path and map variables
    val path = (addFmt("/invoices/contingency/{state}")
        replaceAll ("\\{" + "state" + "\\}",state.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (state == null) throw new Exception("Missing required parameter 'state' when calling InvoiceContingencyApi->invoiceVerifyContingency")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
