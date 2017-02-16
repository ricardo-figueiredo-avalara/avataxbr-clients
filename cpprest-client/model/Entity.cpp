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



#include "Entity.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Entity::Entity()
{
    m_Name = U("");
    m_NameIsSet = false;
    m_Role = U("");
    m_RoleIsSet = false;
    m_FederalTaxId = U("");
    m_CityTaxId = U("");
    m_CityTaxIdIsSet = false;
    m_StateTaxId = U("");
    m_StateTaxIdIsSet = false;
    m_Suframa = U("");
    m_SuframaIsSet = false;
    m_Phone = U("");
    m_PhoneIsSet = false;
    m_TaxRegime = U("");
    m_TaxRegimeIsSet = false;
    m_Email = U("");
    m_EmailIsSet = false;
    m_SubjectToSRF1234 = false;
    m_SubjectToSRF1234IsSet = false;
    
}

Entity::~Entity()
{
}

void Entity::validate()
{
    // TODO: implement validation
}

web::json::value Entity::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_NameIsSet)
    {
        val[U("name")] = ModelBase::toJson(m_Name);
    }
    if(m_RoleIsSet)
    {
        val[U("role")] = ModelBase::toJson(m_Role);
    }
    val[U("type")] = ModelBase::toJson(m_Type);
    val[U("federalTaxId")] = ModelBase::toJson(m_FederalTaxId);
    if(m_CityTaxIdIsSet)
    {
        val[U("cityTaxId")] = ModelBase::toJson(m_CityTaxId);
    }
    if(m_StateTaxIdIsSet)
    {
        val[U("stateTaxId")] = ModelBase::toJson(m_StateTaxId);
    }
    if(m_SuframaIsSet)
    {
        val[U("suframa")] = ModelBase::toJson(m_Suframa);
    }
    if(m_PhoneIsSet)
    {
        val[U("phone")] = ModelBase::toJson(m_Phone);
    }
    if(m_TaxRegimeIsSet)
    {
        val[U("taxRegime")] = ModelBase::toJson(m_TaxRegime);
    }
    if(m_EmailIsSet)
    {
        val[U("email")] = ModelBase::toJson(m_Email);
    }
    if(m_SubjectToSRF1234IsSet)
    {
        val[U("subjectToSRF1234")] = ModelBase::toJson(m_SubjectToSRF1234);
    }
    

    return val;
}

void Entity::fromJson(web::json::value& val)
{
    if(val.has_field(U("name")))
    {
        setName(ModelBase::stringFromJson(val[U("name")]));
        
    }
    if(val.has_field(U("role")))
    {
        setRole(ModelBase::stringFromJson(val[U("role")]));
        
    }
    std::shared_ptr<EntityType> newType(new EntityType());
    newType->fromJson(val[U("type")]);
    setType( newItem );
    setFederalTaxId(ModelBase::stringFromJson(val[U("federalTaxId")]));
    if(val.has_field(U("cityTaxId")))
    {
        setCityTaxId(ModelBase::stringFromJson(val[U("cityTaxId")]));
        
    }
    if(val.has_field(U("stateTaxId")))
    {
        setStateTaxId(ModelBase::stringFromJson(val[U("stateTaxId")]));
        
    }
    if(val.has_field(U("suframa")))
    {
        setSuframa(ModelBase::stringFromJson(val[U("suframa")]));
        
    }
    if(val.has_field(U("phone")))
    {
        setPhone(ModelBase::stringFromJson(val[U("phone")]));
        
    }
    if(val.has_field(U("taxRegime")))
    {
        setTaxRegime(ModelBase::stringFromJson(val[U("taxRegime")]));
        
    }
    if(val.has_field(U("email")))
    {
        setEmail(ModelBase::stringFromJson(val[U("email")]));
        
    }
    if(val.has_field(U("subjectToSRF1234")))
    {
        setSubjectToSRF1234(ModelBase::boolFromJson(val[U("subjectToSRF1234")]));
    }
    
}

void Entity::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("name"), m_Name));
        
    }
    if(m_RoleIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("role"), m_Role));
        
    }
    m_Type->toMultipart(multipart, U("type."));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("federalTaxId"), m_FederalTaxId));
    if(m_CityTaxIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("cityTaxId"), m_CityTaxId));
        
    }
    if(m_StateTaxIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("stateTaxId"), m_StateTaxId));
        
    }
    if(m_SuframaIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("suframa"), m_Suframa));
        
    }
    if(m_PhoneIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("phone"), m_Phone));
        
    }
    if(m_TaxRegimeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("taxRegime"), m_TaxRegime));
        
    }
    if(m_EmailIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("email"), m_Email));
        
    }
    if(m_SubjectToSRF1234IsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("subjectToSRF1234"), m_SubjectToSRF1234));
    }
    
}

