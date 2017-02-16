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


class LineForGoodsIcmsTaxRelief(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, icms_tax_relief_reason_code=None, icms_relief_tax_rate=None, icms_relief_tax_amount=None):
        """
        LineForGoodsIcmsTaxRelief - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'icms_tax_relief_reason_code': 'int',
            'icms_relief_tax_rate': 'float',
            'icms_relief_tax_amount': 'float'
        }

        self.attribute_map = {
            'icms_tax_relief_reason_code': 'icmsTaxReliefReasonCode',
            'icms_relief_tax_rate': 'icmsReliefTaxRate',
            'icms_relief_tax_amount': 'icmsReliefTaxAmount'
        }

        self._icms_tax_relief_reason_code = icms_tax_relief_reason_code
        self._icms_relief_tax_rate = icms_relief_tax_rate
        self._icms_relief_tax_amount = icms_relief_tax_amount

    @property
    def icms_tax_relief_reason_code(self):
        """
        Gets the icms_tax_relief_reason_code of this LineForGoodsIcmsTaxRelief.
        When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 

        :return: The icms_tax_relief_reason_code of this LineForGoodsIcmsTaxRelief.
        :rtype: int
        """
        return self._icms_tax_relief_reason_code

    @icms_tax_relief_reason_code.setter
    def icms_tax_relief_reason_code(self, icms_tax_relief_reason_code):
        """
        Sets the icms_tax_relief_reason_code of this LineForGoodsIcmsTaxRelief.
        When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016 

        :param icms_tax_relief_reason_code: The icms_tax_relief_reason_code of this LineForGoodsIcmsTaxRelief.
        :type: int
        """
        if icms_tax_relief_reason_code is None:
            raise ValueError("Invalid value for `icms_tax_relief_reason_code`, must not be `None`")

        self._icms_tax_relief_reason_code = icms_tax_relief_reason_code

    @property
    def icms_relief_tax_rate(self):
        """
        Gets the icms_relief_tax_rate of this LineForGoodsIcmsTaxRelief.
        ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)

        :return: The icms_relief_tax_rate of this LineForGoodsIcmsTaxRelief.
        :rtype: float
        """
        return self._icms_relief_tax_rate

    @icms_relief_tax_rate.setter
    def icms_relief_tax_rate(self, icms_relief_tax_rate):
        """
        Sets the icms_relief_tax_rate of this LineForGoodsIcmsTaxRelief.
        ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)

        :param icms_relief_tax_rate: The icms_relief_tax_rate of this LineForGoodsIcmsTaxRelief.
        :type: float
        """

        self._icms_relief_tax_rate = icms_relief_tax_rate

    @property
    def icms_relief_tax_amount(self):
        """
        Gets the icms_relief_tax_amount of this LineForGoodsIcmsTaxRelief.
        Amount for Icms Relief (desoneração)

        :return: The icms_relief_tax_amount of this LineForGoodsIcmsTaxRelief.
        :rtype: float
        """
        return self._icms_relief_tax_amount

    @icms_relief_tax_amount.setter
    def icms_relief_tax_amount(self, icms_relief_tax_amount):
        """
        Sets the icms_relief_tax_amount of this LineForGoodsIcmsTaxRelief.
        Amount for Icms Relief (desoneração)

        :param icms_relief_tax_amount: The icms_relief_tax_amount of this LineForGoodsIcmsTaxRelief.
        :type: float
        """

        self._icms_relief_tax_amount = icms_relief_tax_amount

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