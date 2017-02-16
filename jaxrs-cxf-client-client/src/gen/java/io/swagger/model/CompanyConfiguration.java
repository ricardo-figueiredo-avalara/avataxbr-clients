package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class CompanyConfiguration  {
  
  @ApiModelProperty(example = "null", value = "digital certificate A1 model, p12, encoded by base64")
  private String certificate = null;
  @ApiModelProperty(example = "null", value = "certificate password")
  private String certificatepwd = null;
  @ApiModelProperty(example = "null", value = "expiration date of this certificate")
  private javax.xml.datatype.XMLGregorianCalendar certificateexpiration = null;
  @ApiModelProperty(example = "null", value = "company logo image encoded by base64")
  private String logo = null;

@XmlType(name="TpImpNFeEnum")
@XmlEnum(String.class)
public enum TpImpNFeEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2"));


    private String value;

    TpImpNFeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TpImpNFeEnum fromValue(String v) {
        for (TpImpNFeEnum b : TpImpNFeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; ")
  private TpImpNFeEnum tpImpNFe = null;

@XmlType(name="TpImpNFCeEnum")
@XmlEnum(String.class)
public enum TpImpNFCeEnum {

    @XmlEnumValue("0") _0(String.valueOf("0")), @XmlEnumValue("4") _4(String.valueOf("4")), @XmlEnumValue("5") _5(String.valueOf("5"));


    private String value;

    TpImpNFCeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TpImpNFCeEnum fromValue(String v) {
        for (TpImpNFCeEnum b : TpImpNFCeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail ")
  private TpImpNFCeEnum tpImpNFCe = null;

 /**
   * digital certificate A1 model, p12, encoded by base64
   * @return certificate
  **/
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }
 /**
   * certificate password
   * @return certificatepwd
  **/
  public String getCertificatepwd() {
    return certificatepwd;
  }
  public void setCertificatepwd(String certificatepwd) {
    this.certificatepwd = certificatepwd;
  }
 /**
   * expiration date of this certificate
   * @return certificateexpiration
  **/
  public javax.xml.datatype.XMLGregorianCalendar getCertificateexpiration() {
    return certificateexpiration;
  }
  public void setCertificateexpiration(javax.xml.datatype.XMLGregorianCalendar certificateexpiration) {
    this.certificateexpiration = certificateexpiration;
  }
 /**
   * company logo image encoded by base64
   * @return logo
  **/
  public String getLogo() {
    return logo;
  }
  public void setLogo(String logo) {
    this.logo = logo;
  }
 /**
   * how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; 
   * @return tpImpNFe
  **/
  public TpImpNFeEnum getTpImpNFe() {
    return tpImpNFe;
  }
  public void setTpImpNFe(TpImpNFeEnum tpImpNFe) {
    this.tpImpNFe = tpImpNFe;
  }
 /**
   * how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 
   * @return tpImpNFCe
  **/
  public TpImpNFCeEnum getTpImpNFCe() {
    return tpImpNFCe;
  }
  public void setTpImpNFCe(TpImpNFCeEnum tpImpNFCe) {
    this.tpImpNFCe = tpImpNFCe;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompanyConfiguration {\n");
    
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    certificatepwd: ").append(toIndentedString(certificatepwd)).append("\n");
    sb.append("    certificateexpiration: ").append(toIndentedString(certificateexpiration)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    tpImpNFe: ").append(toIndentedString(tpImpNFe)).append("\n");
    sb.append("    tpImpNFCe: ").append(toIndentedString(tpImpNFCe)).append("\n");
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

