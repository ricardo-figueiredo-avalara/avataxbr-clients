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

import * as models from './models';

/**
 * Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '01' # Operação Tributável com Alíquota Básica - '02' # Operação Tributável com Alíquota Diferenciada - '03' # Operação Tributável com Alíquota por Unidade de Medida de Produto - '04' # Operação Tributável Monofásica - 'Revenda a Alíquota Zero - '05' # Operação Tributável por Substituição Tributária - '06' # Operação Tributável a Alíquota Zero - '07' # Operação Isenta da Contribuição - '08' # Operação sem Incidência da Contribuição - '09' # Operação com Suspensão da Contribuição - '49' # Outras Operações de Saída - '50' # Operação com Direito a Crédito - 'Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '51' # Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno - '52' # Operação com Direito a Crédito - 'Vinculada Exclusivamente a Receita de Exportação - '53' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '54' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '55' # Operação com Direito a Crédito - 'Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '56' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - '60' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '61' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno - '62' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação - '63' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '64' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '65' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '66' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - '67' # Crédito Presumido - 'Outras Operações - '70' # Operação de Aquisição sem Direito a Crédito - '71' # Operação de Aquisição com Isenção - '72' # Operação de Aquisição com Suspensão - '73' # Operação de Aquisição a Alíquota Zero - '74' # Operação de Aquisição sem Incidência da Contribuição - '75' # Operação de Aquisição por Substituição Tributária - '98' # Outras Operações de Entrada - '99' # Outras Operações 
 */
    /**
    * Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '01' # Operação Tributável com Alíquota Básica - '02' # Operação Tributável com Alíquota Diferenciada - '03' # Operação Tributável com Alíquota por Unidade de Medida de Produto - '04' # Operação Tributável Monofásica - 'Revenda a Alíquota Zero - '05' # Operação Tributável por Substituição Tributária - '06' # Operação Tributável a Alíquota Zero - '07' # Operação Isenta da Contribuição - '08' # Operação sem Incidência da Contribuição - '09' # Operação com Suspensão da Contribuição - '49' # Outras Operações de Saída - '50' # Operação com Direito a Crédito - 'Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '51' # Operação com Direito a Crédito – Vinculada Exclusivamente a Receita Não Tributada no Mercado Interno - '52' # Operação com Direito a Crédito - 'Vinculada Exclusivamente a Receita de Exportação - '53' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '54' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '55' # Operação com Direito a Crédito - 'Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '56' # Operação com Direito a Crédito - 'Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - '60' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '61' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita Não-Tributada no Mercado Interno - '62' # Crédito Presumido - 'Operação de Aquisição Vinculada Exclusivamente a Receita de Exportação - '63' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '64' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '65' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '66' # Crédito Presumido - 'Operação de Aquisição Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação - '67' # Crédito Presumido - 'Outras Operações - '70' # Operação de Aquisição sem Direito a Crédito - '71' # Operação de Aquisição com Isenção - '72' # Operação de Aquisição com Suspensão - '73' # Operação de Aquisição a Alíquota Zero - '74' # Operação de Aquisição sem Incidência da Contribuição - '75' # Operação de Aquisição por Substituição Tributária - '98' # Outras Operações de Entrada - '99' # Outras Operações 
    */
export enum CSTPistCofinsEnum {
    _01 = <any> '01',
    _02 = <any> '02',
    _03 = <any> '03',
    _04 = <any> '04',
    _05 = <any> '05',
    _06 = <any> '06',
    _07 = <any> '07',
    _08 = <any> '08',
    _09 = <any> '09',
    _49 = <any> '49',
    _50 = <any> '50',
    _51 = <any> '51',
    _52 = <any> '52',
    _53 = <any> '53',
    _54 = <any> '54',
    _55 = <any> '55',
    _56 = <any> '56',
    _60 = <any> '60',
    _61 = <any> '61',
    _62 = <any> '62',
    _63 = <any> '63',
    _64 = <any> '64',
    _65 = <any> '65',
    _66 = <any> '66',
    _67 = <any> '67',
    _70 = <any> '70',
    _71 = <any> '71',
    _72 = <any> '72',
    _73 = <any> '73',
    _74 = <any> '74',
    _75 = <any> '75',
    _98 = <any> '98',
    _99 = <any> '99'
}
