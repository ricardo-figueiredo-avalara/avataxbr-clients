using Avalara.AvaTax.Brazil.RestClient.Api.Interfaces;
using Avalara.AvaTax.Brazil.RestClient.Client;
using Avalara.AvaTax.Brazil.RestClient.Model;
using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using RestSharp;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class ServiceCalculationsApi : IServiceCalculationsApi
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
        /// Initializes a new instance of the <see cref="ServiceCalculationsApi"/> class.
        /// </summary>
        public ServiceCalculationsApi(String basePath)
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
        /// <param name="token">Token</param>
        /// <returns>Authorization Token 'Bearer {token}'</returns>
        private string GetAuthorization(string token)
        {
            return AuthorizationType.Bearer + " " + token;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="token">Token</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PurchaseTransactionOut</returns>
        public ApiResponse<PurchaseTransactionOut> CalculationsServicePurchasePost(string token, PurchaseTransactionIn body)
        {
            // verify the required parameter 'token' is set
            if (token == null)
                throw new ApiException(400, "Missing required parameter 'token' when calling ServiceCalculationsApi->CalculationsServicePurchasePost");
            
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServiceCalculationsApi->CalculationsServicePurchasePost");

            string localVarPath = "/calculations?service-purchase";
            string localVarPostBody = Configuration.ApiClient.Serialize(body);

            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(GetAuthorization(token)));

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath, Method.POST, null, localVarPostBody, localVarHeaderParams, null, null, null, null);

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CalculationsservicePurchasePost", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PurchaseTransactionOut>((int)localVarResponse.StatusCode, localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PurchaseTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PurchaseTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="token">Token</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PurchaseTransactionOut)</returns>
        public async Task<ApiResponse<PurchaseTransactionOut>> CalculationsServicePurchasePostAsync(string token, PurchaseTransactionIn body)
        {
            // verify the required parameter 'token' is set
            if (token == null)
                throw new ApiException(400, "Missing required parameter 'token' when calling ServiceCalculationsApi->CalculationsServicePurchasePost");

            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServiceCalculationsApi->CalculationsservicePurchasePost");

            string localVarPath = "/calculations?service-purchase";
            string localVarPostBody = Configuration.ApiClient.Serialize(body);

            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(GetAuthorization(token)));

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath, Method.POST, null, localVarPostBody, localVarHeaderParams, null, null, null, null);

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("CalculationsservicePurchasePost", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PurchaseTransactionOut>((int)localVarResponse.StatusCode, localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PurchaseTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PurchaseTransactionOut)));
        }
    }
}
