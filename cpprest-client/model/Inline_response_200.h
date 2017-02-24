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
 * Inline_response_200.h
 *
 * 
 */

#ifndef Inline_response_200_H_
#define Inline_response_200_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Inline_response_200
    : public ModelBase
{
public:
    Inline_response_200();
    virtual ~Inline_response_200();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Inline_response_200 members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getToken() const;
    void setToken(utility::string_t value);
    bool tokenIsSet() const;
    void unsetToken();
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getExpired() const;
    void setExpired(utility::datetime value);
    bool expiredIsSet() const;
    void unsetExpired();

protected:
    utility::string_t m_Token;
    bool m_TokenIsSet;
utility::datetime m_Expired;
    bool m_ExpiredIsSet;
};

}
}
}
}

#endif /* Inline_response_200_H_ */
