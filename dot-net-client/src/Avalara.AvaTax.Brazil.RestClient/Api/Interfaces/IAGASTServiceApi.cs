using Avalara.AvaTax.Brazil.RestClient.Client;
using Avalara.AvaTax.Brazil.RestClient.Model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Api.Interfaces
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IAGASTServiceApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Create agast
        /// </summary>
        /// <remarks>
        /// This method operation create a AGAST 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>InlineResponse201</returns>
        InlineResponse201 CreateAgastService(string authorization, AgastService body);

        /// <summary>
        /// Create agast
        /// </summary>
        /// <remarks>
        /// This method operation create a AGAST 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of InlineResponse201</returns>
        ApiResponse<InlineResponse201> CreateAgastServiceWithHttpInfo(string authorization, AgastService body);
        /// <summary>
        /// Delete Agast
        /// </summary>
        /// <remarks>
        /// Delete Agast
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns></returns>
        void DeleteAgastService(string authorization, string code);

        /// <summary>
        /// Delete Agast
        /// </summary>
        /// <remarks>
        /// Delete Agast
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> DeleteAgastServiceWithHttpInfo(string authorization, string code);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// This operation return agast configurations that match with parameters queries 
        /// </remarks>
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
        List<InlineResponse2001> GetAgastListService(string authorization, string text = null, string hscode = null, string whPIS = null, string whCOFINS = null, string whCSLL = null, string whIRRF = null, string whINSS = null);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// This operation return agast configurations that match with parameters queries 
        /// </remarks>
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
        ApiResponse<List<InlineResponse2001>> GetAgastListServiceWithHttpInfo(string authorization, string text = null, string hscode = null, string whPIS = null, string whCOFINS = null, string whCSLL = null, string whIRRF = null, string whINSS = null);
        /// <summary>
        /// Get agast
        /// </summary>
        /// <remarks>
        /// This operation return agast configurations that match with parameters queries 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>AgastService</returns>
        AgastService GetAgastService(string authorization, string code);

        /// <summary>
        /// Get agast
        /// </summary>
        /// <remarks>
        /// This operation return agast configurations that match with parameters queries 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>ApiResponse of AgastService</returns>
        ApiResponse<AgastService> GetAgastServiceWithHttpInfo(string authorization, string code);
        /// <summary>
        /// Find Equivalent AGAST
        /// </summary>
        /// <remarks>
        /// This operation returns List of IssConfService from City To that have same Service Agast of serviceCodeFrom if cityFrom and serviceCodeFrom. If not Mapped return List with zero elements. 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="from">City IBGE Code - From</param>
        /// <param name="to">City IBGE Code - To</param>
        /// <param name="service">Service Code in City From</param>
        /// <returns>List<AgastServiceOperationsItem></returns>
        List<AgastServiceOperationsItem> GetAgastServiceEquivalent(string authorization, string from, string to, string service);

        /// <summary>
        /// Find Equivalent AGAST
        /// </summary>
        /// <remarks>
        /// This operation returns List of IssConfService from City To that have same Service Agast of serviceCodeFrom if cityFrom and serviceCodeFrom. If not Mapped return List with zero elements. 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="from">City IBGE Code - From</param>
        /// <param name="to">City IBGE Code - To</param>
        /// <param name="service">Service Code in City From</param>
        /// <returns>ApiResponse of List<AgastServiceOperationsItem></returns>
        ApiResponse<List<AgastServiceOperationsItem>> GetAgastServiceEquivalentWithHttpInfo(string authorization, string from, string to, string service);
        /// <summary>
        /// Find AGAST by LC116
        /// </summary>
        /// <remarks>
        /// This operation returns List of IssConfService from city to that have Service Agast with LC116 informed code. 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="city">City IBGE Code</param>
        /// <param name="code">LC116 Code</param>
        /// <returns>List<AgastServiceOperationsItem></returns>
        List<AgastServiceOperationsItem> GetAgastServiceLC116(string authorization, string city, string code);

        /// <summary>
        /// Find AGAST by LC116
        /// </summary>
        /// <remarks>
        /// This operation returns List of IssConfService from city to that have Service Agast with LC116 informed code. 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="city">City IBGE Code</param>
        /// <param name="code">LC116 Code</param>
        /// <returns>ApiResponse of List<AgastServiceOperationsItem></returns>
        ApiResponse<List<AgastServiceOperationsItem>> GetAgastServiceLC116WithHttpInfo(string authorization, string city, string code);
        /// <summary>
        /// Update agast
        /// </summary>
        /// <remarks>
        /// This method operation create a agast 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns></returns>
        void UpdateAgastService(string authorization, string code, AgastService body);

        /// <summary>
        /// Update agast
        /// </summary>
        /// <remarks>
        /// This method operation create a agast 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> UpdateAgastServiceWithHttpInfo(string authorization, string code, AgastService body);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Create agast
        /// </summary>
        /// <remarks>
        /// This method operation create a AGAST 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of InlineResponse201</returns>
        System.Threading.Tasks.Task<InlineResponse201> CreateAgastServiceAsync(string authorization, AgastService body);

        /// <summary>
        /// Create agast
        /// </summary>
        /// <remarks>
        /// This method operation create a AGAST 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse (InlineResponse201)</returns>
        System.Threading.Tasks.Task<ApiResponse<InlineResponse201>> CreateAgastServiceAsyncWithHttpInfo(string authorization, AgastService body);
        /// <summary>
        /// Delete Agast
        /// </summary>
        /// <remarks>
        /// Delete Agast
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task DeleteAgastServiceAsync(string authorization, string code);

        /// <summary>
        /// Delete Agast
        /// </summary>
        /// <remarks>
        /// Delete Agast
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> DeleteAgastServiceAsyncWithHttpInfo(string authorization, string code);
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// This operation return agast configurations that match with parameters queries 
        /// </remarks>
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
        System.Threading.Tasks.Task<List<InlineResponse2001>> GetAgastListServiceAsync(string authorization, string text = null, string hscode = null, string whPIS = null, string whCOFINS = null, string whCSLL = null, string whIRRF = null, string whINSS = null);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// This operation return agast configurations that match with parameters queries 
        /// </remarks>
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
        System.Threading.Tasks.Task<ApiResponse<List<InlineResponse2001>>> GetAgastListServiceAsyncWithHttpInfo(string authorization, string text = null, string hscode = null, string whPIS = null, string whCOFINS = null, string whCSLL = null, string whIRRF = null, string whINSS = null);
        /// <summary>
        /// Get agast
        /// </summary>
        /// <remarks>
        /// This operation return agast configurations that match with parameters queries 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>Task of AgastService</returns>
        System.Threading.Tasks.Task<AgastService> GetAgastServiceAsync(string authorization, string code);

        /// <summary>
        /// Get agast
        /// </summary>
        /// <remarks>
        /// This operation return agast configurations that match with parameters queries 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <returns>Task of ApiResponse (AgastService)</returns>
        System.Threading.Tasks.Task<ApiResponse<AgastService>> GetAgastServiceAsyncWithHttpInfo(string authorization, string code);
        /// <summary>
        /// Find Equivalent AGAST
        /// </summary>
        /// <remarks>
        /// This operation returns List of IssConfService from City To that have same Service Agast of serviceCodeFrom if cityFrom and serviceCodeFrom. If not Mapped return List with zero elements. 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="from">City IBGE Code - From</param>
        /// <param name="to">City IBGE Code - To</param>
        /// <param name="service">Service Code in City From</param>
        /// <returns>Task of List<AgastServiceOperationsItem></returns>
        System.Threading.Tasks.Task<List<AgastServiceOperationsItem>> GetAgastServiceEquivalentAsync(string authorization, string from, string to, string service);

        /// <summary>
        /// Find Equivalent AGAST
        /// </summary>
        /// <remarks>
        /// This operation returns List of IssConfService from City To that have same Service Agast of serviceCodeFrom if cityFrom and serviceCodeFrom. If not Mapped return List with zero elements. 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="from">City IBGE Code - From</param>
        /// <param name="to">City IBGE Code - To</param>
        /// <param name="service">Service Code in City From</param>
        /// <returns>Task of ApiResponse (List<AgastServiceOperationsItem>)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<AgastServiceOperationsItem>>> GetAgastServiceEquivalentAsyncWithHttpInfo(string authorization, string from, string to, string service);
        /// <summary>
        /// Find AGAST by LC116
        /// </summary>
        /// <remarks>
        /// This operation returns List of IssConfService from city to that have Service Agast with LC116 informed code. 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="city">City IBGE Code</param>
        /// <param name="code">LC116 Code</param>
        /// <returns>Task of List<AgastServiceOperationsItem></returns>
        System.Threading.Tasks.Task<List<AgastServiceOperationsItem>> GetAgastServiceLC116Async(string authorization, string city, string code);

        /// <summary>
        /// Find AGAST by LC116
        /// </summary>
        /// <remarks>
        /// This operation returns List of IssConfService from city to that have Service Agast with LC116 informed code. 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="city">City IBGE Code</param>
        /// <param name="code">LC116 Code</param>
        /// <returns>Task of ApiResponse (List<AgastServiceOperationsItem>)</returns>
        System.Threading.Tasks.Task<ApiResponse<List<AgastServiceOperationsItem>>> GetAgastServiceLC116AsyncWithHttpInfo(string authorization, string city, string code);
        /// <summary>
        /// Update agast
        /// </summary>
        /// <remarks>
        /// This method operation create a agast 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task UpdateAgastServiceAsync(string authorization, string code, AgastService body);

        /// <summary>
        /// Update agast
        /// </summary>
        /// <remarks>
        /// This method operation create a agast 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="authorization">Bearer {auth}</param>
        /// <param name="code">Agast Code</param>
        /// <param name="body">Transaction Message</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> UpdateAgastServiceAsyncWithHttpInfo(string authorization, string code, AgastService body);
        #endregion Asynchronous Operations
    }
}
