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



#include "InstallmentComplete.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

InstallmentComplete::InstallmentComplete()
{
    m_DocumentNumber = U("");
    m_date = utility::datetime();
    m_GrossValue = 0.0;
    m_NetValue = 0.0;
    m_NetValueIsSet = false;
    m_WithholdingModeIsSet = false;
    m_WithholdingPIS = 0.0;
    m_WithholdingPISIsSet = false;
    m_WithholdingCOFINS = 0.0;
    m_WithholdingCOFINSIsSet = false;
    m_WithholdingCSLL = 0.0;
    m_WithholdingCSLLIsSet = false;
    
}

InstallmentComplete::~InstallmentComplete()
{
}

void InstallmentComplete::validate()
{
    // TODO: implement validation
}

web::json::value InstallmentComplete::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("documentNumber")] = ModelBase::toJson(m_DocumentNumber);
    val[U("date")] = ModelBase::toJson(m_date);
    val[U("grossValue")] = ModelBase::toJson(m_GrossValue);
    if(m_NetValueIsSet)
    {
        val[U("netValue")] = ModelBase::toJson(m_NetValue);
    }
    if(m_WithholdingModeIsSet)
    {
        val[U("withholdingMode")] = ModelBase::toJson(m_WithholdingMode);
    }
    if(m_WithholdingPISIsSet)
    {
        val[U("withholdingPIS")] = ModelBase::toJson(m_WithholdingPIS);
    }
    if(m_WithholdingCOFINSIsSet)
    {
        val[U("withholdingCOFINS")] = ModelBase::toJson(m_WithholdingCOFINS);
    }
    if(m_WithholdingCSLLIsSet)
    {
        val[U("withholdingCSLL")] = ModelBase::toJson(m_WithholdingCSLL);
    }
    

    return val;
}

void InstallmentComplete::fromJson(web::json::value& val)
{
    setDocumentNumber(ModelBase::stringFromJson(val[U("documentNumber")]));
    setDate(ModelBase::dateFromJson(val[U("date")]));
    setGrossValue(ModelBase::doubleFromJson(val[U("grossValue")]));
    if(val.has_field(U("netValue")))
    {
        setNetValue(ModelBase::doubleFromJson(val[U("netValue")]));
    }
    if(val.has_field(U("withholdingMode")))
    {
        if(!val[U("withholdingMode")].is_null())
        {
            std::shared_ptr<WithholdingMode> newItem(new WithholdingMode());
            newItem->fromJson(val[U("withholdingMode")]);
            setWithholdingMode( newItem );
        }
        
    }
    if(val.has_field(U("withholdingPIS")))
    {
        setWithholdingPIS(ModelBase::doubleFromJson(val[U("withholdingPIS")]));
    }
    if(val.has_field(U("withholdingCOFINS")))
    {
        setWithholdingCOFINS(ModelBase::doubleFromJson(val[U("withholdingCOFINS")]));
    }
    if(val.has_field(U("withholdingCSLL")))
    {
        setWithholdingCSLL(ModelBase::doubleFromJson(val[U("withholdingCSLL")]));
    }
    
}

void InstallmentComplete::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("documentNumber"), m_DocumentNumber));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("date"), m_date));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("grossValue"), m_GrossValue));
    if(m_NetValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("netValue"), m_NetValue));
    }
    if(m_WithholdingModeIsSet)
    {
        if (m_WithholdingMode.get())
        {
            m_WithholdingMode->toMultipart(multipart, U("withholdingMode."));
        }
        
    }
    if(m_WithholdingPISIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("withholdingPIS"), m_WithholdingPIS));
    }
    if(m_WithholdingCOFINSIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("withholdingCOFINS"), m_WithholdingCOFINS));
    }
    if(m_WithholdingCSLLIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("withholdingCSLL"), m_WithholdingCSLL));
    }
    
}

