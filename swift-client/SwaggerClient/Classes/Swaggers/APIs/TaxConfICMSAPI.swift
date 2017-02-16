//
// TaxConfICMSAPI.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Alamofire



public class TaxConfICMSAPI: APIBase {
    /**
     * enum for parameter state
     */
    public enum State_createIcmsconfstate: String { 
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
     create a new ICMS Configuration
     
     - parameter state: (path) Brazilian State 
     - parameter icmsConfState: (body) The pet JSON you want to post 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func createIcmsconfstate(state state: State_createIcmsconfstate, icmsConfState: IcmsConfByState, completion: ((data: InlineResponse201?, error: ErrorType?) -> Void)) {
        createIcmsconfstateWithRequestBuilder(state: state, icmsConfState: icmsConfState).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     create a new ICMS Configuration
     - POST /taxconf/icms/{state}
     - examples: [{contentType=application/json, example={
  "id" : 123
}}]
     
     - parameter state: (path) Brazilian State 
     - parameter icmsConfState: (body) The pet JSON you want to post 

     - returns: RequestBuilder<InlineResponse201> 
     */
    public class func createIcmsconfstateWithRequestBuilder(state state: State_createIcmsconfstate, icmsConfState: IcmsConfByState) -> RequestBuilder<InlineResponse201> {
        var path = "/taxconf/icms/{state}"
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = icmsConfState.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<InlineResponse201>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     * enum for parameter state
     */
    public enum State_deleteIcmsConf: String { 
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
     disable a ICMS by State.
     
     - parameter state: (path) Brazilian State 
     - parameter code: (path) ICMS Code 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func deleteIcmsConf(state state: State_deleteIcmsConf, code: String, completion: ((error: ErrorType?) -> Void)) {
        deleteIcmsConfWithRequestBuilder(state: state, code: code).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     disable a ICMS by State.
     - DELETE /taxconf/icms/{state}/{code}
     
     - parameter state: (path) Brazilian State 
     - parameter code: (path) ICMS Code 

     - returns: RequestBuilder<Void> 
     */
    public class func deleteIcmsConfWithRequestBuilder(state state: State_deleteIcmsConf, code: String) -> RequestBuilder<Void> {
        var path = "/taxconf/icms/{state}/{code}"
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{code}", withString: "\(code)", options: .LiteralSearch, range: nil)
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
    public enum State_getIcmsConfByState: String { 
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
     get ICMS information by State.
     
     - parameter state: (path) Brazilian State 
     - parameter code: (path) ICMS Code 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getIcmsConfByState(state state: State_getIcmsConfByState, code: String, completion: ((data: [IcmsConfByState]?, error: ErrorType?) -> Void)) {
        getIcmsConfByStateWithRequestBuilder(state: state, code: code).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     get ICMS information by State.
     - GET /taxconf/icms/{state}/{code}
     - This operation return configurations of icms that match with parameters queries 
     - examples: [{contentType=application/json, example=[ {
  "icmsSTConf" : {
    "reductionOfMVAForSimples" : 1.3579000000000001069366817318950779736042022705078125,
    "srp" : 1.3579000000000001069366817318950779736042022705078125,
    "srpUnit" : "aeiou",
    "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
    "calcMode" : "aeiou",
    "icmsStBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
    "hasReductionOfMVAForSimples" : true
  },
  "icmsLegalReason" : "aeiou",
  "code" : "aeiou",
  "subjectToST" : true,
  "calcMode" : "aeiou",
  "msrpUnit" : "aeiou",
  "fcpRate" : 1.3579000000000001069366817318950779736042022705078125,
  "inactive" : true,
  "discountRateForMonoPhase" : 1.3579000000000001069366817318950779736042022705078125,
  "rate" : 1.3579000000000001069366817318950779736042022705078125,
  "icmsCST" : "aeiou",
  "msrp" : 1.3579000000000001069366817318950779736042022705078125,
  "name" : "aeiou",
  "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
  "state" : { },
  "icmsInterStateConf" : [ {
    "icmsSTConf" : {
      "reductionOfMVAForSimples" : 1.3579000000000001069366817318950779736042022705078125,
      "srp" : 1.3579000000000001069366817318950779736042022705078125,
      "srpUnit" : "aeiou",
      "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
      "protocolType" : "aeiou",
      "calcMode" : "aeiou",
      "icmsStBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
      "hasReductionOfMVAForSimples" : true
    },
    "icmsLegalReason" : "aeiou",
    "discountRateForMonoPhase" : 1.3579000000000001069366817318950779736042022705078125,
    "rate" : 1.3579000000000001069366817318950779736042022705078125,
    "msrp" : 1.3579000000000001069366817318950779736042022705078125,
    "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
    "state" : "",
    "calcMode" : "aeiou",
    "fcpRate" : 1.3579000000000001069366817318950779736042022705078125,
    "icmsBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
    "msrpUnit" : "aeiou"
  } ],
  "startDate" : "2000-01-23T04:56:07.000+00:00",
  "expirationDate" : "2000-01-23T04:56:07.000+00:00",
  "icmsBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125
} ]}]
     
     - parameter state: (path) Brazilian State 
     - parameter code: (path) ICMS Code 

     - returns: RequestBuilder<[IcmsConfByState]> 
     */
    public class func getIcmsConfByStateWithRequestBuilder(state state: State_getIcmsConfByState, code: String) -> RequestBuilder<[IcmsConfByState]> {
        var path = "/taxconf/icms/{state}/{code}"
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{code}", withString: "\(code)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [:]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[IcmsConfByState]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

    /**
     * enum for parameter state
     */
    public enum State_getIcmsList: String { 
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
     retrive list of ICMS.
     
     - parameter state: (path) Brazilian State 
     - parameter suffixcode: (query) Identify this ICMS (optional)
     - parameter date: (query) When informed return valid version configuration for this date (optional)
     - parameter inactive: (query) return the inactive versions too (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getIcmsList(state state: State_getIcmsList, suffixcode: String? = nil, date: NSDate? = nil, inactive: Bool? = nil, completion: ((data: [IcmsConfByState]?, error: ErrorType?) -> Void)) {
        getIcmsListWithRequestBuilder(state: state, suffixcode: suffixcode, date: date, inactive: inactive).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     retrive list of ICMS.
     - GET /taxconf/icms/{state}
     - This operation return ICMS configurations that match with parameters queries 
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - examples: [{contentType=application/json, example=[ {
  "icmsSTConf" : {
    "reductionOfMVAForSimples" : 1.3579000000000001069366817318950779736042022705078125,
    "srp" : 1.3579000000000001069366817318950779736042022705078125,
    "srpUnit" : "aeiou",
    "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
    "calcMode" : "aeiou",
    "icmsStBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
    "hasReductionOfMVAForSimples" : true
  },
  "icmsLegalReason" : "aeiou",
  "code" : "aeiou",
  "subjectToST" : true,
  "calcMode" : "aeiou",
  "msrpUnit" : "aeiou",
  "fcpRate" : 1.3579000000000001069366817318950779736042022705078125,
  "inactive" : true,
  "discountRateForMonoPhase" : 1.3579000000000001069366817318950779736042022705078125,
  "rate" : 1.3579000000000001069366817318950779736042022705078125,
  "icmsCST" : "aeiou",
  "msrp" : 1.3579000000000001069366817318950779736042022705078125,
  "name" : "aeiou",
  "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
  "state" : { },
  "icmsInterStateConf" : [ {
    "icmsSTConf" : {
      "reductionOfMVAForSimples" : 1.3579000000000001069366817318950779736042022705078125,
      "srp" : 1.3579000000000001069366817318950779736042022705078125,
      "srpUnit" : "aeiou",
      "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
      "protocolType" : "aeiou",
      "calcMode" : "aeiou",
      "icmsStBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
      "hasReductionOfMVAForSimples" : true
    },
    "icmsLegalReason" : "aeiou",
    "discountRateForMonoPhase" : 1.3579000000000001069366817318950779736042022705078125,
    "rate" : 1.3579000000000001069366817318950779736042022705078125,
    "msrp" : 1.3579000000000001069366817318950779736042022705078125,
    "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
    "state" : "",
    "calcMode" : "aeiou",
    "fcpRate" : 1.3579000000000001069366817318950779736042022705078125,
    "icmsBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
    "msrpUnit" : "aeiou"
  } ],
  "startDate" : "2000-01-23T04:56:07.000+00:00",
  "expirationDate" : "2000-01-23T04:56:07.000+00:00",
  "icmsBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125
} ]}]
     
     - parameter state: (path) Brazilian State 
     - parameter suffixcode: (query) Identify this ICMS (optional)
     - parameter date: (query) When informed return valid version configuration for this date (optional)
     - parameter inactive: (query) return the inactive versions too (optional)

     - returns: RequestBuilder<[IcmsConfByState]> 
     */
    public class func getIcmsListWithRequestBuilder(state state: State_getIcmsList, suffixcode: String? = nil, date: NSDate? = nil, inactive: Bool? = nil) -> RequestBuilder<[IcmsConfByState]> {
        var path = "/taxconf/icms/{state}"
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "suffixcode": suffixcode,
            "date": date?.encodeToJSON(),
            "inactive": inactive
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[IcmsConfByState]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     retrive list of ICMS.
     
     - parameter text: (query) Search for codes 
     - parameter state: (query) Filter for states (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func getIcmsList_0(text text: String, state: String? = nil, completion: ((data: [IcmsConfByState]?, error: ErrorType?) -> Void)) {
        getIcmsList_0WithRequestBuilder(text: text, state: state).execute { (response, error) -> Void in
            completion(data: response?.body, error: error);
        }
    }


    /**
     retrive list of ICMS.
     - GET /taxconf/icms-search/
     - This operation return ICMS configurations that match with parameters queries 
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - responseHeaders: [X-Pagination-Current-Page(Double), X-Pagination-Limit(Double), X-Pagination-Total-Pages(Double), X-Pagination-Total-Count(Double)]
     - examples: [{contentType=application/json, example=[ {
  "icmsSTConf" : {
    "reductionOfMVAForSimples" : 1.3579000000000001069366817318950779736042022705078125,
    "srp" : 1.3579000000000001069366817318950779736042022705078125,
    "srpUnit" : "aeiou",
    "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
    "calcMode" : "aeiou",
    "icmsStBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
    "hasReductionOfMVAForSimples" : true
  },
  "icmsLegalReason" : "aeiou",
  "code" : "aeiou",
  "subjectToST" : true,
  "calcMode" : "aeiou",
  "msrpUnit" : "aeiou",
  "fcpRate" : 1.3579000000000001069366817318950779736042022705078125,
  "inactive" : true,
  "discountRateForMonoPhase" : 1.3579000000000001069366817318950779736042022705078125,
  "rate" : 1.3579000000000001069366817318950779736042022705078125,
  "icmsCST" : "aeiou",
  "msrp" : 1.3579000000000001069366817318950779736042022705078125,
  "name" : "aeiou",
  "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
  "state" : { },
  "icmsInterStateConf" : [ {
    "icmsSTConf" : {
      "reductionOfMVAForSimples" : 1.3579000000000001069366817318950779736042022705078125,
      "srp" : 1.3579000000000001069366817318950779736042022705078125,
      "srpUnit" : "aeiou",
      "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
      "protocolType" : "aeiou",
      "calcMode" : "aeiou",
      "icmsStBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
      "hasReductionOfMVAForSimples" : true
    },
    "icmsLegalReason" : "aeiou",
    "discountRateForMonoPhase" : 1.3579000000000001069366817318950779736042022705078125,
    "rate" : 1.3579000000000001069366817318950779736042022705078125,
    "msrp" : 1.3579000000000001069366817318950779736042022705078125,
    "mvaRate" : 1.3579000000000001069366817318950779736042022705078125,
    "state" : "",
    "calcMode" : "aeiou",
    "fcpRate" : 1.3579000000000001069366817318950779736042022705078125,
    "icmsBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125,
    "msrpUnit" : "aeiou"
  } ],
  "startDate" : "2000-01-23T04:56:07.000+00:00",
  "expirationDate" : "2000-01-23T04:56:07.000+00:00",
  "icmsBaseDiscount" : 1.3579000000000001069366817318950779736042022705078125
} ]}]
     
     - parameter text: (query) Search for codes 
     - parameter state: (query) Filter for states (optional)

     - returns: RequestBuilder<[IcmsConfByState]> 
     */
    public class func getIcmsList_0WithRequestBuilder(text text: String, state: String? = nil) -> RequestBuilder<[IcmsConfByState]> {
        let path = "/taxconf/icms-search/"
        let URLString = SwaggerClientAPI.basePath + path

        let nillableParameters: [String:AnyObject?] = [
            "text": text,
            "state": state
        ]
 
        let parameters = APIHelper.rejectNil(nillableParameters)
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<[IcmsConfByState]>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: URLString, parameters: convertedParameters, isBody: false)
    }

    /**
     * enum for parameter state
     */
    public enum State_updateIcmsconfstate: String { 
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
     update a IcmsConf State,
     
     - parameter state: (path) Brazilian State 
     - parameter code: (path) ICMS Code 
     - parameter icmsConfState: (body) The pet JSON you want to post 
     - parameter completion: completion handler to receive the data and the error objects
     */
    public class func updateIcmsconfstate(state state: State_updateIcmsconfstate, code: String, icmsConfState: IcmsConfByState, completion: ((error: ErrorType?) -> Void)) {
        updateIcmsconfstateWithRequestBuilder(state: state, code: code, icmsConfState: icmsConfState).execute { (response, error) -> Void in
            completion(error: error);
        }
    }


    /**
     update a IcmsConf State,
     - PUT /taxconf/icms/{state}/{code}
     
     - parameter state: (path) Brazilian State 
     - parameter code: (path) ICMS Code 
     - parameter icmsConfState: (body) The pet JSON you want to post 

     - returns: RequestBuilder<Void> 
     */
    public class func updateIcmsconfstateWithRequestBuilder(state state: State_updateIcmsconfstate, code: String, icmsConfState: IcmsConfByState) -> RequestBuilder<Void> {
        var path = "/taxconf/icms/{state}/{code}"
        path = path.stringByReplacingOccurrencesOfString("{state}", withString: "\(state.rawValue)", options: .LiteralSearch, range: nil)
        path = path.stringByReplacingOccurrencesOfString("{code}", withString: "\(code)", options: .LiteralSearch, range: nil)
        let URLString = SwaggerClientAPI.basePath + path
        let parameters = icmsConfState.encodeToJSON() as? [String:AnyObject]
 
        let convertedParameters = APIHelper.convertBoolToString(parameters)
 
        let requestBuilder: RequestBuilder<Void>.Type = SwaggerClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "PUT", URLString: URLString, parameters: convertedParameters, isBody: true)
    }

}