void Entity::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("name")))
    {
        setName(ModelBase::stringFromHttpContent(multipart->getContent(U("name"))));
        
    }
    if(multipart->hasContent(U("role")))
    {
        setRole(ModelBase::stringFromHttpContent(multipart->getContent(U("role"))));
        
    }
    std::shared_ptr<EntityType> newType(new EntityType());
    newType->fromMultiPart(multipart, U("type."));
    setType( newType );
    setFederalTaxId(ModelBase::stringFromHttpContent(multipart->getContent(U("federalTaxId"))));
    if(multipart->hasContent(U("cityTaxId")))
    {
        setCityTaxId(ModelBase::stringFromHttpContent(multipart->getContent(U("cityTaxId"))));
        
    }
    if(multipart->hasContent(U("stateTaxId")))
    {
        setStateTaxId(ModelBase::stringFromHttpContent(multipart->getContent(U("stateTaxId"))));
        
    }
    if(multipart->hasContent(U("suframa")))
    {
        setSuframa(ModelBase::stringFromHttpContent(multipart->getContent(U("suframa"))));
        
    }
    if(multipart->hasContent(U("phone")))
    {
        setPhone(ModelBase::stringFromHttpContent(multipart->getContent(U("phone"))));
        
    }
    if(multipart->hasContent(U("taxRegime")))
    {
        setTaxRegime(ModelBase::stringFromHttpContent(multipart->getContent(U("taxRegime"))));
        
    }
    if(multipart->hasContent(U("email")))
    {
        setEmail(ModelBase::stringFromHttpContent(multipart->getContent(U("email"))));
        
    }
    if(multipart->hasContent(U("subjectToSRF1234")))
    {
        setSubjectToSRF1234(ModelBase::boolFromHttpContent(multipart->getContent(U("subjectToSRF1234"))));
    }
    
}


utility::string_t Entity::getName() const
{
    return m_Name;
}
void Entity::setName(utility::string_t value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool Entity::nameIsSet() const
{
    return m_NameIsSet;
}
void Entity::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t Entity::getRole() const
{
    return m_Role;
}
void Entity::setRole(utility::string_t value)
{
    m_Role = value;
    m_RoleIsSet = true;
}
bool Entity::roleIsSet() const
{
    return m_RoleIsSet;
}
void Entity::unsetRole()
{
    m_RoleIsSet = false;
}
std::shared_ptr<EntityType> Entity::getType() const
{
    return m_Type;
}
void Entity::setType(std::shared_ptr<EntityType> value)
{
    m_Type = value;
    
}
utility::string_t Entity::getFederalTaxId() const
{
    return m_FederalTaxId;
}
void Entity::setFederalTaxId(utility::string_t value)
{
    m_FederalTaxId = value;
    
}
utility::string_t Entity::getCityTaxId() const
{
    return m_CityTaxId;
}
void Entity::setCityTaxId(utility::string_t value)
{
    m_CityTaxId = value;
    m_CityTaxIdIsSet = true;
}
bool Entity::cityTaxIdIsSet() const
{
    return m_CityTaxIdIsSet;
}
void Entity::unsetCityTaxId()
{
    m_CityTaxIdIsSet = false;
}
utility::string_t Entity::getStateTaxId() const
{
    return m_StateTaxId;
}
void Entity::setStateTaxId(utility::string_t value)
{
    m_StateTaxId = value;
    m_StateTaxIdIsSet = true;
}
bool Entity::stateTaxIdIsSet() const
{
    return m_StateTaxIdIsSet;
}
void Entity::unsetStateTaxId()
{
    m_StateTaxIdIsSet = false;
}
utility::string_t Entity::getSuframa() const
{
    return m_Suframa;
}
void Entity::setSuframa(utility::string_t value)
{
    m_Suframa = value;
    m_SuframaIsSet = true;
}
bool Entity::suframaIsSet() const
{
    return m_SuframaIsSet;
}
void Entity::unsetSuframa()
{
    m_SuframaIsSet = false;
}
utility::string_t Entity::getPhone() const
{
    return m_Phone;
}
void Entity::setPhone(utility::string_t value)
{
    m_Phone = value;
    m_PhoneIsSet = true;
}
bool Entity::phoneIsSet() const
{
    return m_PhoneIsSet;
}
void Entity::unsetPhone()
{
    m_PhoneIsSet = false;
}
utility::string_t Entity::getTaxRegime() const
{
    return m_TaxRegime;
}
void Entity::setTaxRegime(utility::string_t value)
{
    m_TaxRegime = value;
    m_TaxRegimeIsSet = true;
}
bool Entity::taxRegimeIsSet() const
{
    return m_TaxRegimeIsSet;
}
void Entity::unsetTaxRegime()
{
    m_TaxRegimeIsSet = false;
}
utility::string_t Entity::getEmail() const
{
    return m_Email;
}
void Entity::setEmail(utility::string_t value)
{
    m_Email = value;
    m_EmailIsSet = true;
}
bool Entity::emailIsSet() const
{
    return m_EmailIsSet;
}
void Entity::unsetEmail()
{
    m_EmailIsSet = false;
}
bool Entity::getSubjectToSRF1234() const
{
    return m_SubjectToSRF1234;
}
void Entity::setSubjectToSRF1234(bool value)
{
    m_SubjectToSRF1234 = value;
    m_SubjectToSRF1234IsSet = true;
}
bool Entity::subjectToSRF1234IsSet() const
{
    return m_SubjectToSRF1234IsSet;
}
void Entity::unsetSubjectToSRF1234()
{
    m_SubjectToSRF1234IsSet = false;
}

}
}
}
}
