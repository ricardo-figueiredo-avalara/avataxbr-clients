package io.swagger.client.api

import io.swagger.client.model.Agast
import io.swagger.client.model.Inline_response_200_1
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class AGASTApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def agastsCodeGet(code: String)(implicit reader: ClientResponseReader[Agast]): Future[Agast] = {
    // create path and map variables
    val path = (addFmt("/agasts/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling AGASTApi->agastsCodeGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createAgast(body: Agast)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[Agast]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/agasts"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AGASTApi->createAgast")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAgast(code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/agasts/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling AGASTApi->deleteAgast")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getAgastList(text: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Inline_response_200_1]]): Future[List[Inline_response_200_1]] = {
    // create path and map variables
    val path = (addFmt("/agasts"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    text match {
    case Some(param) => queryParams += "text" -> param.toString
    case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateAgast(code: String,
      body: Agast)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Agast]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/agasts/{code}")
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (code == null) throw new Exception("Missing required parameter 'code' when calling AGASTApi->updateAgast")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AGASTApi->updateAgast")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
