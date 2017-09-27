using Avalara.AvaTax.Brazil.RestClient.Model.Enum;
using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesEntity
    /// </summary>
    [DataContract]
    public class SalesEntity
    {
        /// <summary>
        /// Entity Special Tax Regime  - &#39;MEM&#39; # Microempresa municipal - &#39;EST&#39; # Estimativa - &#39;SPR&#39; # Sociedade de profissionais - &#39;COP&#39; # Cooperativa - &#39;MEI&#39; # Microempresário Individual (MEI) - &#39;MPP&#39; # Microempresário e Empresa de Pequeno Porte (ME EPP) 
        /// </summary>
        /// <value>Entity Special Tax Regime  - &#39;MEM&#39; # Microempresa municipal - &#39;EST&#39; # Estimativa - &#39;SPR&#39; # Sociedade de profissionais - &#39;COP&#39; # Cooperativa - &#39;MEI&#39; # Microempresário Individual (MEI) - &#39;MPP&#39; # Microempresário e Empresa de Pequeno Porte (ME EPP) </value>
        [DataMember(Name = "specialTaxRegime", EmitDefaultValue = false)]
        public SpecialTaxRegimeEnum? SpecialTaxRegime { get; set; }

        /// <summary>
        /// SERVICE BUYER NAME OFFICIAL
        /// </summary>
        /// <value>SERVICE BUYER NAME OFFICIAL</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public EntityType Type { get; set; }

        /// <summary>
        /// Entity Email
        /// </summary>
        /// <value>Entity Email</value>
        [DataMember(Name = "email", EmitDefaultValue = false)]
        public string Email { get; set; }

        /// <summary>
        /// CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39;
        /// </summary>
        /// <value>CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39;</value>
        [DataMember(Name = "cnpjcpf", EmitDefaultValue = false)]
        public string Cnpjcpf { get; set; }

        /// <summary>
        /// City Tax ID
        /// </summary>
        /// <value>City Tax ID</value>
        [DataMember(Name = "cityTaxId", EmitDefaultValue = false)]
        public string CityTaxId { get; set; }

        /// <summary>
        /// State Tax ID
        /// </summary>
        /// <value>State Tax ID</value>
        [DataMember(Name = "stateTaxId", EmitDefaultValue = false)]
        public string StateTaxId { get; set; }

        /// <summary>
        /// Suframa ID
        /// </summary>
        /// <value>Suframa ID</value>
        [DataMember(Name = "suframa", EmitDefaultValue = false)]
        public string Suframa { get; set; }

        /// <summary>
        /// Entity Phone
        /// </summary>
        /// <value>Entity Phone</value>
        [DataMember(Name = "phone", EmitDefaultValue = false)]
        public string Phone { get; set; }

        /// <summary>
        /// Gets or Sets TaxRegime
        /// </summary>
        [DataMember(Name = "taxRegime", EmitDefaultValue = false)]
        public FederalTaxRegime TaxRegime { get; set; }


        /// <summary>
        /// Companies subject to rule follow same rule of Government
        /// </summary>
        /// <value>Companies subject to rule follow same rule of Government</value>
        [DataMember(Name = "subjectToSRF1234", EmitDefaultValue = false)]
        public bool? SubjectToSRF1234 { get; set; }

        /// <summary>
        /// If Withholding ISS is required, independently the rules applied.
        /// </summary>
        /// <value>If Withholding ISS is required, independently the rules applied.</value>
        [DataMember(Name = "requiredWithholdingISS", EmitDefaultValue = false)]
        public bool? RequiredWithholdingISS { get; set; }

        /// <summary>
        /// PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS
        /// </summary>
        /// <value>PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS</value>
        [DataMember(Name = "adminProcess", EmitDefaultValue = false)]
        public string AdminProcess { get; set; }

        /// <summary>
        /// Gets or Sets Build
        /// </summary>
        [DataMember(Name = "build", EmitDefaultValue = false)]
        public SalesEntityBuild Build { get; set; }
    }
}
