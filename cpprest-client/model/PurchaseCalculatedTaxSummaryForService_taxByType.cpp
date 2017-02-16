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



#include "PurchaseCalculatedTaxSummaryForService_taxByType.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

PurchaseCalculatedTaxSummaryForService_taxByType::PurchaseCalculatedTaxSummaryForService_taxByType()
{
    m_IssRfIsSet = false;
    m_PisRfIsSet = false;
    m_CofinsRfIsSet = false;
    m_CsllRfIsSet = false;
    m_IrrfIsSet = false;
    m_InssRfIsSet = false;
    m_InssArIsSet = false;
    m_PisIsSet = false;
    m_CofinsIsSet = false;
    
}

PurchaseCalculatedTaxSummaryForService_taxByType::~PurchaseCalculatedTaxSummaryForService_taxByType()
{
}

void PurchaseCalculatedTaxSummaryForService_taxByType::validate()
{
    // TODO: implement validation
}

web::json::value PurchaseCalculatedTaxSummaryForService_taxByType::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_IssRfIsSet)
    {
        val[U("issRf")] = ModelBase::toJson(m_IssRf);
    }
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
    if(m_InssArIsSet)
    {
        val[U("inssAr")] = ModelBase::toJson(m_InssAr);
    }
    if(m_PisIsSet)
    {
        val[U("pis")] = ModelBase::toJson(m_Pis);
    }
    if(m_CofinsIsSet)
    {
        val[U("cofins")] = ModelBase::toJson(m_Cofins);
    }
    

    return val;
}

void PurchaseCalculatedTaxSummaryForService_taxByType::fromJson(web::json::value& val)
{
    if(val.has_field(U("issRf")))
    {
        if(!val[U("issRf")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("issRf")]);
            setIssRf( newItem );
        }
        
    }
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
    if(val.has_field(U("inssAr")))
    {
        if(!val[U("inssAr")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromJson(val[U("inssAr")]);
            setInssAr( newItem );
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
    
}

void PurchaseCalculatedTaxSummaryForService_taxByType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_IssRfIsSet)
    {
        if (m_IssRf.get())
        {
            m_IssRf->toMultipart(multipart, U("issRf."));
        }
        
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
    if(m_InssArIsSet)
    {
        if (m_InssAr.get())
        {
            m_InssAr->toMultipart(multipart, U("inssAr."));
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
    
}

void PurchaseCalculatedTaxSummaryForService_taxByType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
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
    if(multipart->hasContent(U("inssAr")))
    {
        if(multipart->hasContent(U("inssAr")))
        {
            std::shared_ptr<TaxByTypeSummaryForService> newItem(new TaxByTypeSummaryForService());
            newItem->fromMultiPart(multipart, U("inssAr."));
            setInssAr( newItem );
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
    
}


std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getIssRf() const
{
    return m_IssRf;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setIssRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_IssRf = value;
    m_IssRfIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::issRfIsSet() const
{
    return m_IssRfIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetIssRf()
{
    m_IssRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getPisRf() const
{
    return m_PisRf;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setPisRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_PisRf = value;
    m_PisRfIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::pisRfIsSet() const
{
    return m_PisRfIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetPisRf()
{
    m_PisRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getCofinsRf() const
{
    return m_CofinsRf;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setCofinsRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_CofinsRf = value;
    m_CofinsRfIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::cofinsRfIsSet() const
{
    return m_CofinsRfIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetCofinsRf()
{
    m_CofinsRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getCsllRf() const
{
    return m_CsllRf;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setCsllRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_CsllRf = value;
    m_CsllRfIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::csllRfIsSet() const
{
    return m_CsllRfIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetCsllRf()
{
    m_CsllRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getIrrf() const
{
    return m_Irrf;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setIrrf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Irrf = value;
    m_IrrfIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::irrfIsSet() const
{
    return m_IrrfIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetIrrf()
{
    m_IrrfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getInssRf() const
{
    return m_InssRf;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setInssRf(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_InssRf = value;
    m_InssRfIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::inssRfIsSet() const
{
    return m_InssRfIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetInssRf()
{
    m_InssRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getInssAr() const
{
    return m_InssAr;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setInssAr(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_InssAr = value;
    m_InssArIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::inssArIsSet() const
{
    return m_InssArIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetInssAr()
{
    m_InssArIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getPis() const
{
    return m_Pis;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setPis(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Pis = value;
    m_PisIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::pisIsSet() const
{
    return m_PisIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetPis()
{
    m_PisIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForService> PurchaseCalculatedTaxSummaryForService_taxByType::getCofins() const
{
    return m_Cofins;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::setCofins(std::shared_ptr<TaxByTypeSummaryForService> value)
{
    m_Cofins = value;
    m_CofinsIsSet = true;
}
bool PurchaseCalculatedTaxSummaryForService_taxByType::cofinsIsSet() const
{
    return m_CofinsIsSet;
}
void PurchaseCalculatedTaxSummaryForService_taxByType::unsetCofins()
{
    m_CofinsIsSet = false;
}

}
}
}
}
