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



#include "WithholdingMode.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

WithholdingMode::WithholdingMode()
{
    
}

WithholdingMode::~WithholdingMode()
{
}

void WithholdingMode::validate()
{
    // TODO: implement validation
}

web::json::value WithholdingMode::toJson() const
{
    web::json::value val = web::json::value::object();

    

    return val;
}

void WithholdingMode::fromJson(web::json::value& val)
{
    
}

void WithholdingMode::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    
}

void WithholdingMode::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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

