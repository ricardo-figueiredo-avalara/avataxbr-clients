=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class SalesLinesIn
    # This string is a unique identifier for this line in the transaction
    attr_accessor :line_code

    # This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
    attr_accessor :item_code

    # This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
    attr_accessor :number_of_items

    # This decimal captures the total cost of this line. In its simplest form lineAmount = (item price * numberOfItems).
    attr_accessor :line_amount

    # This string captures the description of the item represented by this line, will be used LC 116
    attr_accessor :item_description

    # Conditional discount
    attr_accessor :line_taxed_discount

    # Unconditional discount
    attr_accessor :line_untaxed_discount

    attr_accessor :tax_deductions


    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'line_code' => :'lineCode',
        :'item_code' => :'itemCode',
        :'number_of_items' => :'numberOfItems',
        :'line_amount' => :'lineAmount',
        :'item_description' => :'itemDescription',
        :'line_taxed_discount' => :'lineTaxedDiscount',
        :'line_untaxed_discount' => :'lineUntaxedDiscount',
        :'tax_deductions' => :'taxDeductions'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'line_code' => :'Integer',
        :'item_code' => :'String',
        :'number_of_items' => :'Float',
        :'line_amount' => :'Float',
        :'item_description' => :'String',
        :'line_taxed_discount' => :'Float',
        :'line_untaxed_discount' => :'Float',
        :'tax_deductions' => :'SalesLinesInTaxDeductions'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'lineCode')
        self.line_code = attributes[:'lineCode']
      end

      if attributes.has_key?(:'itemCode')
        self.item_code = attributes[:'itemCode']
      end

      if attributes.has_key?(:'numberOfItems')
        self.number_of_items = attributes[:'numberOfItems']
      else
        self.number_of_items = 1.0
      end

      if attributes.has_key?(:'lineAmount')
        self.line_amount = attributes[:'lineAmount']
      end

      if attributes.has_key?(:'itemDescription')
        self.item_description = attributes[:'itemDescription']
      end

      if attributes.has_key?(:'lineTaxedDiscount')
        self.line_taxed_discount = attributes[:'lineTaxedDiscount']
      end

      if attributes.has_key?(:'lineUntaxedDiscount')
        self.line_untaxed_discount = attributes[:'lineUntaxedDiscount']
      end

      if attributes.has_key?(:'taxDeductions')
        self.tax_deductions = attributes[:'taxDeductions']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @item_code.nil?
        invalid_properties.push("invalid value for 'item_code', item_code cannot be nil.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @item_code.nil?
      return true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          line_code == o.line_code &&
          item_code == o.item_code &&
          number_of_items == o.number_of_items &&
          line_amount == o.line_amount &&
          item_description == o.item_description &&
          line_taxed_discount == o.line_taxed_discount &&
          line_untaxed_discount == o.line_untaxed_discount &&
          tax_deductions == o.tax_deductions
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [line_code, item_code, number_of_items, line_amount, item_description, line_taxed_discount, line_untaxed_discount, tax_deductions].hash
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
