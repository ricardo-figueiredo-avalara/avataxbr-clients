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


class Location(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, street=None, neighborhood=None, zipcode=None, city_code=None, city_name=None, state=None, country_code='0', country='BRA', number=None, complement=None, phone=None, company_id=None, code=None, type=None, email=None, federal_tax_id=None, state_tax_id=None, secondary_state_tax_id=None, city_tax_id=None, suframa=None, main_activity=None, nfse_process_model=None):
        """
        Location - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'street': 'str',
            'neighborhood': 'str',
            'zipcode': 'str',
            'city_code': 'str',
            'city_name': 'str',
            'state': 'StateEnum',
            'country_code': 'str',
            'country': 'str',
            'number': 'str',
            'complement': 'str',
            'phone': 'str',
            'company_id': 'str',
            'code': 'str',
            'type': 'str',
            'email': 'str',
            'federal_tax_id': 'str',
            'state_tax_id': 'str',
            'secondary_state_tax_id': 'list[LocationSecondaryStateTaxId]',
            'city_tax_id': 'str',
            'suframa': 'str',
            'main_activity': 'str',
            'nfse_process_model': 'str'
        }

        self.attribute_map = {
            'street': 'street',
            'neighborhood': 'neighborhood',
            'zipcode': 'zipcode',
            'city_code': 'cityCode',
            'city_name': 'cityName',
            'state': 'state',
            'country_code': 'countryCode',
            'country': 'country',
            'number': 'number',
            'complement': 'complement',
            'phone': 'phone',
            'company_id': 'companyId',
            'code': 'code',
            'type': 'type',
            'email': 'email',
            'federal_tax_id': 'federalTaxId',
            'state_tax_id': 'stateTaxId',
            'secondary_state_tax_id': 'secondaryStateTaxId',
            'city_tax_id': 'cityTaxId',
            'suframa': 'suframa',
            'main_activity': 'mainActivity',
            'nfse_process_model': 'nfseProcessModel'
        }

        self._street = street
        self._neighborhood = neighborhood
        self._zipcode = zipcode
        self._city_code = city_code
        self._city_name = city_name
        self._state = state
        self._country_code = country_code
        self._country = country
        self._number = number
        self._complement = complement
        self._phone = phone
        self._company_id = company_id
        self._code = code
        self._type = type
        self._email = email
        self._federal_tax_id = federal_tax_id
        self._state_tax_id = state_tax_id
        self._secondary_state_tax_id = secondary_state_tax_id
        self._city_tax_id = city_tax_id
        self._suframa = suframa
        self._main_activity = main_activity
        self._nfse_process_model = nfse_process_model

    @property
    def street(self):
        """
        Gets the street of this Location.
        Street Name

        :return: The street of this Location.
        :rtype: str
        """
        return self._street

    @street.setter
    def street(self, street):
        """
        Sets the street of this Location.
        Street Name

        :param street: The street of this Location.
        :type: str
        """
        if street is not None and len(street) > 60:
            raise ValueError("Invalid value for `street`, length must be less than or equal to `60`")

        self._street = street

    @property
    def neighborhood(self):
        """
        Gets the neighborhood of this Location.
        Neighborhood Name

        :return: The neighborhood of this Location.
        :rtype: str
        """
        return self._neighborhood

    @neighborhood.setter
    def neighborhood(self, neighborhood):
        """
        Sets the neighborhood of this Location.
        Neighborhood Name

        :param neighborhood: The neighborhood of this Location.
        :type: str
        """
        if neighborhood is not None and len(neighborhood) > 60:
            raise ValueError("Invalid value for `neighborhood`, length must be less than or equal to `60`")

        self._neighborhood = neighborhood

    @property
    def zipcode(self):
        """
        Gets the zipcode of this Location.
        Brazilian Zip Code

        :return: The zipcode of this Location.
        :rtype: str
        """
        return self._zipcode

    @zipcode.setter
    def zipcode(self, zipcode):
        """
        Sets the zipcode of this Location.
        Brazilian Zip Code

        :param zipcode: The zipcode of this Location.
        :type: str
        """
        if zipcode is None:
            raise ValueError("Invalid value for `zipcode`, must not be `None`")
        if zipcode is not None and not re.search('^(\\d{8}|\\d{5}\\-\\d{3})$', zipcode):
            raise ValueError("Invalid value for `zipcode`, must be a follow pattern or equal to `/^(\\d{8}|\\d{5}\\-\\d{3})$/`")

        self._zipcode = zipcode

    @property
    def city_code(self):
        """
        Gets the city_code of this Location.
        City Code (IBGE)

        :return: The city_code of this Location.
        :rtype: str
        """
        return self._city_code

    @city_code.setter
    def city_code(self, city_code):
        """
        Sets the city_code of this Location.
        City Code (IBGE)

        :param city_code: The city_code of this Location.
        :type: str
        """
        if city_code is not None and not re.search('^(\\d{7})$', city_code):
            raise ValueError("Invalid value for `city_code`, must be a follow pattern or equal to `/^(\\d{7})$/`")

        self._city_code = city_code

    @property
    def city_name(self):
        """
        Gets the city_name of this Location.
        City Name

        :return: The city_name of this Location.
        :rtype: str
        """
        return self._city_name

    @city_name.setter
    def city_name(self, city_name):
        """
        Sets the city_name of this Location.
        City Name

        :param city_name: The city_name of this Location.
        :type: str
        """
        if city_name is not None and len(city_name) > 60:
            raise ValueError("Invalid value for `city_name`, length must be less than or equal to `60`")

        self._city_name = city_name

    @property
    def state(self):
        """
        Gets the state of this Location.

        :return: The state of this Location.
        :rtype: StateEnum
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this Location.

        :param state: The state of this Location.
        :type: StateEnum
        """

        self._state = state

    @property
    def country_code(self):
        """
        Gets the country_code of this Location.
        Country Code

        :return: The country_code of this Location.
        :rtype: str
        """
        return self._country_code

    @country_code.setter
    def country_code(self, country_code):
        """
        Sets the country_code of this Location.
        Country Code

        :param country_code: The country_code of this Location.
        :type: str
        """
        if country_code is not None and not re.search('[0-9]{1,4}', country_code):
            raise ValueError("Invalid value for `country_code`, must be a follow pattern or equal to `/[0-9]{1,4}/`")

        self._country_code = country_code

    @property
    def country(self):
        """
        Gets the country of this Location.
        Use ISO 3166-1 alpha-3 codes

        :return: The country of this Location.
        :rtype: str
        """
        return self._country

    @country.setter
    def country(self, country):
        """
        Sets the country of this Location.
        Use ISO 3166-1 alpha-3 codes

        :param country: The country of this Location.
        :type: str
        """
        if country is not None and len(country) > 3:
            raise ValueError("Invalid value for `country`, length must be less than or equal to `3`")
        if country is not None and not re.search('^([A-Z]{3})$', country):
            raise ValueError("Invalid value for `country`, must be a follow pattern or equal to `/^([A-Z]{3})$/`")

        self._country = country

    @property
    def number(self):
        """
        Gets the number of this Location.
        House number

        :return: The number of this Location.
        :rtype: str
        """
        return self._number

    @number.setter
    def number(self, number):
        """
        Sets the number of this Location.
        House number

        :param number: The number of this Location.
        :type: str
        """
        if number is not None and len(number) > 60:
            raise ValueError("Invalid value for `number`, length must be less than or equal to `60`")

        self._number = number

    @property
    def complement(self):
        """
        Gets the complement of this Location.
        Any other information about the address (Room, Suite, Floor, etc)).

        :return: The complement of this Location.
        :rtype: str
        """
        return self._complement

    @complement.setter
    def complement(self, complement):
        """
        Sets the complement of this Location.
        Any other information about the address (Room, Suite, Floor, etc)).

        :param complement: The complement of this Location.
        :type: str
        """
        if complement is not None and len(complement) > 60:
            raise ValueError("Invalid value for `complement`, length must be less than or equal to `60`")

        self._complement = complement

    @property
    def phone(self):
        """
        Gets the phone of this Location.
        Phone number

        :return: The phone of this Location.
        :rtype: str
        """
        return self._phone

    @phone.setter
    def phone(self, phone):
        """
        Sets the phone of this Location.
        Phone number

        :param phone: The phone of this Location.
        :type: str
        """
        if phone is not None and not re.search('^(\\d{6,14}|\\(\\d{2}\\)\\s*\\d{4,5}-*\\d{4})$', phone):
            raise ValueError("Invalid value for `phone`, must be a follow pattern or equal to `/^(\\d{6,14}|\\(\\d{2}\\)\\s*\\d{4,5}-*\\d{4})$/`")

        self._phone = phone

    @property
    def company_id(self):
        """
        Gets the company_id of this Location.
        Company ID

        :return: The company_id of this Location.
        :rtype: str
        """
        return self._company_id

    @company_id.setter
    def company_id(self, company_id):
        """
        Sets the company_id of this Location.
        Company ID

        :param company_id: The company_id of this Location.
        :type: str
        """
        if company_id is None:
            raise ValueError("Invalid value for `company_id`, must not be `None`")

        self._company_id = company_id

    @property
    def code(self):
        """
        Gets the code of this Location.
        this property identify the location, it is unique for this company

        :return: The code of this Location.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this Location.
        this property identify the location, it is unique for this company

        :param code: The code of this Location.
        :type: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")
        if code is not None and len(code) > 60:
            raise ValueError("Invalid value for `code`, length must be less than or equal to `60`")

        self._code = code

    @property
    def type(self):
        """
        Gets the type of this Location.
        this property identify the location, it is unique for this company

        :return: The type of this Location.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this Location.
        this property identify the location, it is unique for this company

        :param type: The type of this Location.
        :type: str
        """
        allowed_values = ["ShipFrom", "ShipTo", "ServiceRendered"]
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def email(self):
        """
        Gets the email of this Location.
        Email

        :return: The email of this Location.
        :rtype: str
        """
        return self._email

    @email.setter
    def email(self, email):
        """
        Sets the email of this Location.
        Email

        :param email: The email of this Location.
        :type: str
        """
        if email is not None and len(email) > 60:
            raise ValueError("Invalid value for `email`, length must be less than or equal to `60`")

        self._email = email

    @property
    def federal_tax_id(self):
        """
        Gets the federal_tax_id of this Location.
        Federal tax id, CNPJ or CPF

        :return: The federal_tax_id of this Location.
        :rtype: str
        """
        return self._federal_tax_id

    @federal_tax_id.setter
    def federal_tax_id(self, federal_tax_id):
        """
        Sets the federal_tax_id of this Location.
        Federal tax id, CNPJ or CPF

        :param federal_tax_id: The federal_tax_id of this Location.
        :type: str
        """
        if federal_tax_id is not None and not re.search('^(\\d{14}|\\d{2}\\.\\d{3}.\\d{3}/\\d{4}-\\d{2}|\\d{11}|\\d{3}\\.\\d{3}.\\d{3}-\\d{2})$', federal_tax_id):
            raise ValueError("Invalid value for `federal_tax_id`, must be a follow pattern or equal to `/^(\\d{14}|\\d{2}\\.\\d{3}.\\d{3}/\\d{4}-\\d{2}|\\d{11}|\\d{3}\\.\\d{3}.\\d{3}-\\d{2})$/`")

        self._federal_tax_id = federal_tax_id

    @property
    def state_tax_id(self):
        """
        Gets the state_tax_id of this Location.
        state tax id for this location

        :return: The state_tax_id of this Location.
        :rtype: str
        """
        return self._state_tax_id

    @state_tax_id.setter
    def state_tax_id(self, state_tax_id):
        """
        Sets the state_tax_id of this Location.
        state tax id for this location

        :param state_tax_id: The state_tax_id of this Location.
        :type: str
        """
        if state_tax_id is not None and not re.search('^(\\d{9,14}|ISENTO)$', state_tax_id):
            raise ValueError("Invalid value for `state_tax_id`, must be a follow pattern or equal to `/^(\\d{9,14}|ISENTO)$/`")

        self._state_tax_id = state_tax_id

    @property
    def secondary_state_tax_id(self):
        """
        Gets the secondary_state_tax_id of this Location.

        :return: The secondary_state_tax_id of this Location.
        :rtype: list[LocationSecondaryStateTaxId]
        """
        return self._secondary_state_tax_id

    @secondary_state_tax_id.setter
    def secondary_state_tax_id(self, secondary_state_tax_id):
        """
        Sets the secondary_state_tax_id of this Location.

        :param secondary_state_tax_id: The secondary_state_tax_id of this Location.
        :type: list[LocationSecondaryStateTaxId]
        """

        self._secondary_state_tax_id = secondary_state_tax_id

    @property
    def city_tax_id(self):
        """
        Gets the city_tax_id of this Location.
        City Tax ID

        :return: The city_tax_id of this Location.
        :rtype: str
        """
        return self._city_tax_id

    @city_tax_id.setter
    def city_tax_id(self, city_tax_id):
        """
        Sets the city_tax_id of this Location.
        City Tax ID

        :param city_tax_id: The city_tax_id of this Location.
        :type: str
        """
        if city_tax_id is not None and len(city_tax_id) > 15:
            raise ValueError("Invalid value for `city_tax_id`, length must be less than or equal to `15`")

        self._city_tax_id = city_tax_id

    @property
    def suframa(self):
        """
        Gets the suframa of this Location.

        :return: The suframa of this Location.
        :rtype: str
        """
        return self._suframa

    @suframa.setter
    def suframa(self, suframa):
        """
        Sets the suframa of this Location.

        :param suframa: The suframa of this Location.
        :type: str
        """
        if suframa is not None and not re.search('[0-9]{8,9}', suframa):
            raise ValueError("Invalid value for `suframa`, must be a follow pattern or equal to `/[0-9]{8,9}/`")

        self._suframa = suframa

    @property
    def main_activity(self):
        """
        Gets the main_activity of this Location.
        Main location activity

        :return: The main_activity of this Location.
        :rtype: str
        """
        return self._main_activity

    @main_activity.setter
    def main_activity(self, main_activity):
        """
        Sets the main_activity of this Location.
        Main location activity

        :param main_activity: The main_activity of this Location.
        :type: str
        """
        allowed_values = ["commerce", "industry", "service"]
        if main_activity not in allowed_values:
            raise ValueError(
                "Invalid value for `main_activity` ({0}), must be one of {1}"
                .format(main_activity, allowed_values)
            )

        self._main_activity = main_activity

    @property
    def nfse_process_model(self):
        """
        Gets the nfse_process_model of this Location.
        - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands 

        :return: The nfse_process_model of this Location.
        :rtype: str
        """
        return self._nfse_process_model

    @nfse_process_model.setter
    def nfse_process_model(self, nfse_process_model):
        """
        Sets the nfse_process_model of this Location.
        - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands 

        :param nfse_process_model: The nfse_process_model of this Location.
        :type: str
        """
        allowed_values = ["edi", "xml", "rps"]
        if nfse_process_model not in allowed_values:
            raise ValueError(
                "Invalid value for `nfse_process_model` ({0}), must be one of {1}"
                .format(nfse_process_model, allowed_values)
            )

        self._nfse_process_model = nfse_process_model

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