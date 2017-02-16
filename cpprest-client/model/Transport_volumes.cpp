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



#include "Transport_volumes.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Transport_volumes::Transport_volumes()
{
    m_QVol = U("");
    m_QVolIsSet = false;
    m_Specie = U("");
    m_SpecieIsSet = false;
    m_Brand = U("");
    m_BrandIsSet = false;
    m_VolumeNumeration = U("");
    m_VolumeNumerationIsSet = false;
    m_NetWeight = 0.0;
    m_NetWeightIsSet = false;
    m_GrossWeight = 0.0;
    m_GrossWeightIsSet = false;
    m_SealIsSet = false;
    
}

Transport_volumes::~Transport_volumes()
{
}

void Transport_volumes::validate()
{
    // TODO: implement validation
}

web::json::value Transport_volumes::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_QVolIsSet)
    {
        val[U("qVol")] = ModelBase::toJson(m_QVol);
    }
    if(m_SpecieIsSet)
    {
        val[U("specie")] = ModelBase::toJson(m_Specie);
    }
    if(m_BrandIsSet)
    {
        val[U("brand")] = ModelBase::toJson(m_Brand);
    }
    if(m_VolumeNumerationIsSet)
    {
        val[U("volumeNumeration")] = ModelBase::toJson(m_VolumeNumeration);
    }
    if(m_NetWeightIsSet)
    {
        val[U("netWeight")] = ModelBase::toJson(m_NetWeight);
    }
    if(m_GrossWeightIsSet)
    {
        val[U("grossWeight")] = ModelBase::toJson(m_GrossWeight);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Seal )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            val[U("seal")] = web::json::value::array(jsonArray);
        }
    }
    

    return val;
}

void Transport_volumes::fromJson(web::json::value& val)
{
    if(val.has_field(U("qVol")))
    {
        setQVol(ModelBase::stringFromJson(val[U("qVol")]));
        
    }
    if(val.has_field(U("specie")))
    {
        setSpecie(ModelBase::stringFromJson(val[U("specie")]));
        
    }
    if(val.has_field(U("brand")))
    {
        setBrand(ModelBase::stringFromJson(val[U("brand")]));
        
    }
    if(val.has_field(U("volumeNumeration")))
    {
        setVolumeNumeration(ModelBase::stringFromJson(val[U("volumeNumeration")]));
        
    }
    if(val.has_field(U("netWeight")))
    {
        setNetWeight(ModelBase::doubleFromJson(val[U("netWeight")]));
    }
    if(val.has_field(U("grossWeight")))
    {
        setGrossWeight(ModelBase::doubleFromJson(val[U("grossWeight")]));
    }
    {
        m_Seal.clear();
        std::vector<web::json::value> jsonArray;
        if(val.has_field(U("seal")))
        {
        for( auto& item : val[U("seal")].as_array() )
        {
            m_Seal.push_back(ModelBase::stringFromJson(item));
            
        }
        }
    }
    
}

void Transport_volumes::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_QVolIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("qVol"), m_QVol));
        
    }
    if(m_SpecieIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("specie"), m_Specie));
        
    }
    if(m_BrandIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("brand"), m_Brand));
        
    }
    if(m_VolumeNumerationIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("volumeNumeration"), m_VolumeNumeration));
        
    }
    if(m_NetWeightIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("netWeight"), m_NetWeight));
    }
    if(m_GrossWeightIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("grossWeight"), m_GrossWeight));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Seal )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        
        if(jsonArray.size() > 0)
        {
            multipart->add(ModelBase::toHttpContent(namePrefix + U("seal"), web::json::value::array(jsonArray), U("application/json")));
        }
    }
    
}

