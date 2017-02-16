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
 * Body_2.h
 *
 * 
 */

#ifndef Body_2_H_
#define Body_2_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Body_2
    : public ModelBase
{
public:
    Body_2();
    virtual ~Body_2();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Body_2 members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getContent() const;
    void setContent(utility::string_t value);
    bool contentIsSet() const;
    void unsetContent();

protected:
    utility::string_t m_Content;
    bool m_ContentIsSet;
};

}
}
}
}

#endif /* Body_2_H_ */
