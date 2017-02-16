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



#include "Payment_paymentMode.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Payment_paymentMode::Payment_paymentMode()
{
    m_Mode = U("");
    m_Value = 0.0;
    m_CardTpIntegration = U("");
    m_CardTpIntegrationIsSet = false;
    m_CardCNPJ = U("");
    m_CardCNPJIsSet = false;
    m_CardBrand = U("");
    m_CardBrandIsSet = false;
    m_CardAuthorization = U("");
    m_CardAuthorizationIsSet = false;
    
}

Payment_paymentMode::~Payment_paymentMode()
{
}

void Payment_paymentMode::validate()
{
    // TODO: implement validation
}

web::json::value Payment_paymentMode::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("mode")] = ModelBase::toJson(m_Mode);
    val[U("value")] = ModelBase::toJson(m_Value);
    if(m_CardTpIntegrationIsSet)
    {
        val[U("cardTpIntegration")] = ModelBase::toJson(m_CardTpIntegration);
    }
    if(m_CardCNPJIsSet)
    {
        val[U("cardCNPJ")] = ModelBase::toJson(m_CardCNPJ);
    }
    if(m_CardBrandIsSet)
    {
        val[U("cardBrand")] = ModelBase::toJson(m_CardBrand);
    }
    if(m_CardAuthorizationIsSet)
    {
        val[U("cardAuthorization")] = ModelBase::toJson(m_CardAuthorization);
    }
    

    return val;
}

void Payment_paymentMode::fromJson(web::json::value& val)
{
    setMode(ModelBase::stringFromJson(val[U("mode")]));
    setValue(ModelBase::doubleFromJson(val[U("value")]));
    if(val.has_field(U("cardTpIntegration")))
    {
        setCardTpIntegration(ModelBase::stringFromJson(val[U("cardTpIntegration")]));
        
    }
    if(val.has_field(U("cardCNPJ")))
    {
        setCardCNPJ(ModelBase::stringFromJson(val[U("cardCNPJ")]));
        
    }
    if(val.has_field(U("cardBrand")))
    {
        setCardBrand(ModelBase::stringFromJson(val[U("cardBrand")]));
        
    }
    if(val.has_field(U("cardAuthorization")))
    {
        setCardAuthorization(ModelBase::stringFromJson(val[U("cardAuthorization")]));
        
    }
    
}

void Payment_paymentMode::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("mode"), m_Mode));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("value"), m_Value));
    if(m_CardTpIntegrationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cardTpIntegration"), m_CardTpIntegration));
        
    }
    if(m_CardCNPJIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cardCNPJ"), m_CardCNPJ));
        
    }
    if(m_CardBrandIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cardBrand"), m_CardBrand));
        
    }
    if(m_CardAuthorizationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cardAuthorization"), m_CardAuthorization));
        
    }
    
}

void Payment_paymentMode::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setMode(ModelBase::stringFromHttpContent(multipart->getContent(U("mode"))));
    setValue(ModelBase::doubleFromHttpContent(multipart->getContent(U("value"))));
    if(multipart->hasContent(U("cardTpIntegration")))
    {
        setCardTpIntegration(ModelBase::stringFromHttpContent(multipart->getContent(U("cardTpIntegration"))));
        
    }
    if(multipart->hasContent(U("cardCNPJ")))
    {
        setCardCNPJ(ModelBase::stringFromHttpContent(multipart->getContent(U("cardCNPJ"))));
        
    }
    if(multipart->hasContent(U("cardBrand")))
    {
        setCardBrand(ModelBase::stringFromHttpContent(multipart->getContent(U("cardBrand"))));
        
    }
    if(multipart->hasContent(U("cardAuthorization")))
    {
        setCardAuthorization(ModelBase::stringFromHttpContent(multipart->getContent(U("cardAuthorization"))));
        
    }
    
}


utility::string_t Payment_paymentMode::getMode() const
{
    return m_Mode;
}
void Payment_paymentMode::setMode(utility::string_t value)
{
    m_Mode = value;
    
}
double Payment_paymentMode::getValue() const
{
    return m_Value;
}
void Payment_paymentMode::setValue(double value)
{
    m_Value = value;
    
}
utility::string_t Payment_paymentMode::getCardTpIntegration() const
{
    return m_CardTpIntegration;
}
void Payment_paymentMode::setCardTpIntegration(utility::string_t value)
{
    m_CardTpIntegration = value;
    m_CardTpIntegrationIsSet = true;
}
bool Payment_paymentMode::cardTpIntegrationIsSet() const
{
    return m_CardTpIntegrationIsSet;
}
void Payment_paymentMode::unsetCardTpIntegration()
{
    m_CardTpIntegrationIsSet = false;
}
utility::string_t Payment_paymentMode::getCardCNPJ() const
{
    return m_CardCNPJ;
}
void Payment_paymentMode::setCardCNPJ(utility::string_t value)
{
    m_CardCNPJ = value;
    m_CardCNPJIsSet = true;
}
bool Payment_paymentMode::cardCNPJIsSet() const
{
    return m_CardCNPJIsSet;
}
void Payment_paymentMode::unsetCardCNPJ()
{
    m_CardCNPJIsSet = false;
}
utility::string_t Payment_paymentMode::getCardBrand() const
{
    return m_CardBrand;
}
void Payment_paymentMode::setCardBrand(utility::string_t value)
{
    m_CardBrand = value;
    m_CardBrandIsSet = true;
}
bool Payment_paymentMode::cardBrandIsSet() const
{
    return m_CardBrandIsSet;
}
void Payment_paymentMode::unsetCardBrand()
{
    m_CardBrandIsSet = false;
}
utility::string_t Payment_paymentMode::getCardAuthorization() const
{
    return m_CardAuthorization;
}
void Payment_paymentMode::setCardAuthorization(utility::string_t value)
{
    m_CardAuthorization = value;
    m_CardAuthorizationIsSet = true;
}
bool Payment_paymentMode::cardAuthorizationIsSet() const
{
    return m_CardAuthorizationIsSet;
}
void Payment_paymentMode::unsetCardAuthorization()
{
    m_CardAuthorizationIsSet = false;
}

}
}
}
}

