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



#include "Inline_response_200_4.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Inline_response_200_4::Inline_response_200_4()
{
    m_Environment = U("");
    m_EnvironmentIsSet = false;
    
}

Inline_response_200_4::~Inline_response_200_4()
{
}

void Inline_response_200_4::validate()
{
    // TODO: implement validation
}

web::json::value Inline_response_200_4::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_EnvironmentIsSet)
    {
        val[U("environment")] = ModelBase::toJson(m_Environment);
    }
    

    return val;
}

void Inline_response_200_4::fromJson(web::json::value& val)
{
    if(val.has_field(U("environment")))
    {
        setEnvironment(ModelBase::stringFromJson(val[U("environment")]));
        
    }
    
}

void Inline_response_200_4::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_EnvironmentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("environment"), m_Environment));
        
    }
    
}

void Inline_response_200_4::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("environment")))
    {
        setEnvironment(ModelBase::stringFromHttpContent(multipart->getContent(U("environment"))));
        
    }
    
}


utility::string_t Inline_response_200_4::getEnvironment() const
{
    return m_Environment;
}
void Inline_response_200_4::setEnvironment(utility::string_t value)
{
    m_Environment = value;
    m_EnvironmentIsSet = true;
}
bool Inline_response_200_4::environmentIsSet() const
{
    return m_EnvironmentIsSet;
}
void Inline_response_200_4::unsetEnvironment()
{
    m_EnvironmentIsSet = false;
}

}
}
}
}
