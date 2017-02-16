package io.swagger.model;

import io.swagger.model.LineForGoodsAdi;
import io.swagger.model.StateEnum;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class LineForGoodsDi  {
  
  @ApiModelProperty(example = "null", value = "customs value, valor aduaneiro (II Block of NFe)")
  private Double customsValue = null;
  @ApiModelProperty(example = "null", required = true, value = "Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)")
  private String diNumber = null;
  @ApiModelProperty(example = "null", required = true, value = "Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)")
  private LocalDate registerDateDI = null;
  @ApiModelProperty(example = "null", required = true, value = "Clerance Site Local do desembaraço aduaneiro ")
  private String clearanceSite = null;
  @ApiModelProperty(example = "null", required = true, value = "Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro ")
  private StateEnum clearanceState = null;
  @ApiModelProperty(example = "null", value = "Clerance date")
  private LocalDate clearanceDate = null;

@XmlType(name="TransportDITypeEnum")
@XmlEnum(String.class)
public enum TransportDITypeEnum {

    @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3")), @XmlEnumValue("4") _4(String.valueOf("4")), @XmlEnumValue("5") _5(String.valueOf("5")), @XmlEnumValue("6") _6(String.valueOf("6")), @XmlEnumValue("7") _7(String.valueOf("7")), @XmlEnumValue("8") _8(String.valueOf("8")), @XmlEnumValue("9") _9(String.valueOf("9")), @XmlEnumValue("10") _10(String.valueOf("10"));


    private String value;

    TransportDITypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TransportDITypeEnum fromValue(String v) {
        for (TransportDITypeEnum b : TransportDITypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "- '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta ")
  private TransportDITypeEnum transportDIType = null;
  @ApiModelProperty(example = "null", value = "Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] ")
  private Double afrmmValue = null;

@XmlType(name="IntermediateTypeEnum")
@XmlEnum(String.class)
public enum IntermediateTypeEnum {

    @XmlEnumValue("1") _1(String.valueOf("1")), @XmlEnumValue("2") _2(String.valueOf("2")), @XmlEnumValue("3") _3(String.valueOf("3"));


    private String value;

    IntermediateTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static IntermediateTypeEnum fromValue(String v) {
        for (IntermediateTypeEnum b : IntermediateTypeEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", required = true, value = "- '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda] ")
  private IntermediateTypeEnum intermediateType = null;
  @ApiModelProperty(example = "null", value = "Buyer federal tax id CNPJ do comprador ou encomendante ")
  private String buyerFederalTaxID = null;
  @ApiModelProperty(example = "null", value = "Buyer sate Estado do comprador ou encomendante ")
  private StateEnum buyerState = null;
  @ApiModelProperty(example = "null", value = "Exporter code")
  private String exporterCode = null;
  @ApiModelProperty(example = "null", required = true, value = "aditional import declaration")
  private List<LineForGoodsAdi> adi = new ArrayList<LineForGoodsAdi>();

 /**
   * customs value, valor aduaneiro (II Block of NFe)
   * @return customsValue
  **/
  public Double getCustomsValue() {
    return customsValue;
  }
  public void setCustomsValue(Double customsValue) {
    this.customsValue = customsValue;
  }
 /**
   * Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
   * @return diNumber
  **/
  public String getDiNumber() {
    return diNumber;
  }
  public void setDiNumber(String diNumber) {
    this.diNumber = diNumber;
  }
 /**
   * Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
   * @return registerDateDI
  **/
  public LocalDate getRegisterDateDI() {
    return registerDateDI;
  }
  public void setRegisterDateDI(LocalDate registerDateDI) {
    this.registerDateDI = registerDateDI;
  }
 /**
   * Clerance Site Local do desembaraço aduaneiro 
   * @return clearanceSite
  **/
  public String getClearanceSite() {
    return clearanceSite;
  }
  public void setClearanceSite(String clearanceSite) {
    this.clearanceSite = clearanceSite;
  }
 /**
   * Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro 
   * @return clearanceState
  **/
  public StateEnum getClearanceState() {
    return clearanceState;
  }
  public void setClearanceState(StateEnum clearanceState) {
    this.clearanceState = clearanceState;
  }
 /**
   * Clerance date
   * @return clearanceDate
  **/
  public LocalDate getClearanceDate() {
    return clearanceDate;
  }
  public void setClearanceDate(LocalDate clearanceDate) {
    this.clearanceDate = clearanceDate;
  }
 /**
   * - '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta 
   * @return transportDIType
  **/
  public TransportDITypeEnum getTransportDIType() {
    return transportDIType;
  }
  public void setTransportDIType(TransportDITypeEnum transportDIType) {
    this.transportDIType = transportDIType;
  }
 /**
   * Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] 
   * @return afrmmValue
  **/
  public Double getAfrmmValue() {
    return afrmmValue;
  }
  public void setAfrmmValue(Double afrmmValue) {
    this.afrmmValue = afrmmValue;
  }
 /**
   * - '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda] 
   * @return intermediateType
  **/
  public IntermediateTypeEnum getIntermediateType() {
    return intermediateType;
  }
  public void setIntermediateType(IntermediateTypeEnum intermediateType) {
    this.intermediateType = intermediateType;
  }
 /**
   * Buyer federal tax id CNPJ do comprador ou encomendante 
   * @return buyerFederalTaxID
  **/
  public String getBuyerFederalTaxID() {
    return buyerFederalTaxID;
  }
  public void setBuyerFederalTaxID(String buyerFederalTaxID) {
    this.buyerFederalTaxID = buyerFederalTaxID;
  }
 /**
   * Buyer sate Estado do comprador ou encomendante 
   * @return buyerState
  **/
  public StateEnum getBuyerState() {
    return buyerState;
  }
  public void setBuyerState(StateEnum buyerState) {
    this.buyerState = buyerState;
  }
 /**
   * Exporter code
   * @return exporterCode
  **/
  public String getExporterCode() {
    return exporterCode;
  }
  public void setExporterCode(String exporterCode) {
    this.exporterCode = exporterCode;
  }
 /**
   * aditional import declaration
   * @return adi
  **/
  public List<LineForGoodsAdi> getAdi() {
    return adi;
  }
  public void setAdi(List<LineForGoodsAdi> adi) {
    this.adi = adi;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LineForGoodsDi {\n");
    
    sb.append("    customsValue: ").append(toIndentedString(customsValue)).append("\n");
    sb.append("    diNumber: ").append(toIndentedString(diNumber)).append("\n");
    sb.append("    registerDateDI: ").append(toIndentedString(registerDateDI)).append("\n");
    sb.append("    clearanceSite: ").append(toIndentedString(clearanceSite)).append("\n");
    sb.append("    clearanceState: ").append(toIndentedString(clearanceState)).append("\n");
    sb.append("    clearanceDate: ").append(toIndentedString(clearanceDate)).append("\n");
    sb.append("    transportDIType: ").append(toIndentedString(transportDIType)).append("\n");
    sb.append("    afrmmValue: ").append(toIndentedString(afrmmValue)).append("\n");
    sb.append("    intermediateType: ").append(toIndentedString(intermediateType)).append("\n");
    sb.append("    buyerFederalTaxID: ").append(toIndentedString(buyerFederalTaxID)).append("\n");
    sb.append("    buyerState: ").append(toIndentedString(buyerState)).append("\n");
    sb.append("    exporterCode: ").append(toIndentedString(exporterCode)).append("\n");
    sb.append("    adi: ").append(toIndentedString(adi)).append("\n");
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

