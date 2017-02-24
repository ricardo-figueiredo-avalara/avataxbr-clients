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
from swagger_client.apis.service_transactions_api import ServiceTransactionsApi


class TestServiceTransactionsApi(unittest.TestCase):
    """ ServiceTransactionsApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.service_transactions_api.ServiceTransactionsApi()

    def tearDown(self):
        pass

    def test_transactions_account_account_id_company_company_code_transaction_type_document_code_get(self):
        """
        Test case for transactions_account_account_id_company_company_code_transaction_type_document_code_get

        Retrieve transactions
        """
        pass

    def test_transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post(self):
        """
        Test case for transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post

        Transaction State Transition
        """
        pass

    def test_transactions_account_account_id_company_company_code_transaction_type_get(self):
        """
        Test case for transactions_account_account_id_company_company_code_transaction_type_get

        Retrieve transactions
        """
        pass

    def test_transactionsservice_payment_post(self):
        """
        Test case for transactionsservice_payment_post

        Calculation Method
        """
        pass

    def test_transactionsservice_purchase_post(self):
        """
        Test case for transactionsservice_purchase_post

        Calculation Method
        """
        pass

    def test_transactionsservice_receipt_post(self):
        """
        Test case for transactionsservice_receipt_post

        Calculation Method
        """
        pass

    def test_transactionsservice_sales_post(self):
        """
        Test case for transactionsservice_sales_post

        Calculation Method
        """
        pass


if __name__ == '__main__':
    unittest.main()
