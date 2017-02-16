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


class InvoiceContingencyApi(object):
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

    def invoice_drop_contingency(self, state, **kwargs):
        """
        Invoice Drop Contingency per State
        Drop State in Contingency
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.invoice_drop_contingency(state, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str state: Brazilian State (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.invoice_drop_contingency_with_http_info(state, **kwargs)
        else:
            (data) = self.invoice_drop_contingency_with_http_info(state, **kwargs)
            return data

    def invoice_drop_contingency_with_http_info(self, state, **kwargs):
        """
        Invoice Drop Contingency per State
        Drop State in Contingency
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.invoice_drop_contingency_with_http_info(state, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str state: Brazilian State (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['state']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method invoice_drop_contingency" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'state' is set
        if ('state' not in params) or (params['state'] is None):
            raise ValueError("Missing the required parameter `state` when calling `invoice_drop_contingency`")

        if 'state' in params and len(params['state']) > 2:
            raise ValueError("Invalid value for parameter `state` when calling `invoice_drop_contingency`, length must be less than or equal to `2`")

        collection_formats = {}

        resource_path = '/invoices/contingency/{state}'.replace('{format}', 'json')
        path_params = {}
        if 'state' in params:
            path_params['state'] = params['state']

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

    def invoice_set_contingency(self, state, body, **kwargs):
        """
        Invoice Set Contingency per State
        Set State in Contingency
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.invoice_set_contingency(state, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str state: Brazilian State (required)
        :param Body4 body: Set Contingency (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.invoice_set_contingency_with_http_info(state, body, **kwargs)
        else:
            (data) = self.invoice_set_contingency_with_http_info(state, body, **kwargs)
            return data

    def invoice_set_contingency_with_http_info(self, state, body, **kwargs):
        """
        Invoice Set Contingency per State
        Set State in Contingency
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.invoice_set_contingency_with_http_info(state, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str state: Brazilian State (required)
        :param Body4 body: Set Contingency (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['state', 'body']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method invoice_set_contingency" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'state' is set
        if ('state' not in params) or (params['state'] is None):
            raise ValueError("Missing the required parameter `state` when calling `invoice_set_contingency`")
        # verify the required parameter 'body' is set
        if ('body' not in params) or (params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `invoice_set_contingency`")

        if 'state' in params and len(params['state']) > 2:
            raise ValueError("Invalid value for parameter `state` when calling `invoice_set_contingency`, length must be less than or equal to `2`")

        collection_formats = {}

        resource_path = '/invoices/contingency/{state}'.replace('{format}', 'json')
        path_params = {}
        if 'state' in params:
            path_params['state'] = params['state']

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

    def invoice_verify_contingency(self, state, **kwargs):
        """
        Invoice Verify Contingency per State
        Check if State was in Contingency
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.invoice_verify_contingency(state, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str state: Brazilian State (required)
        :return: InlineResponse2003
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.invoice_verify_contingency_with_http_info(state, **kwargs)
        else:
            (data) = self.invoice_verify_contingency_with_http_info(state, **kwargs)
            return data

    def invoice_verify_contingency_with_http_info(self, state, **kwargs):
        """
        Invoice Verify Contingency per State
        Check if State was in Contingency
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.invoice_verify_contingency_with_http_info(state, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str state: Brazilian State (required)
        :return: InlineResponse2003
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['state']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method invoice_verify_contingency" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'state' is set
        if ('state' not in params) or (params['state'] is None):
            raise ValueError("Missing the required parameter `state` when calling `invoice_verify_contingency`")

        if 'state' in params and len(params['state']) > 2:
            raise ValueError("Invalid value for parameter `state` when calling `invoice_verify_contingency`, length must be less than or equal to `2`")

        collection_formats = {}

        resource_path = '/invoices/contingency/{state}'.replace('{format}', 'json')
        path_params = {}
        if 'state' in params:
            path_params['state'] = params['state']

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
                                        response_type='InlineResponse2003',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)
