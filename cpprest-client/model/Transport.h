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
 * Transport.h
 *
 * 
 */

#ifndef Transport_H_
#define Transport_H_


#include "ModelBase.h"

#include "Transport_volumes.h"
#include "VehicleTransp.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Transport
    : public ModelBase
{
public:
    Transport();
    virtual ~Transport();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Transport members

    /// <summary>
    /// Freight model  - 0 - CIF,  - 1 - FOB,  - 2 - Thrid party, - 9 - Free shipping when 9 - Free shipping, the fields below will be ignored if present - &#39;transporter&#39; - &#39;withholdICMSTransport&#39; - &#39;volumes&#39; - &#39;vehicle&#39; 
    /// </summary>
    utility::string_t getModFreight() const;
    void setModFreight(utility::string_t value);
        /// <summary>
    /// Forces witholding of ICMS on transport amount (freight)
    /// </summary>
    bool getWithholdICMSTransport() const;
    void setWithholdICMSTransport(bool value);
    bool withholdICMSTransportIsSet() const;
    void unsetWithholdICMSTransport();
    /// <summary>
    /// Packages
    /// </summary>
    std::vector<std::shared_ptr<Transport_volumes>>& getVolumes();
    bool volumesIsSet() const;
    void unsetVolumes();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<VehicleTransp> getVehicle() const;
    void setVehicle(std::shared_ptr<VehicleTransp> value);
    bool vehicleIsSet() const;
    void unsetVehicle();

protected:
    utility::string_t m_ModFreight;
    bool m_WithholdICMSTransport;
    bool m_WithholdICMSTransportIsSet;
std::vector<std::shared_ptr<Transport_volumes>> m_Volumes;
    bool m_VolumesIsSet;
std::shared_ptr<VehicleTransp> m_Vehicle;
    bool m_VehicleIsSet;
};

}
}
}
}

#endif /* Transport_H_ */