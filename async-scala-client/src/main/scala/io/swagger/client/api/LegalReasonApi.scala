package io.swagger.client.api

import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.LegalReason
import io.swagger.client.model.ProcessScenario
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class LegalReasonApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createReason.(body: LegalReason)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[LegalReason]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/taxconf/legal-reason"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling LegalReasonApi->createReason.")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteReason.(uuid: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/legal-reason/{uuid}")
        replaceAll ("\\{" + "uuid" + "\\}",uuid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (uuid == null) throw new Exception("Missing required parameter 'uuid' when calling LegalReasonApi->deleteReason.")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getReason.(uuid: String)(implicit reader: ClientResponseReader[ProcessScenario]): Future[ProcessScenario] = {
    // create path and map variables
    val path = (addFmt("/taxconf/legal-reason/{uuid}")
        replaceAll ("\\{" + "uuid" + "\\}",uuid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (uuid == null) throw new Exception("Missing required parameter 'uuid' when calling LegalReasonApi->getReason.")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listReason(companyId: Option[String] = None
      )(implicit reader: ClientResponseReader[List[LegalReason]]): Future[List[LegalReason]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/legal-reason"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    companyId match {
    case Some(param) => queryParams += "companyId" -> param.toString
    case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateReason.(body: LegalReason)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[LegalReason]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/legal-reason"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling LegalReasonApi->updateReason.")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
