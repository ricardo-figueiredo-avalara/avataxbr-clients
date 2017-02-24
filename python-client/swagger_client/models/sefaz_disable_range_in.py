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


class SefazDisableRangeIn(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, company_location=None, transaction_model=None, invoice_serial=None, year=None, message=None, invoice_number_init=None, invoice_number_end=None):
        """
        SefazDisableRangeIn - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'company_location': 'str',
            'transaction_model': 'str',
            'invoice_serial': 'int',
            'year': 'float',
            'message': 'str',
            'invoice_number_init': 'float',
            'invoice_number_end': 'float'
        }

        self.attribute_map = {
            'company_location': 'companyLocation',
            'transaction_model': 'transactionModel',
            'invoice_serial': 'invoiceSerial',
            'year': 'year',
            'message': 'message',
            'invoice_number_init': 'invoiceNumberInit',
            'invoice_number_end': 'invoiceNumberEnd'
        }

        self._company_location = company_location
        self._transaction_model = transaction_model
        self._invoice_serial = invoice_serial
        self._year = year
        self._message = message
        self._invoice_number_init = invoice_number_init
        self._invoice_number_end = invoice_number_end

    @property
    def company_location(self):
        """
        Gets the company_location of this SefazDisableRangeIn.
        This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity

        :return: The company_location of this SefazDisableRangeIn.
        :rtype: str
        """
        return self._company_location

    @company_location.setter
    def company_location(self, company_location):
        """
        Sets the company_location of this SefazDisableRangeIn.
        This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity

        :param company_location: The company_location of this SefazDisableRangeIn.
        :type: str
        """

        self._company_location = company_location

    @property
    def transaction_model(self):
        """
        Gets the transaction_model of this SefazDisableRangeIn.
        This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 

        :return: The transaction_model of this SefazDisableRangeIn.
        :rtype: str
        """
        return self._transaction_model

    @transaction_model.setter
    def transaction_model(self, transaction_model):
        """
        Sets the transaction_model of this SefazDisableRangeIn.
        This string indicates the type of transaction for which tax should be calculated. - '55' # Nota Fiscal Eletrônica (NF-e) - '65' # Nota Fiscal Eletrônica ao-Consumidor Final (NFC-e) 

        :param transaction_model: The transaction_model of this SefazDisableRangeIn.
        :type: str
        """
        allowed_values = ["55", "65"]
        if transaction_model not in allowed_values:
            raise ValueError(
                "Invalid value for `transaction_model` ({0}), must be one of {1}"
                .format(transaction_model, allowed_values)
            )

        self._transaction_model = transaction_model

    @property
    def invoice_serial(self):
        """
        Gets the invoice_serial of this SefazDisableRangeIn.
        Invoice number, sequential unique by invoice serial (Número da nota fiscal) 

        :return: The invoice_serial of this SefazDisableRangeIn.
        :rtype: int
        """
        return self._invoice_serial

    @invoice_serial.setter
    def invoice_serial(self, invoice_serial):
        """
        Sets the invoice_serial of this SefazDisableRangeIn.
        Invoice number, sequential unique by invoice serial (Número da nota fiscal) 

        :param invoice_serial: The invoice_serial of this SefazDisableRangeIn.
        :type: int
        """

        self._invoice_serial = invoice_serial

    @property
    def year(self):
        """
        Gets the year of this SefazDisableRangeIn.

        :return: The year of this SefazDisableRangeIn.
        :rtype: float
        """
        return self._year

    @year.setter
    def year(self, year):
        """
        Sets the year of this SefazDisableRangeIn.

        :param year: The year of this SefazDisableRangeIn.
        :type: float
        """

        self._year = year

    @property
    def message(self):
        """
        Gets the message of this SefazDisableRangeIn.

        :return: The message of this SefazDisableRangeIn.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this SefazDisableRangeIn.

        :param message: The message of this SefazDisableRangeIn.
        :type: str
        """
        if message is not None and len(message) > 255:
            raise ValueError("Invalid value for `message`, length must be less than or equal to `255`")
        if message is not None and len(message) < 15:
            raise ValueError("Invalid value for `message`, length must be greater than or equal to `15`")

        self._message = message

    @property
    def invoice_number_init(self):
        """
        Gets the invoice_number_init of this SefazDisableRangeIn.
        First number of disable range.

        :return: The invoice_number_init of this SefazDisableRangeIn.
        :rtype: float
        """
        return self._invoice_number_init

    @invoice_number_init.setter
    def invoice_number_init(self, invoice_number_init):
        """
        Sets the invoice_number_init of this SefazDisableRangeIn.
        First number of disable range.

        :param invoice_number_init: The invoice_number_init of this SefazDisableRangeIn.
        :type: float
        """

        self._invoice_number_init = invoice_number_init

    @property
    def invoice_number_end(self):
        """
        Gets the invoice_number_end of this SefazDisableRangeIn.
        Last number of disable range.

        :return: The invoice_number_end of this SefazDisableRangeIn.
        :rtype: float
        """
        return self._invoice_number_end

    @invoice_number_end.setter
    def invoice_number_end(self, invoice_number_end):
        """
        Sets the invoice_number_end of this SefazDisableRangeIn.
        Last number of disable range.

        :param invoice_number_end: The invoice_number_end of this SefazDisableRangeIn.
        :type: float
        """

        self._invoice_number_end = invoice_number_end

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
