/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * CompanyTaxRatesApi.h
 *
 * 
 */

#ifndef CompanyTaxRatesApi_H_
#define CompanyTaxRatesApi_H_


#include "ApiClient.h"

#include "CustomTaxTypeRate.h"
#include "Inline_response_201.h"
#include "Message.h"
#include "UUID.h"
#include "ValidationError.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  CompanyTaxRatesApi
{
public:
    CompanyTaxRatesApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~CompanyTaxRatesApi();
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// This operation return custom agast configurations that match with parameters queries 
    /// </remarks>
    /// <param name="companyId">Company ID</param>/// <param name="xPaginationLimit">The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)</param>/// <param name="xPaginationCurrentPage">The current page. Defaults to 1. (optional, default to 1)</param>/// <param name="xPaginationSort"> (optional)</param>
    pplx::task<std::vector<std::shared_ptr<CustomTaxTypeRate>>> companiesCompanyIdTaxratesGet(std::shared_ptr<UUID> companyId, int32_t xPaginationLimit, int32_t xPaginationCurrentPage, utility::string_t xPaginationSort);
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// This operation return custom agast configurations that match with parameters queries 
    /// </remarks>
    /// <param name="companyId">Company ID</param>/// <param name="taxType">Tax Type</param>
    pplx::task<std::shared_ptr<CustomTaxTypeRate>> companiesCompanyIdTaxratesTaxTypeGet(std::shared_ptr<UUID> companyId, utility::string_t taxType);
    /// <summary>
    /// Create custom agast for one company
    /// </summary>
    /// <remarks>
    /// This method operation create a custom agast for one company 
    /// </remarks>
    /// <param name="companyId">Company ID</param>/// <param name="body">Transaction Message</param>
    pplx::task<std::shared_ptr<Inline_response_201>> createCustomTaxes(std::shared_ptr<UUID> companyId, std::shared_ptr<CustomTaxTypeRate> body);
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="companyId">Company ID</param>/// <param name="taxType">Tax Type</param>
    pplx::task<void> deleteCustomTaxes(std::shared_ptr<UUID> companyId, utility::string_t taxType);
    /// <summary>
    /// Update custom agast for one company
    /// </summary>
    /// <remarks>
    /// This method operation create a custom agast for one company 
    /// </remarks>
    /// <param name="companyId">Company ID</param>/// <param name="taxType">Tax Type</param>/// <param name="body">Transaction Message</param>
    pplx::task<void> updateCustomTaxes(std::shared_ptr<UUID> companyId, utility::string_t taxType, std::shared_ptr<CustomTaxTypeRate> body);

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* CompanyTaxRatesApi_H_ */
