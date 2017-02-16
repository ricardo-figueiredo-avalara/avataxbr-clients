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

package io.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class StateTransition {
  
  public enum TypeEnum {
     voided,  unvoided,  reconciled,  unreconciled,  filed,  unfiled,  filedByAvalara, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("comment")
  private String comment = null;

  /**
   * - 'voided' - 'unvoided' - 'reconciled' - 'unreconciled' - 'filed' - 'unfiled' - 'filedByAvalara' 
   **/
  @ApiModelProperty(required = true, value = "- 'voided' - 'unvoided' - 'reconciled' - 'unreconciled' - 'filed' - 'unfiled' - 'filedByAvalara' ")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateTransition stateTransition = (StateTransition) o;
    return (this.type == null ? stateTransition.type == null : this.type.equals(stateTransition.type)) &&
        (this.comment == null ? stateTransition.comment == null : this.comment.equals(stateTransition.comment));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.comment == null ? 0: this.comment.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateTransition {\n");
    
    sb.append("  type: ").append(type).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}