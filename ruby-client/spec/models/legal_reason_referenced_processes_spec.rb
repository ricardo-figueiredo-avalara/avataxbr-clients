=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::LegalReasonReferencedProcesses
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'LegalReasonReferencedProcesses' do
  before do
    # run before each test
    @instance = SwaggerClient::LegalReasonReferencedProcesses.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of LegalReasonReferencedProcesses' do
    it 'should create an instact of LegalReasonReferencedProcesses' do
      expect(@instance).to be_instance_of(SwaggerClient::LegalReasonReferencedProcesses)
    end
  end
  describe 'test attribute "n_proc"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "ind_proc"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
       #validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["0", "1", "2", "3", "9"])
       #validator.allowable_values.each do |value|
       #  expect { @instance.ind_proc = value }.not_to raise_error
       #end
    end
  end

end

