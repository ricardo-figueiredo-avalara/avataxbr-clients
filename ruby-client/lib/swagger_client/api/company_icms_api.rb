=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require "uri"

module SwaggerClient
  class CompanyICMSApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end

    # 
    # This operation return custom ICMS configurations that match with parameters queries 
    # @param company_id Company ID
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (default to 10)
    # @option opts [Integer] :x_pagination_current_page The current page. Defaults to 1. (default to 1)
    # @option opts [String] :x_pagination_sort 
    # @return [Array<CustomIcmsConfByState>]
    def companies_company_id_icms_get(company_id, opts = {})
      data, _status_code, _headers = companies_company_id_icms_get_with_http_info(company_id, opts)
      return data
    end

    # 
    # This operation return custom ICMS configurations that match with parameters queries 
    # @param company_id Company ID
    # @param [Hash] opts the optional parameters
    # @option opts [Integer] :x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100).
    # @option opts [Integer] :x_pagination_current_page The current page. Defaults to 1.
    # @option opts [String] :x_pagination_sort 
    # @return [Array<(Array<CustomIcmsConfByState>, Fixnum, Hash)>] Array<CustomIcmsConfByState> data, response status code and response headers
    def companies_company_id_icms_get_with_http_info(company_id, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: CompanyICMSApi.companies_company_id_icms_get ..."
      end
      # verify the required parameter 'company_id' is set
      fail ArgumentError, "Missing the required parameter 'company_id' when calling CompanyICMSApi.companies_company_id_icms_get" if company_id.nil?
      if !opts[:'x_pagination_limit'].nil? && opts[:'x_pagination_limit'] < 5
        fail ArgumentError, 'invalid value for "opts[:"x_pagination_limit"]" when calling CompanyICMSApi.companies_company_id_icms_get, must be greater than or equal to 5.'
      end

      if !opts[:'x_pagination_current_page'].nil? && opts[:'x_pagination_current_page'] < 1
        fail ArgumentError, 'invalid value for "opts[:"x_pagination_current_page"]" when calling CompanyICMSApi.companies_company_id_icms_get, must be greater than or equal to 1.'
      end

      # resource path
      local_var_path = "/companies/{companyId}/icms".sub('{format}','json').sub('{' + 'companyId' + '}', company_id.to_s)

      # query parameters
      query_params = {}

      # header parameters
      header_params = {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])
      header_params[:'X-Pagination-Limit'] = opts[:'x_pagination_limit'] if !opts[:'x_pagination_limit'].nil?
      header_params[:'X-Pagination-Current-Page'] = opts[:'x_pagination_current_page'] if !opts[:'x_pagination_current_page'].nil?
      header_params[:'X-Pagination-Sort'] = opts[:'x_pagination_sort'] if !opts[:'x_pagination_sort'].nil?

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
        :return_type => 'Array<CustomIcmsConfByState>')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CompanyICMSApi#companies_company_id_icms_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # 
    # This operation return custom ICMS configurations that match with parameters queries 
    # @param company_id Company ID
    # @param state Brazilian State
    # @param [Hash] opts the optional parameters
    # @return [CustomIcmsConfByState]
    def companies_company_id_icms_state_get(company_id, state, opts = {})
      data, _status_code, _headers = companies_company_id_icms_state_get_with_http_info(company_id, state, opts)
      return data
    end

    # 
    # This operation return custom ICMS configurations that match with parameters queries 
    # @param company_id Company ID
    # @param state Brazilian State
    # @param [Hash] opts the optional parameters
    # @return [Array<(CustomIcmsConfByState, Fixnum, Hash)>] CustomIcmsConfByState data, response status code and response headers
    def companies_company_id_icms_state_get_with_http_info(company_id, state, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: CompanyICMSApi.companies_company_id_icms_state_get ..."
      end
      # verify the required parameter 'company_id' is set
      fail ArgumentError, "Missing the required parameter 'company_id' when calling CompanyICMSApi.companies_company_id_icms_state_get" if company_id.nil?
      # verify the required parameter 'state' is set
      fail ArgumentError, "Missing the required parameter 'state' when calling CompanyICMSApi.companies_company_id_icms_state_get" if state.nil?
      # verify enum value
      unless ['ac', 'al', 'am', 'ap', 'ba', 'ce', 'df', 'es', 'go', 'ma', 'mg', 'ms', 'mt', 'pa', 'pb', 'pe', 'pi', 'pr', 'rj', 'rn', 'ro', 'rr', 'rs', 'sc', 'se', 'sp', 'to'].include?(state)
        fail ArgumentError, "invalid value for 'state', must be one of ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to"
      end
      if state.to_s.length > 2
        fail ArgumentError, 'invalid value for "state" when calling CompanyICMSApi.companies_company_id_icms_state_get, the character length must be smaller than or equal to 2.'
      end

      # resource path
      local_var_path = "/companies/{companyId}/icms/{state}".sub('{format}','json').sub('{' + 'companyId' + '}', company_id.to_s).sub('{' + 'state' + '}', state.to_s)

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
        :return_type => 'CustomIcmsConfByState')
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: CompanyICMSApi#companies_company_id_icms_state_get\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Create custom ICMS tax for one company
    # This method operation create a custom agast for one company 
    # @param company_id Company ID
    # @param body Transaction Message
    # @param [Hash] opts the optional parameters
    # @return [InlineResponse201]
    def create_icms(company_id, body, opts = {})
      data, _status_code, _headers = create_icms_with_http_info(company_id, body, opts)
      return data
    end

    # Create custom ICMS tax for one company
    # This method operation create a custom agast for one company 
    # @param company_id Company ID
    # @param body Transaction Message
    # @param [Hash] opts the optional parameters
    # @return [Array<(InlineResponse201, Fixnum, Hash)>] InlineResponse201 data, response status code and response headers
    def create_icms_with_http_info(company_id, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: CompanyICMSApi.create_icms ..."
      end
      # verify the required parameter 'company_id' is set
      fail ArgumentError, "Missing the required parameter 'company_id' when calling CompanyICMSApi.create_icms" if company_id.nil?
      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling CompanyICMSApi.create_icms" if body.nil?
      # resource path
      local_var_path = "/companies/{companyId}/icms".sub('{format}','json').sub('{' + 'companyId' + '}', company_id.to_s)

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
        @api_client.config.logger.debug "API called: CompanyICMSApi#create_icms\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # 
    # 
    # @param company_id Company ID
    # @param state Brazilian State
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def delete_custom_icms_conf_by_state(company_id, state, opts = {})
      delete_custom_icms_conf_by_state_with_http_info(company_id, state, opts)
      return nil
    end

    # 
    # 
    # @param company_id Company ID
    # @param state Brazilian State
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def delete_custom_icms_conf_by_state_with_http_info(company_id, state, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: CompanyICMSApi.delete_custom_icms_conf_by_state ..."
      end
      # verify the required parameter 'company_id' is set
      fail ArgumentError, "Missing the required parameter 'company_id' when calling CompanyICMSApi.delete_custom_icms_conf_by_state" if company_id.nil?
      # verify the required parameter 'state' is set
      fail ArgumentError, "Missing the required parameter 'state' when calling CompanyICMSApi.delete_custom_icms_conf_by_state" if state.nil?
      # verify enum value
      unless ['ac', 'al', 'am', 'ap', 'ba', 'ce', 'df', 'es', 'go', 'ma', 'mg', 'ms', 'mt', 'pa', 'pb', 'pe', 'pi', 'pr', 'rj', 'rn', 'ro', 'rr', 'rs', 'sc', 'se', 'sp', 'to'].include?(state)
        fail ArgumentError, "invalid value for 'state', must be one of ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to"
      end
      if state.to_s.length > 2
        fail ArgumentError, 'invalid value for "state" when calling CompanyICMSApi.delete_custom_icms_conf_by_state, the character length must be smaller than or equal to 2.'
      end

      # resource path
      local_var_path = "/companies/{companyId}/icms/{state}".sub('{format}','json').sub('{' + 'companyId' + '}', company_id.to_s).sub('{' + 'state' + '}', state.to_s)

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
        @api_client.config.logger.debug "API called: CompanyICMSApi#delete_custom_icms_conf_by_state\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Update custom agast for one company
    # This method operation update a custom ICMS tax for one company 
    # @param company_id Company ID
    # @param state Brazilian State
    # @param body Transaction Message
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def update_custom_icms_conf_by_state(company_id, state, body, opts = {})
      update_custom_icms_conf_by_state_with_http_info(company_id, state, body, opts)
      return nil
    end

    # Update custom agast for one company
    # This method operation update a custom ICMS tax for one company 
    # @param company_id Company ID
    # @param state Brazilian State
    # @param body Transaction Message
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Fixnum, Hash)>] nil, response status code and response headers
    def update_custom_icms_conf_by_state_with_http_info(company_id, state, body, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug "Calling API: CompanyICMSApi.update_custom_icms_conf_by_state ..."
      end
      # verify the required parameter 'company_id' is set
      fail ArgumentError, "Missing the required parameter 'company_id' when calling CompanyICMSApi.update_custom_icms_conf_by_state" if company_id.nil?
      # verify the required parameter 'state' is set
      fail ArgumentError, "Missing the required parameter 'state' when calling CompanyICMSApi.update_custom_icms_conf_by_state" if state.nil?
      # verify enum value
      unless ['ac', 'al', 'am', 'ap', 'ba', 'ce', 'df', 'es', 'go', 'ma', 'mg', 'ms', 'mt', 'pa', 'pb', 'pe', 'pi', 'pr', 'rj', 'rn', 'ro', 'rr', 'rs', 'sc', 'se', 'sp', 'to'].include?(state)
        fail ArgumentError, "invalid value for 'state', must be one of ac, al, am, ap, ba, ce, df, es, go, ma, mg, ms, mt, pa, pb, pe, pi, pr, rj, rn, ro, rr, rs, sc, se, sp, to"
      end
      if state.to_s.length > 2
        fail ArgumentError, 'invalid value for "state" when calling CompanyICMSApi.update_custom_icms_conf_by_state, the character length must be smaller than or equal to 2.'
      end

      # verify the required parameter 'body' is set
      fail ArgumentError, "Missing the required parameter 'body' when calling CompanyICMSApi.update_custom_icms_conf_by_state" if body.nil?
      # resource path
      local_var_path = "/companies/{companyId}/icms/{state}".sub('{format}','json').sub('{' + 'companyId' + '}', company_id.to_s).sub('{' + 'state' + '}', state.to_s)

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
        @api_client.config.logger.debug "API called: CompanyICMSApi#update_custom_icms_conf_by_state\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
