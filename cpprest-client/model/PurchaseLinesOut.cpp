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



#include "PurchaseLinesOut.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

PurchaseLinesOut::PurchaseLinesOut()
{
    m_LineCode = 0;
    m_LineCodeIsSet = false;
    m_ItemCode = U("");
    m_NumberOfItems = 0.0;
    m_NumberOfItemsIsSet = false;
    m_LineAmount = 0.0;
    m_LineAmountIsSet = false;
    m_ItemDescription = U("");
    m_ItemDescriptionIsSet = false;
    m_LineTaxedDiscount = 0.0;
    m_LineTaxedDiscountIsSet = false;
    m_LineUntaxedDiscount = 0.0;
    m_LineUntaxedDiscountIsSet = false;
    m_UseType = U("");
    m_UseTypeIsSet = false;
    m_TaxDeductionsIsSet = false;
    m_AvalaraGoodsAndServicesType = U("");
    m_AvalaraGoodsAndServicesTypeIsSet = false;
    m_LineNetValue = 0.0;
    m_LineNetValueIsSet = false;
    m_CalculatedTaxIsSet = false;
    
}

PurchaseLinesOut::~PurchaseLinesOut()
{
}

void PurchaseLinesOut::validate()
{
    // TODO: implement validation
}

web::json::value PurchaseLinesOut::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_LineCodeIsSet)
    {
        val[U("lineCode")] = ModelBase::toJson(m_LineCode);
    }
    val[U("itemCode")] = ModelBase::toJson(m_ItemCode);
    if(m_NumberOfItemsIsSet)
    {
        val[U("numberOfItems")] = ModelBase::toJson(m_NumberOfItems);
    }
    if(m_LineAmountIsSet)
    {
        val[U("lineAmount")] = ModelBase::toJson(m_LineAmount);
    }
    if(m_ItemDescriptionIsSet)
    {
        val[U("itemDescription")] = ModelBase::toJson(m_ItemDescription);
    }
    if(m_LineTaxedDiscountIsSet)
    {
        val[U("lineTaxedDiscount")] = ModelBase::toJson(m_LineTaxedDiscount);
    }
    if(m_LineUntaxedDiscountIsSet)
    {
        val[U("lineUntaxedDiscount")] = ModelBase::toJson(m_LineUntaxedDiscount);
    }
    if(m_UseTypeIsSet)
    {
        val[U("useType")] = ModelBase::toJson(m_UseType);
    }
    if(m_TaxDeductionsIsSet)
    {
        val[U("taxDeductions")] = ModelBase::toJson(m_TaxDeductions);
    }
    if(m_AvalaraGoodsAndServicesTypeIsSet)
    {
        val[U("avalaraGoodsAndServicesType")] = ModelBase::toJson(m_AvalaraGoodsAndServicesType);
    }
    if(m_LineNetValueIsSet)
    {
        val[U("lineNetValue")] = ModelBase::toJson(m_LineNetValue);
    }
    if(m_CalculatedTaxIsSet)
    {
        val[U("calculatedTax")] = ModelBase::toJson(m_CalculatedTax);
    }
    

    return val;
}

