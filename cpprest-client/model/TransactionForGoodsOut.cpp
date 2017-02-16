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



#include "TransactionForGoodsOut.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

TransactionForGoodsOut::TransactionForGoodsOut()
{
    m_HeaderIsSet = false;
    m_LinesIsSet = false;
    m_CalculatedTaxSummaryIsSet = false;
    m_ProcessingInfoIsSet = false;
    
}

TransactionForGoodsOut::~TransactionForGoodsOut()
{
}

void TransactionForGoodsOut::validate()
{
    // TODO: implement validation
}

web::json::value TransactionForGoodsOut::toJson() const
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

void TransactionForGoodsOut::fromJson(web::json::value& val)
{
    if(val.has_field(U("header")))
    {
        if(!val[U("header")].is_null())
        {
            std::shared_ptr<HeaderForGoods> newItem(new HeaderForGoods());
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
                m_Lines.push_back( std::shared_ptr<LineForGoods>(nullptr) );
            }
            else
            {
                std::shared_ptr<LineForGoods> newItem(new LineForGoods());
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
            std::shared_ptr<CalculatedTaxSummaryForGoods> newItem(new CalculatedTaxSummaryForGoods());
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

void TransactionForGoodsOut::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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

void TransactionForGoodsOut::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
            std::shared_ptr<HeaderForGoods> newItem(new HeaderForGoods());
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
                m_Lines.push_back( std::shared_ptr<LineForGoods>(nullptr) );
            }
            else
            {
                std::shared_ptr<LineForGoods> newItem(new LineForGoods());
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
            std::shared_ptr<CalculatedTaxSummaryForGoods> newItem(new CalculatedTaxSummaryForGoods());
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


std::shared_ptr<HeaderForGoods> TransactionForGoodsOut::getHeader() const
{
    return m_Header;
}
void TransactionForGoodsOut::setHeader(std::shared_ptr<HeaderForGoods> value)
{
    m_Header = value;
    m_HeaderIsSet = true;
}
bool TransactionForGoodsOut::headerIsSet() const
{
    return m_HeaderIsSet;
}
void TransactionForGoodsOut::unsetHeader()
{
    m_HeaderIsSet = false;
}
std::vector<std::shared_ptr<LineForGoods>>& TransactionForGoodsOut::getLines()
{
    return m_Lines;
}
bool TransactionForGoodsOut::linesIsSet() const
{
    return m_LinesIsSet;
}
void TransactionForGoodsOut::unsetLines()
{
    m_LinesIsSet = false;
}
std::shared_ptr<CalculatedTaxSummaryForGoods> TransactionForGoodsOut::getCalculatedTaxSummary() const
{
    return m_CalculatedTaxSummary;
}
void TransactionForGoodsOut::setCalculatedTaxSummary(std::shared_ptr<CalculatedTaxSummaryForGoods> value)
{
    m_CalculatedTaxSummary = value;
    m_CalculatedTaxSummaryIsSet = true;
}
bool TransactionForGoodsOut::calculatedTaxSummaryIsSet() const
{
    return m_CalculatedTaxSummaryIsSet;
}
void TransactionForGoodsOut::unsetCalculatedTaxSummary()
{
    m_CalculatedTaxSummaryIsSet = false;
}
std::shared_ptr<ProcessingInfo> TransactionForGoodsOut::getProcessingInfo() const
{
    return m_ProcessingInfo;
}
void TransactionForGoodsOut::setProcessingInfo(std::shared_ptr<ProcessingInfo> value)
{
    m_ProcessingInfo = value;
    m_ProcessingInfoIsSet = true;
}
bool TransactionForGoodsOut::processingInfoIsSet() const
{
    return m_ProcessingInfoIsSet;
}
void TransactionForGoodsOut::unsetProcessingInfo()
{
    m_ProcessingInfoIsSet = false;
}

}
}
}
}
