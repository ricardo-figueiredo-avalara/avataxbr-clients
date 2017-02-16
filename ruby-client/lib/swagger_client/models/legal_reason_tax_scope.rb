=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient
  # Filter this message application to specified tax cases. - taxtype - jurisdictionType 
  class LegalReasonTaxScope
    # This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX' 
    attr_accessor :tax_type

    # These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof' 
    attr_accessor :specialized_tax_type

    # Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country' 
    attr_accessor :jurisdiction_type

    # Code to identify the Jurisdiction
    attr_accessor :jurisdiction_ibge_code

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
        :'tax_type' => :'taxType',
        :'specialized_tax_type' => :'specializedTaxType',
        :'jurisdiction_type' => :'jurisdictionType',
        :'jurisdiction_ibge_code' => :'jurisdictionIbgeCode'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'tax_type' => :'String',
        :'specialized_tax_type' => :'String',
        :'jurisdiction_type' => :'String',
        :'jurisdiction_ibge_code' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'taxType')
        self.tax_type = attributes[:'taxType']
      end

      if attributes.has_key?(:'specializedTaxType')
        self.specialized_tax_type = attributes[:'specializedTaxType']
      end

      if attributes.has_key?(:'jurisdictionType')
        self.jurisdiction_type = attributes[:'jurisdictionType']
      end

      if attributes.has_key?(:'jurisdictionIbgeCode')
        self.jurisdiction_ibge_code = attributes[:'jurisdictionIbgeCode']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @tax_type.nil?
        invalid_properties.push("invalid value for 'tax_type', tax_type cannot be nil.")
      end

      if @jurisdiction_type.nil?
        invalid_properties.push("invalid value for 'jurisdiction_type', jurisdiction_type cannot be nil.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @tax_type.nil?
      tax_type_validator = EnumAttributeValidator.new('String', ["NONE", "INSS", "IRRF", "IRPJ", "PIS", "COFINS", "CSLL", "IPI", "ICMS", "II", "IOF", "ISS", "APROXTOTALTAX"])
      return false unless tax_type_validator.valid?(@tax_type)
      specialized_tax_type_validator = EnumAttributeValidator.new('String', ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof"])
      return false unless specialized_tax_type_validator.valid?(@specialized_tax_type)
      return false if @jurisdiction_type.nil?
      jurisdiction_type_validator = EnumAttributeValidator.new('String', ["NONE", "City", "State", "Country"])
      return false unless jurisdiction_type_validator.valid?(@jurisdiction_type)
      return true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] tax_type Object to be assigned
    def tax_type=(tax_type)
      validator = EnumAttributeValidator.new('String', ["NONE", "INSS", "IRRF", "IRPJ", "PIS", "COFINS", "CSLL", "IPI", "ICMS", "II", "IOF", "ISS", "APROXTOTALTAX"])
      unless validator.valid?(tax_type)
        fail ArgumentError, "invalid value for 'tax_type', must be one of #{validator.allowable_values}."
      end
      @tax_type = tax_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] specialized_tax_type Object to be assigned
    def specialized_tax_type=(specialized_tax_type)
      validator = EnumAttributeValidator.new('String', ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof"])
      unless validator.valid?(specialized_tax_type)
        fail ArgumentError, "invalid value for 'specialized_tax_type', must be one of #{validator.allowable_values}."
      end
      @specialized_tax_type = specialized_tax_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] jurisdiction_type Object to be assigned
    def jurisdiction_type=(jurisdiction_type)
      validator = EnumAttributeValidator.new('String', ["NONE", "City", "State", "Country"])
      unless validator.valid?(jurisdiction_type)
        fail ArgumentError, "invalid value for 'jurisdiction_type', must be one of #{validator.allowable_values}."
      end
      @jurisdiction_type = jurisdiction_type
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          tax_type == o.tax_type &&
          specialized_tax_type == o.specialized_tax_type &&
          jurisdiction_type == o.jurisdiction_type &&
          jurisdiction_ibge_code == o.jurisdiction_ibge_code
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [tax_type, specialized_tax_type, jurisdiction_type, jurisdiction_ibge_code].hash
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