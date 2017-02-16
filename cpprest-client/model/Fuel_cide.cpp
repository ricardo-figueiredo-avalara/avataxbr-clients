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



#include "Fuel_cide.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Fuel_cide::Fuel_cide()
{
    m_BaseCalcCIDE = 0.0;
    m_RateCIDE = 0.0;
    m_ValueCIDE = 0.0;
    
}

Fuel_cide::~Fuel_cide()
{
}

void Fuel_cide::validate()
{
    // TODO: implement validation
}

web::json::value Fuel_cide::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("baseCalcCIDE")] = ModelBase::toJson(m_BaseCalcCIDE);
    val[U("rateCIDE")] = ModelBase::toJson(m_RateCIDE);
    val[U("valueCIDE")] = ModelBase::toJson(m_ValueCIDE);
    

    return val;
}

void Fuel_cide::fromJson(web::json::value& val)
{
    setBaseCalcCIDE(ModelBase::doubleFromJson(val[U("baseCalcCIDE")]));
    setRateCIDE(ModelBase::doubleFromJson(val[U("rateCIDE")]));
    setValueCIDE(ModelBase::doubleFromJson(val[U("valueCIDE")]));
    
}

void Fuel_cide::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("baseCalcCIDE"), m_BaseCalcCIDE));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("rateCIDE"), m_RateCIDE));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("valueCIDE"), m_ValueCIDE));
    
}

void Fuel_cide::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setBaseCalcCIDE(ModelBase::doubleFromHttpContent(multipart->getContent(U("baseCalcCIDE"))));
    setRateCIDE(ModelBase::doubleFromHttpContent(multipart->getContent(U("rateCIDE"))));
    setValueCIDE(ModelBase::doubleFromHttpContent(multipart->getContent(U("valueCIDE"))));
    
}


double Fuel_cide::getBaseCalcCIDE() const
{
    return m_BaseCalcCIDE;
}
void Fuel_cide::setBaseCalcCIDE(double value)
{
    m_BaseCalcCIDE = value;
    
}
double Fuel_cide::getRateCIDE() const
{
    return m_RateCIDE;
}
void Fuel_cide::setRateCIDE(double value)
{
    m_RateCIDE = value;
    
}
double Fuel_cide::getValueCIDE() const
{
    return m_ValueCIDE;
}
void Fuel_cide::setValueCIDE(double value)
{
    m_ValueCIDE = value;
    
}

}
}
}
}

