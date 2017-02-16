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


class PayRecCalculatedTaxSummaryForService(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, number_of_lines=None, subtotal=None, total_tax=None, grand_total=None, pcc_withholding_modes=None, tax_by_type=None):
        """
        PayRecCalculatedTaxSummaryForService - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'number_of_lines': 'int',
            'subtotal': 'float',
            'total_tax': 'float',
            'grand_total': 'float',
            'pcc_withholding_modes': 'list[PccWithholdingMode]',
            'tax_by_type': 'PayRecCalculatedTaxSummaryForServiceTaxByType'
        }

        self.attribute_map = {
            'number_of_lines': 'numberOfLines',
            'subtotal': 'subtotal',
            'total_tax': 'totalTax',
            'grand_total': 'grandTotal',
            'pcc_withholding_modes': 'pccWithholdingModes',
            'tax_by_type': 'taxByType'
        }

        self._number_of_lines = number_of_lines
        self._subtotal = subtotal
        self._total_tax = total_tax
        self._grand_total = grand_total
        self._pcc_withholding_modes = pcc_withholding_modes
        self._tax_by_type = tax_by_type

    @property
    def number_of_lines(self):
        """
        Gets the number_of_lines of this PayRecCalculatedTaxSummaryForService.
        Count of lines

        :return: The number_of_lines of this PayRecCalculatedTaxSummaryForService.
        :rtype: int
        """
        return self._number_of_lines

    @number_of_lines.setter
    def number_of_lines(self, number_of_lines):
        """
        Sets the number_of_lines of this PayRecCalculatedTaxSummaryForService.
        Count of lines

        :param number_of_lines: The number_of_lines of this PayRecCalculatedTaxSummaryForService.
        :type: int
        """

        self._number_of_lines = number_of_lines

    @property
    def subtotal(self):
        """
        Gets the subtotal of this PayRecCalculatedTaxSummaryForService.
        Sum of grossvalues

        :return: The subtotal of this PayRecCalculatedTaxSummaryForService.
        :rtype: float
        """
        return self._subtotal

    @subtotal.setter
    def subtotal(self, subtotal):
        """
        Sets the subtotal of this PayRecCalculatedTaxSummaryForService.
        Sum of grossvalues

        :param subtotal: The subtotal of this PayRecCalculatedTaxSummaryForService.
        :type: float
        """

        self._subtotal = subtotal

    @property
    def total_tax(self):
        """
        Gets the total_tax of this PayRecCalculatedTaxSummaryForService.
        Sum of all withholding values

        :return: The total_tax of this PayRecCalculatedTaxSummaryForService.
        :rtype: float
        """
        return self._total_tax

    @total_tax.setter
    def total_tax(self, total_tax):
        """
        Sets the total_tax of this PayRecCalculatedTaxSummaryForService.
        Sum of all withholding values

        :param total_tax: The total_tax of this PayRecCalculatedTaxSummaryForService.
        :type: float
        """

        self._total_tax = total_tax

    @property
    def grand_total(self):
        """
        Gets the grand_total of this PayRecCalculatedTaxSummaryForService.
        Sum all NetValues

        :return: The grand_total of this PayRecCalculatedTaxSummaryForService.
        :rtype: float
        """
        return self._grand_total

    @grand_total.setter
    def grand_total(self, grand_total):
        """
        Sets the grand_total of this PayRecCalculatedTaxSummaryForService.
        Sum all NetValues

        :param grand_total: The grand_total of this PayRecCalculatedTaxSummaryForService.
        :type: float
        """

        self._grand_total = grand_total

    @property
    def pcc_withholding_modes(self):
        """
        Gets the pcc_withholding_modes of this PayRecCalculatedTaxSummaryForService.

        :return: The pcc_withholding_modes of this PayRecCalculatedTaxSummaryForService.
        :rtype: list[PccWithholdingMode]
        """
        return self._pcc_withholding_modes

    @pcc_withholding_modes.setter
    def pcc_withholding_modes(self, pcc_withholding_modes):
        """
        Sets the pcc_withholding_modes of this PayRecCalculatedTaxSummaryForService.

        :param pcc_withholding_modes: The pcc_withholding_modes of this PayRecCalculatedTaxSummaryForService.
        :type: list[PccWithholdingMode]
        """

        self._pcc_withholding_modes = pcc_withholding_modes

    @property
    def tax_by_type(self):
        """
        Gets the tax_by_type of this PayRecCalculatedTaxSummaryForService.

        :return: The tax_by_type of this PayRecCalculatedTaxSummaryForService.
        :rtype: PayRecCalculatedTaxSummaryForServiceTaxByType
        """
        return self._tax_by_type

    @tax_by_type.setter
    def tax_by_type(self, tax_by_type):
        """
        Sets the tax_by_type of this PayRecCalculatedTaxSummaryForService.

        :param tax_by_type: The tax_by_type of this PayRecCalculatedTaxSummaryForService.
        :type: PayRecCalculatedTaxSummaryForServiceTaxByType
        """

        self._tax_by_type = tax_by_type

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