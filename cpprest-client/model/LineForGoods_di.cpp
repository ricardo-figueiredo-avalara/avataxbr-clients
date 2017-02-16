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



#include "LineForGoods_di.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

LineForGoods_di::LineForGoods_di()
{
    m_CustomsValue = 0.0;
    m_CustomsValueIsSet = false;
    m_DiNumber = U("");
    m_ClearanceSite = U("");
    m_ClearanceDateIsSet = false;
    m_TransportDIType = U("");
    m_AfrmmValue = 0.0;
    m_AfrmmValueIsSet = false;
    m_IntermediateType = U("");
    m_BuyerFederalTaxID = U("");
    m_BuyerFederalTaxIDIsSet = false;
    m_BuyerStateIsSet = false;
    m_ExporterCode = U("");
    m_ExporterCodeIsSet = false;
    
}

LineForGoods_di::~LineForGoods_di()
{
}

void LineForGoods_di::validate()
{
    // TODO: implement validation
}

web::json::value LineForGoods_di::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_CustomsValueIsSet)
    {
        val[U("customsValue")] = ModelBase::toJson(m_CustomsValue);
    }
    val[U("diNumber")] = ModelBase::toJson(m_DiNumber);
    val[U("registerDateDI")] = ModelBase::toJson(m_RegisterDateDI);
    val[U("clearanceSite")] = ModelBase::toJson(m_ClearanceSite);
    val[U("clearanceState")] = ModelBase::toJson(m_ClearanceState);
    if(m_ClearanceDateIsSet)
    {
        val[U("clearanceDate")] = ModelBase::toJson(m_ClearanceDate);
    }
    val[U("transportDIType")] = ModelBase::toJson(m_TransportDIType);
    if(m_AfrmmValueIsSet)
    {
        val[U("afrmmValue")] = ModelBase::toJson(m_AfrmmValue);
    }
    val[U("intermediateType")] = ModelBase::toJson(m_IntermediateType);
    if(m_BuyerFederalTaxIDIsSet)
    {
        val[U("buyerFederalTaxID")] = ModelBase::toJson(m_BuyerFederalTaxID);
    }
    if(m_BuyerStateIsSet)
    {
        val[U("buyerState")] = ModelBase::toJson(m_BuyerState);
    }
    if(m_ExporterCodeIsSet)
    {
        val[U("exporterCode")] = ModelBase::toJson(m_ExporterCode);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Adi )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val[U("adi")] = web::json::value::array(jsonArray);
            }
    

    return val;
}

void LineForGoods_di::fromJson(web::json::value& val)
{
    if(val.has_field(U("customsValue")))
    {
        setCustomsValue(ModelBase::doubleFromJson(val[U("customsValue")]));
    }
    setDiNumber(ModelBase::stringFromJson(val[U("diNumber")]));
    utility::datetime newRegisterDateDI(utility::datetime());
    newRegisterDateDI->fromJson(val[U("registerDateDI")]);
    setRegisterDateDI( newItem );
    setClearanceSite(ModelBase::stringFromJson(val[U("clearanceSite")]));
    std::shared_ptr<StateEnum> newClearanceState(new StateEnum());
    newClearanceState->fromJson(val[U("clearanceState")]);
    setClearanceState( newItem );
    if(val.has_field(U("clearanceDate")))
    {
        if(!val[U("clearanceDate")].is_null())
        {
            utility::datetime newItem(utility::datetime());
            newItem->fromJson(val[U("clearanceDate")]);
            setClearanceDate( newItem );
        }
        
    }
    setTransportDIType(ModelBase::stringFromJson(val[U("transportDIType")]));
    if(val.has_field(U("afrmmValue")))
    {
        setAfrmmValue(ModelBase::doubleFromJson(val[U("afrmmValue")]));
    }
    setIntermediateType(ModelBase::stringFromJson(val[U("intermediateType")]));
    if(val.has_field(U("buyerFederalTaxID")))
    {
        setBuyerFederalTaxID(ModelBase::stringFromJson(val[U("buyerFederalTaxID")]));
        
    }
    if(val.has_field(U("buyerState")))
    {
        if(!val[U("buyerState")].is_null())
        {
            std::shared_ptr<StateEnum> newItem(new StateEnum());
            newItem->fromJson(val[U("buyerState")]);
            setBuyerState( newItem );
        }
        
    }
    if(val.has_field(U("exporterCode")))
    {
        setExporterCode(ModelBase::stringFromJson(val[U("exporterCode")]));
        
    }
    {
        m_Adi.clear();
        std::vector<web::json::value> jsonArray;
                for( auto& item : val[U("adi")].as_array() )
        {
            
            if(item.is_null())
            {
                m_Adi.push_back( std::shared_ptr<LineForGoods_adi>(nullptr) );
            }
            else
            {
                std::shared_ptr<LineForGoods_adi> newItem(new LineForGoods_adi());
                newItem->fromJson(item);
                m_Adi.push_back( newItem );
            }
            
        }
    }
    
}

