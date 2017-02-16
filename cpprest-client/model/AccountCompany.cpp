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



#include "AccountCompany.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

AccountCompany::AccountCompany()
{
    m_CompanyId = nullptr;
    m_CompanyCode = U("");
    m_CompanyName = U("");
    m_CompanyNameIsSet = false;
    
}

AccountCompany::~AccountCompany()
{
}

void AccountCompany::validate()
{
    // TODO: implement validation
}

web::json::value AccountCompany::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("companyId")] = ModelBase::toJson(m_CompanyId);
    val[U("companyCode")] = ModelBase::toJson(m_CompanyCode);
    if(m_CompanyNameIsSet)
    {
        val[U("companyName")] = ModelBase::toJson(m_CompanyName);
    }
    

    return val;
}

void AccountCompany::fromJson(web::json::value& val)
{
    setCompanyId(ModelBase::stringFromJson(val[U("companyId")]));
    setCompanyCode(ModelBase::stringFromJson(val[U("companyCode")]));
    if(val.has_field(U("companyName")))
    {
        setCompanyName(ModelBase::stringFromJson(val[U("companyName")]));
        
    }
    
}

void AccountCompany::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("companyId"), m_CompanyId));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("companyCode"), m_CompanyCode));
    if(m_CompanyNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("companyName"), m_CompanyName));
        
    }
    
}

void AccountCompany::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setCompanyId(ModelBase::stringFromHttpContent(multipart->getContent(U("companyId"))));
    setCompanyCode(ModelBase::stringFromHttpContent(multipart->getContent(U("companyCode"))));
    if(multipart->hasContent(U("companyName")))
    {
        setCompanyName(ModelBase::stringFromHttpContent(multipart->getContent(U("companyName"))));
        
    }
    
}


std::shared_ptr<UUID> AccountCompany::getCompanyId() const
{
    return m_CompanyId;
}
void AccountCompany::setCompanyId(std::shared_ptr<UUID> value)
{
    m_CompanyId = value;
    
}
utility::string_t AccountCompany::getCompanyCode() const
{
    return m_CompanyCode;
}
void AccountCompany::setCompanyCode(utility::string_t value)
{
    m_CompanyCode = value;
    
}
utility::string_t AccountCompany::getCompanyName() const
{
    return m_CompanyName;
}
void AccountCompany::setCompanyName(utility::string_t value)
{
    m_CompanyName = value;
    m_CompanyNameIsSet = true;
}
bool AccountCompany::companyNameIsSet() const
{
    return m_CompanyNameIsSet;
}
void AccountCompany::unsetCompanyName()
{
    m_CompanyNameIsSet = false;
}

}
}
}
}
