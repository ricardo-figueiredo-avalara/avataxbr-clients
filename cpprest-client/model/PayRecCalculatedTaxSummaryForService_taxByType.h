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
 * PayRecCalculatedTaxSummaryForService_taxByType.h
 *
 * Object with summary of all taxes returned by engine
 */

#ifndef PayRecCalculatedTaxSummaryForService_taxByType_H_
#define PayRecCalculatedTaxSummaryForService_taxByType_H_


#include "ModelBase.h"

#include "TaxByTypeSummaryForService.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// Object with summary of all taxes returned by engine
/// </summary>
class  PayRecCalculatedTaxSummaryForService_taxByType
    : public ModelBase
{
public:
    PayRecCalculatedTaxSummaryForService_taxByType();
    virtual ~PayRecCalculatedTaxSummaryForService_taxByType();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PayRecCalculatedTaxSummaryForService_taxByType members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TaxByTypeSummaryForService> getIssRf() const;
    void setIssRf(std::shared_ptr<TaxByTypeSummaryForService> value);
    bool issRfIsSet() const;
    void unsetIssRf();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TaxByTypeSummaryForService> getPisRf() const;
    void setPisRf(std::shared_ptr<TaxByTypeSummaryForService> value);
    bool pisRfIsSet() const;
    void unsetPisRf();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TaxByTypeSummaryForService> getCofinsRf() const;
    void setCofinsRf(std::shared_ptr<TaxByTypeSummaryForService> value);
    bool cofinsRfIsSet() const;
    void unsetCofinsRf();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TaxByTypeSummaryForService> getCsllRf() const;
    void setCsllRf(std::shared_ptr<TaxByTypeSummaryForService> value);
    bool csllRfIsSet() const;
    void unsetCsllRf();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TaxByTypeSummaryForService> getIrrf() const;
    void setIrrf(std::shared_ptr<TaxByTypeSummaryForService> value);
    bool irrfIsSet() const;
    void unsetIrrf();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<TaxByTypeSummaryForService> getInssRf() const;
    void setInssRf(std::shared_ptr<TaxByTypeSummaryForService> value);
    bool inssRfIsSet() const;
    void unsetInssRf();

protected:
    std::shared_ptr<TaxByTypeSummaryForService> m_IssRf;
    bool m_IssRfIsSet;
std::shared_ptr<TaxByTypeSummaryForService> m_PisRf;
    bool m_PisRfIsSet;
std::shared_ptr<TaxByTypeSummaryForService> m_CofinsRf;
    bool m_CofinsRfIsSet;
std::shared_ptr<TaxByTypeSummaryForService> m_CsllRf;
    bool m_CsllRfIsSet;
std::shared_ptr<TaxByTypeSummaryForService> m_Irrf;
    bool m_IrrfIsSet;
std::shared_ptr<TaxByTypeSummaryForService> m_InssRf;
    bool m_InssRfIsSet;
};

}
}
}
}

#endif /* PayRecCalculatedTaxSummaryForService_taxByType_H_ */
