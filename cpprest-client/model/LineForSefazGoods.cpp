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



#include "LineForSefazGoods.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

LineForSefazGoods::LineForSefazGoods()
{
    m_LineCode = 0;
    m_ItemCode = U("");
    m_AvalaraGoodsAndServicesType = U("");
    m_AvalaraGoodsAndServicesTypeIsSet = false;
    m_NumberOfItems = 0.0;
    m_ReturnedPercentageAmount = 0.0;
    m_ReturnedPercentageAmountIsSet = false;
    m_LineUnitPrice = 0.0;
    m_LineUnitPriceIsSet = false;
    m_LineAmount = 0.0;
    m_ItemDescription = U("");
    m_LineTaxedDiscount = 0.0;
    m_LineTaxedDiscountIsSet = false;
    m_LineUntaxedDiscount = 0.0;
    m_LineUntaxedDiscountIsSet = false;
    m_UseType = U("");
    m_ProcessScenario = U("");
    m_Cfop = 0;
    m_CfopIsSet = false;
    m_HasStockImpact = false;
    m_HasStockImpactIsSet = false;
    m_HasFinantialImpact = false;
    m_HasFinantialImpactIsSet = false;
    m_FreightAmount = 0.0;
    m_FreightAmountIsSet = false;
    m_InsuranceAmount = 0.0;
    m_InsuranceAmountIsSet = false;
    m_OtherCostAmount = 0.0;
    m_OtherCostAmountIsSet = false;
    m_IndTotType = false;
    m_IndTotTypeIsSet = false;
    m_OrderNumber = U("");
    m_OrderNumberIsSet = false;
    m_OrderItemNumber = U("");
    m_OrderItemNumberIsSet = false;
    m_FciNumber = U("");
    m_FciNumberIsSet = false;
    m_RecopiNumber = U("");
    m_RecopiNumberIsSet = false;
    m_InfAdProd = U("");
    m_InfAdProdIsSet = false;
    m_VehicleIsSet = false;
    m_MedicineIsSet = false;
    m_WeaponIsSet = false;
    m_FuelIsSet = false;
    m_EntityIsIcmsSubstitute = false;
    m_EntityIsIcmsSubstituteIsSet = false;
    m_IsTransportIcmsWithheld = false;
    m_IsTransportIcmsWithheldIsSet = false;
    m_IcmsTaxReliefIsSet = false;
    m_ExportIsSet = false;
    m_DiIsSet = false;
    m_CalculatedTaxIsSet = false;
    m_ExtendIsSet = false;
    
}

LineForSefazGoods::~LineForSefazGoods()
{
}

void LineForSefazGoods::validate()
{
    // TODO: implement validation
}

web::json::value LineForSefazGoods::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("lineCode")] = ModelBase::toJson(m_LineCode);
    val[U("itemCode")] = ModelBase::toJson(m_ItemCode);
    if(m_AvalaraGoodsAndServicesTypeIsSet)
    {
        val[U("avalaraGoodsAndServicesType")] = ModelBase::toJson(m_AvalaraGoodsAndServicesType);
    }
    val[U("numberOfItems")] = ModelBase::toJson(m_NumberOfItems);
    if(m_ReturnedPercentageAmountIsSet)
    {
        val[U("returnedPercentageAmount")] = ModelBase::toJson(m_ReturnedPercentageAmount);
    }
    if(m_LineUnitPriceIsSet)
    {
        val[U("lineUnitPrice")] = ModelBase::toJson(m_LineUnitPrice);
    }
    val[U("lineAmount")] = ModelBase::toJson(m_LineAmount);
    val[U("itemDescription")] = ModelBase::toJson(m_ItemDescription);
    if(m_LineTaxedDiscountIsSet)
    {
        val[U("lineTaxedDiscount")] = ModelBase::toJson(m_LineTaxedDiscount);
    }
    if(m_LineUntaxedDiscountIsSet)
    {
        val[U("lineUntaxedDiscount")] = ModelBase::toJson(m_LineUntaxedDiscount);
    }
    val[U("useType")] = ModelBase::toJson(m_UseType);
    val[U("processScenario")] = ModelBase::toJson(m_ProcessScenario);
    if(m_CfopIsSet)
    {
        val[U("cfop")] = ModelBase::toJson(m_Cfop);
    }
    if(m_HasStockImpactIsSet)
    {
        val[U("hasStockImpact")] = ModelBase::toJson(m_HasStockImpact);
    }
    if(m_HasFinantialImpactIsSet)
    {
        val[U("hasFinantialImpact")] = ModelBase::toJson(m_HasFinantialImpact);
    }
    if(m_FreightAmountIsSet)
    {
        val[U("freightAmount")] = ModelBase::toJson(m_FreightAmount);
    }
    if(m_InsuranceAmountIsSet)
    {
        val[U("insuranceAmount")] = ModelBase::toJson(m_InsuranceAmount);
    }
    if(m_OtherCostAmountIsSet)
    {
        val[U("otherCostAmount")] = ModelBase::toJson(m_OtherCostAmount);
    }
    if(m_IndTotTypeIsSet)
    {
        val[U("indTotType")] = ModelBase::toJson(m_IndTotType);
    }
    if(m_OrderNumberIsSet)
    {
        val[U("orderNumber")] = ModelBase::toJson(m_OrderNumber);
    }
    if(m_OrderItemNumberIsSet)
    {
        val[U("orderItemNumber")] = ModelBase::toJson(m_OrderItemNumber);
    }
    if(m_FciNumberIsSet)
    {
        val[U("fciNumber")] = ModelBase::toJson(m_FciNumber);
    }
    if(m_RecopiNumberIsSet)
    {
        val[U("recopiNumber")] = ModelBase::toJson(m_RecopiNumber);
    }
    if(m_InfAdProdIsSet)
    {
        val[U("infAdProd")] = ModelBase::toJson(m_InfAdProd);
    }
    if(m_VehicleIsSet)
    {
        val[U("vehicle")] = ModelBase::toJson(m_Vehicle);
    }
    if(m_MedicineIsSet)
    {
        val[U("medicine")] = ModelBase::toJson(m_Medicine);
    }
    if(m_WeaponIsSet)
    {
        val[U("weapon")] = ModelBase::toJson(m_Weapon);
    }
    if(m_FuelIsSet)
    {
        val[U("fuel")] = ModelBase::toJson(m_Fuel);
    }
    if(m_EntityIsIcmsSubstituteIsSet)
    {
        val[U("entityIsIcmsSubstitute")] = ModelBase::toJson(m_EntityIsIcmsSubstitute);
    }
    if(m_IsTransportIcmsWithheldIsSet)
    {
        val[U("isTransportIcmsWithheld")] = ModelBase::toJson(m_IsTransportIcmsWithheld);
    }
    if(m_IcmsTaxReliefIsSet)
    {
        val[U("icmsTaxRelief")] = ModelBase::toJson(m_IcmsTaxRelief);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Export )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("export")] = web::json::value::array(jsonArray);
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Di )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("di")] = web::json::value::array(jsonArray);
        }
    }
    if(m_CalculatedTaxIsSet)
    {
        val[U("calculatedTax")] = ModelBase::toJson(m_CalculatedTax);
    }
    if(m_ExtendIsSet)
    {
        val[U("extend")] = ModelBase::toJson(m_Extend);
    }
    

    return val;
}

