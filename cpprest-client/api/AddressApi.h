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
 * AddressApi.h
 *
 * 
 */

#ifndef AddressApi_H_
#define AddressApi_H_


#include "ApiClient.h"

#include "Address.h"
#include "Message.h"
#include "ValidationError.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  AddressApi
{
public:
    AddressApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~AddressApi();
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// This operation return address
    /// </remarks>
    /// <param name="zipcode">ZIP Code</param>
    pplx::task<std::vector<std::shared_ptr<Address>>> getZipCode(utility::string_t zipcode);

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* AddressApi_H_ */

