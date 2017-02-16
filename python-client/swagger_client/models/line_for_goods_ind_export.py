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


class LineForGoodsIndExport(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, register_number=None, access_key=None, quantity=None):
        """
        LineForGoodsIndExport - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'register_number': 'str',
            'access_key': 'str',
            'quantity': 'float'
        }

        self.attribute_map = {
            'register_number': 'registerNumber',
            'access_key': 'accessKey',
            'quantity': 'quantity'
        }

        self._register_number = register_number
        self._access_key = access_key
        self._quantity = quantity

    @property
    def register_number(self):
        """
        Gets the register_number of this LineForGoodsIndExport.
        Exportation register number

        :return: The register_number of this LineForGoodsIndExport.
        :rtype: str
        """
        return self._register_number

    @register_number.setter
    def register_number(self, register_number):
        """
        Sets the register_number of this LineForGoodsIndExport.
        Exportation register number

        :param register_number: The register_number of this LineForGoodsIndExport.
        :type: str
        """
        if register_number is None:
            raise ValueError("Invalid value for `register_number`, must not be `None`")
        if register_number is not None and len(register_number) > 12:
            raise ValueError("Invalid value for `register_number`, length must be less than or equal to `12`")
        if register_number is not None and not re.search('[0-9]{0,12}', register_number):
            raise ValueError("Invalid value for `register_number`, must be a follow pattern or equal to `/[0-9]{0,12}/`")

        self._register_number = register_number

    @property
    def access_key(self):
        """
        Gets the access_key of this LineForGoodsIndExport.
        invoice access key received to export

        :return: The access_key of this LineForGoodsIndExport.
        :rtype: str
        """
        return self._access_key

    @access_key.setter
    def access_key(self, access_key):
        """
        Sets the access_key of this LineForGoodsIndExport.
        invoice access key received to export

        :param access_key: The access_key of this LineForGoodsIndExport.
        :type: str
        """
        if access_key is None:
            raise ValueError("Invalid value for `access_key`, must not be `None`")
        if access_key is not None and len(access_key) > 44:
            raise ValueError("Invalid value for `access_key`, length must be less than or equal to `44`")
        if access_key is not None and not re.search('[0-9]{44}', access_key):
            raise ValueError("Invalid value for `access_key`, must be a follow pattern or equal to `/[0-9]{44}/`")

        self._access_key = access_key

    @property
    def quantity(self):
        """
        Gets the quantity of this LineForGoodsIndExport.
        This decimal 11 integers and 0 to 4 decimals, quantity exported in real

        :return: The quantity of this LineForGoodsIndExport.
        :rtype: float
        """
        return self._quantity

    @quantity.setter
    def quantity(self, quantity):
        """
        Sets the quantity of this LineForGoodsIndExport.
        This decimal 11 integers and 0 to 4 decimals, quantity exported in real

        :param quantity: The quantity of this LineForGoodsIndExport.
        :type: float
        """
        if quantity is None:
            raise ValueError("Invalid value for `quantity`, must not be `None`")

        self._quantity = quantity

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