void LineForSefazGoods::fromJson(web::json::value& val)
{
    setLineCode(ModelBase::int32_tFromJson(val[U("lineCode")]));
    setItemCode(ModelBase::stringFromJson(val[U("itemCode")]));
    if(val.has_field(U("avalaraGoodsAndServicesType")))
    {
        setAvalaraGoodsAndServicesType(ModelBase::stringFromJson(val[U("avalaraGoodsAndServicesType")]));
        
    }
    setNumberOfItems(ModelBase::doubleFromJson(val[U("numberOfItems")]));
    if(val.has_field(U("returnedPercentageAmount")))
    {
        setReturnedPercentageAmount(ModelBase::doubleFromJson(val[U("returnedPercentageAmount")]));
    }
    if(val.has_field(U("lineUnitPrice")))
    {
        setLineUnitPrice(ModelBase::doubleFromJson(val[U("lineUnitPrice")]));
    }
    setLineAmount(ModelBase::doubleFromJson(val[U("lineAmount")]));
    setItemDescription(ModelBase::stringFromJson(val[U("itemDescription")]));
    if(val.has_field(U("lineTaxedDiscount")))
    {
        setLineTaxedDiscount(ModelBase::doubleFromJson(val[U("lineTaxedDiscount")]));
    }
    if(val.has_field(U("lineUntaxedDiscount")))
    {
        setLineUntaxedDiscount(ModelBase::doubleFromJson(val[U("lineUntaxedDiscount")]));
    }
    setUseType(ModelBase::stringFromJson(val[U("useType")]));
    setProcessScenario(ModelBase::stringFromJson(val[U("processScenario")]));
    if(val.has_field(U("cfop")))
    {
        setCfop(ModelBase::int32_tFromJson(val[U("cfop")]));
    }
    if(val.has_field(U("hasStockImpact")))
    {
        setHasStockImpact(ModelBase::boolFromJson(val[U("hasStockImpact")]));
    }
    if(val.has_field(U("hasFinantialImpact")))
    {
        setHasFinantialImpact(ModelBase::boolFromJson(val[U("hasFinantialImpact")]));
    }
    if(val.has_field(U("freightAmount")))
    {
        setFreightAmount(ModelBase::doubleFromJson(val[U("freightAmount")]));
    }
    if(val.has_field(U("insuranceAmount")))
    {
        setInsuranceAmount(ModelBase::doubleFromJson(val[U("insuranceAmount")]));
    }
    if(val.has_field(U("otherCostAmount")))
    {
        setOtherCostAmount(ModelBase::doubleFromJson(val[U("otherCostAmount")]));
    }
    if(val.has_field(U("indTotType")))
    {
        setIndTotType(ModelBase::boolFromJson(val[U("indTotType")]));
    }
    if(val.has_field(U("orderNumber")))
    {
        setOrderNumber(ModelBase::stringFromJson(val[U("orderNumber")]));
        
    }
    if(val.has_field(U("orderItemNumber")))
    {
        setOrderItemNumber(ModelBase::stringFromJson(val[U("orderItemNumber")]));
        
    }
    if(val.has_field(U("fciNumber")))
    {
        setFciNumber(ModelBase::stringFromJson(val[U("fciNumber")]));
        
    }
    if(val.has_field(U("recopiNumber")))
    {
        setRecopiNumber(ModelBase::stringFromJson(val[U("recopiNumber")]));
        
    }
    if(val.has_field(U("infAdProd")))
    {
        setInfAdProd(ModelBase::stringFromJson(val[U("infAdProd")]));
        
    }
    if(val.has_field(U("vehicle")))
    {
        if(!val[U("vehicle")].is_null())
        {
            std::shared_ptr<Vehicle> newItem(new Vehicle());
            newItem->fromJson(val[U("vehicle")]);
            setVehicle( newItem );
        }
        
    }
    if(val.has_field(U("medicine")))
    {
        if(!val[U("medicine")].is_null())
        {
            std::shared_ptr<Medicine> newItem(new Medicine());
            newItem->fromJson(val[U("medicine")]);
            setMedicine( newItem );
        }
        
    }
    if(val.has_field(U("weapon")))
    {
        if(!val[U("weapon")].is_null())
        {
            std::shared_ptr<Weapon> newItem(new Weapon());
            newItem->fromJson(val[U("weapon")]);
            setWeapon( newItem );
        }
        
    }
    if(val.has_field(U("fuel")))
    {
        if(!val[U("fuel")].is_null())
        {
            std::shared_ptr<Fuel> newItem(new Fuel());
            newItem->fromJson(val[U("fuel")]);
            setFuel( newItem );
        }
        
    }
    if(val.has_field(U("entityIsIcmsSubstitute")))
    {
        setEntityIsIcmsSubstitute(ModelBase::boolFromJson(val[U("entityIsIcmsSubstitute")]));
    }
    if(val.has_field(U("isTransportIcmsWithheld")))
    {
        setIsTransportIcmsWithheld(ModelBase::boolFromJson(val[U("isTransportIcmsWithheld")]));
    }
    if(val.has_field(U("icmsTaxRelief")))
    {
        if(!val[U("icmsTaxRelief")].is_null())
        {
            std::shared_ptr<LineForGoods_icmsTaxRelief> newItem(new LineForGoods_icmsTaxRelief());
            newItem->fromJson(val[U("icmsTaxRelief")]);
            setIcmsTaxRelief( newItem );
        }
        
    }
    {
        m_Export.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("export")))
        {
        for( auto& item : val[U("export")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Export.push_back( std::shared_ptr<LineForGoods_export>(nullptr) );
            }
            else
            {
                std::shared_ptr<LineForGoods_export> newItem(new LineForGoods_export());
                newItem->fromJson(item);
                m_Export.push_back( newItem );
            }
            
        }
        }
    }
    {
        m_Di.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("di")))
        {
        for( auto& item : val[U("di")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Di.push_back( std::shared_ptr<LineForGoods_di>(nullptr) );
            }
            else
            {
                std::shared_ptr<LineForGoods_di> newItem(new LineForGoods_di());
                newItem->fromJson(item);
                m_Di.push_back( newItem );
            }
            
        }
        }
    }
    if(val.has_field(U("calculatedTax")))
    {
        if(!val[U("calculatedTax")].is_null())
        {
            std::shared_ptr<LineForGoods_calculatedTax> newItem(new LineForGoods_calculatedTax());
            newItem->fromJson(val[U("calculatedTax")]);
            setCalculatedTax( newItem );
        }
        
    }
    if(val.has_field(U("extend")))
    {
        if(!val[U("extend")].is_null())
        {
            std::shared_ptr<AgastExtendForSefaz> newItem(new AgastExtendForSefaz());
            newItem->fromJson(val[U("extend")]);
            setExtend( newItem );
        }
        
    }
    
}

