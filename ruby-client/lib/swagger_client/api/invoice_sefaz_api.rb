=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class InvoiceSEFAZApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Disable Range e-Invoice
    # Send disable range of NFes to SEFAZ 
    # @param authorization Bearer {auth}
    # @param body Disable Range e-Invoice
    # @param [Hash] opts the optional parameters
    # @return [SefazInvoiceBasicStatus]
    def invoices_sefaz_delete(authorization, body, opts = {})
      data, _status_code, _headers = invoices_sefaz_delete_with_http_info(authorization, body, opts)
      return data
    end

    # Disable Range e-Invoice
    # Send disable range of NFes to SEFAZ 
    # @param authorization Bearer {auth}
    # @param body Disable Range e-Invoice
    # @param [Hash] opts the optional parameters
    # @return [Array<(SefazInvoiceBasicStatus, Fixnum, Hash)>] SefazInvoiceBasicStatus data, response status code and response headers
    def invoices_sefaz_delete_with_http_info(authorization, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceSEFAZApi.invoices_sefaz_delete ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling InvoiceSEFAZApi.invoices_sefaz_delete" if authorization.nil?
      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling InvoiceSEFAZApi.invoices_sefaz_delete" if body.nil?
      # resource path
      local_var_path = "/invoices/sefaz".sub('{format}','json')

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
      post_body = @api_client.object_to_http_body(body)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SefazInvoiceBasicStatus')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceSEFAZApi#invoices_sefaz_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Cancel invoice
    # Cancel the invoice
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param body Cancel Message
    # @param [Hash] opts the optional parameters
    # @return [SefazInvoiceBasicStatus]
    def invoices_sefaz_key_delete(authorization, key, body, opts = {})
      data, _status_code, _headers = invoices_sefaz_key_delete_with_http_info(authorization, key, body, opts)
      return data
    end

    # Cancel invoice
    # Cancel the invoice
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param body Cancel Message
    # @param [Hash] opts the optional parameters
    # @return [Array<(SefazInvoiceBasicStatus, Fixnum, Hash)>] SefazInvoiceBasicStatus data, response status code and response headers
    def invoices_sefaz_key_delete_with_http_info(authorization, key, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceSEFAZApi.invoices_sefaz_key_delete ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling InvoiceSEFAZApi.invoices_sefaz_key_delete" if authorization.nil?
      # verify the required parameter 'key' is set
      fail ArgumentError, "Missing the required parameter 'key' when calling InvoiceSEFAZApi.invoices_sefaz_key_delete" if key.nil?
      if key !~ Regexp.new(/^(\\d{44})$/)
        fail ArgumentError, "invalid value for 'key' when calling InvoiceSEFAZApi.invoices_sefaz_key_delete, must conform to the pattern /^(\\d{44})$/."
      end

      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling InvoiceSEFAZApi.invoices_sefaz_key_delete" if body.nil?
      # resource path
      local_var_path = "/invoices/sefaz/{key}".sub('{format}','json').sub('{' + 'key' + '}', key.to_s)

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
      post_body = @api_client.object_to_http_body(body)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:DELETE, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SefazInvoiceBasicStatus')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceSEFAZApi#invoices_sefaz_key_delete\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Retrieve invoice
    # Retrieve the invoice
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param [Hash] opts the optional parameters
    # @return [SefazItGetOut]
    def invoices_sefaz_key_get(authorization, key, opts = {})
      data, _status_code, _headers = invoices_sefaz_key_get_with_http_info(authorization, key, opts)
      return data
    end

    # Retrieve invoice
    # Retrieve the invoice
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param [Hash] opts the optional parameters
    # @return [Array<(SefazItGetOut, Fixnum, Hash)>] SefazItGetOut data, response status code and response headers
    def invoices_sefaz_key_get_with_http_info(authorization, key, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceSEFAZApi.invoices_sefaz_key_get ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling InvoiceSEFAZApi.invoices_sefaz_key_get" if authorization.nil?
      # verify the required parameter 'key' is set
      fail ArgumentError, "Missing the required parameter 'key' when calling InvoiceSEFAZApi.invoices_sefaz_key_get" if key.nil?
      if key !~ Regexp.new(/^(\\d{44})$/)
        fail ArgumentError, "invalid value for 'key' when calling InvoiceSEFAZApi.invoices_sefaz_key_get, must conform to the pattern /^(\\d{44})$/."
      end

      # resource path
      local_var_path = "/invoices/sefaz/{key}".sub('{format}','json').sub('{' + 'key' + '}', key.to_s)

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
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SefazItGetOut')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceSEFAZApi#invoices_sefaz_key_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Retrieve invoice
    # Retrieve the invoice
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param [Hash] opts the optional parameters
    # @return [TransactionForSefazGoodsList]
    def invoices_sefaz_key_lookup_get(authorization, key, opts = {})
      data, _status_code, _headers = invoices_sefaz_key_lookup_get_with_http_info(authorization, key, opts)
      return data
    end

    # Retrieve invoice
    # Retrieve the invoice
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param [Hash] opts the optional parameters
    # @return [Array<(TransactionForSefazGoodsList, Fixnum, Hash)>] TransactionForSefazGoodsList data, response status code and response headers
    def invoices_sefaz_key_lookup_get_with_http_info(authorization, key, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceSEFAZApi.invoices_sefaz_key_lookup_get ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling InvoiceSEFAZApi.invoices_sefaz_key_lookup_get" if authorization.nil?
      # verify the required parameter 'key' is set
      fail ArgumentError, "Missing the required parameter 'key' when calling InvoiceSEFAZApi.invoices_sefaz_key_lookup_get" if key.nil?
      if key !~ Regexp.new(/^(\\d{44})$/)
        fail ArgumentError, "invalid value for 'key' when calling InvoiceSEFAZApi.invoices_sefaz_key_lookup_get, must conform to the pattern /^(\\d{44})$/."
      end

      # resource path
      local_var_path = "/invoices/sefaz/{key}/lookup".sub('{format}','json').sub('{' + 'key' + '}', key.to_s)

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
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'TransactionForSefazGoodsList')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceSEFAZApi#invoices_sefaz_key_lookup_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Fix Letter
    # Fix Letter
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param body Fix Message
    # @param [Hash] opts the optional parameters
    # @return [SefazInvoiceBasicStatus]
    def invoices_sefaz_key_put(authorization, key, body, opts = {})
      data, _status_code, _headers = invoices_sefaz_key_put_with_http_info(authorization, key, body, opts)
      return data
    end

    # Fix Letter
    # Fix Letter
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param body Fix Message
    # @param [Hash] opts the optional parameters
    # @return [Array<(SefazInvoiceBasicStatus, Fixnum, Hash)>] SefazInvoiceBasicStatus data, response status code and response headers
    def invoices_sefaz_key_put_with_http_info(authorization, key, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceSEFAZApi.invoices_sefaz_key_put ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling InvoiceSEFAZApi.invoices_sefaz_key_put" if authorization.nil?
      # verify the required parameter 'key' is set
      fail ArgumentError, "Missing the required parameter 'key' when calling InvoiceSEFAZApi.invoices_sefaz_key_put" if key.nil?
      if key !~ Regexp.new(/^(\\d{44})$/)
        fail ArgumentError, "invalid value for 'key' when calling InvoiceSEFAZApi.invoices_sefaz_key_put, must conform to the pattern /^(\\d{44})$/."
      end

      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling InvoiceSEFAZApi.invoices_sefaz_key_put" if body.nil?
      # resource path
      local_var_path = "/invoices/sefaz/{key}".sub('{format}','json').sub('{' + 'key' + '}', key.to_s)

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
      post_body = @api_client.object_to_http_body(body)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:PUT, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SefazInvoiceBasicStatus')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceSEFAZApi#invoices_sefaz_key_put\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Send an e-Invoice
    # Send a invoice to SEFAZ 
    # @param authorization Bearer {auth}
    # @param body Invoices
    # @param [Hash] opts the optional parameters
    # @return [SefazPostOut]
    def invoices_sefaz_post(authorization, body, opts = {})
      data, _status_code, _headers = invoices_sefaz_post_with_http_info(authorization, body, opts)
      return data
    end

    # Send an e-Invoice
    # Send a invoice to SEFAZ 
    # @param authorization Bearer {auth}
    # @param body Invoices
    # @param [Hash] opts the optional parameters
    # @return [Array<(SefazPostOut, Fixnum, Hash)>] SefazPostOut data, response status code and response headers
    def invoices_sefaz_post_with_http_info(authorization, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceSEFAZApi.invoices_sefaz_post ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling InvoiceSEFAZApi.invoices_sefaz_post" if authorization.nil?
      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling InvoiceSEFAZApi.invoices_sefaz_post" if body.nil?
      # resource path
      local_var_path = "/invoices/sefaz".sub('{format}','json')

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
      post_body = @api_client.object_to_http_body(body)
      auth_names = []
      data, status_code, headers = @api_client.call_api(:POST, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'SefazPostOut')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceSEFAZApi#invoices_sefaz_post\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Retrieve Status of SEFAZ Server
    # Retrieve Status of SEFAZ Server
    # @param authorization Bearer {auth}
    # @param [Hash] opts the optional parameters
    # @return [String]
    def invoices_sefaz_status_get(authorization, opts = {})
      data, _status_code, _headers = invoices_sefaz_status_get_with_http_info(authorization, opts)
      return data
    end

    # Retrieve Status of SEFAZ Server
    # Retrieve Status of SEFAZ Server
    # @param authorization Bearer {auth}
    # @param [Hash] opts the optional parameters
    # @return [Array<(String, Fixnum, Hash)>] String data, response status code and response headers
    def invoices_sefaz_status_get_with_http_info(authorization, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceSEFAZApi.invoices_sefaz_status_get ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling InvoiceSEFAZApi.invoices_sefaz_status_get" if authorization.nil?
      # resource path
      local_var_path = "/invoices/sefaz/status".sub('{format}','json')

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
      data, status_code, headers = @api_client.call_api(:GET, local_var_path,
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => 'String')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceSEFAZApi#invoices_sefaz_status_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
