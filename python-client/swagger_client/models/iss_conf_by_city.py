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


class IssConfByCity(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, city_code=None, name=None, state=None, iss_wh_dest_other_cities=None, iss_wh_dest_same_city=None, iss_wh_origin_unreg_seller=None, service_list=None):
        """
        IssConfByCity - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'city_code': 'int',
            'name': 'str',
            'state': 'StateEnum',
            'iss_wh_dest_other_cities': 'bool',
            'iss_wh_dest_same_city': 'bool',
            'iss_wh_origin_unreg_seller': 'bool',
            'service_list': 'list[IssConfServiceList]'
        }

        self.attribute_map = {
            'city_code': 'cityCode',
            'name': 'name',
            'state': 'state',
            'iss_wh_dest_other_cities': 'issWhDestOtherCities',
            'iss_wh_dest_same_city': 'issWhDestSameCity',
            'iss_wh_origin_unreg_seller': 'issWhOriginUnregSeller',
            'service_list': 'serviceList'
        }

        self._city_code = city_code
        self._name = name
        self._state = state
        self._iss_wh_dest_other_cities = iss_wh_dest_other_cities
        self._iss_wh_dest_same_city = iss_wh_dest_same_city
        self._iss_wh_origin_unreg_seller = iss_wh_origin_unreg_seller
        self._service_list = service_list

    @property
    def city_code(self):
        """
        Gets the city_code of this IssConfByCity.
        City Code (IBGE)

        :return: The city_code of this IssConfByCity.
        :rtype: int
        """
        return self._city_code

    @city_code.setter
    def city_code(self, city_code):
        """
        Sets the city_code of this IssConfByCity.
        City Code (IBGE)

        :param city_code: The city_code of this IssConfByCity.
        :type: int
        """
        if city_code is None:
            raise ValueError("Invalid value for `city_code`, must not be `None`")

        self._city_code = city_code

    @property
    def name(self):
        """
        Gets the name of this IssConfByCity.

        :return: The name of this IssConfByCity.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this IssConfByCity.

        :param name: The name of this IssConfByCity.
        :type: str
        """

        self._name = name

    @property
    def state(self):
        """
        Gets the state of this IssConfByCity.

        :return: The state of this IssConfByCity.
        :rtype: StateEnum
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this IssConfByCity.

        :param state: The state of this IssConfByCity.
        :type: StateEnum
        """

        self._state = state

    @property
    def iss_wh_dest_other_cities(self):
        """
        Gets the iss_wh_dest_other_cities of this IssConfByCity.

        :return: The iss_wh_dest_other_cities of this IssConfByCity.
        :rtype: bool
        """
        return self._iss_wh_dest_other_cities

    @iss_wh_dest_other_cities.setter
    def iss_wh_dest_other_cities(self, iss_wh_dest_other_cities):
        """
        Sets the iss_wh_dest_other_cities of this IssConfByCity.

        :param iss_wh_dest_other_cities: The iss_wh_dest_other_cities of this IssConfByCity.
        :type: bool
        """

        self._iss_wh_dest_other_cities = iss_wh_dest_other_cities

    @property
    def iss_wh_dest_same_city(self):
        """
        Gets the iss_wh_dest_same_city of this IssConfByCity.

        :return: The iss_wh_dest_same_city of this IssConfByCity.
        :rtype: bool
        """
        return self._iss_wh_dest_same_city

    @iss_wh_dest_same_city.setter
    def iss_wh_dest_same_city(self, iss_wh_dest_same_city):
        """
        Sets the iss_wh_dest_same_city of this IssConfByCity.

        :param iss_wh_dest_same_city: The iss_wh_dest_same_city of this IssConfByCity.
        :type: bool
        """

        self._iss_wh_dest_same_city = iss_wh_dest_same_city

    @property
    def iss_wh_origin_unreg_seller(self):
        """
        Gets the iss_wh_origin_unreg_seller of this IssConfByCity.

        :return: The iss_wh_origin_unreg_seller of this IssConfByCity.
        :rtype: bool
        """
        return self._iss_wh_origin_unreg_seller

    @iss_wh_origin_unreg_seller.setter
    def iss_wh_origin_unreg_seller(self, iss_wh_origin_unreg_seller):
        """
        Sets the iss_wh_origin_unreg_seller of this IssConfByCity.

        :param iss_wh_origin_unreg_seller: The iss_wh_origin_unreg_seller of this IssConfByCity.
        :type: bool
        """

        self._iss_wh_origin_unreg_seller = iss_wh_origin_unreg_seller

    @property
    def service_list(self):
        """
        Gets the service_list of this IssConfByCity.

        :return: The service_list of this IssConfByCity.
        :rtype: list[IssConfServiceList]
        """
        return self._service_list

    @service_list.setter
    def service_list(self, service_list):
        """
        Sets the service_list of this IssConfByCity.

        :param service_list: The service_list of this IssConfByCity.
        :type: list[IssConfServiceList]
        """

        self._service_list = service_list

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