package io.swagger.client.api

import io.swagger.client.model.Body_1
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.ItemGoods
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyItemGoodsApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesCompanyIdItemsCodeChangeCodePut(companyId: UUID,
      code: String,
      body: Body_1,
      goods: Option[String] = None,
      service: Option[String] = None
      )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Body_1]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}/change-code")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemGoodsApi->companiesCompanyIdItemsCodeChangeCodePut")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemGoodsApi->companiesCompanyIdItemsCodeChangeCodePut")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyItemGoodsApi->companiesCompanyIdItemsCodeChangeCodePut")
    goods match {
    case Some(param) => queryParams += "goods" -> param.toString
    case _ => queryParams
    }
    service match {
    case Some(param) => queryParams += "service" -> param.toString
    case _ => queryParams
    }

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdItemsCodegoodsGet(companyId: UUID,
      code: String,
      avalaraProductType: String = goods,
      agast: Option[String] = None
      )(implicit reader: ClientResponseReader[ItemGoods]): Future[ItemGoods] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}?goods")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemGoodsApi->companiesCompanyIdItemsCodegoodsGet")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemGoodsApi->companiesCompanyIdItemsCodegoodsGet")

    if (avalaraProductType == null) throw new Exception("Missing required parameter 'avalaraProductType' when calling CompanyItemGoodsApi->companiesCompanyIdItemsCodegoodsGet")

    agast match {
    case Some(param) => queryParams += "agast" -> param.toString
    case _ => queryParams
    }
    headerParams += "Avalara-Product-Type" -> avalaraProductType.toString

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdItemsgoodsGet(companyId: UUID,
      avalaraProductType: String = goods,
      xPaginationLimit: Option[Integer] = Some(10),
      xPaginationCurrentPage: Option[Integer] = Some(1),
      xPaginationSort: Option[String] = None,
      code: Option[String] = None,
      agast: Option[String] = None
      )(implicit reader: ClientResponseReader[List[ItemGoods]]): Future[List[ItemGoods]] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items?goods")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemGoodsApi->companiesCompanyIdItemsgoodsGet")

    if (avalaraProductType == null) throw new Exception("Missing required parameter 'avalaraProductType' when calling CompanyItemGoodsApi->companiesCompanyIdItemsgoodsGet")

    code match {
    case Some(param) => queryParams += "code" -> param.toString
    case _ => queryParams
    }
    agast match {
    case Some(param) => queryParams += "agast" -> param.toString
    case _ => queryParams
    }
    headerParams += "Avalara-Product-Type" -> avalaraProductType.toString
    xPaginationLimit match {
    case Some(param) => headerParams += "X-Pagination-Limit" -> param.toString
    case _ => headerParams
    }
    xPaginationCurrentPage match {
    case Some(param) => headerParams += "X-Pagination-Current-Page" -> param.toString
    case _ => headerParams
    }
    xPaginationSort match {
    case Some(param) => headerParams += "X-Pagination-Sort" -> param.toString
    case _ => headerParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createItem(companyId: UUID,
      avalaraProductType: String = goods,
      body: ItemGoods)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[ItemGoods]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items?goods")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemGoodsApi->createItem")

    if (avalaraProductType == null) throw new Exception("Missing required parameter 'avalaraProductType' when calling CompanyItemGoodsApi->createItem")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyItemGoodsApi->createItem")
    headerParams += "Avalara-Product-Type" -> avalaraProductType.toString

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteItem(companyId: UUID,
      code: String,
      avalaraProductType: String = goods)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}?goods")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemGoodsApi->deleteItem")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemGoodsApi->deleteItem")

    if (avalaraProductType == null) throw new Exception("Missing required parameter 'avalaraProductType' when calling CompanyItemGoodsApi->deleteItem")

    headerParams += "Avalara-Product-Type" -> avalaraProductType.toString

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateItem(companyId: UUID,
      code: String,
      avalaraProductType: String = goods,
      body: ItemGoods)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[ItemGoods]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}?goods")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemGoodsApi->updateItem")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemGoodsApi->updateItem")

    if (avalaraProductType == null) throw new Exception("Missing required parameter 'avalaraProductType' when calling CompanyItemGoodsApi->updateItem")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyItemGoodsApi->updateItem")
    headerParams += "Avalara-Product-Type" -> avalaraProductType.toString

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
