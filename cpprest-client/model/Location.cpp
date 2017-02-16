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



#include "Location.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Location::Location()
{
    m_Street = U("");
    m_StreetIsSet = false;
    m_Neighborhood = U("");
    m_NeighborhoodIsSet = false;
    m_Zipcode = U("");
    m_CityCode = U("");
    m_CityCodeIsSet = false;
    m_CityName = U("");
    m_CityNameIsSet = false;
    m_StateIsSet = false;
    m_CountryCode = U("");
    m_CountryCodeIsSet = false;
    m_Country = U("");
    m_CountryIsSet = false;
    m_Number = U("");
    m_NumberIsSet = false;
    m_Complement = U("");
    m_ComplementIsSet = false;
    m_Phone = U("");
    m_PhoneIsSet = false;
    m_CompanyId = nullptr;
    m_Code = U("");
    m_Type = U("");
    m_Email = U("");
    m_EmailIsSet = false;
    m_FederalTaxId = U("");
    m_FederalTaxIdIsSet = false;
    m_StateTaxId = U("");
    m_StateTaxIdIsSet = false;
    m_SecondaryStateTaxIdIsSet = false;
    m_CityTaxId = U("");
    m_CityTaxIdIsSet = false;
    m_Suframa = U("");
    m_SuframaIsSet = false;
    m_MainActivity = U("");
    m_MainActivityIsSet = false;
    m_NfseProcessModel = U("");
    m_NfseProcessModelIsSet = false;
    
}

Location::~Location()
{
}

void Location::validate()
{
    // TODO: implement validation
}

web::json::value Location::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_StreetIsSet)
    {
        val[U("street")] = ModelBase::toJson(m_Street);
    }
    if(m_NeighborhoodIsSet)
    {
        val[U("neighborhood")] = ModelBase::toJson(m_Neighborhood);
    }
    val[U("zipcode")] = ModelBase::toJson(m_Zipcode);
    if(m_CityCodeIsSet)
    {
        val[U("cityCode")] = ModelBase::toJson(m_CityCode);
    }
    if(m_CityNameIsSet)
    {
        val[U("cityName")] = ModelBase::toJson(m_CityName);
    }
    if(m_StateIsSet)
    {
        val[U("state")] = ModelBase::toJson(m_State);
    }
    if(m_CountryCodeIsSet)
    {
        val[U("countryCode")] = ModelBase::toJson(m_CountryCode);
    }
    if(m_CountryIsSet)
    {
        val[U("country")] = ModelBase::toJson(m_Country);
    }
    if(m_NumberIsSet)
    {
        val[U("number")] = ModelBase::toJson(m_Number);
    }
    if(m_ComplementIsSet)
    {
        val[U("complement")] = ModelBase::toJson(m_Complement);
    }
    if(m_PhoneIsSet)
    {
        val[U("phone")] = ModelBase::toJson(m_Phone);
    }
    val[U("companyId")] = ModelBase::toJson(m_CompanyId);
    val[U("code")] = ModelBase::toJson(m_Code);
    val[U("type")] = ModelBase::toJson(m_Type);
    if(m_EmailIsSet)
    {
        val[U("email")] = ModelBase::toJson(m_Email);
    }
    if(m_FederalTaxIdIsSet)
    {
        val[U("federalTaxId")] = ModelBase::toJson(m_FederalTaxId);
    }
    if(m_StateTaxIdIsSet)
    {
        val[U("stateTaxId")] = ModelBase::toJson(m_StateTaxId);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_SecondaryStateTaxId )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("secondaryStateTaxId")] = web::json::value::array(jsonArray);
        }
    }
    if(m_CityTaxIdIsSet)
    {
        val[U("cityTaxId")] = ModelBase::toJson(m_CityTaxId);
    }
    if(m_SuframaIsSet)
    {
        val[U("suframa")] = ModelBase::toJson(m_Suframa);
    }
    if(m_MainActivityIsSet)
    {
        val[U("mainActivity")] = ModelBase::toJson(m_MainActivity);
    }
    if(m_NfseProcessModelIsSet)
    {
        val[U("nfseProcessModel")] = ModelBase::toJson(m_NfseProcessModel);
    }
    

    return val;
}

