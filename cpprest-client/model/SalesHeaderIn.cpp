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



#include "SalesHeaderIn.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

SalesHeaderIn::SalesHeaderIn()
{
    m_AccountId = U("");
    m_CompanyCode = U("");
    m_TransactionType = U("");
    m_DocumentCode = U("");
    m_DocumentCodeIsSet = false;
    m_Currency = U("");
    m_TaxCalculationDateIsSet = false;
    m_CompanyLocation = U("");
    m_CustomerCode = U("");
    m_PurchaseOrderNumber = U("");
    m_PurchaseOrderNumberIsSet = false;
    m_RpsNumber = 0;
    m_RpsNumberIsSet = false;
    m_RpsSerie = U("");
    m_RpsSerieIsSet = false;
    m_DiscriminationIn = U("");
    m_DiscriminationInIsSet = false;
    m_EntityIsSet = false;
    m_PaymentIsSet = false;
    m_TaxesConfigIsSet = false;
    m_DefaultLocationsIsSet = false;
    
}

SalesHeaderIn::~SalesHeaderIn()
{
}

void SalesHeaderIn::validate()
{
    // TODO: implement validation
}

web::json::value SalesHeaderIn::toJson() const
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
    val[U("customerCode")] = ModelBase::toJson(m_CustomerCode);
    if(m_PurchaseOrderNumberIsSet)
    {
        val[U("purchaseOrderNumber")] = ModelBase::toJson(m_PurchaseOrderNumber);
    }
    if(m_RpsNumberIsSet)
    {
        val[U("rpsNumber")] = ModelBase::toJson(m_RpsNumber);
    }
    if(m_RpsSerieIsSet)
    {
        val[U("rpsSerie")] = ModelBase::toJson(m_RpsSerie);
    }
    if(m_DiscriminationInIsSet)
    {
        val[U("discriminationIn")] = ModelBase::toJson(m_DiscriminationIn);
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

void SalesHeaderIn::fromJson(web::json::value& val)
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
    setCustomerCode(ModelBase::stringFromJson(val[U("customerCode")]));
    if(val.has_field(U("purchaseOrderNumber")))
    {
        setPurchaseOrderNumber(ModelBase::stringFromJson(val[U("purchaseOrderNumber")]));
        
    }
    if(val.has_field(U("rpsNumber")))
    {
        setRpsNumber(ModelBase::int32_tFromJson(val[U("rpsNumber")]));
    }
    if(val.has_field(U("rpsSerie")))
    {
        setRpsSerie(ModelBase::stringFromJson(val[U("rpsSerie")]));
        
    }
    if(val.has_field(U("discriminationIn")))
    {
        setDiscriminationIn(ModelBase::stringFromJson(val[U("discriminationIn")]));
        
    }
    if(val.has_field(U("entity")))
    {
        if(!val[U("entity")].is_null())
        {
            std::shared_ptr<SalesEntity> newItem(new SalesEntity());
            newItem->fromJson(val[U("entity")]);
            setEntity( newItem );
        }
        
    }
    if(val.has_field(U("payment")))
    {
        if(!val[U("payment")].is_null())
        {
            std::shared_ptr<SalesHeaderIn_payment> newItem(new SalesHeaderIn_payment());
            newItem->fromJson(val[U("payment")]);
            setPayment( newItem );
        }
        
    }
    if(val.has_field(U("taxesConfig")))
    {
        if(!val[U("taxesConfig")].is_null())
        {
            std::shared_ptr<SalesTaxesConfig> newItem(new SalesTaxesConfig());
            newItem->fromJson(val[U("taxesConfig")]);
            setTaxesConfig( newItem );
        }
        
    }
    if(val.has_field(U("defaultLocations")))
    {
        if(!val[U("defaultLocations")].is_null())
        {
            std::shared_ptr<SalesDefaultLocations> newItem(new SalesDefaultLocations());
            newItem->fromJson(val[U("defaultLocations")]);
            setDefaultLocations( newItem );
        }
        
    }
    
}

void SalesHeaderIn::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    multipart->add(ModelBase::toHttpContent(namePrefix + U("customerCode"), m_CustomerCode));
    if(m_PurchaseOrderNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("purchaseOrderNumber"), m_PurchaseOrderNumber));
        
    }
    if(m_RpsNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("rpsNumber"), m_RpsNumber));
    }
    if(m_RpsSerieIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("rpsSerie"), m_RpsSerie));
        
    }
    if(m_DiscriminationInIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("discriminationIn"), m_DiscriminationIn));
        
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

