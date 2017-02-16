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



#include "Fuel.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Fuel::Fuel()
{
    m_ProdANPCode = U("");
    m_PerMixGN = 0.0;
    m_PerMixGNIsSet = false;
    m_AuthorizationCodeCODIF = U("");
    m_AuthorizationCodeCODIFIsSet = false;
    m_QuantityOnRoomTemperature = 0.0;
    m_QuantityOnRoomTemperatureIsSet = false;
    m_CideIsSet = false;
    m_PumpNumberIsSet = false;
    
}

Fuel::~Fuel()
{
}

void Fuel::validate()
{
    // TODO: implement validation
}

web::json::value Fuel::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("prodANPCode")] = ModelBase::toJson(m_ProdANPCode);
    if(m_PerMixGNIsSet)
    {
        val[U("perMixGN")] = ModelBase::toJson(m_PerMixGN);
    }
    if(m_AuthorizationCodeCODIFIsSet)
    {
        val[U("authorizationCodeCODIF")] = ModelBase::toJson(m_AuthorizationCodeCODIF);
    }
    if(m_QuantityOnRoomTemperatureIsSet)
    {
        val[U("quantityOnRoomTemperature")] = ModelBase::toJson(m_QuantityOnRoomTemperature);
    }
    val[U("stateCodeOfUndUser")] = ModelBase::toJson(m_StateCodeOfUndUser);
    if(m_CideIsSet)
    {
        val[U("cide")] = ModelBase::toJson(m_Cide);
    }
    if(m_PumpNumberIsSet)
    {
        val[U("pumpNumber")] = ModelBase::toJson(m_PumpNumber);
    }
    

    return val;
}

void Fuel::fromJson(web::json::value& val)
{
    setProdANPCode(ModelBase::stringFromJson(val[U("prodANPCode")]));
    if(val.has_field(U("perMixGN")))
    {
        setPerMixGN(ModelBase::doubleFromJson(val[U("perMixGN")]));
    }
    if(val.has_field(U("authorizationCodeCODIF")))
    {
        setAuthorizationCodeCODIF(ModelBase::stringFromJson(val[U("authorizationCodeCODIF")]));
        
    }
    if(val.has_field(U("quantityOnRoomTemperature")))
    {
        setQuantityOnRoomTemperature(ModelBase::doubleFromJson(val[U("quantityOnRoomTemperature")]));
    }
    std::shared_ptr<StateEnum> newStateCodeOfUndUser(new StateEnum());
    newStateCodeOfUndUser->fromJson(val[U("stateCodeOfUndUser")]);
    setStateCodeOfUndUser( newItem );
    if(val.has_field(U("cide")))
    {
        if(!val[U("cide")].is_null())
        {
            std::shared_ptr<Fuel_cide> newItem(new Fuel_cide());
            newItem->fromJson(val[U("cide")]);
            setCide( newItem );
        }
        
    }
    if(val.has_field(U("pumpNumber")))
    {
        if(!val[U("pumpNumber")].is_null())
        {
            std::shared_ptr<Fuel_pumpNumber> newItem(new Fuel_pumpNumber());
            newItem->fromJson(val[U("pumpNumber")]);
            setPumpNumber( newItem );
        }
        
    }
    
}

void Fuel::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("prodANPCode"), m_ProdANPCode));
    if(m_PerMixGNIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("perMixGN"), m_PerMixGN));
    }
    if(m_AuthorizationCodeCODIFIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("authorizationCodeCODIF"), m_AuthorizationCodeCODIF));
        
    }
    if(m_QuantityOnRoomTemperatureIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("quantityOnRoomTemperature"), m_QuantityOnRoomTemperature));
    }
    m_StateCodeOfUndUser->toMultipart(multipart, U("stateCodeOfUndUser."));
    if(m_CideIsSet)
    {
        if (m_Cide.get())
        {
            m_Cide->toMultipart(multipart, U("cide."));
        }
        
    }
    if(m_PumpNumberIsSet)
    {
        if (m_PumpNumber.get())
        {
            m_PumpNumber->toMultipart(multipart, U("pumpNumber."));
        }
        
    }
    
}

