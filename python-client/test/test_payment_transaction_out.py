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
from swagger_client.models.payment_transaction_out import PaymentTransactionOut


class TestPaymentTransactionOut(unittest.TestCase):
    """ PaymentTransactionOut unit test stubs """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testPaymentTransactionOut(self):
        """
        Test PaymentTransactionOut
        """
        model = swagger_client.models.payment_transaction_out.PaymentTransactionOut()


if __name__ == '__main__':
    unittest.main()
