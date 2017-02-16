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


class LineForGoodsDi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, customs_value=None, di_number=None, register_date_di=None, clearance_site=None, clearance_state=None, clearance_date=None, transport_di_type=None, afrmm_value=None, intermediate_type=None, buyer_federal_tax_id=None, buyer_state=None, exporter_code=None, adi=None):
        """
        LineForGoodsDi - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'customs_value': 'float',
            'di_number': 'str',
            'register_date_di': 'date',
            'clearance_site': 'str',
            'clearance_state': 'StateEnum',
            'clearance_date': 'date',
            'transport_di_type': 'str',
            'afrmm_value': 'float',
            'intermediate_type': 'str',
            'buyer_federal_tax_id': 'str',
            'buyer_state': 'StateEnum',
            'exporter_code': 'str',
            'adi': 'list[LineForGoodsAdi]'
        }

        self.attribute_map = {
            'customs_value': 'customsValue',
            'di_number': 'diNumber',
            'register_date_di': 'registerDateDI',
            'clearance_site': 'clearanceSite',
            'clearance_state': 'clearanceState',
            'clearance_date': 'clearanceDate',
            'transport_di_type': 'transportDIType',
            'afrmm_value': 'afrmmValue',
            'intermediate_type': 'intermediateType',
            'buyer_federal_tax_id': 'buyerFederalTaxID',
            'buyer_state': 'buyerState',
            'exporter_code': 'exporterCode',
            'adi': 'adi'
        }

        self._customs_value = customs_value
        self._di_number = di_number
        self._register_date_di = register_date_di
        self._clearance_site = clearance_site
        self._clearance_state = clearance_state
        self._clearance_date = clearance_date
        self._transport_di_type = transport_di_type
        self._afrmm_value = afrmm_value
        self._intermediate_type = intermediate_type
        self._buyer_federal_tax_id = buyer_federal_tax_id
        self._buyer_state = buyer_state
        self._exporter_code = exporter_code
        self._adi = adi

    @property
    def customs_value(self):
        """
        Gets the customs_value of this LineForGoodsDi.
        customs value, valor aduaneiro (II Block of NFe)

        :return: The customs_value of this LineForGoodsDi.
        :rtype: float
        """
        return self._customs_value

    @customs_value.setter
    def customs_value(self, customs_value):
        """
        Sets the customs_value of this LineForGoodsDi.
        customs value, valor aduaneiro (II Block of NFe)

        :param customs_value: The customs_value of this LineForGoodsDi.
        :type: float
        """

        self._customs_value = customs_value

    @property
    def di_number(self):
        """
        Gets the di_number of this LineForGoodsDi.
        Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)

        :return: The di_number of this LineForGoodsDi.
        :rtype: str
        """
        return self._di_number

    @di_number.setter
    def di_number(self, di_number):
        """
        Sets the di_number of this LineForGoodsDi.
        Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)

        :param di_number: The di_number of this LineForGoodsDi.
        :type: str
        """
        if di_number is None:
            raise ValueError("Invalid value for `di_number`, must not be `None`")
        if di_number is not None and len(di_number) > 12:
            raise ValueError("Invalid value for `di_number`, length must be less than or equal to `12`")
        if di_number is not None and len(di_number) < 1:
            raise ValueError("Invalid value for `di_number`, length must be greater than or equal to `1`")

        self._di_number = di_number

    @property
    def register_date_di(self):
        """
        Gets the register_date_di of this LineForGoodsDi.
        Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)

        :return: The register_date_di of this LineForGoodsDi.
        :rtype: date
        """
        return self._register_date_di

    @register_date_di.setter
    def register_date_di(self, register_date_di):
        """
        Sets the register_date_di of this LineForGoodsDi.
        Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)

        :param register_date_di: The register_date_di of this LineForGoodsDi.
        :type: date
        """
        if register_date_di is None:
            raise ValueError("Invalid value for `register_date_di`, must not be `None`")

        self._register_date_di = register_date_di

    @property
    def clearance_site(self):
        """
        Gets the clearance_site of this LineForGoodsDi.
        Clerance Site Local do desembaraço aduaneiro 

        :return: The clearance_site of this LineForGoodsDi.
        :rtype: str
        """
        return self._clearance_site

    @clearance_site.setter
    def clearance_site(self, clearance_site):
        """
        Sets the clearance_site of this LineForGoodsDi.
        Clerance Site Local do desembaraço aduaneiro 

        :param clearance_site: The clearance_site of this LineForGoodsDi.
        :type: str
        """
        if clearance_site is None:
            raise ValueError("Invalid value for `clearance_site`, must not be `None`")
        if clearance_site is not None and len(clearance_site) > 60:
            raise ValueError("Invalid value for `clearance_site`, length must be less than or equal to `60`")
        if clearance_site is not None and len(clearance_site) < 1:
            raise ValueError("Invalid value for `clearance_site`, length must be greater than or equal to `1`")

        self._clearance_site = clearance_site

    @property
    def clearance_state(self):
        """
        Gets the clearance_state of this LineForGoodsDi.
        Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro 

        :return: The clearance_state of this LineForGoodsDi.
        :rtype: StateEnum
        """
        return self._clearance_state

    @clearance_state.setter
    def clearance_state(self, clearance_state):
        """
        Sets the clearance_state of this LineForGoodsDi.
        Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro 

        :param clearance_state: The clearance_state of this LineForGoodsDi.
        :type: StateEnum
        """
        if clearance_state is None:
            raise ValueError("Invalid value for `clearance_state`, must not be `None`")

        self._clearance_state = clearance_state

    @property
    def clearance_date(self):
        """
        Gets the clearance_date of this LineForGoodsDi.
        Clerance date

        :return: The clearance_date of this LineForGoodsDi.
        :rtype: date
        """
        return self._clearance_date

    @clearance_date.setter
    def clearance_date(self, clearance_date):
        """
        Sets the clearance_date of this LineForGoodsDi.
        Clerance date

        :param clearance_date: The clearance_date of this LineForGoodsDi.
        :type: date
        """

        self._clearance_date = clearance_date

    @property
    def transport_di_type(self):
        """
        Gets the transport_di_type of this LineForGoodsDi.
        - '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta 

        :return: The transport_di_type of this LineForGoodsDi.
        :rtype: str
        """
        return self._transport_di_type

    @transport_di_type.setter
    def transport_di_type(self, transport_di_type):
        """
        Sets the transport_di_type of this LineForGoodsDi.
        - '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta 

        :param transport_di_type: The transport_di_type of this LineForGoodsDi.
        :type: str
        """
        allowed_values = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
        if transport_di_type not in allowed_values:
            raise ValueError(
                "Invalid value for `transport_di_type` ({0}), must be one of {1}"
                .format(transport_di_type, allowed_values)
            )

        self._transport_di_type = transport_di_type

    @property
    def afrmm_value(self):
        """
        Gets the afrmm_value of this LineForGoodsDi.
        Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] 

        :return: The afrmm_value of this LineForGoodsDi.
        :rtype: float
        """
        return self._afrmm_value

    @afrmm_value.setter
    def afrmm_value(self, afrmm_value):
        """
        Sets the afrmm_value of this LineForGoodsDi.
        Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] 

        :param afrmm_value: The afrmm_value of this LineForGoodsDi.
        :type: float
        """

        self._afrmm_value = afrmm_value

    @property
    def intermediate_type(self):
        """
        Gets the intermediate_type of this LineForGoodsDi.
        - '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda] 

        :return: The intermediate_type of this LineForGoodsDi.
        :rtype: str
        """
        return self._intermediate_type

    @intermediate_type.setter
    def intermediate_type(self, intermediate_type):
        """
        Sets the intermediate_type of this LineForGoodsDi.
        - '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda] 

        :param intermediate_type: The intermediate_type of this LineForGoodsDi.
        :type: str
        """
        allowed_values = ["1", "2", "3"]
        if intermediate_type not in allowed_values:
            raise ValueError(
                "Invalid value for `intermediate_type` ({0}), must be one of {1}"
                .format(intermediate_type, allowed_values)
            )

        self._intermediate_type = intermediate_type

    @property
    def buyer_federal_tax_id(self):
        """
        Gets the buyer_federal_tax_id of this LineForGoodsDi.
        Buyer federal tax id CNPJ do comprador ou encomendante 

        :return: The buyer_federal_tax_id of this LineForGoodsDi.
        :rtype: str
        """
        return self._buyer_federal_tax_id

    @buyer_federal_tax_id.setter
    def buyer_federal_tax_id(self, buyer_federal_tax_id):
        """
        Sets the buyer_federal_tax_id of this LineForGoodsDi.
        Buyer federal tax id CNPJ do comprador ou encomendante 

        :param buyer_federal_tax_id: The buyer_federal_tax_id of this LineForGoodsDi.
        :type: str
        """
        if buyer_federal_tax_id is not None and not re.search('[0-9]{14}', buyer_federal_tax_id):
            raise ValueError("Invalid value for `buyer_federal_tax_id`, must be a follow pattern or equal to `/[0-9]{14}/`")

        self._buyer_federal_tax_id = buyer_federal_tax_id

    @property
    def buyer_state(self):
        """
        Gets the buyer_state of this LineForGoodsDi.
        Buyer sate Estado do comprador ou encomendante 

        :return: The buyer_state of this LineForGoodsDi.
        :rtype: StateEnum
        """
        return self._buyer_state

    @buyer_state.setter
    def buyer_state(self, buyer_state):
        """
        Sets the buyer_state of this LineForGoodsDi.
        Buyer sate Estado do comprador ou encomendante 

        :param buyer_state: The buyer_state of this LineForGoodsDi.
        :type: StateEnum
        """

        self._buyer_state = buyer_state

    @property
    def exporter_code(self):
        """
        Gets the exporter_code of this LineForGoodsDi.
        Exporter code

        :return: The exporter_code of this LineForGoodsDi.
        :rtype: str
        """
        return self._exporter_code

    @exporter_code.setter
    def exporter_code(self, exporter_code):
        """
        Sets the exporter_code of this LineForGoodsDi.
        Exporter code

        :param exporter_code: The exporter_code of this LineForGoodsDi.
        :type: str
        """
        if exporter_code is not None and len(exporter_code) > 60:
            raise ValueError("Invalid value for `exporter_code`, length must be less than or equal to `60`")
        if exporter_code is not None and len(exporter_code) < 1:
            raise ValueError("Invalid value for `exporter_code`, length must be greater than or equal to `1`")

        self._exporter_code = exporter_code

    @property
    def adi(self):
        """
        Gets the adi of this LineForGoodsDi.
        aditional import declaration

        :return: The adi of this LineForGoodsDi.
        :rtype: list[LineForGoodsAdi]
        """
        return self._adi

    @adi.setter
    def adi(self, adi):
        """
        Sets the adi of this LineForGoodsDi.
        aditional import declaration

        :param adi: The adi of this LineForGoodsDi.
        :type: list[LineForGoodsAdi]
        """
        if adi is None:
            raise ValueError("Invalid value for `adi`, must not be `None`")

        self._adi = adi

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
