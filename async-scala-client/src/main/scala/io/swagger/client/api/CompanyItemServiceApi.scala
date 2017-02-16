package io.swagger.client.api

import io.swagger.client.model.Body_1
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.ItemSimple
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyItemServiceApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

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

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemServiceApi->companiesCompanyIdItemsCodeChangeCodePut")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemServiceApi->companiesCompanyIdItemsCodeChangeCodePut")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyItemServiceApi->companiesCompanyIdItemsCodeChangeCodePut")
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

  def companiesCompanyIdItemsCodeserviceGet(companyId: UUID,
      code: String,
      avalaraProductType: Option[String] = Some(service),
      agast: Option[String] = None
      )(implicit reader: ClientResponseReader[ItemSimple]): Future[ItemSimple] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}?service")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemServiceApi->companiesCompanyIdItemsCodeserviceGet")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemServiceApi->companiesCompanyIdItemsCodeserviceGet")

    agast match {
    case Some(param) => queryParams += "agast" -> param.toString
    case _ => queryParams
    }
    avalaraProductType match {
    case Some(param) => headerParams += "Avalara-Product-Type" -> param.toString
    case _ => headerParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdItemsserviceGet(companyId: UUID,
      avalaraProductType: Option[String] = Some(service),
      xPaginationLimit: Option[Integer] = Some(10),
      xPaginationCurrentPage: Option[Integer] = Some(1),
      xPaginationSort: Option[String] = None,
      code: Option[String] = None,
      agast: Option[String] = None
      )(implicit reader: ClientResponseReader[List[ItemSimple]]): Future[List[ItemSimple]] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items?service")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemServiceApi->companiesCompanyIdItemsserviceGet")

    code match {
    case Some(param) => queryParams += "code" -> param.toString
    case _ => queryParams
    }
    agast match {
    case Some(param) => queryParams += "agast" -> param.toString
    case _ => queryParams
    }
    avalaraProductType match {
    case Some(param) => headerParams += "Avalara-Product-Type" -> param.toString
    case _ => headerParams
    }
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

  def createItemService(companyId: UUID,
      body: ItemSimple,
      avalaraProductType: Option[String] = Some(service)
      )(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[ItemSimple]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items?service")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemServiceApi->createItemService")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyItemServiceApi->createItemService")
    avalaraProductType match {
    case Some(param) => headerParams += "Avalara-Product-Type" -> param.toString
    case _ => headerParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteItemService(companyId: UUID,
      code: String,
      avalaraProductType: Option[String] = Some(service)
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}?service")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemServiceApi->deleteItemService")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemServiceApi->deleteItemService")

    avalaraProductType match {
    case Some(param) => headerParams += "Avalara-Product-Type" -> param.toString
    case _ => headerParams
    }

    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateItemService(companyId: UUID,
      code: String,
      body: ItemSimple,
      avalaraProductType: Option[String] = Some(service)
      )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[ItemSimple]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}?service")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemServiceApi->updateItemService")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemServiceApi->updateItemService")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyItemServiceApi->updateItemService")
    avalaraProductType match {
    case Some(param) => headerParams += "Avalara-Product-Type" -> param.toString
    case _ => headerParams
    }

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
