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
 * SefazItPutIn.h
 *
 * 
 */

#ifndef SefazItPutIn_H_
#define SefazItPutIn_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  SefazItPutIn
    : public ModelBase
{
public:
    SefazItPutIn();
    virtual ~SefazItPutIn();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SefazItPutIn members

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
    utility::string_t getText() const;
    void setText(utility::string_t value);
    bool textIsSet() const;
    void unsetText();

protected:
    utility::string_t m_Code;
    bool m_CodeIsSet;
utility::string_t m_Text;
    bool m_TextIsSet;
};

}
}
}
}

#endif /* SefazItPutIn_H_ */
