package io.swagger.client.api

import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.ItemCpom
import io.swagger.client.model.Message
import io.swagger.client.model.Number
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyItemCPOMServiceApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesCompanyIdItemsCodeCpomCityCodeGet(companyId: UUID,
      code: String,
      cityCode: Number)(implicit reader: ClientResponseReader[ItemCpom]): Future[ItemCpom] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}/cpom/{cityCode}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString)
        replaceAll ("\\{" + "cityCode" + "\\}",cityCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemCPOMServiceApi->companiesCompanyIdItemsCodeCpomCityCodeGet")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemCPOMServiceApi->companiesCompanyIdItemsCodeCpomCityCodeGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdItemsCodeCpomGet(companyId: UUID,
      code: String,
      xPaginationLimit: Option[Integer] = Some(10),
      xPaginationCurrentPage: Option[Integer] = Some(1),
      xPaginationSort: Option[String] = None
      )(implicit reader: ClientResponseReader[List[ItemCpom]]): Future[List[ItemCpom]] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}/cpom")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemCPOMServiceApi->companiesCompanyIdItemsCodeCpomGet")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemCPOMServiceApi->companiesCompanyIdItemsCodeCpomGet")

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

  def createItemCPOM(companyId: UUID,
      code: String,
      body: ItemCpom)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[ItemCpom]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}/cpom")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemCPOMServiceApi->createItemCPOM")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemCPOMServiceApi->createItemCPOM")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyItemCPOMServiceApi->createItemCPOM")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteItemCPOM(companyId: UUID,
      code: String,
      cityCode: Number)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}/cpom/{cityCode}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString)
        replaceAll ("\\{" + "cityCode" + "\\}",cityCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemCPOMServiceApi->deleteItemCPOM")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemCPOMServiceApi->deleteItemCPOM")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateItemCPOM(companyId: UUID,
      code: String,
      cityCode: Number,
      body: ItemCpom)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[ItemCpom]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/items/{code}/cpom/{cityCode}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString)
        replaceAll ("\\{" + "cityCode" + "\\}",cityCode.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyItemCPOMServiceApi->updateItemCPOM")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyItemCPOMServiceApi->updateItemCPOM")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyItemCPOMServiceApi->updateItemCPOM")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
