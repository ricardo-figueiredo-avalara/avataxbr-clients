package io.swagger.client

import io.swagger.client.api._

import com.wordnik.swagger.client._

import java.io.Closeable

class SwaggerClient(config: SwaggerConfig) extends Closeable {
  val locator = config.locator
  val name = config.name

  private[this] val client = transportClient

  protected def transportClient: TransportClient = new RestClient(config)
  
  val aGAST = new AGASTApi(client, config)
  
  val account = new AccountApi(client, config)
  
  val address = new AddressApi(client, config)
  
  val auth = new AuthApi(client, config)
  
  val company = new CompanyApi(client, config)
  
  val companyAGAST = new CompanyAGASTApi(client, config)
  
  val companyFiles = new CompanyFilesApi(client, config)
  
  val companyICMS = new CompanyICMSApi(client, config)
  
  val companyItemCPOMService = new CompanyItemCPOMServiceApi(client, config)
  
  val companyItemGoods = new CompanyItemGoodsApi(client, config)
  
  val companyItemService = new CompanyItemServiceApi(client, config)
  
  val companyLocation = new CompanyLocationApi(client, config)
  
  val companyProcess = new CompanyProcessApi(client, config)
  
  val companyTaxRates = new CompanyTaxRatesApi(client, config)
  
  val goodsCalculations = new GoodsCalculationsApi(client, config)
  
  val goodsTransactions = new GoodsTransactionsApi(client, config)
  
  val invoiceContingency = new InvoiceContingencyApi(client, config)
  
  val invoiceNFCeDANFE = new InvoiceNFCeDANFEApi(client, config)
  
  val invoiceNFeDANFE = new InvoiceNFeDANFEApi(client, config)
  
  val invoiceSEFAZ = new InvoiceSEFAZApi(client, config)
  
  val invoiceSettings = new InvoiceSettingsApi(client, config)
  
  val legalReason = new LegalReasonApi(client, config)
  
  val serviceCalculations = new ServiceCalculationsApi(client, config)
  
  val serviceTransactions = new ServiceTransactionsApi(client, config)
  
  val taxConfCFOP = new TaxConfCFOPApi(client, config)
  
  val taxConfIBPT = new TaxConfIBPTApi(client, config)
  
  val taxConfICMS = new TaxConfICMSApi(client, config)
  
  val taxConfISS = new TaxConfISSApi(client, config)
  
  val taxConfProcess = new TaxConfProcessApi(client, config)
  

  def close() {
    client.close()
  }
}
