using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace IO.Swagger.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class ItemGoods {
    /// <summary>
    /// Company ID
    /// </summary>
    /// <value>Company ID</value>
    [DataMember(Name="companyId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "companyId")]
    public Guid? CompanyId { get; set; }

    /// <summary>
    /// ERP Code
    /// </summary>
    /// <value>ERP Code</value>
    [DataMember(Name="code", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "code")]
    public string Code { get; set; }

    /// <summary>
    /// Agast Code
    /// </summary>
    /// <value>Agast Code</value>
    [DataMember(Name="agast", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "agast")]
    public string Agast { get; set; }

    /// <summary>
    /// Item Description
    /// </summary>
    /// <value>Item Description</value>
    [DataMember(Name="description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "description")]
    public string Description { get; set; }

    /// <summary>
    /// Seal Code for ipi tax control (código do selo para controle de IPI)
    /// </summary>
    /// <value>Seal Code for ipi tax control (código do selo para controle de IPI)</value>
    [DataMember(Name="sealCode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sealCode")]
    public string SealCode { get; set; }

    /// <summary>
    /// Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
    /// </summary>
    /// <value>Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)</value>
    [DataMember(Name="nFCI", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nFCI")]
    public string NFCI { get; set; }

    /// <summary>
    /// this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. 
    /// </summary>
    /// <value>this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. </value>
    [DataMember(Name="isIcmsStSubstitute", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isIcmsStSubstitute")]
    public bool? IsIcmsStSubstitute { get; set; }

    /// <summary>
    /// - '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% 
    /// </summary>
    /// <value>- '0' # National goods - except those treated in codes 3,4, 5 and 8 - '1' # Foreign goods - Imported directly by seller, except those in code 6 - '2' # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - '3' # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - '4' # National goods from production following 'standard basic processes' as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - '5' # National goods - Merchandise or goods with imported content equal or below 40% - '6' # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - '7' # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - '8' # National goods - Merchandise or goods with imported content above 70% </value>
    [DataMember(Name="source", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "source")]
    public string Source { get; set; }

    /// <summary>
    /// Gets or Sets ProductType
    /// </summary>
    [DataMember(Name="productType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "productType")]
    public string ProductType { get; set; }

    /// <summary>
    /// Item is merchandise but will be considered product
    /// </summary>
    /// <value>Item is merchandise but will be considered product</value>
    [DataMember(Name="manufacturerEquivalent", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "manufacturerEquivalent")]
    public bool? ManufacturerEquivalent { get; set; }

    /// <summary>
    /// Inform that this item will have rights to aprropriate IPI credit
    /// </summary>
    /// <value>Inform that this item will have rights to aprropriate IPI credit</value>
    [DataMember(Name="appropriateIPIcreditWhenInGoing", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "appropriateIPIcreditWhenInGoing")]
    public bool? AppropriateIPIcreditWhenInGoing { get; set; }

    /// <summary>
    /// Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE
    /// </summary>
    /// <value>Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE</value>
    [DataMember(Name="usuallyAppropriatePISCOFINSCredit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "usuallyAppropriatePISCOFINSCredit")]
    public bool? UsuallyAppropriatePISCOFINSCredit { get; set; }

    /// <summary>
    /// The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount
    /// </summary>
    /// <value>The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount</value>
    [DataMember(Name="isPisCofinsEstimatedCredit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "isPisCofinsEstimatedCredit")]
    public bool? IsPisCofinsEstimatedCredit { get; set; }

    /// <summary>
    /// - '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação 
    /// </summary>
    /// <value>- '01' # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - '02' # Exclusivamente a Receita Não Tributada no Mercado Interno - '03' # Exclusivamente a Receita de Exportação - '04' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - '05' # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - '06' # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - '07' # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação </value>
    [DataMember(Name="piscofinsRevenueType", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "piscofinsRevenueType")]
    public string PiscofinsRevenueType { get; set; }

    /// <summary>
    /// Discount allowed on icms base when PIS/COFINS are Monophase
    /// </summary>
    /// <value>Discount allowed on icms base when PIS/COFINS are Monophase</value>
    [DataMember(Name="icmsBaseDiscountForMonoPhaseSocialContr", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "icmsBaseDiscountForMonoPhaseSocialContr")]
    public double? IcmsBaseDiscountForMonoPhaseSocialContr { get; set; }

    /// <summary>
    /// GTIN NUMBER
    /// </summary>
    /// <value>GTIN NUMBER</value>
    [DataMember(Name="cean", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cean")]
    public string Cean { get; set; }

    /// <summary>
    /// Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
    /// </summary>
    /// <value>Nomenclatura de Valor aduaneio e Estatístico - NCM extension code</value>
    [DataMember(Name="nve", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nve")]
    public string Nve { get; set; }

    /// <summary>
    /// Gets or Sets SalesUnit
    /// </summary>
    [DataMember(Name="salesUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "salesUnit")]
    public string SalesUnit { get; set; }

    /// <summary>
    /// factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
    /// </summary>
    /// <value>factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)</value>
    [DataMember(Name="salesUnitIPIfactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "salesUnitIPIfactor")]
    public double? SalesUnitIPIfactor { get; set; }

    /// <summary>
    /// factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
    /// </summary>
    /// <value>factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)</value>
    [DataMember(Name="salesUnitIcmsfactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "salesUnitIcmsfactor")]
    public double? SalesUnitIcmsfactor { get; set; }

    /// <summary>
    /// factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
    /// </summary>
    /// <value>factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)</value>
    [DataMember(Name="salesUnitIcmsStfactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "salesUnitIcmsStfactor")]
    public double? SalesUnitIcmsStfactor { get; set; }

    /// <summary>
    /// factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
    /// </summary>
    /// <value>factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)</value>
    [DataMember(Name="salesUnitPisCofinsfactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "salesUnitPisCofinsfactor")]
    public double? SalesUnitPisCofinsfactor { get; set; }

    /// <summary>
    /// Gets or Sets PurchaseUnit
    /// </summary>
    [DataMember(Name="purchaseUnit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "purchaseUnit")]
    public string PurchaseUnit { get; set; }

    /// <summary>
    /// factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)
    /// </summary>
    /// <value>factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)</value>
    [DataMember(Name="purchaseUnitIPIfactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "purchaseUnitIPIfactor")]
    public double? PurchaseUnitIPIfactor { get; set; }

    /// <summary>
    /// factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
    /// </summary>
    /// <value>factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)</value>
    [DataMember(Name="purchaseUnitIcmsfactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "purchaseUnitIcmsfactor")]
    public double? PurchaseUnitIcmsfactor { get; set; }

    /// <summary>
    /// factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)
    /// </summary>
    /// <value>factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)</value>
    [DataMember(Name="purchaseUnitIcmsStfactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "purchaseUnitIcmsStfactor")]
    public double? PurchaseUnitIcmsStfactor { get; set; }

    /// <summary>
    /// factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)
    /// </summary>
    /// <value>factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)</value>
    [DataMember(Name="purchaseUnitPisCofinsfactor", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "purchaseUnitPisCofinsfactor")]
    public double? PurchaseUnitPisCofinsfactor { get; set; }

    /// <summary>
    /// When the product is new, and will be retail, firt time that it exit it is subject to IPI
    /// </summary>
    /// <value>When the product is new, and will be retail, firt time that it exit it is subject to IPI</value>
    [DataMember(Name="firstUse", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "firstUse")]
    public bool? FirstUse { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ItemGoods {\n");
      sb.Append("  CompanyId: ").Append(CompanyId).Append("\n");
      sb.Append("  Code: ").Append(Code).Append("\n");
      sb.Append("  Agast: ").Append(Agast).Append("\n");
      sb.Append("  Description: ").Append(Description).Append("\n");
      sb.Append("  SealCode: ").Append(SealCode).Append("\n");
      sb.Append("  NFCI: ").Append(NFCI).Append("\n");
      sb.Append("  IsIcmsStSubstitute: ").Append(IsIcmsStSubstitute).Append("\n");
      sb.Append("  Source: ").Append(Source).Append("\n");
      sb.Append("  ProductType: ").Append(ProductType).Append("\n");
      sb.Append("  ManufacturerEquivalent: ").Append(ManufacturerEquivalent).Append("\n");
      sb.Append("  AppropriateIPIcreditWhenInGoing: ").Append(AppropriateIPIcreditWhenInGoing).Append("\n");
      sb.Append("  UsuallyAppropriatePISCOFINSCredit: ").Append(UsuallyAppropriatePISCOFINSCredit).Append("\n");
      sb.Append("  IsPisCofinsEstimatedCredit: ").Append(IsPisCofinsEstimatedCredit).Append("\n");
      sb.Append("  PiscofinsRevenueType: ").Append(PiscofinsRevenueType).Append("\n");
      sb.Append("  IcmsBaseDiscountForMonoPhaseSocialContr: ").Append(IcmsBaseDiscountForMonoPhaseSocialContr).Append("\n");
      sb.Append("  Cean: ").Append(Cean).Append("\n");
      sb.Append("  Nve: ").Append(Nve).Append("\n");
      sb.Append("  SalesUnit: ").Append(SalesUnit).Append("\n");
      sb.Append("  SalesUnitIPIfactor: ").Append(SalesUnitIPIfactor).Append("\n");
      sb.Append("  SalesUnitIcmsfactor: ").Append(SalesUnitIcmsfactor).Append("\n");
      sb.Append("  SalesUnitIcmsStfactor: ").Append(SalesUnitIcmsStfactor).Append("\n");
      sb.Append("  SalesUnitPisCofinsfactor: ").Append(SalesUnitPisCofinsfactor).Append("\n");
      sb.Append("  PurchaseUnit: ").Append(PurchaseUnit).Append("\n");
      sb.Append("  PurchaseUnitIPIfactor: ").Append(PurchaseUnitIPIfactor).Append("\n");
      sb.Append("  PurchaseUnitIcmsfactor: ").Append(PurchaseUnitIcmsfactor).Append("\n");
      sb.Append("  PurchaseUnitIcmsStfactor: ").Append(PurchaseUnitIcmsStfactor).Append("\n");
      sb.Append("  PurchaseUnitPisCofinsfactor: ").Append(PurchaseUnitPisCofinsfactor).Append("\n");
      sb.Append("  FirstUse: ").Append(FirstUse).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
