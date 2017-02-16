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



#include "ServiceRendered.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

ServiceRendered::ServiceRendered()
{
    m_AddressIsSet = false;
    
}

ServiceRendered::~ServiceRendered()
{
}

void ServiceRendered::validate()
{
    // TODO: implement validation
}

web::json::value ServiceRendered::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_AddressIsSet)
    {
        val[U("address")] = ModelBase::toJson(m_Address);
    }
    

    return val;
}

void ServiceRendered::fromJson(web::json::value& val)
{
    if(val.has_field(U("address")))
    {
        if(!val[U("address")].is_null())
        {
            std::shared_ptr<SimpleAddress> newItem(new SimpleAddress());
            newItem->fromJson(val[U("address")]);
            setAddress( newItem );
        }
        
    }
    
}

void ServiceRendered::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_AddressIsSet)
    {
        if (m_Address.get())
        {
            m_Address->toMultipart(multipart, U("address."));
        }
        
    }
    
}

void ServiceRendered::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("address")))
    {
        if(multipart->hasContent(U("address")))
        {
            std::shared_ptr<SimpleAddress> newItem(new SimpleAddress());
            newItem->fromMultiPart(multipart, U("address."));
            setAddress( newItem );
        }
        
    }
    
}


std::shared_ptr<SimpleAddress> ServiceRendered::getAddress() const
{
    return m_Address;
}
void ServiceRendered::setAddress(std::shared_ptr<SimpleAddress> value)
{
    m_Address = value;
    m_AddressIsSet = true;
}
bool ServiceRendered::addressIsSet() const
{
    return m_AddressIsSet;
}
void ServiceRendered::unsetAddress()
{
    m_AddressIsSet = false;
}

}
}
}
}

