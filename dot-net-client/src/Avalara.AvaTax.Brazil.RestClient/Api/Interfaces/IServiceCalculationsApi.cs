using Avalara.AvaTax.Brazil.RestClient.Client;
using Avalara.AvaTax.Brazil.RestClient.Model;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Api.Interfaces
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IServiceCalculationsApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PaymentTransactionOut</returns>
        PaymentTransactionOut CalculationServicePayment(string authorization, PaymentTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PaymentTransactionOut</returns>
        ApiResponse<PaymentTransactionOut> CalculationServicePaymentWithHttpInfo(string authorization, PaymentTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PurchaseTransactionOut</returns>
        PurchaseTransactionOut CalculationServicePurchase(string authorization, PurchaseTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PurchaseTransactionOut</returns>
        ApiResponse<PurchaseTransactionOut> CalculationServicePurchaseWithHttpInfo(string authorization, PurchaseTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ReceiptTransactionOut</returns>
        ReceiptTransactionOut CalculationServiceReceipt(string authorization, ReceiptTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of ReceiptTransactionOut</returns>
        ApiResponse<ReceiptTransactionOut> CalculationServiceReceiptWithHttpInfo(string authorization, ReceiptTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>SalesTransactionOut</returns>
        SalesTransactionOut CalculationServiceSales(string authorization, SalesTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of SalesTransactionOut</returns>
        ApiResponse<SalesTransactionOut> CalculationServiceSalesWithHttpInfo(string authorization, SalesTransactionIn body);
        /// <summary>
        /// Promote a calculation to transaction
        /// </summary>
        /// <remarks>
        /// Promote a calculation to transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns></returns>
        void ConvertServiceCalculationToTransaction(string authorization, string documentCode);

        /// <summary>
        /// Promote a calculation to transaction
        /// </summary>
        /// <remarks>
        /// Promote a calculation to transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<object> ConvertServiceCalculationToTransactionWithHttpInfo(string authorization, string documentCode);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PaymentTransactionOut</returns>
        PaymentTransactionOut CreateATaxTransactionServicePayment(string authorization, PaymentTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PaymentTransactionOut</returns>
        ApiResponse<PaymentTransactionOut> CreateATaxTransactionServicePaymentWithHttpInfo(string authorization, PaymentTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PurchaseTransactionOut</returns>
        PurchaseTransactionOut CreateATaxTransactionServicePurchase(string authorization, PurchaseTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PurchaseTransactionOut</returns>
        ApiResponse<PurchaseTransactionOut> CreateATaxTransactionServicePurchaseWithHttpInfo(string authorization, PurchaseTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ReceiptTransactionOut</returns>
        ReceiptTransactionOut CreateATaxTransactionServiceReceipt(string authorization, ReceiptTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of ReceiptTransactionOut</returns>
        ApiResponse<ReceiptTransactionOut> CreateATaxTransactionServiceReceiptWithHttpInfo(string authorization, ReceiptTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>SalesTransactionOut</returns>
        SalesTransactionOut CreateATaxTransactionServiceSales(string authorization, SalesTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of SalesTransactionOut</returns>
        ApiResponse<SalesTransactionOut> CreateATaxTransactionServiceSalesWithHttpInfo(string authorization, SalesTransactionIn body);
        /// <summary>
        /// Remove service transactions
        /// </summary>
        /// <remarks>
        /// Remove a single transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns></returns>
        void RemoveServiceTransactionDocument(string authorization, string documentCode);

        /// <summary>
        /// Remove service transactions
        /// </summary>
        /// <remarks>
        /// Remove a single transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<object> RemoveServiceTransactionDocumentWithHttpInfo(string authorization, string documentCode);
        /// <summary>
        /// Retrieve service transactions
        /// </summary>
        /// <remarks>
        /// Retrieve a list of transactions
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="type">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns></returns>
        void RetrieveServiceCalculationTransactions(string authorization, string type);

        /// <summary>
        /// Retrieve service transactions
        /// </summary>
        /// <remarks>
        /// Retrieve a list of transactions
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="type">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<object> RetrieveServiceCalculationTransactionsWithHttpInfo(string authorization, string type);
        /// <summary>
        /// Retrieve service transactions
        /// </summary>
        /// <remarks>
        /// Retrieve a single transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns></returns>
        void RetrieveServiceTransactionDocument(string authorization, string documentCode);

        /// <summary>
        /// Retrieve service transactions
        /// </summary>
        /// <remarks>
        /// Retrieve a single transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<object> RetrieveServiceTransactionDocumentWithHttpInfo(string authorization, string documentCode);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PaymentTransactionOut</returns>
        PaymentTransactionOut SimulateServicePayment(string authorization, PaymentTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PaymentTransactionOut</returns>
        ApiResponse<PaymentTransactionOut> SimulateServicePaymentWithHttpInfo(string authorization, PaymentTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>PurchaseTransactionOut</returns>
        PurchaseTransactionOut SimulateServicePurchase(string authorization, PurchaseTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of PurchaseTransactionOut</returns>
        ApiResponse<PurchaseTransactionOut> SimulateServicePurchaseWithHttpInfo(string authorization, PurchaseTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ReceiptTransactionOut</returns>
        ReceiptTransactionOut SimulateServiceReceipt(string authorization, ReceiptTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of ReceiptTransactionOut</returns>
        ApiResponse<ReceiptTransactionOut> SimulateServiceReceiptWithHttpInfo(string authorization, ReceiptTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>SalesTransactionOut</returns>
        SalesTransactionOut SimulateServiceSales(string authorization, SalesTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of SalesTransactionOut</returns>
        ApiResponse<SalesTransactionOut> SimulateServiceSalesWithHttpInfo(string authorization, SalesTransactionIn body);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PaymentTransactionOut</returns>
        System.Threading.Tasks.Task<PaymentTransactionOut> CalculationServicePaymentAsync(string authorization, PaymentTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PaymentTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<PaymentTransactionOut>> CalculationServicePaymentAsyncWithHttpInfo(string authorization, PaymentTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PurchaseTransactionOut</returns>
        System.Threading.Tasks.Task<PurchaseTransactionOut> CalculationServicePurchaseAsync(string authorization, PurchaseTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PurchaseTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<PurchaseTransactionOut>> CalculationServicePurchaseAsyncWithHttpInfo(string authorization, PurchaseTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ReceiptTransactionOut</returns>
        System.Threading.Tasks.Task<ReceiptTransactionOut> CalculationServiceReceiptAsync(string authorization, ReceiptTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (ReceiptTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<ReceiptTransactionOut>> CalculationServiceReceiptAsyncWithHttpInfo(string authorization, ReceiptTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of SalesTransactionOut</returns>
        System.Threading.Tasks.Task<SalesTransactionOut> CalculationServiceSalesAsync(string authorization, SalesTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (SalesTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<SalesTransactionOut>> CalculationServiceSalesAsyncWithHttpInfo(string authorization, SalesTransactionIn body);
        /// <summary>
        /// Promote a calculation to transaction
        /// </summary>
        /// <remarks>
        /// Promote a calculation to transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task ConvertServiceCalculationToTransactionAsync(string authorization, string documentCode);

        /// <summary>
        /// Promote a calculation to transaction
        /// </summary>
        /// <remarks>
        /// Promote a calculation to transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<object>> ConvertServiceCalculationToTransactionAsyncWithHttpInfo(string authorization, string documentCode);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PaymentTransactionOut</returns>
        System.Threading.Tasks.Task<PaymentTransactionOut> CreateATaxTransactionServicePaymentAsync(string authorization, PaymentTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PaymentTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<PaymentTransactionOut>> CreateATaxTransactionServicePaymentAsyncWithHttpInfo(string authorization, PaymentTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PurchaseTransactionOut</returns>
        System.Threading.Tasks.Task<PurchaseTransactionOut> CreateATaxTransactionServicePurchaseAsync(string authorization, PurchaseTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PurchaseTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<PurchaseTransactionOut>> CreateATaxTransactionServicePurchaseAsyncWithHttpInfo(string authorization, PurchaseTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ReceiptTransactionOut</returns>
        System.Threading.Tasks.Task<ReceiptTransactionOut> CreateATaxTransactionServiceReceiptAsync(string authorization, ReceiptTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (ReceiptTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<ReceiptTransactionOut>> CreateATaxTransactionServiceReceiptAsyncWithHttpInfo(string authorization, ReceiptTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of SalesTransactionOut</returns>
        System.Threading.Tasks.Task<SalesTransactionOut> CreateATaxTransactionServiceSalesAsync(string authorization, SalesTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (SalesTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<SalesTransactionOut>> CreateATaxTransactionServiceSalesAsyncWithHttpInfo(string authorization, SalesTransactionIn body);
        /// <summary>
        /// Remove service transactions
        /// </summary>
        /// <remarks>
        /// Remove a single transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task RemoveServiceTransactionDocumentAsync(string authorization, string documentCode);

        /// <summary>
        /// Remove service transactions
        /// </summary>
        /// <remarks>
        /// Remove a single transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<object>> RemoveServiceTransactionDocumentAsyncWithHttpInfo(string authorization, string documentCode);
        /// <summary>
        /// Retrieve service transactions
        /// </summary>
        /// <remarks>
        /// Retrieve a list of transactions
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="type">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task RetrieveServiceCalculationTransactionsAsync(string authorization, string type);

        /// <summary>
        /// Retrieve service transactions
        /// </summary>
        /// <remarks>
        /// Retrieve a list of transactions
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="type">Transaction Type (sale, purchase, receipts or payment)</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<object>> RetrieveServiceCalculationTransactionsAsyncWithHttpInfo(string authorization, string type);
        /// <summary>
        /// Retrieve service transactions
        /// </summary>
        /// <remarks>
        /// Retrieve a single transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task RetrieveServiceTransactionDocumentAsync(string authorization, string documentCode);

        /// <summary>
        /// Retrieve service transactions
        /// </summary>
        /// <remarks>
        /// Retrieve a single transaction
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="documentCode">Document Code</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<object>> RetrieveServiceTransactionDocumentAsyncWithHttpInfo(string authorization, string documentCode);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PaymentTransactionOut</returns>
        System.Threading.Tasks.Task<PaymentTransactionOut> SimulateServicePaymentAsync(string authorization, PaymentTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PaymentTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<PaymentTransactionOut>> SimulateServicePaymentAsyncWithHttpInfo(string authorization, PaymentTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of PurchaseTransactionOut</returns>
        System.Threading.Tasks.Task<PurchaseTransactionOut> SimulateServicePurchaseAsync(string authorization, PurchaseTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (PurchaseTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<PurchaseTransactionOut>> SimulateServicePurchaseAsyncWithHttpInfo(string authorization, PurchaseTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ReceiptTransactionOut</returns>
        System.Threading.Tasks.Task<ReceiptTransactionOut> SimulateServiceReceiptAsync(string authorization, ReceiptTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (ReceiptTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<ReceiptTransactionOut>> SimulateServiceReceiptAsyncWithHttpInfo(string authorization, ReceiptTransactionIn body);
        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of SalesTransactionOut</returns>
        System.Threading.Tasks.Task<SalesTransactionOut> SimulateServiceSalesAsync(string authorization, SalesTransactionIn body);

        /// <summary>
        /// Calculation Method
        /// </summary>
        /// <remarks>
        /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (SalesTransactionOut)</returns>
        System.Threading.Tasks.Task<ApiResponse<SalesTransactionOut>> SimulateServiceSalesAsyncWithHttpInfo(string authorization, SalesTransactionIn body);
        #endregion Asynchronous Operations
    }
}
