//
// CompanyProcessAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class CompanyProcessAPI: APIBase {
    /**

     - parameter companyId: (path) Company ID 
     - parameter code: (path) Process Code 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func companiesCompanyIdProcessCodeGet(companyId companyId: NSUUID, code: String, completion: ((data: CustomProcessScenario?, error: ErrorType?) -> Void)) {
        companiesCompanyIdProcessCodeGetWithRequestBuilder(companyId: companyId, code: code).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /companies/{companyId}/process/{code}
     - This operation return custom process configurations that match with parameters queries 
     - examples: [{contentType=application/json, example=""}]
     
     - parameter companyId: (path) Company ID 
     - parameter code: (path) Process Code 

     - returns: RequestBuilder<CustomProcessScenario> 
     */
    public class func companiesCompanyIdProcessCodeGetWithRequestBuilder(companyId companyId: NSUUID, code: String) -> RequestBuilder<CustomProcessScenario> {
        var path = "/companies/{companyId}/process/{code}"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{code}", withString: "\(code)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<CustomProcessScenario>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter companyId: (path) Company ID 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func companiesCompanyIdProcessGet(companyId companyId: NSUUID, completion: ((data: [CustomProcessScenario]?, error: ErrorType?) -> Void)) {
        companiesCompanyIdProcessGetWithRequestBuilder(companyId: companyId).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     - GET /companies/{companyId}/process
     - This operation return custom process configurations that match with parameters queries 
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - examples: [{contentType=application/json, example=[ "" ]}]
     
     - parameter companyId: (path) Company ID 

     - returns: RequestBuilder<[CustomProcessScenario]> 
     */
    public class func companiesCompanyIdProcessGetWithRequestBuilder(companyId companyId: NSUUID) -> RequestBuilder<[CustomProcessScenario]> {
        var path = "/companies/{companyId}/process"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[CustomProcessScenario]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Create custom process tax for one company
     
     - parameter companyId: (path) Company ID 
     - parameter body: (body) Transaction Message 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func createCustomProcessScenario(companyId companyId: NSUUID, body: CustomProcessScenario, completion: ((data: InlineResponse201?, error: ErrorType?) -> Void)) {
        createCustomProcessScenarioWithRequestBuilder(companyId: companyId, body: body).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     Create custom process tax for one company
     - POST /companies/{companyId}/process
     - This method operation create a custom agast for one company 
     - examples: [{contentType=application/json, example={
  "id" : 123
}}]
     
     - parameter companyId: (path) Company ID 
     - parameter body: (body) Transaction Message 

     - returns: RequestBuilder<InlineResponse201> 
     */
    public class func createCustomProcessScenarioWithRequestBuilder(companyId companyId: NSUUID, body: CustomProcessScenario) -> RequestBuilder<InlineResponse201> {
        var path = "/companies/{companyId}/process"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<InlineResponse201>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter companyId: (path) Company ID 
     - parameter code: (path) Process Code 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteCustomProcessScenario(companyId companyId: NSUUID, code: String, completion: ((error: ErrorType?) -> Void)) {
        deleteCustomProcessScenarioWithRequestBuilder(companyId: companyId, code: code).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     - DELETE /companies/{companyId}/process/{code}
     
     - parameter companyId: (path) Company ID 
     - parameter code: (path) Process Code 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteCustomProcessScenarioWithRequestBuilder(companyId companyId: NSUUID, code: String) -> RequestBuilder<Void> {
        var path = "/companies/{companyId}/process/{code}"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{code}", withString: "\(code)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     Update custom agast for one company
     
     - parameter companyId: (path) Company ID 
     - parameter code: (path) Process Code 
     - parameter body: (body) Transaction Message 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func updateCustomProcessScenario(companyId companyId: NSUUID, code: String, body: CustomProcessScenario, completion: ((error: ErrorType?) -> Void)) {
        updateCustomProcessScenarioWithRequestBuilder(companyId: companyId, code: code, body: body).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     Update custom agast for one company
     - PUT /companies/{companyId}/process/{code}
     - This method operation update a custom process for one company 
     
     - parameter companyId: (path) Company ID 
     - parameter code: (path) Process Code 
     - parameter body: (body) Transaction Message 

     - returns: RequestBuilder<Void> 
     */
    public class func updateCustomProcessScenarioWithRequestBuilder(companyId companyId: NSUUID, code: String, body: CustomProcessScenario) -> RequestBuilder<Void> {
        var path = "/companies/{companyId}/process/{code}"
        path = path.stringByReplacingOccurrencesOfString("{companyId}", withString: "\(companyId)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{code}", withString: "\(code)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}
