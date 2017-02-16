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
 * SefazInvoiceStatus.h
 *
 * 
 */

#ifndef SefazInvoiceStatus_H_
#define SefazInvoiceStatus_H_


#include "ModelBase.h"

#include "SefazInvoiceBasicStatus.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  SefazInvoiceStatus
    : public ModelBase
{
public:
    SefazInvoiceStatus();
    virtual ~SefazInvoiceStatus();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SefazInvoiceStatus members

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
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getProtocol() const;
    void setProtocol(utility::string_t value);
    bool protocolIsSet() const;
    void unsetProtocol();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getRec() const;
    void setRec(utility::string_t value);
    bool recIsSet() const;
    void unsetRec();
    /// <summary>
    /// 
    /// </summary>
    utility::datetime getDate() const;
    void setDate(utility::datetime value);
    bool dateIsSet() const;
    void unsetdate();
    /// <summary>
    /// - &#39;1&#39; # Ambiente de Produção - &#39;2&#39; # Ambiente de Homologação 
    /// </summary>
    utility::string_t getEnvironment() const;
    void setEnvironment(utility::string_t value);
    bool environmentIsSet() const;
    void unsetEnvironment();
    /// <summary>
    /// 
    /// </summary>
    utility::string_t getAppVersion() const;
    void setAppVersion(utility::string_t value);
    bool appVersionIsSet() const;
    void unsetAppVersion();

protected:
    utility::string_t m_Code;
    bool m_CodeIsSet;
utility::string_t m_Desc;
    bool m_DescIsSet;
utility::string_t m_Protocol;
    bool m_ProtocolIsSet;
utility::string_t m_Rec;
    bool m_RecIsSet;
utility::datetime m_date;
    bool m_dateIsSet;
utility::string_t m_Environment;
    bool m_EnvironmentIsSet;
utility::string_t m_AppVersion;
    bool m_AppVersionIsSet;
};

}
}
}
}

#endif /* SefazInvoiceStatus_H_ */