void Location::fromJson(web::json::value& val)
{
    if(val.has_field(U("street")))
    {
        setStreet(ModelBase::stringFromJson(val[U("street")]));
        
    }
    if(val.has_field(U("neighborhood")))
    {
        setNeighborhood(ModelBase::stringFromJson(val[U("neighborhood")]));
        
    }
    setZipcode(ModelBase::stringFromJson(val[U("zipcode")]));
    if(val.has_field(U("cityCode")))
    {
        setCityCode(ModelBase::stringFromJson(val[U("cityCode")]));
        
    }
    if(val.has_field(U("cityName")))
    {
        setCityName(ModelBase::stringFromJson(val[U("cityName")]));
        
    }
    if(val.has_field(U("state")))
    {
        if(!val[U("state")].is_null())
        {
            std::shared_ptr<StateEnum> newItem(new StateEnum());
            newItem->fromJson(val[U("state")]);
            setState( newItem );
        }
        
    }
    if(val.has_field(U("countryCode")))
    {
        setCountryCode(ModelBase::stringFromJson(val[U("countryCode")]));
        
    }
    if(val.has_field(U("country")))
    {
        setCountry(ModelBase::stringFromJson(val[U("country")]));
        
    }
    if(val.has_field(U("number")))
    {
        setNumber(ModelBase::stringFromJson(val[U("number")]));
        
    }
    if(val.has_field(U("complement")))
    {
        setComplement(ModelBase::stringFromJson(val[U("complement")]));
        
    }
    if(val.has_field(U("phone")))
    {
        setPhone(ModelBase::stringFromJson(val[U("phone")]));
        
    }
    setCompanyId(ModelBase::stringFromJson(val[U("companyId")]));
    setCode(ModelBase::stringFromJson(val[U("code")]));
    setType(ModelBase::stringFromJson(val[U("type")]));
    if(val.has_field(U("email")))
    {
        setEmail(ModelBase::stringFromJson(val[U("email")]));
        
    }
    if(val.has_field(U("federalTaxId")))
    {
        setFederalTaxId(ModelBase::stringFromJson(val[U("federalTaxId")]));
        
    }
    if(val.has_field(U("stateTaxId")))
    {
        setStateTaxId(ModelBase::stringFromJson(val[U("stateTaxId")]));
        
    }
    {
        m_SecondaryStateTaxId.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("secondaryStateTaxId")))
        {
        for( auto& item : val[U("secondaryStateTaxId")].as_array() )
        {
            
            if(item.is_null())
            {
                m_SecondaryStateTaxId.push_back( std::shared_ptr<Location_secondaryStateTaxId>(nullptr) );
            }
            else
            {
                std::shared_ptr<Location_secondaryStateTaxId> newItem(new Location_secondaryStateTaxId());
                newItem->fromJson(item);
                m_SecondaryStateTaxId.push_back( newItem );
            }
            
        }
        }
    }
    if(val.has_field(U("cityTaxId")))
    {
        setCityTaxId(ModelBase::stringFromJson(val[U("cityTaxId")]));
        
    }
    if(val.has_field(U("suframa")))
    {
        setSuframa(ModelBase::stringFromJson(val[U("suframa")]));
        
    }
    if(val.has_field(U("mainActivity")))
    {
        setMainActivity(ModelBase::stringFromJson(val[U("mainActivity")]));
        
    }
    if(val.has_field(U("nfseProcessModel")))
    {
        setNfseProcessModel(ModelBase::stringFromJson(val[U("nfseProcessModel")]));
        
    }
    
}

