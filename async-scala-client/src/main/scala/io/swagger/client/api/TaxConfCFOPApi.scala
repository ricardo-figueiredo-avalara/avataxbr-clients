package io.swagger.client.api

import io.swagger.client.model.CfopConf
import java.util.Date
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class TaxConfCFOPApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createCfop(body: CfopConf)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[CfopConf]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/taxconf/cfop"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling TaxConfCFOPApi->createCfop")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCfop(code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/cfop/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfCFOPApi->deleteCfop")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCfop(code: String)(implicit reader: ClientResponseReader[CfopConf]): Future[CfopConf] = {
    // create path and map variables
    val path = (addFmt("/taxconf/cfop/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfCFOPApi->getCfop")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCfopList(suffixcode: Option[String] = None,
      date: Option[Date] = None,
      inactive: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[List[CfopConf]]): Future[List[CfopConf]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/cfop"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    suffixcode match {
    case Some(param) => queryParams += "suffixcode" -> param.toString
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

  def updateCfop(code: String,
      taxconfcfop: CfopConf)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CfopConf]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/cfop/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfCFOPApi->updateCfop")

    if (taxconfcfop == null) throw new Exception("Missing required parameter 'taxconfcfop' when calling TaxConfCFOPApi->updateCfop")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(taxconfcfop))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
