using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// DetailsCalculatedTaxServiceSales
    /// </summary>
    [DataContract]
    public class DetailsCalculatedTaxServiceSales
    {
        /// <summary>
        /// Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39; 
        /// </summary>
        /// <value>Type of jurisdiction - &#39;City&#39; - &#39;State&#39; - &#39;Country&#39; </value>
        [DataMember(Name = "jurisdictionType", EmitDefaultValue = false)]
        public JurisdictionTypeEnum? JurisdictionType { get; set; }
        /// <summary>
        /// Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39; 
        /// </summary>
        /// <value>Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39; </value>
        [DataMember(Name = "taxType", EmitDefaultValue = false)]
        public TaxTypeEnum? TaxType { get; set; }
        /// <summary>
        /// This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39; - &#39;NO_EXEMPTION&#39; 
        /// </summary>
        /// <value>This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39; - &#39;NO_EXEMPTION&#39; </value>
        [DataMember(Name = "taxRuleType", EmitDefaultValue = false)]
        public TaxRuleTypeEnum? TaxRuleType { get; set; }

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
        /// Gets or Sets TaxImpact
        /// </summary>
        [DataMember(Name = "taxImpact", EmitDefaultValue = false)]
        public DetailsCalculatedTaxImpact TaxImpact { get; set; }

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