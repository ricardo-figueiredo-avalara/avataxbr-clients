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



#include "TaxConf.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

TaxConf::TaxConf()
{
    m_Code = U("");
    m_StockImpact = false;
    m_StockImpactIsSet = false;
    m_FinancialImpact = false;
    m_FinancialImpactIsSet = false;
    m_CstIPI = U("");
    m_CstIPIIsSet = false;
    m_IpiLegalTaxClass = U("");
    m_IpiLegalTaxClassIsSet = false;
    m_AccruablePISTaxation = U("");
    m_AccruablePISTaxationIsSet = false;
    m_PisExemptLegalReasonCode = U("");
    m_PisExemptLegalReasonCodeIsSet = false;
    m_PisExemptLegalReason = U("");
    m_PisExemptLegalReasonIsSet = false;
    m_AccruableCOFINSTaxation = U("");
    m_AccruableCOFINSTaxationIsSet = false;
    m_CofinsExemptLegalReasonCode = U("");
    m_CofinsExemptLegalReasonCodeIsSet = false;
    m_CofinsExemptLegalReason = U("");
    m_CofinsExemptLegalReasonIsSet = false;
    m_AllowIPIcreditWhenInGoing = false;
    m_AllowIPIcreditWhenInGoingIsSet = false;
    m_IcmsConfIsSet = false;
    
}

TaxConf::~TaxConf()
{
}

void TaxConf::validate()
{
    // TODO: implement validation
}

web::json::value TaxConf::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("code")] = ModelBase::toJson(m_Code);
    if(m_StockImpactIsSet)
    {
        val[U("stockImpact")] = ModelBase::toJson(m_StockImpact);
    }
    if(m_FinancialImpactIsSet)
    {
        val[U("financialImpact")] = ModelBase::toJson(m_FinancialImpact);
    }
    if(m_CstIPIIsSet)
    {
        val[U("cstIPI")] = ModelBase::toJson(m_CstIPI);
    }
    if(m_IpiLegalTaxClassIsSet)
    {
        val[U("ipiLegalTaxClass")] = ModelBase::toJson(m_IpiLegalTaxClass);
    }
    if(m_AccruablePISTaxationIsSet)
    {
        val[U("accruablePISTaxation")] = ModelBase::toJson(m_AccruablePISTaxation);
    }
    if(m_PisExemptLegalReasonCodeIsSet)
    {
        val[U("pisExemptLegalReasonCode")] = ModelBase::toJson(m_PisExemptLegalReasonCode);
    }
    if(m_PisExemptLegalReasonIsSet)
    {
        val[U("pisExemptLegalReason")] = ModelBase::toJson(m_PisExemptLegalReason);
    }
    if(m_AccruableCOFINSTaxationIsSet)
    {
        val[U("accruableCOFINSTaxation")] = ModelBase::toJson(m_AccruableCOFINSTaxation);
    }
    if(m_CofinsExemptLegalReasonCodeIsSet)
    {
        val[U("cofinsExemptLegalReasonCode")] = ModelBase::toJson(m_CofinsExemptLegalReasonCode);
    }
    if(m_CofinsExemptLegalReasonIsSet)
    {
        val[U("cofinsExemptLegalReason")] = ModelBase::toJson(m_CofinsExemptLegalReason);
    }
    if(m_AllowIPIcreditWhenInGoingIsSet)
    {
        val[U("allowIPIcreditWhenInGoing")] = ModelBase::toJson(m_AllowIPIcreditWhenInGoing);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_IcmsConf )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("icmsConf")] = web::json::value::array(jsonArray);
        }
    }
    

    return val;
}

