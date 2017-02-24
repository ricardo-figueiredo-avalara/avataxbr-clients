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
 * PurchaseDefaultLocations.h
 *
 * This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.
 */

#ifndef PurchaseDefaultLocations_H_
#define PurchaseDefaultLocations_H_


#include "ModelBase.h"

#include "PointOfOrderOrigin.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// This element contains a dictionary of locations such as the origin and destination addresses to be associated with this transaction. There can only be one location of a given purpose in the dictionary.
/// </summary>
class  PurchaseDefaultLocations
    : public ModelBase
{
public:
    PurchaseDefaultLocations();
    virtual ~PurchaseDefaultLocations();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PurchaseDefaultLocations members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PointOfOrderOrigin> getPointOfOrderOrigin() const;
    void setPointOfOrderOrigin(std::shared_ptr<PointOfOrderOrigin> value);
    bool PointOfOrderOriginIsSet() const;
    void unsetPointOfOrderOrigin();

protected:
    std::shared_ptr<PointOfOrderOrigin> m_PointOfOrderOrigin;
    bool m_PointOfOrderOriginIsSet;
};

}
}
}
}

#endif /* PurchaseDefaultLocations_H_ */
