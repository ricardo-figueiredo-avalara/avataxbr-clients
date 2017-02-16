package io.swagger.client.api

import java.util.Date
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import io.swagger.client.model.ProcessScenario
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class TaxConfProcessApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createProcess(taxconfprocess: ProcessScenario)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[ProcessScenario]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/taxconf/process"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (taxconfprocess == null) throw new Exception("Missing required parameter 'taxconfprocess' when calling TaxConfProcessApi->createProcess")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(taxconfprocess))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteProcess(code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/process/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfProcessApi->deleteProcess")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getProcess(code: String)(implicit reader: ClientResponseReader[ProcessScenario]): Future[ProcessScenario] = {
    // create path and map variables
    val path = (addFmt("/taxconf/process/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfProcessApi->getProcess")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getProcessList(accountId: Option[String] = None,
      date: Option[Date] = None,
      inactive: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[List[ProcessScenario]]): Future[List[ProcessScenario]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/process"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    accountId match {
    case Some(param) => queryParams += "accountId" -> param.toString
    case _ => queryParams
    }
    date match {
    case Some(param) => queryParams += "date" -> param.toString
    case _ => queryParams
    }
    inactive match {
    case Some(param) => queryParams += "inactive" -> param.toString
    case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateProcess(code: String,
      taxconfprocess: ProcessScenario)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[ProcessScenario]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/process/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfProcessApi->updateProcess")

    if (taxconfprocess == null) throw new Exception("Missing required parameter 'taxconfprocess' when calling TaxConfProcessApi->updateProcess")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(taxconfprocess))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
