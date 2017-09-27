using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesLinesOut
    /// </summary>
    [DataContract]
    public class SalesLinesOut
    {
        /// <summary>
        /// - &#39;01&#39; # ORIGIN MODE - &#39;02&#39; # ORIGIN MODE BUT EXEMPT - &#39;03&#39; # ORIGIN MODE BUT IMMUNE - &#39;04&#39; # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - &#39;05&#39; # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;21&#39; # DESTINATION MODE - &#39;22&#39; # DESTINATION MODE BUT EXEMPT - &#39;23&#39; # DESTINATION MODE BUT IMMUNE - &#39;24&#39; # DESTINATION MODE BUT SUSPENDED - &#39;25&#39; # DESTINATION MODE BUT SUSPENDED - &#39;40&#39; # FOREIGN IMMUNE MODE 
        /// </summary>
        /// <value>- &#39;01&#39; # ORIGIN MODE - &#39;02&#39; # ORIGIN MODE BUT EXEMPT - &#39;03&#39; # ORIGIN MODE BUT IMMUNE - &#39;04&#39; # ORIGIN MODE BUT SUSPENDED FOR LEGAL REASON - &#39;05&#39; # ORIGIN MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;21&#39; # DESTINATION MODE - &#39;22&#39; # DESTINATION MODE BUT EXEMPT - &#39;23&#39; # DESTINATION MODE BUT IMMUNE - &#39;24&#39; # DESTINATION MODE BUT SUSPENDED - &#39;25&#39; # DESTINATION MODE BUT SUSPENDED - &#39;40&#39; # FOREIGN IMMUNE MODE </value>
        [DataMember(Name = "cst", EmitDefaultValue = false)]
        public CstEnum? Cst { get; set; }
        /// <summary>
        /// - &#39;61&#39; # WITHHOLD NORMAL MODE - &#39;62&#39; # WITHHOLD NORMAL MODE BUT EXEMPT - &#39;63&#39; # WITHHOLD NORMAL MODE BUT IMMUNE - &#39;64&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - &#39;65&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;66&#39; # WITHHOLD FORCED MODE - &#39;67&#39; # WITHHOLD FORCED MODE BUT EXEMPT - &#39;68&#39; # WITHHOLD FORCED MODE BUT IMMUNE - &#39;69&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - &#39;70&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - &#39;71&#39; # NO WITHHOLD MODE - &#39;72&#39; # NO WITHHOLD FOREIGN MODE 
        /// </summary>
        /// <value>- &#39;61&#39; # WITHHOLD NORMAL MODE - &#39;62&#39; # WITHHOLD NORMAL MODE BUT EXEMPT - &#39;63&#39; # WITHHOLD NORMAL MODE BUT IMMUNE - &#39;64&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR LEGAL REASON - &#39;65&#39; # WITHHOLD NORMAL MODE BUT SUSPENDED FOR ADMINISTRATIVE REASON - &#39;66&#39; # WITHHOLD FORCED MODE - &#39;67&#39; # WITHHOLD FORCED MODE BUT EXEMPT - &#39;68&#39; # WITHHOLD FORCED MODE BUT IMMUNE - &#39;69&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR LEGAL REASON - &#39;70&#39; # WITHHOLD FORCED MODE BUT SUSPENDED FOR ADMINISTRATIVE PROCESS - &#39;71&#39; # NO WITHHOLD MODE - &#39;72&#39; # NO WITHHOLD FOREIGN MODE </value>
        [DataMember(Name = "cstRf", EmitDefaultValue = false)]
        public CstRfEnum? CstRf { get; set; }

        /// <summary>
        /// This string is a unique identifier for this line in the transaction
        /// </summary>
        /// <value>This string is a unique identifier for this line in the transaction</value>
        [DataMember(Name = "lineCode", EmitDefaultValue = false)]
        public int? LineCode { get; set; }

        /// <summary>
        /// This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU.
        /// </summary>
        /// <value>This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU.</value>
        [DataMember(Name = "itemCode", EmitDefaultValue = false)]
        public string ItemCode { get; set; }

        /// <summary>
        /// This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
        /// </summary>
        /// <value>This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1</value>
        [DataMember(Name = "numberOfItems", EmitDefaultValue = false)]
        public double? NumberOfItems { get; set; }

        /// <summary>
        /// This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).
        /// </summary>
        /// <value>This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).</value>
        [DataMember(Name = "lineAmount", EmitDefaultValue = false)]
        public double? LineAmount { get; set; }

        /// <summary>
        /// This string captures the description of the item represented by this line, will be used LC 116
        /// </summary>
        /// <value>This string captures the description of the item represented by this line, will be used LC 116</value>
        [DataMember(Name = "itemDescription", EmitDefaultValue = false)]
        public string ItemDescription { get; set; }

        /// <summary>
        /// Conditional discount
        /// </summary>
        /// <value>Conditional discount</value>
        [DataMember(Name = "lineTaxedDiscount", EmitDefaultValue = false)]
        public double? LineTaxedDiscount { get; set; }

        /// <summary>
        /// Unconditional discount
        /// </summary>
        /// <value>Unconditional discount</value>
        [DataMember(Name = "lineUntaxedDiscount", EmitDefaultValue = false)]
        public double? LineUntaxedDiscount { get; set; }

        /// <summary>
        /// Service w/labor assignment Serviço com cessão de mão de obra 
        /// </summary>
        /// <value>Service w/labor assignment Serviço com cessão de mão de obra </value>
        [DataMember(Name = "withLaborAssignment", EmitDefaultValue = false)]
        public bool? WithLaborAssignment { get; set; }

        /// <summary>
        /// Gets or Sets TaxDeductions
        /// </summary>
        [DataMember(Name = "taxDeductions", EmitDefaultValue = false)]
        public SalesLinesOutTaxDeductions TaxDeductions { get; set; }

        /// <summary>
        /// AGAST CODE for itemCode
        /// </summary>
        /// <value>AGAST CODE for itemCode</value>
        [DataMember(Name = "avalaraGoodsAndServicesType", EmitDefaultValue = false)]
        public string AvalaraGoodsAndServicesType { get; set; }

        /// <summary>
        /// This decimal captures the total cost of this line. In its simplest form lineNetValue &#x3D; (lineAmount - discountTaxable - sum of whithholdings).
        /// </summary>
        /// <value>This decimal captures the total cost of this line. In its simplest form lineNetValue &#x3D; (lineAmount - discountTaxable - sum of whithholdings).</value>
        [DataMember(Name = "lineNetValue", EmitDefaultValue = false)]
        public double? LineNetValue { get; set; }



        /// <summary>
        /// Gets or Sets CalculatedTax
        /// </summary>
        [DataMember(Name = "calculatedTax", EmitDefaultValue = false)]
        public SalesCalculatedTax CalculatedTax { get; set; }
    }
}