=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class SalesHeaderOut
    # This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
    attr_accessor :account_id

    # This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
    attr_accessor :company_code

    # This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt' 
    attr_accessor :transaction_type

    # This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
    attr_accessor :document_code

    # currency code / transactions must be in Brazilian Reais \"BRL\"
    attr_accessor :currency

    # This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
    attr_accessor :transaction_date

    # accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
    attr_accessor :tax_calculation_date

    # This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
    attr_accessor :company_location

    # This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
    attr_accessor :customer_code

    # The number of Purchase Order
    attr_accessor :purchase_order_number

    # Provisional receipt services, sequencial number maintained by the client application, unique by serie
    attr_accessor :rps_number

    # set name identifier for rps number sequency.
    attr_accessor :rps_serie

    # Service discrimination, free description about service
    attr_accessor :discrimination_in

    attr_accessor :entity

    attr_accessor :payment

    attr_accessor :taxes_config

    attr_accessor :default_locations

    # Invoice discrimination, it is discriminationIn plus automatic messages
    attr_accessor :discrimination_out

    # RPS XML or NFSe XML generated, when the client system doesn't have EDI with government then BR16 return RPS when transaction is created.
    attr_accessor :xml

    # Service sales usually has a EDI integration with government to get Final document or Authorization. This is external process and the integration status is followed by this property. - 'STORED' - 'WAITING APPROVAL' - 'AUTHORIZED' - 'AUTHORIZED with NOTE' - 'ERROR' - 'CANCELED REPLACED' - 'CANCELED' - 'CANCELLATION REQUESTED' 
    attr_accessor :edi_sync_state

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
        :'account_id' => :'accountId',
        :'company_code' => :'companyCode',
        :'transaction_type' => :'transactionType',
        :'document_code' => :'documentCode',
        :'currency' => :'currency',
        :'transaction_date' => :'transactionDate',
        :'tax_calculation_date' => :'taxCalculationDate',
        :'company_location' => :'companyLocation',
        :'customer_code' => :'customerCode',
        :'purchase_order_number' => :'purchaseOrderNumber',
        :'rps_number' => :'rpsNumber',
        :'rps_serie' => :'rpsSerie',
        :'discrimination_in' => :'discriminationIn',
        :'entity' => :'entity',
        :'payment' => :'payment',
        :'taxes_config' => :'taxesConfig',
        :'default_locations' => :'defaultLocations',
        :'discrimination_out' => :'discriminationOut',
        :'xml' => :'xml',
        :'edi_sync_state' => :'ediSyncState'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'account_id' => :'String',
        :'company_code' => :'String',
        :'transaction_type' => :'String',
        :'document_code' => :'String',
        :'currency' => :'String',
        :'transaction_date' => :'Date',
        :'tax_calculation_date' => :'Date',
        :'company_location' => :'String',
        :'customer_code' => :'String',
        :'purchase_order_number' => :'String',
        :'rps_number' => :'Integer',
        :'rps_serie' => :'String',
        :'discrimination_in' => :'String',
        :'entity' => :'SalesEntity',
        :'payment' => :'SalesHeaderOutPayment',
        :'taxes_config' => :'SalesTaxesConfig',
        :'default_locations' => :'SalesDefaultLocations',
        :'discrimination_out' => :'String',
        :'xml' => :'String',
        :'edi_sync_state' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'accountId')
        self.account_id = attributes[:'accountId']
      end

      if attributes.has_key?(:'companyCode')
        self.company_code = attributes[:'companyCode']
      end

      if attributes.has_key?(:'transactionType')
        self.transaction_type = attributes[:'transactionType']
      end

      if attributes.has_key?(:'documentCode')
        self.document_code = attributes[:'documentCode']
      end

      if attributes.has_key?(:'currency')
        self.currency = attributes[:'currency']
      end

      if attributes.has_key?(:'transactionDate')
        self.transaction_date = attributes[:'transactionDate']
      end

      if attributes.has_key?(:'taxCalculationDate')
        self.tax_calculation_date = attributes[:'taxCalculationDate']
      end

      if attributes.has_key?(:'companyLocation')
        self.company_location = attributes[:'companyLocation']
      end

      if attributes.has_key?(:'customerCode')
        self.customer_code = attributes[:'customerCode']
      end

      if attributes.has_key?(:'purchaseOrderNumber')
        self.purchase_order_number = attributes[:'purchaseOrderNumber']
      end

      if attributes.has_key?(:'rpsNumber')
        self.rps_number = attributes[:'rpsNumber']
      end

      if attributes.has_key?(:'rpsSerie')
        self.rps_serie = attributes[:'rpsSerie']
      else
        self.rps_serie = "0"
      end

      if attributes.has_key?(:'discriminationIn')
        self.discrimination_in = attributes[:'discriminationIn']
      end

      if attributes.has_key?(:'entity')
        self.entity = attributes[:'entity']
      end

      if attributes.has_key?(:'payment')
        self.payment = attributes[:'payment']
      end

      if attributes.has_key?(:'taxesConfig')
        self.taxes_config = attributes[:'taxesConfig']
      end

      if attributes.has_key?(:'defaultLocations')
        self.default_locations = attributes[:'defaultLocations']
      end

      if attributes.has_key?(:'discriminationOut')
        self.discrimination_out = attributes[:'discriminationOut']
      end

      if attributes.has_key?(:'xml')
        self.xml = attributes[:'xml']
      end

      if attributes.has_key?(:'ediSyncState')
        self.edi_sync_state = attributes[:'ediSyncState']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @account_id.nil?
        invalid_properties.push("invalid value for 'account_id', account_id cannot be nil.")
      end

      if @company_code.nil?
        invalid_properties.push("invalid value for 'company_code', company_code cannot be nil.")
      end

      if @company_code.to_s.length > 60
        invalid_properties.push("invalid value for 'company_code', the character length must be smaller than or equal to 60.")
      end

      if @transaction_type.nil?
        invalid_properties.push("invalid value for 'transaction_type', transaction_type cannot be nil.")
      end

      if @currency.nil?
        invalid_properties.push("invalid value for 'currency', currency cannot be nil.")
      end

      if @transaction_date.nil?
        invalid_properties.push("invalid value for 'transaction_date', transaction_date cannot be nil.")
      end

      if @company_location.nil?
        invalid_properties.push("invalid value for 'company_location', company_location cannot be nil.")
      end

      if @company_location.to_s.length > 64
        invalid_properties.push("invalid value for 'company_location', the character length must be smaller than or equal to 64.")
      end

      if @customer_code.nil?
        invalid_properties.push("invalid value for 'customer_code', customer_code cannot be nil.")
      end

      if !@discrimination_in.nil? && @discrimination_in.to_s.length > 1000
        invalid_properties.push("invalid value for 'discrimination_in', the character length must be smaller than or equal to 1000.")
      end

      if !@discrimination_in.nil? && @discrimination_in.to_s.length < 1
        invalid_properties.push("invalid value for 'discrimination_in', the character length must be great than or equal to 1.")
      end

      if !@discrimination_out.nil? && @discrimination_out.to_s.length > 2000
        invalid_properties.push("invalid value for 'discrimination_out', the character length must be smaller than or equal to 2000.")
      end

      if !@discrimination_out.nil? && @discrimination_out.to_s.length < 1
        invalid_properties.push("invalid value for 'discrimination_out', the character length must be great than or equal to 1.")
      end

      if !@xml.nil? && @xml.to_s.length > 50000
        invalid_properties.push("invalid value for 'xml', the character length must be smaller than or equal to 50000.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @account_id.nil?
      return false if @company_code.nil?
      return false if @company_code.to_s.length > 60
      return false if @transaction_type.nil?
      transaction_type_validator = EnumAttributeValidator.new('String', ["Sale", "Purchase", "Payment", "Receipt"])
      return false unless transaction_type_validator.valid?(@transaction_type)
      return false if @currency.nil?
      currency_validator = EnumAttributeValidator.new('String', ["BRL"])
      return false unless currency_validator.valid?(@currency)
      return false if @transaction_date.nil?
      return false if @company_location.nil?
      return false if @company_location.to_s.length > 64
      return false if @customer_code.nil?
      return false if !@discrimination_in.nil? && @discrimination_in.to_s.length > 1000
      return false if !@discrimination_in.nil? && @discrimination_in.to_s.length < 1
      return false if !@discrimination_out.nil? && @discrimination_out.to_s.length > 2000
      return false if !@discrimination_out.nil? && @discrimination_out.to_s.length < 1
      return false if !@xml.nil? && @xml.to_s.length > 50000
      edi_sync_state_validator = EnumAttributeValidator.new('String', ["STORED", "WAITING APPROVAL", "AUTHORIZED", "AUTHORIZED with NOTE", "ERROR", "CANCELED REPLACED", "CANCELED", "CANCELLATION REQUESTED"])
      return false unless edi_sync_state_validator.valid?(@edi_sync_state)
      return true
    end

    # Custom attribute writer method with validation
    # @param [Object] company_code Value to be assigned
    def company_code=(company_code)
      if company_code.nil?
        fail ArgumentError, "company_code cannot be nil"
      end

      if company_code.to_s.length > 60
        fail ArgumentError, "invalid value for 'company_code', the character length must be smaller than or equal to 60."
      end

      @company_code = company_code
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] transaction_type Object to be assigned
    def transaction_type=(transaction_type)
      validator = EnumAttributeValidator.new('String', ["Sale", "Purchase", "Payment", "Receipt"])
      unless validator.valid?(transaction_type)
        fail ArgumentError, "invalid value for 'transaction_type', must be one of #{validator.allowable_values}."
      end
      @transaction_type = transaction_type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] currency Object to be assigned
    def currency=(currency)
      validator = EnumAttributeValidator.new('String', ["BRL"])
      unless validator.valid?(currency)
        fail ArgumentError, "invalid value for 'currency', must be one of #{validator.allowable_values}."
      end
      @currency = currency
    end

    # Custom attribute writer method with validation
    # @param [Object] company_location Value to be assigned
    def company_location=(company_location)
      if company_location.nil?
        fail ArgumentError, "company_location cannot be nil"
      end

      if company_location.to_s.length > 64
        fail ArgumentError, "invalid value for 'company_location', the character length must be smaller than or equal to 64."
      end

      @company_location = company_location
    end

    # Custom attribute writer method with validation
    # @param [Object] discrimination_in Value to be assigned
    def discrimination_in=(discrimination_in)

      if !discrimination_in.nil? && discrimination_in.to_s.length > 1000
        fail ArgumentError, "invalid value for 'discrimination_in', the character length must be smaller than or equal to 1000."
      end

      if !discrimination_in.nil? && discrimination_in.to_s.length < 1
        fail ArgumentError, "invalid value for 'discrimination_in', the character length must be great than or equal to 1."
      end

      @discrimination_in = discrimination_in
    end

    # Custom attribute writer method with validation
    # @param [Object] discrimination_out Value to be assigned
    def discrimination_out=(discrimination_out)

      if !discrimination_out.nil? && discrimination_out.to_s.length > 2000
        fail ArgumentError, "invalid value for 'discrimination_out', the character length must be smaller than or equal to 2000."
      end

      if !discrimination_out.nil? && discrimination_out.to_s.length < 1
        fail ArgumentError, "invalid value for 'discrimination_out', the character length must be great than or equal to 1."
      end

      @discrimination_out = discrimination_out
    end

    # Custom attribute writer method with validation
    # @param [Object] xml Value to be assigned
    def xml=(xml)

      if !xml.nil? && xml.to_s.length > 50000
        fail ArgumentError, "invalid value for 'xml', the character length must be smaller than or equal to 50000."
      end

      @xml = xml
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] edi_sync_state Object to be assigned
    def edi_sync_state=(edi_sync_state)
      validator = EnumAttributeValidator.new('String', ["STORED", "WAITING APPROVAL", "AUTHORIZED", "AUTHORIZED with NOTE", "ERROR", "CANCELED REPLACED", "CANCELED", "CANCELLATION REQUESTED"])
      unless validator.valid?(edi_sync_state)
        fail ArgumentError, "invalid value for 'edi_sync_state', must be one of #{validator.allowable_values}."
      end
      @edi_sync_state = edi_sync_state
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          account_id == o.account_id &&
          company_code == o.company_code &&
          transaction_type == o.transaction_type &&
          document_code == o.document_code &&
          currency == o.currency &&
          transaction_date == o.transaction_date &&
          tax_calculation_date == o.tax_calculation_date &&
          company_location == o.company_location &&
          customer_code == o.customer_code &&
          purchase_order_number == o.purchase_order_number &&
          rps_number == o.rps_number &&
          rps_serie == o.rps_serie &&
          discrimination_in == o.discrimination_in &&
          entity == o.entity &&
          payment == o.payment &&
          taxes_config == o.taxes_config &&
          default_locations == o.default_locations &&
          discrimination_out == o.discrimination_out &&
          xml == o.xml &&
          edi_sync_state == o.edi_sync_state
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [account_id, company_code, transaction_type, document_code, currency, transaction_date, tax_calculation_date, company_location, customer_code, purchase_order_number, rps_number, rps_serie, discrimination_in, entity, payment, taxes_config, default_locations, discrimination_out, xml, edi_sync_state].hash
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
