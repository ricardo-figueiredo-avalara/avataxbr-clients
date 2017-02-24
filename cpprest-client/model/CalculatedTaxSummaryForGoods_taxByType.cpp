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



#include "CalculatedTaxSummaryForGoods_taxByType.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

CalculatedTaxSummaryForGoods_taxByType::CalculatedTaxSummaryForGoods_taxByType()
{
    m_IcmsIsSet = false;
    m_IcmsStIsSet = false;
    m_IcmsStSdIsSet = false;
    m_IcmsPartOwnIsSet = false;
    m_IcmsPartDestIsSet = false;
    m_IcmsDifaFCPIsSet = false;
    m_IcmsDifaDestIsSet = false;
    m_IcmsDifaRemetIsSet = false;
    m_IcmsRfIsSet = false;
    m_IcmsDesonIsSet = false;
    m_IcmsCredsnIsSet = false;
    m_PisIsSet = false;
    m_PisStIsSet = false;
    m_CofinsIsSet = false;
    m_CofinsStIsSet = false;
    m_IpiIsSet = false;
    m_IpiReturnedIsSet = false;
    m_IiIsSet = false;
    m_IofIsSet = false;
    m_AproxtribStateIsSet = false;
    m_AproxtribFedIsSet = false;
    
}

CalculatedTaxSummaryForGoods_taxByType::~CalculatedTaxSummaryForGoods_taxByType()
{
}

void CalculatedTaxSummaryForGoods_taxByType::validate()
{
    // TODO: implement validation
}

web::json::value CalculatedTaxSummaryForGoods_taxByType::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_IcmsIsSet)
    {
        val[U("icms")] = ModelBase::toJson(m_Icms);
    }
    if(m_IcmsStIsSet)
    {
        val[U("icmsSt")] = ModelBase::toJson(m_IcmsSt);
    }
    if(m_IcmsStSdIsSet)
    {
        val[U("icmsStSd")] = ModelBase::toJson(m_IcmsStSd);
    }
    if(m_IcmsPartOwnIsSet)
    {
        val[U("icmsPartOwn")] = ModelBase::toJson(m_IcmsPartOwn);
    }
    if(m_IcmsPartDestIsSet)
    {
        val[U("icmsPartDest")] = ModelBase::toJson(m_IcmsPartDest);
    }
    if(m_IcmsDifaFCPIsSet)
    {
        val[U("icmsDifaFCP")] = ModelBase::toJson(m_IcmsDifaFCP);
    }
    if(m_IcmsDifaDestIsSet)
    {
        val[U("icmsDifaDest")] = ModelBase::toJson(m_IcmsDifaDest);
    }
    if(m_IcmsDifaRemetIsSet)
    {
        val[U("icmsDifaRemet")] = ModelBase::toJson(m_IcmsDifaRemet);
    }
    if(m_IcmsRfIsSet)
    {
        val[U("icmsRf")] = ModelBase::toJson(m_IcmsRf);
    }
    if(m_IcmsDesonIsSet)
    {
        val[U("icmsDeson")] = ModelBase::toJson(m_IcmsDeson);
    }
    if(m_IcmsCredsnIsSet)
    {
        val[U("icmsCredsn")] = ModelBase::toJson(m_IcmsCredsn);
    }
    if(m_PisIsSet)
    {
        val[U("pis")] = ModelBase::toJson(m_Pis);
    }
    if(m_PisStIsSet)
    {
        val[U("pisSt")] = ModelBase::toJson(m_PisSt);
    }
    if(m_CofinsIsSet)
    {
        val[U("cofins")] = ModelBase::toJson(m_Cofins);
    }
    if(m_CofinsStIsSet)
    {
        val[U("cofinsSt")] = ModelBase::toJson(m_CofinsSt);
    }
    if(m_IpiIsSet)
    {
        val[U("ipi")] = ModelBase::toJson(m_Ipi);
    }
    if(m_IpiReturnedIsSet)
    {
        val[U("ipiReturned")] = ModelBase::toJson(m_IpiReturned);
    }
    if(m_IiIsSet)
    {
        val[U("ii")] = ModelBase::toJson(m_Ii);
    }
    if(m_IofIsSet)
    {
        val[U("iof")] = ModelBase::toJson(m_Iof);
    }
    if(m_AproxtribStateIsSet)
    {
        val[U("aproxtribState")] = ModelBase::toJson(m_AproxtribState);
    }
    if(m_AproxtribFedIsSet)
    {
        val[U("aproxtribFed")] = ModelBase::toJson(m_AproxtribFed);
    }
    

    return val;
}

