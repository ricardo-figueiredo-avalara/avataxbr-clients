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
 * PayRecCalculatedTaxSummaryForService.h
 *
 * 
 */

#ifndef PayRecCalculatedTaxSummaryForService_H_
#define PayRecCalculatedTaxSummaryForService_H_


#include "ModelBase.h"

#include "PccWithholdingMode.h"
#include "PayRecCalculatedTaxSummaryForService_taxByType.h"
#include <vector>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  PayRecCalculatedTaxSummaryForService
    : public ModelBase
{
public:
    PayRecCalculatedTaxSummaryForService();
    virtual ~PayRecCalculatedTaxSummaryForService();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PayRecCalculatedTaxSummaryForService members

    /// <summary>
    /// Count of lines
    /// </summary>
    int32_t getNumberOfLines() const;
    void setNumberOfLines(int32_t value);
    bool numberOfLinesIsSet() const;
    void unsetNumberOfLines();
    /// <summary>
    /// Sum of grossvalues
    /// </summary>
    double getSubtotal() const;
    void setSubtotal(double value);
    bool subtotalIsSet() const;
    void unsetSubtotal();
    /// <summary>
    /// Sum of all withholding values
    /// </summary>
    double getTotalTax() const;
    void setTotalTax(double value);
    bool totalTaxIsSet() const;
    void unsetTotalTax();
    /// <summary>
    /// Sum all NetValues
    /// </summary>
    double getGrandTotal() const;
    void setGrandTotal(double value);
    bool grandTotalIsSet() const;
    void unsetGrandTotal();
    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<PccWithholdingMode>>& getPccWithholdingModes();
    bool pccWithholdingModesIsSet() const;
    void unsetPccWithholdingModes();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PayRecCalculatedTaxSummaryForService_taxByType> getTaxByType() const;
    void setTaxByType(std::shared_ptr<PayRecCalculatedTaxSummaryForService_taxByType> value);
    bool taxByTypeIsSet() const;
    void unsetTaxByType();

protected:
    int32_t m_NumberOfLines;
    bool m_NumberOfLinesIsSet;
double m_Subtotal;
    bool m_SubtotalIsSet;
double m_TotalTax;
    bool m_TotalTaxIsSet;
double m_GrandTotal;
    bool m_GrandTotalIsSet;
std::vector<std::shared_ptr<PccWithholdingMode>> m_PccWithholdingModes;
    bool m_PccWithholdingModesIsSet;
std::shared_ptr<PayRecCalculatedTaxSummaryForService_taxByType> m_TaxByType;
    bool m_TaxByTypeIsSet;
};

}
}
}
}

#endif /* PayRecCalculatedTaxSummaryForService_H_ */