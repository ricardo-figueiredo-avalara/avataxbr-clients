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



#include "CustomProcessScenario.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

CustomProcessScenario::CustomProcessScenario()
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
    m_Name = U("");
    m_Type = U("");
    m_TypeIsSet = false;
    m_WayType = U("");
    m_WayTypeIsSet = false;
    m_Goal = U("");
    m_GoalIsSet = false;
    m_OverWriteCFOP = false;
    m_OverWriteCFOPIsSet = false;
    m_CfopsIsSet = false;
    m_CompanyId = nullptr;
    
}

CustomProcessScenario::~CustomProcessScenario()
{
}

void CustomProcessScenario::validate()
{
    // TODO: implement validation
}

web::json::value CustomProcessScenario::toJson() const
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
    val[U("name")] = ModelBase::toJson(m_Name);
    if(m_TypeIsSet)
    {
        val[U("type")] = ModelBase::toJson(m_Type);
    }
    if(m_WayTypeIsSet)
    {
        val[U("wayType")] = ModelBase::toJson(m_WayType);
    }
    if(m_GoalIsSet)
    {
        val[U("goal")] = ModelBase::toJson(m_Goal);
    }
    if(m_OverWriteCFOPIsSet)
    {
        val[U("overWriteCFOP")] = ModelBase::toJson(m_OverWriteCFOP);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Cfops )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("cfops")] = web::json::value::array(jsonArray);
        }
    }
    val[U("companyId")] = ModelBase::toJson(m_CompanyId);
    

    return val;
}

void CustomProcessScenario::fromJson(web::json::value& val)
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
    setName(ModelBase::stringFromJson(val[U("name")]));
    if(val.has_field(U("type")))
    {
        setType(ModelBase::stringFromJson(val[U("type")]));
        
    }
    if(val.has_field(U("wayType")))
    {
        setWayType(ModelBase::stringFromJson(val[U("wayType")]));
        
    }
    if(val.has_field(U("goal")))
    {
        setGoal(ModelBase::stringFromJson(val[U("goal")]));
        
    }
    if(val.has_field(U("overWriteCFOP")))
    {
        setOverWriteCFOP(ModelBase::boolFromJson(val[U("overWriteCFOP")]));
    }
    {
        m_Cfops.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("cfops")))
        {
        for( auto& item : val[U("cfops")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Cfops.push_back( std::shared_ptr<CfopConf>(nullptr) );
            }
            else
            {
                std::shared_ptr<CfopConf> newItem(new CfopConf());
                newItem->fromJson(item);
                m_Cfops.push_back( newItem );
            }
            
        }
        }
    }
    setCompanyId(ModelBase::stringFromJson(val[U("companyId")]));
    
}

void CustomProcessScenario::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    multipart->add(ModelBase::toHttpContent(namePrefix + U("name"), m_Name));
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("type"), m_Type));
        
    }
    if(m_WayTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("wayType"), m_WayType));
        
    }
    if(m_GoalIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("goal"), m_Goal));
        
    }
    if(m_OverWriteCFOPIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("overWriteCFOP"), m_OverWriteCFOP));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Cfops )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("cfops"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("companyId"), m_CompanyId));
    
}

void CustomProcessScenario::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    setName(ModelBase::stringFromHttpContent(multipart->getContent(U("name"))));
    if(multipart->hasContent(U("type")))
    {
        setType(ModelBase::stringFromHttpContent(multipart->getContent(U("type"))));
        
    }
    if(multipart->hasContent(U("wayType")))
    {
        setWayType(ModelBase::stringFromHttpContent(multipart->getContent(U("wayType"))));
        
    }
    if(multipart->hasContent(U("goal")))
    {
        setGoal(ModelBase::stringFromHttpContent(multipart->getContent(U("goal"))));
        
    }
    if(multipart->hasContent(U("overWriteCFOP")))
    {
        setOverWriteCFOP(ModelBase::boolFromHttpContent(multipart->getContent(U("overWriteCFOP"))));
    }
    {
        m_Cfops.clear();
        if(multipart->hasContent(U("cfops")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("cfops"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Cfops.push_back( std::shared_ptr<CfopConf>(nullptr) );
            }
            else
            {
                std::shared_ptr<CfopConf> newItem(new CfopConf());
                newItem->fromJson(item);
                m_Cfops.push_back( newItem );
            }
            
        }
        }
    }
    setCompanyId(ModelBase::stringFromHttpContent(multipart->getContent(U("companyId"))));
    
}


