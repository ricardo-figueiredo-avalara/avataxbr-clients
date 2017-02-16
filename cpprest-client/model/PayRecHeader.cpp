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



#include "PayRecHeader.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

PayRecHeader::PayRecHeader()
{
    m_AccountId = U("");
    m_CompanyCode = U("");
    m_TransactionType = U("");
    m_DocumentCode = U("");
    m_DocumentCodeIsSet = false;
    m_Currency = U("");
    m_TaxCalculationDateIsSet = false;
    m_VendorCode = U("");
    m_PaymentMode = U("");
    
}

PayRecHeader::~PayRecHeader()
{
}

void PayRecHeader::validate()
{
    // TODO: implement validation
}

web::json::value PayRecHeader::toJson() const
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
    val[U("vendorCode")] = ModelBase::toJson(m_VendorCode);
    val[U("paymentMode")] = ModelBase::toJson(m_PaymentMode);
    

    return val;
}

void PayRecHeader::fromJson(web::json::value& val)
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
    setVendorCode(ModelBase::stringFromJson(val[U("vendorCode")]));
    setPaymentMode(ModelBase::stringFromJson(val[U("paymentMode")]));
    
}

void PayRecHeader::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    multipart->add(ModelBase::toHttpContent(namePrefix + U("vendorCode"), m_VendorCode));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("paymentMode"), m_PaymentMode));
    
}

void PayRecHeader::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    setVendorCode(ModelBase::stringFromHttpContent(multipart->getContent(U("vendorCode"))));
    setPaymentMode(ModelBase::stringFromHttpContent(multipart->getContent(U("paymentMode"))));
    
}


utility::string_t PayRecHeader::getAccountId() const
{
    return m_AccountId;
}
void PayRecHeader::setAccountId(utility::string_t value)
{
    m_AccountId = value;
    
}
utility::string_t PayRecHeader::getCompanyCode() const
{
    return m_CompanyCode;
}
void PayRecHeader::setCompanyCode(utility::string_t value)
{
    m_CompanyCode = value;
    
}
utility::string_t PayRecHeader::getTransactionType() const
{
    return m_TransactionType;
}
void PayRecHeader::setTransactionType(utility::string_t value)
{
    m_TransactionType = value;
    
}
utility::string_t PayRecHeader::getDocumentCode() const
{
    return m_DocumentCode;
}
void PayRecHeader::setDocumentCode(utility::string_t value)
{
    m_DocumentCode = value;
    m_DocumentCodeIsSet = true;
}
bool PayRecHeader::documentCodeIsSet() const
{
    return m_DocumentCodeIsSet;
}
void PayRecHeader::unsetDocumentCode()
{
    m_DocumentCodeIsSet = false;
}
utility::string_t PayRecHeader::getCurrency() const
{
    return m_Currency;
}
void PayRecHeader::setCurrency(utility::string_t value)
{
    m_Currency = value;
    
}
utility::datetime PayRecHeader::getTransactionDate() const
{
    return m_TransactionDate;
}
void PayRecHeader::setTransactionDate(utility::datetime value)
{
    m_TransactionDate = value;
    
}
utility::datetime PayRecHeader::getTaxCalculationDate() const
{
    return m_TaxCalculationDate;
}
void PayRecHeader::setTaxCalculationDate(utility::datetime value)
{
    m_TaxCalculationDate = value;
    m_TaxCalculationDateIsSet = true;
}
bool PayRecHeader::taxCalculationDateIsSet() const
{
    return m_TaxCalculationDateIsSet;
}
void PayRecHeader::unsetTaxCalculationDate()
{
    m_TaxCalculationDateIsSet = false;
}
utility::string_t PayRecHeader::getVendorCode() const
{
    return m_VendorCode;
}
void PayRecHeader::setVendorCode(utility::string_t value)
{
    m_VendorCode = value;
    
}
utility::string_t PayRecHeader::getPaymentMode() const
{
    return m_PaymentMode;
}
void PayRecHeader::setPaymentMode(utility::string_t value)
{
    m_PaymentMode = value;
    
}

}
}
}
}