void LineForGoods_di::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_CustomsValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("customsValue"), m_CustomsValue));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("diNumber"), m_DiNumber));
    m_RegisterDateDI->toMultipart(multipart, U("registerDateDI."));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("clearanceSite"), m_ClearanceSite));
    m_ClearanceState->toMultipart(multipart, U("clearanceState."));
    if(m_ClearanceDateIsSet)
    {
        if (m_ClearanceDate.get())
        {
            m_ClearanceDate->toMultipart(multipart, U("clearanceDate."));
        }
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("transportDIType"), m_TransportDIType));
    if(m_AfrmmValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("afrmmValue"), m_AfrmmValue));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("intermediateType"), m_IntermediateType));
    if(m_BuyerFederalTaxIDIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("buyerFederalTaxID"), m_BuyerFederalTaxID));
        
    }
    if(m_BuyerStateIsSet)
    {
        if (m_BuyerState.get())
        {
            m_BuyerState->toMultipart(multipart, U("buyerState."));
        }
        
    }
    if(m_ExporterCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("exporterCode"), m_ExporterCode));
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Adi )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        multipart->add(ModelBase::toHttpContent(namePrefix + U("adi"), web::json::value::array(jsonArray), U("application/json")));
            }
    
}

void LineForGoods_di::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("customsValue")))
    {
        setCustomsValue(ModelBase::doubleFromHttpContent(multipart->getContent(U("customsValue"))));
    }
    setDiNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("diNumber"))));
    utility::datetime newRegisterDateDI(utility::datetime());
    newRegisterDateDI->fromMultiPart(multipart, U("registerDateDI."));
    setRegisterDateDI( newRegisterDateDI );
    setClearanceSite(ModelBase::stringFromHttpContent(multipart->getContent(U("clearanceSite"))));
    std::shared_ptr<StateEnum> newClearanceState(new StateEnum());
    newClearanceState->fromMultiPart(multipart, U("clearanceState."));
    setClearanceState( newClearanceState );
    if(multipart->hasContent(U("clearanceDate")))
    {
        if(multipart->hasContent(U("clearanceDate")))
        {
            utility::datetime newItem(utility::datetime());
            newItem->fromMultiPart(multipart, U("clearanceDate."));
            setClearanceDate( newItem );
        }
        
    }
    setTransportDIType(ModelBase::stringFromHttpContent(multipart->getContent(U("transportDIType"))));
    if(multipart->hasContent(U("afrmmValue")))
    {
        setAfrmmValue(ModelBase::doubleFromHttpContent(multipart->getContent(U("afrmmValue"))));
    }
    setIntermediateType(ModelBase::stringFromHttpContent(multipart->getContent(U("intermediateType"))));
    if(multipart->hasContent(U("buyerFederalTaxID")))
    {
        setBuyerFederalTaxID(ModelBase::stringFromHttpContent(multipart->getContent(U("buyerFederalTaxID"))));
        
    }
    if(multipart->hasContent(U("buyerState")))
    {
        if(multipart->hasContent(U("buyerState")))
        {
            std::shared_ptr<StateEnum> newItem(new StateEnum());
            newItem->fromMultiPart(multipart, U("buyerState."));
            setBuyerState( newItem );
        }
        
    }
    if(multipart->hasContent(U("exporterCode")))
    {
        setExporterCode(ModelBase::stringFromHttpContent(multipart->getContent(U("exporterCode"))));
        
    }
    {
        m_Adi.clear();
        
        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("adi"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_Adi.push_back( std::shared_ptr<LineForGoods_adi>(nullptr) );
            }
            else
            {
                std::shared_ptr<LineForGoods_adi> newItem(new LineForGoods_adi());
                newItem->fromJson(item);
                m_Adi.push_back( newItem );
            }
            
        }
    }
    
}


