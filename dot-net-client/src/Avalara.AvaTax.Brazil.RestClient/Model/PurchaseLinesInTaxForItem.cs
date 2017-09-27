using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// This structure is mandatory when doesn&#39;t have itemCode (SKU), usually the companies doesn&#39;t have the services to buy mapped. Optionally teh service can be consumed sending serviceAgast and the service code on the company city 
    /// </summary>
    [DataContract]
    public class PurchaseLinesInTaxForItem
    {
        /// <summary>
        /// Service Agast code for this ite, the Service AGAST code has Federal Jurisdiction
        /// </summary>
        /// <value>Service Agast code for this ite, the Service AGAST code has Federal Jurisdiction</value>
        [DataMember(Name = "agastCode", EmitDefaultValue = false)]
        public string AgastCode { get; set; }

        /// <summary>
        /// Company city code service       When this information isn&#39;t available the rates for ISS are zero. 
        /// </summary>
        /// <value>Company city code service       When this information isn&#39;t available the rates for ISS are zero. </value>
        [DataMember(Name = "serviceCode", EmitDefaultValue = false)]
        public string ServiceCode { get; set; }
    }
}
