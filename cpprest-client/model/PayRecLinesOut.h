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
 * PayRecLinesOut.h
 *
 * 
 */

#ifndef PayRecLinesOut_H_
#define PayRecLinesOut_H_


#include "ModelBase.h"

#include "WithholdingMode.h"
#include "PayRecLinesIn.h"
#include "PaymentCalculatedTax.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  PayRecLinesOut
    : public ModelBase
{
public:
    PayRecLinesOut();
    virtual ~PayRecLinesOut();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PayRecLinesOut members

    /// <summary>
    /// Installment number in this document
    /// </summary>
    int32_t getLineCode() const;
    void setLineCode(int32_t value);
    bool lineCodeIsSet() const;
    void unsetLineCode();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getLineType() const;
    void setLineType(utility::string_t value);
    bool lineTypeIsSet() const;
    void unsetLineType();
    /// <summary>
    /// Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
    /// </summary>
    utility::string_t getItemCode() const;
    void setItemCode(utility::string_t value);
        /// <summary>
    /// Free description about this payment
    /// </summary>
    utility::string_t getItemDescription() const;
    void setItemDescription(utility::string_t value);
    bool itemDescriptionIsSet() const;
    void unsetItemDescription();
    /// <summary>
    /// Installment number, when paid AS IS
    /// </summary>
    utility::string_t getItemDocNumber() const;
    void setItemDocNumber(utility::string_t value);
    bool itemDocNumberIsSet() const;
    void unsetItemDocNumber();
    /// <summary>
    /// Penalty, usually because paid after due date
    /// </summary>
    double getLineUntaxedPenality() const;
    void setLineUntaxedPenality(double value);
    bool lineUntaxedPenalityIsSet() const;
    void unsetLineUntaxedPenality();
    /// <summary>
    /// unconditional discounts
    /// </summary>
    double getLineUntaxedDiscount() const;
    void setLineUntaxedDiscount(double value);
    bool lineUntaxedDiscountIsSet() const;
    void unsetLineUntaxedDiscount();
    /// <summary>
    /// GrossAmount of this installment line
    /// </summary>
    double getLineAmount() const;
    void setLineAmount(double value);
    bool lineAmountIsSet() const;
    void unsetLineAmount();
    /// <summary>
    /// Net value, the net Value is Gross value plus penalty minus sum of discount and withhold taxes
    /// </summary>
    double getLineNetValue() const;
    void setLineNetValue(double value);
    bool lineNetValueIsSet() const;
    void unsetLineNetValue();
    /// <summary>
    /// x is because not subject of this tax independent of Threshold
    /// </summary>
    std::shared_ptr<WithholdingMode> getWithholdingMode() const;
    void setWithholdingMode(std::shared_ptr<WithholdingMode> value);
    bool withholdingModeIsSet() const;
    void unsetWithholdingMode();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PaymentCalculatedTax> getCalculatedTax() const;
    void setCalculatedTax(std::shared_ptr<PaymentCalculatedTax> value);
    bool calculatedTaxIsSet() const;
    void unsetCalculatedTax();

protected:
    int32_t m_LineCode;
    bool m_LineCodeIsSet;
utility::string_t m_LineType;
    bool m_LineTypeIsSet;
utility::string_t m_ItemCode;
    utility::string_t m_ItemDescription;
    bool m_ItemDescriptionIsSet;
utility::string_t m_ItemDocNumber;
    bool m_ItemDocNumberIsSet;
double m_LineUntaxedPenality;
    bool m_LineUntaxedPenalityIsSet;
double m_LineUntaxedDiscount;
    bool m_LineUntaxedDiscountIsSet;
double m_LineAmount;
    bool m_LineAmountIsSet;
double m_LineNetValue;
    bool m_LineNetValueIsSet;
std::shared_ptr<WithholdingMode> m_WithholdingMode;
    bool m_WithholdingModeIsSet;
std::shared_ptr<PaymentCalculatedTax> m_CalculatedTax;
    bool m_CalculatedTaxIsSet;
};

}
}
}
}

#endif /* PayRecLinesOut_H_ */
