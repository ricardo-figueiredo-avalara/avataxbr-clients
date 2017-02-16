=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::PurchaseTaxByTypeDetail
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PurchaseTaxByTypeDetail' do
  before do
    # run before each test
    @instance = SwaggerClient::PurchaseTaxByTypeDetail.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PurchaseTaxByTypeDetail' do
    it 'should create an instact of PurchaseTaxByTypeDetail' do
      expect(@instance).to be_instance_of(SwaggerClient::PurchaseTaxByTypeDetail)
    end
  end
  describe 'test attribute "location_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "jurisdiction_name"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "jurisdiction_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["city", "state", "country"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.jurisdiction_type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "tax_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["pis", "pisRf", "cofins", "cofinsRf", "csll", "csllRf", "irrf", "inssAr", "inssRf", "issRf"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.tax_type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "rate_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "scenario"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "subtotal_taxable"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "subtotal_exempt"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "rate"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "tax"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "exemption_code"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "significant_locations"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "tax_rule_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["SELLER", "BUYER", "TRANSACTION", "ITEM", "TAX"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.tax_rule_type = value }.not_to raise_error
       #end
    end
  end

end

