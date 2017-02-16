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
    ///  Class for testing CompanyLocationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class CompanyLocationApiTests
    {
        private CompanyLocationApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new CompanyLocationApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of CompanyLocationApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' CompanyLocationApi
            //Assert.IsInstanceOfType(typeof(CompanyLocationApi), instance, "instance is a CompanyLocationApi");
        }

        
        /// <summary>
        /// Test CompaniesCompanyIdLocationsCodeGet
        /// </summary>
        [Test]
        public void CompaniesCompanyIdLocationsCodeGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //string code = null;
            //var response = instance.CompaniesCompanyIdLocationsCodeGet(companyId, code);
            //Assert.IsInstanceOf<Location> (response, "response is Location");
        }
        
        /// <summary>
        /// Test CompaniesCompanyIdLocationsGet
        /// </summary>
        [Test]
        public void CompaniesCompanyIdLocationsGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //int? xPaginationLimit = null;
            //int? xPaginationCurrentPage = null;
            //string xPaginationSort = null;
            //var response = instance.CompaniesCompanyIdLocationsGet(companyId, xPaginationLimit, xPaginationCurrentPage, xPaginationSort);
            //Assert.IsInstanceOf<List<Location>> (response, "response is List<Location>");
        }
        
        /// <summary>
        /// Test CreateLocation
        /// </summary>
        [Test]
        public void CreateLocationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //Location body = null;
            //var response = instance.CreateLocation(companyId, body);
            //Assert.IsInstanceOf<InlineResponse201> (response, "response is InlineResponse201");
        }
        
        /// <summary>
        /// Test DeleteLocation
        /// </summary>
        [Test]
        public void DeleteLocationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //string code = null;
            //instance.DeleteLocation(companyId, code);
            
        }
        
        /// <summary>
        /// Test UpdateLocation
        /// </summary>
        [Test]
        public void UpdateLocationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? companyId = null;
            //string code = null;
            //Location body = null;
            //instance.UpdateLocation(companyId, code, body);
            
        }
        
    }

}