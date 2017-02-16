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


class NRefRefFarmerNF(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, state_cd=None, yymm=None, federal_tax_id=None, state_tax_id=None, model=None, serie=None, number=None):
        """
        NRefRefFarmerNF - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'state_cd': 'StateEnum',
            'yymm': 'str',
            'federal_tax_id': 'str',
            'state_tax_id': 'str',
            'model': 'str',
            'serie': 'str',
            'number': 'str'
        }

        self.attribute_map = {
            'state_cd': 'stateCd',
            'yymm': 'yymm',
            'federal_tax_id': 'federalTaxId',
            'state_tax_id': 'stateTaxId',
            'model': 'model',
            'serie': 'serie',
            'number': 'number'
        }

        self._state_cd = state_cd
        self._yymm = yymm
        self._federal_tax_id = federal_tax_id
        self._state_tax_id = state_tax_id
        self._model = model
        self._serie = serie
        self._number = number

    @property
    def state_cd(self):
        """
        Gets the state_cd of this NRefRefFarmerNF.
        State code of fiscal Document creator, farmer

        :return: The state_cd of this NRefRefFarmerNF.
        :rtype: StateEnum
        """
        return self._state_cd

    @state_cd.setter
    def state_cd(self, state_cd):
        """
        Sets the state_cd of this NRefRefFarmerNF.
        State code of fiscal Document creator, farmer

        :param state_cd: The state_cd of this NRefRefFarmerNF.
        :type: StateEnum
        """
        if state_cd is None:
            raise ValueError("Invalid value for `state_cd`, must not be `None`")

        self._state_cd = state_cd

    @property
    def yymm(self):
        """
        Gets the yymm of this NRefRefFarmerNF.
        year and month of fiscal document creation

        :return: The yymm of this NRefRefFarmerNF.
        :rtype: str
        """
        return self._yymm

    @yymm.setter
    def yymm(self, yymm):
        """
        Sets the yymm of this NRefRefFarmerNF.
        year and month of fiscal document creation

        :param yymm: The yymm of this NRefRefFarmerNF.
        :type: str
        """
        if yymm is None:
            raise ValueError("Invalid value for `yymm`, must not be `None`")
        if yymm is not None and not re.search('[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}', yymm):
            raise ValueError("Invalid value for `yymm`, must be a follow pattern or equal to `/[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}/`")

        self._yymm = yymm

    @property
    def federal_tax_id(self):
        """
        Gets the federal_tax_id of this NRefRefFarmerNF.
        fiscal document creator farmer federalTaxId

        :return: The federal_tax_id of this NRefRefFarmerNF.
        :rtype: str
        """
        return self._federal_tax_id

    @federal_tax_id.setter
    def federal_tax_id(self, federal_tax_id):
        """
        Sets the federal_tax_id of this NRefRefFarmerNF.
        fiscal document creator farmer federalTaxId

        :param federal_tax_id: The federal_tax_id of this NRefRefFarmerNF.
        :type: str
        """
        if federal_tax_id is None:
            raise ValueError("Invalid value for `federal_tax_id`, must not be `None`")
        if federal_tax_id is not None and not re.search('[0-9]{14}', federal_tax_id):
            raise ValueError("Invalid value for `federal_tax_id`, must be a follow pattern or equal to `/[0-9]{14}/`")

        self._federal_tax_id = federal_tax_id

    @property
    def state_tax_id(self):
        """
        Gets the state_tax_id of this NRefRefFarmerNF.
        fiscal document creator, farmer stateTaxId

        :return: The state_tax_id of this NRefRefFarmerNF.
        :rtype: str
        """
        return self._state_tax_id

    @state_tax_id.setter
    def state_tax_id(self, state_tax_id):
        """
        Sets the state_tax_id of this NRefRefFarmerNF.
        fiscal document creator, farmer stateTaxId

        :param state_tax_id: The state_tax_id of this NRefRefFarmerNF.
        :type: str
        """
        if state_tax_id is None:
            raise ValueError("Invalid value for `state_tax_id`, must not be `None`")
        if state_tax_id is not None and not re.search('[0-9]{14}', state_tax_id):
            raise ValueError("Invalid value for `state_tax_id`, must be a follow pattern or equal to `/[0-9]{14}/`")

        self._state_tax_id = state_tax_id

    @property
    def model(self):
        """
        Gets the model of this NRefRefFarmerNF.
        Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO 

        :return: The model of this NRefRefFarmerNF.
        :rtype: str
        """
        return self._model

    @model.setter
    def model(self, model):
        """
        Sets the model of this NRefRefFarmerNF.
        Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO 

        :param model: The model of this NRefRefFarmerNF.
        :type: str
        """
        allowed_values = ["04", "01"]
        if model not in allowed_values:
            raise ValueError(
                "Invalid value for `model` ({0}), must be one of {1}"
                .format(model, allowed_values)
            )

        self._model = model

    @property
    def serie(self):
        """
        Gets the serie of this NRefRefFarmerNF.
        fiscal document serie

        :return: The serie of this NRefRefFarmerNF.
        :rtype: str
        """
        return self._serie

    @serie.setter
    def serie(self, serie):
        """
        Sets the serie of this NRefRefFarmerNF.
        fiscal document serie

        :param serie: The serie of this NRefRefFarmerNF.
        :type: str
        """
        if serie is None:
            raise ValueError("Invalid value for `serie`, must not be `None`")
        if serie is not None and not re.search('0|[1-9]{1}[0-9]{0,2}', serie):
            raise ValueError("Invalid value for `serie`, must be a follow pattern or equal to `/0|[1-9]{1}[0-9]{0,2}/`")

        self._serie = serie

    @property
    def number(self):
        """
        Gets the number of this NRefRefFarmerNF.
        fiscal document number

        :return: The number of this NRefRefFarmerNF.
        :rtype: str
        """
        return self._number

    @number.setter
    def number(self, number):
        """
        Sets the number of this NRefRefFarmerNF.
        fiscal document number

        :param number: The number of this NRefRefFarmerNF.
        :type: str
        """
        if number is None:
            raise ValueError("Invalid value for `number`, must not be `None`")
        if number is not None and not re.search('[1-9]{1}[0-9]{0,8}', number):
            raise ValueError("Invalid value for `number`, must be a follow pattern or equal to `/[1-9]{1}[0-9]{0,8}/`")

        self._number = number

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
