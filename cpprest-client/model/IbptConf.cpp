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



#include "IbptConf.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

IbptConf::IbptConf()
{
    m_Code = U("");
    m_CodeIsSet = false;
    m_Description = U("");
    m_DescriptionIsSet = false;
    m_ListIsSet = false;
    
}

IbptConf::~IbptConf()
{
}

void IbptConf::validate()
{
    // TODO: implement validation
}

web::json::value IbptConf::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CodeIsSet)
    {
        val[U("code")] = ModelBase::toJson(m_Code);
    }
    if(m_DescriptionIsSet)
    {
        val[U("description")] = ModelBase::toJson(m_Description);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_List )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("list")] = web::json::value::array(jsonArray);
        }
    }
    

    return val;
}

void IbptConf::fromJson(web::json::value& val)
{
    if(val.has_field(U("code")))
    {
        setCode(ModelBase::stringFromJson(val[U("code")]));
        
    }
    if(val.has_field(U("description")))
    {
        setDescription(ModelBase::stringFromJson(val[U("description")]));
        
    }
    {
        m_List.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("list")))
        {
        for( auto& item : val[U("list")].as_array() )
        {
            
            if(item.is_null())
            {
                m_List.push_back( std::shared_ptr<IpbtConfItem>(nullptr) );
            }
            else
            {
                std::shared_ptr<IpbtConfItem> newItem(new IpbtConfItem());
                newItem->fromJson(item);
                m_List.push_back( newItem );
            }
            
        }
        }
    }
    
}

void IbptConf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_CodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("code"), m_Code));
        
    }
    if(m_DescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("description"), m_Description));
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_List )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("list"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    
}

void IbptConf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("code")))
    {
        setCode(ModelBase::stringFromHttpContent(multipart->getContent(U("code"))));
        
    }
    if(multipart->hasContent(U("description")))
    {
        setDescription(ModelBase::stringFromHttpContent(multipart->getContent(U("description"))));
        
    }
    {
        m_List.clear();
        if(multipart->hasContent(U("list")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("list"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_List.push_back( std::shared_ptr<IpbtConfItem>(nullptr) );
            }
            else
            {
                std::shared_ptr<IpbtConfItem> newItem(new IpbtConfItem());
                newItem->fromJson(item);
                m_List.push_back( newItem );
            }
            
        }
        }
    }
    
}


utility::string_t IbptConf::getCode() const
{
    return m_Code;
}
void IbptConf::setCode(utility::string_t value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool IbptConf::codeIsSet() const
{
    return m_CodeIsSet;
}
void IbptConf::unsetCode()
{
    m_CodeIsSet = false;
}
utility::string_t IbptConf::getDescription() const
{
    return m_Description;
}
void IbptConf::setDescription(utility::string_t value)
{
    m_Description = value;
    m_DescriptionIsSet = true;
}
bool IbptConf::descriptionIsSet() const
{
    return m_DescriptionIsSet;
}
void IbptConf::unsetDescription()
{
    m_DescriptionIsSet = false;
}
std::vector<std::shared_ptr<IpbtConfItem>>& IbptConf::getList()
{
    return m_List;
}
bool IbptConf::listIsSet() const
{
    return m_ListIsSet;
}
void IbptConf::unsetList()
{
    m_ListIsSet = false;
}

}
}
}
}
