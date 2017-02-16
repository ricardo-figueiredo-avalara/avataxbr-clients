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
 * TransactionForSefazGoodsList.h
 *
 * 
 */

#ifndef TransactionForSefazGoodsList_H_
#define TransactionForSefazGoodsList_H_


#include "ModelBase.h"

#include "TransactionForSefazGoods.h"
#include <vector>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  TransactionForSefazGoodsList
    : public ModelBase
{
public:
    TransactionForSefazGoodsList();
    virtual ~TransactionForSefazGoodsList();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// TransactionForSefazGoodsList members


protected:
    };

}
}
}
}

#endif /* TransactionForSefazGoodsList_H_ */
