# coding: utf-8

"""
    BR16 - API

    This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into sdk package
from .models.account_company import AccountCompany
from .models.additional_information import AdditionalInformation
from .models.additional_information_proc_ref import AdditionalInformationProcRef
from .models.address import Address
from .models.agast import Agast
from .models.agast_code_type import AgastCodeType
from .models.agast_extend_for_sefaz import AgastExtendForSefaz
from .models.agast_icms_conf import AgastIcmsConf
from .models.body import Body
from .models.body_1 import Body1
from .models.body_2 import Body2
from .models.body_3 import Body3
from .models.body_4 import Body4
from .models.cst_pist_cofins_enum import CSTPistCofinsEnum
from .models.cst_table_a_enum import CSTTableAEnum
from .models.cst_table_b_enum import CSTTableBEnum
from .models.calc_model_enum import CalcModelEnum
from .models.calculated_tax_summary_for_goods import CalculatedTaxSummaryForGoods
from .models.calculated_tax_summary_for_goods_tax_by_type import CalculatedTaxSummaryForGoodsTaxByType
from .models.cfop_conf import CfopConf
from .models.company import Company
from .models.company_authorized_to_download_n_fe import CompanyAuthorizedToDownloadNFe
from .models.company_configuration import CompanyConfiguration
from .models.company_mail_server import CompanyMailServer
from .models.cst_icms_enum import CstIcmsEnum
from .models.custom_agast import CustomAgast
from .models.custom_icms_conf_by_state import CustomIcmsConfByState
from .models.custom_process_scenario import CustomProcessScenario
from .models.custom_tax_type_rate import CustomTaxTypeRate
from .models.default_locations import DefaultLocations
from .models.details_calculated_tax import DetailsCalculatedTax
from .models.details_calculated_tax_item import DetailsCalculatedTaxItem
from .models.entity import Entity
from .models.entity_for_goods import EntityForGoods
from .models.entity_informer_for_goods import EntityInformerForGoods
from .models.entity_informer_for_goods_federal_tax_regime import EntityInformerForGoodsFederalTaxRegime
from .models.entity_location import EntityLocation
from .models.entity_type import EntityType
from .models.error import Error
from .models.export_info import ExportInfo
from .models.federal_tax_regime import FederalTaxRegime
from .models.fuel import Fuel
from .models.fuel_cide import FuelCide
from .models.fuel_pump_number import FuelPumpNumber
from .models.header_base_info import HeaderBaseInfo
from .models.header_for_goods import HeaderForGoods
from .models.header_for_goods_participants import HeaderForGoodsParticipants
from .models.ibpt_conf import IbptConf
from .models.icms_conf_by_state import IcmsConfByState
from .models.icms_conf_by_state_icms_st_conf import IcmsConfByStateIcmsSTConf
from .models.icms_conf_inter_state import IcmsConfInterState
from .models.icms_conf_inter_state_icms_st_conf import IcmsConfInterStateIcmsSTConf
from .models.icms_tax_conf import IcmsTaxConf
from .models.icms_tax_conf_base import IcmsTaxConfBase
from .models.informer_for_goods import InformerForGoods
from .models.informer_for_goods_csts import InformerForGoodsCsts
from .models.inline_response_200 import InlineResponse200
from .models.inline_response_200_1 import InlineResponse2001
from .models.inline_response_200_2 import InlineResponse2002
from .models.inline_response_200_3 import InlineResponse2003
from .models.inline_response_200_4 import InlineResponse2004
from .models.inline_response_201 import InlineResponse201
from .models.installment_complete import InstallmentComplete
from .models.ipbt_conf_item import IpbtConfItem
from .models.iss_conf_by_city import IssConfByCity
from .models.iss_conf_service_list import IssConfServiceList
from .models.iss_conf_service_list_tax_rate import IssConfServiceListTaxRate
from .models.iss_conf_service_list_tax_rate_ibpt import IssConfServiceListTaxRateIbpt
from .models.item_cpom import ItemCpom
from .models.item_goods import ItemGoods
from .models.item_simple import ItemSimple
from .models.legal_reason import LegalReason
from .models.legal_reason_referenced_processes import LegalReasonReferencedProcesses
from .models.legal_reason_tax_scope import LegalReasonTaxScope
from .models.line_for_goods import LineForGoods
from .models.line_for_goods_adi import LineForGoodsAdi
from .models.line_for_goods_calculated_tax import LineForGoodsCalculatedTax
from .models.line_for_goods_calculated_tax_tax_by_type import LineForGoodsCalculatedTaxTaxByType
from .models.line_for_goods_di import LineForGoodsDi
from .models.line_for_goods_export import LineForGoodsExport
from .models.line_for_goods_icms_tax_relief import LineForGoodsIcmsTaxRelief
from .models.line_for_goods_ind_export import LineForGoodsIndExport
from .models.line_for_sefaz_goods import LineForSefazGoods
from .models.location import Location
from .models.location_secondary_state_tax_id import LocationSecondaryStateTaxId
from .models.medicine import Medicine
from .models.message import Message
from .models.n_ref import NRef
from .models.n_ref_ref_ecf import NRefRefECF
from .models.n_ref_ref_farmer_nf import NRefRefFarmerNF
from .models.n_ref_ref_nf import NRefRefNF
from .models.pay_rec_calculated_tax_summary_for_service import PayRecCalculatedTaxSummaryForService
from .models.pay_rec_calculated_tax_summary_for_service_tax_by_type import PayRecCalculatedTaxSummaryForServiceTaxByType
from .models.pay_rec_header import PayRecHeader
from .models.pay_rec_lines_in import PayRecLinesIn
from .models.pay_rec_lines_out import PayRecLinesOut
from .models.payment import Payment
from .models.payment_bill import PaymentBill
from .models.payment_calculated_tax import PaymentCalculatedTax
from .models.payment_installment import PaymentInstallment
from .models.payment_lines_in import PaymentLinesIn
from .models.payment_payment_mode import PaymentPaymentMode
from .models.payment_tax_by_type import PaymentTaxByType
from .models.payment_terms import PaymentTerms
from .models.payment_transaction_in import PaymentTransactionIn
from .models.payment_transaction_out import PaymentTransactionOut
from .models.pcc_withholding_mode import PccWithholdingMode
from .models.point_of_order_origin import PointOfOrderOrigin
from .models.process_scenario import ProcessScenario
from .models.processing_info import ProcessingInfo
from .models.purchase_calculated_tax import PurchaseCalculatedTax
from .models.purchase_calculated_tax_summary_for_service import PurchaseCalculatedTaxSummaryForService
from .models.purchase_calculated_tax_summary_for_service_tax_by_type import PurchaseCalculatedTaxSummaryForServiceTaxByType
from .models.purchase_default_locations import PurchaseDefaultLocations
from .models.purchase_entity import PurchaseEntity
from .models.purchase_header_in import PurchaseHeaderIn
from .models.purchase_header_in_payment import PurchaseHeaderInPayment
from .models.purchase_header_out import PurchaseHeaderOut
from .models.purchase_header_out_payment import PurchaseHeaderOutPayment
from .models.purchase_info import PurchaseInfo
from .models.purchase_installment_in import PurchaseInstallmentIn
from .models.purchase_lines_in import PurchaseLinesIn
from .models.purchase_lines_out import PurchaseLinesOut
from .models.purchase_tax_by_type import PurchaseTaxByType
from .models.purchase_tax_by_type_detail import PurchaseTaxByTypeDetail
from .models.purchase_taxes_config import PurchaseTaxesConfig
from .models.purchase_transaction_in import PurchaseTransactionIn
from .models.purchase_transaction_out import PurchaseTransactionOut
from .models.receipt_transaction_in import ReceiptTransactionIn
from .models.receipt_transaction_out import ReceiptTransactionOut
from .models.sales_calculated_tax import SalesCalculatedTax
from .models.sales_calculated_tax_summary_for_service import SalesCalculatedTaxSummaryForService
from .models.sales_calculated_tax_summary_for_service_tax_by_type import SalesCalculatedTaxSummaryForServiceTaxByType
from .models.sales_default_locations import SalesDefaultLocations
from .models.sales_entity import SalesEntity
from .models.sales_header_in import SalesHeaderIn
from .models.sales_header_in_payment import SalesHeaderInPayment
from .models.sales_header_out import SalesHeaderOut
from .models.sales_header_out_payment import SalesHeaderOutPayment
from .models.sales_installment_in import SalesInstallmentIn
from .models.sales_lines_in import SalesLinesIn
from .models.sales_lines_in_tax_deductions import SalesLinesInTaxDeductions
from .models.sales_lines_out import SalesLinesOut
from .models.sales_lines_out_tax_deductions import SalesLinesOutTaxDeductions
from .models.sales_tax_by_type import SalesTaxByType
from .models.sales_tax_by_type_detail import SalesTaxByTypeDetail
from .models.sales_taxes_config import SalesTaxesConfig
from .models.sales_transaction_in import SalesTransactionIn
from .models.sales_transaction_out import SalesTransactionOut
from .models.sefaz_disable_range_in import SefazDisableRangeIn
from .models.sefaz_invoice_basic_status import SefazInvoiceBasicStatus
from .models.sefaz_invoice_status import SefazInvoiceStatus
from .models.sefaz_it_delete_in import SefazItDeleteIn
from .models.sefaz_it_get_out import SefazItGetOut
from .models.sefaz_it_put_in import SefazItPutIn
from .models.sefaz_post_out import SefazPostOut
from .models.service_item_tax_rate import ServiceItemTaxRate
from .models.service_item_tax_rate_period import ServiceItemTaxRatePeriod
from .models.service_rendered import ServiceRendered
from .models.simple_address import SimpleAddress
from .models.state_enum import StateEnum
from .models.state_transition import StateTransition
from .models.tax_by_type_summary_for_goods import TaxByTypeSummaryForGoods
from .models.tax_by_type_summary_for_service import TaxByTypeSummaryForService
from .models.tax_by_type_summary_jurisdiction import TaxByTypeSummaryJurisdiction
from .models.tax_by_type_summary_jurisdiction_for_goods import TaxByTypeSummaryJurisdictionForGoods
from .models.tax_by_type_tax import TaxByTypeTax
from .models.tax_conf import TaxConf
from .models.tax_type import TaxType
from .models.tax_type_rate import TaxTypeRate
from .models.tax_type_rate_withholding import TaxTypeRateWithholding
from .models.transaction_for_goods_in import TransactionForGoodsIn
from .models.transaction_for_goods_out import TransactionForGoodsOut
from .models.transaction_for_sefaz_goods import TransactionForSefazGoods
from .models.transaction_for_sefaz_goods_list import TransactionForSefazGoodsList
from .models.transport import Transport
from .models.transport_volumes import TransportVolumes
from .models.validation_error import ValidationError
from .models.vehicle import Vehicle
from .models.vehicle_id import VehicleID
from .models.vehicle_transp import VehicleTransp
from .models.weapon import Weapon
from .models.withhold_def import WithholdDef
from .models.withholding_mode import WithholdingMode

# import apis into sdk package
from .apis.agast_api import AGASTApi
from .apis.account_api import AccountApi
from .apis.address_api import AddressApi
from .apis.auth_api import AuthApi
from .apis.company_api import CompanyApi
from .apis.company_agast_api import CompanyAGASTApi
from .apis.company_files_api import CompanyFilesApi
from .apis.company_icms_api import CompanyICMSApi
from .apis.company_item_cpom_service_api import CompanyItemCPOMServiceApi
from .apis.company_item_goods_api import CompanyItemGoodsApi
from .apis.company_item_service_api import CompanyItemServiceApi
from .apis.company_location_api import CompanyLocationApi
from .apis.company_process_api import CompanyProcessApi
from .apis.company_tax_rates_api import CompanyTaxRatesApi
from .apis.goods_calculations_api import GoodsCalculationsApi
from .apis.goods_transactions_api import GoodsTransactionsApi
from .apis.invoice_contingency_api import InvoiceContingencyApi
from .apis.invoice_nf_ce_danfe_api import InvoiceNFCeDANFEApi
from .apis.invoice_n_fe_danfe_api import InvoiceNFeDANFEApi
from .apis.invoice_sefaz_api import InvoiceSEFAZApi
from .apis.invoice_settings_api import InvoiceSettingsApi
from .apis.legal_reason_api import LegalReasonApi
from .apis.service_calculations_api import ServiceCalculationsApi
from .apis.service_transactions_api import ServiceTransactionsApi
from .apis.tax_conf_cfop_api import TaxConfCFOPApi
from .apis.tax_conf_ibpt_api import TaxConfIBPTApi
from .apis.tax_conf_icms_api import TaxConfICMSApi
from .apis.tax_conf_iss_api import TaxConfISSApi
from .apis.tax_conf_process_api import TaxConfProcessApi

# import ApiClient
from .api_client import ApiClient

from .configuration import Configuration

configuration = Configuration()