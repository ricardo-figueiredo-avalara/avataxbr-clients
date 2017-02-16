=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::IcmsTaxConfBase
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'IcmsTaxConfBase' do
  before do
    # run before each test
    @instance = SwaggerClient::IcmsTaxConfBase.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of IcmsTaxConfBase' do
    it 'should create an instact of IcmsTaxConfBase' do
      expect(@instance).to be_instance_of(SwaggerClient::IcmsTaxConfBase)
    end
  end
  describe 'test attribute "state"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "icms_cst"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["00", "20", "40", "41", "50"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.icms_cst = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "message_code"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

