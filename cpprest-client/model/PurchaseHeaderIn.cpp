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



#include "PurchaseHeaderIn.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

PurchaseHeaderIn::PurchaseHeaderIn()
{
    m_AccountId = U("");
    m_CompanyCode = U("");
    m_TransactionType = U("");
    m_DocumentCode = U("");
    m_DocumentCodeIsSet = false;
    m_Currency = U("");
    m_TaxCalculationDateIsSet = false;
    m_CompanyLocation = U("");
    m_VendorCode = U("");
    m_PurchaseOrderNumber = U("");
    m_PurchaseOrderNumberIsSet = false;
    m_EntityIsSet = false;
    m_PaymentIsSet = false;
    m_TaxesConfigIsSet = false;
    m_DefaultLocationsIsSet = false;
    
}

PurchaseHeaderIn::~PurchaseHeaderIn()
{
}

void PurchaseHeaderIn::validate()
{
    // TODO: implement validation
}

web::json::value PurchaseHeaderIn::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("accountId")] = ModelBase::toJson(m_AccountId);
    val[U("companyCode")] = ModelBase::toJson(m_CompanyCode);
    val[U("transactionType")] = ModelBase::toJson(m_TransactionType);
    if(m_DocumentCodeIsSet)
    {
        val[U("documentCode")] = ModelBase::toJson(m_DocumentCode);
    }
    val[U("currency")] = ModelBase::toJson(m_Currency);
    val[U("transactionDate")] = ModelBase::toJson(m_TransactionDate);
    if(m_TaxCalculationDateIsSet)
    {
        val[U("taxCalculationDate")] = ModelBase::toJson(m_TaxCalculationDate);
    }
    val[U("companyLocation")] = ModelBase::toJson(m_CompanyLocation);
    val[U("vendorCode")] = ModelBase::toJson(m_VendorCode);
    if(m_PurchaseOrderNumberIsSet)
    {
        val[U("purchaseOrderNumber")] = ModelBase::toJson(m_PurchaseOrderNumber);
    }
    if(m_EntityIsSet)
    {
        val[U("entity")] = ModelBase::toJson(m_Entity);
    }
    if(m_PaymentIsSet)
    {
        val[U("payment")] = ModelBase::toJson(m_Payment);
    }
    if(m_TaxesConfigIsSet)
    {
        val[U("taxesConfig")] = ModelBase::toJson(m_TaxesConfig);
    }
    if(m_DefaultLocationsIsSet)
    {
        val[U("defaultLocations")] = ModelBase::toJson(m_DefaultLocations);
    }
    

    return val;
}

void PurchaseHeaderIn::fromJson(web::json::value& val)
{
    setAccountId(ModelBase::stringFromJson(val[U("accountId")]));
    setCompanyCode(ModelBase::stringFromJson(val[U("companyCode")]));
    setTransactionType(ModelBase::stringFromJson(val[U("transactionType")]));
    if(val.has_field(U("documentCode")))
    {
        setDocumentCode(ModelBase::stringFromJson(val[U("documentCode")]));
        
    }
    setCurrency(ModelBase::stringFromJson(val[U("currency")]));
    utility::datetime newTransactionDate(utility::datetime());
    newTransactionDate->fromJson(val[U("transactionDate")]);
    setTransactionDate( newItem );
    if(val.has_field(U("taxCalculationDate")))
    {
        if(!val[U("taxCalculationDate")].is_null())
        {
            utility::datetime newItem(utility::datetime());
            newItem->fromJson(val[U("taxCalculationDate")]);
            setTaxCalculationDate( newItem );
        }
        
    }
    setCompanyLocation(ModelBase::stringFromJson(val[U("companyLocation")]));
    setVendorCode(ModelBase::stringFromJson(val[U("vendorCode")]));
    if(val.has_field(U("purchaseOrderNumber")))
    {
        setPurchaseOrderNumber(ModelBase::stringFromJson(val[U("purchaseOrderNumber")]));
        
    }
    if(val.has_field(U("entity")))
    {
        if(!val[U("entity")].is_null())
        {
            std::shared_ptr<PurchaseEntity> newItem(new PurchaseEntity());
            newItem->fromJson(val[U("entity")]);
            setEntity( newItem );
        }
        
    }
    if(val.has_field(U("payment")))
    {
        if(!val[U("payment")].is_null())
        {
            std::shared_ptr<PurchaseHeaderIn_payment> newItem(new PurchaseHeaderIn_payment());
            newItem->fromJson(val[U("payment")]);
            setPayment( newItem );
        }
        
    }
    if(val.has_field(U("taxesConfig")))
    {
        if(!val[U("taxesConfig")].is_null())
        {
            std::shared_ptr<PurchaseTaxesConfig> newItem(new PurchaseTaxesConfig());
            newItem->fromJson(val[U("taxesConfig")]);
            setTaxesConfig( newItem );
        }
        
    }
    if(val.has_field(U("defaultLocations")))
    {
        if(!val[U("defaultLocations")].is_null())
        {
            std::shared_ptr<PurchaseDefaultLocations> newItem(new PurchaseDefaultLocations());
            newItem->fromJson(val[U("defaultLocations")]);
            setDefaultLocations( newItem );
        }
        
    }
    
}

