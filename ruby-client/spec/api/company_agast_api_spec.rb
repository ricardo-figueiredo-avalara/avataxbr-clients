=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::CompanyAGASTApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CompanyAGASTApi' do
  before do
    # run before each test
    @instance = SwaggerClient::CompanyAGASTApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CompanyAGASTApi' do
    it 'should create an instact of CompanyAGASTApi' do
      expect(@instance).to be_instance_of(SwaggerClient::CompanyAGASTApi)
    end
  end

  # unit tests for companies_company_id_agasts_code_get
  # 
  # This operation return custom agast configurations that match with parameters queries - Alannes. 
  # @param company_id Company ID
  # @param code Agast Code
  # @param [Hash] opts the optional parameters
  # @option opts [String] :parent Agast parent code, means that this agast is a specialization of parent agast 
  # @return [CustomAgast]
  describe 'companies_company_id_agasts_code_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for companies_company_id_agasts_get
  # 
  # This operation return custom agast configurations that match with parameters queries 
  # @param company_id Company ID
  # @param [Hash] opts the optional parameters
  # @option opts [String] :text Text query
  # @option opts [Integer] :x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100).
  # @option opts [Integer] :x_pagination_current_page The current page. Defaults to 1.
  # @option opts [String] :x_pagination_sort 
  # @option opts [String] :agast Custom Agast Code
  # @option opts [String] :parent Agast Code
  # @return [Array<InlineResponse2001>]
  describe 'companies_company_id_agasts_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_custom_agast
  # Create custom agast for one company
  # This method operation create a custom agast for one company 
  # @param company_id Company ID
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @option opts [String] :text Text query
  # @return [InlineResponse201]
  describe 'create_custom_agast test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_agast
  # 
  # 
  # @param company_id Company ID
  # @param code Agast Code
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_agast test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_custom_agast
  # Update custom agast for one company
  # This method operation create a custom agast for one company 
  # @param company_id Company ID
  # @param code Agast Code
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'update_custom_agast test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end