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


class SalesInstallmentIn(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, document_number=None, date=None, gross_value=None):
        """
        SalesInstallmentIn - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'document_number': 'str',
            'date': 'date',
            'gross_value': 'float'
        }

        self.attribute_map = {
            'document_number': 'documentNumber',
            'date': 'date',
            'gross_value': 'grossValue'
        }

        self._document_number = document_number
        self._date = date
        self._gross_value = gross_value

    @property
    def document_number(self):
        """
        Gets the document_number of this SalesInstallmentIn.
        DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction

        :return: The document_number of this SalesInstallmentIn.
        :rtype: str
        """
        return self._document_number

    @document_number.setter
    def document_number(self, document_number):
        """
        Sets the document_number of this SalesInstallmentIn.
        DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction

        :param document_number: The document_number of this SalesInstallmentIn.
        :type: str
        """
        if document_number is None:
            raise ValueError("Invalid value for `document_number`, must not be `None`")

        self._document_number = document_number

    @property
    def date(self):
        """
        Gets the date of this SalesInstallmentIn.
        installment Due Date

        :return: The date of this SalesInstallmentIn.
        :rtype: date
        """
        return self._date

    @date.setter
    def date(self, date):
        """
        Sets the date of this SalesInstallmentIn.
        installment Due Date

        :param date: The date of this SalesInstallmentIn.
        :type: date
        """
        if date is None:
            raise ValueError("Invalid value for `date`, must not be `None`")

        self._date = date

    @property
    def gross_value(self):
        """
        Gets the gross_value of this SalesInstallmentIn.
        Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)

        :return: The gross_value of this SalesInstallmentIn.
        :rtype: float
        """
        return self._gross_value

    @gross_value.setter
    def gross_value(self, gross_value):
        """
        Sets the gross_value of this SalesInstallmentIn.
        Intallment value, fraction of  ∑(lineAmount - lineTaxedDiscount)

        :param gross_value: The gross_value of this SalesInstallmentIn.
        :type: float
        """
        if gross_value is None:
            raise ValueError("Invalid value for `gross_value`, must not be `None`")

        self._gross_value = gross_value

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