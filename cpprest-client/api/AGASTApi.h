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
 * AGASTApi.h
 *
 * 
 */

#ifndef AGASTApi_H_
#define AGASTApi_H_


#include "ApiClient.h"

#include "Agast.h"
#include "Inline_response_200_1.h"
#include "Inline_response_201.h"
#include "Message.h"
#include "ValidationError.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  AGASTApi
{
public:
    AGASTApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~AGASTApi();
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// This operation return agast configurations that match with parameters queries 
    /// </remarks>
    /// <param name="code">Agast Code</param>
    pplx::task<std::shared_ptr<Agast>> agastsCodeGet(utility::string_t code);
    /// <summary>
    /// Create agast
    /// </summary>
    /// <remarks>
    /// This method operation create a AGAST 
    /// </remarks>
    /// <param name="body">Transaction Message</param>
    pplx::task<std::shared_ptr<Inline_response_201>> createAgast(std::shared_ptr<Agast> body);
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="code">Agast Code</param>
    pplx::task<void> deleteAgast(utility::string_t code);
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// This operation return agast configurations that match with parameters queries 
    /// </remarks>
    /// <param name="text">Text query (optional)</param>
    pplx::task<std::vector<std::shared_ptr<Inline_response_200_1>>> getAgastList(utility::string_t text);
    /// <summary>
    /// Update agast
    /// </summary>
    /// <remarks>
    /// This method operation create a agast 
    /// </remarks>
    /// <param name="code">Agast Code</param>/// <param name="body">Transaction Message</param>
    pplx::task<void> updateAgast(utility::string_t code, std::shared_ptr<Agast> body);

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* AGASTApi_H_ */

