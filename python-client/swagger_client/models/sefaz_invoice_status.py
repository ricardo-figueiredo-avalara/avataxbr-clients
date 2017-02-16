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


class SefazInvoiceStatus(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, code=None, desc=None, protocol=None, rec=None, date=None, environment=None, app_version=None):
        """
        SefazInvoiceStatus - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'code': 'str',
            'desc': 'str',
            'protocol': 'str',
            'rec': 'str',
            'date': 'datetime',
            'environment': 'str',
            'app_version': 'str'
        }

        self.attribute_map = {
            'code': 'code',
            'desc': 'desc',
            'protocol': 'protocol',
            'rec': 'rec',
            'date': 'date',
            'environment': 'environment',
            'app_version': 'appVersion'
        }

        self._code = code
        self._desc = desc
        self._protocol = protocol
        self._rec = rec
        self._date = date
        self._environment = environment
        self._app_version = app_version

    @property
    def code(self):
        """
        Gets the code of this SefazInvoiceStatus.

        :return: The code of this SefazInvoiceStatus.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this SefazInvoiceStatus.

        :param code: The code of this SefazInvoiceStatus.
        :type: str
        """
        if code is not None and not re.search('\\d{3}', code):
            raise ValueError("Invalid value for `code`, must be a follow pattern or equal to `/\\d{3}/`")

        self._code = code

    @property
    def desc(self):
        """
        Gets the desc of this SefazInvoiceStatus.

        :return: The desc of this SefazInvoiceStatus.
        :rtype: str
        """
        return self._desc

    @desc.setter
    def desc(self, desc):
        """
        Sets the desc of this SefazInvoiceStatus.

        :param desc: The desc of this SefazInvoiceStatus.
        :type: str
        """

        self._desc = desc

    @property
    def protocol(self):
        """
        Gets the protocol of this SefazInvoiceStatus.

        :return: The protocol of this SefazInvoiceStatus.
        :rtype: str
        """
        return self._protocol

    @protocol.setter
    def protocol(self, protocol):
        """
        Sets the protocol of this SefazInvoiceStatus.

        :param protocol: The protocol of this SefazInvoiceStatus.
        :type: str
        """

        self._protocol = protocol

    @property
    def rec(self):
        """
        Gets the rec of this SefazInvoiceStatus.

        :return: The rec of this SefazInvoiceStatus.
        :rtype: str
        """
        return self._rec

    @rec.setter
    def rec(self, rec):
        """
        Sets the rec of this SefazInvoiceStatus.

        :param rec: The rec of this SefazInvoiceStatus.
        :type: str
        """

        self._rec = rec

    @property
    def date(self):
        """
        Gets the date of this SefazInvoiceStatus.

        :return: The date of this SefazInvoiceStatus.
        :rtype: datetime
        """
        return self._date

    @date.setter
    def date(self, date):
        """
        Sets the date of this SefazInvoiceStatus.

        :param date: The date of this SefazInvoiceStatus.
        :type: datetime
        """

        self._date = date

    @property
    def environment(self):
        """
        Gets the environment of this SefazInvoiceStatus.
        - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 

        :return: The environment of this SefazInvoiceStatus.
        :rtype: str
        """
        return self._environment

    @environment.setter
    def environment(self, environment):
        """
        Sets the environment of this SefazInvoiceStatus.
        - '1' # Ambiente de Produção - '2' # Ambiente de Homologação 

        :param environment: The environment of this SefazInvoiceStatus.
        :type: str
        """
        allowed_values = ["1", "2"]
        if environment not in allowed_values:
            raise ValueError(
                "Invalid value for `environment` ({0}), must be one of {1}"
                .format(environment, allowed_values)
            )

        self._environment = environment

    @property
    def app_version(self):
        """
        Gets the app_version of this SefazInvoiceStatus.

        :return: The app_version of this SefazInvoiceStatus.
        :rtype: str
        """
        return self._app_version

    @app_version.setter
    def app_version(self, app_version):
        """
        Sets the app_version of this SefazInvoiceStatus.

        :param app_version: The app_version of this SefazInvoiceStatus.
        :type: str
        """

        self._app_version = app_version

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