void TaxConf::fromJson(web::json::value& val)
{
    setCode(ModelBase::stringFromJson(val[U("code")]));
    if(val.has_field(U("stockImpact")))
    {
        setStockImpact(ModelBase::boolFromJson(val[U("stockImpact")]));
    }
    if(val.has_field(U("financialImpact")))
    {
        setFinancialImpact(ModelBase::boolFromJson(val[U("financialImpact")]));
    }
    if(val.has_field(U("cstIPI")))
    {
        setCstIPI(ModelBase::stringFromJson(val[U("cstIPI")]));
        
    }
    if(val.has_field(U("ipiLegalTaxClass")))
    {
        setIpiLegalTaxClass(ModelBase::stringFromJson(val[U("ipiLegalTaxClass")]));
        
    }
    if(val.has_field(U("accruablePISTaxation")))
    {
        setAccruablePISTaxation(ModelBase::stringFromJson(val[U("accruablePISTaxation")]));
        
    }
    if(val.has_field(U("pisExemptLegalReasonCode")))
    {
        setPisExemptLegalReasonCode(ModelBase::stringFromJson(val[U("pisExemptLegalReasonCode")]));
        
    }
    if(val.has_field(U("pisExemptLegalReason")))
    {
        setPisExemptLegalReason(ModelBase::stringFromJson(val[U("pisExemptLegalReason")]));
        
    }
    if(val.has_field(U("accruableCOFINSTaxation")))
    {
        setAccruableCOFINSTaxation(ModelBase::stringFromJson(val[U("accruableCOFINSTaxation")]));
        
    }
    if(val.has_field(U("cofinsExemptLegalReasonCode")))
    {
        setCofinsExemptLegalReasonCode(ModelBase::stringFromJson(val[U("cofinsExemptLegalReasonCode")]));
        
    }
    if(val.has_field(U("cofinsExemptLegalReason")))
    {
        setCofinsExemptLegalReason(ModelBase::stringFromJson(val[U("cofinsExemptLegalReason")]));
        
    }
    if(val.has_field(U("allowIPIcreditWhenInGoing")))
    {
        setAllowIPIcreditWhenInGoing(ModelBase::boolFromJson(val[U("allowIPIcreditWhenInGoing")]));
    }
    {
        m_IcmsConf.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("icmsConf")))
        {
        for( auto& item : val[U("icmsConf")].as_array() )
        {
            
            if(item.is_null())
            {
                m_IcmsConf.push_back( std::shared_ptr<IcmsTaxConf>(nullptr) );
            }
            else
            {
                std::shared_ptr<IcmsTaxConf> newItem(new IcmsTaxConf());
                newItem->fromJson(item);
                m_IcmsConf.push_back( newItem );
            }
            
        }
        }
    }
    
}

void TaxConf::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("code"), m_Code));
    if(m_StockImpactIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("stockImpact"), m_StockImpact));
    }
    if(m_FinancialImpactIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("financialImpact"), m_FinancialImpact));
    }
    if(m_CstIPIIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cstIPI"), m_CstIPI));
        
    }
    if(m_IpiLegalTaxClassIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("ipiLegalTaxClass"), m_IpiLegalTaxClass));
        
    }
    if(m_AccruablePISTaxationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("accruablePISTaxation"), m_AccruablePISTaxation));
        
    }
    if(m_PisExemptLegalReasonCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("pisExemptLegalReasonCode"), m_PisExemptLegalReasonCode));
        
    }
    if(m_PisExemptLegalReasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("pisExemptLegalReason"), m_PisExemptLegalReason));
        
    }
    if(m_AccruableCOFINSTaxationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("accruableCOFINSTaxation"), m_AccruableCOFINSTaxation));
        
    }
    if(m_CofinsExemptLegalReasonCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cofinsExemptLegalReasonCode"), m_CofinsExemptLegalReasonCode));
        
    }
    if(m_CofinsExemptLegalReasonIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cofinsExemptLegalReason"), m_CofinsExemptLegalReason));
        
    }
    if(m_AllowIPIcreditWhenInGoingIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("allowIPIcreditWhenInGoing"), m_AllowIPIcreditWhenInGoing));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_IcmsConf )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("icmsConf"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    
}

