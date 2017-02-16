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
 * WithholdDef.h
 *
 * 
 */

#ifndef WithholdDef_H_
#define WithholdDef_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  WithholdDef
    : public ModelBase
{
public:
    WithholdDef();
    virtual ~WithholdDef();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// WithholdDef members

    /// <summary>
    /// UUID Reference to an item in the LegalReason store.
    /// </summary>
    utility::string_t getExemptionReasonCode() const;
    void setExemptionReasonCode(utility::string_t value);
    bool exemptionReasonCodeIsSet() const;
    void unsetExemptionReasonCode();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCustomExemptionReasonDescription() const;
    void setCustomExemptionReasonDescription(utility::string_t value);
    bool customExemptionReasonDescriptionIsSet() const;
    void unsetCustomExemptionReasonDescription();

protected:
    utility::string_t m_ExemptionReasonCode;
    bool m_ExemptionReasonCodeIsSet;
utility::string_t m_CustomExemptionReasonDescription;
    bool m_CustomExemptionReasonDescriptionIsSet;
};

}
}
}
}

#endif /* WithholdDef_H_ */