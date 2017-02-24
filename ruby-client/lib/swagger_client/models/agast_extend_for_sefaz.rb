=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class AgastExtendForSefaz
    # harmonized code, NCM or LC 116
    attr_accessor :hs_code

    # hsCode Exception for IPI tax
    attr_accessor :ex

    # tax substitution code - Codigo especificador da Substuicao Tributaria
    attr_accessor :cest

    # GTIN NUMBER
    attr_accessor :cean

    # Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
    attr_accessor :nve

    # Sales Unit
    attr_accessor :unit

    # Sales Taxable Unit
    attr_accessor :unit_taxable

    # Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
    attr_accessor :n_fci


    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'hs_code' => :'hsCode',
        :'ex' => :'ex',
        :'cest' => :'cest',
        :'cean' => :'cean',
        :'nve' => :'nve',
        :'unit' => :'unit',
        :'unit_taxable' => :'unitTaxable',
        :'n_fci' => :'nFCI'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'hs_code' => :'String',
        :'ex' => :'Integer',
        :'cest' => :'String',
        :'cean' => :'String',
        :'nve' => :'String',
        :'unit' => :'String',
        :'unit_taxable' => :'String',
        :'n_fci' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

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

      if attributes.has_key?(:'nve')
        self.nve = attributes[:'nve']
      end

      if attributes.has_key?(:'unit')
        self.unit = attributes[:'unit']
      end

      if attributes.has_key?(:'unitTaxable')
        self.unit_taxable = attributes[:'unitTaxable']
      end

      if attributes.has_key?(:'nFCI')
        self.n_fci = attributes[:'nFCI']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@hs_code.nil? && @hs_code.to_s.length > 8
        invalid_properties.push("invalid value for 'hs_code', the character length must be smaller than or equal to 8.")
      end

      if !@cest.nil? && @cest !~ Regexp.new(/[0-9]{7}/)
        invalid_properties.push("invalid value for 'cest', must conform to the pattern /[0-9]{7}/.")
      end

      if !@cean.nil? && @cean !~ Regexp.new(/[0-9]{0}|[0-9]{8}|[0-9]{12,14}/)
        invalid_properties.push("invalid value for 'cean', must conform to the pattern /[0-9]{0}|[0-9]{8}|[0-9]{12,14}/.")
      end

      if !@nve.nil? && @nve !~ Regexp.new(/[A-Z]{2}[0-9]{4}/)
        invalid_properties.push("invalid value for 'nve', must conform to the pattern /[A-Z]{2}[0-9]{4}/.")
      end

      if !@unit.nil? && @unit.to_s.length > 6
        invalid_properties.push("invalid value for 'unit', the character length must be smaller than or equal to 6.")
      end

      if !@unit_taxable.nil? && @unit_taxable.to_s.length > 6
        invalid_properties.push("invalid value for 'unit_taxable', the character length must be smaller than or equal to 6.")
      end

      if !@n_fci.nil? && @n_fci !~ Regexp.new(/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/)
        invalid_properties.push("invalid value for 'n_fci', must conform to the pattern /[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@hs_code.nil? && @hs_code.to_s.length > 8
      return false if !@cest.nil? && @cest !~ Regexp.new(/[0-9]{7}/)
      return false if !@cean.nil? && @cean !~ Regexp.new(/[0-9]{0}|[0-9]{8}|[0-9]{12,14}/)
      return false if !@nve.nil? && @nve !~ Regexp.new(/[A-Z]{2}[0-9]{4}/)
      return false if !@unit.nil? && @unit.to_s.length > 6
      return false if !@unit_taxable.nil? && @unit_taxable.to_s.length > 6
      return false if !@n_fci.nil? && @n_fci !~ Regexp.new(/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/)
      return true
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

    # Custom attribute writer method with validation
    # @param [Object] nve Value to be assigned
    def nve=(nve)

      if !nve.nil? && nve !~ Regexp.new(/[A-Z]{2}[0-9]{4}/)
        fail ArgumentError, "invalid value for 'nve', must conform to the pattern /[A-Z]{2}[0-9]{4}/."
      end

      @nve = nve
    end

    # Custom attribute writer method with validation
    # @param [Object] unit Value to be assigned
    def unit=(unit)

      if !unit.nil? && unit.to_s.length > 6
        fail ArgumentError, "invalid value for 'unit', the character length must be smaller than or equal to 6."
      end

      @unit = unit
    end

    # Custom attribute writer method with validation
    # @param [Object] unit_taxable Value to be assigned
    def unit_taxable=(unit_taxable)

      if !unit_taxable.nil? && unit_taxable.to_s.length > 6
        fail ArgumentError, "invalid value for 'unit_taxable', the character length must be smaller than or equal to 6."
      end

      @unit_taxable = unit_taxable
    end

    # Custom attribute writer method with validation
    # @param [Object] n_fci Value to be assigned
    def n_fci=(n_fci)

      if !n_fci.nil? && n_fci !~ Regexp.new(/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/)
        fail ArgumentError, "invalid value for 'n_fci', must conform to the pattern /[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/."
      end

      @n_fci = n_fci
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          hs_code == o.hs_code &&
          ex == o.ex &&
          cest == o.cest &&
          cean == o.cean &&
          nve == o.nve &&
          unit == o.unit &&
          unit_taxable == o.unit_taxable &&
          n_fci == o.n_fci
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [hs_code, ex, cest, cean, nve, unit, unit_taxable, n_fci].hash
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