void PurchaseHeaderIn::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("accountId"), m_AccountId));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("companyCode"), m_CompanyCode));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("transactionType"), m_TransactionType));
    if(m_DocumentCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("documentCode"), m_DocumentCode));
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("currency"), m_Currency));
    m_TransactionDate->toMultipart(multipart, U("transactionDate."));
    if(m_TaxCalculationDateIsSet)
    {
        if (m_TaxCalculationDate.get())
        {
            m_TaxCalculationDate->toMultipart(multipart, U("taxCalculationDate."));
        }
        
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("companyLocation"), m_CompanyLocation));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("vendorCode"), m_VendorCode));
    if(m_PurchaseOrderNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("purchaseOrderNumber"), m_PurchaseOrderNumber));
        
    }
    if(m_EntityIsSet)
    {
        if (m_Entity.get())
        {
            m_Entity->toMultipart(multipart, U("entity."));
        }
        
    }
    if(m_PaymentIsSet)
    {
        if (m_Payment.get())
        {
            m_Payment->toMultipart(multipart, U("payment."));
        }
        
    }
    if(m_TaxesConfigIsSet)
    {
        if (m_TaxesConfig.get())
        {
            m_TaxesConfig->toMultipart(multipart, U("taxesConfig."));
        }
        
    }
    if(m_DefaultLocationsIsSet)
    {
        if (m_DefaultLocations.get())
        {
            m_DefaultLocations->toMultipart(multipart, U("defaultLocations."));
        }
        
    }
    
}

void PurchaseHeaderIn::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setAccountId(ModelBase::stringFromHttpContent(multipart->getContent(U("accountId"))));
    setCompanyCode(ModelBase::stringFromHttpContent(multipart->getContent(U("companyCode"))));
    setTransactionType(ModelBase::stringFromHttpContent(multipart->getContent(U("transactionType"))));
    if(multipart->hasContent(U("documentCode")))
    {
        setDocumentCode(ModelBase::stringFromHttpContent(multipart->getContent(U("documentCode"))));
        
    }
    setCurrency(ModelBase::stringFromHttpContent(multipart->getContent(U("currency"))));
    utility::datetime newTransactionDate(utility::datetime());
    newTransactionDate->fromMultiPart(multipart, U("transactionDate."));
    setTransactionDate( newTransactionDate );
    if(multipart->hasContent(U("taxCalculationDate")))
    {
        if(multipart->hasContent(U("taxCalculationDate")))
        {
            utility::datetime newItem(utility::datetime());
            newItem->fromMultiPart(multipart, U("taxCalculationDate."));
            setTaxCalculationDate( newItem );
        }
        
    }
    setCompanyLocation(ModelBase::stringFromHttpContent(multipart->getContent(U("companyLocation"))));
    setVendorCode(ModelBase::stringFromHttpContent(multipart->getContent(U("vendorCode"))));
    if(multipart->hasContent(U("purchaseOrderNumber")))
    {
        setPurchaseOrderNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("purchaseOrderNumber"))));
        
    }
    if(multipart->hasContent(U("entity")))
    {
        if(multipart->hasContent(U("entity")))
        {
            std::shared_ptr<PurchaseEntity> newItem(new PurchaseEntity());
            newItem->fromMultiPart(multipart, U("entity."));
            setEntity( newItem );
        }
        
    }
    if(multipart->hasContent(U("payment")))
    {
        if(multipart->hasContent(U("payment")))
        {
            std::shared_ptr<PurchaseHeaderIn_payment> newItem(new PurchaseHeaderIn_payment());
            newItem->fromMultiPart(multipart, U("payment."));
            setPayment( newItem );
        }
        
    }
    if(multipart->hasContent(U("taxesConfig")))
    {
        if(multipart->hasContent(U("taxesConfig")))
        {
            std::shared_ptr<PurchaseTaxesConfig> newItem(new PurchaseTaxesConfig());
            newItem->fromMultiPart(multipart, U("taxesConfig."));
            setTaxesConfig( newItem );
        }
        
    }
    if(multipart->hasContent(U("defaultLocations")))
    {
        if(multipart->hasContent(U("defaultLocations")))
        {
            std::shared_ptr<PurchaseDefaultLocations> newItem(new PurchaseDefaultLocations());
            newItem->fromMultiPart(multipart, U("defaultLocations."));
            setDefaultLocations( newItem );
        }
        
    }
    
}


