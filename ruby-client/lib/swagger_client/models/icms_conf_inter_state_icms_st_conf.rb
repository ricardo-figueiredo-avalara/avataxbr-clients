=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class IcmsConfInterStateIcmsSTConf
    attr_accessor :protocol_type

    # inform that substituted is tax regime Simplified the operation MVA will be reduced
    attr_accessor :has_reduction_of_mva_for_simples

    # MVA reduction when substituted is tax regime Simplified.
    attr_accessor :reduction_of_mva_for_simples

    # how this ICMS-ST will be calculed for itens linked to this configuration
    attr_accessor :calc_mode

    # ICMS rate - Redução da BC ICMS ST (%)
    attr_accessor :icms_st_base_discount

    # ICMS-ST MVA rate to define calc base
    attr_accessor :mva_rate

    # SRP or MSRP amount base for this ICMS-ST configuration
    attr_accessor :srp

    # unit used to SRP amount value
    attr_accessor :srp_unit

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
        :'protocol_type' => :'protocolType',
        :'has_reduction_of_mva_for_simples' => :'hasReductionOfMVAForSimples',
        :'reduction_of_mva_for_simples' => :'reductionOfMVAForSimples',
        :'calc_mode' => :'calcMode',
        :'icms_st_base_discount' => :'icmsStBaseDiscount',
        :'mva_rate' => :'mvaRate',
        :'srp' => :'srp',
        :'srp_unit' => :'srpUnit'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'protocol_type' => :'String',
        :'has_reduction_of_mva_for_simples' => :'BOOLEAN',
        :'reduction_of_mva_for_simples' => :'Float',
        :'calc_mode' => :'String',
        :'icms_st_base_discount' => :'Float',
        :'mva_rate' => :'Float',
        :'srp' => :'Float',
        :'srp_unit' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'protocolType')
        self.protocol_type = attributes[:'protocolType']
      end

      if attributes.has_key?(:'hasReductionOfMVAForSimples')
        self.has_reduction_of_mva_for_simples = attributes[:'hasReductionOfMVAForSimples']
      end

      if attributes.has_key?(:'reductionOfMVAForSimples')
        self.reduction_of_mva_for_simples = attributes[:'reductionOfMVAForSimples']
      end

      if attributes.has_key?(:'calcMode')
        self.calc_mode = attributes[:'calcMode']
      end

      if attributes.has_key?(:'icmsStBaseDiscount')
        self.icms_st_base_discount = attributes[:'icmsStBaseDiscount']
      end

      if attributes.has_key?(:'mvaRate')
        self.mva_rate = attributes[:'mvaRate']
      end

      if attributes.has_key?(:'srp')
        self.srp = attributes[:'srp']
      end

      if attributes.has_key?(:'srpUnit')
        self.srp_unit = attributes[:'srpUnit']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@srp_unit.nil? && @srp_unit.to_s.length > 6
        invalid_properties.push("invalid value for 'srp_unit', the character length must be smaller than or equal to 6.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      protocol_type_validator = EnumAttributeValidator.new('String', ["COVENANT", "PROTOCOL", "NOTHING"])
      return false unless protocol_type_validator.valid?(@protocol_type)
      calc_mode_validator = EnumAttributeValidator.new('String', ["BYMVARATE", "SRP", "MSRP"])
      return false unless calc_mode_validator.valid?(@calc_mode)
      return false if !@srp_unit.nil? && @srp_unit.to_s.length > 6
      return true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] protocol_type Object to be assigned
    def protocol_type=(protocol_type)
      validator = EnumAttributeValidator.new('String', ["COVENANT", "PROTOCOL", "NOTHING"])
      unless validator.valid?(protocol_type)
        fail ArgumentError, "invalid value for 'protocol_type', must be one of #{validator.allowable_values}."
      end
      @protocol_type = protocol_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] calc_mode Object to be assigned
    def calc_mode=(calc_mode)
      validator = EnumAttributeValidator.new('String', ["BYMVARATE", "SRP", "MSRP"])
      unless validator.valid?(calc_mode)
        fail ArgumentError, "invalid value for 'calc_mode', must be one of #{validator.allowable_values}."
      end
      @calc_mode = calc_mode
    end

    # Custom attribute writer method with validation
    # @param [Object] srp_unit Value to be assigned
    def srp_unit=(srp_unit)

      if !srp_unit.nil? && srp_unit.to_s.length > 6
        fail ArgumentError, "invalid value for 'srp_unit', the character length must be smaller than or equal to 6."
      end

      @srp_unit = srp_unit
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          protocol_type == o.protocol_type &&
          has_reduction_of_mva_for_simples == o.has_reduction_of_mva_for_simples &&
          reduction_of_mva_for_simples == o.reduction_of_mva_for_simples &&
          calc_mode == o.calc_mode &&
          icms_st_base_discount == o.icms_st_base_discount &&
          mva_rate == o.mva_rate &&
          srp == o.srp &&
          srp_unit == o.srp_unit
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [protocol_type, has_reduction_of_mva_for_simples, reduction_of_mva_for_simples, calc_mode, icms_st_base_discount, mva_rate, srp, srp_unit].hash
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
