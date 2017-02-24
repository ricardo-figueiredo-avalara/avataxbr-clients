/**
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/*
 * TaxConfCFOPApi.h
 *
 * 
 */

#ifndef TaxConfCFOPApi_H_
#define TaxConfCFOPApi_H_


#include "ApiClient.h"

#include "CfopConf.h"
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

class  TaxConfCFOPApi
{
public:
    TaxConfCFOPApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~TaxConfCFOPApi();
    /// <summary>
    /// create a new CFOP configuration
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="body">The pet JSON you want to post</param>
    pplx::task<std::shared_ptr<Inline_response_201>> createCfop(std::shared_ptr<CfopConf> body);
    /// <summary>
    /// disable a CFOP.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="code">CFOP Code</param>
    pplx::task<void> deleteCfop(utility::string_t code);
    /// <summary>
    /// get CFOP information.
    /// </summary>
    /// <remarks>
    /// This operation return CFOP configuration 
    /// </remarks>
    /// <param name="code">CFOP Code</param>
    pplx::task<std::shared_ptr<CfopConf>> getCfop(utility::string_t code);
    /// <summary>
    /// retrive list of CFOP.
    /// </summary>
    /// <remarks>
    /// This operation return CFOP configurations that match with parameters queries 
    /// </remarks>
    /// <param name="suffixcode">Identify this CFOP, the CFOP Code has two parts N.XXX where N the prefix is the operation scope type if IN or OUT and if is in state, other state, other country and suffix XXX is the operation type  (optional)</param>/// <param name="date">When informed return valid version configuration for this date  (optional)</param>/// <param name="inactive">return the inactive versions too  (optional)</param>
    pplx::task<std::vector<std::shared_ptr<CfopConf>>> getCfopList(utility::string_t suffixcode, utility::datetime date, bool inactive);
    /// <summary>
    /// update a CFOP configuration
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="code">CFOP Code</param>/// <param name="taxconfcfop">The pet JSON you want to post</param>
    pplx::task<void> updateCfop(utility::string_t code, std::shared_ptr<CfopConf> taxconfcfop);

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* TaxConfCFOPApi_H_ */

