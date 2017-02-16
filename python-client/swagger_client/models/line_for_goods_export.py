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


class LineForGoodsExport(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, drawback_number=None, ind_export=None):
        """
        LineForGoodsExport - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'drawback_number': 'str',
            'ind_export': 'LineForGoodsIndExport'
        }

        self.attribute_map = {
            'drawback_number': 'drawbackNumber',
            'ind_export': 'indExport'
        }

        self._drawback_number = drawback_number
        self._ind_export = ind_export

    @property
    def drawback_number(self):
        """
        Gets the drawback_number of this LineForGoodsExport.

        :return: The drawback_number of this LineForGoodsExport.
        :rtype: str
        """
        return self._drawback_number

    @drawback_number.setter
    def drawback_number(self, drawback_number):
        """
        Sets the drawback_number of this LineForGoodsExport.

        :param drawback_number: The drawback_number of this LineForGoodsExport.
        :type: str
        """
        if drawback_number is not None and len(drawback_number) > 11:
            raise ValueError("Invalid value for `drawback_number`, length must be less than or equal to `11`")
        if drawback_number is not None and not re.search('[0-9]{0,11}', drawback_number):
            raise ValueError("Invalid value for `drawback_number`, must be a follow pattern or equal to `/[0-9]{0,11}/`")

        self._drawback_number = drawback_number

    @property
    def ind_export(self):
        """
        Gets the ind_export of this LineForGoodsExport.

        :return: The ind_export of this LineForGoodsExport.
        :rtype: LineForGoodsIndExport
        """
        return self._ind_export

    @ind_export.setter
    def ind_export(self, ind_export):
        """
        Sets the ind_export of this LineForGoodsExport.

        :param ind_export: The ind_export of this LineForGoodsExport.
        :type: LineForGoodsIndExport
        """

        self._ind_export = ind_export

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