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


class CfopConf(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, code=None, stock_impact=None, financial_impact=None, cst_ipi=None, ipi_legal_tax_class=None, accruable_pis_taxation=None, pis_exempt_legal_reason_code=None, pis_exempt_legal_reason=None, accruable_cofins_taxation=None, cofins_exempt_legal_reason_code=None, cofins_exempt_legal_reason=None, allow_ip_icredit_when_in_going=None, icms_conf=None, name=None, description=None, way_type=None, cod_in_state=None, cod_other_state=None, cod_other_country=None, cst_icms_same_state=None, cst_icms_other_state=None, cst_icms_other_country=None, product_type=None, operation_to_tax_payer_other_state=None, operation_with_st=None, operation_to_free_zone=None, specific_for_product_class=None):
        """
        CfopConf - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'code': 'str',
            'stock_impact': 'bool',
            'financial_impact': 'bool',
            'cst_ipi': 'str',
            'ipi_legal_tax_class': 'str',
            'accruable_pis_taxation': 'str',
            'pis_exempt_legal_reason_code': 'str',
            'pis_exempt_legal_reason': 'str',
            'accruable_cofins_taxation': 'str',
            'cofins_exempt_legal_reason_code': 'str',
            'cofins_exempt_legal_reason': 'str',
            'allow_ip_icredit_when_in_going': 'bool',
            'icms_conf': 'list[IcmsTaxConf]',
            'name': 'str',
            'description': 'str',
            'way_type': 'str',
            'cod_in_state': 'int',
            'cod_other_state': 'int',
            'cod_other_country': 'int',
            'cst_icms_same_state': 'CstIcmsEnum',
            'cst_icms_other_state': 'CstIcmsEnum',
            'cst_icms_other_country': 'CstIcmsEnum',
            'product_type': 'str',
            'operation_to_tax_payer_other_state': 'bool',
            'operation_with_st': 'bool',
            'operation_to_free_zone': 'bool',
            'specific_for_product_class': 'str'
        }

        self.attribute_map = {
            'code': 'code',
            'stock_impact': 'stockImpact',
            'financial_impact': 'financialImpact',
            'cst_ipi': 'cstIPI',
            'ipi_legal_tax_class': 'ipiLegalTaxClass',
            'accruable_pis_taxation': 'accruablePISTaxation',
            'pis_exempt_legal_reason_code': 'pisExemptLegalReasonCode',
            'pis_exempt_legal_reason': 'pisExemptLegalReason',
            'accruable_cofins_taxation': 'accruableCOFINSTaxation',
            'cofins_exempt_legal_reason_code': 'cofinsExemptLegalReasonCode',
            'cofins_exempt_legal_reason': 'cofinsExemptLegalReason',
            'allow_ip_icredit_when_in_going': 'allowIPIcreditWhenInGoing',
            'icms_conf': 'icmsConf',
            'name': 'name',
            'description': 'description',
            'way_type': 'wayType',
            'cod_in_state': 'codInState',
            'cod_other_state': 'codOtherState',
            'cod_other_country': 'codOtherCountry',
            'cst_icms_same_state': 'cstICMSSameState',
            'cst_icms_other_state': 'cstICMSOtherState',
            'cst_icms_other_country': 'cstICMSOtherCountry',
            'product_type': 'productType',
            'operation_to_tax_payer_other_state': 'operationToTaxPayerOtherState',
            'operation_with_st': 'operationWithST',
            'operation_to_free_zone': 'operationToFreeZone',
            'specific_for_product_class': 'specificForProductClass'
        }

        self._code = code
        self._stock_impact = stock_impact
        self._financial_impact = financial_impact
        self._cst_ipi = cst_ipi
        self._ipi_legal_tax_class = ipi_legal_tax_class
        self._accruable_pis_taxation = accruable_pis_taxation
        self._pis_exempt_legal_reason_code = pis_exempt_legal_reason_code
        self._pis_exempt_legal_reason = pis_exempt_legal_reason
        self._accruable_cofins_taxation = accruable_cofins_taxation
        self._cofins_exempt_legal_reason_code = cofins_exempt_legal_reason_code
        self._cofins_exempt_legal_reason = cofins_exempt_legal_reason
        self._allow_ip_icredit_when_in_going = allow_ip_icredit_when_in_going
        self._icms_conf = icms_conf
        self._name = name
        self._description = description
        self._way_type = way_type
        self._cod_in_state = cod_in_state
        self._cod_other_state = cod_other_state
        self._cod_other_country = cod_other_country
        self._cst_icms_same_state = cst_icms_same_state
        self._cst_icms_other_state = cst_icms_other_state
        self._cst_icms_other_country = cst_icms_other_country
        self._product_type = product_type
        self._operation_to_tax_payer_other_state = operation_to_tax_payer_other_state
        self._operation_with_st = operation_with_st
        self._operation_to_free_zone = operation_to_free_zone
        self._specific_for_product_class = specific_for_product_class

    @property
    def code(self):
        """
        Gets the code of this CfopConf.
        main unique identificator

        :return: The code of this CfopConf.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this CfopConf.
        main unique identificator

        :param code: The code of this CfopConf.
        :type: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")
        if code is not None and len(code) > 40:
            raise ValueError("Invalid value for `code`, length must be less than or equal to `40`")

        self._code = code

    @property
    def stock_impact(self):
        """
        Gets the stock_impact of this CfopConf.
        Inform that the process has inventory impact.

        :return: The stock_impact of this CfopConf.
        :rtype: bool
        """
        return self._stock_impact

    @stock_impact.setter
    def stock_impact(self, stock_impact):
        """
        Sets the stock_impact of this CfopConf.
        Inform that the process has inventory impact.

        :param stock_impact: The stock_impact of this CfopConf.
        :type: bool
        """

        self._stock_impact = stock_impact

    @property
    def financial_impact(self):
        """
        Gets the financial_impact of this CfopConf.
        Inform that the process has financial impact.

        :return: The financial_impact of this CfopConf.
        :rtype: bool
        """
        return self._financial_impact

    @financial_impact.setter
    def financial_impact(self, financial_impact):
        """
        Sets the financial_impact of this CfopConf.
        Inform that the process has financial impact.

        :param financial_impact: The financial_impact of this CfopConf.
        :type: bool
        """

        self._financial_impact = financial_impact

    @property
    def cst_ipi(self):
        """
        Gets the cst_ipi of this CfopConf.
        Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 

        :return: The cst_ipi of this CfopConf.
        :rtype: str
        """
        return self._cst_ipi

    @cst_ipi.setter
    def cst_ipi(self, cst_ipi):
        """
        Sets the cst_ipi of this CfopConf.
        Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune 

        :param cst_ipi: The cst_ipi of this CfopConf.
        :type: str
        """
        allowed_values = ["50", "51", "52", "53", "54"]
        if cst_ipi not in allowed_values:
            raise ValueError(
                "Invalid value for `cst_ipi` ({0}), must be one of {1}"
                .format(cst_ipi, allowed_values)
            )

        self._cst_ipi = cst_ipi

    @property
    def ipi_legal_tax_class(self):
        """
        Gets the ipi_legal_tax_class of this CfopConf.
        Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 

        :return: The ipi_legal_tax_class of this CfopConf.
        :rtype: str
        """
        return self._ipi_legal_tax_class

    @ipi_legal_tax_class.setter
    def ipi_legal_tax_class(self, ipi_legal_tax_class):
        """
        Sets the ipi_legal_tax_class of this CfopConf.
        Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 

        :param ipi_legal_tax_class: The ipi_legal_tax_class of this CfopConf.
        :type: str
        """

        self._ipi_legal_tax_class = ipi_legal_tax_class

    @property
    def accruable_pis_taxation(self):
        """
        Gets the accruable_pis_taxation of this CfopConf.
        Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 

        :return: The accruable_pis_taxation of this CfopConf.
        :rtype: str
        """
        return self._accruable_pis_taxation

    @accruable_pis_taxation.setter
    def accruable_pis_taxation(self, accruable_pis_taxation):
        """
        Sets the accruable_pis_taxation of this CfopConf.
        Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 

        :param accruable_pis_taxation: The accruable_pis_taxation of this CfopConf.
        :type: str
        """
        allowed_values = ["T", "Z", "E", "H", "N"]
        if accruable_pis_taxation not in allowed_values:
            raise ValueError(
                "Invalid value for `accruable_pis_taxation` ({0}), must be one of {1}"
                .format(accruable_pis_taxation, allowed_values)
            )

        self._accruable_pis_taxation = accruable_pis_taxation

    @property
    def pis_exempt_legal_reason_code(self):
        """
        Gets the pis_exempt_legal_reason_code of this CfopConf.
        When exempt, taxable with zero, suspended, not taxable, this field holds the official code number

        :return: The pis_exempt_legal_reason_code of this CfopConf.
        :rtype: str
        """
        return self._pis_exempt_legal_reason_code

    @pis_exempt_legal_reason_code.setter
    def pis_exempt_legal_reason_code(self, pis_exempt_legal_reason_code):
        """
        Sets the pis_exempt_legal_reason_code of this CfopConf.
        When exempt, taxable with zero, suspended, not taxable, this field holds the official code number

        :param pis_exempt_legal_reason_code: The pis_exempt_legal_reason_code of this CfopConf.
        :type: str
        """
        if pis_exempt_legal_reason_code is not None and len(pis_exempt_legal_reason_code) > 3:
            raise ValueError("Invalid value for `pis_exempt_legal_reason_code`, length must be less than or equal to `3`")

        self._pis_exempt_legal_reason_code = pis_exempt_legal_reason_code

    @property
    def pis_exempt_legal_reason(self):
        """
        Gets the pis_exempt_legal_reason of this CfopConf.
        When specifi reason, this field has the description

        :return: The pis_exempt_legal_reason of this CfopConf.
        :rtype: str
        """
        return self._pis_exempt_legal_reason

    @pis_exempt_legal_reason.setter
    def pis_exempt_legal_reason(self, pis_exempt_legal_reason):
        """
        Sets the pis_exempt_legal_reason of this CfopConf.
        When specifi reason, this field has the description

        :param pis_exempt_legal_reason: The pis_exempt_legal_reason of this CfopConf.
        :type: str
        """
        if pis_exempt_legal_reason is not None and len(pis_exempt_legal_reason) > 1024:
            raise ValueError("Invalid value for `pis_exempt_legal_reason`, length must be less than or equal to `1024`")

        self._pis_exempt_legal_reason = pis_exempt_legal_reason

    @property
    def accruable_cofins_taxation(self):
        """
        Gets the accruable_cofins_taxation of this CfopConf.
        Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 

        :return: The accruable_cofins_taxation of this CfopConf.
        :rtype: str
        """
        return self._accruable_cofins_taxation

    @accruable_cofins_taxation.setter
    def accruable_cofins_taxation(self, accruable_cofins_taxation):
        """
        Sets the accruable_cofins_taxation of this CfopConf.
        Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 

        :param accruable_cofins_taxation: The accruable_cofins_taxation of this CfopConf.
        :type: str
        """
        allowed_values = ["T", "Z", "E", "H", "N"]
        if accruable_cofins_taxation not in allowed_values:
            raise ValueError(
                "Invalid value for `accruable_cofins_taxation` ({0}), must be one of {1}"
                .format(accruable_cofins_taxation, allowed_values)
            )

        self._accruable_cofins_taxation = accruable_cofins_taxation

    @property
    def cofins_exempt_legal_reason_code(self):
        """
        Gets the cofins_exempt_legal_reason_code of this CfopConf.
        When exempt, taxable with zero, suspended, not taxable, this field holds the official code number

        :return: The cofins_exempt_legal_reason_code of this CfopConf.
        :rtype: str
        """
        return self._cofins_exempt_legal_reason_code

    @cofins_exempt_legal_reason_code.setter
    def cofins_exempt_legal_reason_code(self, cofins_exempt_legal_reason_code):
        """
        Sets the cofins_exempt_legal_reason_code of this CfopConf.
        When exempt, taxable with zero, suspended, not taxable, this field holds the official code number

        :param cofins_exempt_legal_reason_code: The cofins_exempt_legal_reason_code of this CfopConf.
        :type: str
        """
        if cofins_exempt_legal_reason_code is not None and len(cofins_exempt_legal_reason_code) > 3:
            raise ValueError("Invalid value for `cofins_exempt_legal_reason_code`, length must be less than or equal to `3`")

        self._cofins_exempt_legal_reason_code = cofins_exempt_legal_reason_code

    @property
    def cofins_exempt_legal_reason(self):
        """
        Gets the cofins_exempt_legal_reason of this CfopConf.
        When specifi reason, this field has the description

        :return: The cofins_exempt_legal_reason of this CfopConf.
        :rtype: str
        """
        return self._cofins_exempt_legal_reason

    @cofins_exempt_legal_reason.setter
    def cofins_exempt_legal_reason(self, cofins_exempt_legal_reason):
        """
        Sets the cofins_exempt_legal_reason of this CfopConf.
        When specifi reason, this field has the description

        :param cofins_exempt_legal_reason: The cofins_exempt_legal_reason of this CfopConf.
        :type: str
        """
        if cofins_exempt_legal_reason is not None and len(cofins_exempt_legal_reason) > 1024:
            raise ValueError("Invalid value for `cofins_exempt_legal_reason`, length must be less than or equal to `1024`")

        self._cofins_exempt_legal_reason = cofins_exempt_legal_reason

    @property
    def allow_ip_icredit_when_in_going(self):
        """
        Gets the allow_ip_icredit_when_in_going of this CfopConf.
        Inform that the process allow IPI credit to Input process

        :return: The allow_ip_icredit_when_in_going of this CfopConf.
        :rtype: bool
        """
        return self._allow_ip_icredit_when_in_going

    @allow_ip_icredit_when_in_going.setter
    def allow_ip_icredit_when_in_going(self, allow_ip_icredit_when_in_going):
        """
        Sets the allow_ip_icredit_when_in_going of this CfopConf.
        Inform that the process allow IPI credit to Input process

        :param allow_ip_icredit_when_in_going: The allow_ip_icredit_when_in_going of this CfopConf.
        :type: bool
        """

        self._allow_ip_icredit_when_in_going = allow_ip_icredit_when_in_going

    @property
    def icms_conf(self):
        """
        Gets the icms_conf of this CfopConf.
        the map key is state code

        :return: The icms_conf of this CfopConf.
        :rtype: list[IcmsTaxConf]
        """
        return self._icms_conf

    @icms_conf.setter
    def icms_conf(self, icms_conf):
        """
        Sets the icms_conf of this CfopConf.
        the map key is state code

        :param icms_conf: The icms_conf of this CfopConf.
        :type: list[IcmsTaxConf]
        """

        self._icms_conf = icms_conf

    @property
    def name(self):
        """
        Gets the name of this CfopConf.

        :return: The name of this CfopConf.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CfopConf.

        :param name: The name of this CfopConf.
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")
        if name is not None and len(name) > 60:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `60`")

        self._name = name

    @property
    def description(self):
        """
        Gets the description of this CfopConf.

        :return: The description of this CfopConf.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CfopConf.

        :param description: The description of this CfopConf.
        :type: str
        """
        if description is not None and len(description) > 512:
            raise ValueError("Invalid value for `description`, length must be less than or equal to `512`")

        self._description = description

    @property
    def way_type(self):
        """
        Gets the way_type of this CfopConf.
        inform if the transaction is an operation to internalizing item or value

        :return: The way_type of this CfopConf.
        :rtype: str
        """
        return self._way_type

    @way_type.setter
    def way_type(self, way_type):
        """
        Sets the way_type of this CfopConf.
        inform if the transaction is an operation to internalizing item or value

        :param way_type: The way_type of this CfopConf.
        :type: str
        """
        allowed_values = ["in", "out"]
        if way_type not in allowed_values:
            raise ValueError(
                "Invalid value for `way_type` ({0}), must be one of {1}"
                .format(way_type, allowed_values)
            )

        self._way_type = way_type

    @property
    def cod_in_state(self):
        """
        Gets the cod_in_state of this CfopConf.
        CFOP code (tax code operation) when the transactions are within the same state.

        :return: The cod_in_state of this CfopConf.
        :rtype: int
        """
        return self._cod_in_state

    @cod_in_state.setter
    def cod_in_state(self, cod_in_state):
        """
        Sets the cod_in_state of this CfopConf.
        CFOP code (tax code operation) when the transactions are within the same state.

        :param cod_in_state: The cod_in_state of this CfopConf.
        :type: int
        """

        self._cod_in_state = cod_in_state

    @property
    def cod_other_state(self):
        """
        Gets the cod_other_state of this CfopConf.
        CFOP code (tax code operation) when the transactions are to another state.

        :return: The cod_other_state of this CfopConf.
        :rtype: int
        """
        return self._cod_other_state

    @cod_other_state.setter
    def cod_other_state(self, cod_other_state):
        """
        Sets the cod_other_state of this CfopConf.
        CFOP code (tax code operation) when the transactions are to another state.

        :param cod_other_state: The cod_other_state of this CfopConf.
        :type: int
        """

        self._cod_other_state = cod_other_state

    @property
    def cod_other_country(self):
        """
        Gets the cod_other_country of this CfopConf.
        CFOP code (tax code operation) when the transactions are to another country.

        :return: The cod_other_country of this CfopConf.
        :rtype: int
        """
        return self._cod_other_country

    @cod_other_country.setter
    def cod_other_country(self, cod_other_country):
        """
        Sets the cod_other_country of this CfopConf.
        CFOP code (tax code operation) when the transactions are to another country.

        :param cod_other_country: The cod_other_country of this CfopConf.
        :type: int
        """

        self._cod_other_country = cod_other_country

    @property
    def cst_icms_same_state(self):
        """
        Gets the cst_icms_same_state of this CfopConf.

        :return: The cst_icms_same_state of this CfopConf.
        :rtype: CstIcmsEnum
        """
        return self._cst_icms_same_state

    @cst_icms_same_state.setter
    def cst_icms_same_state(self, cst_icms_same_state):
        """
        Sets the cst_icms_same_state of this CfopConf.

        :param cst_icms_same_state: The cst_icms_same_state of this CfopConf.
        :type: CstIcmsEnum
        """

        self._cst_icms_same_state = cst_icms_same_state

    @property
    def cst_icms_other_state(self):
        """
        Gets the cst_icms_other_state of this CfopConf.

        :return: The cst_icms_other_state of this CfopConf.
        :rtype: CstIcmsEnum
        """
        return self._cst_icms_other_state

    @cst_icms_other_state.setter
    def cst_icms_other_state(self, cst_icms_other_state):
        """
        Sets the cst_icms_other_state of this CfopConf.

        :param cst_icms_other_state: The cst_icms_other_state of this CfopConf.
        :type: CstIcmsEnum
        """

        self._cst_icms_other_state = cst_icms_other_state

    @property
    def cst_icms_other_country(self):
        """
        Gets the cst_icms_other_country of this CfopConf.

        :return: The cst_icms_other_country of this CfopConf.
        :rtype: CstIcmsEnum
        """
        return self._cst_icms_other_country

    @cst_icms_other_country.setter
    def cst_icms_other_country(self, cst_icms_other_country):
        """
        Sets the cst_icms_other_country of this CfopConf.

        :param cst_icms_other_country: The cst_icms_other_country of this CfopConf.
        :type: CstIcmsEnum
        """

        self._cst_icms_other_country = cst_icms_other_country

    @property
    def product_type(self):
        """
        Gets the product_type of this CfopConf.
        this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic

        :return: The product_type of this CfopConf.
        :rtype: str
        """
        return self._product_type

    @product_type.setter
    def product_type(self, product_type):
        """
        Sets the product_type of this CfopConf.
        this field is used to define right CFOP, one operation type can be specialized to item product, item merchandise or generic

        :param product_type: The product_type of this CfopConf.
        :type: str
        """
        allowed_values = ["FOR PRODUCT", "FOR MERCHANDISE", "NO RESTRICTION"]
        if product_type not in allowed_values:
            raise ValueError(
                "Invalid value for `product_type` ({0}), must be one of {1}"
                .format(product_type, allowed_values)
            )

        self._product_type = product_type

    @property
    def operation_to_tax_payer_other_state(self):
        """
        Gets the operation_to_tax_payer_other_state of this CfopConf.
        field used to indicate an operation to ICMS tax payer

        :return: The operation_to_tax_payer_other_state of this CfopConf.
        :rtype: bool
        """
        return self._operation_to_tax_payer_other_state

    @operation_to_tax_payer_other_state.setter
    def operation_to_tax_payer_other_state(self, operation_to_tax_payer_other_state):
        """
        Sets the operation_to_tax_payer_other_state of this CfopConf.
        field used to indicate an operation to ICMS tax payer

        :param operation_to_tax_payer_other_state: The operation_to_tax_payer_other_state of this CfopConf.
        :type: bool
        """

        self._operation_to_tax_payer_other_state = operation_to_tax_payer_other_state

    @property
    def operation_with_st(self):
        """
        Gets the operation_with_st of this CfopConf.
        field used to indicate an operation to items sibject to ICMS-ST

        :return: The operation_with_st of this CfopConf.
        :rtype: bool
        """
        return self._operation_with_st

    @operation_with_st.setter
    def operation_with_st(self, operation_with_st):
        """
        Sets the operation_with_st of this CfopConf.
        field used to indicate an operation to items sibject to ICMS-ST

        :param operation_with_st: The operation_with_st of this CfopConf.
        :type: bool
        """

        self._operation_with_st = operation_with_st

    @property
    def operation_to_free_zone(self):
        """
        Gets the operation_to_free_zone of this CfopConf.
        field used to indicate an operation to free zone

        :return: The operation_to_free_zone of this CfopConf.
        :rtype: bool
        """
        return self._operation_to_free_zone

    @operation_to_free_zone.setter
    def operation_to_free_zone(self, operation_to_free_zone):
        """
        Sets the operation_to_free_zone of this CfopConf.
        field used to indicate an operation to free zone

        :param operation_to_free_zone: The operation_to_free_zone of this CfopConf.
        :type: bool
        """

        self._operation_to_free_zone = operation_to_free_zone

    @property
    def specific_for_product_class(self):
        """
        Gets the specific_for_product_class of this CfopConf.
        field used to indicate an operation to some product class specifically

        :return: The specific_for_product_class of this CfopConf.
        :rtype: str
        """
        return self._specific_for_product_class

    @specific_for_product_class.setter
    def specific_for_product_class(self, specific_for_product_class):
        """
        Sets the specific_for_product_class of this CfopConf.
        field used to indicate an operation to some product class specifically

        :param specific_for_product_class: The specific_for_product_class of this CfopConf.
        :type: str
        """
        allowed_values = ["OTHERS", "COMMUNICATION", "ENERGY", "TRANSPORT", "FUEL AND LUBRIFICANT", "VEHICLE", "ALCOHOLIC BEVERAGES", "WEAPONS", "AMMO", "PERFUM", "TOBACCO"]
        if specific_for_product_class not in allowed_values:
            raise ValueError(
                "Invalid value for `specific_for_product_class` ({0}), must be one of {1}"
                .format(specific_for_product_class, allowed_values)
            )

        self._specific_for_product_class = specific_for_product_class

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