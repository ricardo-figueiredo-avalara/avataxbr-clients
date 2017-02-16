=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::InvoiceSEFAZApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'InvoiceSEFAZApi' do
  before do
    # run before each test
    @instance = SwaggerClient::InvoiceSEFAZApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of InvoiceSEFAZApi' do
    it 'should create an instact of InvoiceSEFAZApi' do
      expect(@instance).to be_instance_of(SwaggerClient::InvoiceSEFAZApi)
    end
  end

  # unit tests for invoices_sefaz_delete
  # Disable Range e-Invoice
  # Send disable range of NFes to SEFAZ 
  # @param authorization Bearer {auth}
  # @param body Disable Range e-Invoice
  # @param [Hash] opts the optional parameters
  # @return [SefazInvoiceBasicStatus]
  describe 'invoices_sefaz_delete test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for invoices_sefaz_key_delete
  # Cancel invoice
  # Cancel the invoice
  # @param authorization Bearer {auth}
  # @param key Invoice Key
  # @param body Cancel Message
  # @param [Hash] opts the optional parameters
  # @return [SefazInvoiceBasicStatus]
  describe 'invoices_sefaz_key_delete test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for invoices_sefaz_key_get
  # Retrieve invoice
  # Retrieve the invoice
  # @param authorization Bearer {auth}
  # @param key Invoice Key
  # @param [Hash] opts the optional parameters
  # @return [SefazItGetOut]
  describe 'invoices_sefaz_key_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for invoices_sefaz_key_lookup_get
  # Retrieve invoice
  # Retrieve the invoice
  # @param authorization Bearer {auth}
  # @param key Invoice Key
  # @param [Hash] opts the optional parameters
  # @return [TransactionForSefazGoodsList]
  describe 'invoices_sefaz_key_lookup_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for invoices_sefaz_key_put
  # Fix Letter
  # Fix Letter
  # @param authorization Bearer {auth}
  # @param key Invoice Key
  # @param body Fix Message
  # @param [Hash] opts the optional parameters
  # @return [SefazInvoiceBasicStatus]
  describe 'invoices_sefaz_key_put test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for invoices_sefaz_post
  # Send an e-Invoice
  # Send a invoice to SEFAZ 
  # @param authorization Bearer {auth}
  # @param body Invoices
  # @param [Hash] opts the optional parameters
  # @return [SefazPostOut]
  describe 'invoices_sefaz_post test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for invoices_sefaz_status_get
  # Retrieve Status of SEFAZ Server
  # Retrieve Status of SEFAZ Server
  # @param authorization Bearer {auth}
  # @param [Hash] opts the optional parameters
  # @return [String]
  describe 'invoices_sefaz_status_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end