void PurchaseLinesOut::fromJson(web::json::value& val)
{
    if(val.has_field(U("lineCode")))
    {
        setLineCode(ModelBase::int32_tFromJson(val[U("lineCode")]));
    }
    setItemCode(ModelBase::stringFromJson(val[U("itemCode")]));
    if(val.has_field(U("numberOfItems")))
    {
        setNumberOfItems(ModelBase::doubleFromJson(val[U("numberOfItems")]));
    }
    if(val.has_field(U("lineAmount")))
    {
        setLineAmount(ModelBase::doubleFromJson(val[U("lineAmount")]));
    }
    if(val.has_field(U("itemDescription")))
    {
        setItemDescription(ModelBase::stringFromJson(val[U("itemDescription")]));
        
    }
    if(val.has_field(U("lineTaxedDiscount")))
    {
        setLineTaxedDiscount(ModelBase::doubleFromJson(val[U("lineTaxedDiscount")]));
    }
    if(val.has_field(U("lineUntaxedDiscount")))
    {
        setLineUntaxedDiscount(ModelBase::doubleFromJson(val[U("lineUntaxedDiscount")]));
    }
    if(val.has_field(U("useType")))
    {
        setUseType(ModelBase::stringFromJson(val[U("useType")]));
        
    }
    if(val.has_field(U("taxDeductions")))
    {
        if(!val[U("taxDeductions")].is_null())
        {
            std::shared_ptr<SalesLinesOut_taxDeductions> newItem(new SalesLinesOut_taxDeductions());
            newItem->fromJson(val[U("taxDeductions")]);
            setTaxDeductions( newItem );
        }
        
    }
    if(val.has_field(U("avalaraGoodsAndServicesType")))
    {
        setAvalaraGoodsAndServicesType(ModelBase::stringFromJson(val[U("avalaraGoodsAndServicesType")]));
        
    }
    if(val.has_field(U("lineNetValue")))
    {
        setLineNetValue(ModelBase::doubleFromJson(val[U("lineNetValue")]));
    }
    if(val.has_field(U("calculatedTax")))
    {
        if(!val[U("calculatedTax")].is_null())
        {
            std::shared_ptr<PurchaseCalculatedTax> newItem(new PurchaseCalculatedTax());
            newItem->fromJson(val[U("calculatedTax")]);
            setCalculatedTax( newItem );
        }
        
    }
    
}

void PurchaseLinesOut::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(m_LineCodeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lineCode"), m_LineCode));
    }
    multipart->add(ModelBase::toHttpContent(namePrefix + U("itemCode"), m_ItemCode));
    if(m_NumberOfItemsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("numberOfItems"), m_NumberOfItems));
    }
    if(m_LineAmountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lineAmount"), m_LineAmount));
    }
    if(m_ItemDescriptionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("itemDescription"), m_ItemDescription));
        
    }
    if(m_LineTaxedDiscountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lineTaxedDiscount"), m_LineTaxedDiscount));
    }
    if(m_LineUntaxedDiscountIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lineUntaxedDiscount"), m_LineUntaxedDiscount));
    }
    if(m_UseTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("useType"), m_UseType));
        
    }
    if(m_TaxDeductionsIsSet)
    {
        if (m_TaxDeductions.get())
        {
            m_TaxDeductions->toMultipart(multipart, U("taxDeductions."));
        }
        
    }
    if(m_AvalaraGoodsAndServicesTypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("avalaraGoodsAndServicesType"), m_AvalaraGoodsAndServicesType));
        
    }
    if(m_LineNetValueIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + U("lineNetValue"), m_LineNetValue));
    }
    if(m_CalculatedTaxIsSet)
    {
        if (m_CalculatedTax.get())
        {
            m_CalculatedTax->toMultipart(multipart, U("calculatedTax."));
        }
        
    }
    
}

