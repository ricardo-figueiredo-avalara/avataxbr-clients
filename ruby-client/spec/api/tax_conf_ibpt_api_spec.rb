=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::TaxConfIBPTApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'TaxConfIBPTApi' do
  before do
    # run before each test
    @instance = SwaggerClient::TaxConfIBPTApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TaxConfIBPTApi' do
    it 'should create an instact of TaxConfIBPTApi' do
      expect(@instance).to be_instance_of(SwaggerClient::TaxConfIBPTApi)
    end
  end

  # unit tests for create_ibpt_conf
  # create a new Process Type configuration
  # 
  # @param taxconfprocess The pet JSON you want to post
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse201]
  describe 'create_ibpt_conf test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_ibpt_conf
  # disable a IBPT.
  # 
  # @param code IBPT Code
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_ibpt_conf test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_ibpt_conf
  # get IBPT information.
  # This operation return Process Type configuration 
  # @param code IBPT Code
  # @param [Hash] opts the optional parameters
  # @return [IbptConf]
  describe 'get_ibpt_conf test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_ibpt_conf_list
  # retrive list of IBPT.
  # This operation return Process Type configurations that match with parameters queries 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :account_id filter the configuration by accountID, if not informed, only the standard configuration will be returned 
  # @option opts [Date] :date When informed return valid version configuration for this date 
  # @option opts [BOOLEAN] :inactive return the inactive versions too 
  # @return [Array<IbptConf>]
  describe 'get_ibpt_conf_list test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_ibpt_conf
  # update a Process Type configuration
  # 
  # @param code IBPT Code
  # @param taxconfprocess The pet JSON you want to post
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'update_ibpt_conf test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end