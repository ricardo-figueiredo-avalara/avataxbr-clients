using Avalara.AvaTax.Brazil.RestClient.Api.Interfaces;
using Avalara.AvaTax.Brazil.RestClient.Client;
using Avalara.AvaTax.Brazil.RestClient.Model;
using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class AGASTServiceApi : IAGASTServiceApi
    {
        /// <summary>
        /// Gets or sets the ExceptionFactory object
        /// </summary>
        /// <value>An instance of the ExceptionFactory</value>
        public ExceptionFactory ExceptionFactory { get; set; }

        /// <summary>
        /// Gets or sets the Configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Configuration Configuration { get; set; }

        /// <summary>
        /// Initializes a new instance of the <see cref="AGASTServiceApi"/> class.
        /// </summary>
        /// <returns></returns>
        public AGASTServiceApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));

            ExceptionFactory = Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AGASTServiceApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public AGASTServiceApi(Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public Dictionary<String, String> DefaultHeader()
        {
            return this.Configuration.DefaultHeader;
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Create agast This method operation create a AGAST 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>InlineResponse201</returns>
        public InlineResponse201 CreateAgastService(string authorization, AgastService body)
        {
            ApiResponse<InlineResponse201> localVarResponse = CreateAgastServiceWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Create agast This method operation create a AGAST 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of InlineResponse201</returns>
        public ApiResponse<InlineResponse201> CreateAgastServiceWithHttpInfo(string authorization, AgastService body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->CreateAgastService");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling AGASTServiceApi->CreateAgastService");

            var localVarPath = "/agasts?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateAgastService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse201>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (InlineResponse201)Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse201)));
        }

        /// <summary>
        /// Create agast This method operation create a AGAST 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of InlineResponse201</returns>
        public async System.Threading.Tasks.Task<InlineResponse201> CreateAgastServiceAsync(string authorization, AgastService body)
        {
            ApiResponse<InlineResponse201> localVarResponse = await CreateAgastServiceAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Create agast This method operation create a AGAST 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (InlineResponse201)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<InlineResponse201>> CreateAgastServiceAsyncWithHttpInfo(string authorization, AgastService body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->CreateAgastService");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling AGASTServiceApi->CreateAgastService");

            var localVarPath = "/agasts?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CreateAgastService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse201>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (InlineResponse201)Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse201)));
        }

        /// <summary>
        /// Delete Agast Delete Agast
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns></returns>
        public void DeleteAgastService(string authorization, string code)
        {
            DeleteAgastServiceWithHttpInfo(authorization, code);
        }

        /// <summary>
        /// Delete Agast Delete Agast
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> DeleteAgastServiceWithHttpInfo(string authorization, string code)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->DeleteAgastService");
            // verify the required parameter 'code' is set
            if (code == null)
                throw new ApiException(400, "Missing required parameter 'code' when calling AGASTServiceApi->DeleteAgastService");

            var localVarPath = "/agasts/{code}?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (code != null) localVarPathParams.Add("code", Configuration.ApiClient.ParameterToString(code)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteAgastService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Delete Agast Delete Agast
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task DeleteAgastServiceAsync(string authorization, string code)
        {
            await DeleteAgastServiceAsyncWithHttpInfo(authorization, code);

        }

        /// <summary>
        /// Delete Agast Delete Agast
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> DeleteAgastServiceAsyncWithHttpInfo(string authorization, string code)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->DeleteAgastService");
            // verify the required parameter 'code' is set
            if (code == null)
                throw new ApiException(400, "Missing required parameter 'code' when calling AGASTServiceApi->DeleteAgastService");

            var localVarPath = "/agasts/{code}?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (code != null) localVarPathParams.Add("code", Configuration.ApiClient.ParameterToString(code)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("DeleteAgastService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        ///  This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="text">Text query (optional)</param>
        /// <param name="hscode">Fiscal Classification query. (optional)</param>
        /// <param name="whPIS">Filters Agasts which withhold (or not) PIS. (optional)</param>
        /// <param name="whCOFINS">Filters Agasts which withhold (or not) COFINS. (optional)</param>
        /// <param name="whCSLL">Filters Agasts which withhold (or not) CSLL. (optional)</param>
        /// <param name="whIRRF">Filters Agasts which withhold (or not) IRRF. (optional)</param>
        /// <param name="whINSS">Filters Agasts which withhold (or not) INSS. (optional)</param>
        /// <returns>List&lt;InlineResponse2001&gt;</returns>
        public List<InlineResponse2001> GetAgastListService(string authorization, string text = null, string hscode = null, string whPIS = null, string whCOFINS = null, string whCSLL = null, string whIRRF = null, string whINSS = null)
        {
            ApiResponse<List<InlineResponse2001>> localVarResponse = GetAgastListServiceWithHttpInfo(authorization, text, hscode, whPIS, whCOFINS, whCSLL, whIRRF, whINSS);
            return localVarResponse.Data;
        }

        /// <summary>
        ///  This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="text">Text query (optional)</param>
        /// <param name="hscode">Fiscal Classification query. (optional)</param>
        /// <param name="whPIS">Filters Agasts which withhold (or not) PIS. (optional)</param>
        /// <param name="whCOFINS">Filters Agasts which withhold (or not) COFINS. (optional)</param>
        /// <param name="whCSLL">Filters Agasts which withhold (or not) CSLL. (optional)</param>
        /// <param name="whIRRF">Filters Agasts which withhold (or not) IRRF. (optional)</param>
        /// <param name="whINSS">Filters Agasts which withhold (or not) INSS. (optional)</param>
        /// <returns>ApiResponse of List&lt;InlineResponse2001&gt;</returns>
        public ApiResponse<List<InlineResponse2001>> GetAgastListServiceWithHttpInfo(string authorization, string text = null, string hscode = null, string whPIS = null, string whCOFINS = null, string whCSLL = null, string whIRRF = null, string whINSS = null)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->GetAgastListService");

            var localVarPath = "/agasts?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (text != null) localVarQueryParams.Add("text", Configuration.ApiClient.ParameterToString(text)); // query parameter
            if (hscode != null) localVarQueryParams.Add("hscode", Configuration.ApiClient.ParameterToString(hscode)); // query parameter
            if (whPIS != null) localVarQueryParams.Add("wh.PIS", Configuration.ApiClient.ParameterToString(whPIS)); // query parameter
            if (whCOFINS != null) localVarQueryParams.Add("wh.COFINS", Configuration.ApiClient.ParameterToString(whCOFINS)); // query parameter
            if (whCSLL != null) localVarQueryParams.Add("wh.CSLL", Configuration.ApiClient.ParameterToString(whCSLL)); // query parameter
            if (whIRRF != null) localVarQueryParams.Add("wh.IRRF", Configuration.ApiClient.ParameterToString(whIRRF)); // query parameter
            if (whINSS != null) localVarQueryParams.Add("wh.INSS", Configuration.ApiClient.ParameterToString(whINSS)); // query parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAgastListService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<InlineResponse2001>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<InlineResponse2001>)Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<InlineResponse2001>)));
        }

        /// <summary>
        ///  This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="text">Text query (optional)</param>
        /// <param name="hscode">Fiscal Classification query. (optional)</param>
        /// <param name="whPIS">Filters Agasts which withhold (or not) PIS. (optional)</param>
        /// <param name="whCOFINS">Filters Agasts which withhold (or not) COFINS. (optional)</param>
        /// <param name="whCSLL">Filters Agasts which withhold (or not) CSLL. (optional)</param>
        /// <param name="whIRRF">Filters Agasts which withhold (or not) IRRF. (optional)</param>
        /// <param name="whINSS">Filters Agasts which withhold (or not) INSS. (optional)</param>
        /// <returns>Task of List&lt;InlineResponse2001&gt;</returns>
        public async System.Threading.Tasks.Task<List<InlineResponse2001>> GetAgastListServiceAsync(string authorization, string text = null, string hscode = null, string whPIS = null, string whCOFINS = null, string whCSLL = null, string whIRRF = null, string whINSS = null)
        {
            ApiResponse<List<InlineResponse2001>> localVarResponse = await GetAgastListServiceAsyncWithHttpInfo(authorization, text, hscode, whPIS, whCOFINS, whCSLL, whIRRF, whINSS);
            return localVarResponse.Data;

        }

        /// <summary>
        ///  This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="text">Text query (optional)</param>
        /// <param name="hscode">Fiscal Classification query. (optional)</param>
        /// <param name="whPIS">Filters Agasts which withhold (or not) PIS. (optional)</param>
        /// <param name="whCOFINS">Filters Agasts which withhold (or not) COFINS. (optional)</param>
        /// <param name="whCSLL">Filters Agasts which withhold (or not) CSLL. (optional)</param>
        /// <param name="whIRRF">Filters Agasts which withhold (or not) IRRF. (optional)</param>
        /// <param name="whINSS">Filters Agasts which withhold (or not) INSS. (optional)</param>
        /// <returns>Task of ApiResponse (List&lt;InlineResponse2001&gt;)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<InlineResponse2001>>> GetAgastListServiceAsyncWithHttpInfo(string authorization, string text = null, string hscode = null, string whPIS = null, string whCOFINS = null, string whCSLL = null, string whIRRF = null, string whINSS = null)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->GetAgastListService");

            var localVarPath = "/agasts?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (text != null) localVarQueryParams.Add("text", Configuration.ApiClient.ParameterToString(text)); // query parameter
            if (hscode != null) localVarQueryParams.Add("hscode", Configuration.ApiClient.ParameterToString(hscode)); // query parameter
            if (whPIS != null) localVarQueryParams.Add("wh.PIS", Configuration.ApiClient.ParameterToString(whPIS)); // query parameter
            if (whCOFINS != null) localVarQueryParams.Add("wh.COFINS", Configuration.ApiClient.ParameterToString(whCOFINS)); // query parameter
            if (whCSLL != null) localVarQueryParams.Add("wh.CSLL", Configuration.ApiClient.ParameterToString(whCSLL)); // query parameter
            if (whIRRF != null) localVarQueryParams.Add("wh.IRRF", Configuration.ApiClient.ParameterToString(whIRRF)); // query parameter
            if (whINSS != null) localVarQueryParams.Add("wh.INSS", Configuration.ApiClient.ParameterToString(whINSS)); // query parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAgastListService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<InlineResponse2001>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<InlineResponse2001>)Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<InlineResponse2001>)));
        }

        /// <summary>
        /// Get agast This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>AgastService</returns>
        public AgastService GetAgastService(string authorization, string code)
        {
            ApiResponse<AgastService> localVarResponse = GetAgastServiceWithHttpInfo(authorization, code);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Get agast This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>ApiResponse of AgastService</returns>
        public ApiResponse<AgastService> GetAgastServiceWithHttpInfo(string authorization, string code)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->GetAgastService");
            // verify the required parameter 'code' is set
            if (code == null)
                throw new ApiException(400, "Missing required parameter 'code' when calling AGASTServiceApi->GetAgastService");

            var localVarPath = "/agasts/{code}?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (code != null) localVarPathParams.Add("code", Configuration.ApiClient.ParameterToString(code)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAgastService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AgastService>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (AgastService)Configuration.ApiClient.Deserialize(localVarResponse, typeof(AgastService)));
        }

        /// <summary>
        /// Get agast This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>Task of AgastService</returns>
        public async System.Threading.Tasks.Task<AgastService> GetAgastServiceAsync(string authorization, string code)
        {
            ApiResponse<AgastService> localVarResponse = await GetAgastServiceAsyncWithHttpInfo(authorization, code);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Get agast This operation return agast configurations that match with parameters queries 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>Task of ApiResponse (AgastService)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<AgastService>> GetAgastServiceAsyncWithHttpInfo(string authorization, string code)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->GetAgastService");
            // verify the required parameter 'code' is set
            if (code == null)
                throw new ApiException(400, "Missing required parameter 'code' when calling AGASTServiceApi->GetAgastService");

            var localVarPath = "/agasts/{code}?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (code != null) localVarPathParams.Add("code", Configuration.ApiClient.ParameterToString(code)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAgastService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<AgastService>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (AgastService)Configuration.ApiClient.Deserialize(localVarResponse, typeof(AgastService)));
        }

        /// <summary>
        /// Find Equivalent AGAST This operation returns List of IssConfService from City To that have same Service Agast of serviceCodeFrom if cityFrom and serviceCodeFrom. If not Mapped return List with zero elements. 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="from">City IBGE Code - From</param>
        /// <param name="to">City IBGE Code - To</param>
        /// <param name="service">Service Code in City From</param>
        /// <returns>List<AgastServiceOperationsItem></returns>
        public List<AgastServiceOperationsItem> GetAgastServiceEquivalent(string authorization, string from, string to, string service)
        {
            ApiResponse<List<AgastServiceOperationsItem>> localVarResponse = GetAgastServiceEquivalentWithHttpInfo(authorization, from, to, service);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Find Equivalent AGAST This operation returns List of IssConfService from City To that have same Service Agast of serviceCodeFrom if cityFrom and serviceCodeFrom. If not Mapped return List with zero elements. 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="from">City IBGE Code - From</param>
        /// <param name="to">City IBGE Code - To</param>
        /// <param name="service">Service Code in City From</param>
        /// <returns>ApiResponse of List<AgastServiceOperationsItem></returns>
        public ApiResponse<List<AgastServiceOperationsItem>> GetAgastServiceEquivalentWithHttpInfo(string authorization, string from, string to, string service)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->GetAgastServiceEquivalent");
            // verify the required parameter 'from' is set
            if (from == null)
                throw new ApiException(400, "Missing required parameter 'from' when calling AGASTServiceApi->GetAgastServiceEquivalent");
            // verify the required parameter 'to' is set
            if (to == null)
                throw new ApiException(400, "Missing required parameter 'to' when calling AGASTServiceApi->GetAgastServiceEquivalent");
            // verify the required parameter 'service' is set
            if (service == null)
                throw new ApiException(400, "Missing required parameter 'service' when calling AGASTServiceApi->GetAgastServiceEquivalent");

            var localVarPath = "/agasts-service/equivalent";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (from != null) localVarQueryParams.Add("from", Configuration.ApiClient.ParameterToString(from)); // query parameter
            if (to != null) localVarQueryParams.Add("to", Configuration.ApiClient.ParameterToString(to)); // query parameter
            if (service != null) localVarQueryParams.Add("service", Configuration.ApiClient.ParameterToString(service)); // query parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAgastServiceEquivalent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<AgastServiceOperationsItem>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<AgastServiceOperationsItem>)Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<AgastServiceOperationsItem>)));
        }

        /// <summary>
        /// Find Equivalent AGAST This operation returns List of IssConfService from City To that have same Service Agast of serviceCodeFrom if cityFrom and serviceCodeFrom. If not Mapped return List with zero elements. 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="from">City IBGE Code - From</param>
        /// <param name="to">City IBGE Code - To</param>
        /// <param name="service">Service Code in City From</param>
        /// <returns>Task of List<AgastServiceOperationsItem></returns>
        public async System.Threading.Tasks.Task<List<AgastServiceOperationsItem>> GetAgastServiceEquivalentAsync(string authorization, string from, string to, string service)
        {
            ApiResponse<List<AgastServiceOperationsItem>> localVarResponse = await GetAgastServiceEquivalentAsyncWithHttpInfo(authorization, from, to, service);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Find Equivalent AGAST This operation returns List of IssConfService from City To that have same Service Agast of serviceCodeFrom if cityFrom and serviceCodeFrom. If not Mapped return List with zero elements. 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="from">City IBGE Code - From</param>
        /// <param name="to">City IBGE Code - To</param>
        /// <param name="service">Service Code in City From</param>
        /// <returns>Task of ApiResponse (List<AgastServiceOperationsItem>)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<AgastServiceOperationsItem>>> GetAgastServiceEquivalentAsyncWithHttpInfo(string authorization, string from, string to, string service)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->GetAgastServiceEquivalent");
            // verify the required parameter 'from' is set
            if (from == null)
                throw new ApiException(400, "Missing required parameter 'from' when calling AGASTServiceApi->GetAgastServiceEquivalent");
            // verify the required parameter 'to' is set
            if (to == null)
                throw new ApiException(400, "Missing required parameter 'to' when calling AGASTServiceApi->GetAgastServiceEquivalent");
            // verify the required parameter 'service' is set
            if (service == null)
                throw new ApiException(400, "Missing required parameter 'service' when calling AGASTServiceApi->GetAgastServiceEquivalent");

            var localVarPath = "/agasts/service-equivalent";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (from != null) localVarQueryParams.Add("from", Configuration.ApiClient.ParameterToString(from)); // query parameter
            if (to != null) localVarQueryParams.Add("to", Configuration.ApiClient.ParameterToString(to)); // query parameter
            if (service != null) localVarQueryParams.Add("service", Configuration.ApiClient.ParameterToString(service)); // query parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAgastServiceEquivalent", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<AgastServiceOperationsItem>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<AgastServiceOperationsItem>)Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<AgastServiceOperationsItem>)));
        }

        /// <summary>
        /// Find AGAST by LC116 This operation returns List of IssConfService from city to that have Service Agast with LC116 informed code. 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="city">City IBGE Code</param>
        /// <param name="code">LC116 Code</param>
        /// <returns>List<AgastServiceOperationsItem></returns>
        public List<AgastServiceOperationsItem> GetAgastServiceLC116(string authorization, string city, string code)
        {
            ApiResponse<List<AgastServiceOperationsItem>> localVarResponse = GetAgastServiceLC116WithHttpInfo(authorization, city, code);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Find AGAST by LC116 This operation returns List of IssConfService from city to that have Service Agast with LC116 informed code. 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="city">City IBGE Code</param>
        /// <param name="code">LC116 Code</param>
        /// <returns>ApiResponse of List<AgastServiceOperationsItem></returns>
        public ApiResponse<List<AgastServiceOperationsItem>> GetAgastServiceLC116WithHttpInfo(string authorization, string city, string code)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->GetAgastServiceLC116");
            // verify the required parameter 'city' is set
            if (city == null)
                throw new ApiException(400, "Missing required parameter 'city' when calling AGASTServiceApi->GetAgastServiceLC116");
            // verify the required parameter 'code' is set
            if (code == null)
                throw new ApiException(400, "Missing required parameter 'code' when calling AGASTServiceApi->GetAgastServiceLC116");

            var localVarPath = "/agasts/service-lc116";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (city != null) localVarQueryParams.Add("city", Configuration.ApiClient.ParameterToString(city)); // query parameter
            if (code != null) localVarQueryParams.Add("code", Configuration.ApiClient.ParameterToString(code)); // query parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAgastServiceLC116", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<AgastServiceOperationsItem>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<AgastServiceOperationsItem>)Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<AgastServiceOperationsItem>)));
        }

        /// <summary>
        /// Find AGAST by LC116 This operation returns List of IssConfService from city to that have Service Agast with LC116 informed code. 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="city">City IBGE Code</param>
        /// <param name="code">LC116 Code</param>
        /// <returns>Task of List<AgastServiceOperationsItem></returns>
        public async System.Threading.Tasks.Task<List<AgastServiceOperationsItem>> GetAgastServiceLC116Async(string authorization, string city, string code)
        {
            ApiResponse<List<AgastServiceOperationsItem>> localVarResponse = await GetAgastServiceLC116AsyncWithHttpInfo(authorization, city, code);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Find AGAST by LC116 This operation returns List of IssConfService from city to that have Service Agast with LC116 informed code. 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="city">City IBGE Code</param>
        /// <param name="code">LC116 Code</param>
        /// <returns>Task of ApiResponse (List<AgastServiceOperationsItem>)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<List<AgastServiceOperationsItem>>> GetAgastServiceLC116AsyncWithHttpInfo(string authorization, string city, string code)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->GetAgastServiceLC116");
            // verify the required parameter 'city' is set
            if (city == null)
                throw new ApiException(400, "Missing required parameter 'city' when calling AGASTServiceApi->GetAgastServiceLC116");
            // verify the required parameter 'code' is set
            if (code == null)
                throw new ApiException(400, "Missing required parameter 'code' when calling AGASTServiceApi->GetAgastServiceLC116");

            var localVarPath = "/agasts/service-lc116";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (city != null) localVarQueryParams.Add("city", Configuration.ApiClient.ParameterToString(city)); // query parameter
            if (code != null) localVarQueryParams.Add("code", Configuration.ApiClient.ParameterToString(code)); // query parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetAgastServiceLC116", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<List<AgastServiceOperationsItem>>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (List<AgastServiceOperationsItem>)Configuration.ApiClient.Deserialize(localVarResponse, typeof(List<AgastServiceOperationsItem>)));
        }

        /// <summary>
        /// Update agast This method operation create a agast 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        public void UpdateAgastService(string authorization, string code, AgastService body)
        {
            UpdateAgastServiceWithHttpInfo(authorization, code, body);
        }

        /// <summary>
        /// Update agast This method operation create a agast 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> UpdateAgastServiceWithHttpInfo(string authorization, string code, AgastService body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->UpdateAgastService");
            // verify the required parameter 'code' is set
            if (code == null)
                throw new ApiException(400, "Missing required parameter 'code' when calling AGASTServiceApi->UpdateAgastService");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling AGASTServiceApi->UpdateAgastService");

            var localVarPath = "/agasts/{code}?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (code != null) localVarPathParams.Add("code", Configuration.ApiClient.ParameterToString(code)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateAgastService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Update agast This method operation create a agast 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task UpdateAgastServiceAsync(string authorization, string code, AgastService body)
        {
            await UpdateAgastServiceAsyncWithHttpInfo(authorization, code, body);

        }

        /// <summary>
        /// Update agast This method operation create a agast 
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> UpdateAgastServiceAsyncWithHttpInfo(string authorization, string code, AgastService body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling AGASTServiceApi->UpdateAgastService");
            // verify the required parameter 'code' is set
            if (code == null)
                throw new ApiException(400, "Missing required parameter 'code' when calling AGASTServiceApi->UpdateAgastService");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling AGASTServiceApi->UpdateAgastService");

            var localVarPath = "/agasts/{code}?service";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (code != null) localVarPathParams.Add("code", Configuration.ApiClient.ParameterToString(code)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter
            if (body != null && body.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(body); // http body (model) parameter
            }
            else
            {
                localVarPostBody = body; // byte array
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("UpdateAgastService", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

    }
}
