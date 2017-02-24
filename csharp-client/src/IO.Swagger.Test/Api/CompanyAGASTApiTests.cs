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
    ///  Class for testing CompanyAGASTApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CompanyAGASTApiTests
    {
        private CompanyAGASTApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CompanyAGASTApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CompanyAGASTApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CompanyAGASTApi
            //Assert.IsInstanceOfType(typeof(CompanyAGASTApi), instance, "instance is a CompanyAGASTApi");
        }

        
        /// <summary>
        /// Test CompaniesCompanyIdAgastsCodeGet
        /// </summary>
        [Test]
        public void CompaniesCompanyIdAgastsCodeGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //string code = null;
            //string parent = null;
            //var response = instance.CompaniesCompanyIdAgastsCodeGet(companyId, code, parent);
            //Assert.IsInstanceOf<CustomAgast> (response, "response is CustomAgast");
        }
        
        /// <summary>
        /// Test CompaniesCompanyIdAgastsGet
        /// </summary>
        [Test]
        public void CompaniesCompanyIdAgastsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //string text = null;
            //int? xPaginationLimit = null;
            //int? xPaginationCurrentPage = null;
            //string xPaginationSort = null;
            //string agast = null;
            //string parent = null;
            //var response = instance.CompaniesCompanyIdAgastsGet(companyId, text, xPaginationLimit, xPaginationCurrentPage, xPaginationSort, agast, parent);
            //Assert.IsInstanceOf<List<InlineResponse2001>> (response, "response is List<InlineResponse2001>");
        }
        
        /// <summary>
        /// Test CreateCustomAgast
        /// </summary>
        [Test]
        public void CreateCustomAgastTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //CustomAgast body = null;
            //string text = null;
            //var response = instance.CreateCustomAgast(companyId, body, text);
            //Assert.IsInstanceOf<InlineResponse201> (response, "response is InlineResponse201");
        }
        
        /// <summary>
        /// Test DeleteAgast
        /// </summary>
        [Test]
        public void DeleteAgastTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //string code = null;
            //instance.DeleteAgast(companyId, code);
            
        }
        
        /// <summary>
        /// Test UpdateCustomAgast
        /// </summary>
        [Test]
        public void UpdateCustomAgastTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //string code = null;
            //CustomAgast body = null;
            //instance.UpdateCustomAgast(companyId, code, body);
            
        }
        
    }

}
