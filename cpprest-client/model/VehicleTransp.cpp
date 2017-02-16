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



#include "VehicleTransp.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

VehicleTransp::VehicleTransp()
{
    m_Type = U("");
    m_TypeIsSet = false;
    m_AutomobileIsSet = false;
    m_TrailerIsSet = false;
    m_Wagon = U("");
    m_WagonIsSet = false;
    m_Ferry = U("");
    m_FerryIsSet = false;
    
}

VehicleTransp::~VehicleTransp()
{
}

void VehicleTransp::validate()
{
    // TODO: implement validation
}

web::json::value VehicleTransp::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_TypeIsSet)
    {
        val[U("type")] = ModelBase::toJson(m_Type);
    }
    if(m_AutomobileIsSet)
    {
        val[U("automobile")] = ModelBase::toJson(m_Automobile);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Trailer )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("trailer")] = web::json::value::array(jsonArray);
        }
    }
    if(m_WagonIsSet)
    {
        val[U("wagon")] = ModelBase::toJson(m_Wagon);
    }
    if(m_FerryIsSet)
    {
        val[U("ferry")] = ModelBase::toJson(m_Ferry);
    }
    

    return val;
}

void VehicleTransp::fromJson(web::json::value& val)
{
    if(val.has_field(U("type")))
    {
        setType(ModelBase::stringFromJson(val[U("type")]));
        
    }
    if(val.has_field(U("automobile")))
    {
        if(!val[U("automobile")].is_null())
        {
            std::shared_ptr<VehicleID> newItem(new VehicleID());
            newItem->fromJson(val[U("automobile")]);
            setAutomobile( newItem );
        }
        
    }
    {
        m_Trailer.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("trailer")))
        {
        for( auto& item : val[U("trailer")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Trailer.push_back( std::shared_ptr<VehicleID>(nullptr) );
            }
            else
            {
                std::shared_ptr<VehicleID> newItem(new VehicleID());
                newItem->fromJson(item);
                m_Trailer.push_back( newItem );
            }
            
        }
        }
    }
    if(val.has_field(U("wagon")))
    {
        setWagon(ModelBase::stringFromJson(val[U("wagon")]));
        
    }
    if(val.has_field(U("ferry")))
    {
        setFerry(ModelBase::stringFromJson(val[U("ferry")]));
        
    }
    
}

void VehicleTransp::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("type"), m_Type));
        
    }
    if(m_AutomobileIsSet)
    {
        if (m_Automobile.get())
        {
            m_Automobile->toMultipart(multipart, U("automobile."));
        }
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Trailer )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("trailer"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    if(m_WagonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("wagon"), m_Wagon));
        
    }
    if(m_FerryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("ferry"), m_Ferry));
        
    }
    
}

void VehicleTransp::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("type")))
    {
        setType(ModelBase::stringFromHttpContent(multipart->getContent(U("type"))));
        
    }
    if(multipart->hasContent(U("automobile")))
    {
        if(multipart->hasContent(U("automobile")))
        {
            std::shared_ptr<VehicleID> newItem(new VehicleID());
            newItem->fromMultiPart(multipart, U("automobile."));
            setAutomobile( newItem );
        }
        
    }
    {
        m_Trailer.clear();
        if(multipart->hasContent(U("trailer")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("trailer"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Trailer.push_back( std::shared_ptr<VehicleID>(nullptr) );
            }
            else
            {
                std::shared_ptr<VehicleID> newItem(new VehicleID());
                newItem->fromJson(item);
                m_Trailer.push_back( newItem );
            }
            
        }
        }
    }
    if(multipart->hasContent(U("wagon")))
    {
        setWagon(ModelBase::stringFromHttpContent(multipart->getContent(U("wagon"))));
        
    }
    if(multipart->hasContent(U("ferry")))
    {
        setFerry(ModelBase::stringFromHttpContent(multipart->getContent(U("ferry"))));
        
    }
    
}


utility::string_t VehicleTransp::getType() const
{
    return m_Type;
}
void VehicleTransp::setType(utility::string_t value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool VehicleTransp::typeIsSet() const
{
    return m_TypeIsSet;
}
void VehicleTransp::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<VehicleID> VehicleTransp::getAutomobile() const
{
    return m_Automobile;
}
void VehicleTransp::setAutomobile(std::shared_ptr<VehicleID> value)
{
    m_Automobile = value;
    m_AutomobileIsSet = true;
}
bool VehicleTransp::automobileIsSet() const
{
    return m_AutomobileIsSet;
}
void VehicleTransp::unsetAutomobile()
{
    m_AutomobileIsSet = false;
}
std::vector<std::shared_ptr<VehicleID>>& VehicleTransp::getTrailer()
{
    return m_Trailer;
}
bool VehicleTransp::trailerIsSet() const
{
    return m_TrailerIsSet;
}
void VehicleTransp::unsetTrailer()
{
    m_TrailerIsSet = false;
}
utility::string_t VehicleTransp::getWagon() const
{
    return m_Wagon;
}
void VehicleTransp::setWagon(utility::string_t value)
{
    m_Wagon = value;
    m_WagonIsSet = true;
}
bool VehicleTransp::wagonIsSet() const
{
    return m_WagonIsSet;
}
void VehicleTransp::unsetWagon()
{
    m_WagonIsSet = false;
}
utility::string_t VehicleTransp::getFerry() const
{
    return m_Ferry;
}
void VehicleTransp::setFerry(utility::string_t value)
{
    m_Ferry = value;
    m_FerryIsSet = true;
}
bool VehicleTransp::ferryIsSet() const
{
    return m_FerryIsSet;
}
void VehicleTransp::unsetFerry()
{
    m_FerryIsSet = false;
}

}
}
}
}
