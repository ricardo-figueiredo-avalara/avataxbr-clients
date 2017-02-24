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



#include "CSTTableBEnum.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

CSTTableBEnum::CSTTableBEnum()
{
    
}

CSTTableBEnum::~CSTTableBEnum()
{
}

void CSTTableBEnum::validate()
{
    // TODO: implement validation
}

web::json::value CSTTableBEnum::toJson() const
{
    web::json::value val = web::json::value::object();

    

    return val;
}

void CSTTableBEnum::fromJson(web::json::value& val)
{
    
}

void CSTTableBEnum::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    
}

void CSTTableBEnum::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    
}



}
}
}
}