void LineForSefazGoods::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("lineCode"), m_LineCode));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("itemCode"), m_ItemCode));
    if(m_AvalaraGoodsAndServicesTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("avalaraGoodsAndServicesType"), m_AvalaraGoodsAndServicesType));
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("numberOfItems"), m_NumberOfItems));
    if(m_ReturnedPercentageAmountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("returnedPercentageAmount"), m_ReturnedPercentageAmount));
    }
    if(m_LineUnitPriceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lineUnitPrice"), m_LineUnitPrice));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("lineAmount"), m_LineAmount));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("itemDescription"), m_ItemDescription));
    if(m_LineTaxedDiscountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lineTaxedDiscount"), m_LineTaxedDiscount));
    }
    if(m_LineUntaxedDiscountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lineUntaxedDiscount"), m_LineUntaxedDiscount));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("useType"), m_UseType));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("processScenario"), m_ProcessScenario));
    if(m_CfopIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cfop"), m_Cfop));
    }
    if(m_HasStockImpactIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("hasStockImpact"), m_HasStockImpact));
    }
    if(m_HasFinantialImpactIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("hasFinantialImpact"), m_HasFinantialImpact));
    }
    if(m_FreightAmountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("freightAmount"), m_FreightAmount));
    }
    if(m_InsuranceAmountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("insuranceAmount"), m_InsuranceAmount));
    }
    if(m_OtherCostAmountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("otherCostAmount"), m_OtherCostAmount));
    }
    if(m_IndTotTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("indTotType"), m_IndTotType));
    }
    if(m_OrderNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("orderNumber"), m_OrderNumber));
        
    }
    if(m_OrderItemNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("orderItemNumber"), m_OrderItemNumber));
        
    }
    if(m_FciNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("fciNumber"), m_FciNumber));
        
    }
    if(m_RecopiNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("recopiNumber"), m_RecopiNumber));
        
    }
    if(m_InfAdProdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("infAdProd"), m_InfAdProd));
        
    }
    if(m_VehicleIsSet)
    {
        if (m_Vehicle.get())
        {
            m_Vehicle->toMultipart(multipart, U("vehicle."));
        }
        
    }
    if(m_MedicineIsSet)
    {
        if (m_Medicine.get())
        {
            m_Medicine->toMultipart(multipart, U("medicine."));
        }
        
    }
    if(m_WeaponIsSet)
    {
        if (m_Weapon.get())
        {
            m_Weapon->toMultipart(multipart, U("weapon."));
        }
        
    }
    if(m_FuelIsSet)
    {
        if (m_Fuel.get())
        {
            m_Fuel->toMultipart(multipart, U("fuel."));
        }
        
    }
    if(m_EntityIsIcmsSubstituteIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("entityIsIcmsSubstitute"), m_EntityIsIcmsSubstitute));
    }
    if(m_IsTransportIcmsWithheldIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("isTransportIcmsWithheld"), m_IsTransportIcmsWithheld));
    }
    if(m_IcmsTaxReliefIsSet)
    {
        if (m_IcmsTaxRelief.get())
        {
            m_IcmsTaxRelief->toMultipart(multipart, U("icmsTaxRelief."));
        }
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Export )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("export"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Di )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("di"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    if(m_CalculatedTaxIsSet)
    {
        if (m_CalculatedTax.get())
        {
            m_CalculatedTax->toMultipart(multipart, U("calculatedTax."));
        }
        
    }
    if(m_ExtendIsSet)
    {
        if (m_Extend.get())
        {
            m_Extend->toMultipart(multipart, U("extend."));
        }
        
    }
    
}

