//
// AGASTAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



open class AGASTAPI: APIBase {

    public class func mapValuesToQueryItems(values: [String:Any?]) -> [URLQueryItem] {
        return values
            .filter { $0.1 != nil }
            .map { (item: (_key: String, _value: Any?)) -> URLQueryItem in
                URLQueryItem(name: item._key, value:"\(item._value!)")
            }
    }

    /**

     - parameter code: (path) Agast Code 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func agastsCodeGet(code: String, completion: @escaping ((_ data: Agast?,_ error: Error?) -> Void)) {
        agastsCodeGetWithRequestBuilder(code: code).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     - GET /agasts/{code}
     - This operation return agast configurations that match with parameters queries 
     - examples: [{contentType=application/json, example={
  "ipiLegalTaxClass" : "aeiou",
  "cean" : "aeiou",
  "pisCofinsTaxReporting" : "aeiou",
  "code" : "aeiou",
  "codeType" : {
    "code" : 123,
    "name" : "aeiou"
  },
  "cstIPI" : "aeiou",
  "accruablePISTaxation" : "aeiou",
  "issDueatDestination" : true,
  "description" : "aeiou",
  "issTaxation" : "aeiou",
  "specialProductClass" : "aeiou",
  "cest" : "aeiou",
  "federalTaxRate" : [ {
    "withholding" : {
      "all" : {
        "exemptionReasonCode" : "aeiou",
        "customExemptionReasonDescription" : "aeiou"
      },
      "stateGovernment" : "",
      "cityGovernment" : "",
      "business" : "",
      "federalGovernment" : ""
    },
    "specializationType" : "aeiou",
    "exemptionReasonCode" : "aeiou",
    "taxModel" : "aeiou",
    "rate" : 1.3579000000000001069366817318950779736042022705078125,
    "customExemptionReasonDescription" : "aeiou",
    "quantityUnidBase" : "aeiou",
    "srvAmount" : 1.3579000000000001069366817318950779736042022705078125,
    "taxType" : { }
  } ],
  "ex" : 123,
  "hsCode" : "aeiou",
  "accruableCOFINSTaxation" : "aeiou",
  "pisCofinsCreditNotAllowed" : true,
  "accruableCSLLTaxation" : "aeiou",
  "icmsConf" : [ {
    "code" : "aeiou",
    "state" : { }
  } ]
}}]
     
     - parameter code: (path) Agast Code 

     - returns: RequestBuilder<Agast> 
     */
    open class func agastsCodeGetWithRequestBuilder(code: String) -> RequestBuilder<Agast> {
        var path = "/agasts/{code}"
        path = path.replacingOccurrences(of: "{code}", with: "\(code)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)

        let convertedParameters = APIHelper.convertBoolToString(parameters)

        let requestBuilder: RequestBuilder<Agast>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     Create agast
     
     - parameter body: (body) Transaction Message 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func createAgast(body: Agast, completion: @escaping ((_ data: InlineResponse201?,_ error: Error?) -> Void)) {
        createAgastWithRequestBuilder(body: body).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     Create agast
     - POST /agasts
     - This method operation create a AGAST 
     - examples: [{contentType=application/json, example={
  "id" : 123
}}]
     
     - parameter body: (body) Transaction Message 

     - returns: RequestBuilder<InlineResponse201> 
     */
    open class func createAgastWithRequestBuilder(body: Agast) -> RequestBuilder<InlineResponse201> {
        let path = "/agasts"
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]

        let url = NSURLComponents(string: URLString)
        

        let convertedParameters = APIHelper.convertBoolToString(parameters)

        let requestBuilder: RequestBuilder<InlineResponse201>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: convertedParameters, isBody: true)
    }

    /**

     - parameter code: (path) Agast Code 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func deleteAgast(code: String, completion: @escaping ((_ error: Error?) -> Void)) {
        deleteAgastWithRequestBuilder(code: code).execute { (response, error) -> Void in
            completion(error);
        }
    }


    /**
     - DELETE /agasts/{code}
     
     - parameter code: (path) Agast Code 

     - returns: RequestBuilder<Void> 
     */
    open class func deleteAgastWithRequestBuilder(code: String) -> RequestBuilder<Void> {
        var path = "/agasts/{code}"
        path = path.replacingOccurrences(of: "{code}", with: "\(code)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)

        let convertedParameters = APIHelper.convertBoolToString(parameters)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "DELETE", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**

     - parameter text: (query) Text query (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getAgastList(text: String? = nil, completion: @escaping ((_ data: [InlineResponse2001]?,_ error: Error?) -> Void)) {
        getAgastListWithRequestBuilder(text: text).execute { (response, error) -> Void in
            completion(response?.body, error);
        }
    }


    /**
     - GET /agasts
     - This operation return agast configurations that match with parameters queries 
     - examples: [{contentType=application/json, example=[ {
  "code" : "aeiou",
  "description" : "aeiou",
  "id" : "aeiou"
} ]}]
     
     - parameter text: (query) Text query (optional)

     - returns: RequestBuilder<[InlineResponse2001]> 
     */
    open class func getAgastListWithRequestBuilder(text: String? = nil) -> RequestBuilder<[InlineResponse2001]> {
        let path = "/agasts"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:Any?] = [
            "text": text
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)

        let convertedParameters = APIHelper.convertBoolToString(parameters)

        let requestBuilder: RequestBuilder<[InlineResponse2001]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     Update agast
     
     - parameter code: (path) Agast Code 
     - parameter body: (body) Transaction Message 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func updateAgast(code: String, body: Agast, completion: @escaping ((_ error: Error?) -> Void)) {
        updateAgastWithRequestBuilder(code: code, body: body).execute { (response, error) -> Void in
            completion(error);
        }
    }


    /**
     Update agast
     - PUT /agasts/{code}
     - This method operation create a agast 
     
     - parameter code: (path) Agast Code 
     - parameter body: (body) Transaction Message 

     - returns: RequestBuilder<Void> 
     */
    open class func updateAgastWithRequestBuilder(code: String, body: Agast) -> RequestBuilder<Void> {
        var path = "/agasts/{code}"
        path = path.replacingOccurrences(of: "{code}", with: "\(code)", options: .literal, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = body.encodeToJSON() as? [String:AnyObject]

        let url = NSURLComponents(string: URLString)
        

        let convertedParameters = APIHelper.convertBoolToString(parameters)

        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: (url?.string ?? URLString), parameters: convertedParameters, isBody: true)
    }

}