double LineForGoods_di::getCustomsValue() const
{
    return m_CustomsValue;
}
void LineForGoods_di::setCustomsValue(double value)
{
    m_CustomsValue = value;
    m_CustomsValueIsSet = true;
}
bool LineForGoods_di::customsValueIsSet() const
{
    return m_CustomsValueIsSet;
}
void LineForGoods_di::unsetCustomsValue()
{
    m_CustomsValueIsSet = false;
}
utility::string_t LineForGoods_di::getDiNumber() const
{
    return m_DiNumber;
}
void LineForGoods_di::setDiNumber(utility::string_t value)
{
    m_DiNumber = value;
    
}
utility::datetime LineForGoods_di::getRegisterDateDI() const
{
    return m_RegisterDateDI;
}
void LineForGoods_di::setRegisterDateDI(utility::datetime value)
{
    m_RegisterDateDI = value;
    
}
utility::string_t LineForGoods_di::getClearanceSite() const
{
    return m_ClearanceSite;
}
void LineForGoods_di::setClearanceSite(utility::string_t value)
{
    m_ClearanceSite = value;
    
}
std::shared_ptr<StateEnum> LineForGoods_di::getClearanceState() const
{
    return m_ClearanceState;
}
void LineForGoods_di::setClearanceState(std::shared_ptr<StateEnum> value)
{
    m_ClearanceState = value;
    
}
utility::datetime LineForGoods_di::getClearanceDate() const
{
    return m_ClearanceDate;
}
void LineForGoods_di::setClearanceDate(utility::datetime value)
{
    m_ClearanceDate = value;
    m_ClearanceDateIsSet = true;
}
bool LineForGoods_di::clearanceDateIsSet() const
{
    return m_ClearanceDateIsSet;
}
void LineForGoods_di::unsetClearanceDate()
{
    m_ClearanceDateIsSet = false;
}
utility::string_t LineForGoods_di::getTransportDIType() const
{
    return m_TransportDIType;
}
void LineForGoods_di::setTransportDIType(utility::string_t value)
{
    m_TransportDIType = value;
    
}
double LineForGoods_di::getAfrmmValue() const
{
    return m_AfrmmValue;
}
void LineForGoods_di::setAfrmmValue(double value)
{
    m_AfrmmValue = value;
    m_AfrmmValueIsSet = true;
}
bool LineForGoods_di::afrmmValueIsSet() const
{
    return m_AfrmmValueIsSet;
}
void LineForGoods_di::unsetAfrmmValue()
{
    m_AfrmmValueIsSet = false;
}
utility::string_t LineForGoods_di::getIntermediateType() const
{
    return m_IntermediateType;
}
void LineForGoods_di::setIntermediateType(utility::string_t value)
{
    m_IntermediateType = value;
    
}
utility::string_t LineForGoods_di::getBuyerFederalTaxID() const
{
    return m_BuyerFederalTaxID;
}
void LineForGoods_di::setBuyerFederalTaxID(utility::string_t value)
{
    m_BuyerFederalTaxID = value;
    m_BuyerFederalTaxIDIsSet = true;
}
bool LineForGoods_di::buyerFederalTaxIDIsSet() const
{
    return m_BuyerFederalTaxIDIsSet;
}
void LineForGoods_di::unsetBuyerFederalTaxID()
{
    m_BuyerFederalTaxIDIsSet = false;
}
std::shared_ptr<StateEnum> LineForGoods_di::getBuyerState() const
{
    return m_BuyerState;
}
void LineForGoods_di::setBuyerState(std::shared_ptr<StateEnum> value)
{
    m_BuyerState = value;
    m_BuyerStateIsSet = true;
}
bool LineForGoods_di::buyerStateIsSet() const
{
    return m_BuyerStateIsSet;
}
void LineForGoods_di::unsetBuyerState()
{
    m_BuyerStateIsSet = false;
}
utility::string_t LineForGoods_di::getExporterCode() const
{
    return m_ExporterCode;
}
void LineForGoods_di::setExporterCode(utility::string_t value)
{
    m_ExporterCode = value;
    m_ExporterCodeIsSet = true;
}
bool LineForGoods_di::exporterCodeIsSet() const
{
    return m_ExporterCodeIsSet;
}
void LineForGoods_di::unsetExporterCode()
{
    m_ExporterCodeIsSet = false;
}
std::vector<std::shared_ptr<LineForGoods_adi>>& LineForGoods_di::getAdi()
{
    return m_Adi;
}

}
}
}
}

