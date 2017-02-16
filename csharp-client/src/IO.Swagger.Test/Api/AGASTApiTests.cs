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
    ///  Class for testing AGASTApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AGASTApiTests
    {
        private AGASTApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AGASTApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AGASTApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AGASTApi
            //Assert.IsInstanceOfType(typeof(AGASTApi), instance, "instance is a AGASTApi");
        }

        
        /// <summary>
        /// Test AgastsCodeGet
        /// </summary>
        [Test]
        public void AgastsCodeGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //var response = instance.AgastsCodeGet(code);
            //Assert.IsInstanceOf<Agast> (response, "response is Agast");
        }
        
        /// <summary>
        /// Test CreateAgast
        /// </summary>
        [Test]
        public void CreateAgastTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Agast body = null;
            //var response = instance.CreateAgast(body);
            //Assert.IsInstanceOf<InlineResponse201> (response, "response is InlineResponse201");
        }
        
        /// <summary>
        /// Test DeleteAgast
        /// </summary>
        [Test]
        public void DeleteAgastTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //instance.DeleteAgast(code);
            
        }
        
        /// <summary>
        /// Test GetAgastList
        /// </summary>
        [Test]
        public void GetAgastListTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string text = null;
            //var response = instance.GetAgastList(text);
            //Assert.IsInstanceOf<List<InlineResponse2001>> (response, "response is List<InlineResponse2001>");
        }
        
        /// <summary>
        /// Test UpdateAgast
        /// </summary>
        [Test]
        public void UpdateAgastTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string code = null;
            //Agast body = null;
            //instance.UpdateAgast(code, body);
            
        }
        
    }

}