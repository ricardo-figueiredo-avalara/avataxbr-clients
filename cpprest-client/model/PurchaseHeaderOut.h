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

/*
 * PurchaseHeaderOut.h
 *
 * 
 */

#ifndef PurchaseHeaderOut_H_
#define PurchaseHeaderOut_H_


#include "ModelBase.h"

#include "PurchaseHeaderIn.h"
#include "PurchaseEntity.h"
#include "PurchaseHeaderOut_payment.h"
#include "PurchaseDefaultLocations.h"
#include <cpprest/details/basic_types.h>
#include "PurchaseTaxesConfig.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  PurchaseHeaderOut
    : public ModelBase
{
public:
    PurchaseHeaderOut();
    virtual ~PurchaseHeaderOut();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PurchaseHeaderOut members

    /// <summary>
    /// This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
    /// </summary>
    utility::string_t getAccountId() const;
    void setAccountId(utility::string_t value);
        /// <summary>
    /// This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
    /// </summary>
    utility::string_t getCompanyCode() const;
    void setCompanyCode(utility::string_t value);
        /// <summary>
    /// This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; 
    /// </summary>
    utility::string_t getTransactionType() const;
    void setTransactionType(utility::string_t value);
        /// <summary>
    /// This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
    /// </summary>
    utility::string_t getDocumentCode() const;
    void setDocumentCode(utility::string_t value);
    bool documentCodeIsSet() const;
    void unsetDocumentCode();
    /// <summary>
    /// currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot;
    /// </summary>
    utility::string_t getCurrency() const;
    void setCurrency(utility::string_t value);
        /// <summary>
    /// This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
    /// </summary>
    utility::datetime getTransactionDate() const;
    void setTransactionDate(utility::datetime value);
        /// <summary>
    /// accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
    /// </summary>
    utility::datetime getTaxCalculationDate() const;
    void setTaxCalculationDate(utility::datetime value);
    bool taxCalculationDateIsSet() const;
    void unsetTaxCalculationDate();
    /// <summary>
    /// This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
    /// </summary>
    utility::string_t getCompanyLocation() const;
    void setCompanyLocation(utility::string_t value);
        /// <summary>
    /// This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.
    /// </summary>
    utility::string_t getVendorCode() const;
    void setVendorCode(utility::string_t value);
        /// <summary>
    /// The number of Purchase Order
    /// </summary>
    utility::string_t getPurchaseOrderNumber() const;
    void setPurchaseOrderNumber(utility::string_t value);
    bool purchaseOrderNumberIsSet() const;
    void unsetPurchaseOrderNumber();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PurchaseEntity> getEntity() const;
    void setEntity(std::shared_ptr<PurchaseEntity> value);
    bool entityIsSet() const;
    void unsetEntity();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PurchaseHeaderOut_payment> getPayment() const;
    void setPayment(std::shared_ptr<PurchaseHeaderOut_payment> value);
    bool paymentIsSet() const;
    void unsetPayment();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PurchaseTaxesConfig> getTaxesConfig() const;
    void setTaxesConfig(std::shared_ptr<PurchaseTaxesConfig> value);
    bool taxesConfigIsSet() const;
    void unsetTaxesConfig();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PurchaseDefaultLocations> getDefaultLocations() const;
    void setDefaultLocations(std::shared_ptr<PurchaseDefaultLocations> value);
    bool defaultLocationsIsSet() const;
    void unsetDefaultLocations();

protected:
    utility::string_t m_AccountId;
    utility::string_t m_CompanyCode;
    utility::string_t m_TransactionType;
    utility::string_t m_DocumentCode;
    bool m_DocumentCodeIsSet;
utility::string_t m_Currency;
    utility::datetime m_TransactionDate;
    utility::datetime m_TaxCalculationDate;
    bool m_TaxCalculationDateIsSet;
utility::string_t m_CompanyLocation;
    utility::string_t m_VendorCode;
    utility::string_t m_PurchaseOrderNumber;
    bool m_PurchaseOrderNumberIsSet;
std::shared_ptr<PurchaseEntity> m_Entity;
    bool m_EntityIsSet;
std::shared_ptr<PurchaseHeaderOut_payment> m_Payment;
    bool m_PaymentIsSet;
std::shared_ptr<PurchaseTaxesConfig> m_TaxesConfig;
    bool m_TaxesConfigIsSet;
std::shared_ptr<PurchaseDefaultLocations> m_DefaultLocations;
    bool m_DefaultLocationsIsSet;
};

}
}
}
}

#endif /* PurchaseHeaderOut_H_ */
