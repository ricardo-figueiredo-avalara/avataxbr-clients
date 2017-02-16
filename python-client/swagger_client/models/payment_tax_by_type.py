# coding: utf-8

"""
    BR16 - API

    This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class PaymentTaxByType(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, irrf=None, inss_rf=None, iss_rf=None, pis_rf=None, cofins_rf=None, csll_rf=None):
        """
        PaymentTaxByType - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'irrf': 'TaxByTypeTax',
            'inss_rf': 'TaxByTypeTax',
            'iss_rf': 'TaxByTypeTax',
            'pis_rf': 'TaxByTypeTax',
            'cofins_rf': 'TaxByTypeTax',
            'csll_rf': 'TaxByTypeTax'
        }

        self.attribute_map = {
            'irrf': 'irrf',
            'inss_rf': 'inssRf',
            'iss_rf': 'issRf',
            'pis_rf': 'pisRf',
            'cofins_rf': 'cofinsRf',
            'csll_rf': 'csllRf'
        }

        self._irrf = irrf
        self._inss_rf = inss_rf
        self._iss_rf = iss_rf
        self._pis_rf = pis_rf
        self._cofins_rf = cofins_rf
        self._csll_rf = csll_rf

    @property
    def irrf(self):
        """
        Gets the irrf of this PaymentTaxByType.

        :return: The irrf of this PaymentTaxByType.
        :rtype: TaxByTypeTax
        """
        return self._irrf

    @irrf.setter
    def irrf(self, irrf):
        """
        Sets the irrf of this PaymentTaxByType.

        :param irrf: The irrf of this PaymentTaxByType.
        :type: TaxByTypeTax
        """

        self._irrf = irrf

    @property
    def inss_rf(self):
        """
        Gets the inss_rf of this PaymentTaxByType.

        :return: The inss_rf of this PaymentTaxByType.
        :rtype: TaxByTypeTax
        """
        return self._inss_rf

    @inss_rf.setter
    def inss_rf(self, inss_rf):
        """
        Sets the inss_rf of this PaymentTaxByType.

        :param inss_rf: The inss_rf of this PaymentTaxByType.
        :type: TaxByTypeTax
        """

        self._inss_rf = inss_rf

    @property
    def iss_rf(self):
        """
        Gets the iss_rf of this PaymentTaxByType.

        :return: The iss_rf of this PaymentTaxByType.
        :rtype: TaxByTypeTax
        """
        return self._iss_rf

    @iss_rf.setter
    def iss_rf(self, iss_rf):
        """
        Sets the iss_rf of this PaymentTaxByType.

        :param iss_rf: The iss_rf of this PaymentTaxByType.
        :type: TaxByTypeTax
        """

        self._iss_rf = iss_rf

    @property
    def pis_rf(self):
        """
        Gets the pis_rf of this PaymentTaxByType.

        :return: The pis_rf of this PaymentTaxByType.
        :rtype: TaxByTypeTax
        """
        return self._pis_rf

    @pis_rf.setter
    def pis_rf(self, pis_rf):
        """
        Sets the pis_rf of this PaymentTaxByType.

        :param pis_rf: The pis_rf of this PaymentTaxByType.
        :type: TaxByTypeTax
        """

        self._pis_rf = pis_rf

    @property
    def cofins_rf(self):
        """
        Gets the cofins_rf of this PaymentTaxByType.

        :return: The cofins_rf of this PaymentTaxByType.
        :rtype: TaxByTypeTax
        """
        return self._cofins_rf

    @cofins_rf.setter
    def cofins_rf(self, cofins_rf):
        """
        Sets the cofins_rf of this PaymentTaxByType.

        :param cofins_rf: The cofins_rf of this PaymentTaxByType.
        :type: TaxByTypeTax
        """

        self._cofins_rf = cofins_rf

    @property
    def csll_rf(self):
        """
        Gets the csll_rf of this PaymentTaxByType.

        :return: The csll_rf of this PaymentTaxByType.
        :rtype: TaxByTypeTax
        """
        return self._csll_rf

    @csll_rf.setter
    def csll_rf(self, csll_rf):
        """
        Sets the csll_rf of this PaymentTaxByType.

        :param csll_rf: The csll_rf of this PaymentTaxByType.
        :type: TaxByTypeTax
        """

        self._csll_rf = csll_rf

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other