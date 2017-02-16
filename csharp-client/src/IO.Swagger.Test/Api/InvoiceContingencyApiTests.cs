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
    ///  Class for testing InvoiceContingencyApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class InvoiceContingencyApiTests
    {
        private InvoiceContingencyApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new InvoiceContingencyApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of InvoiceContingencyApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' InvoiceContingencyApi
            //Assert.IsInstanceOfType(typeof(InvoiceContingencyApi), instance, "instance is a InvoiceContingencyApi");
        }

        
        /// <summary>
        /// Test InvoiceDropContingency
        /// </summary>
        [Test]
        public void InvoiceDropContingencyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string state = null;
            //instance.InvoiceDropContingency(state);
            
        }
        
        /// <summary>
        /// Test InvoiceSetContingency
        /// </summary>
        [Test]
        public void InvoiceSetContingencyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string state = null;
            //Body4 body = null;
            //instance.InvoiceSetContingency(state, body);
            
        }
        
        /// <summary>
        /// Test InvoiceVerifyContingency
        /// </summary>
        [Test]
        public void InvoiceVerifyContingencyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string state = null;
            //var response = instance.InvoiceVerifyContingency(state);
            //Assert.IsInstanceOf<InlineResponse2003> (response, "response is InlineResponse2003");
        }
        
    }

}