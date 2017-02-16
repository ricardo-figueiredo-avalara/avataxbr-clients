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
 * PurchaseLinesIn.h
 *
 * 
 */

#ifndef PurchaseLinesIn_H_
#define PurchaseLinesIn_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "SalesLinesOut_taxDeductions.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  PurchaseLinesIn
    : public ModelBase
{
public:
    PurchaseLinesIn();
    virtual ~PurchaseLinesIn();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PurchaseLinesIn members

    /// <summary>
    /// This string is a unique identifier for this line in the transaction
    /// </summary>
    int32_t getLineCode() const;
    void setLineCode(int32_t value);
    bool lineCodeIsSet() const;
    void unsetLineCode();
    /// <summary>
    /// This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
    /// </summary>
    utility::string_t getItemCode() const;
    void setItemCode(utility::string_t value);
        /// <summary>
    /// This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
    /// </summary>
    double getNumberOfItems() const;
    void setNumberOfItems(double value);
    bool numberOfItemsIsSet() const;
    void unsetNumberOfItems();
    /// <summary>
    /// This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).
    /// </summary>
    double getLineAmount() const;
    void setLineAmount(double value);
    bool lineAmountIsSet() const;
    void unsetLineAmount();
    /// <summary>
    /// This string captures the description of the item represented by this line, will be used LC 116
    /// </summary>
    utility::string_t getItemDescription() const;
    void setItemDescription(utility::string_t value);
    bool itemDescriptionIsSet() const;
    void unsetItemDescription();
    /// <summary>
    /// Conditional discount
    /// </summary>
    double getLineTaxedDiscount() const;
    void setLineTaxedDiscount(double value);
    bool lineTaxedDiscountIsSet() const;
    void unsetLineTaxedDiscount();
    /// <summary>
    /// Unconditional discount
    /// </summary>
    double getLineUntaxedDiscount() const;
    void setLineUntaxedDiscount(double value);
    bool lineUntaxedDiscountIsSet() const;
    void unsetLineUntaxedDiscount();
    /// <summary>
    /// Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39; 
    /// </summary>
    utility::string_t getUseType() const;
    void setUseType(utility::string_t value);
    bool useTypeIsSet() const;
    void unsetUseType();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SalesLinesOut_taxDeductions> getTaxDeductions() const;
    void setTaxDeductions(std::shared_ptr<SalesLinesOut_taxDeductions> value);
    bool taxDeductionsIsSet() const;
    void unsetTaxDeductions();

protected:
    int32_t m_LineCode;
    bool m_LineCodeIsSet;
utility::string_t m_ItemCode;
    double m_NumberOfItems;
    bool m_NumberOfItemsIsSet;
double m_LineAmount;
    bool m_LineAmountIsSet;
utility::string_t m_ItemDescription;
    bool m_ItemDescriptionIsSet;
double m_LineTaxedDiscount;
    bool m_LineTaxedDiscountIsSet;
double m_LineUntaxedDiscount;
    bool m_LineUntaxedDiscountIsSet;
utility::string_t m_UseType;
    bool m_UseTypeIsSet;
std::shared_ptr<SalesLinesOut_taxDeductions> m_TaxDeductions;
    bool m_TaxDeductionsIsSet;
};

}
}
}
}

#endif /* PurchaseLinesIn_H_ */