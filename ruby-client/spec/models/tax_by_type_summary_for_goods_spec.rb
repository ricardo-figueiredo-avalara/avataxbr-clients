=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::TaxByTypeSummaryForGoods
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'TaxByTypeSummaryForGoods' do
  before do
    # run before each test
    @instance = SwaggerClient::TaxByTypeSummaryForGoods.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TaxByTypeSummaryForGoods' do
    it 'should create an instact of TaxByTypeSummaryForGoods' do
      expect(@instance).to be_instance_of(SwaggerClient::TaxByTypeSummaryForGoods)
    end
  end
  describe 'test attribute "calcbase"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "tax"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "jurisdictions"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

