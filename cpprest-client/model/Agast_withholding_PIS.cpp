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



#include "Agast_withholding_PIS.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Agast_withholding_PIS::Agast_withholding_PIS()
{
    m_LegalReason = U("");
    m_LegalReasonIsSet = false;
    m_Business = false;
    m_BusinessIsSet = false;
    m_BusinessLegalReason = U("");
    m_BusinessLegalReasonIsSet = false;
    m_FederalGovernment = false;
    m_FederalGovernmentIsSet = false;
    m_FederalGovernmentLegalReason = U("");
    m_FederalGovernmentLegalReasonIsSet = false;
    m_StateGovernment = false;
    m_StateGovernmentIsSet = false;
    m_StateGovernmentLegalReason = U("");
    m_StateGovernmentLegalReasonIsSet = false;
    m_CityGovernment = false;
    m_CityGovernmentIsSet = false;
    m_CityGovernmentLegalReason = U("");
    m_CityGovernmentLegalReasonIsSet = false;
    
}

Agast_withholding_PIS::~Agast_withholding_PIS()
{
}

void Agast_withholding_PIS::validate()
{
    // TODO: implement validation
}

web::json::value Agast_withholding_PIS::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_LegalReasonIsSet)
    {
        val[U("legalReason")] = ModelBase::toJson(m_LegalReason);
    }
    if(m_BusinessIsSet)
    {
        val[U("business")] = ModelBase::toJson(m_Business);
    }
    if(m_BusinessLegalReasonIsSet)
    {
        val[U("businessLegalReason")] = ModelBase::toJson(m_BusinessLegalReason);
    }
    if(m_FederalGovernmentIsSet)
    {
        val[U("federalGovernment")] = ModelBase::toJson(m_FederalGovernment);
    }
    if(m_FederalGovernmentLegalReasonIsSet)
    {
        val[U("federalGovernmentLegalReason")] = ModelBase::toJson(m_FederalGovernmentLegalReason);
    }
    if(m_StateGovernmentIsSet)
    {
        val[U("stateGovernment")] = ModelBase::toJson(m_StateGovernment);
    }
    if(m_StateGovernmentLegalReasonIsSet)
    {
        val[U("stateGovernmentLegalReason")] = ModelBase::toJson(m_StateGovernmentLegalReason);
    }
    if(m_CityGovernmentIsSet)
    {
        val[U("cityGovernment")] = ModelBase::toJson(m_CityGovernment);
    }
    if(m_CityGovernmentLegalReasonIsSet)
    {
        val[U("cityGovernmentLegalReason")] = ModelBase::toJson(m_CityGovernmentLegalReason);
    }
    

    return val;
}

void Agast_withholding_PIS::fromJson(web::json::value& val)
{
    if(val.has_field(U("legalReason")))
    {
        setLegalReason(ModelBase::stringFromJson(val[U("legalReason")]));
        
    }
    if(val.has_field(U("business")))
    {
        setBusiness(ModelBase::boolFromJson(val[U("business")]));
    }
    if(val.has_field(U("businessLegalReason")))
    {
        setBusinessLegalReason(ModelBase::stringFromJson(val[U("businessLegalReason")]));
        
    }
    if(val.has_field(U("federalGovernment")))
    {
        setFederalGovernment(ModelBase::boolFromJson(val[U("federalGovernment")]));
    }
    if(val.has_field(U("federalGovernmentLegalReason")))
    {
        setFederalGovernmentLegalReason(ModelBase::stringFromJson(val[U("federalGovernmentLegalReason")]));
        
    }
    if(val.has_field(U("stateGovernment")))
    {
        setStateGovernment(ModelBase::boolFromJson(val[U("stateGovernment")]));
    }
    if(val.has_field(U("stateGovernmentLegalReason")))
    {
        setStateGovernmentLegalReason(ModelBase::stringFromJson(val[U("stateGovernmentLegalReason")]));
        
    }
    if(val.has_field(U("cityGovernment")))
    {
        setCityGovernment(ModelBase::boolFromJson(val[U("cityGovernment")]));
    }
    if(val.has_field(U("cityGovernmentLegalReason")))
    {
        setCityGovernmentLegalReason(ModelBase::stringFromJson(val[U("cityGovernmentLegalReason")]));
        
    }
    
}

