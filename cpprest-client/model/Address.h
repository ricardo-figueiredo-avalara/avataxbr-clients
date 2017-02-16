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
 * Address.h
 *
 * 
 */

#ifndef Address_H_
#define Address_H_


#include "ModelBase.h"

#include "StateEnum.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  Address
    : public ModelBase
{
public:
    Address();
    virtual ~Address();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Address members

    /// <summary>
    /// Street Name
    /// </summary>
    utility::string_t getStreet() const;
    void setStreet(utility::string_t value);
    bool streetIsSet() const;
    void unsetStreet();
    /// <summary>
    /// Neighborhood Name
    /// </summary>
    utility::string_t getNeighborhood() const;
    void setNeighborhood(utility::string_t value);
    bool neighborhoodIsSet() const;
    void unsetNeighborhood();
    /// <summary>
    /// Brazilian Zip Code
    /// </summary>
    utility::string_t getZipcode() const;
    void setZipcode(utility::string_t value);
        /// <summary>
    /// City Code (IBGE)
    /// </summary>
    utility::string_t getCityCode() const;
    void setCityCode(utility::string_t value);
    bool cityCodeIsSet() const;
    void unsetCityCode();
    /// <summary>
    /// City Name
    /// </summary>
    utility::string_t getCityName() const;
    void setCityName(utility::string_t value);
    bool cityNameIsSet() const;
    void unsetCityName();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<StateEnum> getState() const;
    void setState(std::shared_ptr<StateEnum> value);
    bool stateIsSet() const;
    void unsetState();
    /// <summary>
    /// Country Code
    /// </summary>
    utility::string_t getCountryCode() const;
    void setCountryCode(utility::string_t value);
    bool countryCodeIsSet() const;
    void unsetCountryCode();
    /// <summary>
    /// Use ISO 3166-1 alpha-3 codes
    /// </summary>
    utility::string_t getCountry() const;
    void setCountry(utility::string_t value);
    bool countryIsSet() const;
    void unsetCountry();

protected:
    utility::string_t m_Street;
    bool m_StreetIsSet;
utility::string_t m_Neighborhood;
    bool m_NeighborhoodIsSet;
utility::string_t m_Zipcode;
    utility::string_t m_CityCode;
    bool m_CityCodeIsSet;
utility::string_t m_CityName;
    bool m_CityNameIsSet;
std::shared_ptr<StateEnum> m_State;
    bool m_StateIsSet;
utility::string_t m_CountryCode;
    bool m_CountryCodeIsSet;
utility::string_t m_Country;
    bool m_CountryIsSet;
};

}
}
}
}

#endif /* Address_H_ */
