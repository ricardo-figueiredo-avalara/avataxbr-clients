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


class ReceiptTransactionOut(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, header=None, lines=None, calculated_tax_summary=None, processing_info=None):
        """
        ReceiptTransactionOut - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'header': 'PayRecHeader',
            'lines': 'list[PayRecLinesOut]',
            'calculated_tax_summary': 'PayRecCalculatedTaxSummaryForService',
            'processing_info': 'ProcessingInfo'
        }

        self.attribute_map = {
            'header': 'header',
            'lines': 'lines',
            'calculated_tax_summary': 'calculatedTaxSummary',
            'processing_info': 'processingInfo'
        }

        self._header = header
        self._lines = lines
        self._calculated_tax_summary = calculated_tax_summary
        self._processing_info = processing_info

    @property
    def header(self):
        """
        Gets the header of this ReceiptTransactionOut.

        :return: The header of this ReceiptTransactionOut.
        :rtype: PayRecHeader
        """
        return self._header

    @header.setter
    def header(self, header):
        """
        Sets the header of this ReceiptTransactionOut.

        :param header: The header of this ReceiptTransactionOut.
        :type: PayRecHeader
        """
        if header is None:
            raise ValueError("Invalid value for `header`, must not be `None`")

        self._header = header

    @property
    def lines(self):
        """
        Gets the lines of this ReceiptTransactionOut.

        :return: The lines of this ReceiptTransactionOut.
        :rtype: list[PayRecLinesOut]
        """
        return self._lines

    @lines.setter
    def lines(self, lines):
        """
        Sets the lines of this ReceiptTransactionOut.

        :param lines: The lines of this ReceiptTransactionOut.
        :type: list[PayRecLinesOut]
        """
        if lines is None:
            raise ValueError("Invalid value for `lines`, must not be `None`")

        self._lines = lines

    @property
    def calculated_tax_summary(self):
        """
        Gets the calculated_tax_summary of this ReceiptTransactionOut.

        :return: The calculated_tax_summary of this ReceiptTransactionOut.
        :rtype: PayRecCalculatedTaxSummaryForService
        """
        return self._calculated_tax_summary

    @calculated_tax_summary.setter
    def calculated_tax_summary(self, calculated_tax_summary):
        """
        Sets the calculated_tax_summary of this ReceiptTransactionOut.

        :param calculated_tax_summary: The calculated_tax_summary of this ReceiptTransactionOut.
        :type: PayRecCalculatedTaxSummaryForService
        """
        if calculated_tax_summary is None:
            raise ValueError("Invalid value for `calculated_tax_summary`, must not be `None`")

        self._calculated_tax_summary = calculated_tax_summary

    @property
    def processing_info(self):
        """
        Gets the processing_info of this ReceiptTransactionOut.

        :return: The processing_info of this ReceiptTransactionOut.
        :rtype: ProcessingInfo
        """
        return self._processing_info

    @processing_info.setter
    def processing_info(self, processing_info):
        """
        Sets the processing_info of this ReceiptTransactionOut.

        :param processing_info: The processing_info of this ReceiptTransactionOut.
        :type: ProcessingInfo
        """
        if processing_info is None:
            raise ValueError("Invalid value for `processing_info`, must not be `None`")

        self._processing_info = processing_info

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
