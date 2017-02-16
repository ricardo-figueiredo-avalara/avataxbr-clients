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



#include "NRef.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

NRef::NRef()
{
    m_Type = U("");
    m_TypeIsSet = false;
    m_RefNFe = U("");
    m_RefNFeIsSet = false;
    m_RefCTe = U("");
    m_RefCTeIsSet = false;
    m_RefECFIsSet = false;
    m_RefNFIsSet = false;
    m_RefFarmerNFIsSet = false;
    
}

NRef::~NRef()
{
}

void NRef::validate()
{
    // TODO: implement validation
}

web::json::value NRef::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_TypeIsSet)
    {
        val[U("type")] = ModelBase::toJson(m_Type);
    }
    if(m_RefNFeIsSet)
    {
        val[U("refNFe")] = ModelBase::toJson(m_RefNFe);
    }
    if(m_RefCTeIsSet)
    {
        val[U("refCTe")] = ModelBase::toJson(m_RefCTe);
    }
    if(m_RefECFIsSet)
    {
        val[U("refECF")] = ModelBase::toJson(m_RefECF);
    }
    if(m_RefNFIsSet)
    {
        val[U("refNF")] = ModelBase::toJson(m_RefNF);
    }
    if(m_RefFarmerNFIsSet)
    {
        val[U("refFarmerNF")] = ModelBase::toJson(m_RefFarmerNF);
    }
    

    return val;
}

void NRef::fromJson(web::json::value& val)
{
    if(val.has_field(U("type")))
    {
        setType(ModelBase::stringFromJson(val[U("type")]));
        
    }
    if(val.has_field(U("refNFe")))
    {
        setRefNFe(ModelBase::stringFromJson(val[U("refNFe")]));
        
    }
    if(val.has_field(U("refCTe")))
    {
        setRefCTe(ModelBase::stringFromJson(val[U("refCTe")]));
        
    }
    if(val.has_field(U("refECF")))
    {
        if(!val[U("refECF")].is_null())
        {
            std::shared_ptr<NRef_refECF> newItem(new NRef_refECF());
            newItem->fromJson(val[U("refECF")]);
            setRefECF( newItem );
        }
        
    }
    if(val.has_field(U("refNF")))
    {
        if(!val[U("refNF")].is_null())
        {
            std::shared_ptr<NRef_refNF> newItem(new NRef_refNF());
            newItem->fromJson(val[U("refNF")]);
            setRefNF( newItem );
        }
        
    }
    if(val.has_field(U("refFarmerNF")))
    {
        if(!val[U("refFarmerNF")].is_null())
        {
            std::shared_ptr<NRef_refFarmerNF> newItem(new NRef_refFarmerNF());
            newItem->fromJson(val[U("refFarmerNF")]);
            setRefFarmerNF( newItem );
        }
        
    }
    
}

void NRef::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("type"), m_Type));
        
    }
    if(m_RefNFeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("refNFe"), m_RefNFe));
        
    }
    if(m_RefCTeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("refCTe"), m_RefCTe));
        
    }
    if(m_RefECFIsSet)
    {
        if (m_RefECF.get())
        {
            m_RefECF->toMultipart(multipart, U("refECF."));
        }
        
    }
    if(m_RefNFIsSet)
    {
        if (m_RefNF.get())
        {
            m_RefNF->toMultipart(multipart, U("refNF."));
        }
        
    }
    if(m_RefFarmerNFIsSet)
    {
        if (m_RefFarmerNF.get())
        {
            m_RefFarmerNF->toMultipart(multipart, U("refFarmerNF."));
        }
        
    }
    
}

void NRef::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("type")))
    {
        setType(ModelBase::stringFromHttpContent(multipart->getContent(U("type"))));
        
    }
    if(multipart->hasContent(U("refNFe")))
    {
        setRefNFe(ModelBase::stringFromHttpContent(multipart->getContent(U("refNFe"))));
        
    }
    if(multipart->hasContent(U("refCTe")))
    {
        setRefCTe(ModelBase::stringFromHttpContent(multipart->getContent(U("refCTe"))));
        
    }
    if(multipart->hasContent(U("refECF")))
    {
        if(multipart->hasContent(U("refECF")))
        {
            std::shared_ptr<NRef_refECF> newItem(new NRef_refECF());
            newItem->fromMultiPart(multipart, U("refECF."));
            setRefECF( newItem );
        }
        
    }
    if(multipart->hasContent(U("refNF")))
    {
        if(multipart->hasContent(U("refNF")))
        {
            std::shared_ptr<NRef_refNF> newItem(new NRef_refNF());
            newItem->fromMultiPart(multipart, U("refNF."));
            setRefNF( newItem );
        }
        
    }
    if(multipart->hasContent(U("refFarmerNF")))
    {
        if(multipart->hasContent(U("refFarmerNF")))
        {
            std::shared_ptr<NRef_refFarmerNF> newItem(new NRef_refFarmerNF());
            newItem->fromMultiPart(multipart, U("refFarmerNF."));
            setRefFarmerNF( newItem );
        }
        
    }
    
}


utility::string_t NRef::getType() const
{
    return m_Type;
}
void NRef::setType(utility::string_t value)
{
    m_Type = value;
    m_TypeIsSet = true;
}
bool NRef::typeIsSet() const
{
    return m_TypeIsSet;
}
void NRef::unsetType()
{
    m_TypeIsSet = false;
}
utility::string_t NRef::getRefNFe() const
{
    return m_RefNFe;
}
void NRef::setRefNFe(utility::string_t value)
{
    m_RefNFe = value;
    m_RefNFeIsSet = true;
}
bool NRef::refNFeIsSet() const
{
    return m_RefNFeIsSet;
}
void NRef::unsetRefNFe()
{
    m_RefNFeIsSet = false;
}
utility::string_t NRef::getRefCTe() const
{
    return m_RefCTe;
}
void NRef::setRefCTe(utility::string_t value)
{
    m_RefCTe = value;
    m_RefCTeIsSet = true;
}
bool NRef::refCTeIsSet() const
{
    return m_RefCTeIsSet;
}
void NRef::unsetRefCTe()
{
    m_RefCTeIsSet = false;
}
std::shared_ptr<NRef_refECF> NRef::getRefECF() const
{
    return m_RefECF;
}
void NRef::setRefECF(std::shared_ptr<NRef_refECF> value)
{
    m_RefECF = value;
    m_RefECFIsSet = true;
}
bool NRef::refECFIsSet() const
{
    return m_RefECFIsSet;
}
void NRef::unsetRefECF()
{
    m_RefECFIsSet = false;
}
std::shared_ptr<NRef_refNF> NRef::getRefNF() const
{
    return m_RefNF;
}
void NRef::setRefNF(std::shared_ptr<NRef_refNF> value)
{
    m_RefNF = value;
    m_RefNFIsSet = true;
}
bool NRef::refNFIsSet() const
{
    return m_RefNFIsSet;
}
void NRef::unsetRefNF()
{
    m_RefNFIsSet = false;
}
std::shared_ptr<NRef_refFarmerNF> NRef::getRefFarmerNF() const
{
    return m_RefFarmerNF;
}
void NRef::setRefFarmerNF(std::shared_ptr<NRef_refFarmerNF> value)
{
    m_RefFarmerNF = value;
    m_RefFarmerNFIsSet = true;
}
bool NRef::refFarmerNFIsSet() const
{
    return m_RefFarmerNFIsSet;
}
void NRef::unsetRefFarmerNF()
{
    m_RefFarmerNFIsSet = false;
}

}
}
}
}
