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
        ApiResponse<PurchaseTransactionOut> CalculationsServicePurchasePost(string authorization, PurchaseTransactionIn body);

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
        Task<ApiResponse<PurchaseTransactionOut>> CalculationsServicePurchasePostAsync(string authorization, PurchaseTransactionIn body);
    }
}
