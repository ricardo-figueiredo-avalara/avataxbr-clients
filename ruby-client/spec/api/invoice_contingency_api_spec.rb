=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::InvoiceContingencyApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'InvoiceContingencyApi' do
  before do
    # run before each test
    @instance = SwaggerClient::InvoiceContingencyApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of InvoiceContingencyApi' do
    it 'should create an instact of InvoiceContingencyApi' do
      expect(@instance).to be_instance_of(SwaggerClient::InvoiceContingencyApi)
    end
  end

  # unit tests for invoice_drop_contingency
  # Invoice Drop Contingency per State
  # Drop State in Contingency
  # @param state Brazilian State
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'invoice_drop_contingency test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for invoice_set_contingency
  # Invoice Set Contingency per State
  # Set State in Contingency
  # @param state Brazilian State
  # @param body Set Contingency
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'invoice_set_contingency test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for invoice_verify_contingency
  # Invoice Verify Contingency per State
  # Check if State was in Contingency
  # @param state Brazilian State
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse2003]
  describe 'invoice_verify_contingency test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end