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
    ///  Class for testing InvoiceSettingsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class InvoiceSettingsApiTests
    {
        private InvoiceSettingsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new InvoiceSettingsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of InvoiceSettingsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' InvoiceSettingsApi
            //Assert.IsInstanceOfType(typeof(InvoiceSettingsApi), instance, "instance is a InvoiceSettingsApi");
        }

        
        /// <summary>
        /// Test InvoiceSettings
        /// </summary>
        [Test]
        public void InvoiceSettingsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.InvoiceSettings();
            //Assert.IsInstanceOf<InlineResponse2004> (response, "response is InlineResponse2004");
        }
        
    }

}
