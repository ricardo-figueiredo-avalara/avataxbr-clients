package io.swagger.client.api

import io.swagger.client.model.Address
import io.swagger.client.model.Message
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class AddressApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getZipCode(zipcode: String)(implicit reader: ClientResponseReader[List[Address]]): Future[List[Address]] = {
    // create path and map variables
    val path = (addFmt("/addresses/{zipcode}")
        replaceAll ("\\{" + "zipcode" + "\\}",zipcode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (zipcode == null) throw new Exception("Missing required parameter 'zipcode' when calling AddressApi->getZipCode")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
