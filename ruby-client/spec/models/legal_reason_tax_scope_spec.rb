=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::LegalReasonTaxScope
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'LegalReasonTaxScope' do
  before do
    # run before each test
    @instance = SwaggerClient::LegalReasonTaxScope.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LegalReasonTaxScope' do
    it 'should create an instact of LegalReasonTaxScope' do
      expect(@instance).to be_instance_of(SwaggerClient::LegalReasonTaxScope)
    end
  end
  describe 'test attribute "tax_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["NONE", "INSS", "IRRF", "IRPJ", "PIS", "COFINS", "CSLL", "IPI", "ICMS", "II", "IOF", "ISS", "APROXTOTALTAX"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.tax_type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "specialized_tax_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.specialized_tax_type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "jurisdiction_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["NONE", "City", "State", "Country"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.jurisdiction_type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "jurisdiction_ibge_code"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

