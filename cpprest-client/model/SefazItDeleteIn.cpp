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



#include "SefazItDeleteIn.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

SefazItDeleteIn::SefazItDeleteIn()
{
    m_Message = U("");
    m_MessageIsSet = false;
    
}

SefazItDeleteIn::~SefazItDeleteIn()
{
}

void SefazItDeleteIn::validate()
{
    // TODO: implement validation
}

web::json::value SefazItDeleteIn::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_MessageIsSet)
    {
        val[U("message")] = ModelBase::toJson(m_Message);
    }
    

    return val;
}

void SefazItDeleteIn::fromJson(web::json::value& val)
{
    if(val.has_field(U("message")))
    {
        setMessage(ModelBase::stringFromJson(val[U("message")]));
        
    }
    
}

void SefazItDeleteIn::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_MessageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("message"), m_Message));
        
    }
    
}

void SefazItDeleteIn::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("message")))
    {
        setMessage(ModelBase::stringFromHttpContent(multipart->getContent(U("message"))));
        
    }
    
}


utility::string_t SefazItDeleteIn::getMessage() const
{
    return m_Message;
}
void SefazItDeleteIn::setMessage(utility::string_t value)
{
    m_Message = value;
    m_MessageIsSet = true;
}
bool SefazItDeleteIn::messageIsSet() const
{
    return m_MessageIsSet;
}
void SefazItDeleteIn::unsetMessage()
{
    m_MessageIsSet = false;
}

}
}
}
}

