package io.swagger.client.api

import io.swagger.client.model.Company
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesGet()(implicit reader: ClientResponseReader[List[Company]]): Future[List[Company]] = {
    // create path and map variables
    val path = (addFmt("/companies"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createCompany(body: Company)(implicit reader: ClientResponseReader[Company], writer: RequestWriter[Company]): Future[Company] = {
    // create path and map variables
    val path = (addFmt("/companies"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyApi->createCompany")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteAccountCompany(accountId: UUID,
      companyId: UUID)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/accounts/{accountId}/companies/{companyId}")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString)
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling CompanyApi->deleteAccountCompany")

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyApi->deleteAccountCompany")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteCompany(companyId: UUID,
      companyId2: UUID)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "companyId" + "\\}",companyId2.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyApi->deleteCompany")

    if (companyId2 == null) throw new Exception("Missing required parameter 'companyId2' when calling CompanyApi->deleteCompany")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def infoCompany(companyId: UUID)(implicit reader: ClientResponseReader[Company]): Future[Company] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyApi->infoCompany")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateCompany(companyId: UUID,
      body: Company)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Company]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyApi->updateCompany")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyApi->updateCompany")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
