/* 
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
    ///  Class for testing TaxConfProcessApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class TaxConfProcessApiTests
    {
        private TaxConfProcessApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new TaxConfProcessApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of TaxConfProcessApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' TaxConfProcessApi
            //Assert.IsInstanceOfType(typeof(TaxConfProcessApi), instance, "instance is a TaxConfProcessApi");
        }

        
        /// <summary>
        /// Test CreateProcess
        /// </summary>
        [Test]
        public void CreateProcessTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //ProcessScenario taxconfprocess = null;
            //var response = instance.CreateProcess(taxconfprocess);
            //Assert.IsInstanceOf<InlineResponse201> (response, "response is InlineResponse201");
        }
        
        /// <summary>
        /// Test DeleteProcess
        /// </summary>
        [Test]
        public void DeleteProcessTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //instance.DeleteProcess(code);
            
        }
        
        /// <summary>
        /// Test GetProcess
        /// </summary>
        [Test]
        public void GetProcessTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //var response = instance.GetProcess(code);
            //Assert.IsInstanceOf<ProcessScenario> (response, "response is ProcessScenario");
        }
        
        /// <summary>
        /// Test GetProcessList
        /// </summary>
        [Test]
        public void GetProcessListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string accountId = null;
            //DateTime? date = null;
            //bool? inactive = null;
            //var response = instance.GetProcessList(accountId, date, inactive);
            //Assert.IsInstanceOf<List<ProcessScenario>> (response, "response is List<ProcessScenario>");
        }
        
        /// <summary>
        /// Test UpdateProcess
        /// </summary>
        [Test]
        public void UpdateProcessTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //ProcessScenario taxconfprocess = null;
            //instance.UpdateProcess(code, taxconfprocess);
            
        }
        
    }

}
