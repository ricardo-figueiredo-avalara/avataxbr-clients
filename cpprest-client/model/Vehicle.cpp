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



#include "Vehicle.h"

namespace io {
namespace swagger {
namespace client {
namespace model {

Vehicle::Vehicle()
{
    m_TpOp = 0;
    m_ChassisNumber = U("");
    m_ColorCode = U("");
    m_ColorName = U("");
    m_CvPower = U("");
    m_CylinderVolumCC = U("");
    m_NetWeight = U("");
    m_GrossWeight = U("");
    m_SerialNumber = U("");
    m_FuelType = U("");
    m_EngineNumber = U("");
    m_Cmt = U("");
    m_LengthBetweenAxis = U("");
    m_ModelYear = U("");
    m_ManufactoryYear = U("");
    m_PaintType = U("");
    m_VehicleRENAVAMType = U("");
    m_SpecieRENAVAMType = U("");
    m_ModelRENAVAMCode = U("");
    m_ColorDENATRANCode = U("");
    m_Vin = U("");
    m_VehicleManufactoryStatus = U("");
    m_MaxOccupantsQuantity = U("");
    m_RestrictionType = U("");
    
}

Vehicle::~Vehicle()
{
}

void Vehicle::validate()
{
    // TODO: implement validation
}

web::json::value Vehicle::toJson() const
{
    web::json::value val = web::json::value::object();

    val[U("tpOp")] = ModelBase::toJson(m_TpOp);
    val[U("chassisNumber")] = ModelBase::toJson(m_ChassisNumber);
    val[U("colorCode")] = ModelBase::toJson(m_ColorCode);
    val[U("colorName")] = ModelBase::toJson(m_ColorName);
    val[U("cvPower")] = ModelBase::toJson(m_CvPower);
    val[U("cylinderVolumCC")] = ModelBase::toJson(m_CylinderVolumCC);
    val[U("netWeight")] = ModelBase::toJson(m_NetWeight);
    val[U("grossWeight")] = ModelBase::toJson(m_GrossWeight);
    val[U("serialNumber")] = ModelBase::toJson(m_SerialNumber);
    val[U("fuelType")] = ModelBase::toJson(m_FuelType);
    val[U("engineNumber")] = ModelBase::toJson(m_EngineNumber);
    val[U("cmt")] = ModelBase::toJson(m_Cmt);
    val[U("lengthBetweenAxis")] = ModelBase::toJson(m_LengthBetweenAxis);
    val[U("modelYear")] = ModelBase::toJson(m_ModelYear);
    val[U("manufactoryYear")] = ModelBase::toJson(m_ManufactoryYear);
    val[U("paintType")] = ModelBase::toJson(m_PaintType);
    val[U("vehicleRENAVAMType")] = ModelBase::toJson(m_VehicleRENAVAMType);
    val[U("specieRENAVAMType")] = ModelBase::toJson(m_SpecieRENAVAMType);
    val[U("modelRENAVAMCode")] = ModelBase::toJson(m_ModelRENAVAMCode);
    val[U("colorDENATRANCode")] = ModelBase::toJson(m_ColorDENATRANCode);
    val[U("vin")] = ModelBase::toJson(m_Vin);
    val[U("vehicleManufactoryStatus")] = ModelBase::toJson(m_VehicleManufactoryStatus);
    val[U("maxOccupantsQuantity")] = ModelBase::toJson(m_MaxOccupantsQuantity);
    val[U("restrictionType")] = ModelBase::toJson(m_RestrictionType);
    

    return val;
}

void Vehicle::fromJson(web::json::value& val)
{
    setTpOp(ModelBase::int32_tFromJson(val[U("tpOp")]));
    setChassisNumber(ModelBase::stringFromJson(val[U("chassisNumber")]));
    setColorCode(ModelBase::stringFromJson(val[U("colorCode")]));
    setColorName(ModelBase::stringFromJson(val[U("colorName")]));
    setCvPower(ModelBase::stringFromJson(val[U("cvPower")]));
    setCylinderVolumCC(ModelBase::stringFromJson(val[U("cylinderVolumCC")]));
    setNetWeight(ModelBase::stringFromJson(val[U("netWeight")]));
    setGrossWeight(ModelBase::stringFromJson(val[U("grossWeight")]));
    setSerialNumber(ModelBase::stringFromJson(val[U("serialNumber")]));
    setFuelType(ModelBase::stringFromJson(val[U("fuelType")]));
    setEngineNumber(ModelBase::stringFromJson(val[U("engineNumber")]));
    setCmt(ModelBase::stringFromJson(val[U("cmt")]));
    setLengthBetweenAxis(ModelBase::stringFromJson(val[U("lengthBetweenAxis")]));
    setModelYear(ModelBase::stringFromJson(val[U("modelYear")]));
    setManufactoryYear(ModelBase::stringFromJson(val[U("manufactoryYear")]));
    setPaintType(ModelBase::stringFromJson(val[U("paintType")]));
    setVehicleRENAVAMType(ModelBase::stringFromJson(val[U("vehicleRENAVAMType")]));
    setSpecieRENAVAMType(ModelBase::stringFromJson(val[U("specieRENAVAMType")]));
    setModelRENAVAMCode(ModelBase::stringFromJson(val[U("modelRENAVAMCode")]));
    setColorDENATRANCode(ModelBase::stringFromJson(val[U("colorDENATRANCode")]));
    setVin(ModelBase::stringFromJson(val[U("vin")]));
    setVehicleManufactoryStatus(ModelBase::stringFromJson(val[U("vehicleManufactoryStatus")]));
    setMaxOccupantsQuantity(ModelBase::stringFromJson(val[U("maxOccupantsQuantity")]));
    setRestrictionType(ModelBase::stringFromJson(val[U("restrictionType")]));
    
}

void Vehicle::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + U("tpOp"), m_TpOp));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("chassisNumber"), m_ChassisNumber));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("colorCode"), m_ColorCode));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("colorName"), m_ColorName));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("cvPower"), m_CvPower));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("cylinderVolumCC"), m_CylinderVolumCC));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("netWeight"), m_NetWeight));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("grossWeight"), m_GrossWeight));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("serialNumber"), m_SerialNumber));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("fuelType"), m_FuelType));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("engineNumber"), m_EngineNumber));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("cmt"), m_Cmt));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("lengthBetweenAxis"), m_LengthBetweenAxis));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("modelYear"), m_ModelYear));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("manufactoryYear"), m_ManufactoryYear));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("paintType"), m_PaintType));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("vehicleRENAVAMType"), m_VehicleRENAVAMType));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("specieRENAVAMType"), m_SpecieRENAVAMType));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("modelRENAVAMCode"), m_ModelRENAVAMCode));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("colorDENATRANCode"), m_ColorDENATRANCode));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("vin"), m_Vin));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("vehicleManufactoryStatus"), m_VehicleManufactoryStatus));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("maxOccupantsQuantity"), m_MaxOccupantsQuantity));
    multipart->add(ModelBase::toHttpContent(namePrefix + U("restrictionType"), m_RestrictionType));
    
}

