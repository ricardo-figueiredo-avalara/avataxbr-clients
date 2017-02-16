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


class CustomIcmsConfByState(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, code=None, state=None, name=None, start_date=None, expiration_date=None, inactive=None, subject_to_st=None, icms_cst=None, calc_mode=None, discount_rate_for_mono_phase=None, rate=None, icms_base_discount=None, msrp=None, mva_rate=None, msrp_unit=None, icms_legal_reason=None, fcp_rate=None, icms_st_conf=None, icms_inter_state_conf=None, company_id=None):
        """
        CustomIcmsConfByState - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'code': 'str',
            'state': 'StateEnum',
            'name': 'str',
            'start_date': 'datetime',
            'expiration_date': 'datetime',
            'inactive': 'bool',
            'subject_to_st': 'bool',
            'icms_cst': 'str',
            'calc_mode': 'str',
            'discount_rate_for_mono_phase': 'float',
            'rate': 'float',
            'icms_base_discount': 'float',
            'msrp': 'float',
            'mva_rate': 'float',
            'msrp_unit': 'str',
            'icms_legal_reason': 'str',
            'fcp_rate': 'float',
            'icms_st_conf': 'IcmsConfByStateIcmsSTConf',
            'icms_inter_state_conf': 'list[IcmsConfInterState]',
            'company_id': 'str'
        }

        self.attribute_map = {
            'code': 'code',
            'state': 'state',
            'name': 'name',
            'start_date': 'startDate',
            'expiration_date': 'expirationDate',
            'inactive': 'inactive',
            'subject_to_st': 'subjectToST',
            'icms_cst': 'icmsCST',
            'calc_mode': 'calcMode',
            'discount_rate_for_mono_phase': 'discountRateForMonoPhase',
            'rate': 'rate',
            'icms_base_discount': 'icmsBaseDiscount',
            'msrp': 'msrp',
            'mva_rate': 'mvaRate',
            'msrp_unit': 'msrpUnit',
            'icms_legal_reason': 'icmsLegalReason',
            'fcp_rate': 'fcpRate',
            'icms_st_conf': 'icmsSTConf',
            'icms_inter_state_conf': 'icmsInterStateConf',
            'company_id': 'companyId'
        }

        self._code = code
        self._state = state
        self._name = name
        self._start_date = start_date
        self._expiration_date = expiration_date
        self._inactive = inactive
        self._subject_to_st = subject_to_st
        self._icms_cst = icms_cst
        self._calc_mode = calc_mode
        self._discount_rate_for_mono_phase = discount_rate_for_mono_phase
        self._rate = rate
        self._icms_base_discount = icms_base_discount
        self._msrp = msrp
        self._mva_rate = mva_rate
        self._msrp_unit = msrp_unit
        self._icms_legal_reason = icms_legal_reason
        self._fcp_rate = fcp_rate
        self._icms_st_conf = icms_st_conf
        self._icms_inter_state_conf = icms_inter_state_conf
        self._company_id = company_id

    @property
    def code(self):
        """
        Gets the code of this CustomIcmsConfByState.
        Identify the IcmsConfState in namespace

        :return: The code of this CustomIcmsConfByState.
        :rtype: str
        """
        return self._code

    @code.setter
    def code(self, code):
        """
        Sets the code of this CustomIcmsConfByState.
        Identify the IcmsConfState in namespace

        :param code: The code of this CustomIcmsConfByState.
        :type: str
        """
        if code is None:
            raise ValueError("Invalid value for `code`, must not be `None`")
        if code is not None and len(code) > 60:
            raise ValueError("Invalid value for `code`, length must be less than or equal to `60`")

        self._code = code

    @property
    def state(self):
        """
        Gets the state of this CustomIcmsConfByState.

        :return: The state of this CustomIcmsConfByState.
        :rtype: StateEnum
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this CustomIcmsConfByState.

        :param state: The state of this CustomIcmsConfByState.
        :type: StateEnum
        """
        if state is None:
            raise ValueError("Invalid value for `state`, must not be `None`")

        self._state = state

    @property
    def name(self):
        """
        Gets the name of this CustomIcmsConfByState.
        name for this configuration

        :return: The name of this CustomIcmsConfByState.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """
        Sets the name of this CustomIcmsConfByState.
        name for this configuration

        :param name: The name of this CustomIcmsConfByState.
        :type: str
        """
        if name is not None and len(name) > 60:
            raise ValueError("Invalid value for `name`, length must be less than or equal to `60`")

        self._name = name

    @property
    def start_date(self):
        """
        Gets the start_date of this CustomIcmsConfByState.
        date when this configuration values starts

        :return: The start_date of this CustomIcmsConfByState.
        :rtype: datetime
        """
        return self._start_date

    @start_date.setter
    def start_date(self, start_date):
        """
        Sets the start_date of this CustomIcmsConfByState.
        date when this configuration values starts

        :param start_date: The start_date of this CustomIcmsConfByState.
        :type: datetime
        """

        self._start_date = start_date

    @property
    def expiration_date(self):
        """
        Gets the expiration_date of this CustomIcmsConfByState.
        date when this configuration values expire

        :return: The expiration_date of this CustomIcmsConfByState.
        :rtype: datetime
        """
        return self._expiration_date

    @expiration_date.setter
    def expiration_date(self, expiration_date):
        """
        Sets the expiration_date of this CustomIcmsConfByState.
        date when this configuration values expire

        :param expiration_date: The expiration_date of this CustomIcmsConfByState.
        :type: datetime
        """

        self._expiration_date = expiration_date

    @property
    def inactive(self):
        """
        Gets the inactive of this CustomIcmsConfByState.
        set this configuration to Inactive

        :return: The inactive of this CustomIcmsConfByState.
        :rtype: bool
        """
        return self._inactive

    @inactive.setter
    def inactive(self, inactive):
        """
        Sets the inactive of this CustomIcmsConfByState.
        set this configuration to Inactive

        :param inactive: The inactive of this CustomIcmsConfByState.
        :type: bool
        """

        self._inactive = inactive

    @property
    def subject_to_st(self):
        """
        Gets the subject_to_st of this CustomIcmsConfByState.
        inform that the item linked to this configuration is subject to ICMS ST on this state

        :return: The subject_to_st of this CustomIcmsConfByState.
        :rtype: bool
        """
        return self._subject_to_st

    @subject_to_st.setter
    def subject_to_st(self, subject_to_st):
        """
        Sets the subject_to_st of this CustomIcmsConfByState.
        inform that the item linked to this configuration is subject to ICMS ST on this state

        :param subject_to_st: The subject_to_st of this CustomIcmsConfByState.
        :type: bool
        """

        self._subject_to_st = subject_to_st

    @property
    def icms_cst(self):
        """
        Gets the icms_cst of this CustomIcmsConfByState.
        On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 

        :return: The icms_cst of this CustomIcmsConfByState.
        :rtype: str
        """
        return self._icms_cst

    @icms_cst.setter
    def icms_cst(self, icms_cst):
        """
        Sets the icms_cst of this CustomIcmsConfByState.
        On sales process inform the CST hat the item linked to this configuration is subject to for the own ICMS - '00' # TAXABLE - '20' # TAXABLE WITH BASE DISCOUNT - '40' # EXEMPT - '41' # NOT TAXABLE - '50' # SUSPENDED 

        :param icms_cst: The icms_cst of this CustomIcmsConfByState.
        :type: str
        """
        allowed_values = ["00", "20", "40", "41", "50"]
        if icms_cst not in allowed_values:
            raise ValueError(
                "Invalid value for `icms_cst` ({0}), must be one of {1}"
                .format(icms_cst, allowed_values)
            )

        self._icms_cst = icms_cst

    @property
    def calc_mode(self):
        """
        Gets the calc_mode of this CustomIcmsConfByState.
        how this ICMS will be calculed for itens linked to this configuration

        :return: The calc_mode of this CustomIcmsConfByState.
        :rtype: str
        """
        return self._calc_mode

    @calc_mode.setter
    def calc_mode(self, calc_mode):
        """
        Sets the calc_mode of this CustomIcmsConfByState.
        how this ICMS will be calculed for itens linked to this configuration

        :param calc_mode: The calc_mode of this CustomIcmsConfByState.
        :type: str
        """
        allowed_values = ["BYMVARATE", "SRP", "MMSRP", "OPERATIONAMOUNT"]
        if calc_mode not in allowed_values:
            raise ValueError(
                "Invalid value for `calc_mode` ({0}), must be one of {1}"
                .format(calc_mode, allowed_values)
            )

        self._calc_mode = calc_mode

    @property
    def discount_rate_for_mono_phase(self):
        """
        Gets the discount_rate_for_mono_phase of this CustomIcmsConfByState.
        discount if the item is subject to monophase PIS/COFINS for transactions inside state

        :return: The discount_rate_for_mono_phase of this CustomIcmsConfByState.
        :rtype: float
        """
        return self._discount_rate_for_mono_phase

    @discount_rate_for_mono_phase.setter
    def discount_rate_for_mono_phase(self, discount_rate_for_mono_phase):
        """
        Sets the discount_rate_for_mono_phase of this CustomIcmsConfByState.
        discount if the item is subject to monophase PIS/COFINS for transactions inside state

        :param discount_rate_for_mono_phase: The discount_rate_for_mono_phase of this CustomIcmsConfByState.
        :type: float
        """

        self._discount_rate_for_mono_phase = discount_rate_for_mono_phase

    @property
    def rate(self):
        """
        Gets the rate of this CustomIcmsConfByState.
        ICMS rate

        :return: The rate of this CustomIcmsConfByState.
        :rtype: float
        """
        return self._rate

    @rate.setter
    def rate(self, rate):
        """
        Sets the rate of this CustomIcmsConfByState.
        ICMS rate

        :param rate: The rate of this CustomIcmsConfByState.
        :type: float
        """

        self._rate = rate

    @property
    def icms_base_discount(self):
        """
        Gets the icms_base_discount of this CustomIcmsConfByState.
        ICMS rate

        :return: The icms_base_discount of this CustomIcmsConfByState.
        :rtype: float
        """
        return self._icms_base_discount

    @icms_base_discount.setter
    def icms_base_discount(self, icms_base_discount):
        """
        Sets the icms_base_discount of this CustomIcmsConfByState.
        ICMS rate

        :param icms_base_discount: The icms_base_discount of this CustomIcmsConfByState.
        :type: float
        """

        self._icms_base_discount = icms_base_discount

    @property
    def msrp(self):
        """
        Gets the msrp of this CustomIcmsConfByState.
        SRP or MMSRP amount base for this icms configuration

        :return: The msrp of this CustomIcmsConfByState.
        :rtype: float
        """
        return self._msrp

    @msrp.setter
    def msrp(self, msrp):
        """
        Sets the msrp of this CustomIcmsConfByState.
        SRP or MMSRP amount base for this icms configuration

        :param msrp: The msrp of this CustomIcmsConfByState.
        :type: float
        """

        self._msrp = msrp

    @property
    def mva_rate(self):
        """
        Gets the mva_rate of this CustomIcmsConfByState.
        ICMS mva rate to define calc base

        :return: The mva_rate of this CustomIcmsConfByState.
        :rtype: float
        """
        return self._mva_rate

    @mva_rate.setter
    def mva_rate(self, mva_rate):
        """
        Sets the mva_rate of this CustomIcmsConfByState.
        ICMS mva rate to define calc base

        :param mva_rate: The mva_rate of this CustomIcmsConfByState.
        :type: float
        """

        self._mva_rate = mva_rate

    @property
    def msrp_unit(self):
        """
        Gets the msrp_unit of this CustomIcmsConfByState.
        unit used to SRP amount value

        :return: The msrp_unit of this CustomIcmsConfByState.
        :rtype: str
        """
        return self._msrp_unit

    @msrp_unit.setter
    def msrp_unit(self, msrp_unit):
        """
        Sets the msrp_unit of this CustomIcmsConfByState.
        unit used to SRP amount value

        :param msrp_unit: The msrp_unit of this CustomIcmsConfByState.
        :type: str
        """
        if msrp_unit is not None and len(msrp_unit) > 6:
            raise ValueError("Invalid value for `msrp_unit`, length must be less than or equal to `6`")

        self._msrp_unit = msrp_unit

    @property
    def icms_legal_reason(self):
        """
        Gets the icms_legal_reason of this CustomIcmsConfByState.
        Code for the ICM legal reason, this message will be placed on invoice.

        :return: The icms_legal_reason of this CustomIcmsConfByState.
        :rtype: str
        """
        return self._icms_legal_reason

    @icms_legal_reason.setter
    def icms_legal_reason(self, icms_legal_reason):
        """
        Sets the icms_legal_reason of this CustomIcmsConfByState.
        Code for the ICM legal reason, this message will be placed on invoice.

        :param icms_legal_reason: The icms_legal_reason of this CustomIcmsConfByState.
        :type: str
        """
        if icms_legal_reason is not None and len(icms_legal_reason) > 60:
            raise ValueError("Invalid value for `icms_legal_reason`, length must be less than or equal to `60`")

        self._icms_legal_reason = icms_legal_reason

    @property
    def fcp_rate(self):
        """
        Gets the fcp_rate of this CustomIcmsConfByState.
        Fundo de Combate à pobreza / Fund Against Poverty

        :return: The fcp_rate of this CustomIcmsConfByState.
        :rtype: float
        """
        return self._fcp_rate

    @fcp_rate.setter
    def fcp_rate(self, fcp_rate):
        """
        Sets the fcp_rate of this CustomIcmsConfByState.
        Fundo de Combate à pobreza / Fund Against Poverty

        :param fcp_rate: The fcp_rate of this CustomIcmsConfByState.
        :type: float
        """

        self._fcp_rate = fcp_rate

    @property
    def icms_st_conf(self):
        """
        Gets the icms_st_conf of this CustomIcmsConfByState.

        :return: The icms_st_conf of this CustomIcmsConfByState.
        :rtype: IcmsConfByStateIcmsSTConf
        """
        return self._icms_st_conf

    @icms_st_conf.setter
    def icms_st_conf(self, icms_st_conf):
        """
        Sets the icms_st_conf of this CustomIcmsConfByState.

        :param icms_st_conf: The icms_st_conf of this CustomIcmsConfByState.
        :type: IcmsConfByStateIcmsSTConf
        """

        self._icms_st_conf = icms_st_conf

    @property
    def icms_inter_state_conf(self):
        """
        Gets the icms_inter_state_conf of this CustomIcmsConfByState.
        the map key is state code

        :return: The icms_inter_state_conf of this CustomIcmsConfByState.
        :rtype: list[IcmsConfInterState]
        """
        return self._icms_inter_state_conf

    @icms_inter_state_conf.setter
    def icms_inter_state_conf(self, icms_inter_state_conf):
        """
        Sets the icms_inter_state_conf of this CustomIcmsConfByState.
        the map key is state code

        :param icms_inter_state_conf: The icms_inter_state_conf of this CustomIcmsConfByState.
        :type: list[IcmsConfInterState]
        """

        self._icms_inter_state_conf = icms_inter_state_conf

    @property
    def company_id(self):
        """
        Gets the company_id of this CustomIcmsConfByState.
        Company ID

        :return: The company_id of this CustomIcmsConfByState.
        :rtype: str
        """
        return self._company_id

    @company_id.setter
    def company_id(self, company_id):
        """
        Sets the company_id of this CustomIcmsConfByState.
        Company ID

        :param company_id: The company_id of this CustomIcmsConfByState.
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