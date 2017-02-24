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


class CustomProcessScenario(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, code=None, stock_impact=None, financial_impact=None, cst_ipi=None, ipi_legal_tax_class=None, accruable_pis_taxation=None, pis_exempt_legal_reason_code=None, pis_exempt_legal_reason=None, accruable_cofins_taxation=None, cofins_exempt_legal_reason_code=None, cofins_exempt_legal_reason=None, allow_ip_icredit_when_in_going=None, icms_conf=None, name=None, type=None, way_type=None, goal=None, over_write_cfop=None, cfops=None, company_id=None):
        """
        CustomProcessScenario - a model defined in Swagger

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
            'type': 'str',
            'way_type': 'str',
            'goal': 'str',
            'over_write_cfop': 'bool',
            'cfops': 'list[CfopConf]',
            'company_id': 'str'
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
            'type': 'type',
            'way_type': 'wayType',
            'goal': 'goal',
            'over_write_cfop': 'overWriteCFOP',
            'cfops': 'cfops',
            'company_id': 'companyId'
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
        self._type = type
        self._way_type = way_type
        self._goal = goal
        self._over_write_cfop = over_write_cfop
        self._cfops = cfops
        self._company_id = company_id

    @property
    def code(self):
        """
        Gets the code of this CustomProcessScenario.
        Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.

        :return: The code of this CustomProcessScenario.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this CustomProcessScenario.
        Process code to Identify this configuration, its is unique by Accounty Id or when standard, its has priority when the code match with the standard code.

        :param code: The code of this CustomProcessScenario.
        :type: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")
        if code is not None and len(code) > 60:
            raise ValueError("Invalid value for `code`, length must be less than or equal to `60`")

        self._code = code

    @property
    def stock_impact(self):
        """
        Gets the stock_impact of this CustomProcessScenario.
        Inform that the process has inventory impact.

        :return: The stock_impact of this CustomProcessScenario.
        :rtype: bool
        """
        return self._stock_impact

    @stock_impact.setter
    def stock_impact(self, stock_impact):
        """
        Sets the stock_impact of this CustomProcessScenario.
        Inform that the process has inventory impact.

        :param stock_impact: The stock_impact of this CustomProcessScenario.
        :type: bool
        """

        self._stock_impact = stock_impact

    @property
    def financial_impact(self):
        """
        Gets the financial_impact of this CustomProcessScenario.
        Inform that the process has financial impact.

        :return: The financial_impact of this CustomProcessScenario.
        :rtype: bool
        """
        return self._financial_impact

    @financial_impact.setter
    def financial_impact(self, financial_impact):
        """
        Sets the financial_impact of this CustomProcessScenario.
        Inform that the process has financial impact.

        :param financial_impact: The financial_impact of this CustomProcessScenario.
        :type: bool
        """

        self._financial_impact = financial_impact

    @property
    def cst_ipi(self):
        """
        Gets the cst_ipi of this CustomProcessScenario.
        Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 

        :return: The cst_ipi of this CustomProcessScenario.
        :rtype: str
        """
        return self._cst_ipi

    @cst_ipi.setter
    def cst_ipi(self, cst_ipi):
        """
        Sets the cst_ipi of this CustomProcessScenario.
        Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'I'  # IMMUNE - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 

        :param cst_ipi: The cst_ipi of this CustomProcessScenario.
        :type: str
        """
        allowed_values = ["T", "Z", "E", "H", "N", "I", "O", "OZ"]
        if cst_ipi not in allowed_values:
            raise ValueError(
                "Invalid value for `cst_ipi` ({0}), must be one of {1}"
                .format(cst_ipi, allowed_values)
            )

        self._cst_ipi = cst_ipi

    @property
    def ipi_legal_tax_class(self):
        """
        Gets the ipi_legal_tax_class of this CustomProcessScenario.
        Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 

        :return: The ipi_legal_tax_class of this CustomProcessScenario.
        :rtype: str
        """
        return self._ipi_legal_tax_class

    @ipi_legal_tax_class.setter
    def ipi_legal_tax_class(self, ipi_legal_tax_class):
        """
        Sets the ipi_legal_tax_class of this CustomProcessScenario.
        Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 

        :param ipi_legal_tax_class: The ipi_legal_tax_class of this CustomProcessScenario.
        :type: str
        """

        self._ipi_legal_tax_class = ipi_legal_tax_class

    @property
    def accruable_pis_taxation(self):
        """
        Gets the accruable_pis_taxation of this CustomProcessScenario.
        Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 

        :return: The accruable_pis_taxation of this CustomProcessScenario.
        :rtype: str
        """
        return self._accruable_pis_taxation

    @accruable_pis_taxation.setter
    def accruable_pis_taxation(self, accruable_pis_taxation):
        """
        Sets the accruable_pis_taxation of this CustomProcessScenario.
        Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE - 'O' # OTHER - 'OZ'# OTHER AND ZERO VALUES 

        :param accruable_pis_taxation: The accruable_pis_taxation of this CustomProcessScenario.
        :type: str
        """
        allowed_values = ["T", "Z", "E", "H", "N", "O", "OZ"]
        if accruable_pis_taxation not in allowed_values:
            raise ValueError(
                "Invalid value for `accruable_pis_taxation` ({0}), must be one of {1}"
                .format(accruable_pis_taxation, allowed_values)
            )

        self._accruable_pis_taxation = accruable_pis_taxation

    @property
    def pis_exempt_legal_reason_code(self):
        """
        Gets the pis_exempt_legal_reason_code of this CustomProcessScenario.
        When exempt, taxable with zero, suspended, not taxable, this field holds the official code number

        :return: The pis_exempt_legal_reason_code of this CustomProcessScenario.
        :rtype: str
        """
        return self._pis_exempt_legal_reason_code

    @pis_exempt_legal_reason_code.setter
    def pis_exempt_legal_reason_code(self, pis_exempt_legal_reason_code):
        """
        Sets the pis_exempt_legal_reason_code of this CustomProcessScenario.
        When exempt, taxable with zero, suspended, not taxable, this field holds the official code number

        :param pis_exempt_legal_reason_code: The pis_exempt_legal_reason_code of this CustomProcessScenario.
        :type: str
        """
        if pis_exempt_legal_reason_code is not None and len(pis_exempt_legal_reason_code) > 3:
            raise ValueError("Invalid value for `pis_exempt_legal_reason_code`, length must be less than or equal to `3`")

        self._pis_exempt_legal_reason_code = pis_exempt_legal_reason_code

    @property
    def pis_exempt_legal_reason(self):
        """
        Gets the pis_exempt_legal_reason of this CustomProcessScenario.
        When specifi reason, this field has the description

        :return: The pis_exempt_legal_reason of this CustomProcessScenario.
        :rtype: str
        """
        return self._pis_exempt_legal_reason

    @pis_exempt_legal_reason.setter
    def pis_exempt_legal_reason(self, pis_exempt_legal_reason):
        """
        Sets the pis_exempt_legal_reason of this CustomProcessScenario.
        When specifi reason, this field has the description

        :param pis_exempt_legal_reason: The pis_exempt_legal_reason of this CustomProcessScenario.
        :type: str
        """
        if pis_exempt_legal_reason is not None and len(pis_exempt_legal_reason) > 1024:
            raise ValueError("Invalid value for `pis_exempt_legal_reason`, length must be less than or equal to `1024`")

        self._pis_exempt_legal_reason = pis_exempt_legal_reason

    @property
    def accruable_cofins_taxation(self):
        """
        Gets the accruable_cofins_taxation of this CustomProcessScenario.
        Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 

        :return: The accruable_cofins_taxation of this CustomProcessScenario.
        :rtype: str
        """
        return self._accruable_cofins_taxation

    @accruable_cofins_taxation.setter
    def accruable_cofins_taxation(self, accruable_cofins_taxation):
        """
        Sets the accruable_cofins_taxation of this CustomProcessScenario.
        Inform if this item by nature is subject to COFINS taxation or exempt - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'H'  # SUSPENDED - 'N'  # NO TAXABLE     - 'O'  # OTHER - 'OZ' # OTHER AND ZERO VALUES 

        :param accruable_cofins_taxation: The accruable_cofins_taxation of this CustomProcessScenario.
        :type: str
        """
        allowed_values = ["T", "Z", "E", "H", "N", "O", "OZ"]
        if accruable_cofins_taxation not in allowed_values:
            raise ValueError(
                "Invalid value for `accruable_cofins_taxation` ({0}), must be one of {1}"
                .format(accruable_cofins_taxation, allowed_values)
            )

        self._accruable_cofins_taxation = accruable_cofins_taxation

    @property
    def cofins_exempt_legal_reason_code(self):
        """
        Gets the cofins_exempt_legal_reason_code of this CustomProcessScenario.
        When exempt, taxable with zero, suspended, not taxable, this field holds the official code number

        :return: The cofins_exempt_legal_reason_code of this CustomProcessScenario.
        :rtype: str
        """
        return self._cofins_exempt_legal_reason_code

    @cofins_exempt_legal_reason_code.setter
    def cofins_exempt_legal_reason_code(self, cofins_exempt_legal_reason_code):
        """
        Sets the cofins_exempt_legal_reason_code of this CustomProcessScenario.
        When exempt, taxable with zero, suspended, not taxable, this field holds the official code number

        :param cofins_exempt_legal_reason_code: The cofins_exempt_legal_reason_code of this CustomProcessScenario.
        :type: str
        """
        if cofins_exempt_legal_reason_code is not None and len(cofins_exempt_legal_reason_code) > 3:
            raise ValueError("Invalid value for `cofins_exempt_legal_reason_code`, length must be less than or equal to `3`")

        self._cofins_exempt_legal_reason_code = cofins_exempt_legal_reason_code

    @property
    def cofins_exempt_legal_reason(self):
        """
        Gets the cofins_exempt_legal_reason of this CustomProcessScenario.
        When specifi reason, this field has the description

        :return: The cofins_exempt_legal_reason of this CustomProcessScenario.
        :rtype: str
        """
        return self._cofins_exempt_legal_reason

    @cofins_exempt_legal_reason.setter
    def cofins_exempt_legal_reason(self, cofins_exempt_legal_reason):
        """
        Sets the cofins_exempt_legal_reason of this CustomProcessScenario.
        When specifi reason, this field has the description

        :param cofins_exempt_legal_reason: The cofins_exempt_legal_reason of this CustomProcessScenario.
        :type: str
        """
        if cofins_exempt_legal_reason is not None and len(cofins_exempt_legal_reason) > 1024:
            raise ValueError("Invalid value for `cofins_exempt_legal_reason`, length must be less than or equal to `1024`")

        self._cofins_exempt_legal_reason = cofins_exempt_legal_reason

    @property
    def allow_ip_icredit_when_in_going(self):
        """
        Gets the allow_ip_icredit_when_in_going of this CustomProcessScenario.
        Inform that the process allow IPI credit to Input process

        :return: The allow_ip_icredit_when_in_going of this CustomProcessScenario.
        :rtype: bool
        """
        return self._allow_ip_icredit_when_in_going

    @allow_ip_icredit_when_in_going.setter
    def allow_ip_icredit_when_in_going(self, allow_ip_icredit_when_in_going):
        """
        Sets the allow_ip_icredit_when_in_going of this CustomProcessScenario.
        Inform that the process allow IPI credit to Input process

        :param allow_ip_icredit_when_in_going: The allow_ip_icredit_when_in_going of this CustomProcessScenario.
        :type: bool
        """

        self._allow_ip_icredit_when_in_going = allow_ip_icredit_when_in_going

    @property
    def icms_conf(self):
        """
        Gets the icms_conf of this CustomProcessScenario.
        the map key is state code

        :return: The icms_conf of this CustomProcessScenario.
        :rtype: list[IcmsTaxConf]
        """
        return self._icms_conf

    @icms_conf.setter
    def icms_conf(self, icms_conf):
        """
        Sets the icms_conf of this CustomProcessScenario.
        the map key is state code

        :param icms_conf: The icms_conf of this CustomProcessScenario.
        :type: list[IcmsTaxConf]
        """

        self._icms_conf = icms_conf

    @property
    def name(self):
        """
        Gets the name of this CustomProcessScenario.
        Process name to Identify this configuration

        :return: The name of this CustomProcessScenario.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CustomProcessScenario.
        Process name to Identify this configuration

        :param name: The name of this CustomProcessScenario.
        :type: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")
        if name is not None and len(name) > 60:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `60`")

        self._name = name

    @property
    def type(self):
        """
        Gets the type of this CustomProcessScenario.

        :return: The type of this CustomProcessScenario.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CustomProcessScenario.

        :param type: The type of this CustomProcessScenario.
        :type: str
        """
        allowed_values = ["SALES", "PURCHASE", "SALES_RETURN", "PURCHASE_RETURN", "TRANSFER_RETURN", "SHIPPING", "SHIPPING_RETURN", "TRANSFER", "RECEIPT_AJUSTE", "TRANSFER_AJUSTE"]
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type

    @property
    def way_type(self):
        """
        Gets the way_type of this CustomProcessScenario.
        inform if the transaction is an operation to internalizing (receive) item or value

        :return: The way_type of this CustomProcessScenario.
        :rtype: str
        """
        return self._way_type

    @way_type.setter
    def way_type(self, way_type):
        """
        Sets the way_type of this CustomProcessScenario.
        inform if the transaction is an operation to internalizing (receive) item or value

        :param way_type: The way_type of this CustomProcessScenario.
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
    def goal(self):
        """
        Gets the goal of this CustomProcessScenario.

        :return: The goal of this CustomProcessScenario.
        :rtype: str
        """
        return self._goal

    @goal.setter
    def goal(self, goal):
        """
        Sets the goal of this CustomProcessScenario.

        :param goal: The goal of this CustomProcessScenario.
        :type: str
        """
        allowed_values = ["Normal", "Complementary", "Voided", "Replacement", "Return", "Adjustment"]
        if goal not in allowed_values:
            raise ValueError(
                "Invalid value for `goal` ({0}), must be one of {1}"
                .format(goal, allowed_values)
            )

        self._goal = goal

    @property
    def over_write_cfop(self):
        """
        Gets the over_write_cfop of this CustomProcessScenario.
        inform that the configuration process overwrites the cfop configuration.

        :return: The over_write_cfop of this CustomProcessScenario.
        :rtype: bool
        """
        return self._over_write_cfop

    @over_write_cfop.setter
    def over_write_cfop(self, over_write_cfop):
        """
        Sets the over_write_cfop of this CustomProcessScenario.
        inform that the configuration process overwrites the cfop configuration.

        :param over_write_cfop: The over_write_cfop of this CustomProcessScenario.
        :type: bool
        """

        self._over_write_cfop = over_write_cfop

    @property
    def cfops(self):
        """
        Gets the cfops of this CustomProcessScenario.

        :return: The cfops of this CustomProcessScenario.
        :rtype: list[CfopConf]
        """
        return self._cfops

    @cfops.setter
    def cfops(self, cfops):
        """
        Sets the cfops of this CustomProcessScenario.

        :param cfops: The cfops of this CustomProcessScenario.
        :type: list[CfopConf]
        """

        self._cfops = cfops

    @property
    def company_id(self):
        """
        Gets the company_id of this CustomProcessScenario.
        Company ID

        :return: The company_id of this CustomProcessScenario.
        :rtype: str
        """
        return self._company_id

    @company_id.setter
    def company_id(self, company_id):
        """
        Sets the company_id of this CustomProcessScenario.
        Company ID

        :param company_id: The company_id of this CustomProcessScenario.
        :type: str
        """
        if company_id is None:
            raise ValueError("Invalid value for `company_id`, must not be `None`")

        self._company_id = company_id

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
