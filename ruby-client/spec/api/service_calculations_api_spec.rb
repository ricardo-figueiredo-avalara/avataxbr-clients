=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::ServiceCalculationsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'ServiceCalculationsApi' do
  before do
    # run before each test
    @instance = SwaggerClient::ServiceCalculationsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ServiceCalculationsApi' do
    it 'should create an instact of ServiceCalculationsApi' do
      expect(@instance).to be_instance_of(SwaggerClient::ServiceCalculationsApi)
    end
  end

  # unit tests for calculations_account_account_id_company_company_code_transaction_type_document_code_get
  # Retrieve transactions
  # Retrieve a single transaction
  # @param authorization Bearer {auth}
  # @param account_id Account ID
  # @param company_code Company Code
  # @param transaction_type Transaction Type (sale, purchase, receipts or payment)
  # @param document_code Document Code
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'calculations_account_account_id_company_company_code_transaction_type_document_code_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post
  # Promote a calculation to transaction
  # Promote a calculation to transaction
  # @param authorization Bearer {auth}
  # @param account_id Account ID
  # @param company_code Company Code
  # @param transaction_type Transaction Type (sale, purchase, receipts or payment)
  # @param document_code Document Code
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calculations_account_account_id_company_company_code_transaction_type_get
  # Retrieve transactions
  # Retrieve a list of transactions
  # @param authorization Bearer {auth}
  # @param account_id Account ID
  # @param company_code Company Code
  # @param transaction_type Transaction Type (sale, purchase, receipts or payment)
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'calculations_account_account_id_company_company_code_transaction_type_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calculationsservice_payment_post
  # Calculation Method
  # Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
  # @param authorization Bearer {auth}
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [PaymentTransactionOut]
  describe 'calculationsservice_payment_post test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calculationsservice_purchase_post
  # Calculation Method
  # Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
  # @param authorization Bearer {auth}
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [PurchaseTransactionOut]
  describe 'calculationsservice_purchase_post test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calculationsservice_receipt_post
  # Calculation Method
  # Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
  # @param authorization Bearer {auth}
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [ReceiptTransactionOut]
  describe 'calculationsservice_receipt_post test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for calculationsservice_sales_post
  # Calculation Method
  # Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
  # @param authorization Bearer {auth}
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [SalesTransactionOut]
  describe 'calculationsservice_sales_post test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end