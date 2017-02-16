=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class DetailsCalculatedTax
    # This string captures the applicable location type. Location used for calc. Buyer or Seller
    attr_accessor :location_type

    # Jurisdiction used for calctax amount
    attr_accessor :jurisdiction_name

    # Type of jurisdiction
    attr_accessor :jurisdiction_type

    # Tax identificator
    attr_accessor :tax_type

    # Name of configuration rate
    attr_accessor :rate_type

    # This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
    attr_accessor :scenario

    # This decimal captures how much of the lineAmount was taxable by this tax, calc base
    attr_accessor :subtotal_taxable

    # This decimal captures the tax rate for this tax.3.00 (3%)
    attr_accessor :rate

    # This decimal captures how much of the lineAmount was taxable by this tax
    attr_accessor :tax

    # This string is required if is exempt
    attr_accessor :exemption_code

    # This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address
    attr_accessor :significant_locations

    # This string with type of rule
    attr_accessor :tax_rule_type

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
        :'location_type' => :'locationType',
        :'jurisdiction_name' => :'jurisdictionName',
        :'jurisdiction_type' => :'jurisdictionType',
        :'tax_type' => :'taxType',
        :'rate_type' => :'rateType',
        :'scenario' => :'scenario',
        :'subtotal_taxable' => :'subtotalTaxable',
        :'rate' => :'rate',
        :'tax' => :'tax',
        :'exemption_code' => :'exemptionCode',
        :'significant_locations' => :'significantLocations',
        :'tax_rule_type' => :'taxRuleType'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'location_type' => :'String',
        :'jurisdiction_name' => :'String',
        :'jurisdiction_type' => :'String',
        :'tax_type' => :'String',
        :'rate_type' => :'String',
        :'scenario' => :'String',
        :'subtotal_taxable' => :'Float',
        :'rate' => :'Float',
        :'tax' => :'Float',
        :'exemption_code' => :'String',
        :'significant_locations' => :'Array<String>',
        :'tax_rule_type' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'locationType')
        self.location_type = attributes[:'locationType']
      end

      if attributes.has_key?(:'jurisdictionName')
        self.jurisdiction_name = attributes[:'jurisdictionName']
      end

      if attributes.has_key?(:'jurisdictionType')
        self.jurisdiction_type = attributes[:'jurisdictionType']
      end

      if attributes.has_key?(:'taxType')
        self.tax_type = attributes[:'taxType']
      end

      if attributes.has_key?(:'rateType')
        self.rate_type = attributes[:'rateType']
      end

      if attributes.has_key?(:'scenario')
        self.scenario = attributes[:'scenario']
      end

      if attributes.has_key?(:'subtotalTaxable')
        self.subtotal_taxable = attributes[:'subtotalTaxable']
      end

      if attributes.has_key?(:'rate')
        self.rate = attributes[:'rate']
      end

      if attributes.has_key?(:'tax')
        self.tax = attributes[:'tax']
      end

      if attributes.has_key?(:'exemptionCode')
        self.exemption_code = attributes[:'exemptionCode']
      end

      if attributes.has_key?(:'significantLocations')
        if (value = attributes[:'significantLocations']).is_a?(Array)
          self.significant_locations = value
        end
      end

      if attributes.has_key?(:'taxRuleType')
        self.tax_rule_type = attributes[:'taxRuleType']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      jurisdiction_type_validator = EnumAttributeValidator.new('String', ["city", "state", "country"])
      return false unless jurisdiction_type_validator.valid?(@jurisdiction_type)
      tax_type_validator = EnumAttributeValidator.new('String', ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof", "aproxtribState", "aproxtribFed", "aproxtrib"])
      return false unless tax_type_validator.valid?(@tax_type)
      tax_rule_type_validator = EnumAttributeValidator.new('String', ["SELLER", "BUYER", "TRANSACTION", "ITEM", "TAX"])
      return false unless tax_rule_type_validator.valid?(@tax_rule_type)
      return true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] jurisdiction_type Object to be assigned
    def jurisdiction_type=(jurisdiction_type)
      validator = EnumAttributeValidator.new('String', ["city", "state", "country"])
      unless validator.valid?(jurisdiction_type)
        fail ArgumentError, "invalid value for 'jurisdiction_type', must be one of #{validator.allowable_values}."
      end
      @jurisdiction_type = jurisdiction_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] tax_type Object to be assigned
    def tax_type=(tax_type)
      validator = EnumAttributeValidator.new('String', ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof", "aproxtribState", "aproxtribFed", "aproxtrib"])
      unless validator.valid?(tax_type)
        fail ArgumentError, "invalid value for 'tax_type', must be one of #{validator.allowable_values}."
      end
      @tax_type = tax_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] tax_rule_type Object to be assigned
    def tax_rule_type=(tax_rule_type)
      validator = EnumAttributeValidator.new('String', ["SELLER", "BUYER", "TRANSACTION", "ITEM", "TAX"])
      unless validator.valid?(tax_rule_type)
        fail ArgumentError, "invalid value for 'tax_rule_type', must be one of #{validator.allowable_values}."
      end
      @tax_rule_type = tax_rule_type
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          location_type == o.location_type &&
          jurisdiction_name == o.jurisdiction_name &&
          jurisdiction_type == o.jurisdiction_type &&
          tax_type == o.tax_type &&
          rate_type == o.rate_type &&
          scenario == o.scenario &&
          subtotal_taxable == o.subtotal_taxable &&
          rate == o.rate &&
          tax == o.tax &&
          exemption_code == o.exemption_code &&
          significant_locations == o.significant_locations &&
          tax_rule_type == o.tax_rule_type
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [location_type, jurisdiction_name, jurisdiction_type, tax_type, rate_type, scenario, subtotal_taxable, rate, tax, exemption_code, significant_locations, tax_rule_type].hash
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