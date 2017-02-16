package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.ArrayList;
import io.swagger.model.LocationSecondaryStateTaxId;
import io.swagger.model.StateEnum;
import java.util.List;
@Canonical
class Location {

  /* Street Name */
  String street = null

  /* Neighborhood Name */
  String neighborhood = null

  /* Brazilian Zip Code */
  String zipcode = null

  /* City Code (IBGE) */
  String cityCode = null

  /* City Name */
  String cityName = null

    StateEnum state = null

  /* Country Code */
  String countryCode = "0"

  /* Use ISO 3166-1 alpha-3 codes */
  String country = "BRA"

  /* House number */
  String number = null

  /* Any other information about the address (Room, Suite, Floor, etc)). */
  String complement = null

  /* Phone number */
  String phone = null

  /* Company ID */
  String companyId = null

  /* this property identify the location, it is unique for this company */
  String code = null

  /* this property identify the location, it is unique for this company */
  String type = null

  /* Email */
  String email = null

  /* Federal tax id, CNPJ or CPF */
  String federalTaxId = null

  /* state tax id for this location */
  String stateTaxId = null

    List<LocationSecondaryStateTaxId> secondaryStateTaxId = new ArrayList<LocationSecondaryStateTaxId>()

  /* City Tax ID */
  String cityTaxId = null

    String suframa = null

  /* Main location activity */
  String mainActivity = null

  /* - 'edi' # City hall has web service and the integration is automatic - 'xml' # Create RPS specific to City, bat does not have webservice integration - 'rps' # Create a generic RPS, NF is by hands  */
  String nfseProcessModel = null
  

}

