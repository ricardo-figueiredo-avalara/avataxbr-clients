package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * 0 – cash pagamento à vista 1 – on terms, pagamento à prazo; 
 */
public enum PaymentTerms {
  
  NUMBER_0(0),
  
  NUMBER_1(1);

  private Integer value;

  PaymentTerms(Integer value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PaymentTerms fromValue(String text) {
    for (PaymentTerms b : PaymentTerms.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