void Location::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_StreetIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("street"), m_Street));
        
    }
    if(m_NeighborhoodIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("neighborhood"), m_Neighborhood));
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("zipcode"), m_Zipcode));
    if(m_CityCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityCode"), m_CityCode));
        
    }
    if(m_CityNameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityName"), m_CityName));
        
    }
    if(m_StateIsSet)
    {
        if (m_State.get())
        {
            m_State->toMultipart(multipart, U("state."));
        }
        
    }
    if(m_CountryCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("countryCode"), m_CountryCode));
        
    }
    if(m_CountryIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("country"), m_Country));
        
    }
    if(m_NumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("number"), m_Number));
        
    }
    if(m_ComplementIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("complement"), m_Complement));
        
    }
    if(m_PhoneIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("phone"), m_Phone));
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("companyId"), m_CompanyId));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("code"), m_Code));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("type"), m_Type));
    if(m_EmailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("email"), m_Email));
        
    }
    if(m_FederalTaxIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("federalTaxId"), m_FederalTaxId));
        
    }
    if(m_StateTaxIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("stateTaxId"), m_StateTaxId));
        
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_SecondaryStateTaxId )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("secondaryStateTaxId"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    if(m_CityTaxIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityTaxId"), m_CityTaxId));
        
    }
    if(m_SuframaIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("suframa"), m_Suframa));
        
    }
    if(m_MainActivityIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("mainActivity"), m_MainActivity));
        
    }
    if(m_NfseProcessModelIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("nfseProcessModel"), m_NfseProcessModel));
        
    }
    
}

void Location::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("street")))
    {
        setStreet(ModelBase::stringFromHttpContent(multipart->getContent(U("street"))));
        
    }
    if(multipart->hasContent(U("neighborhood")))
    {
        setNeighborhood(ModelBase::stringFromHttpContent(multipart->getContent(U("neighborhood"))));
        
    }
    setZipcode(ModelBase::stringFromHttpContent(multipart->getContent(U("zipcode"))));
    if(multipart->hasContent(U("cityCode")))
    {
        setCityCode(ModelBase::stringFromHttpContent(multipart->getContent(U("cityCode"))));
        
    }
    if(multipart->hasContent(U("cityName")))
    {
        setCityName(ModelBase::stringFromHttpContent(multipart->getContent(U("cityName"))));
        
    }
    if(multipart->hasContent(U("state")))
    {
        if(multipart->hasContent(U("state")))
        {
            std::shared_ptr<StateEnum> newItem(new StateEnum());
            newItem->fromMultiPart(multipart, U("state."));
            setState( newItem );
        }
        
    }
    if(multipart->hasContent(U("countryCode")))
    {
        setCountryCode(ModelBase::stringFromHttpContent(multipart->getContent(U("countryCode"))));
        
    }
    if(multipart->hasContent(U("country")))
    {
        setCountry(ModelBase::stringFromHttpContent(multipart->getContent(U("country"))));
        
    }
    if(multipart->hasContent(U("number")))
    {
        setNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("number"))));
        
    }
    if(multipart->hasContent(U("complement")))
    {
        setComplement(ModelBase::stringFromHttpContent(multipart->getContent(U("complement"))));
        
    }
    if(multipart->hasContent(U("phone")))
    {
        setPhone(ModelBase::stringFromHttpContent(multipart->getContent(U("phone"))));
        
    }
    setCompanyId(ModelBase::stringFromHttpContent(multipart->getContent(U("companyId"))));
    setCode(ModelBase::stringFromHttpContent(multipart->getContent(U("code"))));
    setType(ModelBase::stringFromHttpContent(multipart->getContent(U("type"))));
    if(multipart->hasContent(U("email")))
    {
        setEmail(ModelBase::stringFromHttpContent(multipart->getContent(U("email"))));
        
    }
    if(multipart->hasContent(U("federalTaxId")))
    {
        setFederalTaxId(ModelBase::stringFromHttpContent(multipart->getContent(U("federalTaxId"))));
        
    }
    if(multipart->hasContent(U("stateTaxId")))
    {
        setStateTaxId(ModelBase::stringFromHttpContent(multipart->getContent(U("stateTaxId"))));
        
    }
    {
        m_SecondaryStateTaxId.clear();
        if(multipart->hasContent(U("secondaryStateTaxId")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("secondaryStateTaxId"))));
        for( auto& item : jsonArray.as_array() )
        {
            
            if(item.is_null())
            {
                m_SecondaryStateTaxId.push_back( std::shared_ptr<Location_secondaryStateTaxId>(nullptr) );
            }
            else
            {
                std::shared_ptr<Location_secondaryStateTaxId> newItem(new Location_secondaryStateTaxId());
                newItem->fromJson(item);
                m_SecondaryStateTaxId.push_back( newItem );
            }
            
        }
        }
    }
    if(multipart->hasContent(U("cityTaxId")))
    {
        setCityTaxId(ModelBase::stringFromHttpContent(multipart->getContent(U("cityTaxId"))));
        
    }
    if(multipart->hasContent(U("suframa")))
    {
        setSuframa(ModelBase::stringFromHttpContent(multipart->getContent(U("suframa"))));
        
    }
    if(multipart->hasContent(U("mainActivity")))
    {
        setMainActivity(ModelBase::stringFromHttpContent(multipart->getContent(U("mainActivity"))));
        
    }
    if(multipart->hasContent(U("nfseProcessModel")))
    {
        setNfseProcessModel(ModelBase::stringFromHttpContent(multipart->getContent(U("nfseProcessModel"))));
        
    }
    
}


