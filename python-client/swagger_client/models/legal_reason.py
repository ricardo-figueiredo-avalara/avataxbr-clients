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


class LegalReason(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id=None, scope=None, disable=None, description=None, name=None, legal_code=None, show_in_invoice=None, referenced_processes=None, tax_scope=None):
        """
        LegalReason - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id': 'str',
            'scope': 'str',
            'disable': 'bool',
            'description': 'str',
            'name': 'str',
            'legal_code': 'str',
            'show_in_invoice': 'str',
            'referenced_processes': 'list[LegalReasonReferencedProcesses]',
            'tax_scope': 'LegalReasonTaxScope'
        }

        self.attribute_map = {
            'id': 'id',
            'scope': 'scope',
            'disable': 'disable',
            'description': 'description',
            'name': 'name',
            'legal_code': 'legalCode',
            'show_in_invoice': 'showInInvoice',
            'referenced_processes': 'referencedProcesses',
            'tax_scope': 'taxScope'
        }

        self._id = id
        self._scope = scope
        self._disable = disable
        self._description = description
        self._name = name
        self._legal_code = legal_code
        self._show_in_invoice = show_in_invoice
        self._referenced_processes = referenced_processes
        self._tax_scope = tax_scope

    @property
    def id(self):
        """
        Gets the id of this LegalReason.
        Internal ID

        :return: The id of this LegalReason.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this LegalReason.
        Internal ID

        :param id: The id of this LegalReason.
        :type: str
        """

        self._id = id

    @property
    def scope(self):
        """
        Gets the scope of this LegalReason.
        Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 

        :return: The scope of this LegalReason.
        :rtype: str
        """
        return self._scope

    @scope.setter
    def scope(self, scope):
        """
        Sets the scope of this LegalReason.
        Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.); 

        :param scope: The scope of this LegalReason.
        :type: str
        """
        allowed_values = ["general", "linkedTo"]
        if scope not in allowed_values:
            raise ValueError(
                "Invalid value for `scope` ({0}), must be one of {1}"
                .format(scope, allowed_values)
            )

        self._scope = scope

    @property
    def disable(self):
        """
        Gets the disable of this LegalReason.
        Set this message as no longer valid

        :return: The disable of this LegalReason.
        :rtype: bool
        """
        return self._disable

    @disable.setter
    def disable(self, disable):
        """
        Sets the disable of this LegalReason.
        Set this message as no longer valid

        :param disable: The disable of this LegalReason.
        :type: bool
        """

        self._disable = disable

    @property
    def description(self):
        """
        Gets the description of this LegalReason.
        Legal reason textual description;

        :return: The description of this LegalReason.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this LegalReason.
        Legal reason textual description;

        :param description: The description of this LegalReason.
        :type: str
        """
        if description is None:
            raise ValueError("Invalid value for `description`, must not be `None`")

        self._description = description

    @property
    def name(self):
        """
        Gets the name of this LegalReason.
        Short name to this message

        :return: The name of this LegalReason.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this LegalReason.
        Short name to this message

        :param name: The name of this LegalReason.
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")

        self._name = name

    @property
    def legal_code(self):
        """
        Gets the legal_code of this LegalReason.
        this field inform the official code number

        :return: The legal_code of this LegalReason.
        :rtype: str
        """
        return self._legal_code

    @legal_code.setter
    def legal_code(self, legal_code):
        """
        Sets the legal_code of this LegalReason.
        this field inform the official code number

        :param legal_code: The legal_code of this LegalReason.
        :type: str
        """

        self._legal_code = legal_code

    @property
    def show_in_invoice(self):
        """
        Gets the show_in_invoice of this LegalReason.
        Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.

        :return: The show_in_invoice of this LegalReason.
        :rtype: str
        """
        return self._show_in_invoice

    @show_in_invoice.setter
    def show_in_invoice(self, show_in_invoice):
        """
        Sets the show_in_invoice of this LegalReason.
        Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.

        :param show_in_invoice: The show_in_invoice of this LegalReason.
        :type: str
        """
        allowed_values = ["complementaryInfoMessage", "fiscalInfoMessage", "itemInfoMessage"]
        if show_in_invoice not in allowed_values:
            raise ValueError(
                "Invalid value for `show_in_invoice` ({0}), must be one of {1}"
                .format(show_in_invoice, allowed_values)
            )

        self._show_in_invoice = show_in_invoice

    @property
    def referenced_processes(self):
        """
        Gets the referenced_processes of this LegalReason.
        Referenced Process

        :return: The referenced_processes of this LegalReason.
        :rtype: list[LegalReasonReferencedProcesses]
        """
        return self._referenced_processes

    @referenced_processes.setter
    def referenced_processes(self, referenced_processes):
        """
        Sets the referenced_processes of this LegalReason.
        Referenced Process

        :param referenced_processes: The referenced_processes of this LegalReason.
        :type: list[LegalReasonReferencedProcesses]
        """

        self._referenced_processes = referenced_processes

    @property
    def tax_scope(self):
        """
        Gets the tax_scope of this LegalReason.

        :return: The tax_scope of this LegalReason.
        :rtype: LegalReasonTaxScope
        """
        return self._tax_scope

    @tax_scope.setter
    def tax_scope(self, tax_scope):
        """
        Sets the tax_scope of this LegalReason.

        :param tax_scope: The tax_scope of this LegalReason.
        :type: LegalReasonTaxScope
        """

        self._tax_scope = tax_scope

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
