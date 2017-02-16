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
 * Inline_response_200_3.h
 *
 * 
 */

#ifndef Inline_response_200_3_H_
#define Inline_response_200_3_H_


#include "ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Inline_response_200_3
    : public ModelBase
{
public:
    Inline_response_200_3();
    virtual ~Inline_response_200_3();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Inline_response_200_3 members

    /// <summary>
    /// 
    /// </summary>
    bool getContingency() const;
    void setContingency(bool value);
    bool contingencyIsSet() const;
    void unsetContingency();
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getStartDate() const;
    void setStartDate(utility::datetime value);
    bool startDateIsSet() const;
    void unsetStartDate();
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getFinishDate() const;
    void setFinishDate(utility::datetime value);
    bool finishDateIsSet() const;
    void unsetFinishDate();

protected:
    bool m_Contingency;
    bool m_ContingencyIsSet;
utility::datetime m_StartDate;
    bool m_StartDateIsSet;
utility::datetime m_FinishDate;
    bool m_FinishDateIsSet;
};

}
}
}
}

#endif /* Inline_response_200_3_H_ */
