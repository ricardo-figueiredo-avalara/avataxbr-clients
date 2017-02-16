package io.swagger.model;

import io.swagger.annotations.ApiModel;


/**
 * Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '01' # Operação Tributável com Alíquota Básica - '02' # Operação Tributável com Alíquota Diferenciada - '03' # Operação Tributável com Alíquota por Unidade de Medida de Produto - '04' # Operação Tributável Monofásica - 'Revenda a Alíquota Zero - '05' # Operação Tributável por Substituição Tributária - '06' # Operação Tributável a Alíquota Zero - '07' # Operação Isenta da Contribuição - '08' # Operação sem Incidência da Contribuição - '09' # Operação com Suspensão da Contribuição - '49' # Outras Operações de Saída - '50' # Operação com Direito a Crédito - 'Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '51' # Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno - '52' # Operação com Direito a Crédito - 'Vinculada Exclusivamente a Receita de Exportação - '53' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '54' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '55' # Operação com Direito a Crédito - 'Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '56' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - '60' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '61' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno - '62' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação - '63' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '64' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '65' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '66' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - '67' # Crédito Presumido - 'Outras Operações - '70' # Operação de Aquisição sem Direito a Crédito - '71' # Operação de Aquisição com Isenção - '72' # Operação de Aquisição com Suspensão - '73' # Operação de Aquisição a Alíquota Zero - '74' # Operação de Aquisição sem Incidência da Contribuição - '75' # Operação de Aquisição por Substituição Tributária - '98' # Outras Operações de Entrada - '99' # Outras Operações 
 */
public enum CSTPistCofinsEnum {
  
  _01("01"),
  
  _02("02"),
  
  _03("03"),
  
  _04("04"),
  
  _05("05"),
  
  _06("06"),
  
  _07("07"),
  
  _08("08"),
  
  _09("09"),
  
  _49("49"),
  
  _50("50"),
  
  _51("51"),
  
  _52("52"),
  
  _53("53"),
  
  _54("54"),
  
  _55("55"),
  
  _56("56"),
  
  _60("60"),
  
  _61("61"),
  
  _62("62"),
  
  _63("63"),
  
  _64("64"),
  
  _65("65"),
  
  _66("66"),
  
  _67("67"),
  
  _70("70"),
  
  _71("71"),
  
  _72("72"),
  
  _73("73"),
  
  _74("74"),
  
  _75("75"),
  
  _98("98"),
  
  _99("99");

  private String value;

  CSTPistCofinsEnum(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CSTPistCofinsEnum fromValue(String text) {
    for (CSTPistCofinsEnum b : CSTPistCofinsEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

