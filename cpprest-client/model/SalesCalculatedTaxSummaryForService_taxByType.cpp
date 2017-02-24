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



#include "SalesCalculatedTaxSummaryForService_taxByType.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

SalesCalculatedTaxSummaryForService_taxByType::SalesCalculatedTaxSummaryForService_taxByType()
{
    m_PisRfIsSet = false;
    m_CofinsRfIsSet = false;
    m_CsllRfIsSet = false;
    m_IrrfIsSet = false;
    m_InssRfIsSet = false;
    m_PisIsSet = false;
    m_CofinsIsSet = false;
    m_CsllIsSet = false;
    m_IssRfIsSet = false;
    m_IssIsSet = false;
    m_AproxtribCityIsSet = false;
    m_AproxtribFedIsSet = false;
    m_IrpjIsSet = false;
    m_InssIsSet = false;
    
}

SalesCalculatedTaxSummaryForService_taxByType::~SalesCalculatedTaxSummaryForService_taxByType()
{
}

void SalesCalculatedTaxSummaryForService_taxByType::validate()
{
    // TODO: implement validation
}

web::json::value SalesCalculatedTaxSummaryForService_taxByType::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_PisRfIsSet)
    {
        val[U("pisRf")] = ModelBase::toJson(m_PisRf);
    }
    if(m_CofinsRfIsSet)
    {
        val[U("cofinsRf")] = ModelBase::toJson(m_CofinsRf);
    }
    if(m_CsllRfIsSet)
    {
        val[U("csllRf")] = ModelBase::toJson(m_CsllRf);
    }
    if(m_IrrfIsSet)
    {
        val[U("irrf")] = ModelBase::toJson(m_Irrf);
    }
    if(m_InssRfIsSet)
    {
        val[U("inssRf")] = ModelBase::toJson(m_InssRf);
    }
    if(m_PisIsSet)
    {
        val[U("pis")] = ModelBase::toJson(m_Pis);
    }
    if(m_CofinsIsSet)
    {
        val[U("cofins")] = ModelBase::toJson(m_Cofins);
    }
    if(m_CsllIsSet)
    {
        val[U("csll")] = ModelBase::toJson(m_Csll);
    }
    if(m_IssRfIsSet)
    {
        val[U("issRf")] = ModelBase::toJson(m_IssRf);
    }
    if(m_IssIsSet)
    {
        val[U("iss")] = ModelBase::toJson(m_Iss);
    }
    if(m_AproxtribCityIsSet)
    {
        val[U("aproxtribCity")] = ModelBase::toJson(m_AproxtribCity);
    }
    if(m_AproxtribFedIsSet)
    {
        val[U("aproxtribFed")] = ModelBase::toJson(m_AproxtribFed);
    }
    if(m_IrpjIsSet)
    {
        val[U("irpj")] = ModelBase::toJson(m_Irpj);
    }
    if(m_InssIsSet)
    {
        val[U("inss")] = ModelBase::toJson(m_Inss);
    }
    

    return val;
}

void SalesCalculatedTaxSummaryForService_taxByType::fromJson(web::json::value& val)
{
    if(val.has_field(U("pisRf")))
    {
        if(!val[U("pisRf")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("pisRf")]);
            setPisRf( newItem );
        }
        
    }
    if(val.has_field(U("cofinsRf")))
    {
        if(!val[U("cofinsRf")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("cofinsRf")]);
            setCofinsRf( newItem );
        }
        
    }
    if(val.has_field(U("csllRf")))
    {
        if(!val[U("csllRf")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("csllRf")]);
            setCsllRf( newItem );
        }
        
    }
    if(val.has_field(U("irrf")))
    {
        if(!val[U("irrf")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("irrf")]);
            setIrrf( newItem );
        }
        
    }
    if(val.has_field(U("inssRf")))
    {
        if(!val[U("inssRf")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("inssRf")]);
            setInssRf( newItem );
        }
        
    }
    if(val.has_field(U("pis")))
    {
        if(!val[U("pis")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("pis")]);
            setPis( newItem );
        }
        
    }
    if(val.has_field(U("cofins")))
    {
        if(!val[U("cofins")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("cofins")]);
            setCofins( newItem );
        }
        
    }
    if(val.has_field(U("csll")))
    {
        if(!val[U("csll")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("csll")]);
            setCsll( newItem );
        }
        
    }
    if(val.has_field(U("issRf")))
    {
        if(!val[U("issRf")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("issRf")]);
            setIssRf( newItem );
        }
        
    }
    if(val.has_field(U("iss")))
    {
        if(!val[U("iss")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("iss")]);
            setIss( newItem );
        }
        
    }
    if(val.has_field(U("aproxtribCity")))
    {
        if(!val[U("aproxtribCity")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("aproxtribCity")]);
            setAproxtribCity( newItem );
        }
        
    }
    if(val.has_field(U("aproxtribFed")))
    {
        if(!val[U("aproxtribFed")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("aproxtribFed")]);
            setAproxtribFed( newItem );
        }
        
    }
    if(val.has_field(U("irpj")))
    {
        if(!val[U("irpj")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("irpj")]);
            setIrpj( newItem );
        }
        
    }
    if(val.has_field(U("inss")))
    {
        if(!val[U("inss")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("inss")]);
            setInss( newItem );
        }
        
    }
    
}

