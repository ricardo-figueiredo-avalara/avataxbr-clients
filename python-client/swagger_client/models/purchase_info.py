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


class PurchaseInfo(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, government_order=None, order_number=None, contract_number=None):
        """
        PurchaseInfo - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'government_order': 'str',
            'order_number': 'str',
            'contract_number': 'str'
        }

        self.attribute_map = {
            'government_order': 'governmentOrder',
            'order_number': 'orderNumber',
            'contract_number': 'contractNumber'
        }

        self._government_order = government_order
        self._order_number = order_number
        self._contract_number = contract_number

    @property
    def government_order(self):
        """
        Gets the government_order of this PurchaseInfo.
        Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas 

        :return: The government_order of this PurchaseInfo.
        :rtype: str
        """
        return self._government_order

    @government_order.setter
    def government_order(self, government_order):
        """
        Sets the government_order of this PurchaseInfo.
        Invoice info for government purchase orders Informação da Nota de Empenho de compras públicas 

        :param government_order: The government_order of this PurchaseInfo.
        :type: str
        """
        if government_order is not None and len(government_order) > 22:
            raise ValueError("Invalid value for `government_order`, length must be less than or equal to `22`")
        if government_order is not None and len(government_order) < 1:
            raise ValueError("Invalid value for `government_order`, length must be greater than or equal to `1`")

        self._government_order = government_order

    @property
    def order_number(self):
        """
        Gets the order_number of this PurchaseInfo.
        Order info Informação do pedido 

        :return: The order_number of this PurchaseInfo.
        :rtype: str
        """
        return self._order_number

    @order_number.setter
    def order_number(self, order_number):
        """
        Sets the order_number of this PurchaseInfo.
        Order info Informação do pedido 

        :param order_number: The order_number of this PurchaseInfo.
        :type: str
        """
        if order_number is not None and len(order_number) > 60:
            raise ValueError("Invalid value for `order_number`, length must be less than or equal to `60`")
        if order_number is not None and len(order_number) < 1:
            raise ValueError("Invalid value for `order_number`, length must be greater than or equal to `1`")

        self._order_number = order_number

    @property
    def contract_number(self):
        """
        Gets the contract_number of this PurchaseInfo.
        Agreement info Informação do contrato 

        :return: The contract_number of this PurchaseInfo.
        :rtype: str
        """
        return self._contract_number

    @contract_number.setter
    def contract_number(self, contract_number):
        """
        Sets the contract_number of this PurchaseInfo.
        Agreement info Informação do contrato 

        :param contract_number: The contract_number of this PurchaseInfo.
        :type: str
        """
        if contract_number is not None and len(contract_number) > 60:
            raise ValueError("Invalid value for `contract_number`, length must be less than or equal to `60`")
        if contract_number is not None and len(contract_number) < 1:
            raise ValueError("Invalid value for `contract_number`, length must be greater than or equal to `1`")

        self._contract_number = contract_number

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
