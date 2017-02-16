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



#include "TaxTypeRate_withholding.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

TaxTypeRate_withholding::TaxTypeRate_withholding()
{
    m_AllIsSet = false;
    m_BusinessIsSet = false;
    m_FederalGovernmentIsSet = false;
    m_StateGovernmentIsSet = false;
    m_CityGovernmentIsSet = false;
    
}

TaxTypeRate_withholding::~TaxTypeRate_withholding()
{
}

void TaxTypeRate_withholding::validate()
{
    // TODO: implement validation
}

web::json::value TaxTypeRate_withholding::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_AllIsSet)
    {
        val[U("all")] = ModelBase::toJson(m_All);
    }
    if(m_BusinessIsSet)
    {
        val[U("business")] = ModelBase::toJson(m_Business);
    }
    if(m_FederalGovernmentIsSet)
    {
        val[U("federalGovernment")] = ModelBase::toJson(m_FederalGovernment);
    }
    if(m_StateGovernmentIsSet)
    {
        val[U("stateGovernment")] = ModelBase::toJson(m_StateGovernment);
    }
    if(m_CityGovernmentIsSet)
    {
        val[U("cityGovernment")] = ModelBase::toJson(m_CityGovernment);
    }
    

    return val;
}

void TaxTypeRate_withholding::fromJson(web::json::value& val)
{
    if(val.has_field(U("all")))
    {
        if(!val[U("all")].is_null())
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromJson(val[U("all")]);
            setAll( newItem );
        }
        
    }
    if(val.has_field(U("business")))
    {
        if(!val[U("business")].is_null())
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromJson(val[U("business")]);
            setBusiness( newItem );
        }
        
    }
    if(val.has_field(U("federalGovernment")))
    {
        if(!val[U("federalGovernment")].is_null())
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromJson(val[U("federalGovernment")]);
            setFederalGovernment( newItem );
        }
        
    }
    if(val.has_field(U("stateGovernment")))
    {
        if(!val[U("stateGovernment")].is_null())
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromJson(val[U("stateGovernment")]);
            setStateGovernment( newItem );
        }
        
    }
    if(val.has_field(U("cityGovernment")))
    {
        if(!val[U("cityGovernment")].is_null())
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromJson(val[U("cityGovernment")]);
            setCityGovernment( newItem );
        }
        
    }
    
}

void TaxTypeRate_withholding::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_AllIsSet)
    {
        if (m_All.get())
        {
            m_All->toMultipart(multipart, U("all."));
        }
        
    }
    if(m_BusinessIsSet)
    {
        if (m_Business.get())
        {
            m_Business->toMultipart(multipart, U("business."));
        }
        
    }
    if(m_FederalGovernmentIsSet)
    {
        if (m_FederalGovernment.get())
        {
            m_FederalGovernment->toMultipart(multipart, U("federalGovernment."));
        }
        
    }
    if(m_StateGovernmentIsSet)
    {
        if (m_StateGovernment.get())
        {
            m_StateGovernment->toMultipart(multipart, U("stateGovernment."));
        }
        
    }
    if(m_CityGovernmentIsSet)
    {
        if (m_CityGovernment.get())
        {
            m_CityGovernment->toMultipart(multipart, U("cityGovernment."));
        }
        
    }
    
}

void TaxTypeRate_withholding::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("all")))
    {
        if(multipart->hasContent(U("all")))
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromMultiPart(multipart, U("all."));
            setAll( newItem );
        }
        
    }
    if(multipart->hasContent(U("business")))
    {
        if(multipart->hasContent(U("business")))
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromMultiPart(multipart, U("business."));
            setBusiness( newItem );
        }
        
    }
    if(multipart->hasContent(U("federalGovernment")))
    {
        if(multipart->hasContent(U("federalGovernment")))
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromMultiPart(multipart, U("federalGovernment."));
            setFederalGovernment( newItem );
        }
        
    }
    if(multipart->hasContent(U("stateGovernment")))
    {
        if(multipart->hasContent(U("stateGovernment")))
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromMultiPart(multipart, U("stateGovernment."));
            setStateGovernment( newItem );
        }
        
    }
    if(multipart->hasContent(U("cityGovernment")))
    {
        if(multipart->hasContent(U("cityGovernment")))
        {
            std::shared_ptr<WithholdDef> newItem(new WithholdDef());
            newItem->fromMultiPart(multipart, U("cityGovernment."));
            setCityGovernment( newItem );
        }
        
    }
    
}


std::shared_ptr<WithholdDef> TaxTypeRate_withholding::getAll() const
{
    return m_All;
}
void TaxTypeRate_withholding::setAll(std::shared_ptr<WithholdDef> value)
{
    m_All = value;
    m_AllIsSet = true;
}
bool TaxTypeRate_withholding::allIsSet() const
{
    return m_AllIsSet;
}
void TaxTypeRate_withholding::unsetAll()
{
    m_AllIsSet = false;
}
std::shared_ptr<WithholdDef> TaxTypeRate_withholding::getBusiness() const
{
    return m_Business;
}
void TaxTypeRate_withholding::setBusiness(std::shared_ptr<WithholdDef> value)
{
    m_Business = value;
    m_BusinessIsSet = true;
}
bool TaxTypeRate_withholding::businessIsSet() const
{
    return m_BusinessIsSet;
}
void TaxTypeRate_withholding::unsetBusiness()
{
    m_BusinessIsSet = false;
}
std::shared_ptr<WithholdDef> TaxTypeRate_withholding::getFederalGovernment() const
{
    return m_FederalGovernment;
}
void TaxTypeRate_withholding::setFederalGovernment(std::shared_ptr<WithholdDef> value)
{
    m_FederalGovernment = value;
    m_FederalGovernmentIsSet = true;
}
bool TaxTypeRate_withholding::federalGovernmentIsSet() const
{
    return m_FederalGovernmentIsSet;
}
void TaxTypeRate_withholding::unsetFederalGovernment()
{
    m_FederalGovernmentIsSet = false;
}
std::shared_ptr<WithholdDef> TaxTypeRate_withholding::getStateGovernment() const
{
    return m_StateGovernment;
}
void TaxTypeRate_withholding::setStateGovernment(std::shared_ptr<WithholdDef> value)
{
    m_StateGovernment = value;
    m_StateGovernmentIsSet = true;
}
bool TaxTypeRate_withholding::stateGovernmentIsSet() const
{
    return m_StateGovernmentIsSet;
}
void TaxTypeRate_withholding::unsetStateGovernment()
{
    m_StateGovernmentIsSet = false;
}
std::shared_ptr<WithholdDef> TaxTypeRate_withholding::getCityGovernment() const
{
    return m_CityGovernment;
}
void TaxTypeRate_withholding::setCityGovernment(std::shared_ptr<WithholdDef> value)
{
    m_CityGovernment = value;
    m_CityGovernmentIsSet = true;
}
bool TaxTypeRate_withholding::cityGovernmentIsSet() const
{
    return m_CityGovernmentIsSet;
}
void TaxTypeRate_withholding::unsetCityGovernment()
{
    m_CityGovernmentIsSet = false;
}

}
}
}
}

