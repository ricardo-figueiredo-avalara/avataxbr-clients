=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::AuthApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AuthApi' do
  before do
    # run before each test
    @instance = SwaggerClient::AuthApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AuthApi' do
    it 'should create an instact of AuthApi' do
      expect(@instance).to be_instance_of(SwaggerClient::AuthApi)
    end
  end

  # unit tests for auth_post
  # authorization
  # Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 
  # @param authorization Authorization: Basic VGVzdDoxMjM&#x3D; 
  # @param [Hash] opts the optional parameters
  # @return [InlineResponse200]
  describe 'auth_post test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