void Vehicle::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix[namePrefix.size() - 1] != U('.'))
    {
        namePrefix += U(".");
    }

    setTpOp(ModelBase::int32_tFromHttpContent(multipart->getContent(U("tpOp"))));
    setChassisNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("chassisNumber"))));
    setColorCode(ModelBase::stringFromHttpContent(multipart->getContent(U("colorCode"))));
    setColorName(ModelBase::stringFromHttpContent(multipart->getContent(U("colorName"))));
    setCvPower(ModelBase::stringFromHttpContent(multipart->getContent(U("cvPower"))));
    setCylinderVolumCC(ModelBase::stringFromHttpContent(multipart->getContent(U("cylinderVolumCC"))));
    setNetWeight(ModelBase::stringFromHttpContent(multipart->getContent(U("netWeight"))));
    setGrossWeight(ModelBase::stringFromHttpContent(multipart->getContent(U("grossWeight"))));
    setSerialNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("serialNumber"))));
    setFuelType(ModelBase::stringFromHttpContent(multipart->getContent(U("fuelType"))));
    setEngineNumber(ModelBase::stringFromHttpContent(multipart->getContent(U("engineNumber"))));
    setCmt(ModelBase::stringFromHttpContent(multipart->getContent(U("cmt"))));
    setLengthBetweenAxis(ModelBase::stringFromHttpContent(multipart->getContent(U("lengthBetweenAxis"))));
    setModelYear(ModelBase::stringFromHttpContent(multipart->getContent(U("modelYear"))));
    setManufactoryYear(ModelBase::stringFromHttpContent(multipart->getContent(U("manufactoryYear"))));
    setPaintType(ModelBase::stringFromHttpContent(multipart->getContent(U("paintType"))));
    setVehicleRENAVAMType(ModelBase::stringFromHttpContent(multipart->getContent(U("vehicleRENAVAMType"))));
    setSpecieRENAVAMType(ModelBase::stringFromHttpContent(multipart->getContent(U("specieRENAVAMType"))));
    setModelRENAVAMCode(ModelBase::stringFromHttpContent(multipart->getContent(U("modelRENAVAMCode"))));
    setColorDENATRANCode(ModelBase::stringFromHttpContent(multipart->getContent(U("colorDENATRANCode"))));
    setVin(ModelBase::stringFromHttpContent(multipart->getContent(U("vin"))));
    setVehicleManufactoryStatus(ModelBase::stringFromHttpContent(multipart->getContent(U("vehicleManufactoryStatus"))));
    setMaxOccupantsQuantity(ModelBase::stringFromHttpContent(multipart->getContent(U("maxOccupantsQuantity"))));
    setRestrictionType(ModelBase::stringFromHttpContent(multipart->getContent(U("restrictionType"))));
    
}