void SalesHeaderIn::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    setCustomerCode(ModelBase::stringFromHttpContent(multipart->getContent(U("customerCode"))));
    if(multipart->hasContent(U("purchaseOrderNumber")))
    {
        setPurchaseOrderNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("purchaseOrderNumber"))));
        
    }
    if(multipart->hasContent(U("rpsNumber")))
    {
        setRpsNumber(ModelBase::int32_tFromHttpContent(multipart->getContent(U("rpsNumber"))));
    }
    if(multipart->hasContent(U("rpsSerie")))
    {
        setRpsSerie(ModelBase::stringFromHttpContent(multipart->getContent(U("rpsSerie"))));
        
    }
    if(multipart->hasContent(U("discriminationIn")))
    {
        setDiscriminationIn(ModelBase::stringFromHttpContent(multipart->getContent(U("discriminationIn"))));
        
    }
    if(multipart->hasContent(U("entity")))
    {
        if(multipart->hasContent(U("entity")))
        {
            std::shared_ptr<SalesEntity> newItem(new SalesEntity());
            newItem->fromMultiPart(multipart, U("entity."));
            setEntity( newItem );
        }
        
    }
    if(multipart->hasContent(U("payment")))
    {
        if(multipart->hasContent(U("payment")))
        {
            std::shared_ptr<SalesHeaderIn_payment> newItem(new SalesHeaderIn_payment());
            newItem->fromMultiPart(multipart, U("payment."));
            setPayment( newItem );
        }
        
    }
    if(multipart->hasContent(U("taxesConfig")))
    {
        if(multipart->hasContent(U("taxesConfig")))
        {
            std::shared_ptr<SalesTaxesConfig> newItem(new SalesTaxesConfig());
            newItem->fromMultiPart(multipart, U("taxesConfig."));
            setTaxesConfig( newItem );
        }
        
    }
    if(multipart->hasContent(U("defaultLocations")))
    {
        if(multipart->hasContent(U("defaultLocations")))
        {
            std::shared_ptr<SalesDefaultLocations> newItem(new SalesDefaultLocations());
            newItem->fromMultiPart(multipart, U("defaultLocations."));
            setDefaultLocations( newItem );
        }
        
    }
    
}


