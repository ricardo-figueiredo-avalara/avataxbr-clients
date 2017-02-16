package io.swagger.client.model

import org.joda.time.DateTime
import java.util.UUID


case class LineForGoods_di (
  customsValue: Option[Double],  // customs value, valor aduaneiro (II Block of NFe)
diNumber: String,  // Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
registerDateDI: Date,  // Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
clearanceSite: String,  // Clerance Site Local do desembaraço aduaneiro 
clearanceState: StateEnum,  // Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro 
clearanceDate: Option[Date],  // Clerance date
transportDIType: String,  // - &#39;1&#39; # Maritima - &#39;2&#39; # Fluvial - &#39;3&#39; # Lacustre - &#39;4&#39; # Aerea - &#39;5&#39; # Postal - &#39;6&#39; # Ferroviaria - &#39;7&#39; # Rodoviaria - &#39;8&#39; # Conduto - &#39;9&#39; # Meios Proprios - &#39;10&#39; # Entrada/Saida Ficta 
afrmmValue: Option[Double],  // Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] 
intermediateType: String,  // - &#39;1&#39; # On One&#39;s Own [1-por conta propria] - &#39;2&#39; # On Behalf And Order [2-por conta e ordem] - &#39;3&#39; # Order [3-encomenda] 
buyerFederalTaxID: Option[String],  // Buyer federal tax id CNPJ do comprador ou encomendante 
buyerState: Option[StateEnum],  // Buyer sate Estado do comprador ou encomendante 
exporterCode: Option[String],  // Exporter code
adi: List[LineForGoods_adi]  // aditional import declaration
)
