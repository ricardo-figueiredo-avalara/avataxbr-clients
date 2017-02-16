=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::LineForGoodsIcmsTaxRelief
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'LineForGoodsIcmsTaxRelief' do
  before do
    # run before each test
    @instance = SwaggerClient::LineForGoodsIcmsTaxRelief.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LineForGoodsIcmsTaxRelief' do
    it 'should create an instact of LineForGoodsIcmsTaxRelief' do
      expect(@instance).to be_instance_of(SwaggerClient::LineForGoodsIcmsTaxRelief)
    end
  end
  describe 'test attribute "icms_tax_relief_reason_code"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "icms_relief_tax_rate"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "icms_relief_tax_amount"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
