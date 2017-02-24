=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::CompanyTaxRatesApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CompanyTaxRatesApi' do
  before do
    # run before each test
    @instance = SwaggerClient::CompanyTaxRatesApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CompanyTaxRatesApi' do
    it 'should create an instact of CompanyTaxRatesApi' do
      expect(@instance).to be_instance_of(SwaggerClient::CompanyTaxRatesApi)
    end
  end

  # unit tests for companies_company_id_taxrates_get
  # 
  # This operation return custom agast configurations that match with parameters queries 
  # @param company_id Company ID
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100).
  # @option opts [Integer] :x_pagination_current_page The current page. Defaults to 1.
  # @option opts [String] :x_pagination_sort 
  # @return [Array<CustomTaxTypeRate>]
  describe 'companies_company_id_taxrates_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for companies_company_id_taxrates_tax_type_get
  # 
  # This operation return custom agast configurations that match with parameters queries 
  # @param company_id Company ID
  # @param tax_type Tax Type
  # @param [Hash] opts the optional parameters
  # @return [CustomTaxTypeRate]
  describe 'companies_company_id_taxrates_tax_type_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_custom_taxes
  # Create custom agast for one company
  # This method operation create a custom agast for one company 
  # @param company_id Company ID
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse201]
  describe 'create_custom_taxes test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_custom_taxes
  # 
  # 
  # @param company_id Company ID
  # @param tax_type Tax Type
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_custom_taxes test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_custom_taxes
  # Update custom agast for one company
  # This method operation create a custom agast for one company 
  # @param company_id Company ID
  # @param tax_type Tax Type
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'update_custom_taxes test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