void SalesCalculatedTaxSummaryForService_taxByType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_PisRfIsSet)
    {
        if (m_PisRf.get())
        {
            m_PisRf->toMultipart(multipart, U("pisRf."));
        }
        
    }
    if(m_CofinsRfIsSet)
    {
        if (m_CofinsRf.get())
        {
            m_CofinsRf->toMultipart(multipart, U("cofinsRf."));
        }
        
    }
    if(m_CsllRfIsSet)
    {
        if (m_CsllRf.get())
        {
            m_CsllRf->toMultipart(multipart, U("csllRf."));
        }
        
    }
    if(m_IrrfIsSet)
    {
        if (m_Irrf.get())
        {
            m_Irrf->toMultipart(multipart, U("irrf."));
        }
        
    }
    if(m_InssRfIsSet)
    {
        if (m_InssRf.get())
        {
            m_InssRf->toMultipart(multipart, U("inssRf."));
        }
        
    }
    if(m_PisIsSet)
    {
        if (m_Pis.get())
        {
            m_Pis->toMultipart(multipart, U("pis."));
        }
        
    }
    if(m_CofinsIsSet)
    {
        if (m_Cofins.get())
        {
            m_Cofins->toMultipart(multipart, U("cofins."));
        }
        
    }
    if(m_CsllIsSet)
    {
        if (m_Csll.get())
        {
            m_Csll->toMultipart(multipart, U("csll."));
        }
        
    }
    if(m_IssRfIsSet)
    {
        if (m_IssRf.get())
        {
            m_IssRf->toMultipart(multipart, U("issRf."));
        }
        
    }
    if(m_IssIsSet)
    {
        if (m_Iss.get())
        {
            m_Iss->toMultipart(multipart, U("iss."));
        }
        
    }
    if(m_AproxtribCityIsSet)
    {
        if (m_AproxtribCity.get())
        {
            m_AproxtribCity->toMultipart(multipart, U("aproxtribCity."));
        }
        
    }
    if(m_AproxtribFedIsSet)
    {
        if (m_AproxtribFed.get())
        {
            m_AproxtribFed->toMultipart(multipart, U("aproxtribFed."));
        }
        
    }
    if(m_IrpjIsSet)
    {
        if (m_Irpj.get())
        {
            m_Irpj->toMultipart(multipart, U("irpj."));
        }
        
    }
    if(m_InssIsSet)
    {
        if (m_Inss.get())
        {
            m_Inss->toMultipart(multipart, U("inss."));
        }
        
    }
    
}

void SalesCalculatedTaxSummaryForService_taxByType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("pisRf")))
    {
        if(multipart->hasContent(U("pisRf")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("pisRf."));
            setPisRf( newItem );
        }
        
    }
    if(multipart->hasContent(U("cofinsRf")))
    {
        if(multipart->hasContent(U("cofinsRf")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("cofinsRf."));
            setCofinsRf( newItem );
        }
        
    }
    if(multipart->hasContent(U("csllRf")))
    {
        if(multipart->hasContent(U("csllRf")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("csllRf."));
            setCsllRf( newItem );
        }
        
    }
    if(multipart->hasContent(U("irrf")))
    {
        if(multipart->hasContent(U("irrf")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("irrf."));
            setIrrf( newItem );
        }
        
    }
    if(multipart->hasContent(U("inssRf")))
    {
        if(multipart->hasContent(U("inssRf")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("inssRf."));
            setInssRf( newItem );
        }
        
    }
    if(multipart->hasContent(U("pis")))
    {
        if(multipart->hasContent(U("pis")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("pis."));
            setPis( newItem );
        }
        
    }
    if(multipart->hasContent(U("cofins")))
    {
        if(multipart->hasContent(U("cofins")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("cofins."));
            setCofins( newItem );
        }
        
    }
    if(multipart->hasContent(U("csll")))
    {
        if(multipart->hasContent(U("csll")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("csll."));
            setCsll( newItem );
        }
        
    }
    if(multipart->hasContent(U("issRf")))
    {
        if(multipart->hasContent(U("issRf")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("issRf."));
            setIssRf( newItem );
        }
        
    }
    if(multipart->hasContent(U("iss")))
    {
        if(multipart->hasContent(U("iss")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("iss."));
            setIss( newItem );
        }
        
    }
    if(multipart->hasContent(U("aproxtribCity")))
    {
        if(multipart->hasContent(U("aproxtribCity")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("aproxtribCity."));
            setAproxtribCity( newItem );
        }
        
    }
    if(multipart->hasContent(U("aproxtribFed")))
    {
        if(multipart->hasContent(U("aproxtribFed")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("aproxtribFed."));
            setAproxtribFed( newItem );
        }
        
    }
    if(multipart->hasContent(U("irpj")))
    {
        if(multipart->hasContent(U("irpj")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("irpj."));
            setIrpj( newItem );
        }
        
    }
    if(multipart->hasContent(U("inss")))
    {
        if(multipart->hasContent(U("inss")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("inss."));
            setInss( newItem );
        }
        
    }
    
}


