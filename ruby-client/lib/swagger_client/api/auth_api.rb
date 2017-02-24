=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class AuthApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # authorization
    # Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 
    # @param authorization Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded. 
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse200]
    def auth_post(authorization, opts = {})
      data, _status_code, _headers = auth_post_with_http_info(authorization, opts)
      return data
    end

    # authorization
    # Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 
    # @param authorization Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded. 
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse200, Fixnum, Hash)>] InlineResponse200 data, response status code and response headers
    def auth_post_with_http_info(authorization, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AuthApi.auth_post ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling AuthApi.auth_post" if authorization.nil?
      # resource path
      local_var_path = "/auth".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])
      header_params[:'Authorization'] = authorization

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InlineResponse200')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AuthApi#auth_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # authorization
    # Authorization: Basic VGVzdDoxMjM=  Generate Base64:  - auth = \"{user}:{password}\"  - base = base64(auth)  - header[\"Authorization\"] = \"Basic \" + base 
    # @param authorization Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded. 
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse200]
    def v2_auth_post(authorization, opts = {})
      data, _status_code, _headers = v2_auth_post_with_http_info(authorization, opts)
      return data
    end

    # authorization
    # Authorization: Basic VGVzdDoxMjM&#x3D;  Generate Base64:  - auth &#x3D; \&quot;{user}:{password}\&quot;  - base &#x3D; base64(auth)  - header[\&quot;Authorization\&quot;] &#x3D; \&quot;Basic \&quot; + base 
    # @param authorization Accepts \&quot;Basic + hash\&quot;, where hash is {user}:{password} base64 encoded. 
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse200, Fixnum, Hash)>] InlineResponse200 data, response status code and response headers
    def v2_auth_post_with_http_info(authorization, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AuthApi.v2_auth_post ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling AuthApi.v2_auth_post" if authorization.nil?
      # resource path
      local_var_path = "/v2/auth".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])
      header_params[:'Authorization'] = authorization

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InlineResponse200')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AuthApi#v2_auth_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
