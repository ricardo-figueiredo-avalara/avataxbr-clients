package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class Company_mailServer (
  user: Option[String],  // User for login on email server
password: Option[String],  // Password to login on email server
smtpAddress: Option[String],  // smtp address to email server
port: Option[Integer],  // port
emailFrom: Option[String],  // email address to identify the sender e-mail, to send a XML and DANFE
protocol: Option[String],  // protocol SSL or TLS
templatemessageToEmail: Option[String]  // Message to add to email body
)
