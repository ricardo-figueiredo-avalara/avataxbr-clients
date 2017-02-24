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


class PurchaseHeaderIn(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, account_id=None, company_code=None, transaction_type=None, document_code=None, currency=None, transaction_date=None, tax_calculation_date=None, company_location=None, vendor_code=None, purchase_order_number=None, entity=None, payment=None, taxes_config=None, default_locations=None):
        """
        PurchaseHeaderIn - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'account_id': 'str',
            'company_code': 'str',
            'transaction_type': 'str',
            'document_code': 'str',
            'currency': 'str',
            'transaction_date': 'date',
            'tax_calculation_date': 'date',
            'company_location': 'str',
            'vendor_code': 'str',
            'purchase_order_number': 'str',
            'entity': 'PurchaseEntity',
            'payment': 'PurchaseHeaderInPayment',
            'taxes_config': 'PurchaseTaxesConfig',
            'default_locations': 'PurchaseDefaultLocations'
        }

        self.attribute_map = {
            'account_id': 'accountId',
            'company_code': 'companyCode',
            'transaction_type': 'transactionType',
            'document_code': 'documentCode',
            'currency': 'currency',
            'transaction_date': 'transactionDate',
            'tax_calculation_date': 'taxCalculationDate',
            'company_location': 'companyLocation',
            'vendor_code': 'vendorCode',
            'purchase_order_number': 'purchaseOrderNumber',
            'entity': 'entity',
            'payment': 'payment',
            'taxes_config': 'taxesConfig',
            'default_locations': 'defaultLocations'
        }

        self._account_id = account_id
        self._company_code = company_code
        self._transaction_type = transaction_type
        self._document_code = document_code
        self._currency = currency
        self._transaction_date = transaction_date
        self._tax_calculation_date = tax_calculation_date
        self._company_location = company_location
        self._vendor_code = vendor_code
        self._purchase_order_number = purchase_order_number
        self._entity = entity
        self._payment = payment
        self._taxes_config = taxes_config
        self._default_locations = default_locations

    @property
    def account_id(self):
        """
        Gets the account_id of this PurchaseHeaderIn.
        This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.

        :return: The account_id of this PurchaseHeaderIn.
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """
        Sets the account_id of this PurchaseHeaderIn.
        This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.

        :param account_id: The account_id of this PurchaseHeaderIn.
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")

        self._account_id = account_id

    @property
    def company_code(self):
        """
        Gets the company_code of this PurchaseHeaderIn.
        This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company

        :return: The company_code of this PurchaseHeaderIn.
        :rtype: str
        """
        return self._company_code

    @company_code.setter
    def company_code(self, company_code):
        """
        Sets the company_code of this PurchaseHeaderIn.
        This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company

        :param company_code: The company_code of this PurchaseHeaderIn.
        :type: str
        """
        if company_code is None:
            raise ValueError("Invalid value for `company_code`, must not be `None`")
        if company_code is not None and len(company_code) > 60:
            raise ValueError("Invalid value for `company_code`, length must be less than or equal to `60`")

        self._company_code = company_code

    @property
    def transaction_type(self):
        """
        Gets the transaction_type of this PurchaseHeaderIn.
        This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 

        :return: The transaction_type of this PurchaseHeaderIn.
        :rtype: str
        """
        return self._transaction_type

    @transaction_type.setter
    def transaction_type(self, transaction_type):
        """
        Sets the transaction_type of this PurchaseHeaderIn.
        This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 

        :param transaction_type: The transaction_type of this PurchaseHeaderIn.
        :type: str
        """
        allowed_values = ["Sale", "Purchase", "Payment", "Receipt"]
        if transaction_type not in allowed_values:
            raise ValueError(
                "Invalid value for `transaction_type` ({0}), must be one of {1}"
                .format(transaction_type, allowed_values)
            )

        self._transaction_type = transaction_type

    @property
    def document_code(self):
        """
        Gets the document_code of this PurchaseHeaderIn.
        This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored

        :return: The document_code of this PurchaseHeaderIn.
        :rtype: str
        """
        return self._document_code

    @document_code.setter
    def document_code(self, document_code):
        """
        Sets the document_code of this PurchaseHeaderIn.
        This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored

        :param document_code: The document_code of this PurchaseHeaderIn.
        :type: str
        """

        self._document_code = document_code

    @property
    def currency(self):
        """
        Gets the currency of this PurchaseHeaderIn.
        currency code / transactions must be in Brazilian Reais \"BRL\"

        :return: The currency of this PurchaseHeaderIn.
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """
        Sets the currency of this PurchaseHeaderIn.
        currency code / transactions must be in Brazilian Reais \"BRL\"

        :param currency: The currency of this PurchaseHeaderIn.
        :type: str
        """
        allowed_values = ["BRL"]
        if currency not in allowed_values:
            raise ValueError(
                "Invalid value for `currency` ({0}), must be one of {1}"
                .format(currency, allowed_values)
            )

        self._currency = currency

    @property
    def transaction_date(self):
        """
        Gets the transaction_date of this PurchaseHeaderIn.
        This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)

        :return: The transaction_date of this PurchaseHeaderIn.
        :rtype: date
        """
        return self._transaction_date

    @transaction_date.setter
    def transaction_date(self, transaction_date):
        """
        Sets the transaction_date of this PurchaseHeaderIn.
        This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)

        :param transaction_date: The transaction_date of this PurchaseHeaderIn.
        :type: date
        """
        if transaction_date is None:
            raise ValueError("Invalid value for `transaction_date`, must not be `None`")

        self._transaction_date = transaction_date

    @property
    def tax_calculation_date(self):
        """
        Gets the tax_calculation_date of this PurchaseHeaderIn.
        accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.

        :return: The tax_calculation_date of this PurchaseHeaderIn.
        :rtype: date
        """
        return self._tax_calculation_date

    @tax_calculation_date.setter
    def tax_calculation_date(self, tax_calculation_date):
        """
        Sets the tax_calculation_date of this PurchaseHeaderIn.
        accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.

        :param tax_calculation_date: The tax_calculation_date of this PurchaseHeaderIn.
        :type: date
        """

        self._tax_calculation_date = tax_calculation_date

    @property
    def company_location(self):
        """
        Gets the company_location of this PurchaseHeaderIn.
        This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity

        :return: The company_location of this PurchaseHeaderIn.
        :rtype: str
        """
        return self._company_location

    @company_location.setter
    def company_location(self, company_location):
        """
        Sets the company_location of this PurchaseHeaderIn.
        This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity

        :param company_location: The company_location of this PurchaseHeaderIn.
        :type: str
        """
        if company_location is None:
            raise ValueError("Invalid value for `company_location`, must not be `None`")
        if company_location is not None and len(company_location) > 64:
            raise ValueError("Invalid value for `company_location`, length must be less than or equal to `64`")

        self._company_location = company_location

    @property
    def vendor_code(self):
        """
        Gets the vendor_code of this PurchaseHeaderIn.
        This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.

        :return: The vendor_code of this PurchaseHeaderIn.
        :rtype: str
        """
        return self._vendor_code

    @vendor_code.setter
    def vendor_code(self, vendor_code):
        """
        Sets the vendor_code of this PurchaseHeaderIn.
        This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.

        :param vendor_code: The vendor_code of this PurchaseHeaderIn.
        :type: str
        """
        if vendor_code is None:
            raise ValueError("Invalid value for `vendor_code`, must not be `None`")

        self._vendor_code = vendor_code

    @property
    def purchase_order_number(self):
        """
        Gets the purchase_order_number of this PurchaseHeaderIn.
        The number of Purchase Order

        :return: The purchase_order_number of this PurchaseHeaderIn.
        :rtype: str
        """
        return self._purchase_order_number

    @purchase_order_number.setter
    def purchase_order_number(self, purchase_order_number):
        """
        Sets the purchase_order_number of this PurchaseHeaderIn.
        The number of Purchase Order

        :param purchase_order_number: The purchase_order_number of this PurchaseHeaderIn.
        :type: str
        """

        self._purchase_order_number = purchase_order_number

    @property
    def entity(self):
        """
        Gets the entity of this PurchaseHeaderIn.

        :return: The entity of this PurchaseHeaderIn.
        :rtype: PurchaseEntity
        """
        return self._entity

    @entity.setter
    def entity(self, entity):
        """
        Sets the entity of this PurchaseHeaderIn.

        :param entity: The entity of this PurchaseHeaderIn.
        :type: PurchaseEntity
        """

        self._entity = entity

    @property
    def payment(self):
        """
        Gets the payment of this PurchaseHeaderIn.

        :return: The payment of this PurchaseHeaderIn.
        :rtype: PurchaseHeaderInPayment
        """
        return self._payment

    @payment.setter
    def payment(self, payment):
        """
        Sets the payment of this PurchaseHeaderIn.

        :param payment: The payment of this PurchaseHeaderIn.
        :type: PurchaseHeaderInPayment
        """

        self._payment = payment

    @property
    def taxes_config(self):
        """
        Gets the taxes_config of this PurchaseHeaderIn.

        :return: The taxes_config of this PurchaseHeaderIn.
        :rtype: PurchaseTaxesConfig
        """
        return self._taxes_config

    @taxes_config.setter
    def taxes_config(self, taxes_config):
        """
        Sets the taxes_config of this PurchaseHeaderIn.

        :param taxes_config: The taxes_config of this PurchaseHeaderIn.
        :type: PurchaseTaxesConfig
        """

        self._taxes_config = taxes_config

    @property
    def default_locations(self):
        """
        Gets the default_locations of this PurchaseHeaderIn.

        :return: The default_locations of this PurchaseHeaderIn.
        :rtype: PurchaseDefaultLocations
        """
        return self._default_locations

    @default_locations.setter
    def default_locations(self, default_locations):
        """
        Sets the default_locations of this PurchaseHeaderIn.

        :param default_locations: The default_locations of this PurchaseHeaderIn.
        :type: PurchaseDefaultLocations
        """

        self._default_locations = default_locations

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
