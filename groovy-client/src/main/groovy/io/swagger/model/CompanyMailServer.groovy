package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CompanyMailServer {

  /* User for login on email server */
  String user = null

  /* Password to login on email server */
  String password = null

  /* smtp address to email server */
  String smtpAddress = null

  /* port */
  Integer port = null

  /* email address to identify the sender e-mail, to send a XML and DANFE */
  String emailFrom = null

  /* protocol SSL or TLS */
  String protocol = null

  /* Message to add to email body */
  String templatemessageToEmail = null
  

}

