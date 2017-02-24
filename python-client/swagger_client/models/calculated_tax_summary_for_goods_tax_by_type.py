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


class CalculatedTaxSummaryForGoodsTaxByType(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, icms=None, icms_st=None, icms_st_sd=None, icms_part_own=None, icms_part_dest=None, icms_difa_fcp=None, icms_difa_dest=None, icms_difa_remet=None, icms_rf=None, icms_deson=None, icms_credsn=None, pis=None, pis_st=None, cofins=None, cofins_st=None, ipi=None, ipi_returned=None, ii=None, iof=None, aproxtrib_state=None, aproxtrib_fed=None):
        """
        CalculatedTaxSummaryForGoodsTaxByType - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'icms': 'TaxByTypeSummaryForGoods',
            'icms_st': 'TaxByTypeSummaryForGoods',
            'icms_st_sd': 'TaxByTypeSummaryForGoods',
            'icms_part_own': 'TaxByTypeSummaryForGoods',
            'icms_part_dest': 'TaxByTypeSummaryForGoods',
            'icms_difa_fcp': 'TaxByTypeSummaryForGoods',
            'icms_difa_dest': 'TaxByTypeSummaryForGoods',
            'icms_difa_remet': 'TaxByTypeSummaryForGoods',
            'icms_rf': 'TaxByTypeSummaryForGoods',
            'icms_deson': 'TaxByTypeSummaryForGoods',
            'icms_credsn': 'TaxByTypeSummaryForGoods',
            'pis': 'TaxByTypeSummaryForGoods',
            'pis_st': 'TaxByTypeSummaryForGoods',
            'cofins': 'TaxByTypeSummaryForGoods',
            'cofins_st': 'TaxByTypeSummaryForGoods',
            'ipi': 'TaxByTypeSummaryForGoods',
            'ipi_returned': 'TaxByTypeSummaryForGoods',
            'ii': 'TaxByTypeSummaryForGoods',
            'iof': 'TaxByTypeSummaryForGoods',
            'aproxtrib_state': 'TaxByTypeSummaryForGoods',
            'aproxtrib_fed': 'TaxByTypeSummaryForGoods'
        }

        self.attribute_map = {
            'icms': 'icms',
            'icms_st': 'icmsSt',
            'icms_st_sd': 'icmsStSd',
            'icms_part_own': 'icmsPartOwn',
            'icms_part_dest': 'icmsPartDest',
            'icms_difa_fcp': 'icmsDifaFCP',
            'icms_difa_dest': 'icmsDifaDest',
            'icms_difa_remet': 'icmsDifaRemet',
            'icms_rf': 'icmsRf',
            'icms_deson': 'icmsDeson',
            'icms_credsn': 'icmsCredsn',
            'pis': 'pis',
            'pis_st': 'pisSt',
            'cofins': 'cofins',
            'cofins_st': 'cofinsSt',
            'ipi': 'ipi',
            'ipi_returned': 'ipiReturned',
            'ii': 'ii',
            'iof': 'iof',
            'aproxtrib_state': 'aproxtribState',
            'aproxtrib_fed': 'aproxtribFed'
        }

        self._icms = icms
        self._icms_st = icms_st
        self._icms_st_sd = icms_st_sd
        self._icms_part_own = icms_part_own
        self._icms_part_dest = icms_part_dest
        self._icms_difa_fcp = icms_difa_fcp
        self._icms_difa_dest = icms_difa_dest
        self._icms_difa_remet = icms_difa_remet
        self._icms_rf = icms_rf
        self._icms_deson = icms_deson
        self._icms_credsn = icms_credsn
        self._pis = pis
        self._pis_st = pis_st
        self._cofins = cofins
        self._cofins_st = cofins_st
        self._ipi = ipi
        self._ipi_returned = ipi_returned
        self._ii = ii
        self._iof = iof
        self._aproxtrib_state = aproxtrib_state
        self._aproxtrib_fed = aproxtrib_fed

    @property
    def icms(self):
        """
        Gets the icms of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms

    @icms.setter
    def icms(self, icms):
        """
        Sets the icms of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms: The icms of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms = icms

    @property
    def icms_st(self):
        """
        Gets the icms_st of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_st of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_st

    @icms_st.setter
    def icms_st(self, icms_st):
        """
        Sets the icms_st of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_st: The icms_st of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_st = icms_st

    @property
    def icms_st_sd(self):
        """
        Gets the icms_st_sd of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_st_sd of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_st_sd

    @icms_st_sd.setter
    def icms_st_sd(self, icms_st_sd):
        """
        Sets the icms_st_sd of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_st_sd: The icms_st_sd of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_st_sd = icms_st_sd

    @property
    def icms_part_own(self):
        """
        Gets the icms_part_own of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_part_own of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_part_own

    @icms_part_own.setter
    def icms_part_own(self, icms_part_own):
        """
        Sets the icms_part_own of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_part_own: The icms_part_own of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_part_own = icms_part_own

    @property
    def icms_part_dest(self):
        """
        Gets the icms_part_dest of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_part_dest of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_part_dest

    @icms_part_dest.setter
    def icms_part_dest(self, icms_part_dest):
        """
        Sets the icms_part_dest of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_part_dest: The icms_part_dest of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_part_dest = icms_part_dest

    @property
    def icms_difa_fcp(self):
        """
        Gets the icms_difa_fcp of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_difa_fcp of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_difa_fcp

    @icms_difa_fcp.setter
    def icms_difa_fcp(self, icms_difa_fcp):
        """
        Sets the icms_difa_fcp of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_difa_fcp: The icms_difa_fcp of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_difa_fcp = icms_difa_fcp

    @property
    def icms_difa_dest(self):
        """
        Gets the icms_difa_dest of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_difa_dest of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_difa_dest

    @icms_difa_dest.setter
    def icms_difa_dest(self, icms_difa_dest):
        """
        Sets the icms_difa_dest of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_difa_dest: The icms_difa_dest of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_difa_dest = icms_difa_dest

    @property
    def icms_difa_remet(self):
        """
        Gets the icms_difa_remet of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_difa_remet of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_difa_remet

    @icms_difa_remet.setter
    def icms_difa_remet(self, icms_difa_remet):
        """
        Sets the icms_difa_remet of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_difa_remet: The icms_difa_remet of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_difa_remet = icms_difa_remet

    @property
    def icms_rf(self):
        """
        Gets the icms_rf of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_rf of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_rf

    @icms_rf.setter
    def icms_rf(self, icms_rf):
        """
        Sets the icms_rf of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_rf: The icms_rf of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_rf = icms_rf

    @property
    def icms_deson(self):
        """
        Gets the icms_deson of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_deson of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_deson

    @icms_deson.setter
    def icms_deson(self, icms_deson):
        """
        Sets the icms_deson of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_deson: The icms_deson of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_deson = icms_deson

    @property
    def icms_credsn(self):
        """
        Gets the icms_credsn of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The icms_credsn of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._icms_credsn

    @icms_credsn.setter
    def icms_credsn(self, icms_credsn):
        """
        Sets the icms_credsn of this CalculatedTaxSummaryForGoodsTaxByType.

        :param icms_credsn: The icms_credsn of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._icms_credsn = icms_credsn

    @property
    def pis(self):
        """
        Gets the pis of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The pis of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._pis

    @pis.setter
    def pis(self, pis):
        """
        Sets the pis of this CalculatedTaxSummaryForGoodsTaxByType.

        :param pis: The pis of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._pis = pis

    @property
    def pis_st(self):
        """
        Gets the pis_st of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The pis_st of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._pis_st

    @pis_st.setter
    def pis_st(self, pis_st):
        """
        Sets the pis_st of this CalculatedTaxSummaryForGoodsTaxByType.

        :param pis_st: The pis_st of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._pis_st = pis_st

    @property
    def cofins(self):
        """
        Gets the cofins of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The cofins of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._cofins

    @cofins.setter
    def cofins(self, cofins):
        """
        Sets the cofins of this CalculatedTaxSummaryForGoodsTaxByType.

        :param cofins: The cofins of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._cofins = cofins

    @property
    def cofins_st(self):
        """
        Gets the cofins_st of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The cofins_st of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._cofins_st

    @cofins_st.setter
    def cofins_st(self, cofins_st):
        """
        Sets the cofins_st of this CalculatedTaxSummaryForGoodsTaxByType.

        :param cofins_st: The cofins_st of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._cofins_st = cofins_st

    @property
    def ipi(self):
        """
        Gets the ipi of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The ipi of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._ipi

    @ipi.setter
    def ipi(self, ipi):
        """
        Sets the ipi of this CalculatedTaxSummaryForGoodsTaxByType.

        :param ipi: The ipi of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._ipi = ipi

    @property
    def ipi_returned(self):
        """
        Gets the ipi_returned of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The ipi_returned of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._ipi_returned

    @ipi_returned.setter
    def ipi_returned(self, ipi_returned):
        """
        Sets the ipi_returned of this CalculatedTaxSummaryForGoodsTaxByType.

        :param ipi_returned: The ipi_returned of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._ipi_returned = ipi_returned

    @property
    def ii(self):
        """
        Gets the ii of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The ii of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._ii

    @ii.setter
    def ii(self, ii):
        """
        Sets the ii of this CalculatedTaxSummaryForGoodsTaxByType.

        :param ii: The ii of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._ii = ii

    @property
    def iof(self):
        """
        Gets the iof of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The iof of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._iof

    @iof.setter
    def iof(self, iof):
        """
        Sets the iof of this CalculatedTaxSummaryForGoodsTaxByType.

        :param iof: The iof of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._iof = iof

    @property
    def aproxtrib_state(self):
        """
        Gets the aproxtrib_state of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The aproxtrib_state of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._aproxtrib_state

    @aproxtrib_state.setter
    def aproxtrib_state(self, aproxtrib_state):
        """
        Sets the aproxtrib_state of this CalculatedTaxSummaryForGoodsTaxByType.

        :param aproxtrib_state: The aproxtrib_state of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._aproxtrib_state = aproxtrib_state

    @property
    def aproxtrib_fed(self):
        """
        Gets the aproxtrib_fed of this CalculatedTaxSummaryForGoodsTaxByType.

        :return: The aproxtrib_fed of this CalculatedTaxSummaryForGoodsTaxByType.
        :rtype: TaxByTypeSummaryForGoods
        """
        return self._aproxtrib_fed

    @aproxtrib_fed.setter
    def aproxtrib_fed(self, aproxtrib_fed):
        """
        Sets the aproxtrib_fed of this CalculatedTaxSummaryForGoodsTaxByType.

        :param aproxtrib_fed: The aproxtrib_fed of this CalculatedTaxSummaryForGoodsTaxByType.
        :type: TaxByTypeSummaryForGoods
        """

        self._aproxtrib_fed = aproxtrib_fed

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
