package io.swagger.client.api

import io.swagger.client.model.CustomTaxTypeRate
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyTaxRatesApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesCompanyIdTaxratesGet(companyId: UUID,
      xPaginationLimit: Option[Integer] = Some(10),
      xPaginationCurrentPage: Option[Integer] = Some(1),
      xPaginationSort: Option[String] = None
      )(implicit reader: ClientResponseReader[List[CustomTaxTypeRate]]): Future[List[CustomTaxTypeRate]] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/taxrates")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyTaxRatesApi->companiesCompanyIdTaxratesGet")

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

  def companiesCompanyIdTaxratesTaxTypeGet(companyId: UUID,
      taxType: String)(implicit reader: ClientResponseReader[CustomTaxTypeRate]): Future[CustomTaxTypeRate] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/taxrates/{taxType}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "taxType" + "\\}",taxType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyTaxRatesApi->companiesCompanyIdTaxratesTaxTypeGet")

    if (taxType == null) throw new Exception("Missing required parameter 'taxType' when calling CompanyTaxRatesApi->companiesCompanyIdTaxratesTaxTypeGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createCustomTaxes(companyId: UUID,
      body: CustomTaxTypeRate)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[CustomTaxTypeRate]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/taxrates")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyTaxRatesApi->createCustomTaxes")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyTaxRatesApi->createCustomTaxes")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCustomTaxes(companyId: UUID,
      taxType: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/taxrates/{taxType}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "taxType" + "\\}",taxType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyTaxRatesApi->deleteCustomTaxes")

    if (taxType == null) throw new Exception("Missing required parameter 'taxType' when calling CompanyTaxRatesApi->deleteCustomTaxes")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateCustomTaxes(companyId: UUID,
      taxType: String,
      body: CustomTaxTypeRate)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[CustomTaxTypeRate]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/taxrates/{taxType}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "taxType" + "\\}",taxType.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyTaxRatesApi->updateCustomTaxes")

    if (taxType == null) throw new Exception("Missing required parameter 'taxType' when calling CompanyTaxRatesApi->updateCustomTaxes")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyTaxRatesApi->updateCustomTaxes")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
