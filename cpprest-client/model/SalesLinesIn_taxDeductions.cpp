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



#include "SalesLinesIn_taxDeductions.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

SalesLinesIn_taxDeductions::SalesLinesIn_taxDeductions()
{
    m_Iss = 0.0;
    m_IssIsSet = false;
    
}

SalesLinesIn_taxDeductions::~SalesLinesIn_taxDeductions()
{
}

void SalesLinesIn_taxDeductions::validate()
{
    // TODO: implement validation
}

web::json::value SalesLinesIn_taxDeductions::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_IssIsSet)
    {
        val[U("iss")] = ModelBase::toJson(m_Iss);
    }
    

    return val;
}

void SalesLinesIn_taxDeductions::fromJson(web::json::value& val)
{
    if(val.has_field(U("iss")))
    {
        setIss(ModelBase::doubleFromJson(val[U("iss")]));
    }
    
}

void SalesLinesIn_taxDeductions::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_IssIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("iss"), m_Iss));
    }
    
}

void SalesLinesIn_taxDeductions::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("iss")))
    {
        setIss(ModelBase::doubleFromHttpContent(multipart->getContent(U("iss"))));
    }
    
}


double SalesLinesIn_taxDeductions::getIss() const
{
    return m_Iss;
}
void SalesLinesIn_taxDeductions::setIss(double value)
{
    m_Iss = value;
    m_IssIsSet = true;
}
bool SalesLinesIn_taxDeductions::issIsSet() const
{
    return m_IssIsSet;
}
void SalesLinesIn_taxDeductions::unsetIss()
{
    m_IssIsSet = false;
}

}
}
}
}
