=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::InvoiceSettingsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'InvoiceSettingsApi' do
  before do
    # run before each test
    @instance = SwaggerClient::InvoiceSettingsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of InvoiceSettingsApi' do
    it 'should create an instact of InvoiceSettingsApi' do
      expect(@instance).to be_instance_of(SwaggerClient::InvoiceSettingsApi)
    end
  end

  # unit tests for invoice_settings
  # Invoice Settigns
  # Get Enviroment Settigns
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse2004]
  describe 'invoice_settings test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
