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



#include "ProcessScenario.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

ProcessScenario::ProcessScenario()
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
    
}

ProcessScenario::~ProcessScenario()
{
}

void ProcessScenario::validate()
{
    // TODO: implement validation
}

web::json::value ProcessScenario::toJson() const
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
    

    return val;
}

void ProcessScenario::fromJson(web::json::value& val)
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
    
}

void ProcessScenario::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    
}

void ProcessScenario::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    
}


utility::string_t ProcessScenario::getCode() const
{
    return m_Code;
}
void ProcessScenario::setCode(utility::string_t value)
{
    m_Code = value;
    
}
bool ProcessScenario::getStockImpact() const
{
    return m_StockImpact;
}
void ProcessScenario::setStockImpact(bool value)
{
    m_StockImpact = value;
    m_StockImpactIsSet = true;
}
bool ProcessScenario::stockImpactIsSet() const
{
    return m_StockImpactIsSet;
}
void ProcessScenario::unsetStockImpact()
{
    m_StockImpactIsSet = false;
}
bool ProcessScenario::getFinancialImpact() const
{
    return m_FinancialImpact;
}
void ProcessScenario::setFinancialImpact(bool value)
{
    m_FinancialImpact = value;
    m_FinancialImpactIsSet = true;
}
bool ProcessScenario::financialImpactIsSet() const
{
    return m_FinancialImpactIsSet;
}
void ProcessScenario::unsetFinancialImpact()
{
    m_FinancialImpactIsSet = false;
}
utility::string_t ProcessScenario::getCstIPI() const
{
    return m_CstIPI;
}
void ProcessScenario::setCstIPI(utility::string_t value)
{
    m_CstIPI = value;
    m_CstIPIIsSet = true;
}
bool ProcessScenario::cstIPIIsSet() const
{
    return m_CstIPIIsSet;
}
void ProcessScenario::unsetCstIPI()
{
    m_CstIPIIsSet = false;
}
utility::string_t ProcessScenario::getIpiLegalTaxClass() const
{
    return m_IpiLegalTaxClass;
}
void ProcessScenario::setIpiLegalTaxClass(utility::string_t value)
{
    m_IpiLegalTaxClass = value;
    m_IpiLegalTaxClassIsSet = true;
}
bool ProcessScenario::ipiLegalTaxClassIsSet() const
{
    return m_IpiLegalTaxClassIsSet;
}
void ProcessScenario::unsetIpiLegalTaxClass()
{
    m_IpiLegalTaxClassIsSet = false;
}
utility::string_t ProcessScenario::getAccruablePISTaxation() const
{
    return m_AccruablePISTaxation;
}
void ProcessScenario::setAccruablePISTaxation(utility::string_t value)
{
    m_AccruablePISTaxation = value;
    m_AccruablePISTaxationIsSet = true;
}
bool ProcessScenario::accruablePISTaxationIsSet() const
{
    return m_AccruablePISTaxationIsSet;
}
void ProcessScenario::unsetAccruablePISTaxation()
{
    m_AccruablePISTaxationIsSet = false;
}
utility::string_t ProcessScenario::getPisExemptLegalReasonCode() const
{
    return m_PisExemptLegalReasonCode;
}
void ProcessScenario::setPisExemptLegalReasonCode(utility::string_t value)
{
    m_PisExemptLegalReasonCode = value;
    m_PisExemptLegalReasonCodeIsSet = true;
}
bool ProcessScenario::pisExemptLegalReasonCodeIsSet() const
{
    return m_PisExemptLegalReasonCodeIsSet;
}
void ProcessScenario::unsetPisExemptLegalReasonCode()
{
    m_PisExemptLegalReasonCodeIsSet = false;
}
utility::string_t ProcessScenario::getPisExemptLegalReason() const
{
    return m_PisExemptLegalReason;
}
void ProcessScenario::setPisExemptLegalReason(utility::string_t value)
{
    m_PisExemptLegalReason = value;
    m_PisExemptLegalReasonIsSet = true;
}
bool ProcessScenario::pisExemptLegalReasonIsSet() const
{
    return m_PisExemptLegalReasonIsSet;
}
void ProcessScenario::unsetPisExemptLegalReason()
{
    m_PisExemptLegalReasonIsSet = false;
}
utility::string_t ProcessScenario::getAccruableCOFINSTaxation() const
{
    return m_AccruableCOFINSTaxation;
}
void ProcessScenario::setAccruableCOFINSTaxation(utility::string_t value)
{
    m_AccruableCOFINSTaxation = value;
    m_AccruableCOFINSTaxationIsSet = true;
}
bool ProcessScenario::accruableCOFINSTaxationIsSet() const
{
    return m_AccruableCOFINSTaxationIsSet;
}
void ProcessScenario::unsetAccruableCOFINSTaxation()
{
    m_AccruableCOFINSTaxationIsSet = false;
}
utility::string_t ProcessScenario::getCofinsExemptLegalReasonCode() const
{
    return m_CofinsExemptLegalReasonCode;
}
void ProcessScenario::setCofinsExemptLegalReasonCode(utility::string_t value)
{
    m_CofinsExemptLegalReasonCode = value;
    m_CofinsExemptLegalReasonCodeIsSet = true;
}
bool ProcessScenario::cofinsExemptLegalReasonCodeIsSet() const
{
    return m_CofinsExemptLegalReasonCodeIsSet;
}
void ProcessScenario::unsetCofinsExemptLegalReasonCode()
{
    m_CofinsExemptLegalReasonCodeIsSet = false;
}
utility::string_t ProcessScenario::getCofinsExemptLegalReason() const
{
    return m_CofinsExemptLegalReason;
}
void ProcessScenario::setCofinsExemptLegalReason(utility::string_t value)
{
    m_CofinsExemptLegalReason = value;
    m_CofinsExemptLegalReasonIsSet = true;
}
bool ProcessScenario::cofinsExemptLegalReasonIsSet() const
{
    return m_CofinsExemptLegalReasonIsSet;
}
void ProcessScenario::unsetCofinsExemptLegalReason()
{
    m_CofinsExemptLegalReasonIsSet = false;
}
bool ProcessScenario::getAllowIPIcreditWhenInGoing() const
{
    return m_AllowIPIcreditWhenInGoing;
}
void ProcessScenario::setAllowIPIcreditWhenInGoing(bool value)
{
    m_AllowIPIcreditWhenInGoing = value;
    m_AllowIPIcreditWhenInGoingIsSet = true;
}
bool ProcessScenario::allowIPIcreditWhenInGoingIsSet() const
{
    return m_AllowIPIcreditWhenInGoingIsSet;
}
void ProcessScenario::unsetAllowIPIcreditWhenInGoing()
{
    m_AllowIPIcreditWhenInGoingIsSet = false;
}
std::vector<std::shared_ptr<IcmsTaxConf>>& ProcessScenario::getIcmsConf()
{
    return m_IcmsConf;
}
bool ProcessScenario::icmsConfIsSet() const
{
    return m_IcmsConfIsSet;
}
void ProcessScenario::unsetIcmsConf()
{
    m_IcmsConfIsSet = false;
}
utility::string_t ProcessScenario::getName() const
{
    return m_Name;
}
void ProcessScenario::setName(utility::string_t value)
{
    m_Name = value;
    
}
utility::string_t ProcessScenario::getType() const
{
    return m_Type;
}
void ProcessScenario::setType(utility::string_t value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool ProcessScenario::typeIsSet() const
{
    return m_TypeIsSet;
}
void ProcessScenario::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t ProcessScenario::getWayType() const
{
    return m_WayType;
}
void ProcessScenario::setWayType(utility::string_t value)
{
    m_WayType = value;
    m_WayTypeIsSet = true;
}
bool ProcessScenario::wayTypeIsSet() const
{
    return m_WayTypeIsSet;
}
void ProcessScenario::unsetWayType()
{
    m_WayTypeIsSet = false;
}
utility::string_t ProcessScenario::getGoal() const
{
    return m_Goal;
}
void ProcessScenario::setGoal(utility::string_t value)
{
    m_Goal = value;
    m_GoalIsSet = true;
}
bool ProcessScenario::goalIsSet() const
{
    return m_GoalIsSet;
}
void ProcessScenario::unsetGoal()
{
    m_GoalIsSet = false;
}
bool ProcessScenario::getOverWriteCFOP() const
{
    return m_OverWriteCFOP;
}
void ProcessScenario::setOverWriteCFOP(bool value)
{
    m_OverWriteCFOP = value;
    m_OverWriteCFOPIsSet = true;
}
bool ProcessScenario::overWriteCFOPIsSet() const
{
    return m_OverWriteCFOPIsSet;
}
void ProcessScenario::unsetOverWriteCFOP()
{
    m_OverWriteCFOPIsSet = false;
}
std::vector<std::shared_ptr<CfopConf>>& ProcessScenario::getCfops()
{
    return m_Cfops;
}
bool ProcessScenario::cfopsIsSet() const
{
    return m_CfopsIsSet;
}
void ProcessScenario::unsetCfops()
{
    m_CfopsIsSet = false;
}

}
}
}
}

