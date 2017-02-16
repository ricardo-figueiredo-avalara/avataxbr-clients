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



#include "IssConfServiceList_taxRate.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

IssConfServiceList_taxRate::IssConfServiceList_taxRate()
{
    m_ISSIsSet = false;
    m_ISS_RFIsSet = false;
    m_ISS_EIsSet = false;
    m_ISS_IIsSet = false;
    m_IbptIsSet = false;
    
}

IssConfServiceList_taxRate::~IssConfServiceList_taxRate()
{
}

void IssConfServiceList_taxRate::validate()
{
    // TODO: implement validation
}

web::json::value IssConfServiceList_taxRate::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_ISSIsSet)
    {
        val[U("ISS")] = ModelBase::toJson(m_ISS);
    }
    if(m_ISS_RFIsSet)
    {
        val[U("ISS_RF")] = ModelBase::toJson(m_ISS_RF);
    }
    if(m_ISS_EIsSet)
    {
        val[U("ISS_E")] = ModelBase::toJson(m_ISS_E);
    }
    if(m_ISS_IIsSet)
    {
        val[U("ISS_I")] = ModelBase::toJson(m_ISS_I);
    }
    if(m_IbptIsSet)
    {
        val[U("ibpt")] = ModelBase::toJson(m_Ibpt);
    }
    

    return val;
}

void IssConfServiceList_taxRate::fromJson(web::json::value& val)
{
    if(val.has_field(U("ISS")))
    {
        if(!val[U("ISS")].is_null())
        {
            std::shared_ptr<ServiceItemTaxRate> newItem(new ServiceItemTaxRate());
            newItem->fromJson(val[U("ISS")]);
            setISS( newItem );
        }
        
    }
    if(val.has_field(U("ISS_RF")))
    {
        if(!val[U("ISS_RF")].is_null())
        {
            std::shared_ptr<ServiceItemTaxRate> newItem(new ServiceItemTaxRate());
            newItem->fromJson(val[U("ISS_RF")]);
            setISSRF( newItem );
        }
        
    }
    if(val.has_field(U("ISS_E")))
    {
        if(!val[U("ISS_E")].is_null())
        {
            std::shared_ptr<ServiceItemTaxRate> newItem(new ServiceItemTaxRate());
            newItem->fromJson(val[U("ISS_E")]);
            setISSE( newItem );
        }
        
    }
    if(val.has_field(U("ISS_I")))
    {
        if(!val[U("ISS_I")].is_null())
        {
            std::shared_ptr<ServiceItemTaxRate> newItem(new ServiceItemTaxRate());
            newItem->fromJson(val[U("ISS_I")]);
            setISSI( newItem );
        }
        
    }
    if(val.has_field(U("ibpt")))
    {
        if(!val[U("ibpt")].is_null())
        {
            std::shared_ptr<IssConfServiceList_taxRate_ibpt> newItem(new IssConfServiceList_taxRate_ibpt());
            newItem->fromJson(val[U("ibpt")]);
            setIbpt( newItem );
        }
        
    }
    
}

void IssConfServiceList_taxRate::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_ISSIsSet)
    {
        if (m_ISS.get())
        {
            m_ISS->toMultipart(multipart, U("ISS."));
        }
        
    }
    if(m_ISS_RFIsSet)
    {
        if (m_ISS_RF.get())
        {
            m_ISS_RF->toMultipart(multipart, U("ISS_RF."));
        }
        
    }
    if(m_ISS_EIsSet)
    {
        if (m_ISS_E.get())
        {
            m_ISS_E->toMultipart(multipart, U("ISS_E."));
        }
        
    }
    if(m_ISS_IIsSet)
    {
        if (m_ISS_I.get())
        {
            m_ISS_I->toMultipart(multipart, U("ISS_I."));
        }
        
    }
    if(m_IbptIsSet)
    {
        if (m_Ibpt.get())
        {
            m_Ibpt->toMultipart(multipart, U("ibpt."));
        }
        
    }
    
}

