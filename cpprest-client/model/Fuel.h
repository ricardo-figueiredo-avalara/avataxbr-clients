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
 * Fuel.h
 *
 * 
 */

#ifndef Fuel_H_
#define Fuel_H_


#include "ModelBase.h"

#include "StateEnum.h"
#include <cpprest/details/basic_types.h>
#include "Fuel_cide.h"
#include "Fuel_pumpNumber.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Fuel
    : public ModelBase
{
public:
    Fuel();
    virtual ~Fuel();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Fuel members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getProdANPCode() const;
    void setProdANPCode(utility::string_t value);
        /// <summary>
    /// percentage of natural gas (GLP)
    /// </summary>
    double getPerMixGN() const;
    void setPerMixGN(double value);
    bool perMixGNIsSet() const;
    void unsetPerMixGN();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getAuthorizationCodeCODIF() const;
    void setAuthorizationCodeCODIF(utility::string_t value);
    bool authorizationCodeCODIFIsSet() const;
    void unsetAuthorizationCodeCODIF();
    /// <summary>
    /// This decimal 12 integers and 0 to 4 decimals Quantidade de combustível faturada à temperatura ambiente. Informar quando a quantidade faturada informada no campo qCom (I10) tiver sido ajustada para uma temperatura diferente da ambiente. 
    /// </summary>
    double getQuantityOnRoomTemperature() const;
    void setQuantityOnRoomTemperature(double value);
    bool quantityOnRoomTemperatureIsSet() const;
    void unsetQuantityOnRoomTemperature();
    /// <summary>
    /// state where fuel was used
    /// </summary>
    std::shared_ptr<StateEnum> getStateCodeOfUndUser() const;
    void setStateCodeOfUndUser(std::shared_ptr<StateEnum> value);
        /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Fuel_cide> getCide() const;
    void setCide(std::shared_ptr<Fuel_cide> value);
    bool cideIsSet() const;
    void unsetCide();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<Fuel_pumpNumber> getPumpNumber() const;
    void setPumpNumber(std::shared_ptr<Fuel_pumpNumber> value);
    bool pumpNumberIsSet() const;
    void unsetPumpNumber();

protected:
    utility::string_t m_ProdANPCode;
    double m_PerMixGN;
    bool m_PerMixGNIsSet;
utility::string_t m_AuthorizationCodeCODIF;
    bool m_AuthorizationCodeCODIFIsSet;
double m_QuantityOnRoomTemperature;
    bool m_QuantityOnRoomTemperatureIsSet;
std::shared_ptr<StateEnum> m_StateCodeOfUndUser;
    std::shared_ptr<Fuel_cide> m_Cide;
    bool m_CideIsSet;
std::shared_ptr<Fuel_pumpNumber> m_PumpNumber;
    bool m_PumpNumberIsSet;
};

}
}
}
}

#endif /* Fuel_H_ */
