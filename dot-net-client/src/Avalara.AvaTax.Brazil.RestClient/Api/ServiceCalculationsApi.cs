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
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PaymentTransactionOut</returns>
        public PaymentTransactionOut CalculationServicePayment(string authorization, PaymentTransactionIn body)
        {
            ApiResponse<PaymentTransactionOut> localVarResponse = CalculationServicePaymentWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PaymentTransactionOut</returns>
        public ApiResponse<PaymentTransactionOut> CalculationServicePaymentWithHttpInfo(string authorization, PaymentTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CalculationServicePayment");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CalculationServicePayment");

            var localVarPath = "/calculations/store?service-payment";
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
                Exception exception = ExceptionFactory("CalculationServicePayment", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PaymentTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PaymentTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PaymentTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PaymentTransactionOut</returns>
        public async System.Threading.Tasks.Task<PaymentTransactionOut> CalculationServicePaymentAsync(string authorization, PaymentTransactionIn body)
        {
            ApiResponse<PaymentTransactionOut> localVarResponse = await CalculationServicePaymentAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PaymentTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<PaymentTransactionOut>> CalculationServicePaymentAsyncWithHttpInfo(string authorization, PaymentTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CalculationServicePayment");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CalculationServicePayment");

            var localVarPath = "/calculations/store?service-payment";
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
                Exception exception = ExceptionFactory("CalculationServicePayment", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PaymentTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PaymentTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PaymentTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PurchaseTransactionOut</returns>
        public PurchaseTransactionOut CalculationServicePurchase(string authorization, PurchaseTransactionIn body)
        {
            ApiResponse<PurchaseTransactionOut> localVarResponse = CalculationServicePurchaseWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PurchaseTransactionOut</returns>
        public ApiResponse<PurchaseTransactionOut> CalculationServicePurchaseWithHttpInfo(string authorization, PurchaseTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CalculationServicePurchase");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CalculationServicePurchase");

            var localVarPath = "/calculations/store?service-purchase";
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
                Exception exception = ExceptionFactory("CalculationServicePurchase", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PurchaseTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PurchaseTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PurchaseTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PurchaseTransactionOut</returns>
        public async System.Threading.Tasks.Task<PurchaseTransactionOut> CalculationServicePurchaseAsync(string authorization, PurchaseTransactionIn body)
        {
            ApiResponse<PurchaseTransactionOut> localVarResponse = await CalculationServicePurchaseAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PurchaseTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<PurchaseTransactionOut>> CalculationServicePurchaseAsyncWithHttpInfo(string authorization, PurchaseTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CalculationServicePurchase");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CalculationServicePurchase");

            var localVarPath = "/calculations/store?service-purchase";
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
                Exception exception = ExceptionFactory("CalculationServicePurchase", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PurchaseTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PurchaseTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PurchaseTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ReceiptTransactionOut</returns>
        public ReceiptTransactionOut CalculationServiceReceipt(string authorization, ReceiptTransactionIn body)
        {
            ApiResponse<ReceiptTransactionOut> localVarResponse = CalculationServiceReceiptWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of ReceiptTransactionOut</returns>
        public ApiResponse<ReceiptTransactionOut> CalculationServiceReceiptWithHttpInfo(string authorization, ReceiptTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CalculationServiceReceipt");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CalculationServiceReceipt");

            var localVarPath = "/calculations/store?service-receipt";
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
                Exception exception = ExceptionFactory("CalculationServiceReceipt", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ReceiptTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (ReceiptTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(ReceiptTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ReceiptTransactionOut</returns>
        public async System.Threading.Tasks.Task<ReceiptTransactionOut> CalculationServiceReceiptAsync(string authorization, ReceiptTransactionIn body)
        {
            ApiResponse<ReceiptTransactionOut> localVarResponse = await CalculationServiceReceiptAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (ReceiptTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<ReceiptTransactionOut>> CalculationServiceReceiptAsyncWithHttpInfo(string authorization, ReceiptTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CalculationServiceReceipt");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CalculationServiceReceipt");

            var localVarPath = "/calculations/store?service-receipt";
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
                Exception exception = ExceptionFactory("CalculationServiceReceipt", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ReceiptTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (ReceiptTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(ReceiptTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>SalesTransactionOut</returns>
        public SalesTransactionOut CalculationServiceSales(string authorization, SalesTransactionIn body)
        {
            ApiResponse<SalesTransactionOut> localVarResponse = CalculationServiceSalesWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of SalesTransactionOut</returns>
        public ApiResponse<SalesTransactionOut> CalculationServiceSalesWithHttpInfo(string authorization, SalesTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CalculationServiceSales");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CalculationServiceSales");

            var localVarPath = "/calculations/store?service-sales";
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
                Exception exception = ExceptionFactory("CalculationServiceSales", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SalesTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (SalesTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(SalesTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of SalesTransactionOut</returns>
        public async System.Threading.Tasks.Task<SalesTransactionOut> CalculationServiceSalesAsync(string authorization, SalesTransactionIn body)
        {
            ApiResponse<SalesTransactionOut> localVarResponse = await CalculationServiceSalesAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (SalesTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<SalesTransactionOut>> CalculationServiceSalesAsyncWithHttpInfo(string authorization, SalesTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CalculationServiceSales");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CalculationServiceSales");

            var localVarPath = "/calculations/store?service-sales";
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
                Exception exception = ExceptionFactory("CalculationServiceSales", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SalesTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (SalesTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(SalesTransactionOut)));
        }

        /// <summary>
        /// Promote a calculation to transaction Promote a calculation to transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns></returns>
        public void ConvertServiceCalculationToTransaction(string authorization, string documentCode)
        {
            ConvertServiceCalculationToTransactionWithHttpInfo(authorization, documentCode);
        }

        /// <summary>
        /// Promote a calculation to transaction Promote a calculation to transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> ConvertServiceCalculationToTransactionWithHttpInfo(string authorization, string documentCode)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->ConvertServiceCalculationToTransaction");
            // verify the required parameter 'documentCode' is set
            if (documentCode == null)
                throw new ApiException(400, "Missing required parameter 'documentCode' when calling ServicesCalculationsApi->ConvertServiceCalculationToTransaction");

            var localVarPath = "/calculations/service/{documentCode}/transactions";
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

            if (documentCode != null) localVarPathParams.Add("documentCode", Configuration.ApiClient.ParameterToString(documentCode)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ConvertServiceCalculationToTransaction", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Promote a calculation to transaction Promote a calculation to transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task ConvertServiceCalculationToTransactionAsync(string authorization, string documentCode)
        {
            await ConvertServiceCalculationToTransactionAsyncWithHttpInfo(authorization, documentCode);

        }

        /// <summary>
        /// Promote a calculation to transaction Promote a calculation to transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> ConvertServiceCalculationToTransactionAsyncWithHttpInfo(string authorization, string documentCode)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->ConvertServiceCalculationToTransaction");
            // verify the required parameter 'documentCode' is set
            if (documentCode == null)
                throw new ApiException(400, "Missing required parameter 'documentCode' when calling ServicesCalculationsApi->ConvertServiceCalculationToTransaction");

            var localVarPath = "/calculations/service/{documentCode}/transactions";
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

            if (documentCode != null) localVarPathParams.Add("documentCode", Configuration.ApiClient.ParameterToString(documentCode)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.PUT, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("ConvertServiceCalculationToTransaction", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PaymentTransactionOut</returns>
        public PaymentTransactionOut CreateATaxTransactionServicePayment(string authorization, PaymentTransactionIn body)
        {
            ApiResponse<PaymentTransactionOut> localVarResponse = CreateATaxTransactionServicePaymentWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PaymentTransactionOut</returns>
        public ApiResponse<PaymentTransactionOut> CreateATaxTransactionServicePaymentWithHttpInfo(string authorization, PaymentTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CreateATaxTransactionServicePayment");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CreateATaxTransactionServicePayment");

            var localVarPath = "/calculations/store/transaction?service-payment";
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
                Exception exception = ExceptionFactory("CreateATaxTransactionServicePayment", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PaymentTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PaymentTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PaymentTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PaymentTransactionOut</returns>
        public async System.Threading.Tasks.Task<PaymentTransactionOut> CreateATaxTransactionServicePaymentAsync(string authorization, PaymentTransactionIn body)
        {
            ApiResponse<PaymentTransactionOut> localVarResponse = await CreateATaxTransactionServicePaymentAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PaymentTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<PaymentTransactionOut>> CreateATaxTransactionServicePaymentAsyncWithHttpInfo(string authorization, PaymentTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CreateATaxTransactionServicePayment");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CreateATaxTransactionServicePayment");

            var localVarPath = "/calculations/store/transaction?service-payment";
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
                Exception exception = ExceptionFactory("CreateATaxTransactionServicePayment", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PaymentTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PaymentTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PaymentTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PurchaseTransactionOut</returns>
        public PurchaseTransactionOut CreateATaxTransactionServicePurchase(string authorization, PurchaseTransactionIn body)
        {
            ApiResponse<PurchaseTransactionOut> localVarResponse = CreateATaxTransactionServicePurchaseWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PurchaseTransactionOut</returns>
        public ApiResponse<PurchaseTransactionOut> CreateATaxTransactionServicePurchaseWithHttpInfo(string authorization, PurchaseTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CreateATaxTransactionServicePurchase");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CreateATaxTransactionServicePurchase");

            var localVarPath = "/calculations/store/transaction?service-purchase";
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
                Exception exception = ExceptionFactory("CreateATaxTransactionServicePurchase", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PurchaseTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PurchaseTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PurchaseTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PurchaseTransactionOut</returns>
        public async System.Threading.Tasks.Task<PurchaseTransactionOut> CreateATaxTransactionServicePurchaseAsync(string authorization, PurchaseTransactionIn body)
        {
            ApiResponse<PurchaseTransactionOut> localVarResponse = await CreateATaxTransactionServicePurchaseAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PurchaseTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<PurchaseTransactionOut>> CreateATaxTransactionServicePurchaseAsyncWithHttpInfo(string authorization, PurchaseTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CreateATaxTransactionServicePurchase");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CreateATaxTransactionServicePurchase");

            var localVarPath = "/calculations/store/transaction?service-purchase";
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
                Exception exception = ExceptionFactory("CreateATaxTransactionServicePurchase", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PurchaseTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PurchaseTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PurchaseTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ReceiptTransactionOut</returns>
        public ReceiptTransactionOut CreateATaxTransactionServiceReceipt(string authorization, ReceiptTransactionIn body)
        {
            ApiResponse<ReceiptTransactionOut> localVarResponse = CreateATaxTransactionServiceReceiptWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of ReceiptTransactionOut</returns>
        public ApiResponse<ReceiptTransactionOut> CreateATaxTransactionServiceReceiptWithHttpInfo(string authorization, ReceiptTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CreateATaxTransactionServiceReceipt");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CreateATaxTransactionServiceReceipt");

            var localVarPath = "/calculations/store/transaction?service-receipt";
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
                Exception exception = ExceptionFactory("CreateATaxTransactionServiceReceipt", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ReceiptTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (ReceiptTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(ReceiptTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ReceiptTransactionOut</returns>
        public async System.Threading.Tasks.Task<ReceiptTransactionOut> CreateATaxTransactionServiceReceiptAsync(string authorization, ReceiptTransactionIn body)
        {
            ApiResponse<ReceiptTransactionOut> localVarResponse = await CreateATaxTransactionServiceReceiptAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (ReceiptTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<ReceiptTransactionOut>> CreateATaxTransactionServiceReceiptAsyncWithHttpInfo(string authorization, ReceiptTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CreateATaxTransactionServiceReceipt");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CreateATaxTransactionServiceReceipt");

            var localVarPath = "/calculations/store/transaction?service-receipt";
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
                Exception exception = ExceptionFactory("CreateATaxTransactionServiceReceipt", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ReceiptTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (ReceiptTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(ReceiptTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>SalesTransactionOut</returns>
        public SalesTransactionOut CreateATaxTransactionServiceSales(string authorization, SalesTransactionIn body)
        {
            ApiResponse<SalesTransactionOut> localVarResponse = CreateATaxTransactionServiceSalesWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of SalesTransactionOut</returns>
        public ApiResponse<SalesTransactionOut> CreateATaxTransactionServiceSalesWithHttpInfo(string authorization, SalesTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CreateATaxTransactionServiceSales");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CreateATaxTransactionServiceSales");

            var localVarPath = "/calculations/store/transaction?service-sales";
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
                Exception exception = ExceptionFactory("CreateATaxTransactionServiceSales", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SalesTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (SalesTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(SalesTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of SalesTransactionOut</returns>
        public async System.Threading.Tasks.Task<SalesTransactionOut> CreateATaxTransactionServiceSalesAsync(string authorization, SalesTransactionIn body)
        {
            ApiResponse<SalesTransactionOut> localVarResponse = await CreateATaxTransactionServiceSalesAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (SalesTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<SalesTransactionOut>> CreateATaxTransactionServiceSalesAsyncWithHttpInfo(string authorization, SalesTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->CreateATaxTransactionServiceSales");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->CreateATaxTransactionServiceSales");

            var localVarPath = "/calculations/store/transaction?service-sales";
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
                Exception exception = ExceptionFactory("CreateATaxTransactionServiceSales", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SalesTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (SalesTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(SalesTransactionOut)));
        }

        /// <summary>
        /// Remove service transactions Remove a single transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns></returns>
        public void RemoveServiceTransactionDocument(string authorization, string documentCode)
        {
            RemoveServiceTransactionDocumentWithHttpInfo(authorization, documentCode);
        }

        /// <summary>
        /// Remove service transactions Remove a single transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> RemoveServiceTransactionDocumentWithHttpInfo(string authorization, string documentCode)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->RemoveServiceTransactionDocument");
            // verify the required parameter 'documentCode' is set
            if (documentCode == null)
                throw new ApiException(400, "Missing required parameter 'documentCode' when calling ServicesCalculationsApi->RemoveServiceTransactionDocument");

            var localVarPath = "/calculations/service/{documentCode}";
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

            if (documentCode != null) localVarPathParams.Add("documentCode", Configuration.ApiClient.ParameterToString(documentCode)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RemoveServiceTransactionDocument", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Remove service transactions Remove a single transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task RemoveServiceTransactionDocumentAsync(string authorization, string documentCode)
        {
            await RemoveServiceTransactionDocumentAsyncWithHttpInfo(authorization, documentCode);

        }

        /// <summary>
        /// Remove service transactions Remove a single transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> RemoveServiceTransactionDocumentAsyncWithHttpInfo(string authorization, string documentCode)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->RemoveServiceTransactionDocument");
            // verify the required parameter 'documentCode' is set
            if (documentCode == null)
                throw new ApiException(400, "Missing required parameter 'documentCode' when calling ServicesCalculationsApi->RemoveServiceTransactionDocument");

            var localVarPath = "/calculations/service/{documentCode}";
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

            if (documentCode != null) localVarPathParams.Add("documentCode", Configuration.ApiClient.ParameterToString(documentCode)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.DELETE, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RemoveServiceTransactionDocument", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Retrieve service transactions Retrieve a list of transactions
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="type">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns></returns>
        public void RetrieveServiceCalculationTransactions(string authorization, string type)
        {
            RetrieveServiceCalculationTransactionsWithHttpInfo(authorization, type);
        }

        /// <summary>
        /// Retrieve service transactions Retrieve a list of transactions
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="type">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> RetrieveServiceCalculationTransactionsWithHttpInfo(string authorization, string type)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->RetrieveServiceCalculationTransactions");
            // verify the required parameter 'type' is set
            if (type == null)
                throw new ApiException(400, "Missing required parameter 'type' when calling ServicesCalculationsApi->RetrieveServiceCalculationTransactions");

            var localVarPath = "/calculations/service";
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

            if (type != null) localVarQueryParams.Add("type", Configuration.ApiClient.ParameterToString(type)); // query parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RetrieveServiceCalculationTransactions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Retrieve service transactions Retrieve a list of transactions
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="type">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task RetrieveServiceCalculationTransactionsAsync(string authorization, string type)
        {
            await RetrieveServiceCalculationTransactionsAsyncWithHttpInfo(authorization, type);

        }

        /// <summary>
        /// Retrieve service transactions Retrieve a list of transactions
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="type">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> RetrieveServiceCalculationTransactionsAsyncWithHttpInfo(string authorization, string type)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->RetrieveServiceCalculationTransactions");
            // verify the required parameter 'type' is set
            if (type == null)
                throw new ApiException(400, "Missing required parameter 'type' when calling ServicesCalculationsApi->RetrieveServiceCalculationTransactions");

            var localVarPath = "/calculations/service";
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

            if (type != null) localVarQueryParams.Add("type", Configuration.ApiClient.ParameterToString(type)); // query parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RetrieveServiceCalculationTransactions", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Retrieve service transactions Retrieve a single transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns></returns>
        public void RetrieveServiceTransactionDocument(string authorization, string documentCode)
        {
            RetrieveServiceTransactionDocumentWithHttpInfo(authorization, documentCode);
        }

        /// <summary>
        /// Retrieve service transactions Retrieve a single transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> RetrieveServiceTransactionDocumentWithHttpInfo(string authorization, string documentCode)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->RetrieveServiceTransactionDocument");
            // verify the required parameter 'documentCode' is set
            if (documentCode == null)
                throw new ApiException(400, "Missing required parameter 'documentCode' when calling ServicesCalculationsApi->RetrieveServiceTransactionDocument");

            var localVarPath = "/calculations/service/{documentCode}";
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

            if (documentCode != null) localVarPathParams.Add("documentCode", Configuration.ApiClient.ParameterToString(documentCode)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RetrieveServiceTransactionDocument", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Retrieve service transactions Retrieve a single transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task RetrieveServiceTransactionDocumentAsync(string authorization, string documentCode)
        {
            await RetrieveServiceTransactionDocumentAsyncWithHttpInfo(authorization, documentCode);

        }

        /// <summary>
        /// Retrieve service transactions Retrieve a single transaction
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> RetrieveServiceTransactionDocumentAsyncWithHttpInfo(string authorization, string documentCode)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->RetrieveServiceTransactionDocument");
            // verify the required parameter 'documentCode' is set
            if (documentCode == null)
                throw new ApiException(400, "Missing required parameter 'documentCode' when calling ServicesCalculationsApi->RetrieveServiceTransactionDocument");

            var localVarPath = "/calculations/service/{documentCode}";
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

            if (documentCode != null) localVarPathParams.Add("documentCode", Configuration.ApiClient.ParameterToString(documentCode)); // path parameter
            if (authorization != null) localVarHeaderParams.Add("Authorization", Configuration.ApiClient.ParameterToString(authorization)); // header parameter


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse)await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int)localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("RetrieveServiceTransactionDocument", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PaymentTransactionOut</returns>
        public PaymentTransactionOut SimulateServicePayment(string authorization, PaymentTransactionIn body)
        {
            ApiResponse<PaymentTransactionOut> localVarResponse = SimulateServicePaymentWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PaymentTransactionOut</returns>
        public ApiResponse<PaymentTransactionOut> SimulateServicePaymentWithHttpInfo(string authorization, PaymentTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->SimulateServicePayment");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->SimulateServicePayment");

            var localVarPath = "/calculations?service-payment";
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
                Exception exception = ExceptionFactory("SimulateServicePayment", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PaymentTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PaymentTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PaymentTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PaymentTransactionOut</returns>
        public async System.Threading.Tasks.Task<PaymentTransactionOut> SimulateServicePaymentAsync(string authorization, PaymentTransactionIn body)
        {
            ApiResponse<PaymentTransactionOut> localVarResponse = await SimulateServicePaymentAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PaymentTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<PaymentTransactionOut>> SimulateServicePaymentAsyncWithHttpInfo(string authorization, PaymentTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->SimulateServicePayment");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->SimulateServicePayment");

            var localVarPath = "/calculations?service-payment";
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
                Exception exception = ExceptionFactory("SimulateServicePayment", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PaymentTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PaymentTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PaymentTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PurchaseTransactionOut</returns>
        public PurchaseTransactionOut SimulateServicePurchase(string authorization, PurchaseTransactionIn body)
        {
            ApiResponse<PurchaseTransactionOut> localVarResponse = SimulateServicePurchaseWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PurchaseTransactionOut</returns>
        public ApiResponse<PurchaseTransactionOut> SimulateServicePurchaseWithHttpInfo(string authorization, PurchaseTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->SimulateServicePurchase");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->SimulateServicePurchase");

            var localVarPath = "/calculations?service-purchase";
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
                Exception exception = ExceptionFactory("SimulateServicePurchase", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PurchaseTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PurchaseTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PurchaseTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PurchaseTransactionOut</returns>
        public async System.Threading.Tasks.Task<PurchaseTransactionOut> SimulateServicePurchaseAsync(string authorization, PurchaseTransactionIn body)
        {
            ApiResponse<PurchaseTransactionOut> localVarResponse = await SimulateServicePurchaseAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PurchaseTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<PurchaseTransactionOut>> SimulateServicePurchaseAsyncWithHttpInfo(string authorization, PurchaseTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->SimulateServicePurchase");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->SimulateServicePurchase");

            var localVarPath = "/calculations?service-purchase";
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
                Exception exception = ExceptionFactory("SimulateServicePurchase", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<PurchaseTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (PurchaseTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(PurchaseTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ReceiptTransactionOut</returns>
        public ReceiptTransactionOut SimulateServiceReceipt(string authorization, ReceiptTransactionIn body)
        {
            ApiResponse<ReceiptTransactionOut> localVarResponse = SimulateServiceReceiptWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of ReceiptTransactionOut</returns>
        public ApiResponse<ReceiptTransactionOut> SimulateServiceReceiptWithHttpInfo(string authorization, ReceiptTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->SimulateServiceReceipt");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->SimulateServiceReceipt");

            var localVarPath = "/calculations?service-receipt";
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
                Exception exception = ExceptionFactory("SimulateServiceReceipt", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ReceiptTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (ReceiptTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(ReceiptTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ReceiptTransactionOut</returns>
        public async System.Threading.Tasks.Task<ReceiptTransactionOut> SimulateServiceReceiptAsync(string authorization, ReceiptTransactionIn body)
        {
            ApiResponse<ReceiptTransactionOut> localVarResponse = await SimulateServiceReceiptAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (ReceiptTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<ReceiptTransactionOut>> SimulateServiceReceiptAsyncWithHttpInfo(string authorization, ReceiptTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->SimulateServiceReceipt");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->SimulateServiceReceipt");

            var localVarPath = "/calculations?service-receipt";
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
                Exception exception = ExceptionFactory("SimulateServiceReceipt", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<ReceiptTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (ReceiptTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(ReceiptTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>SalesTransactionOut</returns>
        public SalesTransactionOut SimulateServiceSales(string authorization, SalesTransactionIn body)
        {
            ApiResponse<SalesTransactionOut> localVarResponse = SimulateServiceSalesWithHttpInfo(authorization, body);
            return localVarResponse.Data;
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of SalesTransactionOut</returns>
        public ApiResponse<SalesTransactionOut> SimulateServiceSalesWithHttpInfo(string authorization, SalesTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->SimulateServiceSales");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->SimulateServiceSales");

            var localVarPath = "/calculations?service-sales";
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
                Exception exception = ExceptionFactory("SimulateServiceSales", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SalesTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (SalesTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(SalesTransactionOut)));
        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of SalesTransactionOut</returns>
        public async System.Threading.Tasks.Task<SalesTransactionOut> SimulateServiceSalesAsync(string authorization, SalesTransactionIn body)
        {
            ApiResponse<SalesTransactionOut> localVarResponse = await SimulateServiceSalesAsyncWithHttpInfo(authorization, body);
            return localVarResponse.Data;

        }

        /// <summary>
        /// Calculation Method Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (SalesTransactionOut)</returns>
        public async System.Threading.Tasks.Task<ApiResponse<SalesTransactionOut>> SimulateServiceSalesAsyncWithHttpInfo(string authorization, SalesTransactionIn body)
        {
            // verify the required parameter 'authorization' is set
            if (authorization == null)
                throw new ApiException(400, "Missing required parameter 'authorization' when calling ServicesCalculationsApi->SimulateServiceSales");
            // verify the required parameter 'body' is set
            if (body == null)
                throw new ApiException(400, "Missing required parameter 'body' when calling ServicesCalculationsApi->SimulateServiceSales");

            var localVarPath = "/calculations?service-sales";
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
                Exception exception = ExceptionFactory("SimulateServiceSales", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<SalesTransactionOut>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                (SalesTransactionOut)Configuration.ApiClient.Deserialize(localVarResponse, typeof(SalesTransactionOut)));
        }

    }
}
