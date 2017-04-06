/*
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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * StateTransition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-06T17:54:07.550Z")
public class StateTransition {
  /**
   * - 'voided' # Send this event to a Recorded tax transaction record to mark it as voided. - 'unvoided' # Send this event to a Voided tax transaction record to mark it as recorded. - 'reconciled' # Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. - 'unreconciled' # Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state. - 'filed' # Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. - 'unfiled' # Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system. - 'filedByAvalara' # This event can only be sent by Avalara Systems. 
   */
  public enum TypeEnum {
    @SerializedName("voided")
    VOIDED("voided"),
    
    @SerializedName("unvoided")
    UNVOIDED("unvoided"),
    
    @SerializedName("reconciled")
    RECONCILED("reconciled"),
    
    @SerializedName("unreconciled")
    UNRECONCILED("unreconciled"),
    
    @SerializedName("filed")
    FILED("filed"),
    
    @SerializedName("unfiled")
    UNFILED("unfiled"),
    
    @SerializedName("filedByAvalara")
    FILEDBYAVALARA("filedByAvalara");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("comment")
  private String comment = null;

  public StateTransition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * - 'voided' # Send this event to a Recorded tax transaction record to mark it as voided. - 'unvoided' # Send this event to a Voided tax transaction record to mark it as recorded. - 'reconciled' # Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. - 'unreconciled' # Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state. - 'filed' # Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. - 'unfiled' # Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system. - 'filedByAvalara' # This event can only be sent by Avalara Systems. 
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "- 'voided' # Send this event to a Recorded tax transaction record to mark it as voided. - 'unvoided' # Send this event to a Voided tax transaction record to mark it as recorded. - 'reconciled' # Send this event to a Recorded tax transaction record to indicate that it has been reconciled with client systems and to prevent it from being edited prior to filing. This is useful when a transaction will be filed and you do not want it to change again to facilitate auditing and reconciliation. - 'unreconciled' # Send this event to a Reconciled tax transaction record to indicate that it has not been reconciled and may need to be edited. This is useful when a Tax transaction was erroniously put into the reconciled state. - 'filed' # Send this event to a Reconciled transaction to indicate that it has been part of a tax filing by the client system. - 'unfiled' # Send this event to a Filed transaction to indicate that it has NOT been part of a tax filing by the client system. - 'filedByAvalara' # This event can only be sent by Avalara Systems. ")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public StateTransition comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateTransition stateTransition = (StateTransition) o;
    return Objects.equals(this.type, stateTransition.type) &&
        Objects.equals(this.comment, stateTransition.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, comment);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateTransition {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