void TaxConf::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setCode(ModelBase::stringFromHttpContent(multipart->getContent(U("code"))));
    if(multipart->hasContent(U("stockImpact")))
    {
        setStockImpact(ModelBase::boolFromHttpContent(multipart->getContent(U("stockImpact"))));
    }
    if(multipart->hasContent(U("financialImpact")))
    {
        setFinancialImpact(ModelBase::boolFromHttpContent(multipart->getContent(U("financialImpact"))));
    }
    if(multipart->hasContent(U("cstIPI")))
    {
        setCstIPI(ModelBase::stringFromHttpContent(multipart->getContent(U("cstIPI"))));
        
    }
    if(multipart->hasContent(U("ipiLegalTaxClass")))
    {
        setIpiLegalTaxClass(ModelBase::stringFromHttpContent(multipart->getContent(U("ipiLegalTaxClass"))));
        
    }
    if(multipart->hasContent(U("accruablePISTaxation")))
    {
        setAccruablePISTaxation(ModelBase::stringFromHttpContent(multipart->getContent(U("accruablePISTaxation"))));
        
    }
    if(multipart->hasContent(U("pisExemptLegalReasonCode")))
    {
        setPisExemptLegalReasonCode(ModelBase::stringFromHttpContent(multipart->getContent(U("pisExemptLegalReasonCode"))));
        
    }
    if(multipart->hasContent(U("pisExemptLegalReason")))
    {
        setPisExemptLegalReason(ModelBase::stringFromHttpContent(multipart->getContent(U("pisExemptLegalReason"))));
        
    }
    if(multipart->hasContent(U("accruableCOFINSTaxation")))
    {
        setAccruableCOFINSTaxation(ModelBase::stringFromHttpContent(multipart->getContent(U("accruableCOFINSTaxation"))));
        
    }
    if(multipart->hasContent(U("cofinsExemptLegalReasonCode")))
    {
        setCofinsExemptLegalReasonCode(ModelBase::stringFromHttpContent(multipart->getContent(U("cofinsExemptLegalReasonCode"))));
        
    }
    if(multipart->hasContent(U("cofinsExemptLegalReason")))
    {
        setCofinsExemptLegalReason(ModelBase::stringFromHttpContent(multipart->getContent(U("cofinsExemptLegalReason"))));
        
    }
    if(multipart->hasContent(U("allowIPIcreditWhenInGoing")))
    {
        setAllowIPIcreditWhenInGoing(ModelBase::boolFromHttpContent(multipart->getContent(U("allowIPIcreditWhenInGoing"))));
    }
    {
        m_IcmsConf.clear();
        if(multipart->hasContent(U("icmsConf")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("icmsConf"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_IcmsConf.push_back( std::shared_ptr<IcmsTaxConf>(nullptr) );
            }
            else
            {
                std::shared_ptr<IcmsTaxConf> newItem(new IcmsTaxConf());
                newItem->fromJson(item);
                m_IcmsConf.push_back( newItem );
            }
            
        }
        }
    }
    
}