void IssConfServiceList_taxRate::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("ISS")))
    {
        if(multipart->hasContent(U("ISS")))
        {
            std::shared_ptr<ServiceItemTaxRate> newItem(new ServiceItemTaxRate());
            newItem->fromMultiPart(multipart, U("ISS."));
            setISS( newItem );
        }
        
    }
    if(multipart->hasContent(U("ISS_RF")))
    {
        if(multipart->hasContent(U("ISS_RF")))
        {
            std::shared_ptr<ServiceItemTaxRate> newItem(new ServiceItemTaxRate());
            newItem->fromMultiPart(multipart, U("ISS_RF."));
            setISSRF( newItem );
        }
        
    }
    if(multipart->hasContent(U("ISS_E")))
    {
        if(multipart->hasContent(U("ISS_E")))
        {
            std::shared_ptr<ServiceItemTaxRate> newItem(new ServiceItemTaxRate());
            newItem->fromMultiPart(multipart, U("ISS_E."));
            setISSE( newItem );
        }
        
    }
    if(multipart->hasContent(U("ISS_I")))
    {
        if(multipart->hasContent(U("ISS_I")))
        {
            std::shared_ptr<ServiceItemTaxRate> newItem(new ServiceItemTaxRate());
            newItem->fromMultiPart(multipart, U("ISS_I."));
            setISSI( newItem );
        }
        
    }
    if(multipart->hasContent(U("ibpt")))
    {
        if(multipart->hasContent(U("ibpt")))
        {
            std::shared_ptr<IssConfServiceList_taxRate_ibpt> newItem(new IssConfServiceList_taxRate_ibpt());
            newItem->fromMultiPart(multipart, U("ibpt."));
            setIbpt( newItem );
        }
        
    }
    
}


std::shared_ptr<ServiceItemTaxRate> IssConfServiceList_taxRate::getISS() const
{
    return m_ISS;
}
void IssConfServiceList_taxRate::setISS(std::shared_ptr<ServiceItemTaxRate> value)
{
    m_ISS = value;
    m_ISSIsSet = true;
}
bool IssConfServiceList_taxRate::ISSIsSet() const
{
    return m_ISSIsSet;
}
void IssConfServiceList_taxRate::unsetISS()
{
    m_ISSIsSet = false;
}
std::shared_ptr<ServiceItemTaxRate> IssConfServiceList_taxRate::getISSRF() const
{
    return m_ISS_RF;
}
void IssConfServiceList_taxRate::setISSRF(std::shared_ptr<ServiceItemTaxRate> value)
{
    m_ISS_RF = value;
    m_ISS_RFIsSet = true;
}
bool IssConfServiceList_taxRate::ISS_RFIsSet() const
{
    return m_ISS_RFIsSet;
}
void IssConfServiceList_taxRate::unsetISS_RF()
{
    m_ISS_RFIsSet = false;
}
std::shared_ptr<ServiceItemTaxRate> IssConfServiceList_taxRate::getISSE() const
{
    return m_ISS_E;
}
void IssConfServiceList_taxRate::setISSE(std::shared_ptr<ServiceItemTaxRate> value)
{
    m_ISS_E = value;
    m_ISS_EIsSet = true;
}
bool IssConfServiceList_taxRate::ISS_EIsSet() const
{
    return m_ISS_EIsSet;
}
void IssConfServiceList_taxRate::unsetISS_E()
{
    m_ISS_EIsSet = false;
}
std::shared_ptr<ServiceItemTaxRate> IssConfServiceList_taxRate::getISSI() const
{
    return m_ISS_I;
}
void IssConfServiceList_taxRate::setISSI(std::shared_ptr<ServiceItemTaxRate> value)
{
    m_ISS_I = value;
    m_ISS_IIsSet = true;
}
bool IssConfServiceList_taxRate::ISS_IIsSet() const
{
    return m_ISS_IIsSet;
}
void IssConfServiceList_taxRate::unsetISS_I()
{
    m_ISS_IIsSet = false;
}
std::shared_ptr<IssConfServiceList_taxRate_ibpt> IssConfServiceList_taxRate::getIbpt() const
{
    return m_Ibpt;
}
void IssConfServiceList_taxRate::setIbpt(std::shared_ptr<IssConfServiceList_taxRate_ibpt> value)
{
    m_Ibpt = value;
    m_IbptIsSet = true;
}
bool IssConfServiceList_taxRate::ibptIsSet() const
{
    return m_IbptIsSet;
}
void IssConfServiceList_taxRate::unsetIbpt()
{
    m_IbptIsSet = false;
}

}
}
}
}

