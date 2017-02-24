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



#include "TaxByTypeSummaryJurisdiction.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

TaxByTypeSummaryJurisdiction::TaxByTypeSummaryJurisdiction()
{
    m_JurisdictionName = U("");
    m_JurisdictionNameIsSet = false;
    m_JurisdictionType = U("");
    m_JurisdictionTypeIsSet = false;
    m_Tax = 0.0;
    m_TaxIsSet = false;
    
}

TaxByTypeSummaryJurisdiction::~TaxByTypeSummaryJurisdiction()
{
}

void TaxByTypeSummaryJurisdiction::validate()
{
    // TODO: implement validation
}

web::json::value TaxByTypeSummaryJurisdiction::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_JurisdictionNameIsSet)
    {
        val[U("jurisdictionName")] = ModelBase::toJson(m_JurisdictionName);
    }
    if(m_JurisdictionTypeIsSet)
    {
        val[U("jurisdictionType")] = ModelBase::toJson(m_JurisdictionType);
    }
    if(m_TaxIsSet)
    {
        val[U("tax")] = ModelBase::toJson(m_Tax);
    }
    

    return val;
}

void TaxByTypeSummaryJurisdiction::fromJson(web::json::value& val)
{
    if(val.has_field(U("jurisdictionName")))
    {
        setJurisdictionName(ModelBase::stringFromJson(val[U("jurisdictionName")]));
        
    }
    if(val.has_field(U("jurisdictionType")))
    {
        setJurisdictionType(ModelBase::stringFromJson(val[U("jurisdictionType")]));
        
    }
    if(val.has_field(U("tax")))
    {
        setTax(ModelBase::doubleFromJson(val[U("tax")]));
    }
    
}

void TaxByTypeSummaryJurisdiction::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_JurisdictionNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("jurisdictionName"), m_JurisdictionName));
        
    }
    if(m_JurisdictionTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("jurisdictionType"), m_JurisdictionType));
        
    }
    if(m_TaxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("tax"), m_Tax));
    }
    
}

void TaxByTypeSummaryJurisdiction::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("jurisdictionName")))
    {
        setJurisdictionName(ModelBase::stringFromHttpContent(multipart->getContent(U("jurisdictionName"))));
        
    }
    if(multipart->hasContent(U("jurisdictionType")))
    {
        setJurisdictionType(ModelBase::stringFromHttpContent(multipart->getContent(U("jurisdictionType"))));
        
    }
    if(multipart->hasContent(U("tax")))
    {
        setTax(ModelBase::doubleFromHttpContent(multipart->getContent(U("tax"))));
    }
    
}


utility::string_t TaxByTypeSummaryJurisdiction::getJurisdictionName() const
{
    return m_JurisdictionName;
}
void TaxByTypeSummaryJurisdiction::setJurisdictionName(utility::string_t value)
{
    m_JurisdictionName = value;
    m_JurisdictionNameIsSet = true;
}
bool TaxByTypeSummaryJurisdiction::jurisdictionNameIsSet() const
{
    return m_JurisdictionNameIsSet;
}
void TaxByTypeSummaryJurisdiction::unsetJurisdictionName()
{
    m_JurisdictionNameIsSet = false;
}
utility::string_t TaxByTypeSummaryJurisdiction::getJurisdictionType() const
{
    return m_JurisdictionType;
}
void TaxByTypeSummaryJurisdiction::setJurisdictionType(utility::string_t value)
{
    m_JurisdictionType = value;
    m_JurisdictionTypeIsSet = true;
}
bool TaxByTypeSummaryJurisdiction::jurisdictionTypeIsSet() const
{
    return m_JurisdictionTypeIsSet;
}
void TaxByTypeSummaryJurisdiction::unsetJurisdictionType()
{
    m_JurisdictionTypeIsSet = false;
}
double TaxByTypeSummaryJurisdiction::getTax() const
{
    return m_Tax;
}
void TaxByTypeSummaryJurisdiction::setTax(double value)
{
    m_Tax = value;
    m_TaxIsSet = true;
}
bool TaxByTypeSummaryJurisdiction::taxIsSet() const
{
    return m_TaxIsSet;
}
void TaxByTypeSummaryJurisdiction::unsetTax()
{
    m_TaxIsSet = false;
}

}
}
}
}

