package io.swagger.client.api

import io.swagger.client.model.Body_2
import io.swagger.client.model.Body_3
import io.swagger.client.model.Inline_response_200_2
import io.swagger.client.model.Message
import io.swagger.client.model.Number
import java.util.UUID
import io.swagger.client.model.ValidationError
import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

class CompanyFilesApi(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def companiesCompanyIdNfseCertificateDelete(companyId: UUID,
      companyId2: UUID)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/nfse-certificate")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "companyId" + "\\}",companyId2.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyFilesApi->companiesCompanyIdNfseCertificateDelete")

    if (companyId2 == null) throw new Exception("Missing required parameter 'companyId2' when calling CompanyFilesApi->companiesCompanyIdNfseCertificateDelete")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdNfseCertificateGet(companyId: UUID,
      companyId2: UUID,
      peek: Option[Number] = None
      )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/nfse-certificate")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "companyId" + "\\}",companyId2.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyFilesApi->companiesCompanyIdNfseCertificateGet")

    if (companyId2 == null) throw new Exception("Missing required parameter 'companyId2' when calling CompanyFilesApi->companiesCompanyIdNfseCertificateGet")

    peek match {
    case Some(param) => queryParams += "peek" -> param.toString
    case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdNfseCertificatePost(companyId: UUID,
      body: Body_3)(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Body_3]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/nfse-certificate")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyFilesApi->companiesCompanyIdNfseCertificatePost")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyFilesApi->companiesCompanyIdNfseCertificatePost")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def companiesCompanyIdNfseCertificatePut(companyId: UUID,
      companyId2: UUID,
      body: Body_2)(implicit reader: ClientResponseReader[Inline_response_200_2], writer: RequestWriter[Body_2]): Future[Inline_response_200_2] = {
    // create path and map variables
    val path = (addFmt("/companies/{companyId}/nfse-certificate")
        replaceAll ("\\{" + "companyId" + "\\}",companyId.toString)
        replaceAll ("\\{" + "companyId" + "\\}",companyId2.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (companyId == null) throw new Exception("Missing required parameter 'companyId' when calling CompanyFilesApi->companiesCompanyIdNfseCertificatePut")

    if (companyId2 == null) throw new Exception("Missing required parameter 'companyId2' when calling CompanyFilesApi->companiesCompanyIdNfseCertificatePut")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling CompanyFilesApi->companiesCompanyIdNfseCertificatePut")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
