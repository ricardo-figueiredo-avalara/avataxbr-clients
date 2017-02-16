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
 * TaxConfIBPTApi.h
 *
 * 
 */

#ifndef TaxConfIBPTApi_H_
#define TaxConfIBPTApi_H_


#include "ApiClient.h"

#include "IbptConf.h"
#include "Inline_response_201.h"
#include "Message.h"
#include "ValidationError.h"
#include <cpprest/details/basic_types.h>
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  TaxConfIBPTApi
{
public:
    TaxConfIBPTApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~TaxConfIBPTApi();
    /// <summary>
    /// create a new Process Type configuration
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="taxconfprocess">The pet JSON you want to post</param>
    pplx::task<std::shared_ptr<Inline_response_201>> createIbptConf(std::shared_ptr<IbptConf> taxconfprocess);
    /// <summary>
    /// disable a IBPT.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="code">IBPT Code</param>
    pplx::task<void> deleteIbptConf(utility::string_t code);
    /// <summary>
    /// get IBPT information.
    /// </summary>
    /// <remarks>
    /// This operation return Process Type configuration 
    /// </remarks>
    /// <param name="code">IBPT Code</param>
    pplx::task<std::shared_ptr<IbptConf>> getIbptConf(utility::string_t code);
    /// <summary>
    /// retrive list of IBPT.
    /// </summary>
    /// <remarks>
    /// This operation return Process Type configurations that match with parameters queries 
    /// </remarks>
    /// <param name="accountId">filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)</param>/// <param name="date">When informed return valid version configuration for this date  (optional)</param>/// <param name="inactive">return the inactive versions too  (optional)</param>
    pplx::task<std::vector<std::shared_ptr<IbptConf>>> getIbptConfList(utility::string_t accountId, utility::datetime date, bool inactive);
    /// <summary>
    /// update a Process Type configuration
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="code">IBPT Code</param>/// <param name="taxconfprocess">The pet JSON you want to post</param>
    pplx::task<void> updateIbptConf(utility::string_t code, std::shared_ptr<IbptConf> taxconfprocess);

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* TaxConfIBPTApi_H_ */