utility::string_t PurchaseHeaderIn::getAccountId() const
{
    return m_AccountId;
}
void PurchaseHeaderIn::setAccountId(utility::string_t value)
{
    m_AccountId = value;
    
}
utility::string_t PurchaseHeaderIn::getCompanyCode() const
{
    return m_CompanyCode;
}
void PurchaseHeaderIn::setCompanyCode(utility::string_t value)
{
    m_CompanyCode = value;
    
}
utility::string_t PurchaseHeaderIn::getTransactionType() const
{
    return m_TransactionType;
}
void PurchaseHeaderIn::setTransactionType(utility::string_t value)
{
    m_TransactionType = value;
    
}
utility::string_t PurchaseHeaderIn::getDocumentCode() const
{
    return m_DocumentCode;
}
void PurchaseHeaderIn::setDocumentCode(utility::string_t value)
{
    m_DocumentCode = value;
    m_DocumentCodeIsSet = true;
}
bool PurchaseHeaderIn::documentCodeIsSet() const
{
    return m_DocumentCodeIsSet;
}
void PurchaseHeaderIn::unsetDocumentCode()
{
    m_DocumentCodeIsSet = false;
}
utility::string_t PurchaseHeaderIn::getCurrency() const
{
    return m_Currency;
}
void PurchaseHeaderIn::setCurrency(utility::string_t value)
{
    m_Currency = value;
    
}
utility::datetime PurchaseHeaderIn::getTransactionDate() const
{
    return m_TransactionDate;
}
void PurchaseHeaderIn::setTransactionDate(utility::datetime value)
{
    m_TransactionDate = value;
    
}
utility::datetime PurchaseHeaderIn::getTaxCalculationDate() const
{
    return m_TaxCalculationDate;
}
void PurchaseHeaderIn::setTaxCalculationDate(utility::datetime value)
{
    m_TaxCalculationDate = value;
    m_TaxCalculationDateIsSet = true;
}
bool PurchaseHeaderIn::taxCalculationDateIsSet() const
{
    return m_TaxCalculationDateIsSet;
}
void PurchaseHeaderIn::unsetTaxCalculationDate()
{
    m_TaxCalculationDateIsSet = false;
}
utility::string_t PurchaseHeaderIn::getCompanyLocation() const
{
    return m_CompanyLocation;
}
void PurchaseHeaderIn::setCompanyLocation(utility::string_t value)
{
    m_CompanyLocation = value;
    
}
utility::string_t PurchaseHeaderIn::getVendorCode() const
{
    return m_VendorCode;
}
void PurchaseHeaderIn::setVendorCode(utility::string_t value)
{
    m_VendorCode = value;
    
}
utility::string_t PurchaseHeaderIn::getPurchaseOrderNumber() const
{
    return m_PurchaseOrderNumber;
}
void PurchaseHeaderIn::setPurchaseOrderNumber(utility::string_t value)
{
    m_PurchaseOrderNumber = value;
    m_PurchaseOrderNumberIsSet = true;
}
bool PurchaseHeaderIn::purchaseOrderNumberIsSet() const
{
    return m_PurchaseOrderNumberIsSet;
}
void PurchaseHeaderIn::unsetPurchaseOrderNumber()
{
    m_PurchaseOrderNumberIsSet = false;
}
std::shared_ptr<PurchaseEntity> PurchaseHeaderIn::getEntity() const
{
    return m_Entity;
}
void PurchaseHeaderIn::setEntity(std::shared_ptr<PurchaseEntity> value)
{
    m_Entity = value;
    m_EntityIsSet = true;
}
bool PurchaseHeaderIn::entityIsSet() const
{
    return m_EntityIsSet;
}
void PurchaseHeaderIn::unsetEntity()
{
    m_EntityIsSet = false;
}
std::shared_ptr<PurchaseHeaderIn_payment> PurchaseHeaderIn::getPayment() const
{
    return m_Payment;
}
void PurchaseHeaderIn::setPayment(std::shared_ptr<PurchaseHeaderIn_payment> value)
{
    m_Payment = value;
    m_PaymentIsSet = true;
}
bool PurchaseHeaderIn::paymentIsSet() const
{
    return m_PaymentIsSet;
}
void PurchaseHeaderIn::unsetPayment()
{
    m_PaymentIsSet = false;
}
std::shared_ptr<PurchaseTaxesConfig> PurchaseHeaderIn::getTaxesConfig() const
{
    return m_TaxesConfig;
}
void PurchaseHeaderIn::setTaxesConfig(std::shared_ptr<PurchaseTaxesConfig> value)
{
    m_TaxesConfig = value;
    m_TaxesConfigIsSet = true;
}
bool PurchaseHeaderIn::taxesConfigIsSet() const
{
    return m_TaxesConfigIsSet;
}
void PurchaseHeaderIn::unsetTaxesConfig()
{
    m_TaxesConfigIsSet = false;
}
std::shared_ptr<PurchaseDefaultLocations> PurchaseHeaderIn::getDefaultLocations() const
{
    return m_DefaultLocations;
}
void PurchaseHeaderIn::setDefaultLocations(std::shared_ptr<PurchaseDefaultLocations> value)
{
    m_DefaultLocations = value;
    m_DefaultLocationsIsSet = true;
}
bool PurchaseHeaderIn::defaultLocationsIsSet() const
{
    return m_DefaultLocationsIsSet;
}
void PurchaseHeaderIn::unsetDefaultLocations()
{
    m_DefaultLocationsIsSet = false;
}

}
}
}
}

