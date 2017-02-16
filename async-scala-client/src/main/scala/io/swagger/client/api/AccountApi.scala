package io.swagger.client.api

import io.swagger.client.model.AccountCompany
import io.swagger.client.model.Body
import io.swagger.client.model.Inline_response_201
import io.swagger.client.model.Message
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class AccountApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def accountsAccountIdCompaniesGet(accountId: UUID)(implicit reader: ClientResponseReader[List[AccountCompany]]): Future[List[AccountCompany]] = {
    // create path and map variables
    val path = (addFmt("/accounts/{accountId}/companies")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling AccountApi->accountsAccountIdCompaniesGet")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createAccountCompany(accountId: UUID,
      body: Body)(implicit reader: ClientResponseReader[Inline_response_201], writer: RequestWriter[Body]): Future[Inline_response_201] = {
    // create path and map variables
    val path = (addFmt("/accounts/{accountId}/companies")
        replaceAll ("\\{" + "accountId" + "\\}",accountId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accountId == null) throw new Exception("Missing required parameter 'accountId' when calling AccountApi->createAccountCompany")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling AccountApi->createAccountCompany")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