utility::string_t TaxConf::getCode() const
{
    return m_Code;
}
void TaxConf::setCode(utility::string_t value)
{
    m_Code = value;
    
}
bool TaxConf::getStockImpact() const
{
    return m_StockImpact;
}
void TaxConf::setStockImpact(bool value)
{
    m_StockImpact = value;
    m_StockImpactIsSet = true;
}
bool TaxConf::stockImpactIsSet() const
{
    return m_StockImpactIsSet;
}
void TaxConf::unsetStockImpact()
{
    m_StockImpactIsSet = false;
}
bool TaxConf::getFinancialImpact() const
{
    return m_FinancialImpact;
}
void TaxConf::setFinancialImpact(bool value)
{
    m_FinancialImpact = value;
    m_FinancialImpactIsSet = true;
}
bool TaxConf::financialImpactIsSet() const
{
    return m_FinancialImpactIsSet;
}
void TaxConf::unsetFinancialImpact()
{
    m_FinancialImpactIsSet = false;
}
utility::string_t TaxConf::getCstIPI() const
{
    return m_CstIPI;
}
void TaxConf::setCstIPI(utility::string_t value)
{
    m_CstIPI = value;
    m_CstIPIIsSet = true;
}
bool TaxConf::cstIPIIsSet() const
{
    return m_CstIPIIsSet;
}
void TaxConf::unsetCstIPI()
{
    m_CstIPIIsSet = false;
}
utility::string_t TaxConf::getIpiLegalTaxClass() const
{
    return m_IpiLegalTaxClass;
}
void TaxConf::setIpiLegalTaxClass(utility::string_t value)
{
    m_IpiLegalTaxClass = value;
    m_IpiLegalTaxClassIsSet = true;
}
bool TaxConf::ipiLegalTaxClassIsSet() const
{
    return m_IpiLegalTaxClassIsSet;
}
void TaxConf::unsetIpiLegalTaxClass()
{
    m_IpiLegalTaxClassIsSet = false;
}
utility::string_t TaxConf::getAccruablePISTaxation() const
{
    return m_AccruablePISTaxation;
}
void TaxConf::setAccruablePISTaxation(utility::string_t value)
{
    m_AccruablePISTaxation = value;
    m_AccruablePISTaxationIsSet = true;
}
bool TaxConf::accruablePISTaxationIsSet() const
{
    return m_AccruablePISTaxationIsSet;
}
void TaxConf::unsetAccruablePISTaxation()
{
    m_AccruablePISTaxationIsSet = false;
}
utility::string_t TaxConf::getPisExemptLegalReasonCode() const
{
    return m_PisExemptLegalReasonCode;
}
void TaxConf::setPisExemptLegalReasonCode(utility::string_t value)
{
    m_PisExemptLegalReasonCode = value;
    m_PisExemptLegalReasonCodeIsSet = true;
}
bool TaxConf::pisExemptLegalReasonCodeIsSet() const
{
    return m_PisExemptLegalReasonCodeIsSet;
}
void TaxConf::unsetPisExemptLegalReasonCode()
{
    m_PisExemptLegalReasonCodeIsSet = false;
}
utility::string_t TaxConf::getPisExemptLegalReason() const
{
    return m_PisExemptLegalReason;
}
void TaxConf::setPisExemptLegalReason(utility::string_t value)
{
    m_PisExemptLegalReason = value;
    m_PisExemptLegalReasonIsSet = true;
}
bool TaxConf::pisExemptLegalReasonIsSet() const
{
    return m_PisExemptLegalReasonIsSet;
}
void TaxConf::unsetPisExemptLegalReason()
{
    m_PisExemptLegalReasonIsSet = false;
}
utility::string_t TaxConf::getAccruableCOFINSTaxation() const
{
    return m_AccruableCOFINSTaxation;
}
void TaxConf::setAccruableCOFINSTaxation(utility::string_t value)
{
    m_AccruableCOFINSTaxation = value;
    m_AccruableCOFINSTaxationIsSet = true;
}
bool TaxConf::accruableCOFINSTaxationIsSet() const
{
    return m_AccruableCOFINSTaxationIsSet;
}
void TaxConf::unsetAccruableCOFINSTaxation()
{
    m_AccruableCOFINSTaxationIsSet = false;
}
utility::string_t TaxConf::getCofinsExemptLegalReasonCode() const
{
    return m_CofinsExemptLegalReasonCode;
}
void TaxConf::setCofinsExemptLegalReasonCode(utility::string_t value)
{
    m_CofinsExemptLegalReasonCode = value;
    m_CofinsExemptLegalReasonCodeIsSet = true;
}
bool TaxConf::cofinsExemptLegalReasonCodeIsSet() const
{
    return m_CofinsExemptLegalReasonCodeIsSet;
}
void TaxConf::unsetCofinsExemptLegalReasonCode()
{
    m_CofinsExemptLegalReasonCodeIsSet = false;
}
utility::string_t TaxConf::getCofinsExemptLegalReason() const
{
    return m_CofinsExemptLegalReason;
}
void TaxConf::setCofinsExemptLegalReason(utility::string_t value)
{
    m_CofinsExemptLegalReason = value;
    m_CofinsExemptLegalReasonIsSet = true;
}
bool TaxConf::cofinsExemptLegalReasonIsSet() const
{
    return m_CofinsExemptLegalReasonIsSet;
}
void TaxConf::unsetCofinsExemptLegalReason()
{
    m_CofinsExemptLegalReasonIsSet = false;
}
bool TaxConf::getAllowIPIcreditWhenInGoing() const
{
    return m_AllowIPIcreditWhenInGoing;
}
void TaxConf::setAllowIPIcreditWhenInGoing(bool value)
{
    m_AllowIPIcreditWhenInGoing = value;
    m_AllowIPIcreditWhenInGoingIsSet = true;
}
bool TaxConf::allowIPIcreditWhenInGoingIsSet() const
{
    return m_AllowIPIcreditWhenInGoingIsSet;
}
void TaxConf::unsetAllowIPIcreditWhenInGoing()
{
    m_AllowIPIcreditWhenInGoingIsSet = false;
}
std::vector<std::shared_ptr<IcmsTaxConf>>& TaxConf::getIcmsConf()
{
    return m_IcmsConf;
}
bool TaxConf::icmsConfIsSet() const
{
    return m_IcmsConfIsSet;
}
void TaxConf::unsetIcmsConf()
{
    m_IcmsConfIsSet = false;
}

}
}
}
}