void LineForSefazGoods::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setLineCode(ModelBase::int32_tFromHttpContent(multipart->getContent(U("lineCode"))));
    setItemCode(ModelBase::stringFromHttpContent(multipart->getContent(U("itemCode"))));
    if(multipart->hasContent(U("avalaraGoodsAndServicesType")))
    {
        setAvalaraGoodsAndServicesType(ModelBase::stringFromHttpContent(multipart->getContent(U("avalaraGoodsAndServicesType"))));
        
    }
    setNumberOfItems(ModelBase::doubleFromHttpContent(multipart->getContent(U("numberOfItems"))));
    if(multipart->hasContent(U("returnedPercentageAmount")))
    {
        setReturnedPercentageAmount(ModelBase::doubleFromHttpContent(multipart->getContent(U("returnedPercentageAmount"))));
    }
    if(multipart->hasContent(U("lineUnitPrice")))
    {
        setLineUnitPrice(ModelBase::doubleFromHttpContent(multipart->getContent(U("lineUnitPrice"))));
    }
    setLineAmount(ModelBase::doubleFromHttpContent(multipart->getContent(U("lineAmount"))));
    setItemDescription(ModelBase::stringFromHttpContent(multipart->getContent(U("itemDescription"))));
    if(multipart->hasContent(U("lineTaxedDiscount")))
    {
        setLineTaxedDiscount(ModelBase::doubleFromHttpContent(multipart->getContent(U("lineTaxedDiscount"))));
    }
    if(multipart->hasContent(U("lineUntaxedDiscount")))
    {
        setLineUntaxedDiscount(ModelBase::doubleFromHttpContent(multipart->getContent(U("lineUntaxedDiscount"))));
    }
    setUseType(ModelBase::stringFromHttpContent(multipart->getContent(U("useType"))));
    setProcessScenario(ModelBase::stringFromHttpContent(multipart->getContent(U("processScenario"))));
    if(multipart->hasContent(U("cfop")))
    {
        setCfop(ModelBase::int32_tFromHttpContent(multipart->getContent(U("cfop"))));
    }
    if(multipart->hasContent(U("hasStockImpact")))
    {
        setHasStockImpact(ModelBase::boolFromHttpContent(multipart->getContent(U("hasStockImpact"))));
    }
    if(multipart->hasContent(U("hasFinantialImpact")))
    {
        setHasFinantialImpact(ModelBase::boolFromHttpContent(multipart->getContent(U("hasFinantialImpact"))));
    }
    if(multipart->hasContent(U("freightAmount")))
    {
        setFreightAmount(ModelBase::doubleFromHttpContent(multipart->getContent(U("freightAmount"))));
    }
    if(multipart->hasContent(U("insuranceAmount")))
    {
        setInsuranceAmount(ModelBase::doubleFromHttpContent(multipart->getContent(U("insuranceAmount"))));
    }
    if(multipart->hasContent(U("otherCostAmount")))
    {
        setOtherCostAmount(ModelBase::doubleFromHttpContent(multipart->getContent(U("otherCostAmount"))));
    }
    if(multipart->hasContent(U("indTotType")))
    {
        setIndTotType(ModelBase::boolFromHttpContent(multipart->getContent(U("indTotType"))));
    }
    if(multipart->hasContent(U("orderNumber")))
    {
        setOrderNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("orderNumber"))));
        
    }
    if(multipart->hasContent(U("orderItemNumber")))
    {
        setOrderItemNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("orderItemNumber"))));
        
    }
    if(multipart->hasContent(U("fciNumber")))
    {
        setFciNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("fciNumber"))));
        
    }
    if(multipart->hasContent(U("recopiNumber")))
    {
        setRecopiNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("recopiNumber"))));
        
    }
    if(multipart->hasContent(U("infAdProd")))
    {
        setInfAdProd(ModelBase::stringFromHttpContent(multipart->getContent(U("infAdProd"))));
        
    }
    if(multipart->hasContent(U("vehicle")))
    {
        if(multipart->hasContent(U("vehicle")))
        {
            std::shared_ptr<Vehicle> newItem(new Vehicle());
            newItem->fromMultiPart(multipart, U("vehicle."));
            setVehicle( newItem );
        }
        
    }
    if(multipart->hasContent(U("medicine")))
    {
        if(multipart->hasContent(U("medicine")))
        {
            std::shared_ptr<Medicine> newItem(new Medicine());
            newItem->fromMultiPart(multipart, U("medicine."));
            setMedicine( newItem );
        }
        
    }
    if(multipart->hasContent(U("weapon")))
    {
        if(multipart->hasContent(U("weapon")))
        {
            std::shared_ptr<Weapon> newItem(new Weapon());
            newItem->fromMultiPart(multipart, U("weapon."));
            setWeapon( newItem );
        }
        
    }
    if(multipart->hasContent(U("fuel")))
    {
        if(multipart->hasContent(U("fuel")))
        {
            std::shared_ptr<Fuel> newItem(new Fuel());
            newItem->fromMultiPart(multipart, U("fuel."));
            setFuel( newItem );
        }
        
    }
    if(multipart->hasContent(U("entityIsIcmsSubstitute")))
    {
        setEntityIsIcmsSubstitute(ModelBase::boolFromHttpContent(multipart->getContent(U("entityIsIcmsSubstitute"))));
    }
    if(multipart->hasContent(U("isTransportIcmsWithheld")))
    {
        setIsTransportIcmsWithheld(ModelBase::boolFromHttpContent(multipart->getContent(U("isTransportIcmsWithheld"))));
    }
    if(multipart->hasContent(U("icmsTaxRelief")))
    {
        if(multipart->hasContent(U("icmsTaxRelief")))
        {
            std::shared_ptr<LineForGoods_icmsTaxRelief> newItem(new LineForGoods_icmsTaxRelief());
            newItem->fromMultiPart(multipart, U("icmsTaxRelief."));
            setIcmsTaxRelief( newItem );
        }
        
    }
    {
        m_Export.clear();
        if(multipart->hasContent(U("export")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("export"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Export.push_back( std::shared_ptr<LineForGoods_export>(nullptr) );
            }
            else
            {
                std::shared_ptr<LineForGoods_export> newItem(new LineForGoods_export());
                newItem->fromJson(item);
                m_Export.push_back( newItem );
            }
            
        }
        }
    }
    {
        m_Di.clear();
        if(multipart->hasContent(U("di")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("di"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Di.push_back( std::shared_ptr<LineForGoods_di>(nullptr) );
            }
            else
            {
                std::shared_ptr<LineForGoods_di> newItem(new LineForGoods_di());
                newItem->fromJson(item);
                m_Di.push_back( newItem );
            }
            
        }
        }
    }
    if(multipart->hasContent(U("calculatedTax")))
    {
        if(multipart->hasContent(U("calculatedTax")))
        {
            std::shared_ptr<LineForGoods_calculatedTax> newItem(new LineForGoods_calculatedTax());
            newItem->fromMultiPart(multipart, U("calculatedTax."));
            setCalculatedTax( newItem );
        }
        
    }
    if(multipart->hasContent(U("extend")))
    {
        if(multipart->hasContent(U("extend")))
        {
            std::shared_ptr<AgastExtendForSefaz> newItem(new AgastExtendForSefaz());
            newItem->fromMultiPart(multipart, U("extend."));
            setExtend( newItem );
        }
        
    }
    
}


