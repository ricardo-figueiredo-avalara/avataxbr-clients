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
 * InstallmentComplete.h
 *
 * 
 */

#ifndef InstallmentComplete_H_
#define InstallmentComplete_H_


#include "ModelBase.h"

#include "WithholdingMode.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  InstallmentComplete
    : public ModelBase
{
public:
    InstallmentComplete();
    virtual ~InstallmentComplete();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// InstallmentComplete members

    /// <summary>
    /// DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction
    /// </summary>
    utility::string_t getDocumentNumber() const;
    void setDocumentNumber(utility::string_t value);
        /// <summary>
    /// installment Due Date
    /// </summary>
    utility::datetime getDate() const;
    void setDate(utility::datetime value);
        /// <summary>
    /// Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)
    /// </summary>
    double getGrossValue() const;
    void setGrossValue(double value);
        /// <summary>
    /// net amount due for this installment, grossValue - ∑ (withhold amounts)
    /// </summary>
    double getNetValue() const;
    void setNetValue(double value);
    bool netValueIsSet() const;
    void unsetNetValue();
    /// <summary>
    /// Inform if this payment is subject to Pis, Cofins or CSLL
    /// </summary>
    std::shared_ptr<WithholdingMode> getWithholdingMode() const;
    void setWithholdingMode(std::shared_ptr<WithholdingMode> value);
    bool withholdingModeIsSet() const;
    void unsetWithholdingMode();
    /// <summary>
    /// calculated PIS-RF tax for this payment
    /// </summary>
    double getWithholdingPIS() const;
    void setWithholdingPIS(double value);
    bool withholdingPISIsSet() const;
    void unsetWithholdingPIS();
    /// <summary>
    /// calculated COFINS-RF tax for this payment
    /// </summary>
    double getWithholdingCOFINS() const;
    void setWithholdingCOFINS(double value);
    bool withholdingCOFINSIsSet() const;
    void unsetWithholdingCOFINS();
    /// <summary>
    /// calculated CSLL-RF tax for this payment
    /// </summary>
    double getWithholdingCSLL() const;
    void setWithholdingCSLL(double value);
    bool withholdingCSLLIsSet() const;
    void unsetWithholdingCSLL();

protected:
    utility::string_t m_DocumentNumber;
    utility::datetime m_date;
    double m_GrossValue;
    double m_NetValue;
    bool m_NetValueIsSet;
std::shared_ptr<WithholdingMode> m_WithholdingMode;
    bool m_WithholdingModeIsSet;
double m_WithholdingPIS;
    bool m_WithholdingPISIsSet;
double m_WithholdingCOFINS;
    bool m_WithholdingCOFINSIsSet;
double m_WithholdingCSLL;
    bool m_WithholdingCSLLIsSet;
};

}
}
}
}

#endif /* InstallmentComplete_H_ */
