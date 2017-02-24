/* 
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using IO.Swagger.Client;
using IO.Swagger.Api;
using IO.Swagger.Model;

namespace IO.Swagger.Test
{
    /// <summary>
    ///  Class for testing TaxConfIBPTApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class TaxConfIBPTApiTests
    {
        private TaxConfIBPTApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new TaxConfIBPTApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of TaxConfIBPTApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' TaxConfIBPTApi
            //Assert.IsInstanceOfType(typeof(TaxConfIBPTApi), instance, "instance is a TaxConfIBPTApi");
        }

        
        /// <summary>
        /// Test CreateIbptConf
        /// </summary>
        [Test]
        public void CreateIbptConfTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //IbptConf taxconfprocess = null;
            //var response = instance.CreateIbptConf(taxconfprocess);
            //Assert.IsInstanceOf<InlineResponse201> (response, "response is InlineResponse201");
        }
        
        /// <summary>
        /// Test DeleteIbptConf
        /// </summary>
        [Test]
        public void DeleteIbptConfTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //instance.DeleteIbptConf(code);
            
        }
        
        /// <summary>
        /// Test GetIbptConf
        /// </summary>
        [Test]
        public void GetIbptConfTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //var response = instance.GetIbptConf(code);
            //Assert.IsInstanceOf<IbptConf> (response, "response is IbptConf");
        }
        
        /// <summary>
        /// Test GetIbptConfList
        /// </summary>
        [Test]
        public void GetIbptConfListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accountId = null;
            //DateTime? date = null;
            //bool? inactive = null;
            //var response = instance.GetIbptConfList(accountId, date, inactive);
            //Assert.IsInstanceOf<List<IbptConf>> (response, "response is List<IbptConf>");
        }
        
        /// <summary>
        /// Test UpdateIbptConf
        /// </summary>
        [Test]
        public void UpdateIbptConfTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //IbptConf taxconfprocess = null;
            //instance.UpdateIbptConf(code, taxconfprocess);
            
        }
        
    }

}
