package io.swagger.client.api

import io.swagger.client.model.Inline_response_200
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class AuthApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def authPost(authorization: String)(implicit reader: ClientResponseReader[Inline_response_200]): Future[Inline_response_200] = {
    // create path and map variables
    val path = (addFmt("/auth"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling AuthApi->authPost")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def v2AuthPost(authorization: String)(implicit reader: ClientResponseReader[Inline_response_200]): Future[Inline_response_200] = {
    // create path and map variables
    val path = (addFmt("/v2/auth"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling AuthApi->v2AuthPost")

    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
