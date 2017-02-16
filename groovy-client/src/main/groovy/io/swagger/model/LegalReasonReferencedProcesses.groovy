package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class LegalReasonReferencedProcesses {

  /* Process Identifier (NFe <nProc> tag) */
  String nProc = null

  /* Process Origin (NFe <indProc> tag) - '0' # SEFAZ; - '1' # Justiça Federal; - '2' # Justiça Estadual; - '3' # Secex/RFB; - '9' # Outros  */
  String indProc = null
  

}

