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
 * InvoiceContingencyApi.h
 *
 * 
 */

#ifndef InvoiceContingencyApi_H_
#define InvoiceContingencyApi_H_


#include "ApiClient.h"

#include "Body_4.h"
#include "Inline_response_200_3.h"
#include "Message.h"
#include "ValidationError.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  InvoiceContingencyApi
{
public:
    InvoiceContingencyApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~InvoiceContingencyApi();
    /// <summary>
    /// Invoice Drop Contingency per State
    /// </summary>
    /// <remarks>
    /// Drop State in Contingency
    /// </remarks>
    /// <param name="state">Brazilian State</param>
    pplx::task<void> invoiceDropContingency(utility::string_t state);
    /// <summary>
    /// Invoice Set Contingency per State
    /// </summary>
    /// <remarks>
    /// Set State in Contingency
    /// </remarks>
    /// <param name="state">Brazilian State</param>/// <param name="body">Set Contingency</param>
    pplx::task<void> invoiceSetContingency(utility::string_t state, std::shared_ptr<Body_4> body);
    /// <summary>
    /// Invoice Verify Contingency per State
    /// </summary>
    /// <remarks>
    /// Check if State was in Contingency
    /// </remarks>
    /// <param name="state">Brazilian State</param>
    pplx::task<std::shared_ptr<Inline_response_200_3>> invoiceVerifyContingency(utility::string_t state);

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* InvoiceContingencyApi_H_ */

