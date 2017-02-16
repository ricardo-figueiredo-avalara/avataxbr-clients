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
 * DetailsCalculatedTaxItem.h
 *
 * 
 */

#ifndef DetailsCalculatedTaxItem_H_
#define DetailsCalculatedTaxItem_H_


#include "ModelBase.h"

#include "DetailsCalculatedTax.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  DetailsCalculatedTaxItem
    : public ModelBase
{
public:
    DetailsCalculatedTaxItem();
    virtual ~DetailsCalculatedTaxItem();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// DetailsCalculatedTaxItem members

    /// <summary>
    /// This string captures the applicable location type. Location used for calc. Buyer or Seller
    /// </summary>
    utility::string_t getLocationType() const;
    void setLocationType(utility::string_t value);
    bool locationTypeIsSet() const;
    void unsetLocationType();
    /// <summary>
    /// Jurisdiction used for calctax amount
    /// </summary>
    utility::string_t getJurisdictionName() const;
    void setJurisdictionName(utility::string_t value);
    bool jurisdictionNameIsSet() const;
    void unsetJurisdictionName();
    /// <summary>
    /// Type of jurisdiction
    /// </summary>
    utility::string_t getJurisdictionType() const;
    void setJurisdictionType(utility::string_t value);
    bool jurisdictionTypeIsSet() const;
    void unsetJurisdictionType();
    /// <summary>
    /// Tax identificator
    /// </summary>
    utility::string_t getTaxType() const;
    void setTaxType(utility::string_t value);
    bool taxTypeIsSet() const;
    void unsetTaxType();
    /// <summary>
    /// Name of configuration rate
    /// </summary>
    utility::string_t getRateType() const;
    void setRateType(utility::string_t value);
    bool rateTypeIsSet() const;
    void unsetRateType();
    /// <summary>
    /// This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
    /// </summary>
    utility::string_t getScenario() const;
    void setScenario(utility::string_t value);
    bool scenarioIsSet() const;
    void unsetScenario();
    /// <summary>
    /// This decimal captures how much of the lineAmount was taxable by this tax, calc base
    /// </summary>
    double getSubtotalTaxable() const;
    void setSubtotalTaxable(double value);
    bool subtotalTaxableIsSet() const;
    void unsetSubtotalTaxable();
    /// <summary>
    /// This decimal captures the tax rate for this tax.3.00 (3%)
    /// </summary>
    double getRate() const;
    void setRate(double value);
    bool rateIsSet() const;
    void unsetRate();
    /// <summary>
    /// This decimal captures how much of the lineAmount was taxable by this tax
    /// </summary>
    double getTax() const;
    void setTax(double value);
    bool taxIsSet() const;
    void unsetTax();
    /// <summary>
    /// This string is required if is exempt
    /// </summary>
    utility::string_t getExemptionCode() const;
    void setExemptionCode(utility::string_t value);
    bool exemptionCodeIsSet() const;
    void unsetExemptionCode();
    /// <summary>
    /// This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address
    /// </summary>
    std::vector<utility::string_t>& getSignificantLocations();
    bool significantLocationsIsSet() const;
    void unsetSignificantLocations();
    /// <summary>
    /// This string with type of rule
    /// </summary>
    utility::string_t getTaxRuleType() const;
    void setTaxRuleType(utility::string_t value);
    bool taxRuleTypeIsSet() const;
    void unsetTaxRuleType();
    /// <summary>
    /// 
    /// </summary>
    int32_t getSource() const;
    void setSource(int32_t value);
    bool sourceIsSet() const;
    void unsetSource();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCstB() const;
    void setCstB(utility::string_t value);
    bool cstBIsSet() const;
    void unsetCstB();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getModBC() const;
    void setModBC(utility::string_t value);
    bool modBCIsSet() const;
    void unsetModBC();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCst() const;
    void setCst(utility::string_t value);
    bool cstIsSet() const;
    void unsetCst();

protected:
    utility::string_t m_LocationType;
    bool m_LocationTypeIsSet;
utility::string_t m_JurisdictionName;
    bool m_JurisdictionNameIsSet;
utility::string_t m_JurisdictionType;
    bool m_JurisdictionTypeIsSet;
utility::string_t m_TaxType;
    bool m_TaxTypeIsSet;
utility::string_t m_RateType;
    bool m_RateTypeIsSet;
utility::string_t m_Scenario;
    bool m_ScenarioIsSet;
double m_SubtotalTaxable;
    bool m_SubtotalTaxableIsSet;
double m_Rate;
    bool m_RateIsSet;
double m_Tax;
    bool m_TaxIsSet;
utility::string_t m_ExemptionCode;
    bool m_ExemptionCodeIsSet;
std::vector<utility::string_t> m_SignificantLocations;
    bool m_SignificantLocationsIsSet;
utility::string_t m_TaxRuleType;
    bool m_TaxRuleTypeIsSet;
int32_t m_Source;
    bool m_SourceIsSet;
utility::string_t m_CstB;
    bool m_CstBIsSet;
utility::string_t m_ModBC;
    bool m_ModBCIsSet;
utility::string_t m_Cst;
    bool m_CstIsSet;
};

}
}
}
}

#endif /* DetailsCalculatedTaxItem_H_ */