std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getPisRf() const
{
    return m_PisRf;
}
void SalesCalculatedTaxSummaryForService_taxByType::setPisRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_PisRf = value;
    m_PisRfIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::pisRfIsSet() const
{
    return m_PisRfIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetPisRf()
{
    m_PisRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getCofinsRf() const
{
    return m_CofinsRf;
}
void SalesCalculatedTaxSummaryForService_taxByType::setCofinsRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_CofinsRf = value;
    m_CofinsRfIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::cofinsRfIsSet() const
{
    return m_CofinsRfIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetCofinsRf()
{
    m_CofinsRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getCsllRf() const
{
    return m_CsllRf;
}
void SalesCalculatedTaxSummaryForService_taxByType::setCsllRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_CsllRf = value;
    m_CsllRfIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::csllRfIsSet() const
{
    return m_CsllRfIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetCsllRf()
{
    m_CsllRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getIrrf() const
{
    return m_Irrf;
}
void SalesCalculatedTaxSummaryForService_taxByType::setIrrf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Irrf = value;
    m_IrrfIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::irrfIsSet() const
{
    return m_IrrfIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetIrrf()
{
    m_IrrfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getInssRf() const
{
    return m_InssRf;
}
void SalesCalculatedTaxSummaryForService_taxByType::setInssRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_InssRf = value;
    m_InssRfIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::inssRfIsSet() const
{
    return m_InssRfIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetInssRf()
{
    m_InssRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getPis() const
{
    return m_Pis;
}
void SalesCalculatedTaxSummaryForService_taxByType::setPis(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Pis = value;
    m_PisIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::pisIsSet() const
{
    return m_PisIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetPis()
{
    m_PisIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getCofins() const
{
    return m_Cofins;
}
void SalesCalculatedTaxSummaryForService_taxByType::setCofins(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Cofins = value;
    m_CofinsIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::cofinsIsSet() const
{
    return m_CofinsIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetCofins()
{
    m_CofinsIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getCsll() const
{
    return m_Csll;
}
void SalesCalculatedTaxSummaryForService_taxByType::setCsll(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Csll = value;
    m_CsllIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::csllIsSet() const
{
    return m_CsllIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetCsll()
{
    m_CsllIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getIssRf() const
{
    return m_IssRf;
}
void SalesCalculatedTaxSummaryForService_taxByType::setIssRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_IssRf = value;
    m_IssRfIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::issRfIsSet() const
{
    return m_IssRfIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetIssRf()
{
    m_IssRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getIss() const
{
    return m_Iss;
}
void SalesCalculatedTaxSummaryForService_taxByType::setIss(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Iss = value;
    m_IssIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::issIsSet() const
{
    return m_IssIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetIss()
{
    m_IssIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getAproxtribCity() const
{
    return m_AproxtribCity;
}
void SalesCalculatedTaxSummaryForService_taxByType::setAproxtribCity(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_AproxtribCity = value;
    m_AproxtribCityIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::aproxtribCityIsSet() const
{
    return m_AproxtribCityIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetAproxtribCity()
{
    m_AproxtribCityIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getAproxtribFed() const
{
    return m_AproxtribFed;
}
void SalesCalculatedTaxSummaryForService_taxByType::setAproxtribFed(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_AproxtribFed = value;
    m_AproxtribFedIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::aproxtribFedIsSet() const
{
    return m_AproxtribFedIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetAproxtribFed()
{
    m_AproxtribFedIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getIrpj() const
{
    return m_Irpj;
}
void SalesCalculatedTaxSummaryForService_taxByType::setIrpj(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Irpj = value;
    m_IrpjIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::irpjIsSet() const
{
    return m_IrpjIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetIrpj()
{
    m_IrpjIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> SalesCalculatedTaxSummaryForService_taxByType::getInss() const
{
    return m_Inss;
}
void SalesCalculatedTaxSummaryForService_taxByType::setInss(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Inss = value;
    m_InssIsSet = true;
}
bool SalesCalculatedTaxSummaryForService_taxByType::inssIsSet() const
{
    return m_InssIsSet;
}
void SalesCalculatedTaxSummaryForService_taxByType::unsetInss()
{
    m_InssIsSet = false;
}

}
}
}
}

