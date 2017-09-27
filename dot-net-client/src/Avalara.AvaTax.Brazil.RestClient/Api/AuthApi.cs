using Avalara.AvaTax.Brazil.RestClient.Api.Interfaces;
using Avalara.AvaTax.Brazil.RestClient.Client;
using Avalara.AvaTax.Brazil.RestClient.Model;
using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
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
    public class AuthApi : IAuthApi
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
        /// Initializes a new instance of the <see cref="AuthApi"/> class.
        /// </summary>
        public AuthApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));

            if (Configuration.ApiClient.Configuration == null)
                this.Configuration.ApiClient.Configuration = this.Configuration;

            ExceptionFactory = Configuration.DefaultExceptionFactory;
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
        /// Get Authorization Token
        /// </summary>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>Authorization Token</returns>
        private string GetAuthorization(string user, string password)
        {
            return AuthorizationType.Basic + " " + Convert.ToBase64String(ASCIIEncoding.ASCII.GetBytes(string.Format("{0}:{1}", user, password)));
        }

        /// <summary>
        /// Authorization API Method
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>ApiResponse of InlineResponse200</returns>
        public ApiResponse<InlineResponse200> AuthPostV1(string user, string password)
        {
            return AuthPost(AuthorizationVersion.v1, user, password);
        }

        /// <summary>
        /// Authorization V2 API Method
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>ApiResponse of InlineResponse200</returns>
        public ApiResponse<InlineResponse200> AuthPostV2(string user, string password)
        {
            return AuthPost(AuthorizationVersion.v2, user, password);
        }

        /// <summary>
        /// Authorization API Async Method
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>Task of ApiResponse (InlineResponse200)</returns>
        public async Task<ApiResponse<InlineResponse200>> AuthPostAsyncV1(string user, string password)
        {
            return await AuthPostAsync(AuthorizationVersion.v1, user, password);
        }

        /// <summary>
        /// Authorization V2 API Async Method
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>Task of ApiResponse (InlineResponse200)</returns>
        public async Task<ApiResponse<InlineResponse200>> AuthPostAsyncV2(string user, string password)
        {
            return await AuthPostAsync(AuthorizationVersion.v2, user, password);
        }

        /// <summary>
        /// Authorization API Method
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Version 'v1' or 'v2'</param>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>ApiResponse of InlineResponse200</returns>
        private ApiResponse<InlineResponse200> AuthPost(AuthorizationVersion version, string user, string password)
        {
            // verify the required parameter 'user' is set
            if (string.IsNullOrEmpty(user))
                throw new ApiException(400, "Missing required parameter 'user' when calling AuthApi->AuthPost");

            // verify the required parameter 'password' is set
            if (string.IsNullOrEmpty(password))
                throw new ApiException(400, "Missing required parameter 'password' when calling AuthApi->AuthPost");

            string localVarPath = version == AuthorizationVersion.v1 ? "auth" : "/v2/auth";

            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(GetAuthorization(user, password)));

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath, Method.POST, null, null, localVarHeaderParams, null, null, null, null);

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AuthPost", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse200>((int)localVarResponse.StatusCode, localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (InlineResponse200)Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse200)));
        }

        /// <summary>
        /// Authorization API Async Method
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="version">Version 'v1' or 'v2'</param>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>Task of ApiResponse (InlineResponse200)</returns>
        private async Task<ApiResponse<InlineResponse200>> AuthPostAsync(AuthorizationVersion version, string user, string password)
        {
            // verify the required parameter 'user' is set
            if (user == null)
                throw new ApiException(400, "Missing required parameter 'user' when calling AuthApi->AuthPostAsync");

            // verify the required parameter 'password' is set
            if (password == null)
                throw new ApiException(400, "Missing required parameter 'password' when calling AuthApi->AuthPostAsync");

            string localVarPath = version == AuthorizationVersion.v1 ? "auth" : "/v2/auth";

            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(GetAuthorization(user, password)));

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath, Method.POST, null, null, localVarHeaderParams, null, null, null, null);

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("AuthPostAsync", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<InlineResponse200>((int)localVarResponse.StatusCode, localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (InlineResponse200)Configuration.ApiClient.Deserialize(localVarResponse, typeof(InlineResponse200)));
        }
    }
}
