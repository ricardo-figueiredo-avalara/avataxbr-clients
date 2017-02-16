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



#include "PurchaseHeaderIn_payment.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

PurchaseHeaderIn_payment::PurchaseHeaderIn_payment()
{
    m_TermsIsSet = false;
    m_InstallmentsIsSet = false;
    
}

PurchaseHeaderIn_payment::~PurchaseHeaderIn_payment()
{
}

void PurchaseHeaderIn_payment::validate()
{
    // TODO: implement validation
}

web::json::value PurchaseHeaderIn_payment::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_TermsIsSet)
    {
        val[U("terms")] = ModelBase::toJson(m_Terms);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Installments )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("installments")] = web::json::value::array(jsonArray);
        }
    }
    

    return val;
}

void PurchaseHeaderIn_payment::fromJson(web::json::value& val)
{
    if(val.has_field(U("terms")))
    {
        if(!val[U("terms")].is_null())
        {
            std::shared_ptr<PaymentTerms> newItem(new PaymentTerms());
            newItem->fromJson(val[U("terms")]);
            setTerms( newItem );
        }
        
    }
    {
        m_Installments.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("installments")))
        {
        for( auto& item : val[U("installments")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Installments.push_back( std::shared_ptr<PurchaseInstallmentIn>(nullptr) );
            }
            else
            {
                std::shared_ptr<PurchaseInstallmentIn> newItem(new PurchaseInstallmentIn());
                newItem->fromJson(item);
                m_Installments.push_back( newItem );
            }
            
        }
        }
    }
    
}

void PurchaseHeaderIn_payment::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_TermsIsSet)
    {
        if (m_Terms.get())
        {
            m_Terms->toMultipart(multipart, U("terms."));
        }
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Installments )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("installments"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    
}

void PurchaseHeaderIn_payment::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("terms")))
    {
        if(multipart->hasContent(U("terms")))
        {
            std::shared_ptr<PaymentTerms> newItem(new PaymentTerms());
            newItem->fromMultiPart(multipart, U("terms."));
            setTerms( newItem );
        }
        
    }
    {
        m_Installments.clear();
        if(multipart->hasContent(U("installments")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("installments"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Installments.push_back( std::shared_ptr<PurchaseInstallmentIn>(nullptr) );
            }
            else
            {
                std::shared_ptr<PurchaseInstallmentIn> newItem(new PurchaseInstallmentIn());
                newItem->fromJson(item);
                m_Installments.push_back( newItem );
            }
            
        }
        }
    }
    
}


std::shared_ptr<PaymentTerms> PurchaseHeaderIn_payment::getTerms() const
{
    return m_Terms;
}
void PurchaseHeaderIn_payment::setTerms(std::shared_ptr<PaymentTerms> value)
{
    m_Terms = value;
    m_TermsIsSet = true;
}
bool PurchaseHeaderIn_payment::termsIsSet() const
{
    return m_TermsIsSet;
}
void PurchaseHeaderIn_payment::unsetTerms()
{
    m_TermsIsSet = false;
}
std::vector<std::shared_ptr<PurchaseInstallmentIn>>& PurchaseHeaderIn_payment::getInstallments()
{
    return m_Installments;
}
bool PurchaseHeaderIn_payment::installmentsIsSet() const
{
    return m_InstallmentsIsSet;
}
void PurchaseHeaderIn_payment::unsetInstallments()
{
    m_InstallmentsIsSet = false;
}

}
}
}
}
