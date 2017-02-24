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


class SalesHeaderInPayment(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, terms=None, installments=None):
        """
        SalesHeaderInPayment - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'terms': 'PaymentTerms',
            'installments': 'list[SalesInstallmentIn]'
        }

        self.attribute_map = {
            'terms': 'terms',
            'installments': 'installments'
        }

        self._terms = terms
        self._installments = installments

    @property
    def terms(self):
        """
        Gets the terms of this SalesHeaderInPayment.

        :return: The terms of this SalesHeaderInPayment.
        :rtype: PaymentTerms
        """
        return self._terms

    @terms.setter
    def terms(self, terms):
        """
        Sets the terms of this SalesHeaderInPayment.

        :param terms: The terms of this SalesHeaderInPayment.
        :type: PaymentTerms
        """

        self._terms = terms

    @property
    def installments(self):
        """
        Gets the installments of this SalesHeaderInPayment.
        installments

        :return: The installments of this SalesHeaderInPayment.
        :rtype: list[SalesInstallmentIn]
        """
        return self._installments

    @installments.setter
    def installments(self, installments):
        """
        Sets the installments of this SalesHeaderInPayment.
        installments

        :param installments: The installments of this SalesHeaderInPayment.
        :type: list[SalesInstallmentIn]
        """

        self._installments = installments

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
