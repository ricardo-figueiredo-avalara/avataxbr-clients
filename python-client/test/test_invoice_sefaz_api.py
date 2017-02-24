# coding: utf-8

"""
    AvaTax Brazil

    The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.apis.invoice_sefaz_api import InvoiceSEFAZApi


class TestInvoiceSEFAZApi(unittest.TestCase):
    """ InvoiceSEFAZApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.invoice_sefaz_api.InvoiceSEFAZApi()

    def tearDown(self):
        pass

    def test_invoices_sefaz_delete(self):
        """
        Test case for invoices_sefaz_delete

        Disable Range e-Invoice
        """
        pass

    def test_invoices_sefaz_key_delete(self):
        """
        Test case for invoices_sefaz_key_delete

        Cancel invoice
        """
        pass

    def test_invoices_sefaz_key_get(self):
        """
        Test case for invoices_sefaz_key_get

        Retrieve invoice
        """
        pass

    def test_invoices_sefaz_key_lookup_get(self):
        """
        Test case for invoices_sefaz_key_lookup_get

        Retrieve invoice
        """
        pass

    def test_invoices_sefaz_key_put(self):
        """
        Test case for invoices_sefaz_key_put

        Fix Letter
        """
        pass

    def test_invoices_sefaz_post(self):
        """
        Test case for invoices_sefaz_post

        Send an e-Invoice
        """
        pass

    def test_invoices_sefaz_status_get(self):
        """
        Test case for invoices_sefaz_status_get

        Retrieve Status of SEFAZ Server
        """
        pass


if __name__ == '__main__':
    unittest.main()