utility::string_t CustomProcessScenario::getCode() const
{
    return m_Code;
}
void CustomProcessScenario::setCode(utility::string_t value)
{
    m_Code = value;
    
}
bool CustomProcessScenario::getStockImpact() const
{
    return m_StockImpact;
}
void CustomProcessScenario::setStockImpact(bool value)
{
    m_StockImpact = value;
    m_StockImpactIsSet = true;
}
bool CustomProcessScenario::stockImpactIsSet() const
{
    return m_StockImpactIsSet;
}
void CustomProcessScenario::unsetStockImpact()
{
    m_StockImpactIsSet = false;
}
bool CustomProcessScenario::getFinancialImpact() const
{
    return m_FinancialImpact;
}
void CustomProcessScenario::setFinancialImpact(bool value)
{
    m_FinancialImpact = value;
    m_FinancialImpactIsSet = true;
}
bool CustomProcessScenario::financialImpactIsSet() const
{
    return m_FinancialImpactIsSet;
}
void CustomProcessScenario::unsetFinancialImpact()
{
    m_FinancialImpactIsSet = false;
}
utility::string_t CustomProcessScenario::getCstIPI() const
{
    return m_CstIPI;
}
void CustomProcessScenario::setCstIPI(utility::string_t value)
{
    m_CstIPI = value;
    m_CstIPIIsSet = true;
}
bool CustomProcessScenario::cstIPIIsSet() const
{
    return m_CstIPIIsSet;
}
void CustomProcessScenario::unsetCstIPI()
{
    m_CstIPIIsSet = false;
}
utility::string_t CustomProcessScenario::getIpiLegalTaxClass() const
{
    return m_IpiLegalTaxClass;
}
void CustomProcessScenario::setIpiLegalTaxClass(utility::string_t value)
{
    m_IpiLegalTaxClass = value;
    m_IpiLegalTaxClassIsSet = true;
}
bool CustomProcessScenario::ipiLegalTaxClassIsSet() const
{
    return m_IpiLegalTaxClassIsSet;
}
void CustomProcessScenario::unsetIpiLegalTaxClass()
{
    m_IpiLegalTaxClassIsSet = false;
}
utility::string_t CustomProcessScenario::getAccruablePISTaxation() const
{
    return m_AccruablePISTaxation;
}
void CustomProcessScenario::setAccruablePISTaxation(utility::string_t value)
{
    m_AccruablePISTaxation = value;
    m_AccruablePISTaxationIsSet = true;
}
bool CustomProcessScenario::accruablePISTaxationIsSet() const
{
    return m_AccruablePISTaxationIsSet;
}
void CustomProcessScenario::unsetAccruablePISTaxation()
{
    m_AccruablePISTaxationIsSet = false;
}
utility::string_t CustomProcessScenario::getPisExemptLegalReasonCode() const
{
    return m_PisExemptLegalReasonCode;
}
void CustomProcessScenario::setPisExemptLegalReasonCode(utility::string_t value)
{
    m_PisExemptLegalReasonCode = value;
    m_PisExemptLegalReasonCodeIsSet = true;
}
bool CustomProcessScenario::pisExemptLegalReasonCodeIsSet() const
{
    return m_PisExemptLegalReasonCodeIsSet;
}
void CustomProcessScenario::unsetPisExemptLegalReasonCode()
{
    m_PisExemptLegalReasonCodeIsSet = false;
}
utility::string_t CustomProcessScenario::getPisExemptLegalReason() const
{
    return m_PisExemptLegalReason;
}
void CustomProcessScenario::setPisExemptLegalReason(utility::string_t value)
{
    m_PisExemptLegalReason = value;
    m_PisExemptLegalReasonIsSet = true;
}
bool CustomProcessScenario::pisExemptLegalReasonIsSet() const
{
    return m_PisExemptLegalReasonIsSet;
}
void CustomProcessScenario::unsetPisExemptLegalReason()
{
    m_PisExemptLegalReasonIsSet = false;
}
utility::string_t CustomProcessScenario::getAccruableCOFINSTaxation() const
{
    return m_AccruableCOFINSTaxation;
}
void CustomProcessScenario::setAccruableCOFINSTaxation(utility::string_t value)
{
    m_AccruableCOFINSTaxation = value;
    m_AccruableCOFINSTaxationIsSet = true;
}
bool CustomProcessScenario::accruableCOFINSTaxationIsSet() const
{
    return m_AccruableCOFINSTaxationIsSet;
}
void CustomProcessScenario::unsetAccruableCOFINSTaxation()
{
    m_AccruableCOFINSTaxationIsSet = false;
}
utility::string_t CustomProcessScenario::getCofinsExemptLegalReasonCode() const
{
    return m_CofinsExemptLegalReasonCode;
}
void CustomProcessScenario::setCofinsExemptLegalReasonCode(utility::string_t value)
{
    m_CofinsExemptLegalReasonCode = value;
    m_CofinsExemptLegalReasonCodeIsSet = true;
}
bool CustomProcessScenario::cofinsExemptLegalReasonCodeIsSet() const
{
    return m_CofinsExemptLegalReasonCodeIsSet;
}
void CustomProcessScenario::unsetCofinsExemptLegalReasonCode()
{
    m_CofinsExemptLegalReasonCodeIsSet = false;
}
utility::string_t CustomProcessScenario::getCofinsExemptLegalReason() const
{
    return m_CofinsExemptLegalReason;
}
void CustomProcessScenario::setCofinsExemptLegalReason(utility::string_t value)
{
    m_CofinsExemptLegalReason = value;
    m_CofinsExemptLegalReasonIsSet = true;
}
bool CustomProcessScenario::cofinsExemptLegalReasonIsSet() const
{
    return m_CofinsExemptLegalReasonIsSet;
}
void CustomProcessScenario::unsetCofinsExemptLegalReason()
{
    m_CofinsExemptLegalReasonIsSet = false;
}
bool CustomProcessScenario::getAllowIPIcreditWhenInGoing() const
{
    return m_AllowIPIcreditWhenInGoing;
}
void CustomProcessScenario::setAllowIPIcreditWhenInGoing(bool value)
{
    m_AllowIPIcreditWhenInGoing = value;
    m_AllowIPIcreditWhenInGoingIsSet = true;
}
bool CustomProcessScenario::allowIPIcreditWhenInGoingIsSet() const
{
    return m_AllowIPIcreditWhenInGoingIsSet;
}
void CustomProcessScenario::unsetAllowIPIcreditWhenInGoing()
{
    m_AllowIPIcreditWhenInGoingIsSet = false;
}
std::vector<std::shared_ptr<IcmsTaxConf>>& CustomProcessScenario::getIcmsConf()
{
    return m_IcmsConf;
}
bool CustomProcessScenario::icmsConfIsSet() const
{
    return m_IcmsConfIsSet;
}
void CustomProcessScenario::unsetIcmsConf()
{
    m_IcmsConfIsSet = false;
}
utility::string_t CustomProcessScenario::getName() const
{
    return m_Name;
}
void CustomProcessScenario::setName(utility::string_t value)
{
    m_Name = value;
    
}
utility::string_t CustomProcessScenario::getType() const
{
    return m_Type;
}
void CustomProcessScenario::setType(utility::string_t value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool CustomProcessScenario::typeIsSet() const
{
    return m_TypeIsSet;
}
void CustomProcessScenario::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t CustomProcessScenario::getWayType() const
{
    return m_WayType;
}
void CustomProcessScenario::setWayType(utility::string_t value)
{
    m_WayType = value;
    m_WayTypeIsSet = true;
}
bool CustomProcessScenario::wayTypeIsSet() const
{
    return m_WayTypeIsSet;
}
void CustomProcessScenario::unsetWayType()
{
    m_WayTypeIsSet = false;
}
utility::string_t CustomProcessScenario::getGoal() const
{
    return m_Goal;
}
void CustomProcessScenario::setGoal(utility::string_t value)
{
    m_Goal = value;
    m_GoalIsSet = true;
}
bool CustomProcessScenario::goalIsSet() const
{
    return m_GoalIsSet;
}
void CustomProcessScenario::unsetGoal()
{
    m_GoalIsSet = false;
}
bool CustomProcessScenario::getOverWriteCFOP() const
{
    return m_OverWriteCFOP;
}
void CustomProcessScenario::setOverWriteCFOP(bool value)
{
    m_OverWriteCFOP = value;
    m_OverWriteCFOPIsSet = true;
}
bool CustomProcessScenario::overWriteCFOPIsSet() const
{
    return m_OverWriteCFOPIsSet;
}
void CustomProcessScenario::unsetOverWriteCFOP()
{
    m_OverWriteCFOPIsSet = false;
}
std::vector<std::shared_ptr<CfopConf>>& CustomProcessScenario::getCfops()
{
    return m_Cfops;
}
bool CustomProcessScenario::cfopsIsSet() const
{
    return m_CfopsIsSet;
}
void CustomProcessScenario::unsetCfops()
{
    m_CfopsIsSet = false;
}
std::shared_ptr<UUID> CustomProcessScenario::getCompanyId() const
{
    return m_CompanyId;
}
void CustomProcessScenario::setCompanyId(std::shared_ptr<UUID> value)
{
    m_CompanyId = value;
    
}

}
}
}
}

