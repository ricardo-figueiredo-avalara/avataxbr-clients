=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::TaxConfISSApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'TaxConfISSApi' do
  before do
    # run before each test
    @instance = SwaggerClient::TaxConfISSApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of TaxConfISSApi' do
    it 'should create an instact of TaxConfISSApi' do
      expect(@instance).to be_instance_of(SwaggerClient::TaxConfISSApi)
    end
  end

  # unit tests for create_iss_conf_by_city
  # create a new ISS Configuration
  # 
  # @param iss_conf_by_city The pet JSON you want to post
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse201]
  describe 'create_iss_conf_by_city test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_iss_conf
  # disable a ISS by City Code.
  # 
  # @param city_code City Code
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_iss_conf test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_iss_conf_by_city
  # get ISS information by City Code.
  # This operation return configurations of ISS that match with parameters queries 
  # @param city_code City Code
  # @param [Hash] opts the optional parameters
  # @option opts [String] :code Identificator of this configuration, it is unique for account or standard namedspace 
  # @option opts [Date] :date When informed return valid version configuration for this date 
  # @option opts [BOOLEAN] :inactive return the inctives versions too 
  # @return [Array<IssConfByCity>]
  describe 'get_iss_conf_by_city test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_iss_list
  # retrive list of ISS
  # This operation return ISS configurations that match with parameters queries 
  # @param [Hash] opts the optional parameters
  # @option opts [String] :suffixcode Identify this ISS 
  # @option opts [Date] :date When informed return valid version configuration for this date 
  # @option opts [BOOLEAN] :inactive return the inactive versions too 
  # @return [Array<IssConfByCity>]
  describe 'get_iss_list test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for update_iss_conf_by_city
  # update a ISS by City Code.
  # 
  # @param city_code City Code
  # @param iss_conf_by_city The pet JSON you want to post
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'update_iss_conf_by_city test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end