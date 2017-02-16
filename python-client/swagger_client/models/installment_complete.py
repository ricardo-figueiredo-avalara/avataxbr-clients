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


class InstallmentComplete(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, document_number=None, date=None, gross_value=None, net_value=None, withholding_mode=None, withholding_pis=None, withholding_cofins=None, withholding_csll=None):
        """
        InstallmentComplete - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'document_number': 'str',
            'date': 'datetime',
            'gross_value': 'float',
            'net_value': 'float',
            'withholding_mode': 'WithholdingMode',
            'withholding_pis': 'float',
            'withholding_cofins': 'float',
            'withholding_csll': 'float'
        }

        self.attribute_map = {
            'document_number': 'documentNumber',
            'date': 'date',
            'gross_value': 'grossValue',
            'net_value': 'netValue',
            'withholding_mode': 'withholdingMode',
            'withholding_pis': 'withholdingPIS',
            'withholding_cofins': 'withholdingCOFINS',
            'withholding_csll': 'withholdingCSLL'
        }

        self._document_number = document_number
        self._date = date
        self._gross_value = gross_value
        self._net_value = net_value
        self._withholding_mode = withholding_mode
        self._withholding_pis = withholding_pis
        self._withholding_cofins = withholding_cofins
        self._withholding_csll = withholding_csll

    @property
    def document_number(self):
        """
        Gets the document_number of this InstallmentComplete.
        DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction

        :return: The document_number of this InstallmentComplete.
        :rtype: str
        """
        return self._document_number

    @document_number.setter
    def document_number(self, document_number):
        """
        Sets the document_number of this InstallmentComplete.
        DOCNUMBER, ID OF THIS DOCUMENT FOR THIS transaction

        :param document_number: The document_number of this InstallmentComplete.
        :type: str
        """
        if document_number is None:
            raise ValueError("Invalid value for `document_number`, must not be `None`")

        self._document_number = document_number

    @property
    def date(self):
        """
        Gets the date of this InstallmentComplete.
        installment Due Date

        :return: The date of this InstallmentComplete.
        :rtype: datetime
        """
        return self._date

    @date.setter
    def date(self, date):
        """
        Sets the date of this InstallmentComplete.
        installment Due Date

        :param date: The date of this InstallmentComplete.
        :type: datetime
        """
        if date is None:
            raise ValueError("Invalid value for `date`, must not be `None`")

        self._date = date

    @property
    def gross_value(self):
        """
        Gets the gross_value of this InstallmentComplete.
        Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)

        :return: The gross_value of this InstallmentComplete.
        :rtype: float
        """
        return self._gross_value

    @gross_value.setter
    def gross_value(self, gross_value):
        """
        Sets the gross_value of this InstallmentComplete.
        Intallment amount, fraction of  ∑(lineAmount - lineTaxedDiscount)

        :param gross_value: The gross_value of this InstallmentComplete.
        :type: float
        """
        if gross_value is None:
            raise ValueError("Invalid value for `gross_value`, must not be `None`")

        self._gross_value = gross_value

    @property
    def net_value(self):
        """
        Gets the net_value of this InstallmentComplete.
        net amount due for this installment, grossValue - ∑ (withhold amounts)

        :return: The net_value of this InstallmentComplete.
        :rtype: float
        """
        return self._net_value

    @net_value.setter
    def net_value(self, net_value):
        """
        Sets the net_value of this InstallmentComplete.
        net amount due for this installment, grossValue - ∑ (withhold amounts)

        :param net_value: The net_value of this InstallmentComplete.
        :type: float
        """

        self._net_value = net_value

    @property
    def withholding_mode(self):
        """
        Gets the withholding_mode of this InstallmentComplete.
        Inform if this payment is subject to Pis, Cofins or CSLL

        :return: The withholding_mode of this InstallmentComplete.
        :rtype: WithholdingMode
        """
        return self._withholding_mode

    @withholding_mode.setter
    def withholding_mode(self, withholding_mode):
        """
        Sets the withholding_mode of this InstallmentComplete.
        Inform if this payment is subject to Pis, Cofins or CSLL

        :param withholding_mode: The withholding_mode of this InstallmentComplete.
        :type: WithholdingMode
        """

        self._withholding_mode = withholding_mode

    @property
    def withholding_pis(self):
        """
        Gets the withholding_pis of this InstallmentComplete.
        calculated PIS-RF tax for this payment

        :return: The withholding_pis of this InstallmentComplete.
        :rtype: float
        """
        return self._withholding_pis

    @withholding_pis.setter
    def withholding_pis(self, withholding_pis):
        """
        Sets the withholding_pis of this InstallmentComplete.
        calculated PIS-RF tax for this payment

        :param withholding_pis: The withholding_pis of this InstallmentComplete.
        :type: float
        """

        self._withholding_pis = withholding_pis

    @property
    def withholding_cofins(self):
        """
        Gets the withholding_cofins of this InstallmentComplete.
        calculated COFINS-RF tax for this payment

        :return: The withholding_cofins of this InstallmentComplete.
        :rtype: float
        """
        return self._withholding_cofins

    @withholding_cofins.setter
    def withholding_cofins(self, withholding_cofins):
        """
        Sets the withholding_cofins of this InstallmentComplete.
        calculated COFINS-RF tax for this payment

        :param withholding_cofins: The withholding_cofins of this InstallmentComplete.
        :type: float
        """

        self._withholding_cofins = withholding_cofins

    @property
    def withholding_csll(self):
        """
        Gets the withholding_csll of this InstallmentComplete.
        calculated CSLL-RF tax for this payment

        :return: The withholding_csll of this InstallmentComplete.
        :rtype: float
        """
        return self._withholding_csll

    @withholding_csll.setter
    def withholding_csll(self, withholding_csll):
        """
        Sets the withholding_csll of this InstallmentComplete.
        calculated CSLL-RF tax for this payment

        :param withholding_csll: The withholding_csll of this InstallmentComplete.
        :type: float
        """

        self._withholding_csll = withholding_csll

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
