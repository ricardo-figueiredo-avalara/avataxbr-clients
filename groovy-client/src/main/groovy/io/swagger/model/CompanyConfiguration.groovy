package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
@Canonical
class CompanyConfiguration {

  /* digital certificate A1 model, p12, encoded by base64 */
  String certificate = null

  /* certificate password */
  String certificatepwd = null

  /* expiration date of this certificate */
  Date certificateexpiration = null

  /* company logo image encoded by base64 */
  String logo = null

  /* how the document will be printed - '0' # without DANFE; - '1' # DANFe Letter; - '2' # DANFe Landscape;  */
  String tpImpNFe = null

  /* how the document will be printed - '0' # without DANFE; - '4' # DANFe NFC-e; - '5' # DANFe NFC-e e-mail  */
  String tpImpNFCe = null
  

}

