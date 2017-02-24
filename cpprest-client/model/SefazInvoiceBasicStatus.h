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
 * SefazInvoiceBasicStatus.h
 *
 * 
 */

#ifndef SefazInvoiceBasicStatus_H_
#define SefazInvoiceBasicStatus_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  SefazInvoiceBasicStatus
    : public ModelBase
{
public:
    SefazInvoiceBasicStatus();
    virtual ~SefazInvoiceBasicStatus();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SefazInvoiceBasicStatus members

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
    utility::string_t getDesc() const;
    void setDesc(utility::string_t value);
    bool descIsSet() const;
    void unsetDesc();

protected:
    utility::string_t m_Code;
    bool m_CodeIsSet;
utility::string_t m_Desc;
    bool m_DescIsSet;
};

}
}
}
}

#endif /* SefazInvoiceBasicStatus_H_ */
