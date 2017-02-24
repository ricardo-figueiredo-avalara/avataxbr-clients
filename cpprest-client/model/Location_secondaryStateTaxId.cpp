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



#include "Location_secondaryStateTaxId.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Location_secondaryStateTaxId::Location_secondaryStateTaxId()
{
    m_StateTaxId = U("");
    m_StateTaxIdIsSet = false;
    m_StateIsSet = false;
    
}

Location_secondaryStateTaxId::~Location_secondaryStateTaxId()
{
}

void Location_secondaryStateTaxId::validate()
{
    // TODO: implement validation
}

web::json::value Location_secondaryStateTaxId::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_StateTaxIdIsSet)
    {
        val[U("stateTaxId")] = ModelBase::toJson(m_StateTaxId);
    }
    if(m_StateIsSet)
    {
        val[U("state")] = ModelBase::toJson(m_State);
    }
    

    return val;
}

void Location_secondaryStateTaxId::fromJson(web::json::value& val)
{
    if(val.has_field(U("stateTaxId")))
    {
        setStateTaxId(ModelBase::stringFromJson(val[U("stateTaxId")]));
        
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

void Location_secondaryStateTaxId::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_StateTaxIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("stateTaxId"), m_StateTaxId));
        
    }
    if(m_StateIsSet)
    {
        if (m_State.get())
        {
            m_State->toMultipart(multipart, U("state."));
        }
        
    }
    
}

void Location_secondaryStateTaxId::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("stateTaxId")))
    {
        setStateTaxId(ModelBase::stringFromHttpContent(multipart->getContent(U("stateTaxId"))));
        
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


utility::string_t Location_secondaryStateTaxId::getStateTaxId() const
{
    return m_StateTaxId;
}
void Location_secondaryStateTaxId::setStateTaxId(utility::string_t value)
{
    m_StateTaxId = value;
    m_StateTaxIdIsSet = true;
}
bool Location_secondaryStateTaxId::stateTaxIdIsSet() const
{
    return m_StateTaxIdIsSet;
}
void Location_secondaryStateTaxId::unsetStateTaxId()
{
    m_StateTaxIdIsSet = false;
}
std::shared_ptr<StateEnum> Location_secondaryStateTaxId::getState() const
{
    return m_State;
}
void Location_secondaryStateTaxId::setState(std::shared_ptr<StateEnum> value)
{
    m_State = value;
    m_StateIsSet = true;
}
bool Location_secondaryStateTaxId::stateIsSet() const
{
    return m_StateIsSet;
}
void Location_secondaryStateTaxId::unsetState()
{
    m_StateIsSet = false;
}

}
}
}
}

