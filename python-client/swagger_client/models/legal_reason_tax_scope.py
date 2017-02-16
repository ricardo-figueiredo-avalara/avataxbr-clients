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


class LegalReasonTaxScope(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, tax_type=None, specialized_tax_type=None, jurisdiction_type=None, jurisdiction_ibge_code=None):
        """
        LegalReasonTaxScope - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'tax_type': 'str',
            'specialized_tax_type': 'str',
            'jurisdiction_type': 'str',
            'jurisdiction_ibge_code': 'str'
        }

        self.attribute_map = {
            'tax_type': 'taxType',
            'specialized_tax_type': 'specializedTaxType',
            'jurisdiction_type': 'jurisdictionType',
            'jurisdiction_ibge_code': 'jurisdictionIbgeCode'
        }

        self._tax_type = tax_type
        self._specialized_tax_type = specialized_tax_type
        self._jurisdiction_type = jurisdiction_type
        self._jurisdiction_ibge_code = jurisdiction_ibge_code

    @property
    def tax_type(self):
        """
        Gets the tax_type of this LegalReasonTaxScope.
        This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 

        :return: The tax_type of this LegalReasonTaxScope.
        :rtype: str
        """
        return self._tax_type

    @tax_type.setter
    def tax_type(self, tax_type):
        """
        Sets the tax_type of this LegalReasonTaxScope.
        This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 

        :param tax_type: The tax_type of this LegalReasonTaxScope.
        :type: str
        """
        allowed_values = ["NONE", "INSS", "IRRF", "IRPJ", "PIS", "COFINS", "CSLL", "IPI", "ICMS", "II", "IOF", "ISS", "APROXTOTALTAX"]
        if tax_type not in allowed_values:
            raise ValueError(
                "Invalid value for `tax_type` ({0}), must be one of {1}"
                .format(tax_type, allowed_values)
            )

        self._tax_type = tax_type

    @property
    def specialized_tax_type(self):
        """
        Gets the specialized_tax_type of this LegalReasonTaxScope.
        These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 

        :return: The specialized_tax_type of this LegalReasonTaxScope.
        :rtype: str
        """
        return self._specialized_tax_type

    @specialized_tax_type.setter
    def specialized_tax_type(self, specialized_tax_type):
        """
        Sets the specialized_tax_type of this LegalReasonTaxScope.
        These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 

        :param specialized_tax_type: The specialized_tax_type of this LegalReasonTaxScope.
        :type: str
        """
        allowed_values = ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof"]
        if specialized_tax_type not in allowed_values:
            raise ValueError(
                "Invalid value for `specialized_tax_type` ({0}), must be one of {1}"
                .format(specialized_tax_type, allowed_values)
            )

        self._specialized_tax_type = specialized_tax_type

    @property
    def jurisdiction_type(self):
        """
        Gets the jurisdiction_type of this LegalReasonTaxScope.
        Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 

        :return: The jurisdiction_type of this LegalReasonTaxScope.
        :rtype: str
        """
        return self._jurisdiction_type

    @jurisdiction_type.setter
    def jurisdiction_type(self, jurisdiction_type):
        """
        Sets the jurisdiction_type of this LegalReasonTaxScope.
        Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 

        :param jurisdiction_type: The jurisdiction_type of this LegalReasonTaxScope.
        :type: str
        """
        allowed_values = ["NONE", "City", "State", "Country"]
        if jurisdiction_type not in allowed_values:
            raise ValueError(
                "Invalid value for `jurisdiction_type` ({0}), must be one of {1}"
                .format(jurisdiction_type, allowed_values)
            )

        self._jurisdiction_type = jurisdiction_type

    @property
    def jurisdiction_ibge_code(self):
        """
        Gets the jurisdiction_ibge_code of this LegalReasonTaxScope.
        Code to identify the Jurisdiction

        :return: The jurisdiction_ibge_code of this LegalReasonTaxScope.
        :rtype: str
        """
        return self._jurisdiction_ibge_code

    @jurisdiction_ibge_code.setter
    def jurisdiction_ibge_code(self, jurisdiction_ibge_code):
        """
        Sets the jurisdiction_ibge_code of this LegalReasonTaxScope.
        Code to identify the Jurisdiction

        :param jurisdiction_ibge_code: The jurisdiction_ibge_code of this LegalReasonTaxScope.
        :type: str
        """

        self._jurisdiction_ibge_code = jurisdiction_ibge_code

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