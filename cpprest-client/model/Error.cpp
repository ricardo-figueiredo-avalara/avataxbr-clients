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



#include "Error.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Error::Error()
{
    m_Code = 0;
    m_CodeIsSet = false;
    m_Message = U("");
    m_Field = U("");
    m_FieldIsSet = false;
    m_Value = U("");
    m_ValueIsSet = false;
    m_In = U("");
    m_InIsSet = false;
    
}

Error::~Error()
{
}

void Error::validate()
{
    // TODO: implement validation
}

web::json::value Error::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CodeIsSet)
    {
        val[U("code")] = ModelBase::toJson(m_Code);
    }
    val[U("message")] = ModelBase::toJson(m_Message);
    if(m_FieldIsSet)
    {
        val[U("field")] = ModelBase::toJson(m_Field);
    }
    if(m_ValueIsSet)
    {
        val[U("value")] = ModelBase::toJson(m_Value);
    }
    if(m_InIsSet)
    {
        val[U("in")] = ModelBase::toJson(m_In);
    }
    

    return val;
}

void Error::fromJson(web::json::value& val)
{
    if(val.has_field(U("code")))
    {
        setCode(ModelBase::int32_tFromJson(val[U("code")]));
    }
    setMessage(ModelBase::stringFromJson(val[U("message")]));
    if(val.has_field(U("field")))
    {
        setField(ModelBase::stringFromJson(val[U("field")]));
        
    }
    if(val.has_field(U("value")))
    {
        setValue(ModelBase::stringFromJson(val[U("value")]));
        
    }
    if(val.has_field(U("in")))
    {
        setIn(ModelBase::stringFromJson(val[U("in")]));
        
    }
    
}

void Error::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    multipart->add(ModelBase::toHttpContent(namePrefix + U("message"), m_Message));
    if(m_FieldIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("field"), m_Field));
        
    }
    if(m_ValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("value"), m_Value));
        
    }
    if(m_InIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("in"), m_In));
        
    }
    
}

void Error::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("code")))
    {
        setCode(ModelBase::int32_tFromHttpContent(multipart->getContent(U("code"))));
    }
    setMessage(ModelBase::stringFromHttpContent(multipart->getContent(U("message"))));
    if(multipart->hasContent(U("field")))
    {
        setField(ModelBase::stringFromHttpContent(multipart->getContent(U("field"))));
        
    }
    if(multipart->hasContent(U("value")))
    {
        setValue(ModelBase::stringFromHttpContent(multipart->getContent(U("value"))));
        
    }
    if(multipart->hasContent(U("in")))
    {
        setIn(ModelBase::stringFromHttpContent(multipart->getContent(U("in"))));
        
    }
    
}


int32_t Error::getCode() const
{
    return m_Code;
}
void Error::setCode(int32_t value)
{
    m_Code = value;
    m_CodeIsSet = true;
}
bool Error::codeIsSet() const
{
    return m_CodeIsSet;
}
void Error::unsetCode()
{
    m_CodeIsSet = false;
}
utility::string_t Error::getMessage() const
{
    return m_Message;
}
void Error::setMessage(utility::string_t value)
{
    m_Message = value;
    
}
utility::string_t Error::getField() const
{
    return m_Field;
}
void Error::setField(utility::string_t value)
{
    m_Field = value;
    m_FieldIsSet = true;
}
bool Error::fieldIsSet() const
{
    return m_FieldIsSet;
}
void Error::unsetField()
{
    m_FieldIsSet = false;
}
utility::string_t Error::getValue() const
{
    return m_Value;
}
void Error::setValue(utility::string_t value)
{
    m_Value = value;
    m_ValueIsSet = true;
}
bool Error::valueIsSet() const
{
    return m_ValueIsSet;
}
void Error::unsetValue()
{
    m_ValueIsSet = false;
}
utility::string_t Error::getIn() const
{
    return m_In;
}
void Error::setIn(utility::string_t value)
{
    m_In = value;
    m_InIsSet = true;
}
bool Error::inIsSet() const
{
    return m_InIsSet;
}
void Error::unsetIn()
{
    m_InIsSet = false;
}

}
}
}
}
