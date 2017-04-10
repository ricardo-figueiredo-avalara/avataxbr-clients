using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' 
    /// </summary>
    /// <value>Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' </value>
    [DataContract(Name = "taxTypeEnum")]
    [JsonConverter(typeof(StringEnumConverter))]
    public enum TaxTypeEnum
    {
        /// <summary>
        /// Enum Pis for "pis"
        /// </summary>
        [EnumMember(Value = "pis")]
        Pis,

        /// <summary>
        /// Enum PisRf for "pisRf"
        /// </summary>
        [EnumMember(Value = "pisRf")]
        PisRf,

        /// <summary>
        /// Enum Cofins for "cofins"
        /// </summary>
        [EnumMember(Value = "cofins")]
        Cofins,

        /// <summary>
        /// Enum CofinsRf for "cofinsRf"
        /// </summary>
        [EnumMember(Value = "cofinsRf")]
        CofinsRf,

        /// <summary>
        /// Enum Csll for "csll"
        /// </summary>
        [EnumMember(Value = "csll")]
        Csll,

        /// <summary>
        /// Enum CsllRf for "csllRf"
        /// </summary>
        [EnumMember(Value = "csllRf")]
        CsllRf,

        /// <summary>
        /// Enum Irrf for "irrf"
        /// </summary>
        [EnumMember(Value = "irrf")]
        Irrf,

        /// <summary>
        /// Enum InssAr for "inssAr"
        /// </summary>
        [EnumMember(Value = "inssAr")]
        InssAr,

        /// <summary>
        /// Enum InssRf for "inssRf"
        /// </summary>
        [EnumMember(Value = "inssRf")]
        InssRf,

        /// <summary>
        /// Enum IssRf for "issRf"
        /// </summary>
        [EnumMember(Value = "issRf")]
        IssRf
    }

    /// <summary>
    /// PurchaseTaxByTypeDetail
    /// </summary>
    [DataContract]
    public class PurchaseTaxByTypeDetail
    {
        /// <summary>
        /// Type of jurisdiction - 'City' - 'State' - 'Country' 
        /// </summary>
        /// <value>Type of jurisdiction - 'City' - 'State' - 'Country' </value>
        [DataMember(Name = "jurisdictionType", EmitDefaultValue = false)]
        public JurisdictionType? JurisdictionType { get; set; }

        /// <summary>
        /// Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' 
        /// </summary>
        /// <value>Tax identificator - 'pis' - 'pisRf' - 'cofins' - 'cofinsRf' - 'csll' - 'csllRf' - 'irrf' - 'inssAr' - 'inssRf' - 'issRf' </value>
        [DataMember(Name = "taxTypeEnum", EmitDefaultValue = false)]
        public TaxTypeEnum? TaxType { get; set; }

        /// <summary>
        /// This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' 
        /// </summary>
        /// <value>This string with type of rule - 'SELLER' - 'BUYER' - 'TRANSACTION' - 'ITEM' - 'TAX' </value>
        [DataMember(Name = "taxRuleType", EmitDefaultValue = false)]
        public TaxRuleType? TaxRuleType { get; set; }

        /// <summary>
        /// This string captures the applicable location type. Location used for calc. Buyer or Seller
        /// </summary>
        /// <value>This string captures the applicable location type. Location used for calc. Buyer or Seller</value>
        [DataMember(Name = "locationType", EmitDefaultValue = false)]
        public string LocationType { get; set; }

        /// <summary>
        /// Jurisdiction used for calctax amount
        /// </summary>
        /// <value>Jurisdiction used for calctax amount</value>
        [DataMember(Name = "jurisdictionName", EmitDefaultValue = false)]
        public string JurisdictionName { get; set; }

        /// <summary>
        /// Name of configuration rate
        /// </summary>
        /// <value>Name of configuration rate</value>
        [DataMember(Name = "rateType", EmitDefaultValue = false)]
        public string RateType { get; set; }

        /// <summary>
        /// This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
        /// </summary>
        /// <value>This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.</value>
        [DataMember(Name = "scenario", EmitDefaultValue = false)]
        public string Scenario { get; set; }

        /// <summary>
        /// This decimal captures how much of the lineAmount was taxable by this tax, calc base
        /// </summary>
        /// <value>This decimal captures how much of the lineAmount was taxable by this tax, calc base</value>
        [DataMember(Name = "subtotalTaxable", EmitDefaultValue = false)]
        public double? SubtotalTaxable { get; set; }

        /// <summary>
        /// This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.
        /// </summary>
        /// <value>This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.</value>
        [DataMember(Name = "subtotalExempt", EmitDefaultValue = false)]
        public double? SubtotalExempt { get; set; }

        /// <summary>
        /// This decimal captures the tax rate for this tax.3.00 (3%)
        /// </summary>
        /// <value>This decimal captures the tax rate for this tax.3.00 (3%)</value>
        [DataMember(Name = "rate", EmitDefaultValue = false)]
        public double? Rate { get; set; }

        /// <summary>
        /// This decimal captures how much of the lineAmount was taxable by this tax
        /// </summary>
        /// <value>This decimal captures how much of the lineAmount was taxable by this tax</value>
        [DataMember(Name = "tax", EmitDefaultValue = false)]
        public double? Tax { get; set; }

        /// <summary>
        /// This string is required if is exempt
        /// </summary>
        /// <value>This string is required if is exempt</value>
        [DataMember(Name = "exemptionCode", EmitDefaultValue = false)]
        public string ExemptionCode { get; set; }

        /// <summary>
        /// This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address
        /// </summary>
        /// <value>This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address</value>
        [DataMember(Name = "significantLocations", EmitDefaultValue = false)]
        public List<string> SignificantLocations { get; set; }
    }
}