utility::string_t SalesHeaderIn::getAccountId() const
{
    return m_AccountId;
}
void SalesHeaderIn::setAccountId(utility::string_t value)
{
    m_AccountId = value;
    
}
utility::string_t SalesHeaderIn::getCompanyCode() const
{
    return m_CompanyCode;
}
void SalesHeaderIn::setCompanyCode(utility::string_t value)
{
    m_CompanyCode = value;
    
}
utility::string_t SalesHeaderIn::getTransactionType() const
{
    return m_TransactionType;
}
void SalesHeaderIn::setTransactionType(utility::string_t value)
{
    m_TransactionType = value;
    
}
utility::string_t SalesHeaderIn::getDocumentCode() const
{
    return m_DocumentCode;
}
void SalesHeaderIn::setDocumentCode(utility::string_t value)
{
    m_DocumentCode = value;
    m_DocumentCodeIsSet = true;
}
bool SalesHeaderIn::documentCodeIsSet() const
{
    return m_DocumentCodeIsSet;
}
void SalesHeaderIn::unsetDocumentCode()
{
    m_DocumentCodeIsSet = false;
}
utility::string_t SalesHeaderIn::getCurrency() const
{
    return m_Currency;
}
void SalesHeaderIn::setCurrency(utility::string_t value)
{
    m_Currency = value;
    
}
utility::datetime SalesHeaderIn::getTransactionDate() const
{
    return m_TransactionDate;
}
void SalesHeaderIn::setTransactionDate(utility::datetime value)
{
    m_TransactionDate = value;
    
}
utility::datetime SalesHeaderIn::getTaxCalculationDate() const
{
    return m_TaxCalculationDate;
}
void SalesHeaderIn::setTaxCalculationDate(utility::datetime value)
{
    m_TaxCalculationDate = value;
    m_TaxCalculationDateIsSet = true;
}
bool SalesHeaderIn::taxCalculationDateIsSet() const
{
    return m_TaxCalculationDateIsSet;
}
void SalesHeaderIn::unsetTaxCalculationDate()
{
    m_TaxCalculationDateIsSet = false;
}
utility::string_t SalesHeaderIn::getCompanyLocation() const
{
    return m_CompanyLocation;
}
void SalesHeaderIn::setCompanyLocation(utility::string_t value)
{
    m_CompanyLocation = value;
    
}
utility::string_t SalesHeaderIn::getCustomerCode() const
{
    return m_CustomerCode;
}
void SalesHeaderIn::setCustomerCode(utility::string_t value)
{
    m_CustomerCode = value;
    
}
utility::string_t SalesHeaderIn::getPurchaseOrderNumber() const
{
    return m_PurchaseOrderNumber;
}
void SalesHeaderIn::setPurchaseOrderNumber(utility::string_t value)
{
    m_PurchaseOrderNumber = value;
    m_PurchaseOrderNumberIsSet = true;
}
bool SalesHeaderIn::purchaseOrderNumberIsSet() const
{
    return m_PurchaseOrderNumberIsSet;
}
void SalesHeaderIn::unsetPurchaseOrderNumber()
{
    m_PurchaseOrderNumberIsSet = false;
}
int32_t SalesHeaderIn::getRpsNumber() const
{
    return m_RpsNumber;
}
void SalesHeaderIn::setRpsNumber(int32_t value)
{
    m_RpsNumber = value;
    m_RpsNumberIsSet = true;
}
bool SalesHeaderIn::rpsNumberIsSet() const
{
    return m_RpsNumberIsSet;
}
void SalesHeaderIn::unsetRpsNumber()
{
    m_RpsNumberIsSet = false;
}
utility::string_t SalesHeaderIn::getRpsSerie() const
{
    return m_RpsSerie;
}
void SalesHeaderIn::setRpsSerie(utility::string_t value)
{
    m_RpsSerie = value;
    m_RpsSerieIsSet = true;
}
bool SalesHeaderIn::rpsSerieIsSet() const
{
    return m_RpsSerieIsSet;
}
void SalesHeaderIn::unsetRpsSerie()
{
    m_RpsSerieIsSet = false;
}
utility::string_t SalesHeaderIn::getDiscriminationIn() const
{
    return m_DiscriminationIn;
}
void SalesHeaderIn::setDiscriminationIn(utility::string_t value)
{
    m_DiscriminationIn = value;
    m_DiscriminationInIsSet = true;
}
bool SalesHeaderIn::discriminationInIsSet() const
{
    return m_DiscriminationInIsSet;
}
void SalesHeaderIn::unsetDiscriminationIn()
{
    m_DiscriminationInIsSet = false;
}
std::shared_ptr<SalesEntity> SalesHeaderIn::getEntity() const
{
    return m_Entity;
}
void SalesHeaderIn::setEntity(std::shared_ptr<SalesEntity> value)
{
    m_Entity = value;
    m_EntityIsSet = true;
}
bool SalesHeaderIn::entityIsSet() const
{
    return m_EntityIsSet;
}
void SalesHeaderIn::unsetEntity()
{
    m_EntityIsSet = false;
}
std::shared_ptr<SalesHeaderIn_payment> SalesHeaderIn::getPayment() const
{
    return m_Payment;
}
void SalesHeaderIn::setPayment(std::shared_ptr<SalesHeaderIn_payment> value)
{
    m_Payment = value;
    m_PaymentIsSet = true;
}
bool SalesHeaderIn::paymentIsSet() const
{
    return m_PaymentIsSet;
}
void SalesHeaderIn::unsetPayment()
{
    m_PaymentIsSet = false;
}
std::shared_ptr<SalesTaxesConfig> SalesHeaderIn::getTaxesConfig() const
{
    return m_TaxesConfig;
}
void SalesHeaderIn::setTaxesConfig(std::shared_ptr<SalesTaxesConfig> value)
{
    m_TaxesConfig = value;
    m_TaxesConfigIsSet = true;
}
bool SalesHeaderIn::taxesConfigIsSet() const
{
    return m_TaxesConfigIsSet;
}
void SalesHeaderIn::unsetTaxesConfig()
{
    m_TaxesConfigIsSet = false;
}
std::shared_ptr<SalesDefaultLocations> SalesHeaderIn::getDefaultLocations() const
{
    return m_DefaultLocations;
}
void SalesHeaderIn::setDefaultLocations(std::shared_ptr<SalesDefaultLocations> value)
{
    m_DefaultLocations = value;
    m_DefaultLocationsIsSet = true;
}
bool SalesHeaderIn::defaultLocationsIsSet() const
{
    return m_DefaultLocationsIsSet;
}
void SalesHeaderIn::unsetDefaultLocations()
{
    m_DefaultLocationsIsSet = false;
}

}
}
}
}
