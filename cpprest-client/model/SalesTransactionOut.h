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
 * SalesTransactionOut.h
 *
 * 
 */

#ifndef SalesTransactionOut_H_
#define SalesTransactionOut_H_


#include "ModelBase.h"

#include "SalesHeaderOut.h"
#include "SalesLinesOut.h"
#include <vector>
#include "ProcessingInfo.h"
#include "SalesCalculatedTaxSummaryForService.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  SalesTransactionOut
    : public ModelBase
{
public:
    SalesTransactionOut();
    virtual ~SalesTransactionOut();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SalesTransactionOut members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SalesHeaderOut> getHeader() const;
    void setHeader(std::shared_ptr<SalesHeaderOut> value);
        /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<SalesLinesOut>>& getLines();
        /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SalesCalculatedTaxSummaryForService> getCalculatedTaxSummary() const;
    void setCalculatedTaxSummary(std::shared_ptr<SalesCalculatedTaxSummaryForService> value);
        /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ProcessingInfo> getProcessingInfo() const;
    void setProcessingInfo(std::shared_ptr<ProcessingInfo> value);
    
protected:
    std::shared_ptr<SalesHeaderOut> m_Header;
    std::vector<std::shared_ptr<SalesLinesOut>> m_Lines;
    std::shared_ptr<SalesCalculatedTaxSummaryForService> m_CalculatedTaxSummary;
    std::shared_ptr<ProcessingInfo> m_ProcessingInfo;
    };

}
}
}
}

#endif /* SalesTransactionOut_H_ */