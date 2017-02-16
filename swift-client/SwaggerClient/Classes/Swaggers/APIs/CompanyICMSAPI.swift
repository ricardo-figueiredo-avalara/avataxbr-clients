//
// CompanyICMSAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class CompanyICMSAPI: APIBase {
    /**

     - parameter companyId: (path) Company ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func companiesCompanyIdIcmsGet(companyId companyId: NSUUID, completion: ((data: [CustomIcmsConfByState]?, error: ErrorType?) -> Void)) {
        companiesCompanyIdIcmsGetWithRequestBuilder(companyId: companyId).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /companies/{companyId}/icms
     - This operation return custom ICMS configurations that match with parameters queries 
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - examples: [{contentType=application/json, example=[ "" ]}]
     
     - parameter companyId: (path) Company ID 

     - returns: RequestBuilder<[CustomIcmsConfByState]> 
     */
    public class func companiesCompanyIdIcmsGetWithRequestBuilder(companyId companyId: NSUUID) -> RequestBuilder<[CustomIcmsConfByState]> {
        var path = "/companies/{companyId}/icms"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[CustomIcmsConfByState]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     * enum for parameter state
     */
    public enum State_companiesCompanyIdIcmsStateGet: String { 
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

     - parameter companyId: (path) Company ID 
     - parameter state: (path) Brazilian State 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func companiesCompanyIdIcmsStateGet(companyId companyId: NSUUID, state: State_companiesCompanyIdIcmsStateGet, completion: ((data: CustomIcmsConfByState?, error: ErrorType?) -> Void)) {
        companiesCompanyIdIcmsStateGetWithRequestBuilder(companyId: companyId, state: state).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /companies/{companyId}/icms/{state}
     - This operation return custom ICMS configurations that match with parameters queries 
     - examples: [{contentType=application/json, example=""}]
     
     - parameter companyId: (path) Company ID 
     - parameter state: (path) Brazilian State 

     - returns: RequestBuilder<CustomIcmsConfByState> 
     */
    public class func companiesCompanyIdIcmsStateGetWithRequestBuilder(companyId companyId: NSUUID, state: State_companiesCompanyIdIcmsStateGet) -> RequestBuilder<CustomIcmsConfByState> {
        var path = "/companies/{companyId}/icms/{state}"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<CustomIcmsConfByState>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Create custom ICMS tax for one company
     
     - parameter companyId: (path) Company ID 
     - parameter body: (body) Transaction Message 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func createICMS(companyId companyId: NSUUID, body: CustomIcmsConfByState, completion: ((data: InlineResponse201?, error: ErrorType?) -> Void)) {
        createICMSWithRequestBuilder(companyId: companyId, body: body).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Create custom ICMS tax for one company
     - POST /companies/{companyId}/icms
     - This method operation create a custom agast for one company 
     - examples: [{contentType=application/json, example={
  "id" : 123
}}]
     
     - parameter companyId: (path) Company ID 
     - parameter body: (body) Transaction Message 

     - returns: RequestBuilder<InlineResponse201> 
     */
    public class func createICMSWithRequestBuilder(companyId companyId: NSUUID, body: CustomIcmsConfByState) -> RequestBuilder<InlineResponse201> {
        var path = "/companies/{companyId}/icms"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<InlineResponse201>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     * enum for parameter state
     */
    public enum State_deleteCustomIcmsConfByState: String { 
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

     - parameter companyId: (path) Company ID 
     - parameter state: (path) Brazilian State 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteCustomIcmsConfByState(companyId companyId: NSUUID, state: State_deleteCustomIcmsConfByState, completion: ((error: ErrorType?) -> Void)) {
        deleteCustomIcmsConfByStateWithRequestBuilder(companyId: companyId, state: state).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - DELETE /companies/{companyId}/icms/{state}
     
     - parameter companyId: (path) Company ID 
     - parameter state: (path) Brazilian State 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteCustomIcmsConfByStateWithRequestBuilder(companyId companyId: NSUUID, state: State_deleteCustomIcmsConfByState) -> RequestBuilder<Void> {
        var path = "/companies/{companyId}/icms/{state}"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
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
    public enum State_updateCustomIcmsConfByState: String { 
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
     Update custom agast for one company
     
     - parameter companyId: (path) Company ID 
     - parameter state: (path) Brazilian State 
     - parameter body: (body) Transaction Message 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func updateCustomIcmsConfByState(companyId companyId: NSUUID, state: State_updateCustomIcmsConfByState, body: CustomIcmsConfByState, completion: ((error: ErrorType?) -> Void)) {
        updateCustomIcmsConfByStateWithRequestBuilder(companyId: companyId, state: state, body: body).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     Update custom agast for one company
     - PUT /companies/{companyId}/icms/{state}
     - This method operation update a custom ICMS tax for one company 
     
     - parameter companyId: (path) Company ID 
     - parameter state: (path) Brazilian State 
     - parameter body: (body) Transaction Message 

     - returns: RequestBuilder<Void> 
     */
    public class func updateCustomIcmsConfByStateWithRequestBuilder(companyId companyId: NSUUID, state: State_updateCustomIcmsConfByState, body: CustomIcmsConfByState) -> RequestBuilder<Void> {
        var path = "/companies/{companyId}/icms/{state}"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}