utility::string_t Location::getStreet() const
{
    return m_Street;
}
void Location::setStreet(utility::string_t value)
{
    m_Street = value;
    m_StreetIsSet = true;
}
bool Location::streetIsSet() const
{
    return m_StreetIsSet;
}
void Location::unsetStreet()
{
    m_StreetIsSet = false;
}
utility::string_t Location::getNeighborhood() const
{
    return m_Neighborhood;
}
void Location::setNeighborhood(utility::string_t value)
{
    m_Neighborhood = value;
    m_NeighborhoodIsSet = true;
}
bool Location::neighborhoodIsSet() const
{
    return m_NeighborhoodIsSet;
}
void Location::unsetNeighborhood()
{
    m_NeighborhoodIsSet = false;
}
utility::string_t Location::getZipcode() const
{
    return m_Zipcode;
}
void Location::setZipcode(utility::string_t value)
{
    m_Zipcode = value;
    
}
utility::string_t Location::getCityCode() const
{
    return m_CityCode;
}
void Location::setCityCode(utility::string_t value)
{
    m_CityCode = value;
    m_CityCodeIsSet = true;
}
bool Location::cityCodeIsSet() const
{
    return m_CityCodeIsSet;
}
void Location::unsetCityCode()
{
    m_CityCodeIsSet = false;
}
utility::string_t Location::getCityName() const
{
    return m_CityName;
}
void Location::setCityName(utility::string_t value)
{
    m_CityName = value;
    m_CityNameIsSet = true;
}
bool Location::cityNameIsSet() const
{
    return m_CityNameIsSet;
}
void Location::unsetCityName()
{
    m_CityNameIsSet = false;
}
std::shared_ptr<StateEnum> Location::getState() const
{
    return m_State;
}
void Location::setState(std::shared_ptr<StateEnum> value)
{
    m_State = value;
    m_StateIsSet = true;
}
bool Location::stateIsSet() const
{
    return m_StateIsSet;
}
void Location::unsetState()
{
    m_StateIsSet = false;
}
utility::string_t Location::getCountryCode() const
{
    return m_CountryCode;
}
void Location::setCountryCode(utility::string_t value)
{
    m_CountryCode = value;
    m_CountryCodeIsSet = true;
}
bool Location::countryCodeIsSet() const
{
    return m_CountryCodeIsSet;
}
void Location::unsetCountryCode()
{
    m_CountryCodeIsSet = false;
}
utility::string_t Location::getCountry() const
{
    return m_Country;
}
void Location::setCountry(utility::string_t value)
{
    m_Country = value;
    m_CountryIsSet = true;
}
bool Location::countryIsSet() const
{
    return m_CountryIsSet;
}
void Location::unsetCountry()
{
    m_CountryIsSet = false;
}
utility::string_t Location::getNumber() const
{
    return m_Number;
}
void Location::setNumber(utility::string_t value)
{
    m_Number = value;
    m_NumberIsSet = true;
}
bool Location::numberIsSet() const
{
    return m_NumberIsSet;
}
void Location::unsetNumber()
{
    m_NumberIsSet = false;
}
utility::string_t Location::getComplement() const
{
    return m_Complement;
}
void Location::setComplement(utility::string_t value)
{
    m_Complement = value;
    m_ComplementIsSet = true;
}
bool Location::complementIsSet() const
{
    return m_ComplementIsSet;
}
void Location::unsetComplement()
{
    m_ComplementIsSet = false;
}
utility::string_t Location::getPhone() const
{
    return m_Phone;
}
void Location::setPhone(utility::string_t value)
{
    m_Phone = value;
    m_PhoneIsSet = true;
}
bool Location::phoneIsSet() const
{
    return m_PhoneIsSet;
}
void Location::unsetPhone()
{
    m_PhoneIsSet = false;
}
std::shared_ptr<UUID> Location::getCompanyId() const
{
    return m_CompanyId;
}
void Location::setCompanyId(std::shared_ptr<UUID> value)
{
    m_CompanyId = value;
    
}
utility::string_t Location::getCode() const
{
    return m_Code;
}
void Location::setCode(utility::string_t value)
{
    m_Code = value;
    
}
utility::string_t Location::getType() const
{
    return m_Type;
}
void Location::setType(utility::string_t value)
{
    m_Type = value;
    
}
utility::string_t Location::getEmail() const
{
    return m_Email;
}
void Location::setEmail(utility::string_t value)
{
    m_Email = value;
    m_EmailIsSet = true;
}
bool Location::emailIsSet() const
{
    return m_EmailIsSet;
}
void Location::unsetEmail()
{
    m_EmailIsSet = false;
}
utility::string_t Location::getFederalTaxId() const
{
    return m_FederalTaxId;
}
void Location::setFederalTaxId(utility::string_t value)
{
    m_FederalTaxId = value;
    m_FederalTaxIdIsSet = true;
}
bool Location::federalTaxIdIsSet() const
{
    return m_FederalTaxIdIsSet;
}
void Location::unsetFederalTaxId()
{
    m_FederalTaxIdIsSet = false;
}
utility::string_t Location::getStateTaxId() const
{
    return m_StateTaxId;
}
void Location::setStateTaxId(utility::string_t value)
{
    m_StateTaxId = value;
    m_StateTaxIdIsSet = true;
}
bool Location::stateTaxIdIsSet() const
{
    return m_StateTaxIdIsSet;
}
void Location::unsetStateTaxId()
{
    m_StateTaxIdIsSet = false;
}
std::vector<std::shared_ptr<Location_secondaryStateTaxId>>& Location::getSecondaryStateTaxId()
{
    return m_SecondaryStateTaxId;
}
bool Location::secondaryStateTaxIdIsSet() const
{
    return m_SecondaryStateTaxIdIsSet;
}
void Location::unsetSecondaryStateTaxId()
{
    m_SecondaryStateTaxIdIsSet = false;
}
utility::string_t Location::getCityTaxId() const
{
    return m_CityTaxId;
}
void Location::setCityTaxId(utility::string_t value)
{
    m_CityTaxId = value;
    m_CityTaxIdIsSet = true;
}
bool Location::cityTaxIdIsSet() const
{
    return m_CityTaxIdIsSet;
}
void Location::unsetCityTaxId()
{
    m_CityTaxIdIsSet = false;
}
utility::string_t Location::getSuframa() const
{
    return m_Suframa;
}
void Location::setSuframa(utility::string_t value)
{
    m_Suframa = value;
    m_SuframaIsSet = true;
}
bool Location::suframaIsSet() const
{
    return m_SuframaIsSet;
}
void Location::unsetSuframa()
{
    m_SuframaIsSet = false;
}
utility::string_t Location::getMainActivity() const
{
    return m_MainActivity;
}
void Location::setMainActivity(utility::string_t value)
{
    m_MainActivity = value;
    m_MainActivityIsSet = true;
}
bool Location::mainActivityIsSet() const
{
    return m_MainActivityIsSet;
}
void Location::unsetMainActivity()
{
    m_MainActivityIsSet = false;
}
utility::string_t Location::getNfseProcessModel() const
{
    return m_NfseProcessModel;
}
void Location::setNfseProcessModel(utility::string_t value)
{
    m_NfseProcessModel = value;
    m_NfseProcessModelIsSet = true;
}
bool Location::nfseProcessModelIsSet() const
{
    return m_NfseProcessModelIsSet;
}
void Location::unsetNfseProcessModel()
{
    m_NfseProcessModelIsSet = false;
}

}
}
}
}

