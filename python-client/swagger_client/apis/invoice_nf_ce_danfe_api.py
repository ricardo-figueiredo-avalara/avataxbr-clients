# coding: utf-8

"""
    AvaTax Brazil

    The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

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


class InvoiceNFCeDANFEApi(object):
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

    def invoices_nfce_key_get(self, authorization, key, **kwargs):
        """
        NFCe Danfe Print
        Retrieve the Danfe in NFCe format. 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.invoices_nfce_key_get(authorization, key, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str authorization: Bearer {auth} (required)
        :param str key: Invoice Key (required)
        :return: file
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.invoices_nfce_key_get_with_http_info(authorization, key, **kwargs)
        else:
            (data) = self.invoices_nfce_key_get_with_http_info(authorization, key, **kwargs)
            return data

    def invoices_nfce_key_get_with_http_info(self, authorization, key, **kwargs):
        """
        NFCe Danfe Print
        Retrieve the Danfe in NFCe format. 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.invoices_nfce_key_get_with_http_info(authorization, key, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str authorization: Bearer {auth} (required)
        :param str key: Invoice Key (required)
        :return: file
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['authorization', 'key']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method invoices_nfce_key_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'authorization' is set
        if ('authorization' not in params) or (params['authorization'] is None):
            raise ValueError("Missing the required parameter `authorization` when calling `invoices_nfce_key_get`")
        # verify the required parameter 'key' is set
        if ('key' not in params) or (params['key'] is None):
            raise ValueError("Missing the required parameter `key` when calling `invoices_nfce_key_get`")

        if 'key' in params and not re.search('^(\\d{44})$', params['key']):
            raise ValueError("Invalid value for parameter `key` when calling `invoices_nfce_key_get`, must conform to the pattern `/^(\\d{44})$/`")

        collection_formats = {}

        resource_path = '/invoices/nfce/{key}'.replace('{format}', 'json')
        path_params = {}
        if 'key' in params:
            path_params['key'] = params['key']

        query_params = {}

        header_params = {}
        if 'authorization' in params:
            header_params['Authorization'] = params['authorization']

        form_params = []
        local_var_files = {}

        body_params = None
        # HTTP header `Accept`
        header_params['Accept'] = self.api_client.\
            select_header_accept(['application/pdf'])

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
                                        response_type='file',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)
