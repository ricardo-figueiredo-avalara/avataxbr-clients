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


class IcmsTaxConf(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, state=None, icms_cst=None, message_code=None, relation_ship=None):
        """
        IcmsTaxConf - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'state': 'StateEnum',
            'icms_cst': 'str',
            'message_code': 'str',
            'relation_ship': 'list[IcmsTaxConfBase]'
        }

        self.attribute_map = {
            'state': 'state',
            'icms_cst': 'icmsCST',
            'message_code': 'messageCode',
            'relation_ship': 'relationShip'
        }

        self._state = state
        self._icms_cst = icms_cst
        self._message_code = message_code
        self._relation_ship = relation_ship

    @property
    def state(self):
        """
        Gets the state of this IcmsTaxConf.

        :return: The state of this IcmsTaxConf.
        :rtype: StateEnum
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this IcmsTaxConf.

        :param state: The state of this IcmsTaxConf.
        :type: StateEnum
        """
        if state is None:
            raise ValueError("Invalid value for `state`, must not be `None`")

        self._state = state

    @property
    def icms_cst(self):
        """
        Gets the icms_cst of this IcmsTaxConf.
        On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 

        :return: The icms_cst of this IcmsTaxConf.
        :rtype: str
        """
        return self._icms_cst

    @icms_cst.setter
    def icms_cst(self, icms_cst):
        """
        Sets the icms_cst of this IcmsTaxConf.
        On sales process inform the CST hat the item linked to this configuration is subject to - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 

        :param icms_cst: The icms_cst of this IcmsTaxConf.
        :type: str
        """
        allowed_values = ["00", "20", "40", "41", "50"]
        if icms_cst not in allowed_values:
            raise ValueError(
                "Invalid value for `icms_cst` ({0}), must be one of {1}"
                .format(icms_cst, allowed_values)
            )

        self._icms_cst = icms_cst

    @property
    def message_code(self):
        """
        Gets the message_code of this IcmsTaxConf.
        Message to add to NF when this configuration is used

        :return: The message_code of this IcmsTaxConf.
        :rtype: str
        """
        return self._message_code

    @message_code.setter
    def message_code(self, message_code):
        """
        Sets the message_code of this IcmsTaxConf.
        Message to add to NF when this configuration is used

        :param message_code: The message_code of this IcmsTaxConf.
        :type: str
        """
        if message_code is not None and len(message_code) > 60:
            raise ValueError("Invalid value for `message_code`, length must be less than or equal to `60`")

        self._message_code = message_code

    @property
    def relation_ship(self):
        """
        Gets the relation_ship of this IcmsTaxConf.
        the mapping key is state code / A chave do mapeamento é o código do Estado.

        :return: The relation_ship of this IcmsTaxConf.
        :rtype: list[IcmsTaxConfBase]
        """
        return self._relation_ship

    @relation_ship.setter
    def relation_ship(self, relation_ship):
        """
        Sets the relation_ship of this IcmsTaxConf.
        the mapping key is state code / A chave do mapeamento é o código do Estado.

        :param relation_ship: The relation_ship of this IcmsTaxConf.
        :type: list[IcmsTaxConfBase]
        """

        self._relation_ship = relation_ship

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
