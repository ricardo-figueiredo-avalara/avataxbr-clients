package io.swagger.client.api

import io.swagger.client.model.Message
import io.swagger.client.model.TransactionForGoodsIn
import io.swagger.client.model.TransactionForGoodsOut
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class GoodsCalculationsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def calculationsgoodsPurchasePost(authorization: String,
      body: TransactionForGoodsIn)(implicit reader: ClientResponseReader[TransactionForGoodsOut], writer: RequestWriter[TransactionForGoodsIn]): Future[TransactionForGoodsOut] = {
    // create path and map variables
    val path = (addFmt("/calculations?goods-purchase"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling GoodsCalculationsApi->calculationsgoodsPurchasePost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling GoodsCalculationsApi->calculationsgoodsPurchasePost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def calculationsgoodsSalesPost(authorization: String,
      body: TransactionForGoodsIn)(implicit reader: ClientResponseReader[TransactionForGoodsOut], writer: RequestWriter[TransactionForGoodsIn]): Future[TransactionForGoodsOut] = {
    // create path and map variables
    val path = (addFmt("/calculations?goods-sales"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authorization == null) throw new Exception("Missing required parameter 'authorization' when calling GoodsCalculationsApi->calculationsgoodsSalesPost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling GoodsCalculationsApi->calculationsgoodsSalesPost")
    headerParams += "Authorization" -> authorization.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
