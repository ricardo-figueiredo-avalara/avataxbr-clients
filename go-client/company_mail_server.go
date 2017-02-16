/* 
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

type CompanyMailServer struct {

	// User for login on email server
	User string `json:"user,omitempty"`

	// Password to login on email server
	Password string `json:"password,omitempty"`

	// smtp address to email server
	SmtpAddress string `json:"smtpAddress,omitempty"`

	// port
	Port int32 `json:"port,omitempty"`

	// email address to identify the sender e-mail, to send a XML and DANFE
	EmailFrom string `json:"emailFrom,omitempty"`

	// protocol SSL or TLS
	Protocol string `json:"protocol,omitempty"`

	// Message to add to email body
	TemplatemessageToEmail string `json:"templatemessageToEmail,omitempty"`
}
