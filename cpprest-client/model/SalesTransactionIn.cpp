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



#include "SalesTransactionIn.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

SalesTransactionIn::SalesTransactionIn()
{
    
}

SalesTransactionIn::~SalesTransactionIn()
{
}

void SalesTransactionIn::validate()
{
    // TODO: implement validation
}

web::json::value SalesTransactionIn::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("header")] = ModelBase::toJson(m_Header);
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Lines )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val[U("lines")] = web::json::value::array(jsonArray);
            }
    

    return val;
}

void SalesTransactionIn::fromJson(web::json::value& val)
{
    std::shared_ptr<SalesHeaderIn> newHeader(new SalesHeaderIn());
    newHeader->fromJson(val[U("header")]);
    setHeader( newItem );
    {
        m_Lines.clear();
        std::vector<web::json::value> jsonArray;
                for( auto& item : val[U("lines")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Lines.push_back( std::shared_ptr<SalesLinesIn>(nullptr) );
            }
            else
            {
                std::shared_ptr<SalesLinesIn> newItem(new SalesLinesIn());
                newItem->fromJson(item);
                m_Lines.push_back( newItem );
            }
            
        }
    }
    
}

void SalesTransactionIn::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    m_Header->toMultipart(multipart, U("header."));
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Lines )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lines"), web::json::value::array(jsonArray), U("application/json")));
            }
    
}

void SalesTransactionIn::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    std::shared_ptr<SalesHeaderIn> newHeader(new SalesHeaderIn());
    newHeader->fromMultiPart(multipart, U("header."));
    setHeader( newHeader );
    {
        m_Lines.clear();
        
        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("lines"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Lines.push_back( std::shared_ptr<SalesLinesIn>(nullptr) );
            }
            else
            {
                std::shared_ptr<SalesLinesIn> newItem(new SalesLinesIn());
                newItem->fromJson(item);
                m_Lines.push_back( newItem );
            }
            
        }
    }
    
}


std::shared_ptr<SalesHeaderIn> SalesTransactionIn::getHeader() const
{
    return m_Header;
}
void SalesTransactionIn::setHeader(std::shared_ptr<SalesHeaderIn> value)
{
    m_Header = value;
    
}
std::vector<std::shared_ptr<SalesLinesIn>>& SalesTransactionIn::getLines()
{
    return m_Lines;
}

}
}
}
}
