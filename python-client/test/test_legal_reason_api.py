# coding: utf-8

"""
    BR16 - API

    This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import os
import sys
import unittest

import swagger_client
from swagger_client.rest import ApiException
from swagger_client.apis.legal_reason_api import LegalReasonApi


class TestLegalReasonApi(unittest.TestCase):
    """ LegalReasonApi unit test stubs """

    def setUp(self):
        self.api = swagger_client.apis.legal_reason_api.LegalReasonApi()

    def tearDown(self):
        pass

    def test_create_reason_(self):
        """
        Test case for create_reason_

        Create Legal Reason.
        """
        pass

    def test_delete_reason_(self):
        """
        Test case for delete_reason_

        Delete a Legal Reason entry.
        """
        pass

    def test_get_reason_(self):
        """
        Test case for get_reason_

        Get single Legal Reason.
        """
        pass

    def test_list_reason(self):
        """
        Test case for list_reason

        List Legal Reasons.
        """
        pass

    def test_update_reason_(self):
        """
        Test case for update_reason_

        Update Legal Reason.
        """
        pass


if __name__ == '__main__':
    unittest.main()
