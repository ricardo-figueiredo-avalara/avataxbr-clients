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
 * PurchaseEntity.h
 *
 * 
 */

#ifndef PurchaseEntity_H_
#define PurchaseEntity_H_


#include "ModelBase.h"

#include "EntityType.h"
#include "FederalTaxRegime.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  PurchaseEntity
    : public ModelBase
{
public:
    PurchaseEntity();
    virtual ~PurchaseEntity();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PurchaseEntity members

    /// <summary>
    /// Legal Name of Service buyer.
    /// </summary>
    utility::string_t getName() const;
    void setName(utility::string_t value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<EntityType> getType() const;
    void setType(std::shared_ptr<EntityType> value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// Entity Email
    /// </summary>
    utility::string_t getEmail() const;
    void setEmail(utility::string_t value);
    bool emailIsSet() const;
    void unsetEmail();
    /// <summary>
    /// CNPJ/CPF of Sales Buyer. If CPF, pattern is &#39;[0-9]{11}&#39; if CNPJ, pattern is &#39;[0-9]{14}&#39;
    /// </summary>
    utility::string_t getCnpjcpf() const;
    void setCnpjcpf(utility::string_t value);
    bool cnpjcpfIsSet() const;
    void unsetCnpjcpf();
    /// <summary>
    /// City Tax ID
    /// </summary>
    utility::string_t getCityTaxId() const;
    void setCityTaxId(utility::string_t value);
    bool cityTaxIdIsSet() const;
    void unsetCityTaxId();
    /// <summary>
    /// State Tax ID
    /// </summary>
    utility::string_t getStateTaxId() const;
    void setStateTaxId(utility::string_t value);
    bool stateTaxIdIsSet() const;
    void unsetStateTaxId();
    /// <summary>
    /// Suframa ID
    /// </summary>
    utility::string_t getSuframa() const;
    void setSuframa(utility::string_t value);
    bool suframaIsSet() const;
    void unsetSuframa();
    /// <summary>
    /// Entity Phone
    /// </summary>
    utility::string_t getPhone() const;
    void setPhone(utility::string_t value);
    bool phoneIsSet() const;
    void unsetPhone();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FederalTaxRegime> getTaxRegime() const;
    void setTaxRegime(std::shared_ptr<FederalTaxRegime> value);
    bool taxRegimeIsSet() const;
    void unsetTaxRegime();
    /// <summary>
    /// Some cities require PURCHASE.Buyers to withhold ISS (City Tax) from PURCHASE.Sellers stablished in different cities. In case the PURCHASE.Seller has acquired a Tax Registration in this destination city, by providing this information in the service invoice, this withholding obligation is lifted.
    /// </summary>
    bool getHasCpom() const;
    void setHasCpom(bool value);
    bool hasCpomIsSet() const;
    void unsetHasCpom();
    /// <summary>
    /// These are the federal taxes attributes that determine whether withholding of taxes should take place. In special cases where the PURCHASE.Seller is exempt of one or more of these taxes the withholding follows the same rules. The Business type may also dictate these rules as well.
    /// </summary>
    bool getSubjectWithholdingIrrf() const;
    void setSubjectWithholdingIrrf(bool value);
    bool subjectWithholdingIrrfIsSet() const;
    void unsetSubjectWithholdingIrrf();
    /// <summary>
    /// The INSS contribution is capped at a maximum limit (amount of actual retired payment available in the country).  Individuals sellers subject to INSS withholding can provide the amount already tax by other transactions (with the same buyer or different ones) to deduct to the tax basis. This amount is to be provided to the Seller in a form of a signed document.
    /// </summary>
    double getInssPreviousContrib() const;
    void setInssPreviousContrib(double value);
    bool inssPreviousContribIsSet() const;
    void unsetInssPreviousContrib();
    /// <summary>
    /// The INSS contribution is applicable only to the labor amount in a service contract.  There are several items that may be deducted from the service invoice total to arrive at the INSS taxable amount. This amount is to be provided to the Seller in the body of the Invoice or calculated during the transaction input.
    /// </summary>
    double getInssBasisDiscount() const;
    void setInssBasisDiscount(double value);
    bool inssBasisDiscountIsSet() const;
    void unsetInssBasisDiscount();
    /// <summary>
    /// When Seller is Simples regime, the seller needs send RF rate.
    /// </summary>
    double getIssRfRate() const;
    void setIssRfRate(double value);
    bool issRfRateIsSet() const;
    void unsetIssRfRate();

protected:
    utility::string_t m_Name;
    bool m_NameIsSet;
std::shared_ptr<EntityType> m_Type;
    bool m_TypeIsSet;
utility::string_t m_Email;
    bool m_EmailIsSet;
utility::string_t m_Cnpjcpf;
    bool m_CnpjcpfIsSet;
utility::string_t m_CityTaxId;
    bool m_CityTaxIdIsSet;
utility::string_t m_StateTaxId;
    bool m_StateTaxIdIsSet;
utility::string_t m_Suframa;
    bool m_SuframaIsSet;
utility::string_t m_Phone;
    bool m_PhoneIsSet;
std::shared_ptr<FederalTaxRegime> m_TaxRegime;
    bool m_TaxRegimeIsSet;
bool m_HasCpom;
    bool m_HasCpomIsSet;
bool m_SubjectWithholdingIrrf;
    bool m_SubjectWithholdingIrrfIsSet;
double m_InssPreviousContrib;
    bool m_InssPreviousContribIsSet;
double m_InssBasisDiscount;
    bool m_InssBasisDiscountIsSet;
double m_IssRfRate;
    bool m_IssRfRateIsSet;
};

}
}
}
}

#endif /* PurchaseEntity_H_ */