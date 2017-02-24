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



#include "SefazItPutIn.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

SefazItPutIn::SefazItPutIn()
{
    m_Code = U("");
    m_CodeIsSet = false;
    m_Text = U("");
    m_TextIsSet = false;
    
}

SefazItPutIn::~SefazItPutIn()
{
}

void SefazItPutIn::validate()
{
    // TODO: implement validation
}

web::json::value SefazItPutIn::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CodeIsSet)
    {
        val[U("code")] = ModelBase::toJson(m_Code);
    }
    if(m_TextIsSet)
    {
        val[U("text")] = ModelBase::toJson(m_Text);
    }
    

    return val;
}

void SefazItPutIn::fromJson(web::json::value& val)
{
    if(val.has_field(U("code")))
    {
        setCode(ModelBase::stringFromJson(val[U("code")]));
        
    }
    if(val.has_field(U("text")))
    {
        setText(ModelBase::stringFromJson(val[U("text")]));
        
    }
    
}

void SefazItPutIn::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_CodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("code"), m_Code));
        
    }
    if(m_TextIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("text"), m_Text));
        
    }
    
}

void SefazItPutIn::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("code")))
    {
        setCode(ModelBase::stringFromHttpContent(multipart->getContent(U("code"))));
        
    }
    if(multipart->hasContent(U("text")))
    {
        setText(ModelBase::stringFromHttpContent(multipart->getContent(U("text"))));
        
    }
    
}


utility::string_t SefazItPutIn::getCode() const
{
    return m_Code;
}
void SefazItPutIn::setCode(utility::string_t value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool SefazItPutIn::codeIsSet() const
{
    return m_CodeIsSet;
}
void SefazItPutIn::unsetCode()
{
    m_CodeIsSet = false;
}
utility::string_t SefazItPutIn::getText() const
{
    return m_Text;
}
void SefazItPutIn::setText(utility::string_t value)
{
    m_Text = value;
    m_TextIsSet = true;
}
bool SefazItPutIn::textIsSet() const
{
    return m_TextIsSet;
}
void SefazItPutIn::unsetText()
{
    m_TextIsSet = false;
}

}
}
}
}

