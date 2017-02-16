//
// InvoiceContingencyAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class InvoiceContingencyAPI: APIBase {
    /**
     * enum for parameter state
     */
    public enum State_invoiceDropContingency: String { 
        case Ac = "ac"
        case Al = "al"
        case Am = "am"
        case Ap = "ap"
        case Ba = "ba"
        case Ce = "ce"
        case Df = "df"
        case Es = "es"
        case Go = "go"
        case Ma = "ma"
        case Mg = "mg"
        case Ms = "ms"
        case Mt = "mt"
        case Pa = "pa"
        case Pb = "pb"
        case Pe = "pe"
        case Pi = "pi"
        case Pr = "pr"
        case Rj = "rj"
        case Rn = "rn"
        case Ro = "ro"
        case Rr = "rr"
        case Rs = "rs"
        case Sc = "sc"
        case Se = "se"
        case Sp = "sp"
        case To = "to"
    }

    /**
     Invoice Drop Contingency per State
     
     - parameter state: (path) Brazilian State 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func invoiceDropContingency(state state: State_invoiceDropContingency, completion: ((error: ErrorType?) -> Void)) {
        invoiceDropContingencyWithRequestBuilder(state: state).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     Invoice Drop Contingency per State
     - DELETE /invoices/contingency/{state}
     - Drop State in Contingency
     
     - parameter state: (path) Brazilian State 

     - returns: RequestBuilder<Void> 
     */
    public class func invoiceDropContingencyWithRequestBuilder(state state: State_invoiceDropContingency) -> RequestBuilder<Void> {
        var path = "/invoices/contingency/{state}"
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     * enum for parameter state
     */
    public enum State_invoiceSetContingency: String { 
        case Ac = "ac"
        case Al = "al"
        case Am = "am"
        case Ap = "ap"
        case Ba = "ba"
        case Ce = "ce"
        case Df = "df"
        case Es = "es"
        case Go = "go"
        case Ma = "ma"
        case Mg = "mg"
        case Ms = "ms"
        case Mt = "mt"
        case Pa = "pa"
        case Pb = "pb"
        case Pe = "pe"
        case Pi = "pi"
        case Pr = "pr"
        case Rj = "rj"
        case Rn = "rn"
        case Ro = "ro"
        case Rr = "rr"
        case Rs = "rs"
        case Sc = "sc"
        case Se = "se"
        case Sp = "sp"
        case To = "to"
    }

    /**
     Invoice Set Contingency per State
     
     - parameter state: (path) Brazilian State 
     - parameter body: (body) Set Contingency 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func invoiceSetContingency(state state: State_invoiceSetContingency, body: Body4, completion: ((error: ErrorType?) -> Void)) {
        invoiceSetContingencyWithRequestBuilder(state: state, body: body).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     Invoice Set Contingency per State
     - PUT /invoices/contingency/{state}
     - Set State in Contingency
     
     - parameter state: (path) Brazilian State 
     - parameter body: (body) Set Contingency 

     - returns: RequestBuilder<Void> 
     */
    public class func invoiceSetContingencyWithRequestBuilder(state state: State_invoiceSetContingency, body: Body4) -> RequestBuilder<Void> {
        var path = "/invoices/contingency/{state}"
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     * enum for parameter state
     */
    public enum State_invoiceVerifyContingency: String { 
        case Ac = "ac"
        case Al = "al"
        case Am = "am"
        case Ap = "ap"
        case Ba = "ba"
        case Ce = "ce"
        case Df = "df"
        case Es = "es"
        case Go = "go"
        case Ma = "ma"
        case Mg = "mg"
        case Ms = "ms"
        case Mt = "mt"
        case Pa = "pa"
        case Pb = "pb"
        case Pe = "pe"
        case Pi = "pi"
        case Pr = "pr"
        case Rj = "rj"
        case Rn = "rn"
        case Ro = "ro"
        case Rr = "rr"
        case Rs = "rs"
        case Sc = "sc"
        case Se = "se"
        case Sp = "sp"
        case To = "to"
    }

    /**
     Invoice Verify Contingency per State
     
     - parameter state: (path) Brazilian State 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func invoiceVerifyContingency(state state: State_invoiceVerifyContingency, completion: ((data: InlineResponse2003?, error: ErrorType?) -> Void)) {
        invoiceVerifyContingencyWithRequestBuilder(state: state).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Invoice Verify Contingency per State
     - GET /invoices/contingency/{state}
     - Check if State was in Contingency
     - examples: [{contentType=application/json, example={
  "contingency" : true,
  "finishDate" : "2000-01-23T04:56:07.000+00:00",
  "startDate" : "2000-01-23T04:56:07.000+00:00"
}}]
     
     - parameter state: (path) Brazilian State 

     - returns: RequestBuilder<InlineResponse2003> 
     */
    public class func invoiceVerifyContingencyWithRequestBuilder(state state: State_invoiceVerifyContingency) -> RequestBuilder<InlineResponse2003> {
        var path = "/invoices/contingency/{state}"
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<InlineResponse2003>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}