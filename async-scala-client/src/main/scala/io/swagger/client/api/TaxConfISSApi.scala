package io.swagger.client.api

import java.util.Date
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.IssConfByCity
import io.swagger.client.model.Message
import io.swagger.client.model.Number
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class TaxConfISSApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createIssConfByCity(issConfByCity: IssConfByCity)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[IssConfByCity]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/taxconf/iss"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (issConfByCity == null) throw new Exception("Missing required parameter 'issConfByCity' when calling TaxConfISSApi->createIssConfByCity")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(issConfByCity))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteIssConf(cityCode: Number)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/iss/{cityCode}")
        replaceAll ("\\{" + "cityCode" + "\\}",cityCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getIssConfByCity(cityCode: Number,
      code: Option[String] = None,
      date: Option[Date] = None,
      inactive: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[List[IssConfByCity]]): Future[List[IssConfByCity]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/iss/{cityCode}")
        replaceAll ("\\{" + "cityCode" + "\\}",cityCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    code match {
    case Some(param) => queryParams += "code" -> param.toString
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

  def getIssList(suffixcode: Option[String] = None,
      date: Option[Date] = None,
      inactive: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[List[IssConfByCity]]): Future[List[IssConfByCity]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/iss"))

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

  def updateIssConfByCity(cityCode: Number,
      issConfByCity: IssConfByCity)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[IssConfByCity]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/iss/{cityCode}")
        replaceAll ("\\{" + "cityCode" + "\\}",cityCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (issConfByCity == null) throw new Exception("Missing required parameter 'issConfByCity' when calling TaxConfISSApi->updateIssConfByCity")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(issConfByCity))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
