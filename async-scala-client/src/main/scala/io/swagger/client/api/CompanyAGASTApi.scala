package io.swagger.client.api

import io.swagger.client.model.CustomAgast
import io.swagger.client.model.Inline_response_200_1
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyAGASTApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesCompanyIdAgastsCodeGet(companyId: UUID,
      code: String,
      parent: Option[String] = None
      )(implicit reader: ClientResponseReader[CustomAgast]): Future[CustomAgast] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/agasts/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyAGASTApi->companiesCompanyIdAgastsCodeGet")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyAGASTApi->companiesCompanyIdAgastsCodeGet")

    parent match {
    case Some(param) => queryParams += "parent" -> param.toString
    case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdAgastsGet(companyId: UUID,
      text: Option[String] = None,
      xPaginationLimit: Option[Integer] = Some(10),
      xPaginationCurrentPage: Option[Integer] = Some(1),
      xPaginationSort: Option[String] = None,
      agast: Option[String] = None,
      parent: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Inline_response_200_1]]): Future[List[Inline_response_200_1]] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/agasts")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyAGASTApi->companiesCompanyIdAgastsGet")

    text match {
    case Some(param) => queryParams += "text" -> param.toString
    case _ => queryParams
    }
    agast match {
    case Some(param) => queryParams += "agast" -> param.toString
    case _ => queryParams
    }
    parent match {
    case Some(param) => queryParams += "parent" -> param.toString
    case _ => queryParams
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

  def createCustomAgast(companyId: UUID,
      body: CustomAgast,
      text: Option[String] = None
      )(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[CustomAgast]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/agasts")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyAGASTApi->createCustomAgast")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyAGASTApi->createCustomAgast")
    text match {
    case Some(param) => queryParams += "text" -> param.toString
    case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAgast(companyId: UUID,
      code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/agasts/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyAGASTApi->deleteAgast")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyAGASTApi->deleteAgast")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateCustomAgast(companyId: UUID,
      code: String,
      body: CustomAgast)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CustomAgast]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/agasts/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyAGASTApi->updateCustomAgast")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyAGASTApi->updateCustomAgast")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyAGASTApi->updateCustomAgast")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
