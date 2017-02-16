package io.swagger.client.api

import java.util.Date
import io.swagger.client.model.IbptConf
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class TaxConfIBPTApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createIbptConf(taxconfprocess: IbptConf)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[IbptConf]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/taxconf/ibpt"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (taxconfprocess == null) throw new Exception("Missing required parameter 'taxconfprocess' when calling TaxConfIBPTApi->createIbptConf")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(taxconfprocess))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteIbptConf(code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/ibpt/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfIBPTApi->deleteIbptConf")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getIbptConf(code: String)(implicit reader: ClientResponseReader[IbptConf]): Future[IbptConf] = {
    // create path and map variables
    val path = (addFmt("/taxconf/ibpt/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfIBPTApi->getIbptConf")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getIbptConfList(accountId: Option[String] = None,
      date: Option[Date] = None,
      inactive: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[List[IbptConf]]): Future[List[IbptConf]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/ibpt"))

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

  def updateIbptConf(code: String,
      taxconfprocess: IbptConf)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[IbptConf]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/ibpt/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfIBPTApi->updateIbptConf")

    if (taxconfprocess == null) throw new Exception("Missing required parameter 'taxconfprocess' when calling TaxConfIBPTApi->updateIbptConf")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(taxconfprocess))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
