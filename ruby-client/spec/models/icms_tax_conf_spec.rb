=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::IcmsTaxConf
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'IcmsTaxConf' do
  before do
    # run before each test
    @instance = SwaggerClient::IcmsTaxConf.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of IcmsTaxConf' do
    it 'should create an instact of IcmsTaxConf' do
      expect(@instance).to be_instance_of(SwaggerClient::IcmsTaxConf)
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

  describe 'test attribute "relation_ship"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

