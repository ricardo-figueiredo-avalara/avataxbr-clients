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
from swagger_client.models.sefaz_post_out import SefazPostOut


class TestSefazPostOut(unittest.TestCase):
    """ SefazPostOut unit test stubs """

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSefazPostOut(self):
        """
        Test SefazPostOut
        """
        model = swagger_client.models.sefaz_post_out.SefazPostOut()


if __name__ == '__main__':
    unittest.main()
