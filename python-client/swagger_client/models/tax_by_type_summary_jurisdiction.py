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


class TaxByTypeSummaryJurisdiction(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, jurisdiction_name=None, jurisdiction_type=None, tax=None):
        """
        TaxByTypeSummaryJurisdiction - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'jurisdiction_name': 'str',
            'jurisdiction_type': 'str',
            'tax': 'float'
        }

        self.attribute_map = {
            'jurisdiction_name': 'jurisdictionName',
            'jurisdiction_type': 'jurisdictionType',
            'tax': 'tax'
        }

        self._jurisdiction_name = jurisdiction_name
        self._jurisdiction_type = jurisdiction_type
        self._tax = tax

    @property
    def jurisdiction_name(self):
        """
        Gets the jurisdiction_name of this TaxByTypeSummaryJurisdiction.
        Jurisdiction used for calctax amount

        :return: The jurisdiction_name of this TaxByTypeSummaryJurisdiction.
        :rtype: str
        """
        return self._jurisdiction_name

    @jurisdiction_name.setter
    def jurisdiction_name(self, jurisdiction_name):
        """
        Sets the jurisdiction_name of this TaxByTypeSummaryJurisdiction.
        Jurisdiction used for calctax amount

        :param jurisdiction_name: The jurisdiction_name of this TaxByTypeSummaryJurisdiction.
        :type: str
        """

        self._jurisdiction_name = jurisdiction_name

    @property
    def jurisdiction_type(self):
        """
        Gets the jurisdiction_type of this TaxByTypeSummaryJurisdiction.
        Type of jurisdiction - 'City' - 'State' - 'Country' 

        :return: The jurisdiction_type of this TaxByTypeSummaryJurisdiction.
        :rtype: str
        """
        return self._jurisdiction_type

    @jurisdiction_type.setter
    def jurisdiction_type(self, jurisdiction_type):
        """
        Sets the jurisdiction_type of this TaxByTypeSummaryJurisdiction.
        Type of jurisdiction - 'City' - 'State' - 'Country' 

        :param jurisdiction_type: The jurisdiction_type of this TaxByTypeSummaryJurisdiction.
        :type: str
        """
        allowed_values = ["City", "State", "Country"]
        if jurisdiction_type not in allowed_values:
            raise ValueError(
                "Invalid value for `jurisdiction_type` ({0}), must be one of {1}"
                .format(jurisdiction_type, allowed_values)
            )

        self._jurisdiction_type = jurisdiction_type

    @property
    def tax(self):
        """
        Gets the tax of this TaxByTypeSummaryJurisdiction.
        sum of referenced tax value by jurisdiction

        :return: The tax of this TaxByTypeSummaryJurisdiction.
        :rtype: float
        """
        return self._tax

    @tax.setter
    def tax(self, tax):
        """
        Sets the tax of this TaxByTypeSummaryJurisdiction.
        sum of referenced tax value by jurisdiction

        :param tax: The tax of this TaxByTypeSummaryJurisdiction.
        :type: float
        """

        self._tax = tax

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