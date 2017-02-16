=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class InvoiceNFCeDANFEApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # NFCe Danfe Print
    # Retrieve the Danfe in NFCe format. 
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param [Hash] opts the optional parameters
    # @return [File]
    def invoices_nfce_key_get(authorization, key, opts = {})
      data, _status_code, _headers = invoices_nfce_key_get_with_http_info(authorization, key, opts)
      return data
    end

    # NFCe Danfe Print
    # Retrieve the Danfe in NFCe format. 
    # @param authorization Bearer {auth}
    # @param key Invoice Key
    # @param [Hash] opts the optional parameters
    # @return [Array<(File, Fixnum, Hash)>] File data, response status code and response headers
    def invoices_nfce_key_get_with_http_info(authorization, key, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceNFCeDANFEApi.invoices_nfce_key_get ..."
      end
      # verify the required parameter 'authorization' is set
      fail ArgumentError, "Missing the required parameter 'authorization' when calling InvoiceNFCeDANFEApi.invoices_nfce_key_get" if authorization.nil?
      # verify the required parameter 'key' is set
      fail ArgumentError, "Missing the required parameter 'key' when calling InvoiceNFCeDANFEApi.invoices_nfce_key_get" if key.nil?
      if key !~ Regexp.new(/^(\\d{44})$/)
        fail ArgumentError, "invalid value for 'key' when calling InvoiceNFCeDANFEApi.invoices_nfce_key_get, must conform to the pattern /^(\\d{44})$/."
      end

      # resource path
      local_var_path = "/invoices/nfce/{key}".sub('{format}','json').sub('{' + 'key' + '}', key.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/pdf'])
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
        :return_type => 'File')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceNFCeDANFEApi#invoices_nfce_key_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
