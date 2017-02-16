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
 * EntityInformerForGoods_federalTaxRegime.h
 *
 * 
 */

#ifndef EntityInformerForGoods_federalTaxRegime_H_
#define EntityInformerForGoods_federalTaxRegime_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  EntityInformerForGoods_federalTaxRegime
    : public ModelBase
{
public:
    EntityInformerForGoods_federalTaxRegime();
    virtual ~EntityInformerForGoods_federalTaxRegime();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// EntityInformerForGoods_federalTaxRegime members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getCode() const;
    void setCode(utility::string_t value);
    bool codeIsSet() const;
    void unsetCode();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getName() const;
    void setName(utility::string_t value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getAbbr() const;
    void setAbbr(utility::string_t value);
    bool abbrIsSet() const;
    void unsetAbbr();

protected:
    utility::string_t m_Code;
    bool m_CodeIsSet;
utility::string_t m_Name;
    bool m_NameIsSet;
utility::string_t m_Abbr;
    bool m_AbbrIsSet;
};

}
}
}
}

#endif /* EntityInformerForGoods_federalTaxRegime_H_ */
