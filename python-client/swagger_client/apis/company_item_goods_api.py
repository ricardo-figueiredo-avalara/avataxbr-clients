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


class CompanyItemGoodsApi(object):
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

    def companies_company_id_items_code_change_code_put(self, company_id, code, body, **kwargs):
        """
        Change the code of a given item. 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_items_code_change_code_put(company_id, code, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Item Code (required)
        :param Body1 body: Requisition (required)
        :param str goods: Provide to apply to goods items.
        :param str service: Provide to apply to service items.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.companies_company_id_items_code_change_code_put_with_http_info(company_id, code, body, **kwargs)
        else:
            (data) = self.companies_company_id_items_code_change_code_put_with_http_info(company_id, code, body, **kwargs)
            return data

    def companies_company_id_items_code_change_code_put_with_http_info(self, company_id, code, body, **kwargs):
        """
        Change the code of a given item. 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_items_code_change_code_put_with_http_info(company_id, code, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Item Code (required)
        :param Body1 body: Requisition (required)
        :param str goods: Provide to apply to goods items.
        :param str service: Provide to apply to service items.
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'code', 'body', 'goods', 'service']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method companies_company_id_items_code_change_code_put" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `companies_company_id_items_code_change_code_put`")
        # verify the required parameter 'code' is set
        if ('code' not in params) or (params['code'] is None):
            raise ValueError("Missing the required parameter `code` when calling `companies_company_id_items_code_change_code_put`")
        # verify the required parameter 'body' is set
        if ('body' not in params) or (params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `companies_company_id_items_code_change_code_put`")

        if 'code' in params and len(params['code']) > 60:
            raise ValueError("Invalid value for parameter `code` when calling `companies_company_id_items_code_change_code_put`, length must be less than or equal to `60`")

        collection_formats = {}

        resource_path = '/companies/{companyId}/items/{code}/change-code'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']
        if 'code' in params:
            path_params['code'] = params['code']

        query_params = {}
        if 'goods' in params:
            query_params['goods'] = params['goods']
        if 'service' in params:
            query_params['service'] = params['service']

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

    def companies_company_id_items_codegoods_get(self, company_id, code, avalara_product_type, **kwargs):
        """
        This operation return custom agast configurations that match with parameters queries 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_items_codegoods_get(company_id, code, avalara_product_type, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Item Code (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :param str agast: Custom Agast Code
        :return: ItemGoods
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.companies_company_id_items_codegoods_get_with_http_info(company_id, code, avalara_product_type, **kwargs)
        else:
            (data) = self.companies_company_id_items_codegoods_get_with_http_info(company_id, code, avalara_product_type, **kwargs)
            return data

    def companies_company_id_items_codegoods_get_with_http_info(self, company_id, code, avalara_product_type, **kwargs):
        """
        This operation return custom agast configurations that match with parameters queries 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_items_codegoods_get_with_http_info(company_id, code, avalara_product_type, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Item Code (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :param str agast: Custom Agast Code
        :return: ItemGoods
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'code', 'avalara_product_type', 'agast']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method companies_company_id_items_codegoods_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `companies_company_id_items_codegoods_get`")
        # verify the required parameter 'code' is set
        if ('code' not in params) or (params['code'] is None):
            raise ValueError("Missing the required parameter `code` when calling `companies_company_id_items_codegoods_get`")
        # verify the required parameter 'avalara_product_type' is set
        if ('avalara_product_type' not in params) or (params['avalara_product_type'] is None):
            raise ValueError("Missing the required parameter `avalara_product_type` when calling `companies_company_id_items_codegoods_get`")

        if 'code' in params and len(params['code']) > 60:
            raise ValueError("Invalid value for parameter `code` when calling `companies_company_id_items_codegoods_get`, length must be less than or equal to `60`")
        if 'agast' in params and len(params['agast']) > 60:
            raise ValueError("Invalid value for parameter `agast` when calling `companies_company_id_items_codegoods_get`, length must be less than or equal to `60`")

        collection_formats = {}

        resource_path = '/companies/{companyId}/items/{code}?goods'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']
        if 'code' in params:
            path_params['code'] = params['code']

        query_params = {}
        if 'agast' in params:
            query_params['agast'] = params['agast']

        header_params = {}
        if 'avalara_product_type' in params:
            header_params['Avalara-Product-Type'] = params['avalara_product_type']

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
                                        response_type='ItemGoods',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)

    def companies_company_id_itemsgoods_get(self, company_id, avalara_product_type, **kwargs):
        """
        This operation return custom agast configurations that match with parameters queries 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_itemsgoods_get(company_id, avalara_product_type, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :param int x_pagination_limit: The per page limit. Currently set to 10 but subject to change at any time (max 100).
        :param int x_pagination_current_page: The current page. Defaults to 1.
        :param str x_pagination_sort:
        :param str code: Item Code
        :param str agast: Custom Agast Code
        :return: list[ItemGoods]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.companies_company_id_itemsgoods_get_with_http_info(company_id, avalara_product_type, **kwargs)
        else:
            (data) = self.companies_company_id_itemsgoods_get_with_http_info(company_id, avalara_product_type, **kwargs)
            return data

    def companies_company_id_itemsgoods_get_with_http_info(self, company_id, avalara_product_type, **kwargs):
        """
        This operation return custom agast configurations that match with parameters queries 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.companies_company_id_itemsgoods_get_with_http_info(company_id, avalara_product_type, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :param int x_pagination_limit: The per page limit. Currently set to 10 but subject to change at any time (max 100).
        :param int x_pagination_current_page: The current page. Defaults to 1.
        :param str x_pagination_sort:
        :param str code: Item Code
        :param str agast: Custom Agast Code
        :return: list[ItemGoods]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'avalara_product_type', 'x_pagination_limit', 'x_pagination_current_page', 'x_pagination_sort', 'code', 'agast']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method companies_company_id_itemsgoods_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `companies_company_id_itemsgoods_get`")
        # verify the required parameter 'avalara_product_type' is set
        if ('avalara_product_type' not in params) or (params['avalara_product_type'] is None):
            raise ValueError("Missing the required parameter `avalara_product_type` when calling `companies_company_id_itemsgoods_get`")

        if 'x_pagination_limit' in params and params['x_pagination_limit'] < 5:
            raise ValueError("Invalid value for parameter `x_pagination_limit` when calling `companies_company_id_itemsgoods_get`, must be a value greater than or equal to `5`")
        if 'x_pagination_current_page' in params and params['x_pagination_current_page'] < 1:
            raise ValueError("Invalid value for parameter `x_pagination_current_page` when calling `companies_company_id_itemsgoods_get`, must be a value greater than or equal to `1`")
        if 'code' in params and len(params['code']) > 60:
            raise ValueError("Invalid value for parameter `code` when calling `companies_company_id_itemsgoods_get`, length must be less than or equal to `60`")
        if 'agast' in params and len(params['agast']) > 60:
            raise ValueError("Invalid value for parameter `agast` when calling `companies_company_id_itemsgoods_get`, length must be less than or equal to `60`")

        collection_formats = {}

        resource_path = '/companies/{companyId}/items?goods'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']

        query_params = {}
        if 'code' in params:
            query_params['code'] = params['code']
        if 'agast' in params:
            query_params['agast'] = params['agast']

        header_params = {}
        if 'avalara_product_type' in params:
            header_params['Avalara-Product-Type'] = params['avalara_product_type']
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
                                        response_type='list[ItemGoods]',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)

    def create_item(self, company_id, avalara_product_type, body, **kwargs):
        """
        Create custom agast for one company
        This method operation create a custom agast for one company 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.create_item(company_id, avalara_product_type, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :param ItemGoods body: Transaction Message (required)
        :return: InlineResponse201
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.create_item_with_http_info(company_id, avalara_product_type, body, **kwargs)
        else:
            (data) = self.create_item_with_http_info(company_id, avalara_product_type, body, **kwargs)
            return data

    def create_item_with_http_info(self, company_id, avalara_product_type, body, **kwargs):
        """
        Create custom agast for one company
        This method operation create a custom agast for one company 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.create_item_with_http_info(company_id, avalara_product_type, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :param ItemGoods body: Transaction Message (required)
        :return: InlineResponse201
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'avalara_product_type', 'body']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method create_item" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `create_item`")
        # verify the required parameter 'avalara_product_type' is set
        if ('avalara_product_type' not in params) or (params['avalara_product_type'] is None):
            raise ValueError("Missing the required parameter `avalara_product_type` when calling `create_item`")
        # verify the required parameter 'body' is set
        if ('body' not in params) or (params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `create_item`")


        collection_formats = {}

        resource_path = '/companies/{companyId}/items?goods'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']

        query_params = {}

        header_params = {}
        if 'avalara_product_type' in params:
            header_params['Avalara-Product-Type'] = params['avalara_product_type']

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

    def delete_item(self, company_id, code, avalara_product_type, **kwargs):
        """
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.delete_item(company_id, code, avalara_product_type, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Item Code (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.delete_item_with_http_info(company_id, code, avalara_product_type, **kwargs)
        else:
            (data) = self.delete_item_with_http_info(company_id, code, avalara_product_type, **kwargs)
            return data

    def delete_item_with_http_info(self, company_id, code, avalara_product_type, **kwargs):
        """
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.delete_item_with_http_info(company_id, code, avalara_product_type, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Item Code (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'code', 'avalara_product_type']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method delete_item" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `delete_item`")
        # verify the required parameter 'code' is set
        if ('code' not in params) or (params['code'] is None):
            raise ValueError("Missing the required parameter `code` when calling `delete_item`")
        # verify the required parameter 'avalara_product_type' is set
        if ('avalara_product_type' not in params) or (params['avalara_product_type'] is None):
            raise ValueError("Missing the required parameter `avalara_product_type` when calling `delete_item`")

        if 'code' in params and len(params['code']) > 60:
            raise ValueError("Invalid value for parameter `code` when calling `delete_item`, length must be less than or equal to `60`")

        collection_formats = {}

        resource_path = '/companies/{companyId}/items/{code}?goods'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']
        if 'code' in params:
            path_params['code'] = params['code']

        query_params = {}

        header_params = {}
        if 'avalara_product_type' in params:
            header_params['Avalara-Product-Type'] = params['avalara_product_type']

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

    def update_item(self, company_id, code, avalara_product_type, body, **kwargs):
        """
        Update custom agast for one company
        This method operation create a custom agast for one company 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.update_item(company_id, code, avalara_product_type, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Item Code (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :param ItemGoods body: Transaction Message (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.update_item_with_http_info(company_id, code, avalara_product_type, body, **kwargs)
        else:
            (data) = self.update_item_with_http_info(company_id, code, avalara_product_type, body, **kwargs)
            return data

    def update_item_with_http_info(self, company_id, code, avalara_product_type, body, **kwargs):
        """
        Update custom agast for one company
        This method operation create a custom agast for one company 
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.update_item_with_http_info(company_id, code, avalara_product_type, body, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str company_id: Company ID (required)
        :param str code: Item Code (required)
        :param str avalara_product_type: Avalara Product Type (required)
        :param ItemGoods body: Transaction Message (required)
        :return: None
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['company_id', 'code', 'avalara_product_type', 'body']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method update_item" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'company_id' is set
        if ('company_id' not in params) or (params['company_id'] is None):
            raise ValueError("Missing the required parameter `company_id` when calling `update_item`")
        # verify the required parameter 'code' is set
        if ('code' not in params) or (params['code'] is None):
            raise ValueError("Missing the required parameter `code` when calling `update_item`")
        # verify the required parameter 'avalara_product_type' is set
        if ('avalara_product_type' not in params) or (params['avalara_product_type'] is None):
            raise ValueError("Missing the required parameter `avalara_product_type` when calling `update_item`")
        # verify the required parameter 'body' is set
        if ('body' not in params) or (params['body'] is None):
            raise ValueError("Missing the required parameter `body` when calling `update_item`")

        if 'code' in params and len(params['code']) > 60:
            raise ValueError("Invalid value for parameter `code` when calling `update_item`, length must be less than or equal to `60`")

        collection_formats = {}

        resource_path = '/companies/{companyId}/items/{code}?goods'.replace('{format}', 'json')
        path_params = {}
        if 'company_id' in params:
            path_params['companyId'] = params['company_id']
        if 'code' in params:
            path_params['code'] = params['code']

        query_params = {}

        header_params = {}
        if 'avalara_product_type' in params:
            header_params['Avalara-Product-Type'] = params['avalara_product_type']

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
