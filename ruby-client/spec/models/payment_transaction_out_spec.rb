=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::PaymentTransactionOut
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'PaymentTransactionOut' do
  before do
    # run before each test
    @instance = SwaggerClient::PaymentTransactionOut.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of PaymentTransactionOut' do
    it 'should create an instact of PaymentTransactionOut' do
      expect(@instance).to be_instance_of(SwaggerClient::PaymentTransactionOut)
    end
  end
  describe 'test attribute "header"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "lines"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "calculated_tax_summary"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "processing_info"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

