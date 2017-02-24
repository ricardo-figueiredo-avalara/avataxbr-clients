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



#include "AgastExtendForSefaz.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

AgastExtendForSefaz::AgastExtendForSefaz()
{
    m_HsCode = U("");
    m_HsCodeIsSet = false;
    m_Ex = 0;
    m_ExIsSet = false;
    m_Cest = U("");
    m_CestIsSet = false;
    m_Cean = U("");
    m_CeanIsSet = false;
    m_Nve = U("");
    m_NveIsSet = false;
    m_Unit = U("");
    m_UnitIsSet = false;
    m_UnitTaxable = U("");
    m_UnitTaxableIsSet = false;
    m_NFCI = U("");
    m_NFCIIsSet = false;
    
}

AgastExtendForSefaz::~AgastExtendForSefaz()
{
}

void AgastExtendForSefaz::validate()
{
    // TODO: implement validation
}

web::json::value AgastExtendForSefaz::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_HsCodeIsSet)
    {
        val[U("hsCode")] = ModelBase::toJson(m_HsCode);
    }
    if(m_ExIsSet)
    {
        val[U("ex")] = ModelBase::toJson(m_Ex);
    }
    if(m_CestIsSet)
    {
        val[U("cest")] = ModelBase::toJson(m_Cest);
    }
    if(m_CeanIsSet)
    {
        val[U("cean")] = ModelBase::toJson(m_Cean);
    }
    if(m_NveIsSet)
    {
        val[U("nve")] = ModelBase::toJson(m_Nve);
    }
    if(m_UnitIsSet)
    {
        val[U("unit")] = ModelBase::toJson(m_Unit);
    }
    if(m_UnitTaxableIsSet)
    {
        val[U("unitTaxable")] = ModelBase::toJson(m_UnitTaxable);
    }
    if(m_NFCIIsSet)
    {
        val[U("nFCI")] = ModelBase::toJson(m_NFCI);
    }
    

    return val;
}

void AgastExtendForSefaz::fromJson(web::json::value& val)
{
    if(val.has_field(U("hsCode")))
    {
        setHsCode(ModelBase::stringFromJson(val[U("hsCode")]));
        
    }
    if(val.has_field(U("ex")))
    {
        setEx(ModelBase::int32_tFromJson(val[U("ex")]));
    }
    if(val.has_field(U("cest")))
    {
        setCest(ModelBase::stringFromJson(val[U("cest")]));
        
    }
    if(val.has_field(U("cean")))
    {
        setCean(ModelBase::stringFromJson(val[U("cean")]));
        
    }
    if(val.has_field(U("nve")))
    {
        setNve(ModelBase::stringFromJson(val[U("nve")]));
        
    }
    if(val.has_field(U("unit")))
    {
        setUnit(ModelBase::stringFromJson(val[U("unit")]));
        
    }
    if(val.has_field(U("unitTaxable")))
    {
        setUnitTaxable(ModelBase::stringFromJson(val[U("unitTaxable")]));
        
    }
    if(val.has_field(U("nFCI")))
    {
        setNFCI(ModelBase::stringFromJson(val[U("nFCI")]));
        
    }
    
}

void AgastExtendForSefaz::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_HsCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("hsCode"), m_HsCode));
        
    }
    if(m_ExIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("ex"), m_Ex));
    }
    if(m_CestIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cest"), m_Cest));
        
    }
    if(m_CeanIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cean"), m_Cean));
        
    }
    if(m_NveIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("nve"), m_Nve));
        
    }
    if(m_UnitIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("unit"), m_Unit));
        
    }
    if(m_UnitTaxableIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("unitTaxable"), m_UnitTaxable));
        
    }
    if(m_NFCIIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("nFCI"), m_NFCI));
        
    }
    
}

