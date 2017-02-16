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


class CompanyMailServer(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, user=None, password=None, smtp_address=None, port=None, email_from=None, protocol=None, templatemessage_to_email=None):
        """
        CompanyMailServer - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'user': 'str',
            'password': 'str',
            'smtp_address': 'str',
            'port': 'int',
            'email_from': 'str',
            'protocol': 'str',
            'templatemessage_to_email': 'str'
        }

        self.attribute_map = {
            'user': 'user',
            'password': 'password',
            'smtp_address': 'smtpAddress',
            'port': 'port',
            'email_from': 'emailFrom',
            'protocol': 'protocol',
            'templatemessage_to_email': 'templatemessageToEmail'
        }

        self._user = user
        self._password = password
        self._smtp_address = smtp_address
        self._port = port
        self._email_from = email_from
        self._protocol = protocol
        self._templatemessage_to_email = templatemessage_to_email

    @property
    def user(self):
        """
        Gets the user of this CompanyMailServer.
        User for login on email server

        :return: The user of this CompanyMailServer.
        :rtype: str
        """
        return self._user

    @user.setter
    def user(self, user):
        """
        Sets the user of this CompanyMailServer.
        User for login on email server

        :param user: The user of this CompanyMailServer.
        :type: str
        """

        self._user = user

    @property
    def password(self):
        """
        Gets the password of this CompanyMailServer.
        Password to login on email server

        :return: The password of this CompanyMailServer.
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password):
        """
        Sets the password of this CompanyMailServer.
        Password to login on email server

        :param password: The password of this CompanyMailServer.
        :type: str
        """

        self._password = password

    @property
    def smtp_address(self):
        """
        Gets the smtp_address of this CompanyMailServer.
        smtp address to email server

        :return: The smtp_address of this CompanyMailServer.
        :rtype: str
        """
        return self._smtp_address

    @smtp_address.setter
    def smtp_address(self, smtp_address):
        """
        Sets the smtp_address of this CompanyMailServer.
        smtp address to email server

        :param smtp_address: The smtp_address of this CompanyMailServer.
        :type: str
        """

        self._smtp_address = smtp_address

    @property
    def port(self):
        """
        Gets the port of this CompanyMailServer.
        port

        :return: The port of this CompanyMailServer.
        :rtype: int
        """
        return self._port

    @port.setter
    def port(self, port):
        """
        Sets the port of this CompanyMailServer.
        port

        :param port: The port of this CompanyMailServer.
        :type: int
        """

        self._port = port

    @property
    def email_from(self):
        """
        Gets the email_from of this CompanyMailServer.
        email address to identify the sender e-mail, to send a XML and DANFE

        :return: The email_from of this CompanyMailServer.
        :rtype: str
        """
        return self._email_from

    @email_from.setter
    def email_from(self, email_from):
        """
        Sets the email_from of this CompanyMailServer.
        email address to identify the sender e-mail, to send a XML and DANFE

        :param email_from: The email_from of this CompanyMailServer.
        :type: str
        """

        self._email_from = email_from

    @property
    def protocol(self):
        """
        Gets the protocol of this CompanyMailServer.
        protocol SSL or TLS

        :return: The protocol of this CompanyMailServer.
        :rtype: str
        """
        return self._protocol

    @protocol.setter
    def protocol(self, protocol):
        """
        Sets the protocol of this CompanyMailServer.
        protocol SSL or TLS

        :param protocol: The protocol of this CompanyMailServer.
        :type: str
        """
        allowed_values = ["ssl", "tls"]
        if protocol not in allowed_values:
            raise ValueError(
                "Invalid value for `protocol` ({0}), must be one of {1}"
                .format(protocol, allowed_values)
            )

        self._protocol = protocol

    @property
    def templatemessage_to_email(self):
        """
        Gets the templatemessage_to_email of this CompanyMailServer.
        Message to add to email body

        :return: The templatemessage_to_email of this CompanyMailServer.
        :rtype: str
        """
        return self._templatemessage_to_email

    @templatemessage_to_email.setter
    def templatemessage_to_email(self, templatemessage_to_email):
        """
        Sets the templatemessage_to_email of this CompanyMailServer.
        Message to add to email body

        :param templatemessage_to_email: The templatemessage_to_email of this CompanyMailServer.
        :type: str
        """

        self._templatemessage_to_email = templatemessage_to_email

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
