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

import com.google.gson.annotations.SerializedName;


/**
 * Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '01' # Operação Tributável com Alíquota Básica - '02' # Operação Tributável com Alíquota Diferenciada - '03' # Operação Tributável com Alíquota por Unidade de Medida de Produto - '04' # Operação Tributável Monofásica - 'Revenda a Alíquota Zero - '05' # Operação Tributável por Substituição Tributária - '06' # Operação Tributável a Alíquota Zero - '07' # Operação Isenta da Contribuição - '08' # Operação sem Incidência da Contribuição - '09' # Operação com Suspensão da Contribuição - '49' # Outras Operações de Saída - '50' # Operação com Direito a Crédito - 'Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '51' # Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno - '52' # Operação com Direito a Crédito - 'Vinculada Exclusivamente a Receita de Exportação - '53' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '54' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '55' # Operação com Direito a Crédito - 'Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '56' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - '60' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '61' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno - '62' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação - '63' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '64' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '65' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '66' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - '67' # Crédito Presumido - 'Outras Operações - '70' # Operação de Aquisição sem Direito a Crédito - '71' # Operação de Aquisição com Isenção - '72' # Operação de Aquisição com Suspensão - '73' # Operação de Aquisição a Alíquota Zero - '74' # Operação de Aquisição sem Incidência da Contribuição - '75' # Operação de Aquisição por Substituição Tributária - '98' # Outras Operações de Entrada - '99' # Outras Operações 
 */
public enum CSTPistCofinsEnum {
  
  @SerializedName("01")
  _01("01"),
  
  @SerializedName("02")
  _02("02"),
  
  @SerializedName("03")
  _03("03"),
  
  @SerializedName("04")
  _04("04"),
  
  @SerializedName("05")
  _05("05"),
  
  @SerializedName("06")
  _06("06"),
  
  @SerializedName("07")
  _07("07"),
  
  @SerializedName("08")
  _08("08"),
  
  @SerializedName("09")
  _09("09"),
  
  @SerializedName("49")
  _49("49"),
  
  @SerializedName("50")
  _50("50"),
  
  @SerializedName("51")
  _51("51"),
  
  @SerializedName("52")
  _52("52"),
  
  @SerializedName("53")
  _53("53"),
  
  @SerializedName("54")
  _54("54"),
  
  @SerializedName("55")
  _55("55"),
  
  @SerializedName("56")
  _56("56"),
  
  @SerializedName("60")
  _60("60"),
  
  @SerializedName("61")
  _61("61"),
  
  @SerializedName("62")
  _62("62"),
  
  @SerializedName("63")
  _63("63"),
  
  @SerializedName("64")
  _64("64"),
  
  @SerializedName("65")
  _65("65"),
  
  @SerializedName("66")
  _66("66"),
  
  @SerializedName("67")
  _67("67"),
  
  @SerializedName("70")
  _70("70"),
  
  @SerializedName("71")
  _71("71"),
  
  @SerializedName("72")
  _72("72"),
  
  @SerializedName("73")
  _73("73"),
  
  @SerializedName("74")
  _74("74"),
  
  @SerializedName("75")
  _75("75"),
  
  @SerializedName("98")
  _98("98"),
  
  @SerializedName("99")
  _99("99");

  private String value;

  CSTPistCofinsEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

