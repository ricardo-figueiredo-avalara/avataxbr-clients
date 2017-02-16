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
    ///  Class for testing InvoiceNFeDANFEApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class InvoiceNFeDANFEApiTests
    {
        private InvoiceNFeDANFEApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new InvoiceNFeDANFEApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of InvoiceNFeDANFEApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' InvoiceNFeDANFEApi
            //Assert.IsInstanceOfType(typeof(InvoiceNFeDANFEApi), instance, "instance is a InvoiceNFeDANFEApi");
        }

        
        /// <summary>
        /// Test NfePrint
        /// </summary>
        [Test]
        public void NfePrintTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //string key = null;
            //var response = instance.NfePrint(authorization, key);
            //Assert.IsInstanceOf<System.IO.Stream> (response, "response is System.IO.Stream");
        }
        
    }

}