=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::CustomProcessScenario
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CustomProcessScenario' do
  before do
    # run before each test
    @instance = SwaggerClient::CustomProcessScenario.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CustomProcessScenario' do
    it 'should create an instact of CustomProcessScenario' do
      expect(@instance).to be_instance_of(SwaggerClient::CustomProcessScenario)
    end
  end
  describe 'test attribute "code"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "stock_impact"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "financial_impact"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "cst_ipi"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["50", "51", "52", "53", "54"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.cst_ipi = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "ipi_legal_tax_class"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "accruable_pis_taxation"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["T", "Z", "E", "H", "N"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.accruable_pis_taxation = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "pis_exempt_legal_reason_code"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "pis_exempt_legal_reason"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "accruable_cofins_taxation"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["T", "Z", "E", "H", "N"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.accruable_cofins_taxation = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "cofins_exempt_legal_reason_code"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "cofins_exempt_legal_reason"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "allow_ip_icredit_when_in_going"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "icms_conf"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "name"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["SALES", "PURCHASE", "SALES_RETURN", "PURCHASE_RETURN", "TRANSFER_RETURN", "SHIPPING", "SHIPPING_RETURN", "TRANSFER", "RECEIPT_AJUSTE", "TRANSFER_AJUSTE"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "way_type"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["in", "out"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.way_type = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "goal"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["Normal", "Complementary", "Voided", "Replacement", "Return", "Adjustment"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.goal = value }.not_to raise_error
       #end
    end
  end

  describe 'test attribute "over_write_cfop"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "cfops"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "company_id"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