int32_t LineForSefazGoods::getLineCode() const
{
    return m_LineCode;
}
void LineForSefazGoods::setLineCode(int32_t value)
{
    m_LineCode = value;
    
}
utility::string_t LineForSefazGoods::getItemCode() const
{
    return m_ItemCode;
}
void LineForSefazGoods::setItemCode(utility::string_t value)
{
    m_ItemCode = value;
    
}
utility::string_t LineForSefazGoods::getAvalaraGoodsAndServicesType() const
{
    return m_AvalaraGoodsAndServicesType;
}
void LineForSefazGoods::setAvalaraGoodsAndServicesType(utility::string_t value)
{
    m_AvalaraGoodsAndServicesType = value;
    m_AvalaraGoodsAndServicesTypeIsSet = true;
}
bool LineForSefazGoods::avalaraGoodsAndServicesTypeIsSet() const
{
    return m_AvalaraGoodsAndServicesTypeIsSet;
}
void LineForSefazGoods::unsetAvalaraGoodsAndServicesType()
{
    m_AvalaraGoodsAndServicesTypeIsSet = false;
}
double LineForSefazGoods::getNumberOfItems() const
{
    return m_NumberOfItems;
}
void LineForSefazGoods::setNumberOfItems(double value)
{
    m_NumberOfItems = value;
    
}
double LineForSefazGoods::getReturnedPercentageAmount() const
{
    return m_ReturnedPercentageAmount;
}
void LineForSefazGoods::setReturnedPercentageAmount(double value)
{
    m_ReturnedPercentageAmount = value;
    m_ReturnedPercentageAmountIsSet = true;
}
bool LineForSefazGoods::returnedPercentageAmountIsSet() const
{
    return m_ReturnedPercentageAmountIsSet;
}
void LineForSefazGoods::unsetReturnedPercentageAmount()
{
    m_ReturnedPercentageAmountIsSet = false;
}
double LineForSefazGoods::getLineUnitPrice() const
{
    return m_LineUnitPrice;
}
void LineForSefazGoods::setLineUnitPrice(double value)
{
    m_LineUnitPrice = value;
    m_LineUnitPriceIsSet = true;
}
bool LineForSefazGoods::lineUnitPriceIsSet() const
{
    return m_LineUnitPriceIsSet;
}
void LineForSefazGoods::unsetLineUnitPrice()
{
    m_LineUnitPriceIsSet = false;
}
double LineForSefazGoods::getLineAmount() const
{
    return m_LineAmount;
}
void LineForSefazGoods::setLineAmount(double value)
{
    m_LineAmount = value;
    
}
utility::string_t LineForSefazGoods::getItemDescription() const
{
    return m_ItemDescription;
}
void LineForSefazGoods::setItemDescription(utility::string_t value)
{
    m_ItemDescription = value;
    
}
double LineForSefazGoods::getLineTaxedDiscount() const
{
    return m_LineTaxedDiscount;
}
void LineForSefazGoods::setLineTaxedDiscount(double value)
{
    m_LineTaxedDiscount = value;
    m_LineTaxedDiscountIsSet = true;
}
bool LineForSefazGoods::lineTaxedDiscountIsSet() const
{
    return m_LineTaxedDiscountIsSet;
}
void LineForSefazGoods::unsetLineTaxedDiscount()
{
    m_LineTaxedDiscountIsSet = false;
}
double LineForSefazGoods::getLineUntaxedDiscount() const
{
    return m_LineUntaxedDiscount;
}
void LineForSefazGoods::setLineUntaxedDiscount(double value)
{
    m_LineUntaxedDiscount = value;
    m_LineUntaxedDiscountIsSet = true;
}
bool LineForSefazGoods::lineUntaxedDiscountIsSet() const
{
    return m_LineUntaxedDiscountIsSet;
}
void LineForSefazGoods::unsetLineUntaxedDiscount()
{
    m_LineUntaxedDiscountIsSet = false;
}
utility::string_t LineForSefazGoods::getUseType() const
{
    return m_UseType;
}
void LineForSefazGoods::setUseType(utility::string_t value)
{
    m_UseType = value;
    
}
utility::string_t LineForSefazGoods::getProcessScenario() const
{
    return m_ProcessScenario;
}
void LineForSefazGoods::setProcessScenario(utility::string_t value)
{
    m_ProcessScenario = value;
    
}
int32_t LineForSefazGoods::getCfop() const
{
    return m_Cfop;
}
void LineForSefazGoods::setCfop(int32_t value)
{
    m_Cfop = value;
    m_CfopIsSet = true;
}
bool LineForSefazGoods::cfopIsSet() const
{
    return m_CfopIsSet;
}
void LineForSefazGoods::unsetCfop()
{
    m_CfopIsSet = false;
}
bool LineForSefazGoods::getHasStockImpact() const
{
    return m_HasStockImpact;
}
void LineForSefazGoods::setHasStockImpact(bool value)
{
    m_HasStockImpact = value;
    m_HasStockImpactIsSet = true;
}
bool LineForSefazGoods::hasStockImpactIsSet() const
{
    return m_HasStockImpactIsSet;
}
void LineForSefazGoods::unsetHasStockImpact()
{
    m_HasStockImpactIsSet = false;
}
bool LineForSefazGoods::getHasFinantialImpact() const
{
    return m_HasFinantialImpact;
}
void LineForSefazGoods::setHasFinantialImpact(bool value)
{
    m_HasFinantialImpact = value;
    m_HasFinantialImpactIsSet = true;
}
bool LineForSefazGoods::hasFinantialImpactIsSet() const
{
    return m_HasFinantialImpactIsSet;
}
void LineForSefazGoods::unsetHasFinantialImpact()
{
    m_HasFinantialImpactIsSet = false;
}
double LineForSefazGoods::getFreightAmount() const
{
    return m_FreightAmount;
}
void LineForSefazGoods::setFreightAmount(double value)
{
    m_FreightAmount = value;
    m_FreightAmountIsSet = true;
}
bool LineForSefazGoods::freightAmountIsSet() const
{
    return m_FreightAmountIsSet;
}
void LineForSefazGoods::unsetFreightAmount()
{
    m_FreightAmountIsSet = false;
}
double LineForSefazGoods::getInsuranceAmount() const
{
    return m_InsuranceAmount;
}
void LineForSefazGoods::setInsuranceAmount(double value)
{
    m_InsuranceAmount = value;
    m_InsuranceAmountIsSet = true;
}
bool LineForSefazGoods::insuranceAmountIsSet() const
{
    return m_InsuranceAmountIsSet;
}
void LineForSefazGoods::unsetInsuranceAmount()
{
    m_InsuranceAmountIsSet = false;
}
double LineForSefazGoods::getOtherCostAmount() const
{
    return m_OtherCostAmount;
}
void LineForSefazGoods::setOtherCostAmount(double value)
{
    m_OtherCostAmount = value;
    m_OtherCostAmountIsSet = true;
}
bool LineForSefazGoods::otherCostAmountIsSet() const
{
    return m_OtherCostAmountIsSet;
}
void LineForSefazGoods::unsetOtherCostAmount()
{
    m_OtherCostAmountIsSet = false;
}
bool LineForSefazGoods::getIndTotType() const
{
    return m_IndTotType;
}
void LineForSefazGoods::setIndTotType(bool value)
{
    m_IndTotType = value;
    m_IndTotTypeIsSet = true;
}
bool LineForSefazGoods::indTotTypeIsSet() const
{
    return m_IndTotTypeIsSet;
}
void LineForSefazGoods::unsetIndTotType()
{
    m_IndTotTypeIsSet = false;
}
utility::string_t LineForSefazGoods::getOrderNumber() const
{
    return m_OrderNumber;
}
void LineForSefazGoods::setOrderNumber(utility::string_t value)
{
    m_OrderNumber = value;
    m_OrderNumberIsSet = true;
}
bool LineForSefazGoods::orderNumberIsSet() const
{
    return m_OrderNumberIsSet;
}
void LineForSefazGoods::unsetOrderNumber()
{
    m_OrderNumberIsSet = false;
}
utility::string_t LineForSefazGoods::getOrderItemNumber() const
{
    return m_OrderItemNumber;
}
void LineForSefazGoods::setOrderItemNumber(utility::string_t value)
{
    m_OrderItemNumber = value;
    m_OrderItemNumberIsSet = true;
}
bool LineForSefazGoods::orderItemNumberIsSet() const
{
    return m_OrderItemNumberIsSet;
}
void LineForSefazGoods::unsetOrderItemNumber()
{
    m_OrderItemNumberIsSet = false;
}
utility::string_t LineForSefazGoods::getFciNumber() const
{
    return m_FciNumber;
}
void LineForSefazGoods::setFciNumber(utility::string_t value)
{
    m_FciNumber = value;
    m_FciNumberIsSet = true;
}
bool LineForSefazGoods::fciNumberIsSet() const
{
    return m_FciNumberIsSet;
}
void LineForSefazGoods::unsetFciNumber()
{
    m_FciNumberIsSet = false;
}
utility::string_t LineForSefazGoods::getRecopiNumber() const
{
    return m_RecopiNumber;
}
void LineForSefazGoods::setRecopiNumber(utility::string_t value)
{
    m_RecopiNumber = value;
    m_RecopiNumberIsSet = true;
}
bool LineForSefazGoods::recopiNumberIsSet() const
{
    return m_RecopiNumberIsSet;
}
void LineForSefazGoods::unsetRecopiNumber()
{
    m_RecopiNumberIsSet = false;
}
utility::string_t LineForSefazGoods::getInfAdProd() const
{
    return m_InfAdProd;
}
void LineForSefazGoods::setInfAdProd(utility::string_t value)
{
    m_InfAdProd = value;
    m_InfAdProdIsSet = true;
}
bool LineForSefazGoods::infAdProdIsSet() const
{
    return m_InfAdProdIsSet;
}
void LineForSefazGoods::unsetInfAdProd()
{
    m_InfAdProdIsSet = false;
}
std::shared_ptr<Vehicle> LineForSefazGoods::getVehicle() const
{
    return m_Vehicle;
}
void LineForSefazGoods::setVehicle(std::shared_ptr<Vehicle> value)
{
    m_Vehicle = value;
    m_VehicleIsSet = true;
}
bool LineForSefazGoods::vehicleIsSet() const
{
    return m_VehicleIsSet;
}
void LineForSefazGoods::unsetVehicle()
{
    m_VehicleIsSet = false;
}
std::shared_ptr<Medicine> LineForSefazGoods::getMedicine() const
{
    return m_Medicine;
}
void LineForSefazGoods::setMedicine(std::shared_ptr<Medicine> value)
{
    m_Medicine = value;
    m_MedicineIsSet = true;
}
bool LineForSefazGoods::medicineIsSet() const
{
    return m_MedicineIsSet;
}
void LineForSefazGoods::unsetMedicine()
{
    m_MedicineIsSet = false;
}
std::shared_ptr<Weapon> LineForSefazGoods::getWeapon() const
{
    return m_Weapon;
}
void LineForSefazGoods::setWeapon(std::shared_ptr<Weapon> value)
{
    m_Weapon = value;
    m_WeaponIsSet = true;
}
bool LineForSefazGoods::weaponIsSet() const
{
    return m_WeaponIsSet;
}
void LineForSefazGoods::unsetWeapon()
{
    m_WeaponIsSet = false;
}
std::shared_ptr<Fuel> LineForSefazGoods::getFuel() const
{
    return m_Fuel;
}
void LineForSefazGoods::setFuel(std::shared_ptr<Fuel> value)
{
    m_Fuel = value;
    m_FuelIsSet = true;
}
bool LineForSefazGoods::fuelIsSet() const
{
    return m_FuelIsSet;
}
void LineForSefazGoods::unsetFuel()
{
    m_FuelIsSet = false;
}
bool LineForSefazGoods::getEntityIsIcmsSubstitute() const
{
    return m_EntityIsIcmsSubstitute;
}
void LineForSefazGoods::setEntityIsIcmsSubstitute(bool value)
{
    m_EntityIsIcmsSubstitute = value;
    m_EntityIsIcmsSubstituteIsSet = true;
}
bool LineForSefazGoods::entityIsIcmsSubstituteIsSet() const
{
    return m_EntityIsIcmsSubstituteIsSet;
}
void LineForSefazGoods::unsetEntityIsIcmsSubstitute()
{
    m_EntityIsIcmsSubstituteIsSet = false;
}
bool LineForSefazGoods::getIsTransportIcmsWithheld() const
{
    return m_IsTransportIcmsWithheld;
}
void LineForSefazGoods::setIsTransportIcmsWithheld(bool value)
{
    m_IsTransportIcmsWithheld = value;
    m_IsTransportIcmsWithheldIsSet = true;
}
bool LineForSefazGoods::isTransportIcmsWithheldIsSet() const
{
    return m_IsTransportIcmsWithheldIsSet;
}
void LineForSefazGoods::unsetIsTransportIcmsWithheld()
{
    m_IsTransportIcmsWithheldIsSet = false;
}
std::shared_ptr<LineForGoods_icmsTaxRelief> LineForSefazGoods::getIcmsTaxRelief() const
{
    return m_IcmsTaxRelief;
}
void LineForSefazGoods::setIcmsTaxRelief(std::shared_ptr<LineForGoods_icmsTaxRelief> value)
{
    m_IcmsTaxRelief = value;
    m_IcmsTaxReliefIsSet = true;
}
bool LineForSefazGoods::icmsTaxReliefIsSet() const
{
    return m_IcmsTaxReliefIsSet;
}
void LineForSefazGoods::unsetIcmsTaxRelief()
{
    m_IcmsTaxReliefIsSet = false;
}
std::vector<std::shared_ptr<LineForGoods_export>>& LineForSefazGoods::getExport()
{
    return m_Export;
}
bool LineForSefazGoods::exportIsSet() const
{
    return m_ExportIsSet;
}
void LineForSefazGoods::unsetExport()
{
    m_ExportIsSet = false;
}
std::vector<std::shared_ptr<LineForGoods_di>>& LineForSefazGoods::getDi()
{
    return m_Di;
}
bool LineForSefazGoods::diIsSet() const
{
    return m_DiIsSet;
}
void LineForSefazGoods::unsetDi()
{
    m_DiIsSet = false;
}
std::shared_ptr<LineForGoods_calculatedTax> LineForSefazGoods::getCalculatedTax() const
{
    return m_CalculatedTax;
}
void LineForSefazGoods::setCalculatedTax(std::shared_ptr<LineForGoods_calculatedTax> value)
{
    m_CalculatedTax = value;
    m_CalculatedTaxIsSet = true;
}
bool LineForSefazGoods::calculatedTaxIsSet() const
{
    return m_CalculatedTaxIsSet;
}
void LineForSefazGoods::unsetCalculatedTax()
{
    m_CalculatedTaxIsSet = false;
}
std::shared_ptr<AgastExtendForSefaz> LineForSefazGoods::getExtend() const
{
    return m_Extend;
}
void LineForSefazGoods::setExtend(std::shared_ptr<AgastExtendForSefaz> value)
{
    m_Extend = value;
    m_ExtendIsSet = true;
}
bool LineForSefazGoods::extendIsSet() const
{
    return m_ExtendIsSet;
}
void LineForSefazGoods::unsetExtend()
{
    m_ExtendIsSet = false;
}

}
}
}
}

