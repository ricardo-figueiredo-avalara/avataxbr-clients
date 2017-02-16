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
    ///  Class for testing AccountApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Swagger Codegen.
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class AccountApiTests
    {
        private AccountApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new AccountApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of AccountApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' AccountApi
            //Assert.IsInstanceOfType(typeof(AccountApi), instance, "instance is a AccountApi");
        }

        
        /// <summary>
        /// Test AccountsAccountIdCompaniesGet
        /// </summary>
        [Test]
        public void AccountsAccountIdCompaniesGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? accountId = null;
            //var response = instance.AccountsAccountIdCompaniesGet(accountId);
            //Assert.IsInstanceOf<List<AccountCompany>> (response, "response is List<AccountCompany>");
        }
        
        /// <summary>
        /// Test CreateAccountCompany
        /// </summary>
        [Test]
        public void CreateAccountCompanyTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid? accountId = null;
            //Body body = null;
            //var response = instance.CreateAccountCompany(accountId, body);
            //Assert.IsInstanceOf<InlineResponse201> (response, "response is InlineResponse201");
        }
        
    }

}