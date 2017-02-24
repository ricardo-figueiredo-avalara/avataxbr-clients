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


class AgastWithholdingPIS(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, legal_reason=None, business=None, business_legal_reason=None, federal_government=None, federal_government_legal_reason=None, state_government=None, state_government_legal_reason=None, city_government=None, city_government_legal_reason=None):
        """
        AgastWithholdingPIS - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'legal_reason': 'str',
            'business': 'bool',
            'business_legal_reason': 'str',
            'federal_government': 'bool',
            'federal_government_legal_reason': 'str',
            'state_government': 'bool',
            'state_government_legal_reason': 'str',
            'city_government': 'bool',
            'city_government_legal_reason': 'str'
        }

        self.attribute_map = {
            'legal_reason': 'legalReason',
            'business': 'business',
            'business_legal_reason': 'businessLegalReason',
            'federal_government': 'federalGovernment',
            'federal_government_legal_reason': 'federalGovernmentLegalReason',
            'state_government': 'stateGovernment',
            'state_government_legal_reason': 'stateGovernmentLegalReason',
            'city_government': 'cityGovernment',
            'city_government_legal_reason': 'cityGovernmentLegalReason'
        }

        self._legal_reason = legal_reason
        self._business = business
        self._business_legal_reason = business_legal_reason
        self._federal_government = federal_government
        self._federal_government_legal_reason = federal_government_legal_reason
        self._state_government = state_government
        self._state_government_legal_reason = state_government_legal_reason
        self._city_government = city_government
        self._city_government_legal_reason = city_government_legal_reason

    @property
    def legal_reason(self):
        """
        Gets the legal_reason of this AgastWithholdingPIS.

        :return: The legal_reason of this AgastWithholdingPIS.
        :rtype: str
        """
        return self._legal_reason

    @legal_reason.setter
    def legal_reason(self, legal_reason):
        """
        Sets the legal_reason of this AgastWithholdingPIS.

        :param legal_reason: The legal_reason of this AgastWithholdingPIS.
        :type: str
        """

        self._legal_reason = legal_reason

    @property
    def business(self):
        """
        Gets the business of this AgastWithholdingPIS.

        :return: The business of this AgastWithholdingPIS.
        :rtype: bool
        """
        return self._business

    @business.setter
    def business(self, business):
        """
        Sets the business of this AgastWithholdingPIS.

        :param business: The business of this AgastWithholdingPIS.
        :type: bool
        """

        self._business = business

    @property
    def business_legal_reason(self):
        """
        Gets the business_legal_reason of this AgastWithholdingPIS.
        reference id to TaxLegalReason

        :return: The business_legal_reason of this AgastWithholdingPIS.
        :rtype: str
        """
        return self._business_legal_reason

    @business_legal_reason.setter
    def business_legal_reason(self, business_legal_reason):
        """
        Sets the business_legal_reason of this AgastWithholdingPIS.
        reference id to TaxLegalReason

        :param business_legal_reason: The business_legal_reason of this AgastWithholdingPIS.
        :type: str
        """
        if business_legal_reason is not None and len(business_legal_reason) > 60:
            raise ValueError("Invalid value for `business_legal_reason`, length must be less than or equal to `60`")

        self._business_legal_reason = business_legal_reason

    @property
    def federal_government(self):
        """
        Gets the federal_government of this AgastWithholdingPIS.

        :return: The federal_government of this AgastWithholdingPIS.
        :rtype: bool
        """
        return self._federal_government

    @federal_government.setter
    def federal_government(self, federal_government):
        """
        Sets the federal_government of this AgastWithholdingPIS.

        :param federal_government: The federal_government of this AgastWithholdingPIS.
        :type: bool
        """

        self._federal_government = federal_government

    @property
    def federal_government_legal_reason(self):
        """
        Gets the federal_government_legal_reason of this AgastWithholdingPIS.
        reference id to TaxLegalReason

        :return: The federal_government_legal_reason of this AgastWithholdingPIS.
        :rtype: str
        """
        return self._federal_government_legal_reason

    @federal_government_legal_reason.setter
    def federal_government_legal_reason(self, federal_government_legal_reason):
        """
        Sets the federal_government_legal_reason of this AgastWithholdingPIS.
        reference id to TaxLegalReason

        :param federal_government_legal_reason: The federal_government_legal_reason of this AgastWithholdingPIS.
        :type: str
        """
        if federal_government_legal_reason is not None and len(federal_government_legal_reason) > 60:
            raise ValueError("Invalid value for `federal_government_legal_reason`, length must be less than or equal to `60`")

        self._federal_government_legal_reason = federal_government_legal_reason

    @property
    def state_government(self):
        """
        Gets the state_government of this AgastWithholdingPIS.

        :return: The state_government of this AgastWithholdingPIS.
        :rtype: bool
        """
        return self._state_government

    @state_government.setter
    def state_government(self, state_government):
        """
        Sets the state_government of this AgastWithholdingPIS.

        :param state_government: The state_government of this AgastWithholdingPIS.
        :type: bool
        """

        self._state_government = state_government

    @property
    def state_government_legal_reason(self):
        """
        Gets the state_government_legal_reason of this AgastWithholdingPIS.
        reference id to TaxLegalReason

        :return: The state_government_legal_reason of this AgastWithholdingPIS.
        :rtype: str
        """
        return self._state_government_legal_reason

    @state_government_legal_reason.setter
    def state_government_legal_reason(self, state_government_legal_reason):
        """
        Sets the state_government_legal_reason of this AgastWithholdingPIS.
        reference id to TaxLegalReason

        :param state_government_legal_reason: The state_government_legal_reason of this AgastWithholdingPIS.
        :type: str
        """
        if state_government_legal_reason is not None and len(state_government_legal_reason) > 60:
            raise ValueError("Invalid value for `state_government_legal_reason`, length must be less than or equal to `60`")

        self._state_government_legal_reason = state_government_legal_reason

    @property
    def city_government(self):
        """
        Gets the city_government of this AgastWithholdingPIS.

        :return: The city_government of this AgastWithholdingPIS.
        :rtype: bool
        """
        return self._city_government

    @city_government.setter
    def city_government(self, city_government):
        """
        Sets the city_government of this AgastWithholdingPIS.

        :param city_government: The city_government of this AgastWithholdingPIS.
        :type: bool
        """

        self._city_government = city_government

    @property
    def city_government_legal_reason(self):
        """
        Gets the city_government_legal_reason of this AgastWithholdingPIS.
        reference id to TaxLegalReason

        :return: The city_government_legal_reason of this AgastWithholdingPIS.
        :rtype: str
        """
        return self._city_government_legal_reason

    @city_government_legal_reason.setter
    def city_government_legal_reason(self, city_government_legal_reason):
        """
        Sets the city_government_legal_reason of this AgastWithholdingPIS.
        reference id to TaxLegalReason

        :param city_government_legal_reason: The city_government_legal_reason of this AgastWithholdingPIS.
        :type: str
        """
        if city_government_legal_reason is not None and len(city_government_legal_reason) > 60:
            raise ValueError("Invalid value for `city_government_legal_reason`, length must be less than or equal to `60`")

        self._city_government_legal_reason = city_government_legal_reason

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
