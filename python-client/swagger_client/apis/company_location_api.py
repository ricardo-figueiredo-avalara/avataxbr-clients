# coding: utf-8

"""
    BR16 - API

    This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import sys
import os
import re

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class CompanyLocationApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def companies_company_id_locations_code_get(self, company_id, code, **kwargs):
        """
        This operation return location 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_locations_code_get(company_id, code, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Location Code (required)
        :return: Location
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.companies_company_id_locations_code_get_with_http_info(company_id, code, **kwargs)
        else:
            (data) = self.companies_company_id_locations_code_get_with_http_info(company_id, code, **kwargs)
            return data

    def companies_company_id_locations_code_get_with_http_info(self, company_id, code, **kwargs):
        """
        This operation return location 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_locations_code_get_with_http_info(company_id, code, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Location Code (required)
        :return: Location
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'code']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method companies_company_id_locations_code_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `companies_company_id_locations_code_get`")
        # verify the required parameter 'code' is set
        if ('code' not in params) or (params['code'] is None):
            raise ValueError("Missing the required parameter `code` when calling `companies_company_id_locations_code_get`")


        collection_formats = {}

        resource_path = '/companies/{companyId}/locations/{code}'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']
        if 'code' in params:
            path_params['code'] = params['code']

        query_params = {}

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json'])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type='Location',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)

    def companies_company_id_locations_get(self, company_id, **kwargs):
        """
        This operation return all locations 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_locations_get(company_id, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param int x_pagination_limit: The per page limit. Currently set to 10 but subject to change at any time (max 100).
        :param int x_pagination_current_page: The current page. Defaults to 1.
        :param str x_pagination_sort:
        :return: list[Location]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.companies_company_id_locations_get_with_http_info(company_id, **kwargs)
        else:
            (data) = self.companies_company_id_locations_get_with_http_info(company_id, **kwargs)
            return data

    def companies_company_id_locations_get_with_http_info(self, company_id, **kwargs):
        """
        This operation return all locations 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_locations_get_with_http_info(company_id, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param int x_pagination_limit: The per page limit. Currently set to 10 but subject to change at any time (max 100).
        :param int x_pagination_current_page: The current page. Defaults to 1.
        :param str x_pagination_sort:
        :return: list[Location]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'x_pagination_limit', 'x_pagination_current_page', 'x_pagination_sort']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method companies_company_id_locations_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `companies_company_id_locations_get`")

        if 'x_pagination_limit' in params and params['x_pagination_limit'] < 5:
            raise ValueError("Invalid value for parameter `x_pagination_limit` when calling `companies_company_id_locations_get`, must be a value greater than or equal to `5`")
        if 'x_pagination_current_page' in params and params['x_pagination_current_page'] < 1:
            raise ValueError("Invalid value for parameter `x_pagination_current_page` when calling `companies_company_id_locations_get`, must be a value greater than or equal to `1`")

        collection_formats = {}

        resource_path = '/companies/{companyId}/locations'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']

        query_params = {}

        header_params = {}
        if 'x_pagination_limit' in params:
            header_params['X-Pagination-Limit'] = params['x_pagination_limit']
        if 'x_pagination_current_page' in params:
            header_params['X-Pagination-Current-Page'] = params['x_pagination_current_page']
        if 'x_pagination_sort' in params:
            header_params['X-Pagination-Sort'] = params['x_pagination_sort']

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json'])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type='list[Location]',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)

    def create_location(self, company_id, body, **kwargs):
        """
        Create new location for company
        This method operation create a new location for company 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.create_location(company_id, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param Location body: Transaction Message (required)
        :return: InlineResponse201
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.create_location_with_http_info(company_id, body, **kwargs)
        else:
            (data) = self.create_location_with_http_info(company_id, body, **kwargs)
            return data

    def create_location_with_http_info(self, company_id, body, **kwargs):
        """
        Create new location for company
        This method operation create a new location for company 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.create_location_with_http_info(company_id, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param Location body: Transaction Message (required)
        :return: InlineResponse201
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'body']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_location" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `create_location`")
        # verify the required parameter 'body' is set
        if ('body' not in params) or (params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `create_location`")


        collection_formats = {}

        resource_path = '/companies/{companyId}/locations'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']

        query_params = {}

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json'])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'POST',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type='InlineResponse201',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)

    def delete_location(self, company_id, code, **kwargs):
        """
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.delete_location(company_id, code, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Location Code (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.delete_location_with_http_info(company_id, code, **kwargs)
        else:
            (data) = self.delete_location_with_http_info(company_id, code, **kwargs)
            return data

    def delete_location_with_http_info(self, company_id, code, **kwargs):
        """
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.delete_location_with_http_info(company_id, code, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Location Code (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'code']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_location" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `delete_location`")
        # verify the required parameter 'code' is set
        if ('code' not in params) or (params['code'] is None):
            raise ValueError("Missing the required parameter `code` when calling `delete_location`")


        collection_formats = {}

        resource_path = '/companies/{companyId}/locations/{code}'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']
        if 'code' in params:
            path_params['code'] = params['code']

        query_params = {}

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json'])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'DELETE',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type=None,
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)

    def update_location(self, company_id, code, body, **kwargs):
        """
        Update location for company
        This method operation update a location for company 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.update_location(company_id, code, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Location Code (required)
        :param Location body: Transaction Message (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.update_location_with_http_info(company_id, code, body, **kwargs)
        else:
            (data) = self.update_location_with_http_info(company_id, code, body, **kwargs)
            return data

    def update_location_with_http_info(self, company_id, code, body, **kwargs):
        """
        Update location for company
        This method operation update a location for company 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.update_location_with_http_info(company_id, code, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Location Code (required)
        :param Location body: Transaction Message (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'code', 'body']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_location" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `update_location`")
        # verify the required parameter 'code' is set
        if ('code' not in params) or (params['code'] is None):
            raise ValueError("Missing the required parameter `code` when calling `update_location`")
        # verify the required parameter 'body' is set
        if ('body' not in params) or (params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `update_location`")


        collection_formats = {}

        resource_path = '/companies/{companyId}/locations/{code}'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']
        if 'code' in params:
            path_params['code'] = params['code']

        query_params = {}

        header_params = {}

        form_params = []
        local_var_files = {}

        body_params = None
        if 'body' in params:
            body_params = params['body']
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/json'])

        # HTTP header `Content-Type`
        header_params['Content-Type'] = self.api_client.\
            select_header_content_type(['application/json'])

        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'PUT',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type=None,
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)