void PurchaseLinesOut::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    if(multipart->hasContent(U("lineCode")))
    {
        setLineCode(ModelBase::int32_tFromHttpContent(multipart->getContent(U("lineCode"))));
    }
    setItemCode(ModelBase::stringFromHttpContent(multipart->getContent(U("itemCode"))));
    if(multipart->hasContent(U("numberOfItems")))
    {
        setNumberOfItems(ModelBase::doubleFromHttpContent(multipart->getContent(U("numberOfItems"))));
    }
    if(multipart->hasContent(U("lineAmount")))
    {
        setLineAmount(ModelBase::doubleFromHttpContent(multipart->getContent(U("lineAmount"))));
    }
    if(multipart->hasContent(U("itemDescription")))
    {
        setItemDescription(ModelBase::stringFromHttpContent(multipart->getContent(U("itemDescription"))));
        
    }
    if(multipart->hasContent(U("lineTaxedDiscount")))
    {
        setLineTaxedDiscount(ModelBase::doubleFromHttpContent(multipart->getContent(U("lineTaxedDiscount"))));
    }
    if(multipart->hasContent(U("lineUntaxedDiscount")))
    {
        setLineUntaxedDiscount(ModelBase::doubleFromHttpContent(multipart->getContent(U("lineUntaxedDiscount"))));
    }
    if(multipart->hasContent(U("useType")))
    {
        setUseType(ModelBase::stringFromHttpContent(multipart->getContent(U("useType"))));
        
    }
    if(multipart->hasContent(U("taxDeductions")))
    {
        if(multipart->hasContent(U("taxDeductions")))
        {
            std::shared_ptr<SalesLinesOut_taxDeductions> newItem(new SalesLinesOut_taxDeductions());
            newItem->fromMultiPart(multipart, U("taxDeductions."));
            setTaxDeductions( newItem );
        }
        
    }
    if(multipart->hasContent(U("avalaraGoodsAndServicesType")))
    {
        setAvalaraGoodsAndServicesType(ModelBase::stringFromHttpContent(multipart->getContent(U("avalaraGoodsAndServicesType"))));
        
    }
    if(multipart->hasContent(U("lineNetValue")))
    {
        setLineNetValue(ModelBase::doubleFromHttpContent(multipart->getContent(U("lineNetValue"))));
    }
    if(multipart->hasContent(U("calculatedTax")))
    {
        if(multipart->hasContent(U("calculatedTax")))
        {
            std::shared_ptr<PurchaseCalculatedTax> newItem(new PurchaseCalculatedTax());
            newItem->fromMultiPart(multipart, U("calculatedTax."));
            setCalculatedTax( newItem );
        }
        
    }
    
}


