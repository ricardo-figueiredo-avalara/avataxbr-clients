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



#include "SefazItGetOut.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

SefazItGetOut::SefazItGetOut()
{
    m_Key = U("");
    m_KeyIsSet = false;
    m_Xml = U("");
    m_XmlIsSet = false;
    m_StatusIsSet = false;
    
}

SefazItGetOut::~SefazItGetOut()
{
}

void SefazItGetOut::validate()
{
    // TODO: implement validation
}

web::json::value SefazItGetOut::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_KeyIsSet)
    {
        val[U("key")] = ModelBase::toJson(m_Key);
    }
    if(m_XmlIsSet)
    {
        val[U("xml")] = ModelBase::toJson(m_Xml);
    }
    if(m_StatusIsSet)
    {
        val[U("status")] = ModelBase::toJson(m_Status);
    }
    

    return val;
}

void SefazItGetOut::fromJson(web::json::value& val)
{
    if(val.has_field(U("key")))
    {
        setKey(ModelBase::stringFromJson(val[U("key")]));
        
    }
    if(val.has_field(U("xml")))
    {
        setXml(ModelBase::stringFromJson(val[U("xml")]));
        
    }
    if(val.has_field(U("status")))
    {
        if(!val[U("status")].is_null())
        {
            std::shared_ptr<SefazInvoiceStatus> newItem(new SefazInvoiceStatus());
            newItem->fromJson(val[U("status")]);
            setStatus( newItem );
        }
        
    }
    
}

void SefazItGetOut::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_KeyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("key"), m_Key));
        
    }
    if(m_XmlIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("xml"), m_Xml));
        
    }
    if(m_StatusIsSet)
    {
        if (m_Status.get())
        {
            m_Status->toMultipart(multipart, U("status."));
        }
        
    }
    
}

void SefazItGetOut::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("key")))
    {
        setKey(ModelBase::stringFromHttpContent(multipart->getContent(U("key"))));
        
    }
    if(multipart->hasContent(U("xml")))
    {
        setXml(ModelBase::stringFromHttpContent(multipart->getContent(U("xml"))));
        
    }
    if(multipart->hasContent(U("status")))
    {
        if(multipart->hasContent(U("status")))
        {
            std::shared_ptr<SefazInvoiceStatus> newItem(new SefazInvoiceStatus());
            newItem->fromMultiPart(multipart, U("status."));
            setStatus( newItem );
        }
        
    }
    
}


utility::string_t SefazItGetOut::getKey() const
{
    return m_Key;
}
void SefazItGetOut::setKey(utility::string_t value)
{
    m_Key = value;
    m_KeyIsSet = true;
}
bool SefazItGetOut::keyIsSet() const
{
    return m_KeyIsSet;
}
void SefazItGetOut::unsetKey()
{
    m_KeyIsSet = false;
}
utility::string_t SefazItGetOut::getXml() const
{
    return m_Xml;
}
void SefazItGetOut::setXml(utility::string_t value)
{
    m_Xml = value;
    m_XmlIsSet = true;
}
bool SefazItGetOut::xmlIsSet() const
{
    return m_XmlIsSet;
}
void SefazItGetOut::unsetXml()
{
    m_XmlIsSet = false;
}
std::shared_ptr<SefazInvoiceStatus> SefazItGetOut::getStatus() const
{
    return m_Status;
}
void SefazItGetOut::setStatus(std::shared_ptr<SefazInvoiceStatus> value)
{
    m_Status = value;
    m_StatusIsSet = true;
}
bool SefazItGetOut::statusIsSet() const
{
    return m_StatusIsSet;
}
void SefazItGetOut::unsetStatus()
{
    m_StatusIsSet = false;
}

}
}
}
}
