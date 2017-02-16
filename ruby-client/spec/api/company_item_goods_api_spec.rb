=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::CompanyItemGoodsApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CompanyItemGoodsApi' do
  before do
    # run before each test
    @instance = SwaggerClient::CompanyItemGoodsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CompanyItemGoodsApi' do
    it 'should create an instact of CompanyItemGoodsApi' do
      expect(@instance).to be_instance_of(SwaggerClient::CompanyItemGoodsApi)
    end
  end

  # unit tests for companies_company_id_items_code_change_code_put
  # 
  # Change the code of a given item. 
  # @param company_id Company ID
  # @param code Item Code
  # @param body Requisition
  # @param [Hash] opts the optional parameters
  # @option opts [String] :goods Provide to apply to goods items.
  # @option opts [String] :service Provide to apply to service items.
  # @return [nil]
  describe 'companies_company_id_items_code_change_code_put test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for companies_company_id_items_codegoods_get
  # 
  # This operation return custom agast configurations that match with parameters queries 
  # @param company_id Company ID
  # @param code Item Code
  # @param avalara_product_type Avalara Product Type
  # @param [Hash] opts the optional parameters
  # @option opts [String] :agast Custom Agast Code
  # @return [ItemGoods]
  describe 'companies_company_id_items_codegoods_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for companies_company_id_itemsgoods_get
  # 
  # This operation return custom agast configurations that match with parameters queries 
  # @param company_id Company ID
  # @param avalara_product_type Avalara Product Type
  # @param [Hash] opts the optional parameters
  # @option opts [Integer] :x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100).
  # @option opts [Integer] :x_pagination_current_page The current page. Defaults to 1.
  # @option opts [String] :x_pagination_sort 
  # @option opts [String] :code Item Code
  # @option opts [String] :agast Custom Agast Code
  # @return [Array<ItemGoods>]
  describe 'companies_company_id_itemsgoods_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for create_item
  # Create custom agast for one company
  # This method operation create a custom agast for one company 
  # @param company_id Company ID
  # @param avalara_product_type Avalara Product Type
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse201]
  describe 'create_item test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_item
  # 
  # 
  # @param company_id Company ID
  # @param code Item Code
  # @param avalara_product_type Avalara Product Type
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_item test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_item
  # Update custom agast for one company
  # This method operation create a custom agast for one company 
  # @param company_id Company ID
  # @param code Item Code
  # @param avalara_product_type Avalara Product Type
  # @param body Transaction Message
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'update_item test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end