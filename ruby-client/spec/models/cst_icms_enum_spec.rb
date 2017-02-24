=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerClient::CstIcmsEnum
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'CstIcmsEnum' do
  before do
    # run before each test
    @instance = SwaggerClient::CstIcmsEnum.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of CstIcmsEnum' do
    it 'should create an instact of CstIcmsEnum' do
      expect(@instance).to be_instance_of(SwaggerClient::CstIcmsEnum)
    end
  end
end

