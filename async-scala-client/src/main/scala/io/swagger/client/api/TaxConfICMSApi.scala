package io.swagger.client.api

import java.util.Date
import io.swagger.client.model.IcmsConfByState
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class TaxConfICMSApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createIcmsconfstate(state: String,
      icmsConfState: IcmsConfByState)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[IcmsConfByState]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/taxconf/icms/{state}")
        replaceAll ("\\{" + "state" + "\\}",state.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (state == null) throw new Exception("Missing required parameter 'state' when calling TaxConfICMSApi->createIcmsconfstate")

    if (icmsConfState == null) throw new Exception("Missing required parameter 'icmsConfState' when calling TaxConfICMSApi->createIcmsconfstate")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(icmsConfState))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteIcmsConf(state: String,
      code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/icms/{state}/{code}")
        replaceAll ("\\{" + "state" + "\\}",state.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (state == null) throw new Exception("Missing required parameter 'state' when calling TaxConfICMSApi->deleteIcmsConf")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfICMSApi->deleteIcmsConf")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getIcmsConfByState(state: String,
      code: String)(implicit reader: ClientResponseReader[List[IcmsConfByState]]): Future[List[IcmsConfByState]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/icms/{state}/{code}")
        replaceAll ("\\{" + "state" + "\\}",state.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (state == null) throw new Exception("Missing required parameter 'state' when calling TaxConfICMSApi->getIcmsConfByState")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfICMSApi->getIcmsConfByState")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getIcmsList(state: String,
      suffixcode: Option[String] = None,
      date: Option[Date] = None,
      inactive: Option[Boolean] = None
      )(implicit reader: ClientResponseReader[List[IcmsConfByState]]): Future[List[IcmsConfByState]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/icms/{state}")
        replaceAll ("\\{" + "state" + "\\}",state.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (state == null) throw new Exception("Missing required parameter 'state' when calling TaxConfICMSApi->getIcmsList")

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

  def getIcmsList_0(text: String,
      state: Option[String] = None
      )(implicit reader: ClientResponseReader[List[IcmsConfByState]]): Future[List[IcmsConfByState]] = {
    // create path and map variables
    val path = (addFmt("/taxconf/icms-search/"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (text == null) throw new Exception("Missing required parameter 'text' when calling TaxConfICMSApi->getIcmsList_0")

    queryParams += "text" -> text.toString
    state match {
    case Some(param) => queryParams += "state" -> param.toString
    case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateIcmsconfstate(state: String,
      code: String,
      icmsConfState: IcmsConfByState)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[IcmsConfByState]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/taxconf/icms/{state}/{code}")
        replaceAll ("\\{" + "state" + "\\}",state.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (state == null) throw new Exception("Missing required parameter 'state' when calling TaxConfICMSApi->updateIcmsconfstate")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling TaxConfICMSApi->updateIcmsconfstate")

    if (icmsConfState == null) throw new Exception("Missing required parameter 'icmsConfState' when calling TaxConfICMSApi->updateIcmsconfstate")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(icmsConfState))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
