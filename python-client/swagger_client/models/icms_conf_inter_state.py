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


class IcmsConfInterState(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, state=None, calc_mode=None, discount_rate_for_mono_phase=None, rate=None, fcp_rate=None, icms_base_discount=None, msrp=None, mva_rate=None, msrp_unit=None, icms_legal_reason=None, icms_st_conf=None):
        """
        IcmsConfInterState - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'state': 'StateEnum',
            'calc_mode': 'str',
            'discount_rate_for_mono_phase': 'float',
            'rate': 'float',
            'fcp_rate': 'float',
            'icms_base_discount': 'float',
            'msrp': 'float',
            'mva_rate': 'float',
            'msrp_unit': 'str',
            'icms_legal_reason': 'str',
            'icms_st_conf': 'IcmsConfInterStateIcmsSTConf'
        }

        self.attribute_map = {
            'state': 'state',
            'calc_mode': 'calcMode',
            'discount_rate_for_mono_phase': 'discountRateForMonoPhase',
            'rate': 'rate',
            'fcp_rate': 'fcpRate',
            'icms_base_discount': 'icmsBaseDiscount',
            'msrp': 'msrp',
            'mva_rate': 'mvaRate',
            'msrp_unit': 'msrpUnit',
            'icms_legal_reason': 'icmsLegalReason',
            'icms_st_conf': 'icmsSTConf'
        }

        self._state = state
        self._calc_mode = calc_mode
        self._discount_rate_for_mono_phase = discount_rate_for_mono_phase
        self._rate = rate
        self._fcp_rate = fcp_rate
        self._icms_base_discount = icms_base_discount
        self._msrp = msrp
        self._mva_rate = mva_rate
        self._msrp_unit = msrp_unit
        self._icms_legal_reason = icms_legal_reason
        self._icms_st_conf = icms_st_conf

    @property
    def state(self):
        """
        Gets the state of this IcmsConfInterState.

        :return: The state of this IcmsConfInterState.
        :rtype: StateEnum
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this IcmsConfInterState.

        :param state: The state of this IcmsConfInterState.
        :type: StateEnum
        """

        self._state = state

    @property
    def calc_mode(self):
        """
        Gets the calc_mode of this IcmsConfInterState.
        how this ICMS will be calculed for itens linked to this configuration

        :return: The calc_mode of this IcmsConfInterState.
        :rtype: str
        """
        return self._calc_mode

    @calc_mode.setter
    def calc_mode(self, calc_mode):
        """
        Sets the calc_mode of this IcmsConfInterState.
        how this ICMS will be calculed for itens linked to this configuration

        :param calc_mode: The calc_mode of this IcmsConfInterState.
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
        Gets the discount_rate_for_mono_phase of this IcmsConfInterState.
        discount if the item is subject to monophase PIS/COFINS when operation interstate

        :return: The discount_rate_for_mono_phase of this IcmsConfInterState.
        :rtype: float
        """
        return self._discount_rate_for_mono_phase

    @discount_rate_for_mono_phase.setter
    def discount_rate_for_mono_phase(self, discount_rate_for_mono_phase):
        """
        Sets the discount_rate_for_mono_phase of this IcmsConfInterState.
        discount if the item is subject to monophase PIS/COFINS when operation interstate

        :param discount_rate_for_mono_phase: The discount_rate_for_mono_phase of this IcmsConfInterState.
        :type: float
        """

        self._discount_rate_for_mono_phase = discount_rate_for_mono_phase

    @property
    def rate(self):
        """
        Gets the rate of this IcmsConfInterState.
        ICMS rate

        :return: The rate of this IcmsConfInterState.
        :rtype: float
        """
        return self._rate

    @rate.setter
    def rate(self, rate):
        """
        Sets the rate of this IcmsConfInterState.
        ICMS rate

        :param rate: The rate of this IcmsConfInterState.
        :type: float
        """

        self._rate = rate

    @property
    def fcp_rate(self):
        """
        Gets the fcp_rate of this IcmsConfInterState.
        FCP rate (Fundo de Combate à Probreza / Fund Against Poverty

        :return: The fcp_rate of this IcmsConfInterState.
        :rtype: float
        """
        return self._fcp_rate

    @fcp_rate.setter
    def fcp_rate(self, fcp_rate):
        """
        Sets the fcp_rate of this IcmsConfInterState.
        FCP rate (Fundo de Combate à Probreza / Fund Against Poverty

        :param fcp_rate: The fcp_rate of this IcmsConfInterState.
        :type: float
        """

        self._fcp_rate = fcp_rate

    @property
    def icms_base_discount(self):
        """
        Gets the icms_base_discount of this IcmsConfInterState.
        ICMS rate

        :return: The icms_base_discount of this IcmsConfInterState.
        :rtype: float
        """
        return self._icms_base_discount

    @icms_base_discount.setter
    def icms_base_discount(self, icms_base_discount):
        """
        Sets the icms_base_discount of this IcmsConfInterState.
        ICMS rate

        :param icms_base_discount: The icms_base_discount of this IcmsConfInterState.
        :type: float
        """

        self._icms_base_discount = icms_base_discount

    @property
    def msrp(self):
        """
        Gets the msrp of this IcmsConfInterState.
        SRP or MMSRP amount base for this icms configuration

        :return: The msrp of this IcmsConfInterState.
        :rtype: float
        """
        return self._msrp

    @msrp.setter
    def msrp(self, msrp):
        """
        Sets the msrp of this IcmsConfInterState.
        SRP or MMSRP amount base for this icms configuration

        :param msrp: The msrp of this IcmsConfInterState.
        :type: float
        """

        self._msrp = msrp

    @property
    def mva_rate(self):
        """
        Gets the mva_rate of this IcmsConfInterState.
        ICMS MVA rate to define calc base

        :return: The mva_rate of this IcmsConfInterState.
        :rtype: float
        """
        return self._mva_rate

    @mva_rate.setter
    def mva_rate(self, mva_rate):
        """
        Sets the mva_rate of this IcmsConfInterState.
        ICMS MVA rate to define calc base

        :param mva_rate: The mva_rate of this IcmsConfInterState.
        :type: float
        """

        self._mva_rate = mva_rate

    @property
    def msrp_unit(self):
        """
        Gets the msrp_unit of this IcmsConfInterState.
        unit used to SRP amount value

        :return: The msrp_unit of this IcmsConfInterState.
        :rtype: str
        """
        return self._msrp_unit

    @msrp_unit.setter
    def msrp_unit(self, msrp_unit):
        """
        Sets the msrp_unit of this IcmsConfInterState.
        unit used to SRP amount value

        :param msrp_unit: The msrp_unit of this IcmsConfInterState.
        :type: str
        """
        if msrp_unit is not None and len(msrp_unit) > 6:
            raise ValueError("Invalid value for `msrp_unit`, length must be less than or equal to `6`")

        self._msrp_unit = msrp_unit

    @property
    def icms_legal_reason(self):
        """
        Gets the icms_legal_reason of this IcmsConfInterState.
        Code for the ICM legal reason, this message will be placed on invoice.

        :return: The icms_legal_reason of this IcmsConfInterState.
        :rtype: str
        """
        return self._icms_legal_reason

    @icms_legal_reason.setter
    def icms_legal_reason(self, icms_legal_reason):
        """
        Sets the icms_legal_reason of this IcmsConfInterState.
        Code for the ICM legal reason, this message will be placed on invoice.

        :param icms_legal_reason: The icms_legal_reason of this IcmsConfInterState.
        :type: str
        """
        if icms_legal_reason is not None and len(icms_legal_reason) > 60:
            raise ValueError("Invalid value for `icms_legal_reason`, length must be less than or equal to `60`")

        self._icms_legal_reason = icms_legal_reason

    @property
    def icms_st_conf(self):
        """
        Gets the icms_st_conf of this IcmsConfInterState.

        :return: The icms_st_conf of this IcmsConfInterState.
        :rtype: IcmsConfInterStateIcmsSTConf
        """
        return self._icms_st_conf

    @icms_st_conf.setter
    def icms_st_conf(self, icms_st_conf):
        """
        Sets the icms_st_conf of this IcmsConfInterState.

        :param icms_st_conf: The icms_st_conf of this IcmsConfInterState.
        :type: IcmsConfInterStateIcmsSTConf
        """

        self._icms_st_conf = icms_st_conf

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
