using System.Runtime.Serialization;

namespace Avalara.AvaTax.Brazil.RestClient.Model
{
    /// <summary>
    /// SalesEntityBuild
    /// </summary>
    [DataContract]
    public class SalesEntityBuild
    {
        /// <summary>
        /// Business code. Código da obra OBRA
        /// </summary>
        /// <value>Business code. Código da obra OBRA</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia
        /// </summary>
        /// <value>technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia</value>
        [DataMember(Name = "art", EmitDefaultValue = false)]
        public string Art { get; set; }

        /// <summary>
        /// Número CEI da Obra
        /// </summary>
        /// <value>Número CEI da Obra</value>
        [DataMember(Name = "cei", EmitDefaultValue = false)]
        public string Cei { get; set; }

        /// <summary>
        /// Número de Matrícula da Obra
        /// </summary>
        /// <value>Número de Matrícula da Obra</value>
        [DataMember(Name = "number", EmitDefaultValue = false)]
        public string Number { get; set; }
    }
}
