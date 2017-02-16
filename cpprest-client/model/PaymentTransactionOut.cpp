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



#include "PaymentTransactionOut.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

PaymentTransactionOut::PaymentTransactionOut()
{
    m_HeaderIsSet = false;
    m_LinesIsSet = false;
    m_CalculatedTaxSummaryIsSet = false;
    m_ProcessingInfoIsSet = false;
    
}

PaymentTransactionOut::~PaymentTransactionOut()
{
}

void PaymentTransactionOut::validate()
{
    // TODO: implement validation
}

web::json::value PaymentTransactionOut::toJson() const
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
    if(m_CalculatedTaxSummaryIsSet)
    {
        val[U("calculatedTaxSummary")] = ModelBase::toJson(m_CalculatedTaxSummary);
    }
    if(m_ProcessingInfoIsSet)
    {
        val[U("processingInfo")] = ModelBase::toJson(m_ProcessingInfo);
    }
    

    return val;
}

void PaymentTransactionOut::fromJson(web::json::value& val)
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
                m_Lines.push_back( std::shared_ptr<PayRecLinesOut>(nullptr) );
            }
            else
            {
                std::shared_ptr<PayRecLinesOut> newItem(new PayRecLinesOut());
                newItem->fromJson(item);
                m_Lines.push_back( newItem );
            }
            
        }
        }
    }
    if(val.has_field(U("calculatedTaxSummary")))
    {
        if(!val[U("calculatedTaxSummary")].is_null())
        {
            std::shared_ptr<PayRecCalculatedTaxSummaryForService> newItem(new PayRecCalculatedTaxSummaryForService());
            newItem->fromJson(val[U("calculatedTaxSummary")]);
            setCalculatedTaxSummary( newItem );
        }
        
    }
    if(val.has_field(U("processingInfo")))
    {
        if(!val[U("processingInfo")].is_null())
        {
            std::shared_ptr<ProcessingInfo> newItem(new ProcessingInfo());
            newItem->fromJson(val[U("processingInfo")]);
            setProcessingInfo( newItem );
        }
        
    }
    
}

void PaymentTransactionOut::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_CalculatedTaxSummaryIsSet)
    {
        if (m_CalculatedTaxSummary.get())
        {
            m_CalculatedTaxSummary->toMultipart(multipart, U("calculatedTaxSummary."));
        }
        
    }
    if(m_ProcessingInfoIsSet)
    {
        if (m_ProcessingInfo.get())
        {
            m_ProcessingInfo->toMultipart(multipart, U("processingInfo."));
        }
        
    }
    
}

void PaymentTransactionOut::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
                m_Lines.push_back( std::shared_ptr<PayRecLinesOut>(nullptr) );
            }
            else
            {
                std::shared_ptr<PayRecLinesOut> newItem(new PayRecLinesOut());
                newItem->fromJson(item);
                m_Lines.push_back( newItem );
            }
            
        }
        }
    }
    if(multipart->hasContent(U("calculatedTaxSummary")))
    {
        if(multipart->hasContent(U("calculatedTaxSummary")))
        {
            std::shared_ptr<PayRecCalculatedTaxSummaryForService> newItem(new PayRecCalculatedTaxSummaryForService());
            newItem->fromMultiPart(multipart, U("calculatedTaxSummary."));
            setCalculatedTaxSummary( newItem );
        }
        
    }
    if(multipart->hasContent(U("processingInfo")))
    {
        if(multipart->hasContent(U("processingInfo")))
        {
            std::shared_ptr<ProcessingInfo> newItem(new ProcessingInfo());
            newItem->fromMultiPart(multipart, U("processingInfo."));
            setProcessingInfo( newItem );
        }
        
    }
    
}


std::shared_ptr<PayRecHeader> PaymentTransactionOut::getHeader() const
{
    return m_Header;
}
void PaymentTransactionOut::setHeader(std::shared_ptr<PayRecHeader> value)
{
    m_Header = value;
    m_HeaderIsSet = true;
}
bool PaymentTransactionOut::headerIsSet() const
{
    return m_HeaderIsSet;
}
void PaymentTransactionOut::unsetHeader()
{
    m_HeaderIsSet = false;
}
std::vector<std::shared_ptr<PayRecLinesOut>>& PaymentTransactionOut::getLines()
{
    return m_Lines;
}
bool PaymentTransactionOut::linesIsSet() const
{
    return m_LinesIsSet;
}
void PaymentTransactionOut::unsetLines()
{
    m_LinesIsSet = false;
}
std::shared_ptr<PayRecCalculatedTaxSummaryForService> PaymentTransactionOut::getCalculatedTaxSummary() const
{
    return m_CalculatedTaxSummary;
}
void PaymentTransactionOut::setCalculatedTaxSummary(std::shared_ptr<PayRecCalculatedTaxSummaryForService> value)
{
    m_CalculatedTaxSummary = value;
    m_CalculatedTaxSummaryIsSet = true;
}
bool PaymentTransactionOut::calculatedTaxSummaryIsSet() const
{
    return m_CalculatedTaxSummaryIsSet;
}
void PaymentTransactionOut::unsetCalculatedTaxSummary()
{
    m_CalculatedTaxSummaryIsSet = false;
}
std::shared_ptr<ProcessingInfo> PaymentTransactionOut::getProcessingInfo() const
{
    return m_ProcessingInfo;
}
void PaymentTransactionOut::setProcessingInfo(std::shared_ptr<ProcessingInfo> value)
{
    m_ProcessingInfo = value;
    m_ProcessingInfoIsSet = true;
}
bool PaymentTransactionOut::processingInfoIsSet() const
{
    return m_ProcessingInfoIsSet;
}
void PaymentTransactionOut::unsetProcessingInfo()
{
    m_ProcessingInfoIsSet = false;
}

}
}
}
}