void CalculatedTaxSummaryForGoods_taxByType::fromJson(web::json::value& val)
{
    if(val.has_field(U("icms")))
    {
        if(!val[U("icms")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icms")]);
            setIcms( newItem );
        }
        
    }
    if(val.has_field(U("icmsSt")))
    {
        if(!val[U("icmsSt")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsSt")]);
            setIcmsSt( newItem );
        }
        
    }
    if(val.has_field(U("icmsStSd")))
    {
        if(!val[U("icmsStSd")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsStSd")]);
            setIcmsStSd( newItem );
        }
        
    }
    if(val.has_field(U("icmsPartOwn")))
    {
        if(!val[U("icmsPartOwn")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsPartOwn")]);
            setIcmsPartOwn( newItem );
        }
        
    }
    if(val.has_field(U("icmsPartDest")))
    {
        if(!val[U("icmsPartDest")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsPartDest")]);
            setIcmsPartDest( newItem );
        }
        
    }
    if(val.has_field(U("icmsDifaFCP")))
    {
        if(!val[U("icmsDifaFCP")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsDifaFCP")]);
            setIcmsDifaFCP( newItem );
        }
        
    }
    if(val.has_field(U("icmsDifaDest")))
    {
        if(!val[U("icmsDifaDest")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsDifaDest")]);
            setIcmsDifaDest( newItem );
        }
        
    }
    if(val.has_field(U("icmsDifaRemet")))
    {
        if(!val[U("icmsDifaRemet")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsDifaRemet")]);
            setIcmsDifaRemet( newItem );
        }
        
    }
    if(val.has_field(U("icmsRf")))
    {
        if(!val[U("icmsRf")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsRf")]);
            setIcmsRf( newItem );
        }
        
    }
    if(val.has_field(U("icmsDeson")))
    {
        if(!val[U("icmsDeson")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsDeson")]);
            setIcmsDeson( newItem );
        }
        
    }
    if(val.has_field(U("icmsCredsn")))
    {
        if(!val[U("icmsCredsn")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("icmsCredsn")]);
            setIcmsCredsn( newItem );
        }
        
    }
    if(val.has_field(U("pis")))
    {
        if(!val[U("pis")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("pis")]);
            setPis( newItem );
        }
        
    }
    if(val.has_field(U("pisSt")))
    {
        if(!val[U("pisSt")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("pisSt")]);
            setPisSt( newItem );
        }
        
    }
    if(val.has_field(U("cofins")))
    {
        if(!val[U("cofins")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("cofins")]);
            setCofins( newItem );
        }
        
    }
    if(val.has_field(U("cofinsSt")))
    {
        if(!val[U("cofinsSt")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("cofinsSt")]);
            setCofinsSt( newItem );
        }
        
    }
    if(val.has_field(U("ipi")))
    {
        if(!val[U("ipi")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("ipi")]);
            setIpi( newItem );
        }
        
    }
    if(val.has_field(U("ipiReturned")))
    {
        if(!val[U("ipiReturned")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("ipiReturned")]);
            setIpiReturned( newItem );
        }
        
    }
    if(val.has_field(U("ii")))
    {
        if(!val[U("ii")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("ii")]);
            setIi( newItem );
        }
        
    }
    if(val.has_field(U("iof")))
    {
        if(!val[U("iof")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("iof")]);
            setIof( newItem );
        }
        
    }
    if(val.has_field(U("aproxtribState")))
    {
        if(!val[U("aproxtribState")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("aproxtribState")]);
            setAproxtribState( newItem );
        }
        
    }
    if(val.has_field(U("aproxtribFed")))
    {
        if(!val[U("aproxtribFed")].is_null())
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromJson(val[U("aproxtribFed")]);
            setAproxtribFed( newItem );
        }
        
    }
    
}

