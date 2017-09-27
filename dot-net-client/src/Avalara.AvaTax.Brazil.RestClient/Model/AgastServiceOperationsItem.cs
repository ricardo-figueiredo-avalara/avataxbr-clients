using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// AgastServiceOperationsItem
    /// </summary>
    [DataContract]
    public class AgastServiceOperationsItem
    {
        /// <summary>
        /// Service Code in City
        /// </summary>
        /// <value>Service Code in City</value>
        [DataMember(Name = "serviceCode", EmitDefaultValue = false)]
        public string ServiceCode { get; set; }

        /// <summary>
        /// City Code (IBGE)
        /// </summary>
        /// <value>City Code (IBGE)</value>
        [DataMember(Name = "cityCode", EmitDefaultValue = false)]
        public long? CityCode { get; set; }

        /// <summary>
        /// AGAST Code
        /// </summary>
        /// <value>AGAST Code</value>
        [DataMember(Name = "agastCode", EmitDefaultValue = false)]
        public string AgastCode { get; set; }

        /// <summary>
        /// harmonized code, NCM or LC 116
        /// </summary>
        /// <value>harmonized code, NCM or LC 116</value>
        [DataMember(Name = "hsCode", EmitDefaultValue = false)]
        public string HsCode { get; set; }

        /// <summary>
        /// Service description
        /// </summary>
        /// <value>Service description</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Gets or Sets IssWhOriginUnregSeller
        /// </summary>
        [DataMember(Name = "issWhOriginUnregSeller", EmitDefaultValue = false)]
        public bool? IssWhOriginUnregSeller { get; set; }

        /// <summary>
        /// for service items with City Jurisdiction, inform where the ISS tax is due
        /// </summary>
        /// <value>for service items with City Jurisdiction, inform where the ISS tax is due</value>
        [DataMember(Name = "issDueatDestination", EmitDefaultValue = false)]
        public bool? IssDueatDestination { get; set; }

        /// <summary>
        /// Item subjecto to Payroll Tax Relief Item sujeito à desoneração de folha de pagamento 
        /// </summary>
        /// <value>Item subjecto to Payroll Tax Relief Item sujeito à desoneração de folha de pagamento </value>
        [DataMember(Name = "subjectPayrollTaxRelief", EmitDefaultValue = false)]
        public bool? SubjectPayrollTaxRelief { get; set; }

        /// <summary>
        /// Item subjecto to INSS Item sujeto à INSS 
        /// </summary>
        /// <value>Item subjecto to INSS Item sujeto à INSS </value>
        [DataMember(Name = "subjectToINSS", EmitDefaultValue = false)]
        public bool? SubjectToINSS { get; set; }

        /// <summary>
        /// Custom AGAST
        /// </summary>
        /// <value>Custom AGAST</value>
        [DataMember(Name = "customCompany", EmitDefaultValue = false)]
        public bool? CustomCompany { get; set; }
    }
}
