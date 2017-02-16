package io.swagger.client.api

import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Location
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyLocationApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesCompanyIdLocationsCodeGet(companyId: UUID,
      code: String)(implicit reader: ClientResponseReader[Location]): Future[Location] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/locations/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyLocationApi->companiesCompanyIdLocationsCodeGet")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyLocationApi->companiesCompanyIdLocationsCodeGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdLocationsGet(companyId: UUID,
      xPaginationLimit: Option[Integer] = Some(10),
      xPaginationCurrentPage: Option[Integer] = Some(1),
      xPaginationSort: Option[String] = None
      )(implicit reader: ClientResponseReader[List[Location]]): Future[List[Location]] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/locations")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyLocationApi->companiesCompanyIdLocationsGet")

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

  def createLocation(companyId: UUID,
      body: Location)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[Location]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/locations")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyLocationApi->createLocation")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyLocationApi->createLocation")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteLocation(companyId: UUID,
      code: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/locations/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyLocationApi->deleteLocation")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyLocationApi->deleteLocation")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateLocation(companyId: UUID,
      code: String,
      body: Location)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Location]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/locations/{code}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "code" + "\\}",code.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyLocationApi->updateLocation")

    if (code == null) throw new Exception("Missing required parameter 'code' when calling CompanyLocationApi->updateLocation")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyLocationApi->updateLocation")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
