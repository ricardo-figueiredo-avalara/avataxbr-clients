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


class SalesHeaderOut(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, account_id=None, company_code=None, transaction_type=None, document_code=None, currency=None, transaction_date=None, tax_calculation_date=None, company_location=None, customer_code=None, purchase_order_number=None, rps_number=None, rps_serie='0', discrimination_in=None, entity=None, payment=None, taxes_config=None, default_locations=None, discrimination_out=None, xml=None, edi_sync_state=None):
        """
        SalesHeaderOut - a model defined in Swagger

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
            'customer_code': 'str',
            'purchase_order_number': 'str',
            'rps_number': 'int',
            'rps_serie': 'str',
            'discrimination_in': 'str',
            'entity': 'SalesEntity',
            'payment': 'SalesHeaderOutPayment',
            'taxes_config': 'SalesTaxesConfig',
            'default_locations': 'SalesDefaultLocations',
            'discrimination_out': 'str',
            'xml': 'str',
            'edi_sync_state': 'str'
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
            'customer_code': 'customerCode',
            'purchase_order_number': 'purchaseOrderNumber',
            'rps_number': 'rpsNumber',
            'rps_serie': 'rpsSerie',
            'discrimination_in': 'discriminationIn',
            'entity': 'entity',
            'payment': 'payment',
            'taxes_config': 'taxesConfig',
            'default_locations': 'defaultLocations',
            'discrimination_out': 'discriminationOut',
            'xml': 'xml',
            'edi_sync_state': 'ediSyncState'
        }

        self._account_id = account_id
        self._company_code = company_code
        self._transaction_type = transaction_type
        self._document_code = document_code
        self._currency = currency
        self._transaction_date = transaction_date
        self._tax_calculation_date = tax_calculation_date
        self._company_location = company_location
        self._customer_code = customer_code
        self._purchase_order_number = purchase_order_number
        self._rps_number = rps_number
        self._rps_serie = rps_serie
        self._discrimination_in = discrimination_in
        self._entity = entity
        self._payment = payment
        self._taxes_config = taxes_config
        self._default_locations = default_locations
        self._discrimination_out = discrimination_out
        self._xml = xml
        self._edi_sync_state = edi_sync_state

    @property
    def account_id(self):
        """
        Gets the account_id of this SalesHeaderOut.
        This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.

        :return: The account_id of this SalesHeaderOut.
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id):
        """
        Sets the account_id of this SalesHeaderOut.
        This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.

        :param account_id: The account_id of this SalesHeaderOut.
        :type: str
        """
        if account_id is None:
            raise ValueError("Invalid value for `account_id`, must not be `None`")

        self._account_id = account_id

    @property
    def company_code(self):
        """
        Gets the company_code of this SalesHeaderOut.
        This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company

        :return: The company_code of this SalesHeaderOut.
        :rtype: str
        """
        return self._company_code

    @company_code.setter
    def company_code(self, company_code):
        """
        Sets the company_code of this SalesHeaderOut.
        This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company

        :param company_code: The company_code of this SalesHeaderOut.
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
        Gets the transaction_type of this SalesHeaderOut.
        This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 

        :return: The transaction_type of this SalesHeaderOut.
        :rtype: str
        """
        return self._transaction_type

    @transaction_type.setter
    def transaction_type(self, transaction_type):
        """
        Sets the transaction_type of this SalesHeaderOut.
        This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 

        :param transaction_type: The transaction_type of this SalesHeaderOut.
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
        Gets the document_code of this SalesHeaderOut.
        This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored

        :return: The document_code of this SalesHeaderOut.
        :rtype: str
        """
        return self._document_code

    @document_code.setter
    def document_code(self, document_code):
        """
        Sets the document_code of this SalesHeaderOut.
        This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored

        :param document_code: The document_code of this SalesHeaderOut.
        :type: str
        """

        self._document_code = document_code

    @property
    def currency(self):
        """
        Gets the currency of this SalesHeaderOut.
        currency code / transactions must be in Brazilian Reais \"BRL\"

        :return: The currency of this SalesHeaderOut.
        :rtype: str
        """
        return self._currency

    @currency.setter
    def currency(self, currency):
        """
        Sets the currency of this SalesHeaderOut.
        currency code / transactions must be in Brazilian Reais \"BRL\"

        :param currency: The currency of this SalesHeaderOut.
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
        Gets the transaction_date of this SalesHeaderOut.
        This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)

        :return: The transaction_date of this SalesHeaderOut.
        :rtype: date
        """
        return self._transaction_date

    @transaction_date.setter
    def transaction_date(self, transaction_date):
        """
        Sets the transaction_date of this SalesHeaderOut.
        This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)

        :param transaction_date: The transaction_date of this SalesHeaderOut.
        :type: date
        """
        if transaction_date is None:
            raise ValueError("Invalid value for `transaction_date`, must not be `None`")

        self._transaction_date = transaction_date

    @property
    def tax_calculation_date(self):
        """
        Gets the tax_calculation_date of this SalesHeaderOut.
        accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.

        :return: The tax_calculation_date of this SalesHeaderOut.
        :rtype: date
        """
        return self._tax_calculation_date

    @tax_calculation_date.setter
    def tax_calculation_date(self, tax_calculation_date):
        """
        Sets the tax_calculation_date of this SalesHeaderOut.
        accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.

        :param tax_calculation_date: The tax_calculation_date of this SalesHeaderOut.
        :type: date
        """

        self._tax_calculation_date = tax_calculation_date

    @property
    def company_location(self):
        """
        Gets the company_location of this SalesHeaderOut.
        This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity

        :return: The company_location of this SalesHeaderOut.
        :rtype: str
        """
        return self._company_location

    @company_location.setter
    def company_location(self, company_location):
        """
        Sets the company_location of this SalesHeaderOut.
        This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity

        :param company_location: The company_location of this SalesHeaderOut.
        :type: str
        """
        if company_location is None:
            raise ValueError("Invalid value for `company_location`, must not be `None`")
        if company_location is not None and len(company_location) > 64:
            raise ValueError("Invalid value for `company_location`, length must be less than or equal to `64`")

        self._company_location = company_location

    @property
    def customer_code(self):
        """
        Gets the customer_code of this SalesHeaderOut.
        This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.

        :return: The customer_code of this SalesHeaderOut.
        :rtype: str
        """
        return self._customer_code

    @customer_code.setter
    def customer_code(self, customer_code):
        """
        Sets the customer_code of this SalesHeaderOut.
        This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.

        :param customer_code: The customer_code of this SalesHeaderOut.
        :type: str
        """
        if customer_code is None:
            raise ValueError("Invalid value for `customer_code`, must not be `None`")

        self._customer_code = customer_code

    @property
    def purchase_order_number(self):
        """
        Gets the purchase_order_number of this SalesHeaderOut.
        The number of Purchase Order

        :return: The purchase_order_number of this SalesHeaderOut.
        :rtype: str
        """
        return self._purchase_order_number

    @purchase_order_number.setter
    def purchase_order_number(self, purchase_order_number):
        """
        Sets the purchase_order_number of this SalesHeaderOut.
        The number of Purchase Order

        :param purchase_order_number: The purchase_order_number of this SalesHeaderOut.
        :type: str
        """

        self._purchase_order_number = purchase_order_number

    @property
    def rps_number(self):
        """
        Gets the rps_number of this SalesHeaderOut.
        Provisional receipt services, sequencial number maintained by the client application, unique by serie

        :return: The rps_number of this SalesHeaderOut.
        :rtype: int
        """
        return self._rps_number

    @rps_number.setter
    def rps_number(self, rps_number):
        """
        Sets the rps_number of this SalesHeaderOut.
        Provisional receipt services, sequencial number maintained by the client application, unique by serie

        :param rps_number: The rps_number of this SalesHeaderOut.
        :type: int
        """

        self._rps_number = rps_number

    @property
    def rps_serie(self):
        """
        Gets the rps_serie of this SalesHeaderOut.
        set name identifier for rps number sequency.

        :return: The rps_serie of this SalesHeaderOut.
        :rtype: str
        """
        return self._rps_serie

    @rps_serie.setter
    def rps_serie(self, rps_serie):
        """
        Sets the rps_serie of this SalesHeaderOut.
        set name identifier for rps number sequency.

        :param rps_serie: The rps_serie of this SalesHeaderOut.
        :type: str
        """

        self._rps_serie = rps_serie

    @property
    def discrimination_in(self):
        """
        Gets the discrimination_in of this SalesHeaderOut.
        Service discrimination, free description about service

        :return: The discrimination_in of this SalesHeaderOut.
        :rtype: str
        """
        return self._discrimination_in

    @discrimination_in.setter
    def discrimination_in(self, discrimination_in):
        """
        Sets the discrimination_in of this SalesHeaderOut.
        Service discrimination, free description about service

        :param discrimination_in: The discrimination_in of this SalesHeaderOut.
        :type: str
        """
        if discrimination_in is not None and len(discrimination_in) > 1000:
            raise ValueError("Invalid value for `discrimination_in`, length must be less than or equal to `1000`")
        if discrimination_in is not None and len(discrimination_in) < 1:
            raise ValueError("Invalid value for `discrimination_in`, length must be greater than or equal to `1`")

        self._discrimination_in = discrimination_in

    @property
    def entity(self):
        """
        Gets the entity of this SalesHeaderOut.

        :return: The entity of this SalesHeaderOut.
        :rtype: SalesEntity
        """
        return self._entity

    @entity.setter
    def entity(self, entity):
        """
        Sets the entity of this SalesHeaderOut.

        :param entity: The entity of this SalesHeaderOut.
        :type: SalesEntity
        """

        self._entity = entity

    @property
    def payment(self):
        """
        Gets the payment of this SalesHeaderOut.

        :return: The payment of this SalesHeaderOut.
        :rtype: SalesHeaderOutPayment
        """
        return self._payment

    @payment.setter
    def payment(self, payment):
        """
        Sets the payment of this SalesHeaderOut.

        :param payment: The payment of this SalesHeaderOut.
        :type: SalesHeaderOutPayment
        """

        self._payment = payment

    @property
    def taxes_config(self):
        """
        Gets the taxes_config of this SalesHeaderOut.

        :return: The taxes_config of this SalesHeaderOut.
        :rtype: SalesTaxesConfig
        """
        return self._taxes_config

    @taxes_config.setter
    def taxes_config(self, taxes_config):
        """
        Sets the taxes_config of this SalesHeaderOut.

        :param taxes_config: The taxes_config of this SalesHeaderOut.
        :type: SalesTaxesConfig
        """

        self._taxes_config = taxes_config

    @property
    def default_locations(self):
        """
        Gets the default_locations of this SalesHeaderOut.

        :return: The default_locations of this SalesHeaderOut.
        :rtype: SalesDefaultLocations
        """
        return self._default_locations

    @default_locations.setter
    def default_locations(self, default_locations):
        """
        Sets the default_locations of this SalesHeaderOut.

        :param default_locations: The default_locations of this SalesHeaderOut.
        :type: SalesDefaultLocations
        """

        self._default_locations = default_locations

    @property
    def discrimination_out(self):
        """
        Gets the discrimination_out of this SalesHeaderOut.
        Invoice discrimination, it is discriminationIn plus automatic messages

        :return: The discrimination_out of this SalesHeaderOut.
        :rtype: str
        """
        return self._discrimination_out

    @discrimination_out.setter
    def discrimination_out(self, discrimination_out):
        """
        Sets the discrimination_out of this SalesHeaderOut.
        Invoice discrimination, it is discriminationIn plus automatic messages

        :param discrimination_out: The discrimination_out of this SalesHeaderOut.
        :type: str
        """
        if discrimination_out is not None and len(discrimination_out) > 2000:
            raise ValueError("Invalid value for `discrimination_out`, length must be less than or equal to `2000`")
        if discrimination_out is not None and len(discrimination_out) < 1:
            raise ValueError("Invalid value for `discrimination_out`, length must be greater than or equal to `1`")

        self._discrimination_out = discrimination_out

    @property
    def xml(self):
        """
        Gets the xml of this SalesHeaderOut.
        RPS XML or NFSe XML generated, when the client system doesn't have EDI with government then BR16 return RPS when transaction is created.

        :return: The xml of this SalesHeaderOut.
        :rtype: str
        """
        return self._xml

    @xml.setter
    def xml(self, xml):
        """
        Sets the xml of this SalesHeaderOut.
        RPS XML or NFSe XML generated, when the client system doesn't have EDI with government then BR16 return RPS when transaction is created.

        :param xml: The xml of this SalesHeaderOut.
        :type: str
        """
        if xml is not None and len(xml) > 50000:
            raise ValueError("Invalid value for `xml`, length must be less than or equal to `50000`")

        self._xml = xml

    @property
    def edi_sync_state(self):
        """
        Gets the edi_sync_state of this SalesHeaderOut.
        Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' 

        :return: The edi_sync_state of this SalesHeaderOut.
        :rtype: str
        """
        return self._edi_sync_state

    @edi_sync_state.setter
    def edi_sync_state(self, edi_sync_state):
        """
        Sets the edi_sync_state of this SalesHeaderOut.
        Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' 

        :param edi_sync_state: The edi_sync_state of this SalesHeaderOut.
        :type: str
        """
        allowed_values = ["STORED", "WAITING APPROVAL", "AUTHORIZED", "AUTHORIZED with NOTE", "ERROR", "CANCELED REPLACED", "CANCELED", "CANCELLATION REQUESTED"]
        if edi_sync_state not in allowed_values:
            raise ValueError(
                "Invalid value for `edi_sync_state` ({0}), must be one of {1}"
                .format(edi_sync_state, allowed_values)
            )

        self._edi_sync_state = edi_sync_state

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