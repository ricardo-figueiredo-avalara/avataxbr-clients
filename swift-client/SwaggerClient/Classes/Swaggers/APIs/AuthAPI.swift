//
// AuthAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class AuthAPI: APIBase {
    /**
     authorization
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func authPost(completion: ((data: InlineResponse200?, error: ErrorType?) -> Void)) {
        authPostWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     authorization
     - POST /auth
     - Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 
     - examples: [{contentType=application/json, example={
  "expired" : "2000-01-23T04:56:07.000+00:00",
  "token" : "aeiou"
}}]

     - returns: RequestBuilder<InlineResponse200> 
     */
    public class func authPostWithRequestBuilder() -> RequestBuilder<InlineResponse200> {
        let path = "/auth"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<InlineResponse200>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     authorization
     
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func v2AuthPost(completion: ((data: InlineResponse200?, error: ErrorType?) -> Void)) {
        v2AuthPostWithRequestBuilder().execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     authorization
     - POST /v2/auth
     - Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 
     - examples: [{contentType=application/json, example={
  "expired" : "2000-01-23T04:56:07.000+00:00",
  "token" : "aeiou"
}}]

     - returns: RequestBuilder<InlineResponse200> 
     */
    public class func v2AuthPostWithRequestBuilder() -> RequestBuilder<InlineResponse200> {
        let path = "/v2/auth"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<InlineResponse200>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}
