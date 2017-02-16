package io.swagger.client.api

import io.swagger.client.model.CustomProcessScenario
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyProcessApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesCompanyIdProcessCodeGet(companyId: UUID,
      code: String)(implicit reader: ClientResponseReader[CustomProcessScenario]): Future[CustomProcessScenario] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/process/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyProcessApi->companiesCompanyIdProcessCodeGet")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyProcessApi->companiesCompanyIdProcessCodeGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdProcessGet(companyId: UUID,
      xPaginationLimit: Option[Integer] = Some(10),
      xPaginationCurrentPage: Option[Integer] = Some(1),
      xPaginationSort: Option[String] = None
      )(implicit reader: ClientResponseReader[List[CustomProcessScenario]]): Future[List[CustomProcessScenario]] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/process")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyProcessApi->companiesCompanyIdProcessGet")

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

  def createCustomProcessScenario(companyId: UUID,
      body: CustomProcessScenario)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[CustomProcessScenario]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/process")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyProcessApi->createCustomProcessScenario")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyProcessApi->createCustomProcessScenario")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCustomProcessScenario(companyId: UUID,
      code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/process/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyProcessApi->deleteCustomProcessScenario")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyProcessApi->deleteCustomProcessScenario")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateCustomProcessScenario(companyId: UUID,
      code: String,
      body: CustomProcessScenario)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CustomProcessScenario]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/process/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyProcessApi->updateCustomProcessScenario")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyProcessApi->updateCustomProcessScenario")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyProcessApi->updateCustomProcessScenario")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