void Transport_volumes::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("qVol")))
    {
        setQVol(ModelBase::stringFromHttpContent(multipart->getContent(U("qVol"))));
        
    }
    if(multipart->hasContent(U("specie")))
    {
        setSpecie(ModelBase::stringFromHttpContent(multipart->getContent(U("specie"))));
        
    }
    if(multipart->hasContent(U("brand")))
    {
        setBrand(ModelBase::stringFromHttpContent(multipart->getContent(U("brand"))));
        
    }
    if(multipart->hasContent(U("volumeNumeration")))
    {
        setVolumeNumeration(ModelBase::stringFromHttpContent(multipart->getContent(U("volumeNumeration"))));
        
    }
    if(multipart->hasContent(U("netWeight")))
    {
        setNetWeight(ModelBase::doubleFromHttpContent(multipart->getContent(U("netWeight"))));
    }
    if(multipart->hasContent(U("grossWeight")))
    {
        setGrossWeight(ModelBase::doubleFromHttpContent(multipart->getContent(U("grossWeight"))));
    }
    {
        m_Seal.clear();
        if(multipart->hasContent(U("seal")))
        {

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(U("seal"))));
        for( auto& item : jsonArray.as_array() )
        {
            m_Seal.push_back(ModelBase::stringFromJson(item));
            
        }
        }
    }
    
}


utility::string_t Transport_volumes::getQVol() const
{
    return m_QVol;
}
void Transport_volumes::setQVol(utility::string_t value)
{
    m_QVol = value;
    m_QVolIsSet = true;
}
bool Transport_volumes::qVolIsSet() const
{
    return m_QVolIsSet;
}
void Transport_volumes::unsetQVol()
{
    m_QVolIsSet = false;
}
utility::string_t Transport_volumes::getSpecie() const
{
    return m_Specie;
}
void Transport_volumes::setSpecie(utility::string_t value)
{
    m_Specie = value;
    m_SpecieIsSet = true;
}
bool Transport_volumes::specieIsSet() const
{
    return m_SpecieIsSet;
}
void Transport_volumes::unsetSpecie()
{
    m_SpecieIsSet = false;
}
utility::string_t Transport_volumes::getBrand() const
{
    return m_Brand;
}
void Transport_volumes::setBrand(utility::string_t value)
{
    m_Brand = value;
    m_BrandIsSet = true;
}
bool Transport_volumes::brandIsSet() const
{
    return m_BrandIsSet;
}
void Transport_volumes::unsetBrand()
{
    m_BrandIsSet = false;
}
utility::string_t Transport_volumes::getVolumeNumeration() const
{
    return m_VolumeNumeration;
}
void Transport_volumes::setVolumeNumeration(utility::string_t value)
{
    m_VolumeNumeration = value;
    m_VolumeNumerationIsSet = true;
}
bool Transport_volumes::volumeNumerationIsSet() const
{
    return m_VolumeNumerationIsSet;
}
void Transport_volumes::unsetVolumeNumeration()
{
    m_VolumeNumerationIsSet = false;
}
double Transport_volumes::getNetWeight() const
{
    return m_NetWeight;
}
void Transport_volumes::setNetWeight(double value)
{
    m_NetWeight = value;
    m_NetWeightIsSet = true;
}
bool Transport_volumes::netWeightIsSet() const
{
    return m_NetWeightIsSet;
}
void Transport_volumes::unsetNetWeight()
{
    m_NetWeightIsSet = false;
}
double Transport_volumes::getGrossWeight() const
{
    return m_GrossWeight;
}
void Transport_volumes::setGrossWeight(double value)
{
    m_GrossWeight = value;
    m_GrossWeightIsSet = true;
}
bool Transport_volumes::grossWeightIsSet() const
{
    return m_GrossWeightIsSet;
}
void Transport_volumes::unsetGrossWeight()
{
    m_GrossWeightIsSet = false;
}
std::vector<utility::string_t>& Transport_volumes::getSeal()
{
    return m_Seal;
}
bool Transport_volumes::sealIsSet() const
{
    return m_SealIsSet;
}
void Transport_volumes::unsetSeal()
{
    m_SealIsSet = false;
}

}
}
}
}