int32_t PurchaseLinesOut::getLineCode() const
{
    return m_LineCode;
}
void PurchaseLinesOut::setLineCode(int32_t value)
{
    m_LineCode = value;
    m_LineCodeIsSet = true;
}
bool PurchaseLinesOut::lineCodeIsSet() const
{
    return m_LineCodeIsSet;
}
void PurchaseLinesOut::unsetLineCode()
{
    m_LineCodeIsSet = false;
}
utility::string_t PurchaseLinesOut::getItemCode() const
{
    return m_ItemCode;
}
void PurchaseLinesOut::setItemCode(utility::string_t value)
{
    m_ItemCode = value;
    
}
double PurchaseLinesOut::getNumberOfItems() const
{
    return m_NumberOfItems;
}
void PurchaseLinesOut::setNumberOfItems(double value)
{
    m_NumberOfItems = value;
    m_NumberOfItemsIsSet = true;
}
bool PurchaseLinesOut::numberOfItemsIsSet() const
{
    return m_NumberOfItemsIsSet;
}
void PurchaseLinesOut::unsetNumberOfItems()
{
    m_NumberOfItemsIsSet = false;
}
double PurchaseLinesOut::getLineAmount() const
{
    return m_LineAmount;
}
void PurchaseLinesOut::setLineAmount(double value)
{
    m_LineAmount = value;
    m_LineAmountIsSet = true;
}
bool PurchaseLinesOut::lineAmountIsSet() const
{
    return m_LineAmountIsSet;
}
void PurchaseLinesOut::unsetLineAmount()
{
    m_LineAmountIsSet = false;
}
utility::string_t PurchaseLinesOut::getItemDescription() const
{
    return m_ItemDescription;
}
void PurchaseLinesOut::setItemDescription(utility::string_t value)
{
    m_ItemDescription = value;
    m_ItemDescriptionIsSet = true;
}
bool PurchaseLinesOut::itemDescriptionIsSet() const
{
    return m_ItemDescriptionIsSet;
}
void PurchaseLinesOut::unsetItemDescription()
{
    m_ItemDescriptionIsSet = false;
}
double PurchaseLinesOut::getLineTaxedDiscount() const
{
    return m_LineTaxedDiscount;
}
void PurchaseLinesOut::setLineTaxedDiscount(double value)
{
    m_LineTaxedDiscount = value;
    m_LineTaxedDiscountIsSet = true;
}
bool PurchaseLinesOut::lineTaxedDiscountIsSet() const
{
    return m_LineTaxedDiscountIsSet;
}
void PurchaseLinesOut::unsetLineTaxedDiscount()
{
    m_LineTaxedDiscountIsSet = false;
}
double PurchaseLinesOut::getLineUntaxedDiscount() const
{
    return m_LineUntaxedDiscount;
}
void PurchaseLinesOut::setLineUntaxedDiscount(double value)
{
    m_LineUntaxedDiscount = value;
    m_LineUntaxedDiscountIsSet = true;
}
bool PurchaseLinesOut::lineUntaxedDiscountIsSet() const
{
    return m_LineUntaxedDiscountIsSet;
}
void PurchaseLinesOut::unsetLineUntaxedDiscount()
{
    m_LineUntaxedDiscountIsSet = false;
}
utility::string_t PurchaseLinesOut::getUseType() const
{
    return m_UseType;
}
void PurchaseLinesOut::setUseType(utility::string_t value)
{
    m_UseType = value;
    m_UseTypeIsSet = true;
}
bool PurchaseLinesOut::useTypeIsSet() const
{
    return m_UseTypeIsSet;
}
void PurchaseLinesOut::unsetUseType()
{
    m_UseTypeIsSet = false;
}
std::shared_ptr<SalesLinesOut_taxDeductions> PurchaseLinesOut::getTaxDeductions() const
{
    return m_TaxDeductions;
}
void PurchaseLinesOut::setTaxDeductions(std::shared_ptr<SalesLinesOut_taxDeductions> value)
{
    m_TaxDeductions = value;
    m_TaxDeductionsIsSet = true;
}
bool PurchaseLinesOut::taxDeductionsIsSet() const
{
    return m_TaxDeductionsIsSet;
}
void PurchaseLinesOut::unsetTaxDeductions()
{
    m_TaxDeductionsIsSet = false;
}
utility::string_t PurchaseLinesOut::getAvalaraGoodsAndServicesType() const
{
    return m_AvalaraGoodsAndServicesType;
}
void PurchaseLinesOut::setAvalaraGoodsAndServicesType(utility::string_t value)
{
    m_AvalaraGoodsAndServicesType = value;
    m_AvalaraGoodsAndServicesTypeIsSet = true;
}
bool PurchaseLinesOut::avalaraGoodsAndServicesTypeIsSet() const
{
    return m_AvalaraGoodsAndServicesTypeIsSet;
}
void PurchaseLinesOut::unsetAvalaraGoodsAndServicesType()
{
    m_AvalaraGoodsAndServicesTypeIsSet = false;
}
double PurchaseLinesOut::getLineNetValue() const
{
    return m_LineNetValue;
}
void PurchaseLinesOut::setLineNetValue(double value)
{
    m_LineNetValue = value;
    m_LineNetValueIsSet = true;
}
bool PurchaseLinesOut::lineNetValueIsSet() const
{
    return m_LineNetValueIsSet;
}
void PurchaseLinesOut::unsetLineNetValue()
{
    m_LineNetValueIsSet = false;
}
std::shared_ptr<PurchaseCalculatedTax> PurchaseLinesOut::getCalculatedTax() const
{
    return m_CalculatedTax;
}
void PurchaseLinesOut::setCalculatedTax(std::shared_ptr<PurchaseCalculatedTax> value)
{
    m_CalculatedTax = value;
    m_CalculatedTaxIsSet = true;
}
bool PurchaseLinesOut::calculatedTaxIsSet() const
{
    return m_CalculatedTaxIsSet;
}
void PurchaseLinesOut::unsetCalculatedTax()
{
    m_CalculatedTaxIsSet = false;
}

}
}
}
}

