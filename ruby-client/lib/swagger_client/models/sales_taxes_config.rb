=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class SalesTaxesConfig
    # There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
    attr_accessor :accruable_cofins_taxation

    # There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT 
    attr_accessor :accruable_csll_taxation

    # There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - 'T' # TAXABLE - 'N' # NOT TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'S' # SPECIFIC RATE 
    attr_accessor :accruable_pis_taxation

    # This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
    attr_accessor :accruable_cofins_exemp_code_taxation

    # This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption
    attr_accessor :accruable_pis_exemp_code_taxation

    # Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    attr_accessor :withholding_cofins

    # Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    attr_accessor :withholding_csll

    # Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    attr_accessor :withholding_irrf

    # Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.
    attr_accessor :withholding_pis

    # When property withholdingIRRF is false is mandatory inform the reason
    attr_accessor :withhold_irrf_exempt_reason_taxation

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
        :'accruable_cofins_taxation' => :'accruableCOFINSTaxation',
        :'accruable_csll_taxation' => :'accruableCSLLTaxation',
        :'accruable_pis_taxation' => :'accruablePISTaxation',
        :'accruable_cofins_exemp_code_taxation' => :'accruableCOFINSExempCodeTaxation',
        :'accruable_pis_exemp_code_taxation' => :'accruablePISExempCodeTaxation',
        :'withholding_cofins' => :'withholdingCOFINS',
        :'withholding_csll' => :'withholdingCSLL',
        :'withholding_irrf' => :'withholdingIRRF',
        :'withholding_pis' => :'withholdingPIS',
        :'withhold_irrf_exempt_reason_taxation' => :'withholdIRRFExemptReasonTaxation'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'accruable_cofins_taxation' => :'String',
        :'accruable_csll_taxation' => :'String',
        :'accruable_pis_taxation' => :'String',
        :'accruable_cofins_exemp_code_taxation' => :'String',
        :'accruable_pis_exemp_code_taxation' => :'String',
        :'withholding_cofins' => :'BOOLEAN',
        :'withholding_csll' => :'BOOLEAN',
        :'withholding_irrf' => :'BOOLEAN',
        :'withholding_pis' => :'BOOLEAN',
        :'withhold_irrf_exempt_reason_taxation' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'accruableCOFINSTaxation')
        self.accruable_cofins_taxation = attributes[:'accruableCOFINSTaxation']
      end

      if attributes.has_key?(:'accruableCSLLTaxation')
        self.accruable_csll_taxation = attributes[:'accruableCSLLTaxation']
      end

      if attributes.has_key?(:'accruablePISTaxation')
        self.accruable_pis_taxation = attributes[:'accruablePISTaxation']
      end

      if attributes.has_key?(:'accruableCOFINSExempCodeTaxation')
        self.accruable_cofins_exemp_code_taxation = attributes[:'accruableCOFINSExempCodeTaxation']
      end

      if attributes.has_key?(:'accruablePISExempCodeTaxation')
        self.accruable_pis_exemp_code_taxation = attributes[:'accruablePISExempCodeTaxation']
      end

      if attributes.has_key?(:'withholdingCOFINS')
        self.withholding_cofins = attributes[:'withholdingCOFINS']
      end

      if attributes.has_key?(:'withholdingCSLL')
        self.withholding_csll = attributes[:'withholdingCSLL']
      end

      if attributes.has_key?(:'withholdingIRRF')
        self.withholding_irrf = attributes[:'withholdingIRRF']
      end

      if attributes.has_key?(:'withholdingPIS')
        self.withholding_pis = attributes[:'withholdingPIS']
      end

      if attributes.has_key?(:'withholdIRRFExemptReasonTaxation')
        self.withhold_irrf_exempt_reason_taxation = attributes[:'withholdIRRFExemptReasonTaxation']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@accruable_cofins_exemp_code_taxation.nil? && @accruable_cofins_exemp_code_taxation !~ Regexp.new(/[0-9]{3}/)
        invalid_properties.push("invalid value for 'accruable_cofins_exemp_code_taxation', must conform to the pattern /[0-9]{3}/.")
      end

      if !@accruable_pis_exemp_code_taxation.nil? && @accruable_pis_exemp_code_taxation !~ Regexp.new(/[0-9]{3}/)
        invalid_properties.push("invalid value for 'accruable_pis_exemp_code_taxation', must conform to the pattern /[0-9]{3}/.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      accruable_cofins_taxation_validator = EnumAttributeValidator.new('String', ["T", "N", "Z", "E", "H", "S"])
      return false unless accruable_cofins_taxation_validator.valid?(@accruable_cofins_taxation)
      accruable_csll_taxation_validator = EnumAttributeValidator.new('String', ["T", "E"])
      return false unless accruable_csll_taxation_validator.valid?(@accruable_csll_taxation)
      accruable_pis_taxation_validator = EnumAttributeValidator.new('String', ["T", "N", "Z", "E", "H", "S"])
      return false unless accruable_pis_taxation_validator.valid?(@accruable_pis_taxation)
      return false if !@accruable_cofins_exemp_code_taxation.nil? && @accruable_cofins_exemp_code_taxation !~ Regexp.new(/[0-9]{3}/)
      return false if !@accruable_pis_exemp_code_taxation.nil? && @accruable_pis_exemp_code_taxation !~ Regexp.new(/[0-9]{3}/)
      return true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] accruable_cofins_taxation Object to be assigned
    def accruable_cofins_taxation=(accruable_cofins_taxation)
      validator = EnumAttributeValidator.new('String', ["T", "N", "Z", "E", "H", "S"])
      unless validator.valid?(accruable_cofins_taxation)
        fail ArgumentError, "invalid value for 'accruable_cofins_taxation', must be one of #{validator.allowable_values}."
      end
      @accruable_cofins_taxation = accruable_cofins_taxation
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

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] accruable_pis_taxation Object to be assigned
    def accruable_pis_taxation=(accruable_pis_taxation)
      validator = EnumAttributeValidator.new('String', ["T", "N", "Z", "E", "H", "S"])
      unless validator.valid?(accruable_pis_taxation)
        fail ArgumentError, "invalid value for 'accruable_pis_taxation', must be one of #{validator.allowable_values}."
      end
      @accruable_pis_taxation = accruable_pis_taxation
    end

    # Custom attribute writer method with validation
    # @param [Object] accruable_cofins_exemp_code_taxation Value to be assigned
    def accruable_cofins_exemp_code_taxation=(accruable_cofins_exemp_code_taxation)

      if !accruable_cofins_exemp_code_taxation.nil? && accruable_cofins_exemp_code_taxation !~ Regexp.new(/[0-9]{3}/)
        fail ArgumentError, "invalid value for 'accruable_cofins_exemp_code_taxation', must conform to the pattern /[0-9]{3}/."
      end

      @accruable_cofins_exemp_code_taxation = accruable_cofins_exemp_code_taxation
    end

    # Custom attribute writer method with validation
    # @param [Object] accruable_pis_exemp_code_taxation Value to be assigned
    def accruable_pis_exemp_code_taxation=(accruable_pis_exemp_code_taxation)

      if !accruable_pis_exemp_code_taxation.nil? && accruable_pis_exemp_code_taxation !~ Regexp.new(/[0-9]{3}/)
        fail ArgumentError, "invalid value for 'accruable_pis_exemp_code_taxation', must conform to the pattern /[0-9]{3}/."
      end

      @accruable_pis_exemp_code_taxation = accruable_pis_exemp_code_taxation
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          accruable_cofins_taxation == o.accruable_cofins_taxation &&
          accruable_csll_taxation == o.accruable_csll_taxation &&
          accruable_pis_taxation == o.accruable_pis_taxation &&
          accruable_cofins_exemp_code_taxation == o.accruable_cofins_exemp_code_taxation &&
          accruable_pis_exemp_code_taxation == o.accruable_pis_exemp_code_taxation &&
          withholding_cofins == o.withholding_cofins &&
          withholding_csll == o.withholding_csll &&
          withholding_irrf == o.withholding_irrf &&
          withholding_pis == o.withholding_pis &&
          withhold_irrf_exempt_reason_taxation == o.withhold_irrf_exempt_reason_taxation
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [accruable_cofins_taxation, accruable_csll_taxation, accruable_pis_taxation, accruable_cofins_exemp_code_taxation, accruable_pis_exemp_code_taxation, withholding_cofins, withholding_csll, withholding_irrf, withholding_pis, withhold_irrf_exempt_reason_taxation].hash
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
