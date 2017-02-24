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
    ///  Class for testing GoodsTransactionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class GoodsTransactionsApiTests
    {
        private GoodsTransactionsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new GoodsTransactionsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of GoodsTransactionsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' GoodsTransactionsApi
            //Assert.IsInstanceOfType(typeof(GoodsTransactionsApi), instance, "instance is a GoodsTransactionsApi");
        }

        
        /// <summary>
        /// Test TransactionsgoodsPurchasePost
        /// </summary>
        [Test]
        public void TransactionsgoodsPurchasePostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //TransactionForGoodsIn body = null;
            //var response = instance.TransactionsgoodsPurchasePost(authorization, body);
            //Assert.IsInstanceOf<TransactionForGoodsOut> (response, "response is TransactionForGoodsOut");
        }
        
        /// <summary>
        /// Test TransactionsgoodsSalesPost
        /// </summary>
        [Test]
        public void TransactionsgoodsSalesPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string authorization = null;
            //TransactionForGoodsIn body = null;
            //var response = instance.TransactionsgoodsSalesPost(authorization, body);
            //Assert.IsInstanceOf<TransactionForGoodsOut> (response, "response is TransactionForGoodsOut");
        }
        
    }

}
