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



#include "Inline_response_201.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Inline_response_201::Inline_response_201()
{
    m_Id = 0;
    m_IdIsSet = false;
    
}

Inline_response_201::~Inline_response_201()
{
}

void Inline_response_201::validate()
{
    // TODO: implement validation
}

web::json::value Inline_response_201::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_IdIsSet)
    {
        val[U("id")] = ModelBase::toJson(m_Id);
    }
    

    return val;
}

void Inline_response_201::fromJson(web::json::value& val)
{
    if(val.has_field(U("id")))
    {
        setId(ModelBase::int32_tFromJson(val[U("id")]));
    }
    
}

void Inline_response_201::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("id"), m_Id));
    }
    
}

void Inline_response_201::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("id")))
    {
        setId(ModelBase::int32_tFromHttpContent(multipart->getContent(U("id"))));
    }
    
}


int32_t Inline_response_201::getId() const
{
    return m_Id;
}
void Inline_response_201::setId(int32_t value)
{
    m_Id = value;
    m_IdIsSet = true;
}
bool Inline_response_201::idIsSet() const
{
    return m_IdIsSet;
}
void Inline_response_201::unsetId()
{
    m_IdIsSet = false;
}

}
}
}
}

