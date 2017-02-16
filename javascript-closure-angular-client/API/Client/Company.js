goog.provide('API.Client.Company');

/**
 * @record
 */
API.Client.Company = function() {}

/**
 * string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
 * @type {!string}
 * @export
 */
API.Client.Company.prototype.code;

/**
 * Official Company name (Razão Social)
 * @type {!string}
 * @export
 */
API.Client.Company.prototype.officialName;

/**
 * Company name (DBA - Nome de Fantasia),  Used to identify branches/subsidiaries with same name
 * @type {!string}
 * @export
 */
API.Client.Company.prototype.name;

/**
 * @type {!API.Client.EntityType}
 * @export
 */
API.Client.Company.prototype.entityType;

/**
 * Company has participation of state-owned capital (it will be considerated like a government entity)
 * @type {!boolean}
 * @export
 */
API.Client.Company.prototype.subjectToSRF1234;

/**
 * @type {!API.Client.FederalTaxRegime}
 * @export
 */
API.Client.Company.prototype.federalTaxRegime;

/**
 * this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
 * @type {!string}
 * @export
 */
API.Client.Company.prototype.pisSubjectTo;

/**
 * this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
 * @type {!string}
 * @export
 */
API.Client.Company.prototype.cofinsSubjectTo;

/**
 * this flag informs if this company is subject to this tax the default value for this property is TAXABLE, when set to TAXABLE it doesn't mean that all transaction will be TAXABLE. The system will analise other rules to identify exemptions/exceptions when set to NOT TAXABLE or EXEMPT, the system will not analise other rules. 
 * @type {!string}
 * @export
 */
API.Client.Company.prototype.csllSubjectTo;

/**
 * When th company is REAL PROFIT usually it operates under a Non-Cumulative PIS/COFINS regime But exist some services that are always Cumulative regime. If the company has all receipts from Non-Cumulative services this flag will be set to True. This flag informs special conditions to credit of PIS/COFINS when this company is out of Free zone and  purchases from Free Zone Company Quando uma empresa fora da Zona Franca adquire uma produto ou serviço de uma empresa situada na Zona Franca de Manaus, o crédito de PIS E COFINS segue estas aliquotas diferenciadas. Fundamentação, art. 5º da Instrução Normativa SRF nº 546/2005; art. 3º, § 12 da Lei nº 10.637/2002; art. 3º, § 17 da Lei nº 10.833/2003; art. 4º da Lei nº 11.307/2006. DESTINATÁRIO ALÍQUOTAS PIS COFINS a) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure a Contribuição para o PIS/PASEP no regime de não-cumulatividade débito 0,65% 3% crédito 1% 4,6% c) Venda efetuada a pessoa jurídica estabelecida fora da Zona Franca de Manaus, que apure o imposto de renda com base no lucro real e que tenha sua receita, total ou parcialmente, excluída do regime de incidência não-cumulativa da Contribuição para o PIS/PASEP débito 1,3% 6% crédito 1,65% 7,6% 
 * @type {!boolean}
 * @export
 */
API.Client.Company.prototype.receiptsAreFullNoCumulativePisCofins;

/**
 * On purchase transaction, to force withholding INSS this Flag can be set to True
 * @type {!boolean}
 * @export
 */
API.Client.Company.prototype.inssWithholdSubjectTo;

/**
 * On purchase transaction, to force withhold ISS this Flag can be set to True
 * @type {!boolean}
 * @export
 */
API.Client.Company.prototype.issWithholdSubjectTo;

/**
 * On purchase transaction, if this flag is FALSE, the system will not withhold IRRF. if this flag is TRUE the system will analise other rules to define if will have witholding 
 * @type {!boolean}
 * @export
 */
API.Client.Company.prototype.irrfWithholdSubjectTo;

/**
 * Actual ICMS Rate for this company (if the company is Tax Regime Simplified). Aliquota de ICMS da companhia caso Optante do Simples 
 * @type {!number}
 * @export
 */
API.Client.Company.prototype.icmsRateForSimplestaxregime;

/**
 * ICMS Exempt when Tax Regime is Simplified because total gross revenue is bellow amount defined by state (see PARANÁ State) Isenção do ICMS no Simples Nacional para faixa de receita bruta 
 * @type {!boolean}
 * @export
 */
API.Client.Company.prototype.isExemptByGrossRevenueForSimplestaxregime;

/**
 * @type {!API.Client.Company_configuration}
 * @export
 */
API.Client.Company.prototype.configuration;

/**
 * @type {!API.Client.Company_mailServer}
 * @export
 */
API.Client.Company.prototype.mailServer;

/**
 * Person or company authorized to downloadNFe
 * @type {!Array<!API.Client.Company_authorizedToDownloadNFe>}
 * @export
 */
API.Client.Company.prototype.authorizedToDownloadNFe;

/** @enum {string} */
API.Client.Company.PisSubjectToEnum = { 
  TAXABLE: 'TAXABLE',
  NOT TAXABLE: 'NOT TAXABLE',
  EXEMPT: 'EXEMPT',
}
/** @enum {string} */
API.Client.Company.CofinsSubjectToEnum = { 
  TAXABLE: 'TAXABLE',
  NOT TAXABLE: 'NOT TAXABLE',
  EXEMPT: 'EXEMPT',
}
/** @enum {string} */
API.Client.Company.CsllSubjectToEnum = { 
  TAXABLE: 'TAXABLE',
  NOT TAXABLE: 'NOT TAXABLE',
  EXEMPT: 'EXEMPT',
}
