=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::TaxByTypeSummaryJurisdiction
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'TaxByTypeSummaryJurisdiction' do
  before do
    # run before each test
    @instance = SwaggerClient::TaxByTypeSummaryJurisdiction.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TaxByTypeSummaryJurisdiction' do
    it 'should create an instact of TaxByTypeSummaryJurisdiction' do
      expect(@instance).to be_instance_of(SwaggerClient::TaxByTypeSummaryJurisdiction)
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
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["City", "State", "Country"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.jurisdiction_type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "tax"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