void AgastExtendForSefaz::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("hsCode")))
    {
        setHsCode(ModelBase::stringFromHttpContent(multipart->getContent(U("hsCode"))));
        
    }
    if(multipart->hasContent(U("ex")))
    {
        setEx(ModelBase::int32_tFromHttpContent(multipart->getContent(U("ex"))));
    }
    if(multipart->hasContent(U("cest")))
    {
        setCest(ModelBase::stringFromHttpContent(multipart->getContent(U("cest"))));
        
    }
    if(multipart->hasContent(U("cean")))
    {
        setCean(ModelBase::stringFromHttpContent(multipart->getContent(U("cean"))));
        
    }
    if(multipart->hasContent(U("nve")))
    {
        setNve(ModelBase::stringFromHttpContent(multipart->getContent(U("nve"))));
        
    }
    if(multipart->hasContent(U("unit")))
    {
        setUnit(ModelBase::stringFromHttpContent(multipart->getContent(U("unit"))));
        
    }
    if(multipart->hasContent(U("unitTaxable")))
    {
        setUnitTaxable(ModelBase::stringFromHttpContent(multipart->getContent(U("unitTaxable"))));
        
    }
    if(multipart->hasContent(U("nFCI")))
    {
        setNFCI(ModelBase::stringFromHttpContent(multipart->getContent(U("nFCI"))));
        
    }
    
}


utility::string_t AgastExtendForSefaz::getHsCode() const
{
    return m_HsCode;
}
void AgastExtendForSefaz::setHsCode(utility::string_t value)
{
    m_HsCode = value;
    m_HsCodeIsSet = true;
}
bool AgastExtendForSefaz::hsCodeIsSet() const
{
    return m_HsCodeIsSet;
}
void AgastExtendForSefaz::unsetHsCode()
{
    m_HsCodeIsSet = false;
}
int32_t AgastExtendForSefaz::getEx() const
{
    return m_Ex;
}
void AgastExtendForSefaz::setEx(int32_t value)
{
    m_Ex = value;
    m_ExIsSet = true;
}
bool AgastExtendForSefaz::exIsSet() const
{
    return m_ExIsSet;
}
void AgastExtendForSefaz::unsetEx()
{
    m_ExIsSet = false;
}
utility::string_t AgastExtendForSefaz::getCest() const
{
    return m_Cest;
}
void AgastExtendForSefaz::setCest(utility::string_t value)
{
    m_Cest = value;
    m_CestIsSet = true;
}
bool AgastExtendForSefaz::cestIsSet() const
{
    return m_CestIsSet;
}
void AgastExtendForSefaz::unsetCest()
{
    m_CestIsSet = false;
}
utility::string_t AgastExtendForSefaz::getCean() const
{
    return m_Cean;
}
void AgastExtendForSefaz::setCean(utility::string_t value)
{
    m_Cean = value;
    m_CeanIsSet = true;
}
bool AgastExtendForSefaz::ceanIsSet() const
{
    return m_CeanIsSet;
}
void AgastExtendForSefaz::unsetCean()
{
    m_CeanIsSet = false;
}
utility::string_t AgastExtendForSefaz::getNve() const
{
    return m_Nve;
}
void AgastExtendForSefaz::setNve(utility::string_t value)
{
    m_Nve = value;
    m_NveIsSet = true;
}
bool AgastExtendForSefaz::nveIsSet() const
{
    return m_NveIsSet;
}
void AgastExtendForSefaz::unsetNve()
{
    m_NveIsSet = false;
}
utility::string_t AgastExtendForSefaz::getUnit() const
{
    return m_Unit;
}
void AgastExtendForSefaz::setUnit(utility::string_t value)
{
    m_Unit = value;
    m_UnitIsSet = true;
}
bool AgastExtendForSefaz::unitIsSet() const
{
    return m_UnitIsSet;
}
void AgastExtendForSefaz::unsetUnit()
{
    m_UnitIsSet = false;
}
utility::string_t AgastExtendForSefaz::getUnitTaxable() const
{
    return m_UnitTaxable;
}
void AgastExtendForSefaz::setUnitTaxable(utility::string_t value)
{
    m_UnitTaxable = value;
    m_UnitTaxableIsSet = true;
}
bool AgastExtendForSefaz::unitTaxableIsSet() const
{
    return m_UnitTaxableIsSet;
}
void AgastExtendForSefaz::unsetUnitTaxable()
{
    m_UnitTaxableIsSet = false;
}
utility::string_t AgastExtendForSefaz::getNFCI() const
{
    return m_NFCI;
}
void AgastExtendForSefaz::setNFCI(utility::string_t value)
{
    m_NFCI = value;
    m_NFCIIsSet = true;
}
bool AgastExtendForSefaz::nFCIIsSet() const
{
    return m_NFCIIsSet;
}
void AgastExtendForSefaz::unsetNFCI()
{
    m_NFCIIsSet = false;
}

}
}
}
}

