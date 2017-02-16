package io.swagger.model;

import io.swagger.model.Address;
import io.swagger.model.LocationSecondaryStateTaxId;
import io.swagger.model.StateEnum;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Location  {
  
  @ApiModelProperty(example = "null", value = "Street Name")
  private String street = null;
  @ApiModelProperty(example = "null", value = "Neighborhood Name")
  private String neighborhood = null;
  @ApiModelProperty(example = "null", required = true, value = "Brazilian Zip Code")
  private String zipcode = null;
  @ApiModelProperty(example = "null", value = "City Code (IBGE)")
  private String cityCode = null;
  @ApiModelProperty(example = "null", value = "City Name")
  private String cityName = null;
  @ApiModelProperty(example = "null", value = "")
  private StateEnum state = null;
  @ApiModelProperty(example = "null", value = "Country Code")
  private String countryCode = "0";
  @ApiModelProperty(example = "null", value = "Use ISO 3166-1 alpha-3 codes")
  private String country = "BRA";
  @ApiModelProperty(example = "null", value = "House number")
  private String number = null;
  @ApiModelProperty(example = "null", value = "Any other information about the address (Room, Suite, Floor, etc)).")
  private String complement = null;
  @ApiModelProperty(example = "null", value = "Phone number")
  private String phone = null;
  @ApiModelProperty(example = "null", required = true, value = "Company ID")
  private String companyId = null;
  @ApiModelProperty(example = "null", required = true, value = "this property identify the location, it is unique for this company")
  private String code = null;

@XmlType(name="TypeEnum")
@XmlEnum(String.class)
public enum TypeEnum {

    @XmlEnumValue("ShipFrom") SHIPFROM(String.valueOf("ShipFrom")), @XmlEnumValue("ShipTo") SHIPTO(String.valueOf("ShipTo")), @XmlEnumValue("ServiceRendered") SERVICERENDERED(String.valueOf("ServiceRendered"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String v) {
        for (TypeEnum b : TypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "this property identify the location, it is unique for this company")
  private TypeEnum type = null;
  @ApiModelProperty(example = "null", value = "Email")
  private String email = null;
  @ApiModelProperty(example = "null", value = "Federal tax id, CNPJ or CPF")
  private String federalTaxId = null;
  @ApiModelProperty(example = "null", value = "state tax id for this location")
  private String stateTaxId = null;
  @ApiModelProperty(example = "null", value = "")
  private List<LocationSecondaryStateTaxId> secondaryStateTaxId = new ArrayList<LocationSecondaryStateTaxId>();
  @ApiModelProperty(example = "null", value = "City Tax ID")
  private String cityTaxId = null;
  @ApiModelProperty(example = "null", value = "")
  private String suframa = null;

@XmlType(name="MainActivityEnum")
@XmlEnum(String.class)
public enum MainActivityEnum {

    @XmlEnumValue("commerce") COMMERCE(String.valueOf("commerce")), @XmlEnumValue("industry") INDUSTRY(String.valueOf("industry")), @XmlEnumValue("service") SERVICE(String.valueOf("service"));


    private String value;

    MainActivityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MainActivityEnum fromValue(String v) {
        for (MainActivityEnum b : MainActivityEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "Main location activity")
  private MainActivityEnum mainActivity = null;

@XmlType(name="NfseProcessModelEnum")
@XmlEnum(String.class)
public enum NfseProcessModelEnum {

    @XmlEnumValue("edi") EDI(String.valueOf("edi")), @XmlEnumValue("xml") XML(String.valueOf("xml")), @XmlEnumValue("rps") RPS(String.valueOf("rps"));


    private String value;

    NfseProcessModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static NfseProcessModelEnum fromValue(String v) {
        for (NfseProcessModelEnum b : NfseProcessModelEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "- 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands ")
  private NfseProcessModelEnum nfseProcessModel = null;

 /**
   * Street Name
   * @return street
  **/
  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = street;
  }
 /**
   * Neighborhood Name
   * @return neighborhood
  **/
  public String getNeighborhood() {
    return neighborhood;
  }
  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }
 /**
   * Brazilian Zip Code
   * @return zipcode
  **/
  public String getZipcode() {
    return zipcode;
  }
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
 /**
   * City Code (IBGE)
   * @return cityCode
  **/
  public String getCityCode() {
    return cityCode;
  }
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }
 /**
   * City Name
   * @return cityName
  **/
  public String getCityName() {
    return cityName;
  }
  public void setCityName(String cityName) {
    this.cityName = cityName;
  }
 /**
   * Get state
   * @return state
  **/
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }
 /**
   * Country Code
   * @return countryCode
  **/
  public String getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }
 /**
   * Use ISO 3166-1 alpha-3 codes
   * @return country
  **/
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }
 /**
   * House number
   * @return number
  **/
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }
 /**
   * Any other information about the address (Room, Suite, Floor, etc)).
   * @return complement
  **/
  public String getComplement() {
    return complement;
  }
  public void setComplement(String complement) {
    this.complement = complement;
  }
 /**
   * Phone number
   * @return phone
  **/
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }
 /**
   * Company ID
   * @return companyId
  **/
  public String getCompanyId() {
    return companyId;
  }
  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }
 /**
   * this property identify the location, it is unique for this company
   * @return code
  **/
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
 /**
   * this property identify the location, it is unique for this company
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }
 /**
   * Email
   * @return email
  **/
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
 /**
   * Federal tax id, CNPJ or CPF
   * @return federalTaxId
  **/
  public String getFederalTaxId() {
    return federalTaxId;
  }
  public void setFederalTaxId(String federalTaxId) {
    this.federalTaxId = federalTaxId;
  }
 /**
   * state tax id for this location
   * @return stateTaxId
  **/
  public String getStateTaxId() {
    return stateTaxId;
  }
  public void setStateTaxId(String stateTaxId) {
    this.stateTaxId = stateTaxId;
  }
 /**
   * Get secondaryStateTaxId
   * @return secondaryStateTaxId
  **/
  public List<LocationSecondaryStateTaxId> getSecondaryStateTaxId() {
    return secondaryStateTaxId;
  }
  public void setSecondaryStateTaxId(List<LocationSecondaryStateTaxId> secondaryStateTaxId) {
    this.secondaryStateTaxId = secondaryStateTaxId;
  }
 /**
   * City Tax ID
   * @return cityTaxId
  **/
  public String getCityTaxId() {
    return cityTaxId;
  }
  public void setCityTaxId(String cityTaxId) {
    this.cityTaxId = cityTaxId;
  }
 /**
   * Get suframa
   * @return suframa
  **/
  public String getSuframa() {
    return suframa;
  }
  public void setSuframa(String suframa) {
    this.suframa = suframa;
  }
 /**
   * Main location activity
   * @return mainActivity
  **/
  public MainActivityEnum getMainActivity() {
    return mainActivity;
  }
  public void setMainActivity(MainActivityEnum mainActivity) {
    this.mainActivity = mainActivity;
  }
 /**
   * - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands 
   * @return nfseProcessModel
  **/
  public NfseProcessModelEnum getNfseProcessModel() {
    return nfseProcessModel;
  }
  public void setNfseProcessModel(NfseProcessModelEnum nfseProcessModel) {
    this.nfseProcessModel = nfseProcessModel;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    neighborhood: ").append(toIndentedString(neighborhood)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    complement: ").append(toIndentedString(complement)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    federalTaxId: ").append(toIndentedString(federalTaxId)).append("\n");
    sb.append("    stateTaxId: ").append(toIndentedString(stateTaxId)).append("\n");
    sb.append("    secondaryStateTaxId: ").append(toIndentedString(secondaryStateTaxId)).append("\n");
    sb.append("    cityTaxId: ").append(toIndentedString(cityTaxId)).append("\n");
    sb.append("    suframa: ").append(toIndentedString(suframa)).append("\n");
    sb.append("    mainActivity: ").append(toIndentedString(mainActivity)).append("\n");
    sb.append("    nfseProcessModel: ").append(toIndentedString(nfseProcessModel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