void Agast_withholding_PIS::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_LegalReasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("legalReason"), m_LegalReason));
        
    }
    if(m_BusinessIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("business"), m_Business));
    }
    if(m_BusinessLegalReasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("businessLegalReason"), m_BusinessLegalReason));
        
    }
    if(m_FederalGovernmentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("federalGovernment"), m_FederalGovernment));
    }
    if(m_FederalGovernmentLegalReasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("federalGovernmentLegalReason"), m_FederalGovernmentLegalReason));
        
    }
    if(m_StateGovernmentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("stateGovernment"), m_StateGovernment));
    }
    if(m_StateGovernmentLegalReasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("stateGovernmentLegalReason"), m_StateGovernmentLegalReason));
        
    }
    if(m_CityGovernmentIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityGovernment"), m_CityGovernment));
    }
    if(m_CityGovernmentLegalReasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityGovernmentLegalReason"), m_CityGovernmentLegalReason));
        
    }
    
}

void Agast_withholding_PIS::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("legalReason")))
    {
        setLegalReason(ModelBase::stringFromHttpContent(multipart->getContent(U("legalReason"))));
        
    }
    if(multipart->hasContent(U("business")))
    {
        setBusiness(ModelBase::boolFromHttpContent(multipart->getContent(U("business"))));
    }
    if(multipart->hasContent(U("businessLegalReason")))
    {
        setBusinessLegalReason(ModelBase::stringFromHttpContent(multipart->getContent(U("businessLegalReason"))));
        
    }
    if(multipart->hasContent(U("federalGovernment")))
    {
        setFederalGovernment(ModelBase::boolFromHttpContent(multipart->getContent(U("federalGovernment"))));
    }
    if(multipart->hasContent(U("federalGovernmentLegalReason")))
    {
        setFederalGovernmentLegalReason(ModelBase::stringFromHttpContent(multipart->getContent(U("federalGovernmentLegalReason"))));
        
    }
    if(multipart->hasContent(U("stateGovernment")))
    {
        setStateGovernment(ModelBase::boolFromHttpContent(multipart->getContent(U("stateGovernment"))));
    }
    if(multipart->hasContent(U("stateGovernmentLegalReason")))
    {
        setStateGovernmentLegalReason(ModelBase::stringFromHttpContent(multipart->getContent(U("stateGovernmentLegalReason"))));
        
    }
    if(multipart->hasContent(U("cityGovernment")))
    {
        setCityGovernment(ModelBase::boolFromHttpContent(multipart->getContent(U("cityGovernment"))));
    }
    if(multipart->hasContent(U("cityGovernmentLegalReason")))
    {
        setCityGovernmentLegalReason(ModelBase::stringFromHttpContent(multipart->getContent(U("cityGovernmentLegalReason"))));
        
    }
    
}


