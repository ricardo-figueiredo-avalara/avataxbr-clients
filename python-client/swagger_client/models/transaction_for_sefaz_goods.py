# coding: utf-8

"""
    AvaTax Brazil

    The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class TransactionForSefazGoods(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, header=None, lines=None, calculated_tax_summary=None):
        """
        TransactionForSefazGoods - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'header': 'HeaderForGoods',
            'lines': 'list[LineForSefazGoods]',
            'calculated_tax_summary': 'CalculatedTaxSummaryForGoods'
        }

        self.attribute_map = {
            'header': 'header',
            'lines': 'lines',
            'calculated_tax_summary': 'calculatedTaxSummary'
        }

        self._header = header
        self._lines = lines
        self._calculated_tax_summary = calculated_tax_summary

    @property
    def header(self):
        """
        Gets the header of this TransactionForSefazGoods.

        :return: The header of this TransactionForSefazGoods.
        :rtype: HeaderForGoods
        """
        return self._header

    @header.setter
    def header(self, header):
        """
        Sets the header of this TransactionForSefazGoods.

        :param header: The header of this TransactionForSefazGoods.
        :type: HeaderForGoods
        """

        self._header = header

    @property
    def lines(self):
        """
        Gets the lines of this TransactionForSefazGoods.

        :return: The lines of this TransactionForSefazGoods.
        :rtype: list[LineForSefazGoods]
        """
        return self._lines

    @lines.setter
    def lines(self, lines):
        """
        Sets the lines of this TransactionForSefazGoods.

        :param lines: The lines of this TransactionForSefazGoods.
        :type: list[LineForSefazGoods]
        """

        self._lines = lines

    @property
    def calculated_tax_summary(self):
        """
        Gets the calculated_tax_summary of this TransactionForSefazGoods.

        :return: The calculated_tax_summary of this TransactionForSefazGoods.
        :rtype: CalculatedTaxSummaryForGoods
        """
        return self._calculated_tax_summary

    @calculated_tax_summary.setter
    def calculated_tax_summary(self, calculated_tax_summary):
        """
        Sets the calculated_tax_summary of this TransactionForSefazGoods.

        :param calculated_tax_summary: The calculated_tax_summary of this TransactionForSefazGoods.
        :type: CalculatedTaxSummaryForGoods
        """

        self._calculated_tax_summary = calculated_tax_summary

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
