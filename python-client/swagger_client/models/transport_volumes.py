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


class TransportVolumes(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, q_vol=None, specie=None, brand=None, volume_numeration=None, net_weight=None, gross_weight=None, seal=None):
        """
        TransportVolumes - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'q_vol': 'str',
            'specie': 'str',
            'brand': 'str',
            'volume_numeration': 'str',
            'net_weight': 'float',
            'gross_weight': 'float',
            'seal': 'list[str]'
        }

        self.attribute_map = {
            'q_vol': 'qVol',
            'specie': 'specie',
            'brand': 'brand',
            'volume_numeration': 'volumeNumeration',
            'net_weight': 'netWeight',
            'gross_weight': 'grossWeight',
            'seal': 'seal'
        }

        self._q_vol = q_vol
        self._specie = specie
        self._brand = brand
        self._volume_numeration = volume_numeration
        self._net_weight = net_weight
        self._gross_weight = gross_weight
        self._seal = seal

    @property
    def q_vol(self):
        """
        Gets the q_vol of this TransportVolumes.
        Quantity of packages transported

        :return: The q_vol of this TransportVolumes.
        :rtype: str
        """
        return self._q_vol

    @q_vol.setter
    def q_vol(self, q_vol):
        """
        Sets the q_vol of this TransportVolumes.
        Quantity of packages transported

        :param q_vol: The q_vol of this TransportVolumes.
        :type: str
        """
        if q_vol is not None and not re.search('[0-9]{1,15}', q_vol):
            raise ValueError("Invalid value for `q_vol`, must be a follow pattern or equal to `/[0-9]{1,15}/`")

        self._q_vol = q_vol

    @property
    def specie(self):
        """
        Gets the specie of this TransportVolumes.
        package type

        :return: The specie of this TransportVolumes.
        :rtype: str
        """
        return self._specie

    @specie.setter
    def specie(self, specie):
        """
        Sets the specie of this TransportVolumes.
        package type

        :param specie: The specie of this TransportVolumes.
        :type: str
        """
        if specie is not None and len(specie) > 60:
            raise ValueError("Invalid value for `specie`, length must be less than or equal to `60`")
        if specie is not None and len(specie) < 1:
            raise ValueError("Invalid value for `specie`, length must be greater than or equal to `1`")

        self._specie = specie

    @property
    def brand(self):
        """
        Gets the brand of this TransportVolumes.
        brand

        :return: The brand of this TransportVolumes.
        :rtype: str
        """
        return self._brand

    @brand.setter
    def brand(self, brand):
        """
        Sets the brand of this TransportVolumes.
        brand

        :param brand: The brand of this TransportVolumes.
        :type: str
        """
        if brand is not None and len(brand) > 60:
            raise ValueError("Invalid value for `brand`, length must be less than or equal to `60`")
        if brand is not None and len(brand) < 1:
            raise ValueError("Invalid value for `brand`, length must be greater than or equal to `1`")

        self._brand = brand

    @property
    def volume_numeration(self):
        """
        Gets the volume_numeration of this TransportVolumes.
        packages numeration

        :return: The volume_numeration of this TransportVolumes.
        :rtype: str
        """
        return self._volume_numeration

    @volume_numeration.setter
    def volume_numeration(self, volume_numeration):
        """
        Sets the volume_numeration of this TransportVolumes.
        packages numeration

        :param volume_numeration: The volume_numeration of this TransportVolumes.
        :type: str
        """
        if volume_numeration is not None and len(volume_numeration) > 60:
            raise ValueError("Invalid value for `volume_numeration`, length must be less than or equal to `60`")
        if volume_numeration is not None and len(volume_numeration) < 1:
            raise ValueError("Invalid value for `volume_numeration`, length must be greater than or equal to `1`")

        self._volume_numeration = volume_numeration

    @property
    def net_weight(self):
        """
        Gets the net_weight of this TransportVolumes.
        net weight using Kg

        :return: The net_weight of this TransportVolumes.
        :rtype: float
        """
        return self._net_weight

    @net_weight.setter
    def net_weight(self, net_weight):
        """
        Sets the net_weight of this TransportVolumes.
        net weight using Kg

        :param net_weight: The net_weight of this TransportVolumes.
        :type: float
        """

        self._net_weight = net_weight

    @property
    def gross_weight(self):
        """
        Gets the gross_weight of this TransportVolumes.
        gross weight using Kg

        :return: The gross_weight of this TransportVolumes.
        :rtype: float
        """
        return self._gross_weight

    @gross_weight.setter
    def gross_weight(self, gross_weight):
        """
        Sets the gross_weight of this TransportVolumes.
        gross weight using Kg

        :param gross_weight: The gross_weight of this TransportVolumes.
        :type: float
        """

        self._gross_weight = gross_weight

    @property
    def seal(self):
        """
        Gets the seal of this TransportVolumes.

        :return: The seal of this TransportVolumes.
        :rtype: list[str]
        """
        return self._seal

    @seal.setter
    def seal(self, seal):
        """
        Sets the seal of this TransportVolumes.

        :param seal: The seal of this TransportVolumes.
        :type: list[str]
        """

        self._seal = seal

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
