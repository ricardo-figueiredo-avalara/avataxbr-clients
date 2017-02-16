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
 * CSTTableAEnum.h
 *
 * Source of product or merchandise, - &#39;0&#39; # National goods - &#39;except those treated in codes 3,4, 5 and 8 - &#39;1&#39; # Imported directly by seller, except those in code 6 - &#39;2&#39; # Foreign goods - &#39;Acquired in the internal market (inside Brazil), except those in code 7 - &#39;3&#39; # Merchandise or goods with imported content above 40% and with less than or equal to 70% - &#39;4&#39; # National goods from production following &#39;standard basic processes&#39; as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - &#39;5&#39; # National goods - &#39;Merchandise or goods with imported content equal or below 40% - &#39;6&#39; # Foreign goods - &#39;Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - &#39;7&#39; # Foreign goods - &#39;Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - &#39;8&#39; # Merchandise or goods with imported content above 70% 
 */

#ifndef CSTTableAEnum_H_
#define CSTTableAEnum_H_


#include "ModelBase.h"


namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// Source of product or merchandise, - &#39;0&#39; # National goods - &#39;except those treated in codes 3,4, 5 and 8 - &#39;1&#39; # Imported directly by seller, except those in code 6 - &#39;2&#39; # Foreign goods - &#39;Acquired in the internal market (inside Brazil), except those in code 7 - &#39;3&#39; # Merchandise or goods with imported content above 40% and with less than or equal to 70% - &#39;4&#39; # National goods from production following &#39;standard basic processes&#39; as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - &#39;5&#39; # National goods - &#39;Merchandise or goods with imported content equal or below 40% - &#39;6&#39; # Foreign goods - &#39;Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - &#39;7&#39; # Foreign goods - &#39;Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - &#39;8&#39; # Merchandise or goods with imported content above 70% 
/// </summary>
class  CSTTableAEnum
    : public ModelBase
{
public:
    CSTTableAEnum();
    virtual ~CSTTableAEnum();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CSTTableAEnum members


protected:
    };

}
}
}
}

#endif /* CSTTableAEnum_H_ */