void Fuel::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setProdANPCode(ModelBase::stringFromHttpContent(multipart->getContent(U("prodANPCode"))));
    if(multipart->hasContent(U("perMixGN")))
    {
        setPerMixGN(ModelBase::doubleFromHttpContent(multipart->getContent(U("perMixGN"))));
    }
    if(multipart->hasContent(U("authorizationCodeCODIF")))
    {
        setAuthorizationCodeCODIF(ModelBase::stringFromHttpContent(multipart->getContent(U("authorizationCodeCODIF"))));
        
    }
    if(multipart->hasContent(U("quantityOnRoomTemperature")))
    {
        setQuantityOnRoomTemperature(ModelBase::doubleFromHttpContent(multipart->getContent(U("quantityOnRoomTemperature"))));
    }
    std::shared_ptr<StateEnum> newStateCodeOfUndUser(new StateEnum());
    newStateCodeOfUndUser->fromMultiPart(multipart, U("stateCodeOfUndUser."));
    setStateCodeOfUndUser( newStateCodeOfUndUser );
    if(multipart->hasContent(U("cide")))
    {
        if(multipart->hasContent(U("cide")))
        {
            std::shared_ptr<Fuel_cide> newItem(new Fuel_cide());
            newItem->fromMultiPart(multipart, U("cide."));
            setCide( newItem );
        }
        
    }
    if(multipart->hasContent(U("pumpNumber")))
    {
        if(multipart->hasContent(U("pumpNumber")))
        {
            std::shared_ptr<Fuel_pumpNumber> newItem(new Fuel_pumpNumber());
            newItem->fromMultiPart(multipart, U("pumpNumber."));
            setPumpNumber( newItem );
        }
        
    }
    
}


utility::string_t Fuel::getProdANPCode() const
{
    return m_ProdANPCode;
}
void Fuel::setProdANPCode(utility::string_t value)
{
    m_ProdANPCode = value;
    
}
double Fuel::getPerMixGN() const
{
    return m_PerMixGN;
}
void Fuel::setPerMixGN(double value)
{
    m_PerMixGN = value;
    m_PerMixGNIsSet = true;
}
bool Fuel::perMixGNIsSet() const
{
    return m_PerMixGNIsSet;
}
void Fuel::unsetPerMixGN()
{
    m_PerMixGNIsSet = false;
}
utility::string_t Fuel::getAuthorizationCodeCODIF() const
{
    return m_AuthorizationCodeCODIF;
}
void Fuel::setAuthorizationCodeCODIF(utility::string_t value)
{
    m_AuthorizationCodeCODIF = value;
    m_AuthorizationCodeCODIFIsSet = true;
}
bool Fuel::authorizationCodeCODIFIsSet() const
{
    return m_AuthorizationCodeCODIFIsSet;
}
void Fuel::unsetAuthorizationCodeCODIF()
{
    m_AuthorizationCodeCODIFIsSet = false;
}
double Fuel::getQuantityOnRoomTemperature() const
{
    return m_QuantityOnRoomTemperature;
}
void Fuel::setQuantityOnRoomTemperature(double value)
{
    m_QuantityOnRoomTemperature = value;
    m_QuantityOnRoomTemperatureIsSet = true;
}
bool Fuel::quantityOnRoomTemperatureIsSet() const
{
    return m_QuantityOnRoomTemperatureIsSet;
}
void Fuel::unsetQuantityOnRoomTemperature()
{
    m_QuantityOnRoomTemperatureIsSet = false;
}
std::shared_ptr<StateEnum> Fuel::getStateCodeOfUndUser() const
{
    return m_StateCodeOfUndUser;
}
void Fuel::setStateCodeOfUndUser(std::shared_ptr<StateEnum> value)
{
    m_StateCodeOfUndUser = value;
    
}
std::shared_ptr<Fuel_cide> Fuel::getCide() const
{
    return m_Cide;
}
void Fuel::setCide(std::shared_ptr<Fuel_cide> value)
{
    m_Cide = value;
    m_CideIsSet = true;
}
bool Fuel::cideIsSet() const
{
    return m_CideIsSet;
}
void Fuel::unsetCide()
{
    m_CideIsSet = false;
}
std::shared_ptr<Fuel_pumpNumber> Fuel::getPumpNumber() const
{
    return m_PumpNumber;
}
void Fuel::setPumpNumber(std::shared_ptr<Fuel_pumpNumber> value)
{
    m_PumpNumber = value;
    m_PumpNumberIsSet = true;
}
bool Fuel::pumpNumberIsSet() const
{
    return m_PumpNumberIsSet;
}
void Fuel::unsetPumpNumber()
{
    m_PumpNumberIsSet = false;
}

}
}
}
}

