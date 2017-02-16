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



#include "CSTPistCofinsEnum.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

CSTPistCofinsEnum::CSTPistCofinsEnum()
{
    
}

CSTPistCofinsEnum::~CSTPistCofinsEnum()
{
}

void CSTPistCofinsEnum::validate()
{
    // TODO: implement validation
}

web::json::value CSTPistCofinsEnum::toJson() const
{
    web::json::value val = web::json::value::object();

    

    return val;
}

void CSTPistCofinsEnum::fromJson(web::json::value& val)
{
    
}

void CSTPistCofinsEnum::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    
}

void CSTPistCofinsEnum::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