void CalculatedTaxSummaryForGoods_taxByType::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_IcmsIsSet)
    {
        if (m_Icms.get())
        {
            m_Icms->toMultipart(multipart, U("icms."));
        }
        
    }
    if(m_IcmsStIsSet)
    {
        if (m_IcmsSt.get())
        {
            m_IcmsSt->toMultipart(multipart, U("icmsSt."));
        }
        
    }
    if(m_IcmsStSdIsSet)
    {
        if (m_IcmsStSd.get())
        {
            m_IcmsStSd->toMultipart(multipart, U("icmsStSd."));
        }
        
    }
    if(m_IcmsPartOwnIsSet)
    {
        if (m_IcmsPartOwn.get())
        {
            m_IcmsPartOwn->toMultipart(multipart, U("icmsPartOwn."));
        }
        
    }
    if(m_IcmsPartDestIsSet)
    {
        if (m_IcmsPartDest.get())
        {
            m_IcmsPartDest->toMultipart(multipart, U("icmsPartDest."));
        }
        
    }
    if(m_IcmsDifaFCPIsSet)
    {
        if (m_IcmsDifaFCP.get())
        {
            m_IcmsDifaFCP->toMultipart(multipart, U("icmsDifaFCP."));
        }
        
    }
    if(m_IcmsDifaDestIsSet)
    {
        if (m_IcmsDifaDest.get())
        {
            m_IcmsDifaDest->toMultipart(multipart, U("icmsDifaDest."));
        }
        
    }
    if(m_IcmsDifaRemetIsSet)
    {
        if (m_IcmsDifaRemet.get())
        {
            m_IcmsDifaRemet->toMultipart(multipart, U("icmsDifaRemet."));
        }
        
    }
    if(m_IcmsRfIsSet)
    {
        if (m_IcmsRf.get())
        {
            m_IcmsRf->toMultipart(multipart, U("icmsRf."));
        }
        
    }
    if(m_IcmsDesonIsSet)
    {
        if (m_IcmsDeson.get())
        {
            m_IcmsDeson->toMultipart(multipart, U("icmsDeson."));
        }
        
    }
    if(m_IcmsCredsnIsSet)
    {
        if (m_IcmsCredsn.get())
        {
            m_IcmsCredsn->toMultipart(multipart, U("icmsCredsn."));
        }
        
    }
    if(m_PisIsSet)
    {
        if (m_Pis.get())
        {
            m_Pis->toMultipart(multipart, U("pis."));
        }
        
    }
    if(m_PisStIsSet)
    {
        if (m_PisSt.get())
        {
            m_PisSt->toMultipart(multipart, U("pisSt."));
        }
        
    }
    if(m_CofinsIsSet)
    {
        if (m_Cofins.get())
        {
            m_Cofins->toMultipart(multipart, U("cofins."));
        }
        
    }
    if(m_CofinsStIsSet)
    {
        if (m_CofinsSt.get())
        {
            m_CofinsSt->toMultipart(multipart, U("cofinsSt."));
        }
        
    }
    if(m_IpiIsSet)
    {
        if (m_Ipi.get())
        {
            m_Ipi->toMultipart(multipart, U("ipi."));
        }
        
    }
    if(m_IpiReturnedIsSet)
    {
        if (m_IpiReturned.get())
        {
            m_IpiReturned->toMultipart(multipart, U("ipiReturned."));
        }
        
    }
    if(m_IiIsSet)
    {
        if (m_Ii.get())
        {
            m_Ii->toMultipart(multipart, U("ii."));
        }
        
    }
    if(m_IofIsSet)
    {
        if (m_Iof.get())
        {
            m_Iof->toMultipart(multipart, U("iof."));
        }
        
    }
    if(m_AproxtribStateIsSet)
    {
        if (m_AproxtribState.get())
        {
            m_AproxtribState->toMultipart(multipart, U("aproxtribState."));
        }
        
    }
    if(m_AproxtribFedIsSet)
    {
        if (m_AproxtribFed.get())
        {
            m_AproxtribFed->toMultipart(multipart, U("aproxtribFed."));
        }
        
    }
    
}

