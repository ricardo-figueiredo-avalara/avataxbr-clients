=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::AccountApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AccountApi' do
  before do
    # run before each test
    @instance = SwaggerClient::AccountApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AccountApi' do
    it 'should create an instact of AccountApi' do
      expect(@instance).to be_instance_of(SwaggerClient::AccountApi)
    end
  end

  # unit tests for accounts_account_id_companies_get
  # Retrieve Companies by account
  # Retrieve list companies of one account
  # @param account_id Account ID
  # @param [Hash] opts the optional parameters
  # @return [Array<AccountCompany>]
  describe 'accounts_account_id_companies_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_account_company
  # Create company and your data configuration
  # This method operation create a company for a account 
  # @param account_id Account ID
  # @param body Company Code
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse201]
  describe 'create_account_company test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
