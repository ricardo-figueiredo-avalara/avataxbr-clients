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


class ServiceItemTaxRate(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, tax_type=None, rate_type=None, rate=None, is_exempt=None, discount=None, zone1=None, zone2=None, period=None, reason=None, message=None):
        """
        ServiceItemTaxRate - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'tax_type': 'str',
            'rate_type': 'str',
            'rate': 'float',
            'is_exempt': 'bool',
            'discount': 'float',
            'zone1': 'int',
            'zone2': 'int',
            'period': 'ServiceItemTaxRatePeriod',
            'reason': 'str',
            'message': 'str'
        }

        self.attribute_map = {
            'tax_type': 'taxType',
            'rate_type': 'rateType',
            'rate': 'rate',
            'is_exempt': 'isExempt',
            'discount': 'discount',
            'zone1': 'zone1',
            'zone2': 'zone2',
            'period': 'period',
            'reason': 'reason',
            'message': 'message'
        }

        self._tax_type = tax_type
        self._rate_type = rate_type
        self._rate = rate
        self._is_exempt = is_exempt
        self._discount = discount
        self._zone1 = zone1
        self._zone2 = zone2
        self._period = period
        self._reason = reason
        self._message = message

    @property
    def tax_type(self):
        """
        Gets the tax_type of this ServiceItemTaxRate.

        :return: The tax_type of this ServiceItemTaxRate.
        :rtype: str
        """
        return self._tax_type

    @tax_type.setter
    def tax_type(self, tax_type):
        """
        Sets the tax_type of this ServiceItemTaxRate.

        :param tax_type: The tax_type of this ServiceItemTaxRate.
        :type: str
        """

        self._tax_type = tax_type

    @property
    def rate_type(self):
        """
        Gets the rate_type of this ServiceItemTaxRate.

        :return: The rate_type of this ServiceItemTaxRate.
        :rtype: str
        """
        return self._rate_type

    @rate_type.setter
    def rate_type(self, rate_type):
        """
        Sets the rate_type of this ServiceItemTaxRate.

        :param rate_type: The rate_type of this ServiceItemTaxRate.
        :type: str
        """

        self._rate_type = rate_type

    @property
    def rate(self):
        """
        Gets the rate of this ServiceItemTaxRate.

        :return: The rate of this ServiceItemTaxRate.
        :rtype: float
        """
        return self._rate

    @rate.setter
    def rate(self, rate):
        """
        Sets the rate of this ServiceItemTaxRate.

        :param rate: The rate of this ServiceItemTaxRate.
        :type: float
        """

        self._rate = rate

    @property
    def is_exempt(self):
        """
        Gets the is_exempt of this ServiceItemTaxRate.

        :return: The is_exempt of this ServiceItemTaxRate.
        :rtype: bool
        """
        return self._is_exempt

    @is_exempt.setter
    def is_exempt(self, is_exempt):
        """
        Sets the is_exempt of this ServiceItemTaxRate.

        :param is_exempt: The is_exempt of this ServiceItemTaxRate.
        :type: bool
        """

        self._is_exempt = is_exempt

    @property
    def discount(self):
        """
        Gets the discount of this ServiceItemTaxRate.

        :return: The discount of this ServiceItemTaxRate.
        :rtype: float
        """
        return self._discount

    @discount.setter
    def discount(self, discount):
        """
        Sets the discount of this ServiceItemTaxRate.

        :param discount: The discount of this ServiceItemTaxRate.
        :type: float
        """

        self._discount = discount

    @property
    def zone1(self):
        """
        Gets the zone1 of this ServiceItemTaxRate.

        :return: The zone1 of this ServiceItemTaxRate.
        :rtype: int
        """
        return self._zone1

    @zone1.setter
    def zone1(self, zone1):
        """
        Sets the zone1 of this ServiceItemTaxRate.

        :param zone1: The zone1 of this ServiceItemTaxRate.
        :type: int
        """

        self._zone1 = zone1

    @property
    def zone2(self):
        """
        Gets the zone2 of this ServiceItemTaxRate.

        :return: The zone2 of this ServiceItemTaxRate.
        :rtype: int
        """
        return self._zone2

    @zone2.setter
    def zone2(self, zone2):
        """
        Sets the zone2 of this ServiceItemTaxRate.

        :param zone2: The zone2 of this ServiceItemTaxRate.
        :type: int
        """

        self._zone2 = zone2

    @property
    def period(self):
        """
        Gets the period of this ServiceItemTaxRate.

        :return: The period of this ServiceItemTaxRate.
        :rtype: ServiceItemTaxRatePeriod
        """
        return self._period

    @period.setter
    def period(self, period):
        """
        Sets the period of this ServiceItemTaxRate.

        :param period: The period of this ServiceItemTaxRate.
        :type: ServiceItemTaxRatePeriod
        """

        self._period = period

    @property
    def reason(self):
        """
        Gets the reason of this ServiceItemTaxRate.

        :return: The reason of this ServiceItemTaxRate.
        :rtype: str
        """
        return self._reason

    @reason.setter
    def reason(self, reason):
        """
        Sets the reason of this ServiceItemTaxRate.

        :param reason: The reason of this ServiceItemTaxRate.
        :type: str
        """

        self._reason = reason

    @property
    def message(self):
        """
        Gets the message of this ServiceItemTaxRate.

        :return: The message of this ServiceItemTaxRate.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this ServiceItemTaxRate.

        :param message: The message of this ServiceItemTaxRate.
        :type: str
        """

        self._message = message

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
