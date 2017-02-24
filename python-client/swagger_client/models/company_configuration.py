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


class CompanyConfiguration(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, certificate=None, certificatepwd=None, certificateexpiration=None, logo=None, tp_imp_n_fe=None, tp_imp_nf_ce=None):
        """
        CompanyConfiguration - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'certificate': 'str',
            'certificatepwd': 'str',
            'certificateexpiration': 'datetime',
            'logo': 'str',
            'tp_imp_n_fe': 'str',
            'tp_imp_nf_ce': 'str'
        }

        self.attribute_map = {
            'certificate': 'certificate',
            'certificatepwd': 'certificatepwd',
            'certificateexpiration': 'certificateexpiration',
            'logo': 'logo',
            'tp_imp_n_fe': 'tpImpNFe',
            'tp_imp_nf_ce': 'tpImpNFCe'
        }

        self._certificate = certificate
        self._certificatepwd = certificatepwd
        self._certificateexpiration = certificateexpiration
        self._logo = logo
        self._tp_imp_n_fe = tp_imp_n_fe
        self._tp_imp_nf_ce = tp_imp_nf_ce

    @property
    def certificate(self):
        """
        Gets the certificate of this CompanyConfiguration.
        digital certificate A1 model, p12, encoded by base64

        :return: The certificate of this CompanyConfiguration.
        :rtype: str
        """
        return self._certificate

    @certificate.setter
    def certificate(self, certificate):
        """
        Sets the certificate of this CompanyConfiguration.
        digital certificate A1 model, p12, encoded by base64

        :param certificate: The certificate of this CompanyConfiguration.
        :type: str
        """

        self._certificate = certificate

    @property
    def certificatepwd(self):
        """
        Gets the certificatepwd of this CompanyConfiguration.
        certificate password

        :return: The certificatepwd of this CompanyConfiguration.
        :rtype: str
        """
        return self._certificatepwd

    @certificatepwd.setter
    def certificatepwd(self, certificatepwd):
        """
        Sets the certificatepwd of this CompanyConfiguration.
        certificate password

        :param certificatepwd: The certificatepwd of this CompanyConfiguration.
        :type: str
        """

        self._certificatepwd = certificatepwd

    @property
    def certificateexpiration(self):
        """
        Gets the certificateexpiration of this CompanyConfiguration.
        expiration date of this certificate

        :return: The certificateexpiration of this CompanyConfiguration.
        :rtype: datetime
        """
        return self._certificateexpiration

    @certificateexpiration.setter
    def certificateexpiration(self, certificateexpiration):
        """
        Sets the certificateexpiration of this CompanyConfiguration.
        expiration date of this certificate

        :param certificateexpiration: The certificateexpiration of this CompanyConfiguration.
        :type: datetime
        """

        self._certificateexpiration = certificateexpiration

    @property
    def logo(self):
        """
        Gets the logo of this CompanyConfiguration.
        company logo image encoded by base64

        :return: The logo of this CompanyConfiguration.
        :rtype: str
        """
        return self._logo

    @logo.setter
    def logo(self, logo):
        """
        Sets the logo of this CompanyConfiguration.
        company logo image encoded by base64

        :param logo: The logo of this CompanyConfiguration.
        :type: str
        """

        self._logo = logo

    @property
    def tp_imp_n_fe(self):
        """
        Gets the tp_imp_n_fe of this CompanyConfiguration.
        how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; 

        :return: The tp_imp_n_fe of this CompanyConfiguration.
        :rtype: str
        """
        return self._tp_imp_n_fe

    @tp_imp_n_fe.setter
    def tp_imp_n_fe(self, tp_imp_n_fe):
        """
        Sets the tp_imp_n_fe of this CompanyConfiguration.
        how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape; 

        :param tp_imp_n_fe: The tp_imp_n_fe of this CompanyConfiguration.
        :type: str
        """
        allowed_values = ["0", "1", "2"]
        if tp_imp_n_fe not in allowed_values:
            raise ValueError(
                "Invalid value for `tp_imp_n_fe` ({0}), must be one of {1}"
                .format(tp_imp_n_fe, allowed_values)
            )

        self._tp_imp_n_fe = tp_imp_n_fe

    @property
    def tp_imp_nf_ce(self):
        """
        Gets the tp_imp_nf_ce of this CompanyConfiguration.
        how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 

        :return: The tp_imp_nf_ce of this CompanyConfiguration.
        :rtype: str
        """
        return self._tp_imp_nf_ce

    @tp_imp_nf_ce.setter
    def tp_imp_nf_ce(self, tp_imp_nf_ce):
        """
        Sets the tp_imp_nf_ce of this CompanyConfiguration.
        how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail 

        :param tp_imp_nf_ce: The tp_imp_nf_ce of this CompanyConfiguration.
        :type: str
        """
        allowed_values = ["0", "4", "5"]
        if tp_imp_nf_ce not in allowed_values:
            raise ValueError(
                "Invalid value for `tp_imp_nf_ce` ({0}), must be one of {1}"
                .format(tp_imp_nf_ce, allowed_values)
            )

        self._tp_imp_nf_ce = tp_imp_nf_ce

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