void CalculatedTaxSummaryForGoods_taxByType::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("icms")))
    {
        if(multipart->hasContent(U("icms")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icms."));
            setIcms( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsSt")))
    {
        if(multipart->hasContent(U("icmsSt")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsSt."));
            setIcmsSt( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsStSd")))
    {
        if(multipart->hasContent(U("icmsStSd")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsStSd."));
            setIcmsStSd( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsPartOwn")))
    {
        if(multipart->hasContent(U("icmsPartOwn")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsPartOwn."));
            setIcmsPartOwn( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsPartDest")))
    {
        if(multipart->hasContent(U("icmsPartDest")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsPartDest."));
            setIcmsPartDest( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsDifaFCP")))
    {
        if(multipart->hasContent(U("icmsDifaFCP")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsDifaFCP."));
            setIcmsDifaFCP( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsDifaDest")))
    {
        if(multipart->hasContent(U("icmsDifaDest")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsDifaDest."));
            setIcmsDifaDest( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsDifaRemet")))
    {
        if(multipart->hasContent(U("icmsDifaRemet")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsDifaRemet."));
            setIcmsDifaRemet( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsRf")))
    {
        if(multipart->hasContent(U("icmsRf")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsRf."));
            setIcmsRf( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsDeson")))
    {
        if(multipart->hasContent(U("icmsDeson")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsDeson."));
            setIcmsDeson( newItem );
        }
        
    }
    if(multipart->hasContent(U("icmsCredsn")))
    {
        if(multipart->hasContent(U("icmsCredsn")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("icmsCredsn."));
            setIcmsCredsn( newItem );
        }
        
    }
    if(multipart->hasContent(U("pis")))
    {
        if(multipart->hasContent(U("pis")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("pis."));
            setPis( newItem );
        }
        
    }
    if(multipart->hasContent(U("pisSt")))
    {
        if(multipart->hasContent(U("pisSt")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("pisSt."));
            setPisSt( newItem );
        }
        
    }
    if(multipart->hasContent(U("cofins")))
    {
        if(multipart->hasContent(U("cofins")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("cofins."));
            setCofins( newItem );
        }
        
    }
    if(multipart->hasContent(U("cofinsSt")))
    {
        if(multipart->hasContent(U("cofinsSt")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("cofinsSt."));
            setCofinsSt( newItem );
        }
        
    }
    if(multipart->hasContent(U("ipi")))
    {
        if(multipart->hasContent(U("ipi")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("ipi."));
            setIpi( newItem );
        }
        
    }
    if(multipart->hasContent(U("ipiReturned")))
    {
        if(multipart->hasContent(U("ipiReturned")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("ipiReturned."));
            setIpiReturned( newItem );
        }
        
    }
    if(multipart->hasContent(U("ii")))
    {
        if(multipart->hasContent(U("ii")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("ii."));
            setIi( newItem );
        }
        
    }
    if(multipart->hasContent(U("iof")))
    {
        if(multipart->hasContent(U("iof")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("iof."));
            setIof( newItem );
        }
        
    }
    if(multipart->hasContent(U("aproxtribState")))
    {
        if(multipart->hasContent(U("aproxtribState")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("aproxtribState."));
            setAproxtribState( newItem );
        }
        
    }
    if(multipart->hasContent(U("aproxtribFed")))
    {
        if(multipart->hasContent(U("aproxtribFed")))
        {
            std::shared_ptr<TaxByTypeSummaryForGoods> newItem(new TaxByTypeSummaryForGoods());
            newItem->fromMultiPart(multipart, U("aproxtribFed."));
            setAproxtribFed( newItem );
        }
        
    }
    
}


std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcms() const
{
    return m_Icms;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcms(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_Icms = value;
    m_IcmsIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsIsSet() const
{
    return m_IcmsIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcms()
{
    m_IcmsIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsSt() const
{
    return m_IcmsSt;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsSt(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsSt = value;
    m_IcmsStIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsStIsSet() const
{
    return m_IcmsStIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsSt()
{
    m_IcmsStIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsStSd() const
{
    return m_IcmsStSd;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsStSd(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsStSd = value;
    m_IcmsStSdIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsStSdIsSet() const
{
    return m_IcmsStSdIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsStSd()
{
    m_IcmsStSdIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsPartOwn() const
{
    return m_IcmsPartOwn;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsPartOwn(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsPartOwn = value;
    m_IcmsPartOwnIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsPartOwnIsSet() const
{
    return m_IcmsPartOwnIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsPartOwn()
{
    m_IcmsPartOwnIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsPartDest() const
{
    return m_IcmsPartDest;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsPartDest(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsPartDest = value;
    m_IcmsPartDestIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsPartDestIsSet() const
{
    return m_IcmsPartDestIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsPartDest()
{
    m_IcmsPartDestIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsDifaFCP() const
{
    return m_IcmsDifaFCP;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsDifaFCP(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsDifaFCP = value;
    m_IcmsDifaFCPIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsDifaFCPIsSet() const
{
    return m_IcmsDifaFCPIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsDifaFCP()
{
    m_IcmsDifaFCPIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsDifaDest() const
{
    return m_IcmsDifaDest;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsDifaDest(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsDifaDest = value;
    m_IcmsDifaDestIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsDifaDestIsSet() const
{
    return m_IcmsDifaDestIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsDifaDest()
{
    m_IcmsDifaDestIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsDifaRemet() const
{
    return m_IcmsDifaRemet;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsDifaRemet(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsDifaRemet = value;
    m_IcmsDifaRemetIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsDifaRemetIsSet() const
{
    return m_IcmsDifaRemetIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsDifaRemet()
{
    m_IcmsDifaRemetIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsRf() const
{
    return m_IcmsRf;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsRf(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsRf = value;
    m_IcmsRfIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsRfIsSet() const
{
    return m_IcmsRfIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsRf()
{
    m_IcmsRfIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsDeson() const
{
    return m_IcmsDeson;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsDeson(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsDeson = value;
    m_IcmsDesonIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsDesonIsSet() const
{
    return m_IcmsDesonIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsDeson()
{
    m_IcmsDesonIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIcmsCredsn() const
{
    return m_IcmsCredsn;
}
void CalculatedTaxSummaryForGoods_taxByType::setIcmsCredsn(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IcmsCredsn = value;
    m_IcmsCredsnIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::icmsCredsnIsSet() const
{
    return m_IcmsCredsnIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIcmsCredsn()
{
    m_IcmsCredsnIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getPis() const
{
    return m_Pis;
}
void CalculatedTaxSummaryForGoods_taxByType::setPis(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_Pis = value;
    m_PisIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::pisIsSet() const
{
    return m_PisIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetPis()
{
    m_PisIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getPisSt() const
{
    return m_PisSt;
}
void CalculatedTaxSummaryForGoods_taxByType::setPisSt(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_PisSt = value;
    m_PisStIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::pisStIsSet() const
{
    return m_PisStIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetPisSt()
{
    m_PisStIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getCofins() const
{
    return m_Cofins;
}
void CalculatedTaxSummaryForGoods_taxByType::setCofins(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_Cofins = value;
    m_CofinsIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::cofinsIsSet() const
{
    return m_CofinsIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetCofins()
{
    m_CofinsIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getCofinsSt() const
{
    return m_CofinsSt;
}
void CalculatedTaxSummaryForGoods_taxByType::setCofinsSt(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_CofinsSt = value;
    m_CofinsStIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::cofinsStIsSet() const
{
    return m_CofinsStIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetCofinsSt()
{
    m_CofinsStIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIpi() const
{
    return m_Ipi;
}
void CalculatedTaxSummaryForGoods_taxByType::setIpi(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_Ipi = value;
    m_IpiIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::ipiIsSet() const
{
    return m_IpiIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIpi()
{
    m_IpiIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIpiReturned() const
{
    return m_IpiReturned;
}
void CalculatedTaxSummaryForGoods_taxByType::setIpiReturned(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_IpiReturned = value;
    m_IpiReturnedIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::ipiReturnedIsSet() const
{
    return m_IpiReturnedIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIpiReturned()
{
    m_IpiReturnedIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIi() const
{
    return m_Ii;
}
void CalculatedTaxSummaryForGoods_taxByType::setIi(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_Ii = value;
    m_IiIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::iiIsSet() const
{
    return m_IiIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIi()
{
    m_IiIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getIof() const
{
    return m_Iof;
}
void CalculatedTaxSummaryForGoods_taxByType::setIof(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_Iof = value;
    m_IofIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::iofIsSet() const
{
    return m_IofIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetIof()
{
    m_IofIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getAproxtribState() const
{
    return m_AproxtribState;
}
void CalculatedTaxSummaryForGoods_taxByType::setAproxtribState(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_AproxtribState = value;
    m_AproxtribStateIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::aproxtribStateIsSet() const
{
    return m_AproxtribStateIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetAproxtribState()
{
    m_AproxtribStateIsSet = false;
}
std::shared_ptr<TaxByTypeSummaryForGoods> CalculatedTaxSummaryForGoods_taxByType::getAproxtribFed() const
{
    return m_AproxtribFed;
}
void CalculatedTaxSummaryForGoods_taxByType::setAproxtribFed(std::shared_ptr<TaxByTypeSummaryForGoods> value)
{
    m_AproxtribFed = value;
    m_AproxtribFedIsSet = true;
}
bool CalculatedTaxSummaryForGoods_taxByType::aproxtribFedIsSet() const
{
    return m_AproxtribFedIsSet;
}
void CalculatedTaxSummaryForGoods_taxByType::unsetAproxtribFed()
{
    m_AproxtribFedIsSet = false;
}

}
}
}
}

