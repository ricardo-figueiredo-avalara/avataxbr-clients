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



#include "PaymentTransactionIn.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

PaymentTransactionIn::PaymentTransactionIn()
{
    m_HeaderIsSet = false;
    m_LinesIsSet = false;
    
}

PaymentTransactionIn::~PaymentTransactionIn()
{
}

void PaymentTransactionIn::validate()
{
    // TODO: implement validation
}

web::json::value PaymentTransactionIn::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_HeaderIsSet)
    {
        val[U("header")] = ModelBase::toJson(m_Header);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Lines )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("lines")] = web::json::value::array(jsonArray);
        }
    }
    

    return val;
}

void PaymentTransactionIn::fromJson(web::json::value& val)
{
    if(val.has_field(U("header")))
    {
        if(!val[U("header")].is_null())
        {
            std::shared_ptr<PayRecHeader> newItem(new PayRecHeader());
            newItem->fromJson(val[U("header")]);
            setHeader( newItem );
        }
        
    }
    {
        m_Lines.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("lines")))
        {
        for( auto& item : val[U("lines")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Lines.push_back( std::shared_ptr<PaymentLinesIn>(nullptr) );
            }
            else
            {
                std::shared_ptr<PaymentLinesIn> newItem(new PaymentLinesIn());
                newItem->fromJson(item);
                m_Lines.push_back( newItem );
            }
            
        }
        }
    }
    
}

void PaymentTransactionIn::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_HeaderIsSet)
    {
        if (m_Header.get())
        {
            m_Header->toMultipart(multipart, U("header."));
        }
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Lines )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("lines"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    
}

void PaymentTransactionIn::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("header")))
    {
        if(multipart->hasContent(U("header")))
        {
            std::shared_ptr<PayRecHeader> newItem(new PayRecHeader());
            newItem->fromMultiPart(multipart, U("header."));
            setHeader( newItem );
        }
        
    }
    {
        m_Lines.clear();
        if(multipart->hasContent(U("lines")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("lines"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Lines.push_back( std::shared_ptr<PaymentLinesIn>(nullptr) );
            }
            else
            {
                std::shared_ptr<PaymentLinesIn> newItem(new PaymentLinesIn());
                newItem->fromJson(item);
                m_Lines.push_back( newItem );
            }
            
        }
        }
    }
    
}


std::shared_ptr<PayRecHeader> PaymentTransactionIn::getHeader() const
{
    return m_Header;
}
void PaymentTransactionIn::setHeader(std::shared_ptr<PayRecHeader> value)
{
    m_Header = value;
    m_HeaderIsSet = true;
}
bool PaymentTransactionIn::headerIsSet() const
{
    return m_HeaderIsSet;
}
void PaymentTransactionIn::unsetHeader()
{
    m_HeaderIsSet = false;
}
std::vector<std::shared_ptr<PaymentLinesIn>>& PaymentTransactionIn::getLines()
{
    return m_Lines;
}
bool PaymentTransactionIn::linesIsSet() const
{
    return m_LinesIsSet;
}
void PaymentTransactionIn::unsetLines()
{
    m_LinesIsSet = false;
}

}
}
}
}

