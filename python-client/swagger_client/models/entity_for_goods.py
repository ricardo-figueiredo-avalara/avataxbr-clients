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


class EntityForGoods(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, name=None, role=None, type=None, federal_tax_id=None, city_tax_id=None, state_tax_id=None, suframa=None, phone=None, tax_regime=None, email=None, subject_to_srf1234=None, icms_tax_payer=None):
        """
        EntityForGoods - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'name': 'str',
            'role': 'str',
            'type': 'EntityType',
            'federal_tax_id': 'str',
            'city_tax_id': 'str',
            'state_tax_id': 'str',
            'suframa': 'str',
            'phone': 'str',
            'tax_regime': 'str',
            'email': 'str',
            'subject_to_srf1234': 'bool',
            'icms_tax_payer': 'bool'
        }

        self.attribute_map = {
            'name': 'name',
            'role': 'role',
            'type': 'type',
            'federal_tax_id': 'federalTaxId',
            'city_tax_id': 'cityTaxId',
            'state_tax_id': 'stateTaxId',
            'suframa': 'suframa',
            'phone': 'phone',
            'tax_regime': 'taxRegime',
            'email': 'email',
            'subject_to_srf1234': 'subjectToSRF1234',
            'icms_tax_payer': 'icmsTaxPayer'
        }

        self._name = name
        self._role = role
        self._type = type
        self._federal_tax_id = federal_tax_id
        self._city_tax_id = city_tax_id
        self._state_tax_id = state_tax_id
        self._suframa = suframa
        self._phone = phone
        self._tax_regime = tax_regime
        self._email = email
        self._subject_to_srf1234 = subject_to_srf1234
        self._icms_tax_payer = icms_tax_payer

    @property
    def name(self):
        """
        Gets the name of this EntityForGoods.
        Entity name, official name (Razão Social)

        :return: The name of this EntityForGoods.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this EntityForGoods.
        Entity name, official name (Razão Social)

        :param name: The name of this EntityForGoods.
        :type: str
        """

        self._name = name

    @property
    def role(self):
        """
        Gets the role of this EntityForGoods.
        - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 

        :return: The role of this EntityForGoods.
        :rtype: str
        """
        return self._role

    @role.setter
    def role(self, role):
        """
        Sets the role of this EntityForGoods.
        - 'transporter' - 'sender' # REMETENTE - 'dispatcher' # EXPEDITOR - 'receiver' # RECEIVER - 'addressee' # DESTINATÁRIO - 'other' # OUTRO 

        :param role: The role of this EntityForGoods.
        :type: str
        """
        allowed_values = ["transporter", "sender", "dispatcher", "receiver", "addressee", "other"]
        if role not in allowed_values:
            raise ValueError(
                "Invalid value for `role` ({0}), must be one of {1}"
                .format(role, allowed_values)
            )

        self._role = role

    @property
    def type(self):
        """
        Gets the type of this EntityForGoods.

        :return: The type of this EntityForGoods.
        :rtype: EntityType
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this EntityForGoods.

        :param type: The type of this EntityForGoods.
        :type: EntityType
        """
        if type is None:
            raise ValueError("Invalid value for `type`, must not be `None`")

        self._type = type

    @property
    def federal_tax_id(self):
        """
        Gets the federal_tax_id of this EntityForGoods.
        CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'

        :return: The federal_tax_id of this EntityForGoods.
        :rtype: str
        """
        return self._federal_tax_id

    @federal_tax_id.setter
    def federal_tax_id(self, federal_tax_id):
        """
        Sets the federal_tax_id of this EntityForGoods.
        CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'

        :param federal_tax_id: The federal_tax_id of this EntityForGoods.
        :type: str
        """
        if federal_tax_id is None:
            raise ValueError("Invalid value for `federal_tax_id`, must not be `None`")
        if federal_tax_id is not None and not re.search('([!-ÿ]{0}|[!-ÿ]{5,20})?', federal_tax_id):
            raise ValueError("Invalid value for `federal_tax_id`, must be a follow pattern or equal to `/([!-ÿ]{0}|[!-ÿ]{5,20})?/`")

        self._federal_tax_id = federal_tax_id

    @property
    def city_tax_id(self):
        """
        Gets the city_tax_id of this EntityForGoods.
        City Tax ID

        :return: The city_tax_id of this EntityForGoods.
        :rtype: str
        """
        return self._city_tax_id

    @city_tax_id.setter
    def city_tax_id(self, city_tax_id):
        """
        Sets the city_tax_id of this EntityForGoods.
        City Tax ID

        :param city_tax_id: The city_tax_id of this EntityForGoods.
        :type: str
        """
        if city_tax_id is not None and len(city_tax_id) > 15:
            raise ValueError("Invalid value for `city_tax_id`, length must be less than or equal to `15`")

        self._city_tax_id = city_tax_id

    @property
    def state_tax_id(self):
        """
        Gets the state_tax_id of this EntityForGoods.
        State Tax ID

        :return: The state_tax_id of this EntityForGoods.
        :rtype: str
        """
        return self._state_tax_id

    @state_tax_id.setter
    def state_tax_id(self, state_tax_id):
        """
        Sets the state_tax_id of this EntityForGoods.
        State Tax ID

        :param state_tax_id: The state_tax_id of this EntityForGoods.
        :type: str
        """
        if state_tax_id is not None and not re.search('[0-9]{2,14}|ISENTO', state_tax_id):
            raise ValueError("Invalid value for `state_tax_id`, must be a follow pattern or equal to `/[0-9]{2,14}|ISENTO/`")

        self._state_tax_id = state_tax_id

    @property
    def suframa(self):
        """
        Gets the suframa of this EntityForGoods.
        Suframa ID

        :return: The suframa of this EntityForGoods.
        :rtype: str
        """
        return self._suframa

    @suframa.setter
    def suframa(self, suframa):
        """
        Sets the suframa of this EntityForGoods.
        Suframa ID

        :param suframa: The suframa of this EntityForGoods.
        :type: str
        """
        if suframa is not None and not re.search('[0-9]{8,9}', suframa):
            raise ValueError("Invalid value for `suframa`, must be a follow pattern or equal to `/[0-9]{8,9}/`")

        self._suframa = suframa

    @property
    def phone(self):
        """
        Gets the phone of this EntityForGoods.
        Entity Phone

        :return: The phone of this EntityForGoods.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """
        Sets the phone of this EntityForGoods.
        Entity Phone

        :param phone: The phone of this EntityForGoods.
        :type: str
        """
        if phone is not None and not re.search('[0-9]{6,14}', phone):
            raise ValueError("Invalid value for `phone`, must be a follow pattern or equal to `/[0-9]{6,14}/`")

        self._phone = phone

    @property
    def tax_regime(self):
        """
        Gets the tax_regime of this EntityForGoods.

        :return: The tax_regime of this EntityForGoods.
        :rtype: str
        """
        return self._tax_regime

    @tax_regime.setter
    def tax_regime(self, tax_regime):
        """
        Sets the tax_regime of this EntityForGoods.

        :param tax_regime: The tax_regime of this EntityForGoods.
        :type: str
        """
        allowed_values = ["realProfit", "estimatedProfit", "simplified", "simplifiedOverGrossthreshold", "simplifiedEntrepreneur", "notApplicable", "individual"]
        if tax_regime not in allowed_values:
            raise ValueError(
                "Invalid value for `tax_regime` ({0}), must be one of {1}"
                .format(tax_regime, allowed_values)
            )

        self._tax_regime = tax_regime

    @property
    def email(self):
        """
        Gets the email of this EntityForGoods.
        Entity Email

        :return: The email of this EntityForGoods.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """
        Sets the email of this EntityForGoods.
        Entity Email

        :param email: The email of this EntityForGoods.
        :type: str
        """
        if email is not None and len(email) > 60:
            raise ValueError("Invalid value for `email`, length must be less than or equal to `60`")

        self._email = email

    @property
    def subject_to_srf1234(self):
        """
        Gets the subject_to_srf1234 of this EntityForGoods.
        Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)

        :return: The subject_to_srf1234 of this EntityForGoods.
        :rtype: bool
        """
        return self._subject_to_srf1234

    @subject_to_srf1234.setter
    def subject_to_srf1234(self, subject_to_srf1234):
        """
        Sets the subject_to_srf1234 of this EntityForGoods.
        Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)

        :param subject_to_srf1234: The subject_to_srf1234 of this EntityForGoods.
        :type: bool
        """

        self._subject_to_srf1234 = subject_to_srf1234

    @property
    def icms_tax_payer(self):
        """
        Gets the icms_tax_payer of this EntityForGoods.
        Inform if the entity is ICMS tax payer.

        :return: The icms_tax_payer of this EntityForGoods.
        :rtype: bool
        """
        return self._icms_tax_payer

    @icms_tax_payer.setter
    def icms_tax_payer(self, icms_tax_payer):
        """
        Sets the icms_tax_payer of this EntityForGoods.
        Inform if the entity is ICMS tax payer.

        :param icms_tax_payer: The icms_tax_payer of this EntityForGoods.
        :type: bool
        """

        self._icms_tax_payer = icms_tax_payer

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
