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



#include "TaxByTypeSummaryForService.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

TaxByTypeSummaryForService::TaxByTypeSummaryForService()
{
    m_Tax = 0.0;
    m_TaxIsSet = false;
    m_JurisdictionsIsSet = false;
    
}

TaxByTypeSummaryForService::~TaxByTypeSummaryForService()
{
}

void TaxByTypeSummaryForService::validate()
{
    // TODO: implement validation
}

web::json::value TaxByTypeSummaryForService::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_TaxIsSet)
    {
        val[U("tax")] = ModelBase::toJson(m_Tax);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Jurisdictions )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("jurisdictions")] = web::json::value::array(jsonArray);
        }
    }
    

    return val;
}

void TaxByTypeSummaryForService::fromJson(web::json::value& val)
{
    if(val.has_field(U("tax")))
    {
        setTax(ModelBase::doubleFromJson(val[U("tax")]));
    }
    {
        m_Jurisdictions.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("jurisdictions")))
        {
        for( auto& item : val[U("jurisdictions")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Jurisdictions.push_back( std::shared_ptr<TaxByTypeSummaryJurisdiction>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaxByTypeSummaryJurisdiction> newItem(new TaxByTypeSummaryJurisdiction());
                newItem->fromJson(item);
                m_Jurisdictions.push_back( newItem );
            }
            
        }
        }
    }
    
}

void TaxByTypeSummaryForService::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_TaxIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("tax"), m_Tax));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Jurisdictions )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("jurisdictions"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    
}

void TaxByTypeSummaryForService::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("tax")))
    {
        setTax(ModelBase::doubleFromHttpContent(multipart->getContent(U("tax"))));
    }
    {
        m_Jurisdictions.clear();
        if(multipart->hasContent(U("jurisdictions")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("jurisdictions"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Jurisdictions.push_back( std::shared_ptr<TaxByTypeSummaryJurisdiction>(nullptr) );
            }
            else
            {
                std::shared_ptr<TaxByTypeSummaryJurisdiction> newItem(new TaxByTypeSummaryJurisdiction());
                newItem->fromJson(item);
                m_Jurisdictions.push_back( newItem );
            }
            
        }
        }
    }
    
}


double TaxByTypeSummaryForService::getTax() const
{
    return m_Tax;
}
void TaxByTypeSummaryForService::setTax(double value)
{
    m_Tax = value;
    m_TaxIsSet = true;
}
bool TaxByTypeSummaryForService::taxIsSet() const
{
    return m_TaxIsSet;
}
void TaxByTypeSummaryForService::unsetTax()
{
    m_TaxIsSet = false;
}
std::vector<std::shared_ptr<TaxByTypeSummaryJurisdiction>>& TaxByTypeSummaryForService::getJurisdictions()
{
    return m_Jurisdictions;
}
bool TaxByTypeSummaryForService::jurisdictionsIsSet() const
{
    return m_JurisdictionsIsSet;
}
void TaxByTypeSummaryForService::unsetJurisdictions()
{
    m_JurisdictionsIsSet = false;
}

}
}
}
}

