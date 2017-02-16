package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.LineForGoodsAdi;
import io.swagger.model.StateEnum;
import java.util.List;
@Canonical
class LineForGoodsDi {

  /* customs value, valor aduaneiro (II Block of NFe) */
  Double customsValue = null

  /* Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) */
  String diNumber = null

  /* Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E) */
  Date registerDateDI = null

  /* Clerance Site Local do desembaraço aduaneiro  */
  String clearanceSite = null

  /* Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro  */
  StateEnum clearanceState = null

  /* Clerance date */
  Date clearanceDate = null

  /* - '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta  */
  String transportDIType = null

  /* Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante]  */
  Double afrmmValue = null

  /* - '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda]  */
  String intermediateType = null

  /* Buyer federal tax id CNPJ do comprador ou encomendante  */
  String buyerFederalTaxID = null

  /* Buyer sate Estado do comprador ou encomendante  */
  StateEnum buyerState = null

  /* Exporter code */
  String exporterCode = null

  /* aditional import declaration */
  List<LineForGoodsAdi> adi = new ArrayList<LineForGoodsAdi>()
  

}

