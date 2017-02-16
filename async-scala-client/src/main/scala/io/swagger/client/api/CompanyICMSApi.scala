package io.swagger.client.api

import io.swagger.client.model.CustomIcmsConfByState
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyICMSApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesCompanyIdIcmsGet(companyId: UUID,
      xPaginationLimit: Option[Integer] = Some(10),
      xPaginationCurrentPage: Option[Integer] = Some(1),
      xPaginationSort: Option[String] = None
      )(implicit reader: ClientResponseReader[List[CustomIcmsConfByState]]): Future[List[CustomIcmsConfByState]] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/icms")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyICMSApi->companiesCompanyIdIcmsGet")

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

  def companiesCompanyIdIcmsStateGet(companyId: UUID,
      state: String)(implicit reader: ClientResponseReader[CustomIcmsConfByState]): Future[CustomIcmsConfByState] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/icms/{state}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "state" + "\\}",state.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyICMSApi->companiesCompanyIdIcmsStateGet")

    if (state == null) throw new Exception("Missing required parameter 'state' when calling CompanyICMSApi->companiesCompanyIdIcmsStateGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createICMS(companyId: UUID,
      body: CustomIcmsConfByState)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[CustomIcmsConfByState]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/icms")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyICMSApi->createICMS")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyICMSApi->createICMS")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCustomIcmsConfByState(companyId: UUID,
      state: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/icms/{state}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "state" + "\\}",state.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyICMSApi->deleteCustomIcmsConfByState")

    if (state == null) throw new Exception("Missing required parameter 'state' when calling CompanyICMSApi->deleteCustomIcmsConfByState")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateCustomIcmsConfByState(companyId: UUID,
      state: String,
      body: CustomIcmsConfByState)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CustomIcmsConfByState]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/icms/{state}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "state" + "\\}",state.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyICMSApi->updateCustomIcmsConfByState")

    if (state == null) throw new Exception("Missing required parameter 'state' when calling CompanyICMSApi->updateCustomIcmsConfByState")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyICMSApi->updateCustomIcmsConfByState")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
