=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class LineForGoodsAdi
    # aditional sequence number (1 to 100)
    attr_accessor :add_number

    # sequential item number for this adi, sequence number (1 to 999)
    attr_accessor :sequential_number

    # Manufatorer erp internal code
    attr_accessor :manufacturer_code

    # This decimal 13 integers and 2 decimals, aditional adi discount
    attr_accessor :adi_discount

    # Drawback number
    attr_accessor :drawback_number


    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'add_number' => :'addNumber',
        :'sequential_number' => :'sequentialNumber',
        :'manufacturer_code' => :'manufacturerCode',
        :'adi_discount' => :'adiDiscount',
        :'drawback_number' => :'drawbackNumber'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'add_number' => :'Integer',
        :'sequential_number' => :'Integer',
        :'manufacturer_code' => :'String',
        :'adi_discount' => :'Float',
        :'drawback_number' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'addNumber')
        self.add_number = attributes[:'addNumber']
      end

      if attributes.has_key?(:'sequentialNumber')
        self.sequential_number = attributes[:'sequentialNumber']
      end

      if attributes.has_key?(:'manufacturerCode')
        self.manufacturer_code = attributes[:'manufacturerCode']
      end

      if attributes.has_key?(:'adiDiscount')
        self.adi_discount = attributes[:'adiDiscount']
      end

      if attributes.has_key?(:'drawbackNumber')
        self.drawback_number = attributes[:'drawbackNumber']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @add_number.nil?
        invalid_properties.push("invalid value for 'add_number', add_number cannot be nil.")
      end

      if @sequential_number.nil?
        invalid_properties.push("invalid value for 'sequential_number', sequential_number cannot be nil.")
      end

      if @manufacturer_code.nil?
        invalid_properties.push("invalid value for 'manufacturer_code', manufacturer_code cannot be nil.")
      end

      if @manufacturer_code.to_s.length > 60
        invalid_properties.push("invalid value for 'manufacturer_code', the character length must be smaller than or equal to 60.")
      end

      if @manufacturer_code.to_s.length < 1
        invalid_properties.push("invalid value for 'manufacturer_code', the character length must be great than or equal to 1.")
      end

      if !@drawback_number.nil? && @drawback_number.to_s.length < 1
        invalid_properties.push("invalid value for 'drawback_number', the character length must be great than or equal to 1.")
      end

      if !@drawback_number.nil? && @drawback_number !~ Regexp.new(/[0-9]{0,11}/)
        invalid_properties.push("invalid value for 'drawback_number', must conform to the pattern /[0-9]{0,11}/.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @add_number.nil?
      return false if @sequential_number.nil?
      return false if @manufacturer_code.nil?
      return false if @manufacturer_code.to_s.length > 60
      return false if @manufacturer_code.to_s.length < 1
      return false if !@drawback_number.nil? && @drawback_number.to_s.length < 1
      return false if !@drawback_number.nil? && @drawback_number !~ Regexp.new(/[0-9]{0,11}/)
      return true
    end

    # Custom attribute writer method with validation
    # @param [Object] manufacturer_code Value to be assigned
    def manufacturer_code=(manufacturer_code)
      if manufacturer_code.nil?
        fail ArgumentError, "manufacturer_code cannot be nil"
      end

      if manufacturer_code.to_s.length > 60
        fail ArgumentError, "invalid value for 'manufacturer_code', the character length must be smaller than or equal to 60."
      end

      if manufacturer_code.to_s.length < 1
        fail ArgumentError, "invalid value for 'manufacturer_code', the character length must be great than or equal to 1."
      end

      @manufacturer_code = manufacturer_code
    end

    # Custom attribute writer method with validation
    # @param [Object] drawback_number Value to be assigned
    def drawback_number=(drawback_number)

      if !drawback_number.nil? && drawback_number.to_s.length < 1
        fail ArgumentError, "invalid value for 'drawback_number', the character length must be great than or equal to 1."
      end

      if !drawback_number.nil? && drawback_number !~ Regexp.new(/[0-9]{0,11}/)
        fail ArgumentError, "invalid value for 'drawback_number', must conform to the pattern /[0-9]{0,11}/."
      end

      @drawback_number = drawback_number
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          add_number == o.add_number &&
          sequential_number == o.sequential_number &&
          manufacturer_code == o.manufacturer_code &&
          adi_discount == o.adi_discount &&
          drawback_number == o.drawback_number
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [add_number, sequential_number, manufacturer_code, adi_discount, drawback_number].hash
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