void InstallmentComplete::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setDocumentNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("documentNumber"))));
    setDate(ModelBase::dateFromHttpContent(multipart->getContent(U("date"))));
    setGrossValue(ModelBase::doubleFromHttpContent(multipart->getContent(U("grossValue"))));
    if(multipart->hasContent(U("netValue")))
    {
        setNetValue(ModelBase::doubleFromHttpContent(multipart->getContent(U("netValue"))));
    }
    if(multipart->hasContent(U("withholdingMode")))
    {
        if(multipart->hasContent(U("withholdingMode")))
        {
            std::shared_ptr<WithholdingMode> newItem(new WithholdingMode());
            newItem->fromMultiPart(multipart, U("withholdingMode."));
            setWithholdingMode( newItem );
        }
        
    }
    if(multipart->hasContent(U("withholdingPIS")))
    {
        setWithholdingPIS(ModelBase::doubleFromHttpContent(multipart->getContent(U("withholdingPIS"))));
    }
    if(multipart->hasContent(U("withholdingCOFINS")))
    {
        setWithholdingCOFINS(ModelBase::doubleFromHttpContent(multipart->getContent(U("withholdingCOFINS"))));
    }
    if(multipart->hasContent(U("withholdingCSLL")))
    {
        setWithholdingCSLL(ModelBase::doubleFromHttpContent(multipart->getContent(U("withholdingCSLL"))));
    }
    
}


utility::string_t InstallmentComplete::getDocumentNumber() const
{
    return m_DocumentNumber;
}
void InstallmentComplete::setDocumentNumber(utility::string_t value)
{
    m_DocumentNumber = value;
    
}
utility::datetime InstallmentComplete::getDate() const
{
    return m_date;
}
void InstallmentComplete::setDate(utility::datetime value)
{
    m_date = value;
    
}
double InstallmentComplete::getGrossValue() const
{
    return m_GrossValue;
}
void InstallmentComplete::setGrossValue(double value)
{
    m_GrossValue = value;
    
}
double InstallmentComplete::getNetValue() const
{
    return m_NetValue;
}
void InstallmentComplete::setNetValue(double value)
{
    m_NetValue = value;
    m_NetValueIsSet = true;
}
bool InstallmentComplete::netValueIsSet() const
{
    return m_NetValueIsSet;
}
void InstallmentComplete::unsetNetValue()
{
    m_NetValueIsSet = false;
}
std::shared_ptr<WithholdingMode> InstallmentComplete::getWithholdingMode() const
{
    return m_WithholdingMode;
}
void InstallmentComplete::setWithholdingMode(std::shared_ptr<WithholdingMode> value)
{
    m_WithholdingMode = value;
    m_WithholdingModeIsSet = true;
}
bool InstallmentComplete::withholdingModeIsSet() const
{
    return m_WithholdingModeIsSet;
}
void InstallmentComplete::unsetWithholdingMode()
{
    m_WithholdingModeIsSet = false;
}
double InstallmentComplete::getWithholdingPIS() const
{
    return m_WithholdingPIS;
}
void InstallmentComplete::setWithholdingPIS(double value)
{
    m_WithholdingPIS = value;
    m_WithholdingPISIsSet = true;
}
bool InstallmentComplete::withholdingPISIsSet() const
{
    return m_WithholdingPISIsSet;
}
void InstallmentComplete::unsetWithholdingPIS()
{
    m_WithholdingPISIsSet = false;
}
double InstallmentComplete::getWithholdingCOFINS() const
{
    return m_WithholdingCOFINS;
}
void InstallmentComplete::setWithholdingCOFINS(double value)
{
    m_WithholdingCOFINS = value;
    m_WithholdingCOFINSIsSet = true;
}
bool InstallmentComplete::withholdingCOFINSIsSet() const
{
    return m_WithholdingCOFINSIsSet;
}
void InstallmentComplete::unsetWithholdingCOFINS()
{
    m_WithholdingCOFINSIsSet = false;
}
double InstallmentComplete::getWithholdingCSLL() const
{
    return m_WithholdingCSLL;
}
void InstallmentComplete::setWithholdingCSLL(double value)
{
    m_WithholdingCSLL = value;
    m_WithholdingCSLLIsSet = true;
}
bool InstallmentComplete::withholdingCSLLIsSet() const
{
    return m_WithholdingCSLLIsSet;
}
void InstallmentComplete::unsetWithholdingCSLL()
{
    m_WithholdingCSLLIsSet = false;
}

}
}
}
}