int32_t Vehicle::getTpOp() const
{
    return m_TpOp;
}
void Vehicle::setTpOp(int32_t value)
{
    m_TpOp = value;
    
}
utility::string_t Vehicle::getChassisNumber() const
{
    return m_ChassisNumber;
}
void Vehicle::setChassisNumber(utility::string_t value)
{
    m_ChassisNumber = value;
    
}
utility::string_t Vehicle::getColorCode() const
{
    return m_ColorCode;
}
void Vehicle::setColorCode(utility::string_t value)
{
    m_ColorCode = value;
    
}
utility::string_t Vehicle::getColorName() const
{
    return m_ColorName;
}
void Vehicle::setColorName(utility::string_t value)
{
    m_ColorName = value;
    
}
utility::string_t Vehicle::getCvPower() const
{
    return m_CvPower;
}
void Vehicle::setCvPower(utility::string_t value)
{
    m_CvPower = value;
    
}
utility::string_t Vehicle::getCylinderVolumCC() const
{
    return m_CylinderVolumCC;
}
void Vehicle::setCylinderVolumCC(utility::string_t value)
{
    m_CylinderVolumCC = value;
    
}
utility::string_t Vehicle::getNetWeight() const
{
    return m_NetWeight;
}
void Vehicle::setNetWeight(utility::string_t value)
{
    m_NetWeight = value;
    
}
utility::string_t Vehicle::getGrossWeight() const
{
    return m_GrossWeight;
}
void Vehicle::setGrossWeight(utility::string_t value)
{
    m_GrossWeight = value;
    
}
utility::string_t Vehicle::getSerialNumber() const
{
    return m_SerialNumber;
}
void Vehicle::setSerialNumber(utility::string_t value)
{
    m_SerialNumber = value;
    
}
utility::string_t Vehicle::getFuelType() const
{
    return m_FuelType;
}
void Vehicle::setFuelType(utility::string_t value)
{
    m_FuelType = value;
    
}
utility::string_t Vehicle::getEngineNumber() const
{
    return m_EngineNumber;
}
void Vehicle::setEngineNumber(utility::string_t value)
{
    m_EngineNumber = value;
    
}
utility::string_t Vehicle::getCmt() const
{
    return m_Cmt;
}
void Vehicle::setCmt(utility::string_t value)
{
    m_Cmt = value;
    
}
utility::string_t Vehicle::getLengthBetweenAxis() const
{
    return m_LengthBetweenAxis;
}
void Vehicle::setLengthBetweenAxis(utility::string_t value)
{
    m_LengthBetweenAxis = value;
    
}
utility::string_t Vehicle::getModelYear() const
{
    return m_ModelYear;
}
void Vehicle::setModelYear(utility::string_t value)
{
    m_ModelYear = value;
    
}
utility::string_t Vehicle::getManufactoryYear() const
{
    return m_ManufactoryYear;
}
void Vehicle::setManufactoryYear(utility::string_t value)
{
    m_ManufactoryYear = value;
    
}
utility::string_t Vehicle::getPaintType() const
{
    return m_PaintType;
}
void Vehicle::setPaintType(utility::string_t value)
{
    m_PaintType = value;
    
}
utility::string_t Vehicle::getVehicleRENAVAMType() const
{
    return m_VehicleRENAVAMType;
}
void Vehicle::setVehicleRENAVAMType(utility::string_t value)
{
    m_VehicleRENAVAMType = value;
    
}
utility::string_t Vehicle::getSpecieRENAVAMType() const
{
    return m_SpecieRENAVAMType;
}
void Vehicle::setSpecieRENAVAMType(utility::string_t value)
{
    m_SpecieRENAVAMType = value;
    
}
utility::string_t Vehicle::getModelRENAVAMCode() const
{
    return m_ModelRENAVAMCode;
}
void Vehicle::setModelRENAVAMCode(utility::string_t value)
{
    m_ModelRENAVAMCode = value;
    
}
utility::string_t Vehicle::getColorDENATRANCode() const
{
    return m_ColorDENATRANCode;
}
void Vehicle::setColorDENATRANCode(utility::string_t value)
{
    m_ColorDENATRANCode = value;
    
}
utility::string_t Vehicle::getVin() const
{
    return m_Vin;
}
void Vehicle::setVin(utility::string_t value)
{
    m_Vin = value;
    
}
utility::string_t Vehicle::getVehicleManufactoryStatus() const
{
    return m_VehicleManufactoryStatus;
}
void Vehicle::setVehicleManufactoryStatus(utility::string_t value)
{
    m_VehicleManufactoryStatus = value;
    
}
utility::string_t Vehicle::getMaxOccupantsQuantity() const
{
    return m_MaxOccupantsQuantity;
}
void Vehicle::setMaxOccupantsQuantity(utility::string_t value)
{
    m_MaxOccupantsQuantity = value;
    
}
utility::string_t Vehicle::getRestrictionType() const
{
    return m_RestrictionType;
}
void Vehicle::setRestrictionType(utility::string_t value)
{
    m_RestrictionType = value;
    
}

}
}
}
}

