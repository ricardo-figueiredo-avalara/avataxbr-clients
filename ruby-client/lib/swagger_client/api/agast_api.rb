=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class AGASTApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # 
    # This operation return agast configurations that match with parameters queries 
    # @param code Agast Code
    # @param [Hash] opts the optional parameters
    # @return [Agast]
    def agasts_code_get(code, opts = {})
      data, _status_code, _headers = agasts_code_get_with_http_info(code, opts)
      return data
    end

    # 
    # This operation return agast configurations that match with parameters queries 
    # @param code Agast Code
    # @param [Hash] opts the optional parameters
    # @return [Array<(Agast, Fixnum, Hash)>] Agast data, response status code and response headers
    def agasts_code_get_with_http_info(code, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AGASTApi.agasts_code_get ..."
      end
      # verify the required parameter 'code' is set
      fail ArgumentError, "Missing the required parameter 'code' when calling AGASTApi.agasts_code_get" if code.nil?
      if code.to_s.length > 60
        fail ArgumentError, 'invalid value for "code" when calling AGASTApi.agasts_code_get, the character length must be smaller than or equal to 60.'
      end

      # resource path
      local_var_path = "/agasts/{code}".sub('{format}','json').sub('{' + 'code' + '}', code.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Agast')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AGASTApi#agasts_code_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Create agast
    # This method operation create a AGAST 
    # @param body Transaction Message
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse201]
    def create_agast(body, opts = {})
      data, _status_code, _headers = create_agast_with_http_info(body, opts)
      return data
    end

    # Create agast
    # This method operation create a AGAST 
    # @param body Transaction Message
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse201, Fixnum, Hash)>] InlineResponse201 data, response status code and response headers
    def create_agast_with_http_info(body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AGASTApi.create_agast ..."
      end
      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling AGASTApi.create_agast" if body.nil?
      # resource path
      local_var_path = "/agasts".sub('{format}','json')

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(body)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'InlineResponse201')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AGASTApi#create_agast\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # 
    # 
    # @param code Agast Code
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_agast(code, opts = {})
      delete_agast_with_http_info(code, opts)
      return nil
    end

    # 
    # 
    # @param code Agast Code
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_agast_with_http_info(code, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AGASTApi.delete_agast ..."
      end
      # verify the required parameter 'code' is set
      fail ArgumentError, "Missing the required parameter 'code' when calling AGASTApi.delete_agast" if code.nil?
      if code.to_s.length > 60
        fail ArgumentError, 'invalid value for "code" when calling AGASTApi.delete_agast, the character length must be smaller than or equal to 60.'
      end

      # resource path
      local_var_path = "/agasts/{code}".sub('{format}','json').sub('{' + 'code' + '}', code.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AGASTApi#delete_agast\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # 
    # This operation return agast configurations that match with parameters queries 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :text Text query
    # @return [Array<InlineResponse2001>]
    def get_agast_list(opts = {})
      data, _status_code, _headers = get_agast_list_with_http_info(opts)
      return data
    end

    # 
    # This operation return agast configurations that match with parameters queries 
    # @param [Hash] opts the optional parameters
    # @option opts [String] :text Text query
    # @return [Array<(Array<InlineResponse2001>, Fixnum, Hash)>] Array<InlineResponse2001> data, response status code and response headers
    def get_agast_list_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AGASTApi.get_agast_list ..."
      end
      if !opts[:'text'].nil? && opts[:'text'].to_s.length > 40
        fail ArgumentError, 'invalid value for "opts[:"text"]" when calling AGASTApi.get_agast_list, the character length must be smaller than or equal to 40.'
      end

      # resource path
      local_var_path = "/agasts".sub('{format}','json')

      # query parameters
      query_params = {}
      query_params[:'text'] = opts[:'text'] if !opts[:'text'].nil?

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = nil
      auth_names = []
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'Array<InlineResponse2001>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AGASTApi#get_agast_list\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update agast
    # This method operation create a agast 
    # @param code Agast Code
    # @param body Transaction Message
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def update_agast(code, body, opts = {})
      update_agast_with_http_info(code, body, opts)
      return nil
    end

    # Update agast
    # This method operation create a agast 
    # @param code Agast Code
    # @param body Transaction Message
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def update_agast_with_http_info(code, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: AGASTApi.update_agast ..."
      end
      # verify the required parameter 'code' is set
      fail ArgumentError, "Missing the required parameter 'code' when calling AGASTApi.update_agast" if code.nil?
      if code.to_s.length > 60
        fail ArgumentError, 'invalid value for "code" when calling AGASTApi.update_agast, the character length must be smaller than or equal to 60.'
      end

      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling AGASTApi.update_agast" if body.nil?
      # resource path
      local_var_path = "/agasts/{code}".sub('{format}','json').sub('{' + 'code' + '}', code.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = {}

      # http body (model)
      post_body = @api_client.object_to_http_body(body)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: AGASTApi#update_agast\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
