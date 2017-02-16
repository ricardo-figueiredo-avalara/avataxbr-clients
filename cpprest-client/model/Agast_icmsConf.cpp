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



#include "Agast_icmsConf.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Agast_icmsConf::Agast_icmsConf()
{
    m_Code = U("");
    m_CodeIsSet = false;
    m_StateIsSet = false;
    
}

Agast_icmsConf::~Agast_icmsConf()
{
}

void Agast_icmsConf::validate()
{
    // TODO: implement validation
}

web::json::value Agast_icmsConf::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CodeIsSet)
    {
        val[U("code")] = ModelBase::toJson(m_Code);
    }
    if(m_StateIsSet)
    {
        val[U("state")] = ModelBase::toJson(m_State);
    }
    

    return val;
}

void Agast_icmsConf::fromJson(web::json::value& val)
{
    if(val.has_field(U("code")))
    {
        setCode(ModelBase::stringFromJson(val[U("code")]));
        
    }
    if(val.has_field(U("state")))
    {
        if(!val[U("state")].is_null())
        {
            std::shared_ptr<StateEnum> newItem(new StateEnum());
            newItem->fromJson(val[U("state")]);
            setState( newItem );
        }
        
    }
    
}

void Agast_icmsConf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_StateIsSet)
    {
        if (m_State.get())
        {
            m_State->toMultipart(multipart, U("state."));
        }
        
    }
    
}

void Agast_icmsConf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(U("state")))
    {
        if(multipart->hasContent(U("state")))
        {
            std::shared_ptr<StateEnum> newItem(new StateEnum());
            newItem->fromMultiPart(multipart, U("state."));
            setState( newItem );
        }
        
    }
    
}


utility::string_t Agast_icmsConf::getCode() const
{
    return m_Code;
}
void Agast_icmsConf::setCode(utility::string_t value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool Agast_icmsConf::codeIsSet() const
{
    return m_CodeIsSet;
}
void Agast_icmsConf::unsetCode()
{
    m_CodeIsSet = false;
}
std::shared_ptr<StateEnum> Agast_icmsConf::getState() const
{
    return m_State;
}
void Agast_icmsConf::setState(std::shared_ptr<StateEnum> value)
{
    m_State = value;
    m_StateIsSet = true;
}
bool Agast_icmsConf::stateIsSet() const
{
    return m_StateIsSet;
}
void Agast_icmsConf::unsetState()
{
    m_StateIsSet = false;
}

}
}
}
}

