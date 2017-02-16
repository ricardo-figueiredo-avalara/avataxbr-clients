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



#include "Address.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Address::Address()
{
    m_Street = U("");
    m_StreetIsSet = false;
    m_Neighborhood = U("");
    m_NeighborhoodIsSet = false;
    m_Zipcode = U("");
    m_CityCode = U("");
    m_CityCodeIsSet = false;
    m_CityName = U("");
    m_CityNameIsSet = false;
    m_StateIsSet = false;
    m_CountryCode = U("");
    m_CountryCodeIsSet = false;
    m_Country = U("");
    m_CountryIsSet = false;
    
}

Address::~Address()
{
}

void Address::validate()
{
    // TODO: implement validation
}

web::json::value Address::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_StreetIsSet)
    {
        val[U("street")] = ModelBase::toJson(m_Street);
    }
    if(m_NeighborhoodIsSet)
    {
        val[U("neighborhood")] = ModelBase::toJson(m_Neighborhood);
    }
    val[U("zipcode")] = ModelBase::toJson(m_Zipcode);
    if(m_CityCodeIsSet)
    {
        val[U("cityCode")] = ModelBase::toJson(m_CityCode);
    }
    if(m_CityNameIsSet)
    {
        val[U("cityName")] = ModelBase::toJson(m_CityName);
    }
    if(m_StateIsSet)
    {
        val[U("state")] = ModelBase::toJson(m_State);
    }
    if(m_CountryCodeIsSet)
    {
        val[U("countryCode")] = ModelBase::toJson(m_CountryCode);
    }
    if(m_CountryIsSet)
    {
        val[U("country")] = ModelBase::toJson(m_Country);
    }
    

    return val;
}

void Address::fromJson(web::json::value& val)
{
    if(val.has_field(U("street")))
    {
        setStreet(ModelBase::stringFromJson(val[U("street")]));
        
    }
    if(val.has_field(U("neighborhood")))
    {
        setNeighborhood(ModelBase::stringFromJson(val[U("neighborhood")]));
        
    }
    setZipcode(ModelBase::stringFromJson(val[U("zipcode")]));
    if(val.has_field(U("cityCode")))
    {
        setCityCode(ModelBase::stringFromJson(val[U("cityCode")]));
        
    }
    if(val.has_field(U("cityName")))
    {
        setCityName(ModelBase::stringFromJson(val[U("cityName")]));
        
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
    if(val.has_field(U("countryCode")))
    {
        setCountryCode(ModelBase::stringFromJson(val[U("countryCode")]));
        
    }
    if(val.has_field(U("country")))
    {
        setCountry(ModelBase::stringFromJson(val[U("country")]));
        
    }
    
}

void Address::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_StreetIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("street"), m_Street));
        
    }
    if(m_NeighborhoodIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("neighborhood"), m_Neighborhood));
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("zipcode"), m_Zipcode));
    if(m_CityCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityCode"), m_CityCode));
        
    }
    if(m_CityNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityName"), m_CityName));
        
    }
    if(m_StateIsSet)
    {
        if (m_State.get())
        {
            m_State->toMultipart(multipart, U("state."));
        }
        
    }
    if(m_CountryCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("countryCode"), m_CountryCode));
        
    }
    if(m_CountryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("country"), m_Country));
        
    }
    
}

void Address::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("street")))
    {
        setStreet(ModelBase::stringFromHttpContent(multipart->getContent(U("street"))));
        
    }
    if(multipart->hasContent(U("neighborhood")))
    {
        setNeighborhood(ModelBase::stringFromHttpContent(multipart->getContent(U("neighborhood"))));
        
    }
    setZipcode(ModelBase::stringFromHttpContent(multipart->getContent(U("zipcode"))));
    if(multipart->hasContent(U("cityCode")))
    {
        setCityCode(ModelBase::stringFromHttpContent(multipart->getContent(U("cityCode"))));
        
    }
    if(multipart->hasContent(U("cityName")))
    {
        setCityName(ModelBase::stringFromHttpContent(multipart->getContent(U("cityName"))));
        
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
    if(multipart->hasContent(U("countryCode")))
    {
        setCountryCode(ModelBase::stringFromHttpContent(multipart->getContent(U("countryCode"))));
        
    }
    if(multipart->hasContent(U("country")))
    {
        setCountry(ModelBase::stringFromHttpContent(multipart->getContent(U("country"))));
        
    }
    
}


utility::string_t Address::getStreet() const
{
    return m_Street;
}
void Address::setStreet(utility::string_t value)
{
    m_Street = value;
    m_StreetIsSet = true;
}
bool Address::streetIsSet() const
{
    return m_StreetIsSet;
}
void Address::unsetStreet()
{
    m_StreetIsSet = false;
}
utility::string_t Address::getNeighborhood() const
{
    return m_Neighborhood;
}
void Address::setNeighborhood(utility::string_t value)
{
    m_Neighborhood = value;
    m_NeighborhoodIsSet = true;
}
bool Address::neighborhoodIsSet() const
{
    return m_NeighborhoodIsSet;
}
void Address::unsetNeighborhood()
{
    m_NeighborhoodIsSet = false;
}
utility::string_t Address::getZipcode() const
{
    return m_Zipcode;
}
void Address::setZipcode(utility::string_t value)
{
    m_Zipcode = value;
    
}
utility::string_t Address::getCityCode() const
{
    return m_CityCode;
}
void Address::setCityCode(utility::string_t value)
{
    m_CityCode = value;
    m_CityCodeIsSet = true;
}
bool Address::cityCodeIsSet() const
{
    return m_CityCodeIsSet;
}
void Address::unsetCityCode()
{
    m_CityCodeIsSet = false;
}
utility::string_t Address::getCityName() const
{
    return m_CityName;
}
void Address::setCityName(utility::string_t value)
{
    m_CityName = value;
    m_CityNameIsSet = true;
}
bool Address::cityNameIsSet() const
{
    return m_CityNameIsSet;
}
void Address::unsetCityName()
{
    m_CityNameIsSet = false;
}
std::shared_ptr<StateEnum> Address::getState() const
{
    return m_State;
}
void Address::setState(std::shared_ptr<StateEnum> value)
{
    m_State = value;
    m_StateIsSet = true;
}
bool Address::stateIsSet() const
{
    return m_StateIsSet;
}
void Address::unsetState()
{
    m_StateIsSet = false;
}
utility::string_t Address::getCountryCode() const
{
    return m_CountryCode;
}
void Address::setCountryCode(utility::string_t value)
{
    m_CountryCode = value;
    m_CountryCodeIsSet = true;
}
bool Address::countryCodeIsSet() const
{
    return m_CountryCodeIsSet;
}
void Address::unsetCountryCode()
{
    m_CountryCodeIsSet = false;
}
utility::string_t Address::getCountry() const
{
    return m_Country;
}
void Address::setCountry(utility::string_t value)
{
    m_Country = value;
    m_CountryIsSet = true;
}
bool Address::countryIsSet() const
{
    return m_CountryIsSet;
}
void Address::unsetCountry()
{
    m_CountryIsSet = false;
}

}
}
}
}
