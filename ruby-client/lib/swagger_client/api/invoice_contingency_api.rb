=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class InvoiceContingencyApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # Invoice Drop Contingency per State
    # Drop State in Contingency
    # @param state Brazilian State
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def invoice_drop_contingency(state, opts = {})
      invoice_drop_contingency_with_http_info(state, opts)
      return nil
    end

    # Invoice Drop Contingency per State
    # Drop State in Contingency
    # @param state Brazilian State
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def invoice_drop_contingency_with_http_info(state, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceContingencyApi.invoice_drop_contingency ..."
      end
      # verify the required parameter 'state' is set
      fail ArgumentError, "Missing the required parameter 'state' when calling InvoiceContingencyApi.invoice_drop_contingency" if state.nil?
      # verify enum value
      unless ['ac', 'al', 'am', 'ap', 'ba', 'ce', 'df', 'es', 'go', 'ma', 'mg', 'ms', 'mt', 'pa', 'pb', 'pe', 'pi', 'pr', 'rj', 'rn', 'ro', 'rr', 'rs', 'sc', 'se', 'sp', 'to'].include?(state)
        fail ArgumentError, "invalid value for 'state', must be one of ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to"
      end
      if state.to_s.length > 2
        fail ArgumentError, 'invalid value for "state" when calling InvoiceContingencyApi.invoice_drop_contingency, the character length must be smaller than or equal to 2.'
      end

      # resource path
      local_var_path = "/invoices/contingency/{state}".sub('{format}','json').sub('{' + 'state' + '}', state.to_s)

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
        @api_client.config.logger.debug "API called: InvoiceContingencyApi#invoice_drop_contingency\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Invoice Set Contingency per State
    # Set State in Contingency
    # @param state Brazilian State
    # @param body Set Contingency
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def invoice_set_contingency(state, body, opts = {})
      invoice_set_contingency_with_http_info(state, body, opts)
      return nil
    end

    # Invoice Set Contingency per State
    # Set State in Contingency
    # @param state Brazilian State
    # @param body Set Contingency
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def invoice_set_contingency_with_http_info(state, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceContingencyApi.invoice_set_contingency ..."
      end
      # verify the required parameter 'state' is set
      fail ArgumentError, "Missing the required parameter 'state' when calling InvoiceContingencyApi.invoice_set_contingency" if state.nil?
      # verify enum value
      unless ['ac', 'al', 'am', 'ap', 'ba', 'ce', 'df', 'es', 'go', 'ma', 'mg', 'ms', 'mt', 'pa', 'pb', 'pe', 'pi', 'pr', 'rj', 'rn', 'ro', 'rr', 'rs', 'sc', 'se', 'sp', 'to'].include?(state)
        fail ArgumentError, "invalid value for 'state', must be one of ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to"
      end
      if state.to_s.length > 2
        fail ArgumentError, 'invalid value for "state" when calling InvoiceContingencyApi.invoice_set_contingency, the character length must be smaller than or equal to 2.'
      end

      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling InvoiceContingencyApi.invoice_set_contingency" if body.nil?
      # resource path
      local_var_path = "/invoices/contingency/{state}".sub('{format}','json').sub('{' + 'state' + '}', state.to_s)

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
        @api_client.config.logger.debug "API called: InvoiceContingencyApi#invoice_set_contingency\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Invoice Verify Contingency per State
    # Check if State was in Contingency
    # @param state Brazilian State
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse2003]
    def invoice_verify_contingency(state, opts = {})
      data, _status_code, _headers = invoice_verify_contingency_with_http_info(state, opts)
      return data
    end

    # Invoice Verify Contingency per State
    # Check if State was in Contingency
    # @param state Brazilian State
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse2003, Fixnum, Hash)>] InlineResponse2003 data, response status code and response headers
    def invoice_verify_contingency_with_http_info(state, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: InvoiceContingencyApi.invoice_verify_contingency ..."
      end
      # verify the required parameter 'state' is set
      fail ArgumentError, "Missing the required parameter 'state' when calling InvoiceContingencyApi.invoice_verify_contingency" if state.nil?
      # verify enum value
      unless ['ac', 'al', 'am', 'ap', 'ba', 'ce', 'df', 'es', 'go', 'ma', 'mg', 'ms', 'mt', 'pa', 'pb', 'pe', 'pi', 'pr', 'rj', 'rn', 'ro', 'rr', 'rs', 'sc', 'se', 'sp', 'to'].include?(state)
        fail ArgumentError, "invalid value for 'state', must be one of ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to"
      end
      if state.to_s.length > 2
        fail ArgumentError, 'invalid value for "state" when calling InvoiceContingencyApi.invoice_verify_contingency, the character length must be smaller than or equal to 2.'
      end

      # resource path
      local_var_path = "/invoices/contingency/{state}".sub('{format}','json').sub('{' + 'state' + '}', state.to_s)

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
        :return_type => 'InlineResponse2003')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: InvoiceContingencyApi#invoice_verify_contingency\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
