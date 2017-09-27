using Avalara.AvaTax.Brazil.RestClient.Client;
using Avalara.AvaTax.Brazil.RestClient.Model;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Api.Interfaces
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAuthApi : IApiAccessor
    {
        /// <summary>
        /// Authorization API Method
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>ApiResponse of InlineResponse200</returns>
        ApiResponse<InlineResponse200> AuthPostV1(string user, string password);

        /// <summary>
        /// Authorization V2 API Method
        /// </summary>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>ApiResponse of InlineResponse200</returns>
        ApiResponse<InlineResponse200> AuthPostV2(string user, string password);

        /// <summary>
        /// Authorization API Async Method
        /// </summary>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>Task of ApiResponse (InlineResponse200)</returns>
        Task<ApiResponse<InlineResponse200>> AuthPostAsyncV1(string user, string password);

        /// <summary>
        /// Authorization V2 API Async Method
        /// </summary>
        /// <param name="user">User</param>
        /// <param name="password">Password</param>
        /// <returns>Task of ApiResponse (InlineResponse200)</returns>
        Task<ApiResponse<InlineResponse200>> AuthPostAsyncV2(string user, string password);
    }
}
