//
// CompanyMailServer.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class CompanyMailServer: JSONEncodable {
    public enum ModelProtocol: String { 
        case ssl = "ssl"
        case tls = "tls"
    }
    /** User for login on email server */
    public var user: String?
    /** Password to login on email server */
    public var password: String?
    /** smtp address to email server */
    public var smtpAddress: String?
    /** port */
    public var port: Int32?
    /** email address to identify the sender e-mail, to send a XML and DANFE */
    public var emailFrom: String?
    /** protocol SSL or TLS */
    public var _protocol: ModelProtocol?
    /** Message to add to email body */
    public var templatemessageToEmail: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["user"] = self.user
        nillableDictionary["password"] = self.password
        nillableDictionary["smtpAddress"] = self.smtpAddress
        nillableDictionary["port"] = self.port?.encodeToJSON()
        nillableDictionary["emailFrom"] = self.emailFrom
        nillableDictionary["protocol"] = self._protocol?.rawValue
        nillableDictionary["templatemessageToEmail"] = self.templatemessageToEmail
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}