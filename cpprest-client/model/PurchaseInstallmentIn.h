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

/*
 * PurchaseInstallmentIn.h
 *
 * 
 */

#ifndef PurchaseInstallmentIn_H_
#define PurchaseInstallmentIn_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  PurchaseInstallmentIn
    : public ModelBase
{
public:
    PurchaseInstallmentIn();
    virtual ~PurchaseInstallmentIn();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PurchaseInstallmentIn members

    /// <summary>
    /// DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
    /// </summary>
    utility::string_t getDocumentNumber() const;
    void setDocumentNumber(utility::string_t value);
        /// <summary>
    /// installment, Due Date
    /// </summary>
    utility::datetime getDate() const;
    void setDate(utility::datetime value);
        /// <summary>
    /// Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)
    /// </summary>
    double getGrossValue() const;
    void setGrossValue(double value);
    
protected:
    utility::string_t m_DocumentNumber;
    utility::datetime m_date;
    double m_GrossValue;
    };

}
}
}
}

#endif /* PurchaseInstallmentIn_H_ */