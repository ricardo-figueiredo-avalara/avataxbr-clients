=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class Agast
    # Agast Code. AGAST (Avalara Goods and Services Types) are preset products with default tax definitions available to be used as provided or copied to create an specific comapany item.
    attr_accessor :code

    # Agast Description
    attr_accessor :description

    # harmonized code, NCM or LC 116
    attr_accessor :hs_code

    # hsCode Exception for IPI tax
    attr_accessor :ex

    # tax substitution code - Codigo especificador da Substuicao Tributaria
    attr_accessor :cest

    # GTIN NUMBER
    attr_accessor :cean

    attr_accessor :code_type

    # Inform if this process is subject to IPI taxation on output process - 'T'  # TAXABLE - 'Z'  # TAXABLE WITH RATE=0.00 - 'E'  # EXEMPT - 'N'  # NO TAXABLE     - 'I'  # IMMUNE 
    attr_accessor :cst_ipi

    # Legal tax classificação for IPI (enquadramento tributário) When the process has CST IPI 52 or 54, it is mandatory to inform a Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU= 
    attr_accessor :ipi_legal_tax_class

    # when the company is Real Profit inform if this item is cumulative or no cumulative by default
    attr_accessor :pis_cofins_tax_reporting

    # Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
    attr_accessor :accruable_pis_taxation

    # When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
    attr_accessor :pis_exempt_legal_reason_code

    # When specified a reason, this field holds the reason's description
    attr_accessor :pis_exempt_legal_reason

    # Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE 
    attr_accessor :accruable_cofins_taxation

    # When exempt, taxable with zero rate, suspended, not taxable, this field informs the official code number for the exemption
    attr_accessor :cofins_exempt_legal_reason_code

    # When specified a reason, this field holds the reason's description
    attr_accessor :cofins_exempt_legal_reason

    # Inform if this item by nature is subject to CSLL taxation or exempt - 'T' # TAXABLE - 'E' # EXEMPT 
    attr_accessor :accruable_csll_taxation

    attr_accessor :csll_exempt_legal_reason

    attr_accessor :csll_exempt_legal_reason_code

    attr_accessor :withholding

    # for service items with City Jurisdiction, inform where the ISS tax is due
    attr_accessor :iss_dueat_destination

    # on Real Profit Purchase transaction, inform if this item allows tax credits when it is non-cumulative
    attr_accessor :pis_cofins_credit_not_allowed

    # - 'T' # TAXABLE - TRIBUTÁVEL INCLUSIVE PARA EXPORTAÇÃO' - 'E' # TAXABLE WITH EXEMPTION FOR EXPORTS - ISENTO PARA SERVIÇOS PRESTADOS AO EXTERIOR (DEFAULT) - 'F' # EXEMPT - 'A' # SUSPENDED FOR ADMINISTRATIVE REASON - 'L' # SUSPENDED FOR LEGAL DECISION - 'I' # IMMUNE 
    attr_accessor :iss_taxation

    # This is an array of tax object related to an agast.
    attr_accessor :federal_tax_rate

    attr_accessor :special_product_class

    # One per State
    attr_accessor :icms_conf

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'code' => :'code',
        :'description' => :'description',
        :'hs_code' => :'hsCode',
        :'ex' => :'ex',
        :'cest' => :'cest',
        :'cean' => :'cean',
        :'code_type' => :'codeType',
        :'cst_ipi' => :'cstIPI',
        :'ipi_legal_tax_class' => :'ipiLegalTaxClass',
        :'pis_cofins_tax_reporting' => :'pisCofinsTaxReporting',
        :'accruable_pis_taxation' => :'accruablePISTaxation',
        :'pis_exempt_legal_reason_code' => :'pisExemptLegalReasonCode',
        :'pis_exempt_legal_reason' => :'pisExemptLegalReason',
        :'accruable_cofins_taxation' => :'accruableCOFINSTaxation',
        :'cofins_exempt_legal_reason_code' => :'cofinsExemptLegalReasonCode',
        :'cofins_exempt_legal_reason' => :'cofinsExemptLegalReason',
        :'accruable_csll_taxation' => :'accruableCSLLTaxation',
        :'csll_exempt_legal_reason' => :'csllExemptLegalReason',
        :'csll_exempt_legal_reason_code' => :'csllExemptLegalReasonCode',
        :'withholding' => :'withholding',
        :'iss_dueat_destination' => :'issDueatDestination',
        :'pis_cofins_credit_not_allowed' => :'pisCofinsCreditNotAllowed',
        :'iss_taxation' => :'issTaxation',
        :'federal_tax_rate' => :'federalTaxRate',
        :'special_product_class' => :'specialProductClass',
        :'icms_conf' => :'icmsConf'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'code' => :'String',
        :'description' => :'String',
        :'hs_code' => :'String',
        :'ex' => :'Integer',
        :'cest' => :'String',
        :'cean' => :'String',
        :'code_type' => :'AgastCodeType',
        :'cst_ipi' => :'String',
        :'ipi_legal_tax_class' => :'String',
        :'pis_cofins_tax_reporting' => :'String',
        :'accruable_pis_taxation' => :'String',
        :'pis_exempt_legal_reason_code' => :'String',
        :'pis_exempt_legal_reason' => :'String',
        :'accruable_cofins_taxation' => :'String',
        :'cofins_exempt_legal_reason_code' => :'String',
        :'cofins_exempt_legal_reason' => :'String',
        :'accruable_csll_taxation' => :'String',
        :'csll_exempt_legal_reason' => :'String',
        :'csll_exempt_legal_reason_code' => :'String',
        :'withholding' => :'AgastWithholding',
        :'iss_dueat_destination' => :'BOOLEAN',
        :'pis_cofins_credit_not_allowed' => :'BOOLEAN',
        :'iss_taxation' => :'String',
        :'federal_tax_rate' => :'Array<TaxTypeRate>',
        :'special_product_class' => :'String',
        :'icms_conf' => :'Array<AgastIcmsConf>'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'code')
        self.code = attributes[:'code']
      end

      if attributes.has_key?(:'description')
        self.description = attributes[:'description']
      end

      if attributes.has_key?(:'hsCode')
        self.hs_code = attributes[:'hsCode']
      end

      if attributes.has_key?(:'ex')
        self.ex = attributes[:'ex']
      end

      if attributes.has_key?(:'cest')
        self.cest = attributes[:'cest']
      end

      if attributes.has_key?(:'cean')
        self.cean = attributes[:'cean']
      end

      if attributes.has_key?(:'codeType')
        self.code_type = attributes[:'codeType']
      end

      if attributes.has_key?(:'cstIPI')
        self.cst_ipi = attributes[:'cstIPI']
      end

      if attributes.has_key?(:'ipiLegalTaxClass')
        self.ipi_legal_tax_class = attributes[:'ipiLegalTaxClass']
      end

      if attributes.has_key?(:'pisCofinsTaxReporting')
        self.pis_cofins_tax_reporting = attributes[:'pisCofinsTaxReporting']
      end

      if attributes.has_key?(:'accruablePISTaxation')
        self.accruable_pis_taxation = attributes[:'accruablePISTaxation']
      end

      if attributes.has_key?(:'pisExemptLegalReasonCode')
        self.pis_exempt_legal_reason_code = attributes[:'pisExemptLegalReasonCode']
      end

      if attributes.has_key?(:'pisExemptLegalReason')
        self.pis_exempt_legal_reason = attributes[:'pisExemptLegalReason']
      end

      if attributes.has_key?(:'accruableCOFINSTaxation')
        self.accruable_cofins_taxation = attributes[:'accruableCOFINSTaxation']
      end

      if attributes.has_key?(:'cofinsExemptLegalReasonCode')
        self.cofins_exempt_legal_reason_code = attributes[:'cofinsExemptLegalReasonCode']
      end

      if attributes.has_key?(:'cofinsExemptLegalReason')
        self.cofins_exempt_legal_reason = attributes[:'cofinsExemptLegalReason']
      end

      if attributes.has_key?(:'accruableCSLLTaxation')
        self.accruable_csll_taxation = attributes[:'accruableCSLLTaxation']
      end

      if attributes.has_key?(:'csllExemptLegalReason')
        self.csll_exempt_legal_reason = attributes[:'csllExemptLegalReason']
      end

      if attributes.has_key?(:'csllExemptLegalReasonCode')
        self.csll_exempt_legal_reason_code = attributes[:'csllExemptLegalReasonCode']
      end

      if attributes.has_key?(:'withholding')
        self.withholding = attributes[:'withholding']
      end

      if attributes.has_key?(:'issDueatDestination')
        self.iss_dueat_destination = attributes[:'issDueatDestination']
      end

      if attributes.has_key?(:'pisCofinsCreditNotAllowed')
        self.pis_cofins_credit_not_allowed = attributes[:'pisCofinsCreditNotAllowed']
      end

      if attributes.has_key?(:'issTaxation')
        self.iss_taxation = attributes[:'issTaxation']
      end

      if attributes.has_key?(:'federalTaxRate')
        if (value = attributes[:'federalTaxRate']).is_a?(Array)
          self.federal_tax_rate = value
        end
      end

      if attributes.has_key?(:'specialProductClass')
        self.special_product_class = attributes[:'specialProductClass']
      end

      if attributes.has_key?(:'icmsConf')
        if (value = attributes[:'icmsConf']).is_a?(Array)
          self.icms_conf = value
        end
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @code.nil?
        invalid_properties.push("invalid value for 'code', code cannot be nil.")
      end

      if !@description.nil? && @description.to_s.length > 200
        invalid_properties.push("invalid value for 'description', the character length must be smaller than or equal to 200.")
      end

      if !@hs_code.nil? && @hs_code.to_s.length > 8
        invalid_properties.push("invalid value for 'hs_code', the character length must be smaller than or equal to 8.")
      end

      if !@cest.nil? && @cest !~ Regexp.new(/[0-9]{7}/)
        invalid_properties.push("invalid value for 'cest', must conform to the pattern /[0-9]{7}/.")
      end

      if !@cean.nil? && @cean !~ Regexp.new(/[0-9]{0}|[0-9]{8}|[0-9]{12,14}/)
        invalid_properties.push("invalid value for 'cean', must conform to the pattern /[0-9]{0}|[0-9]{8}|[0-9]{12,14}/.")
      end

      if !@pis_exempt_legal_reason.nil? && @pis_exempt_legal_reason.to_s.length > 1024
        invalid_properties.push("invalid value for 'pis_exempt_legal_reason', the character length must be smaller than or equal to 1024.")
      end

      if !@cofins_exempt_legal_reason.nil? && @cofins_exempt_legal_reason.to_s.length > 1024
        invalid_properties.push("invalid value for 'cofins_exempt_legal_reason', the character length must be smaller than or equal to 1024.")
      end

      if !@csll_exempt_legal_reason.nil? && @csll_exempt_legal_reason.to_s.length > 1024
        invalid_properties.push("invalid value for 'csll_exempt_legal_reason', the character length must be smaller than or equal to 1024.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @code.nil?
      return false if !@description.nil? && @description.to_s.length > 200
      return false if !@hs_code.nil? && @hs_code.to_s.length > 8
      return false if !@cest.nil? && @cest !~ Regexp.new(/[0-9]{7}/)
      return false if !@cean.nil? && @cean !~ Regexp.new(/[0-9]{0}|[0-9]{8}|[0-9]{12,14}/)
      cst_ipi_validator = EnumAttributeValidator.new('String', ["T", "Z", "E", "N", "I"])
      return false unless cst_ipi_validator.valid?(@cst_ipi)
      pis_cofins_tax_reporting_validator = EnumAttributeValidator.new('String', ["cumulative", "noCumulative"])
      return false unless pis_cofins_tax_reporting_validator.valid?(@pis_cofins_tax_reporting)
      accruable_pis_taxation_validator = EnumAttributeValidator.new('String', ["T", "Z", "E", "H", "N"])
      return false unless accruable_pis_taxation_validator.valid?(@accruable_pis_taxation)
      return false if !@pis_exempt_legal_reason.nil? && @pis_exempt_legal_reason.to_s.length > 1024
      accruable_cofins_taxation_validator = EnumAttributeValidator.new('String', ["T", "Z", "E", "H", "N"])
      return false unless accruable_cofins_taxation_validator.valid?(@accruable_cofins_taxation)
      return false if !@cofins_exempt_legal_reason.nil? && @cofins_exempt_legal_reason.to_s.length > 1024
      accruable_csll_taxation_validator = EnumAttributeValidator.new('String', ["T", "E"])
      return false unless accruable_csll_taxation_validator.valid?(@accruable_csll_taxation)
      return false if !@csll_exempt_legal_reason.nil? && @csll_exempt_legal_reason.to_s.length > 1024
      iss_taxation_validator = EnumAttributeValidator.new('String', ["T", "E", "F", "A", "L", "I"])
      return false unless iss_taxation_validator.valid?(@iss_taxation)
      special_product_class_validator = EnumAttributeValidator.new('String', ["OTHERS", "COMMUNICATION", "ENERGY", "TRANSPORT", "FUEL AND LUBRIFICANT", "VEHICLE", "ALCOHOLIC BEVERAGES", "WEAPONS", "AMMO", "PERFUME", "TOBACCO"])
      return false unless special_product_class_validator.valid?(@special_product_class)
      return true
    end

    # Custom attribute writer method with validation
    # @param [Object] description Value to be assigned
    def description=(description)

      if !description.nil? && description.to_s.length > 200
        fail ArgumentError, "invalid value for 'description', the character length must be smaller than or equal to 200."
      end

      @description = description
    end

    # Custom attribute writer method with validation
    # @param [Object] hs_code Value to be assigned
    def hs_code=(hs_code)

      if !hs_code.nil? && hs_code.to_s.length > 8
        fail ArgumentError, "invalid value for 'hs_code', the character length must be smaller than or equal to 8."
      end

      @hs_code = hs_code
    end

    # Custom attribute writer method with validation
    # @param [Object] cest Value to be assigned
    def cest=(cest)

      if !cest.nil? && cest !~ Regexp.new(/[0-9]{7}/)
        fail ArgumentError, "invalid value for 'cest', must conform to the pattern /[0-9]{7}/."
      end

      @cest = cest
    end

    # Custom attribute writer method with validation
    # @param [Object] cean Value to be assigned
    def cean=(cean)

      if !cean.nil? && cean !~ Regexp.new(/[0-9]{0}|[0-9]{8}|[0-9]{12,14}/)
        fail ArgumentError, "invalid value for 'cean', must conform to the pattern /[0-9]{0}|[0-9]{8}|[0-9]{12,14}/."
      end

      @cean = cean
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] cst_ipi Object to be assigned
    def cst_ipi=(cst_ipi)
      validator = EnumAttributeValidator.new('String', ["T", "Z", "E", "N", "I"])
      unless validator.valid?(cst_ipi)
        fail ArgumentError, "invalid value for 'cst_ipi', must be one of #{validator.allowable_values}."
      end
      @cst_ipi = cst_ipi
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] pis_cofins_tax_reporting Object to be assigned
    def pis_cofins_tax_reporting=(pis_cofins_tax_reporting)
      validator = EnumAttributeValidator.new('String', ["cumulative", "noCumulative"])
      unless validator.valid?(pis_cofins_tax_reporting)
        fail ArgumentError, "invalid value for 'pis_cofins_tax_reporting', must be one of #{validator.allowable_values}."
      end
      @pis_cofins_tax_reporting = pis_cofins_tax_reporting
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] accruable_pis_taxation Object to be assigned
    def accruable_pis_taxation=(accruable_pis_taxation)
      validator = EnumAttributeValidator.new('String', ["T", "Z", "E", "H", "N"])
      unless validator.valid?(accruable_pis_taxation)
        fail ArgumentError, "invalid value for 'accruable_pis_taxation', must be one of #{validator.allowable_values}."
      end
      @accruable_pis_taxation = accruable_pis_taxation
    end

    # Custom attribute writer method with validation
    # @param [Object] pis_exempt_legal_reason Value to be assigned
    def pis_exempt_legal_reason=(pis_exempt_legal_reason)

      if !pis_exempt_legal_reason.nil? && pis_exempt_legal_reason.to_s.length > 1024
        fail ArgumentError, "invalid value for 'pis_exempt_legal_reason', the character length must be smaller than or equal to 1024."
      end

      @pis_exempt_legal_reason = pis_exempt_legal_reason
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] accruable_cofins_taxation Object to be assigned
    def accruable_cofins_taxation=(accruable_cofins_taxation)
      validator = EnumAttributeValidator.new('String', ["T", "Z", "E", "H", "N"])
      unless validator.valid?(accruable_cofins_taxation)
        fail ArgumentError, "invalid value for 'accruable_cofins_taxation', must be one of #{validator.allowable_values}."
      end
      @accruable_cofins_taxation = accruable_cofins_taxation
    end

    # Custom attribute writer method with validation
    # @param [Object] cofins_exempt_legal_reason Value to be assigned
    def cofins_exempt_legal_reason=(cofins_exempt_legal_reason)

      if !cofins_exempt_legal_reason.nil? && cofins_exempt_legal_reason.to_s.length > 1024
        fail ArgumentError, "invalid value for 'cofins_exempt_legal_reason', the character length must be smaller than or equal to 1024."
      end

      @cofins_exempt_legal_reason = cofins_exempt_legal_reason
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] accruable_csll_taxation Object to be assigned
    def accruable_csll_taxation=(accruable_csll_taxation)
      validator = EnumAttributeValidator.new('String', ["T", "E"])
      unless validator.valid?(accruable_csll_taxation)
        fail ArgumentError, "invalid value for 'accruable_csll_taxation', must be one of #{validator.allowable_values}."
      end
      @accruable_csll_taxation = accruable_csll_taxation
    end

    # Custom attribute writer method with validation
    # @param [Object] csll_exempt_legal_reason Value to be assigned
    def csll_exempt_legal_reason=(csll_exempt_legal_reason)

      if !csll_exempt_legal_reason.nil? && csll_exempt_legal_reason.to_s.length > 1024
        fail ArgumentError, "invalid value for 'csll_exempt_legal_reason', the character length must be smaller than or equal to 1024."
      end

      @csll_exempt_legal_reason = csll_exempt_legal_reason
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] iss_taxation Object to be assigned
    def iss_taxation=(iss_taxation)
      validator = EnumAttributeValidator.new('String', ["T", "E", "F", "A", "L", "I"])
      unless validator.valid?(iss_taxation)
        fail ArgumentError, "invalid value for 'iss_taxation', must be one of #{validator.allowable_values}."
      end
      @iss_taxation = iss_taxation
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] special_product_class Object to be assigned
    def special_product_class=(special_product_class)
      validator = EnumAttributeValidator.new('String', ["OTHERS", "COMMUNICATION", "ENERGY", "TRANSPORT", "FUEL AND LUBRIFICANT", "VEHICLE", "ALCOHOLIC BEVERAGES", "WEAPONS", "AMMO", "PERFUME", "TOBACCO"])
      unless validator.valid?(special_product_class)
        fail ArgumentError, "invalid value for 'special_product_class', must be one of #{validator.allowable_values}."
      end
      @special_product_class = special_product_class
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          code == o.code &&
          description == o.description &&
          hs_code == o.hs_code &&
          ex == o.ex &&
          cest == o.cest &&
          cean == o.cean &&
          code_type == o.code_type &&
          cst_ipi == o.cst_ipi &&
          ipi_legal_tax_class == o.ipi_legal_tax_class &&
          pis_cofins_tax_reporting == o.pis_cofins_tax_reporting &&
          accruable_pis_taxation == o.accruable_pis_taxation &&
          pis_exempt_legal_reason_code == o.pis_exempt_legal_reason_code &&
          pis_exempt_legal_reason == o.pis_exempt_legal_reason &&
          accruable_cofins_taxation == o.accruable_cofins_taxation &&
          cofins_exempt_legal_reason_code == o.cofins_exempt_legal_reason_code &&
          cofins_exempt_legal_reason == o.cofins_exempt_legal_reason &&
          accruable_csll_taxation == o.accruable_csll_taxation &&
          csll_exempt_legal_reason == o.csll_exempt_legal_reason &&
          csll_exempt_legal_reason_code == o.csll_exempt_legal_reason_code &&
          withholding == o.withholding &&
          iss_dueat_destination == o.iss_dueat_destination &&
          pis_cofins_credit_not_allowed == o.pis_cofins_credit_not_allowed &&
          iss_taxation == o.iss_taxation &&
          federal_tax_rate == o.federal_tax_rate &&
          special_product_class == o.special_product_class &&
          icms_conf == o.icms_conf
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [code, description, hs_code, ex, cest, cean, code_type, cst_ipi, ipi_legal_tax_class, pis_cofins_tax_reporting, accruable_pis_taxation, pis_exempt_legal_reason_code, pis_exempt_legal_reason, accruable_cofins_taxation, cofins_exempt_legal_reason_code, cofins_exempt_legal_reason, accruable_csll_taxation, csll_exempt_legal_reason, csll_exempt_legal_reason_code, withholding, iss_dueat_destination, pis_cofins_credit_not_allowed, iss_taxation, federal_tax_rate, special_product_class, icms_conf].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map{ |v| _deserialize($1, v) } )
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SwaggerClient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map{ |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
