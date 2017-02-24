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



#include "Company_authorizedToDownloadNFe.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Company_authorizedToDownloadNFe::Company_authorizedToDownloadNFe()
{
    m_FederalTaxId = U("");
    m_FederalTaxIdIsSet = false;
    
}

Company_authorizedToDownloadNFe::~Company_authorizedToDownloadNFe()
{
}

void Company_authorizedToDownloadNFe::validate()
{
    // TODO: implement validation
}

web::json::value Company_authorizedToDownloadNFe::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_FederalTaxIdIsSet)
    {
        val[U("federalTaxId")] = ModelBase::toJson(m_FederalTaxId);
    }
    

    return val;
}

void Company_authorizedToDownloadNFe::fromJson(web::json::value& val)
{
    if(val.has_field(U("federalTaxId")))
    {
        setFederalTaxId(ModelBase::stringFromJson(val[U("federalTaxId")]));
        
    }
    
}

void Company_authorizedToDownloadNFe::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_FederalTaxIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("federalTaxId"), m_FederalTaxId));
        
    }
    
}

void Company_authorizedToDownloadNFe::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("federalTaxId")))
    {
        setFederalTaxId(ModelBase::stringFromHttpContent(multipart->getContent(U("federalTaxId"))));
        
    }
    
}


utility::string_t Company_authorizedToDownloadNFe::getFederalTaxId() const
{
    return m_FederalTaxId;
}
void Company_authorizedToDownloadNFe::setFederalTaxId(utility::string_t value)
{
    m_FederalTaxId = value;
    m_FederalTaxIdIsSet = true;
}
bool Company_authorizedToDownloadNFe::federalTaxIdIsSet() const
{
    return m_FederalTaxIdIsSet;
}
void Company_authorizedToDownloadNFe::unsetFederalTaxId()
{
    m_FederalTaxIdIsSet = false;
}

}
}
}
}

