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
 * LineForGoods_export.h
 *
 * 
 */

#ifndef LineForGoods_export_H_
#define LineForGoods_export_H_


#include "ModelBase.h"

#include "LineForGoods_indExport.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace model {

/// <summary>
/// 
/// </summary>
class  LineForGoods_export
    : public ModelBase
{
public:
    LineForGoods_export();
    virtual ~LineForGoods_export();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// LineForGoods_export members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getDrawbackNumber() const;
    void setDrawbackNumber(utility::string_t value);
    bool drawbackNumberIsSet() const;
    void unsetDrawbackNumber();
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<LineForGoods_indExport> getIndExport() const;
    void setIndExport(std::shared_ptr<LineForGoods_indExport> value);
    bool indExportIsSet() const;
    void unsetIndExport();

protected:
    utility::string_t m_DrawbackNumber;
    bool m_DrawbackNumberIsSet;
std::shared_ptr<LineForGoods_indExport> m_IndExport;
    bool m_IndExportIsSet;
};

}
}
}
}

#endif /* LineForGoods_export_H_ */
