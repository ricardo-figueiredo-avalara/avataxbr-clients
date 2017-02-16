package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Company_configuration (
  certificate: Option[String],  // digital certificate A1 model, p12, encoded by base64
certificatepwd: Option[String],  // certificate password
certificateexpiration: Option[DateTime],  // expiration date of this certificate
logo: Option[String],  // company logo image encoded by base64
tpImpNFe: Option[String],  // how the document will be printed - &#39;0&#39; # without DANFE; - &#39;1&#39; # DANFe Letter; - &#39;2&#39; # DANFe Landscape; 
tpImpNFCe: Option[String]  // how the document will be printed - &#39;0&#39; # without DANFE; - &#39;4&#39; # DANFe NFC-e; - &#39;5&#39; # DANFe NFC-e e-mail 
)
