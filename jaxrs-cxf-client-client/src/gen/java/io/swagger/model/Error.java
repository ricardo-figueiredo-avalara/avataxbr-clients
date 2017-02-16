package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class Error  {
  
  @ApiModelProperty(example = "null", value = "")
  private Integer code = null;
  @ApiModelProperty(example = "null", required = true, value = "")
  private String message = null;
  @ApiModelProperty(example = "null", value = "")
  private String field = null;
  @ApiModelProperty(example = "null", value = "")
  private String value = null;

@XmlType(name="InEnum")
@XmlEnum(String.class)
public enum InEnum {

    @XmlEnumValue("params") PARAMS(String.valueOf("params")), @XmlEnumValue("body") BODY(String.valueOf("body")), @XmlEnumValue("query") QUERY(String.valueOf("query"));


    private String value;

    InEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InEnum fromValue(String v) {
        for (InEnum b : InEnum.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "null", value = "")
  private InEnum in = null;

 /**
   * Get code
   * @return code
  **/
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }
 /**
   * Get message
   * @return message
  **/
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }
 /**
   * Get field
   * @return field
  **/
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }
 /**
   * Get value
   * @return value
  **/
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }
 /**
   * Get in
   * @return in
  **/
  public InEnum getIn() {
    return in;
  }
  public void setIn(InEnum in) {
    this.in = in;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
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

