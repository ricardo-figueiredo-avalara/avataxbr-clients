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



#include "IpbtConfItem.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

IpbtConfItem::IpbtConfItem()
{
    m_StateIsSet = false;
    m_FederalTax = 0.0;
    m_FederalTaxIsSet = false;
    m_ImportTax = 0.0;
    m_ImportTaxIsSet = false;
    m_StateTax = 0.0;
    m_StateTaxIsSet = false;
    m_CityTax = 0.0;
    m_CityTaxIsSet = false;
    m_Source = U("");
    m_SourceIsSet = false;
    
}

IpbtConfItem::~IpbtConfItem()
{
}

void IpbtConfItem::validate()
{
    // TODO: implement validation
}

web::json::value IpbtConfItem::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_StateIsSet)
    {
        val[U("state")] = ModelBase::toJson(m_State);
    }
    if(m_FederalTaxIsSet)
    {
        val[U("federalTax")] = ModelBase::toJson(m_FederalTax);
    }
    if(m_ImportTaxIsSet)
    {
        val[U("importTax")] = ModelBase::toJson(m_ImportTax);
    }
    if(m_StateTaxIsSet)
    {
        val[U("stateTax")] = ModelBase::toJson(m_StateTax);
    }
    if(m_CityTaxIsSet)
    {
        val[U("cityTax")] = ModelBase::toJson(m_CityTax);
    }
    if(m_SourceIsSet)
    {
        val[U("source")] = ModelBase::toJson(m_Source);
    }
    

    return val;
}

void IpbtConfItem::fromJson(web::json::value& val)
{
    if(val.has_field(U("state")))
    {
        if(!val[U("state")].is_null())
        {
            std::shared_ptr<StateEnum> newItem(new StateEnum());
            newItem->fromJson(val[U("state")]);
            setState( newItem );
        }
        
    }
    if(val.has_field(U("federalTax")))
    {
        setFederalTax(ModelBase::doubleFromJson(val[U("federalTax")]));
    }
    if(val.has_field(U("importTax")))
    {
        setImportTax(ModelBase::doubleFromJson(val[U("importTax")]));
    }
    if(val.has_field(U("stateTax")))
    {
        setStateTax(ModelBase::doubleFromJson(val[U("stateTax")]));
    }
    if(val.has_field(U("cityTax")))
    {
        setCityTax(ModelBase::doubleFromJson(val[U("cityTax")]));
    }
    if(val.has_field(U("source")))
    {
        setSource(ModelBase::stringFromJson(val[U("source")]));
        
    }
    
}

void IpbtConfItem::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_StateIsSet)
    {
        if (m_State.get())
        {
            m_State->toMultipart(multipart, U("state."));
        }
        
    }
    if(m_FederalTaxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("federalTax"), m_FederalTax));
    }
    if(m_ImportTaxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("importTax"), m_ImportTax));
    }
    if(m_StateTaxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("stateTax"), m_StateTax));
    }
    if(m_CityTaxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityTax"), m_CityTax));
    }
    if(m_SourceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("source"), m_Source));
        
    }
    
}

void IpbtConfItem::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
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
    if(multipart->hasContent(U("federalTax")))
    {
        setFederalTax(ModelBase::doubleFromHttpContent(multipart->getContent(U("federalTax"))));
    }
    if(multipart->hasContent(U("importTax")))
    {
        setImportTax(ModelBase::doubleFromHttpContent(multipart->getContent(U("importTax"))));
    }
    if(multipart->hasContent(U("stateTax")))
    {
        setStateTax(ModelBase::doubleFromHttpContent(multipart->getContent(U("stateTax"))));
    }
    if(multipart->hasContent(U("cityTax")))
    {
        setCityTax(ModelBase::doubleFromHttpContent(multipart->getContent(U("cityTax"))));
    }
    if(multipart->hasContent(U("source")))
    {
        setSource(ModelBase::stringFromHttpContent(multipart->getContent(U("source"))));
        
    }
    
}


std::shared_ptr<StateEnum> IpbtConfItem::getState() const
{
    return m_State;
}
void IpbtConfItem::setState(std::shared_ptr<StateEnum> value)
{
    m_State = value;
    m_StateIsSet = true;
}
bool IpbtConfItem::stateIsSet() const
{
    return m_StateIsSet;
}
void IpbtConfItem::unsetState()
{
    m_StateIsSet = false;
}
double IpbtConfItem::getFederalTax() const
{
    return m_FederalTax;
}
void IpbtConfItem::setFederalTax(double value)
{
    m_FederalTax = value;
    m_FederalTaxIsSet = true;
}
bool IpbtConfItem::federalTaxIsSet() const
{
    return m_FederalTaxIsSet;
}
void IpbtConfItem::unsetFederalTax()
{
    m_FederalTaxIsSet = false;
}
double IpbtConfItem::getImportTax() const
{
    return m_ImportTax;
}
void IpbtConfItem::setImportTax(double value)
{
    m_ImportTax = value;
    m_ImportTaxIsSet = true;
}
bool IpbtConfItem::importTaxIsSet() const
{
    return m_ImportTaxIsSet;
}
void IpbtConfItem::unsetImportTax()
{
    m_ImportTaxIsSet = false;
}
double IpbtConfItem::getStateTax() const
{
    return m_StateTax;
}
void IpbtConfItem::setStateTax(double value)
{
    m_StateTax = value;
    m_StateTaxIsSet = true;
}
bool IpbtConfItem::stateTaxIsSet() const
{
    return m_StateTaxIsSet;
}
void IpbtConfItem::unsetStateTax()
{
    m_StateTaxIsSet = false;
}
double IpbtConfItem::getCityTax() const
{
    return m_CityTax;
}
void IpbtConfItem::setCityTax(double value)
{
    m_CityTax = value;
    m_CityTaxIsSet = true;
}
bool IpbtConfItem::cityTaxIsSet() const
{
    return m_CityTaxIsSet;
}
void IpbtConfItem::unsetCityTax()
{
    m_CityTaxIsSet = false;
}
utility::string_t IpbtConfItem::getSource() const
{
    return m_Source;
}
void IpbtConfItem::setSource(utility::string_t value)
{
    m_Source = value;
    m_SourceIsSet = true;
}
bool IpbtConfItem::sourceIsSet() const
{
    return m_SourceIsSet;
}
void IpbtConfItem::unsetSource()
{
    m_SourceIsSet = false;
}

}
}
}
}