utility::string_t Agast_withholding_PIS::getLegalReason() const
{
    return m_LegalReason;
}
void Agast_withholding_PIS::setLegalReason(utility::string_t value)
{
    m_LegalReason = value;
    m_LegalReasonIsSet = true;
}
bool Agast_withholding_PIS::legalReasonIsSet() const
{
    return m_LegalReasonIsSet;
}
void Agast_withholding_PIS::unsetLegalReason()
{
    m_LegalReasonIsSet = false;
}
bool Agast_withholding_PIS::getBusiness() const
{
    return m_Business;
}
void Agast_withholding_PIS::setBusiness(bool value)
{
    m_Business = value;
    m_BusinessIsSet = true;
}
bool Agast_withholding_PIS::businessIsSet() const
{
    return m_BusinessIsSet;
}
void Agast_withholding_PIS::unsetBusiness()
{
    m_BusinessIsSet = false;
}
utility::string_t Agast_withholding_PIS::getBusinessLegalReason() const
{
    return m_BusinessLegalReason;
}
void Agast_withholding_PIS::setBusinessLegalReason(utility::string_t value)
{
    m_BusinessLegalReason = value;
    m_BusinessLegalReasonIsSet = true;
}
bool Agast_withholding_PIS::businessLegalReasonIsSet() const
{
    return m_BusinessLegalReasonIsSet;
}
void Agast_withholding_PIS::unsetBusinessLegalReason()
{
    m_BusinessLegalReasonIsSet = false;
}
bool Agast_withholding_PIS::getFederalGovernment() const
{
    return m_FederalGovernment;
}
void Agast_withholding_PIS::setFederalGovernment(bool value)
{
    m_FederalGovernment = value;
    m_FederalGovernmentIsSet = true;
}
bool Agast_withholding_PIS::federalGovernmentIsSet() const
{
    return m_FederalGovernmentIsSet;
}
void Agast_withholding_PIS::unsetFederalGovernment()
{
    m_FederalGovernmentIsSet = false;
}
utility::string_t Agast_withholding_PIS::getFederalGovernmentLegalReason() const
{
    return m_FederalGovernmentLegalReason;
}
void Agast_withholding_PIS::setFederalGovernmentLegalReason(utility::string_t value)
{
    m_FederalGovernmentLegalReason = value;
    m_FederalGovernmentLegalReasonIsSet = true;
}
bool Agast_withholding_PIS::federalGovernmentLegalReasonIsSet() const
{
    return m_FederalGovernmentLegalReasonIsSet;
}
void Agast_withholding_PIS::unsetFederalGovernmentLegalReason()
{
    m_FederalGovernmentLegalReasonIsSet = false;
}
bool Agast_withholding_PIS::getStateGovernment() const
{
    return m_StateGovernment;
}
void Agast_withholding_PIS::setStateGovernment(bool value)
{
    m_StateGovernment = value;
    m_StateGovernmentIsSet = true;
}
bool Agast_withholding_PIS::stateGovernmentIsSet() const
{
    return m_StateGovernmentIsSet;
}
void Agast_withholding_PIS::unsetStateGovernment()
{
    m_StateGovernmentIsSet = false;
}
utility::string_t Agast_withholding_PIS::getStateGovernmentLegalReason() const
{
    return m_StateGovernmentLegalReason;
}
void Agast_withholding_PIS::setStateGovernmentLegalReason(utility::string_t value)
{
    m_StateGovernmentLegalReason = value;
    m_StateGovernmentLegalReasonIsSet = true;
}
bool Agast_withholding_PIS::stateGovernmentLegalReasonIsSet() const
{
    return m_StateGovernmentLegalReasonIsSet;
}
void Agast_withholding_PIS::unsetStateGovernmentLegalReason()
{
    m_StateGovernmentLegalReasonIsSet = false;
}
bool Agast_withholding_PIS::getCityGovernment() const
{
    return m_CityGovernment;
}
void Agast_withholding_PIS::setCityGovernment(bool value)
{
    m_CityGovernment = value;
    m_CityGovernmentIsSet = true;
}
bool Agast_withholding_PIS::cityGovernmentIsSet() const
{
    return m_CityGovernmentIsSet;
}
void Agast_withholding_PIS::unsetCityGovernment()
{
    m_CityGovernmentIsSet = false;
}
utility::string_t Agast_withholding_PIS::getCityGovernmentLegalReason() const
{
    return m_CityGovernmentLegalReason;
}
void Agast_withholding_PIS::setCityGovernmentLegalReason(utility::string_t value)
{
    m_CityGovernmentLegalReason = value;
    m_CityGovernmentLegalReasonIsSet = true;
}
bool Agast_withholding_PIS::cityGovernmentLegalReasonIsSet() const
{
    return m_CityGovernmentLegalReasonIsSet;
}
void Agast_withholding_PIS::unsetCityGovernmentLegalReason()
{
    m_CityGovernmentLegalReasonIsSet = false;
}

}
}
}
}

