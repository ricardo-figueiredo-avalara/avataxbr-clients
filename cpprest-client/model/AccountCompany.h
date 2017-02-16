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
 * AccountCompany.h
 *
 * 
 */

#ifndef AccountCompany_H_
#define AccountCompany_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "UUID.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  AccountCompany
    : public ModelBase
{
public:
    AccountCompany();
    virtual ~AccountCompany();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// AccountCompany members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<UUID> getCompanyId() const;
    void setCompanyId(std::shared_ptr<UUID> value);
        /// <summary>
    /// 
    /// </summary>
    utility::string_t getCompanyCode() const;
    void setCompanyCode(utility::string_t value);
        /// <summary>
    /// 
    /// </summary>
    utility::string_t getCompanyName() const;
    void setCompanyName(utility::string_t value);
    bool companyNameIsSet() const;
    void unsetCompanyName();

protected:
    std::shared_ptr<UUID> m_CompanyId;
    utility::string_t m_CompanyCode;
    utility::string_t m_CompanyName;
    bool m_CompanyNameIsSet;
};

}
}
}
}

#endif /* AccountCompany_H_ */