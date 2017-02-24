=begin
#AvaTax Brazil

#The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class LineForGoods
    # This string is a unique identifier for this line in the transaction
    attr_accessor :line_code

    # This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.
    attr_accessor :item_code

    # AGAST CODE for itemCode
    attr_accessor :avalara_goods_and_services_type

    # This decimal 11 integers and 1 to 4 decimals captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1
    attr_accessor :number_of_items

    # when is return operation this field inform the percentage of returned itens. This decimal max 3 integers and 2 decimals, v >=0.00 and v <= 100.00
    attr_accessor :returned_percentage_amount

    # This decimal 11 integers and 1 to 10 decimals captures the unit price of this line.
    attr_accessor :line_unit_price

    # In its simplest form lineAmount = (item price * numberOfItems). If taxIncluded is 'true', lineAmount = (item price * numberOfItems + tax).
    attr_accessor :line_amount

    # This string captures the description of the item represented by this line, will be used LC 116
    attr_accessor :item_description

    # Discount conditional, This decimal 13 integers and 0 to 2 decimals
    attr_accessor :line_taxed_discount

    # discount unconditional, This decimal 13 integers and 0 to 2 decimals
    attr_accessor :line_untaxed_discount

    # This is a enumeration folowing table
    attr_accessor :use_type

    # Reference to process configurantion of this transaction, See ProcessScenario definition
    attr_accessor :process_scenario

    # Fiscal Operation Code of transport service
    attr_accessor :cfop

    # return if this transaction has stock impact for this process or CFOP
    attr_accessor :has_stock_impact

    # return if this transaction has finantial impact for this process or CFOP
    attr_accessor :has_finantial_impact

    # This decimal 13 integers and 0 to 2 decimals
    attr_accessor :freight_amount

    # This decimal 13 integers and 0 to 2 decimals
    attr_accessor :insurance_amount

    # This decimal 13 integers and 0 to 2 decimals
    attr_accessor :other_cost_amount

    # The item value will compose the invoice total value.
    attr_accessor :ind_tot_type

    # order number, information used for B2B control process
    attr_accessor :order_number

    # number of the item from order number, information used for B2B control process
    attr_accessor :order_item_number

    # Gloal Unique identifier (Importation form)
    attr_accessor :fci_number

    # RECOPI number
    attr_accessor :recopi_number

    # additional information about product (referenced standard, complementary info, etc)
    attr_accessor :inf_ad_prod

    attr_accessor :vehicle

    attr_accessor :medicine

    attr_accessor :weapon

    attr_accessor :fuel

    # Inform that for this item the Entity referenced is ICMS Substitute
    attr_accessor :entity_is_icms_substitute

    # Inform that this item has ICMS withheld for transport value service.
    attr_accessor :is_transport_icms_withheld

    attr_accessor :icms_tax_relief

    # Exportation detail
    attr_accessor :export

    # Import declaration
    attr_accessor :di

    attr_accessor :calculated_tax

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
        :'line_code' => :'lineCode',
        :'item_code' => :'itemCode',
        :'avalara_goods_and_services_type' => :'avalaraGoodsAndServicesType',
        :'number_of_items' => :'numberOfItems',
        :'returned_percentage_amount' => :'returnedPercentageAmount',
        :'line_unit_price' => :'lineUnitPrice',
        :'line_amount' => :'lineAmount',
        :'item_description' => :'itemDescription',
        :'line_taxed_discount' => :'lineTaxedDiscount',
        :'line_untaxed_discount' => :'lineUntaxedDiscount',
        :'use_type' => :'useType',
        :'process_scenario' => :'processScenario',
        :'cfop' => :'cfop',
        :'has_stock_impact' => :'hasStockImpact',
        :'has_finantial_impact' => :'hasFinantialImpact',
        :'freight_amount' => :'freightAmount',
        :'insurance_amount' => :'insuranceAmount',
        :'other_cost_amount' => :'otherCostAmount',
        :'ind_tot_type' => :'indTotType',
        :'order_number' => :'orderNumber',
        :'order_item_number' => :'orderItemNumber',
        :'fci_number' => :'fciNumber',
        :'recopi_number' => :'recopiNumber',
        :'inf_ad_prod' => :'infAdProd',
        :'vehicle' => :'vehicle',
        :'medicine' => :'medicine',
        :'weapon' => :'weapon',
        :'fuel' => :'fuel',
        :'entity_is_icms_substitute' => :'entityIsIcmsSubstitute',
        :'is_transport_icms_withheld' => :'isTransportIcmsWithheld',
        :'icms_tax_relief' => :'icmsTaxRelief',
        :'export' => :'export',
        :'di' => :'di',
        :'calculated_tax' => :'calculatedTax'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'line_code' => :'Integer',
        :'item_code' => :'String',
        :'avalara_goods_and_services_type' => :'String',
        :'number_of_items' => :'Float',
        :'returned_percentage_amount' => :'Float',
        :'line_unit_price' => :'Float',
        :'line_amount' => :'Float',
        :'item_description' => :'String',
        :'line_taxed_discount' => :'Float',
        :'line_untaxed_discount' => :'Float',
        :'use_type' => :'String',
        :'process_scenario' => :'String',
        :'cfop' => :'Integer',
        :'has_stock_impact' => :'BOOLEAN',
        :'has_finantial_impact' => :'BOOLEAN',
        :'freight_amount' => :'Float',
        :'insurance_amount' => :'Float',
        :'other_cost_amount' => :'Float',
        :'ind_tot_type' => :'BOOLEAN',
        :'order_number' => :'String',
        :'order_item_number' => :'String',
        :'fci_number' => :'String',
        :'recopi_number' => :'String',
        :'inf_ad_prod' => :'String',
        :'vehicle' => :'Vehicle',
        :'medicine' => :'Medicine',
        :'weapon' => :'Weapon',
        :'fuel' => :'Fuel',
        :'entity_is_icms_substitute' => :'BOOLEAN',
        :'is_transport_icms_withheld' => :'BOOLEAN',
        :'icms_tax_relief' => :'LineForGoodsIcmsTaxRelief',
        :'export' => :'Array<LineForGoodsExport>',
        :'di' => :'Array<LineForGoodsDi>',
        :'calculated_tax' => :'LineForGoodsCalculatedTax'
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

      if attributes.has_key?(:'avalaraGoodsAndServicesType')
        self.avalara_goods_and_services_type = attributes[:'avalaraGoodsAndServicesType']
      end

      if attributes.has_key?(:'numberOfItems')
        self.number_of_items = attributes[:'numberOfItems']
      else
        self.number_of_items = 1.0
      end

      if attributes.has_key?(:'returnedPercentageAmount')
        self.returned_percentage_amount = attributes[:'returnedPercentageAmount']
      end

      if attributes.has_key?(:'lineUnitPrice')
        self.line_unit_price = attributes[:'lineUnitPrice']
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

      if attributes.has_key?(:'useType')
        self.use_type = attributes[:'useType']
      end

      if attributes.has_key?(:'processScenario')
        self.process_scenario = attributes[:'processScenario']
      end

      if attributes.has_key?(:'cfop')
        self.cfop = attributes[:'cfop']
      end

      if attributes.has_key?(:'hasStockImpact')
        self.has_stock_impact = attributes[:'hasStockImpact']
      end

      if attributes.has_key?(:'hasFinantialImpact')
        self.has_finantial_impact = attributes[:'hasFinantialImpact']
      end

      if attributes.has_key?(:'freightAmount')
        self.freight_amount = attributes[:'freightAmount']
      end

      if attributes.has_key?(:'insuranceAmount')
        self.insurance_amount = attributes[:'insuranceAmount']
      end

      if attributes.has_key?(:'otherCostAmount')
        self.other_cost_amount = attributes[:'otherCostAmount']
      end

      if attributes.has_key?(:'indTotType')
        self.ind_tot_type = attributes[:'indTotType']
      else
        self.ind_tot_type = true
      end

      if attributes.has_key?(:'orderNumber')
        self.order_number = attributes[:'orderNumber']
      end

      if attributes.has_key?(:'orderItemNumber')
        self.order_item_number = attributes[:'orderItemNumber']
      end

      if attributes.has_key?(:'fciNumber')
        self.fci_number = attributes[:'fciNumber']
      end

      if attributes.has_key?(:'recopiNumber')
        self.recopi_number = attributes[:'recopiNumber']
      end

      if attributes.has_key?(:'infAdProd')
        self.inf_ad_prod = attributes[:'infAdProd']
      end

      if attributes.has_key?(:'vehicle')
        self.vehicle = attributes[:'vehicle']
      end

      if attributes.has_key?(:'medicine')
        self.medicine = attributes[:'medicine']
      end

      if attributes.has_key?(:'weapon')
        self.weapon = attributes[:'weapon']
      end

      if attributes.has_key?(:'fuel')
        self.fuel = attributes[:'fuel']
      end

      if attributes.has_key?(:'entityIsIcmsSubstitute')
        self.entity_is_icms_substitute = attributes[:'entityIsIcmsSubstitute']
      end

      if attributes.has_key?(:'isTransportIcmsWithheld')
        self.is_transport_icms_withheld = attributes[:'isTransportIcmsWithheld']
      end

      if attributes.has_key?(:'icmsTaxRelief')
        self.icms_tax_relief = attributes[:'icmsTaxRelief']
      end

      if attributes.has_key?(:'export')
        if (value = attributes[:'export']).is_a?(Array)
          self.export = value
        end
      end

      if attributes.has_key?(:'di')
        if (value = attributes[:'di']).is_a?(Array)
          self.di = value
        end
      end

      if attributes.has_key?(:'calculatedTax')
        self.calculated_tax = attributes[:'calculatedTax']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if @line_code.nil?
        invalid_properties.push("invalid value for 'line_code', line_code cannot be nil.")
      end

      if @item_code.nil?
        invalid_properties.push("invalid value for 'item_code', item_code cannot be nil.")
      end

      if @item_code.to_s.length > 60
        invalid_properties.push("invalid value for 'item_code', the character length must be smaller than or equal to 60.")
      end

      if @number_of_items.nil?
        invalid_properties.push("invalid value for 'number_of_items', number_of_items cannot be nil.")
      end

      if @line_amount.nil?
        invalid_properties.push("invalid value for 'line_amount', line_amount cannot be nil.")
      end

      if @item_description.nil?
        invalid_properties.push("invalid value for 'item_description', item_description cannot be nil.")
      end

      if @use_type.nil?
        invalid_properties.push("invalid value for 'use_type', use_type cannot be nil.")
      end

      if @process_scenario.nil?
        invalid_properties.push("invalid value for 'process_scenario', process_scenario cannot be nil.")
      end

      if @process_scenario.to_s.length > 60
        invalid_properties.push("invalid value for 'process_scenario', the character length must be smaller than or equal to 60.")
      end

      if !@order_number.nil? && @order_number.to_s.length > 15
        invalid_properties.push("invalid value for 'order_number', the character length must be smaller than or equal to 15.")
      end

      if !@order_number.nil? && @order_number.to_s.length < 1
        invalid_properties.push("invalid value for 'order_number', the character length must be great than or equal to 1.")
      end

      if !@order_item_number.nil? && @order_item_number !~ Regexp.new(/[0-9]{1,6}/)
        invalid_properties.push("invalid value for 'order_item_number', must conform to the pattern /[0-9]{1,6}/.")
      end

      if !@fci_number.nil? && @fci_number !~ Regexp.new(/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/)
        invalid_properties.push("invalid value for 'fci_number', must conform to the pattern /[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/.")
      end

      if !@recopi_number.nil? && @recopi_number.to_s.length > 20
        invalid_properties.push("invalid value for 'recopi_number', the character length must be smaller than or equal to 20.")
      end

      if !@recopi_number.nil? && @recopi_number !~ Regexp.new(/[0-9]{20}/)
        invalid_properties.push("invalid value for 'recopi_number', must conform to the pattern /[0-9]{20}/.")
      end

      if !@inf_ad_prod.nil? && @inf_ad_prod.to_s.length > 500
        invalid_properties.push("invalid value for 'inf_ad_prod', the character length must be smaller than or equal to 500.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if @line_code.nil?
      return false if @item_code.nil?
      return false if @item_code.to_s.length > 60
      return false if @number_of_items.nil?
      return false if @line_amount.nil?
      return false if @item_description.nil?
      return false if @use_type.nil?
      use_type_validator = EnumAttributeValidator.new('String', ["use or consumption", "resale", "agricultural production", "production", "use or consumption on business establishment", "use or consumption on transporter service establishment", "use or consumption on communication service establishment", "use or consumption on demand by contract", "use or consumption on energy supplier establishment", "use or consumption of fuel transaction type exportation", "fixed assets", "resale export", "resale icms exempt", "resale buyer under the same icmsSt tax rule", "transport of goods that don't need invoice (nf)"])
      return false unless use_type_validator.valid?(@use_type)
      return false if @process_scenario.nil?
      return false if @process_scenario.to_s.length > 60
      return false if !@order_number.nil? && @order_number.to_s.length > 15
      return false if !@order_number.nil? && @order_number.to_s.length < 1
      return false if !@order_item_number.nil? && @order_item_number !~ Regexp.new(/[0-9]{1,6}/)
      return false if !@fci_number.nil? && @fci_number !~ Regexp.new(/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/)
      return false if !@recopi_number.nil? && @recopi_number.to_s.length > 20
      return false if !@recopi_number.nil? && @recopi_number !~ Regexp.new(/[0-9]{20}/)
      return false if !@inf_ad_prod.nil? && @inf_ad_prod.to_s.length > 500
      return true
    end

    # Custom attribute writer method with validation
    # @param [Object] item_code Value to be assigned
    def item_code=(item_code)
      if item_code.nil?
        fail ArgumentError, "item_code cannot be nil"
      end

      if item_code.to_s.length > 60
        fail ArgumentError, "invalid value for 'item_code', the character length must be smaller than or equal to 60."
      end

      @item_code = item_code
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] use_type Object to be assigned
    def use_type=(use_type)
      validator = EnumAttributeValidator.new('String', ["use or consumption", "resale", "agricultural production", "production", "use or consumption on business establishment", "use or consumption on transporter service establishment", "use or consumption on communication service establishment", "use or consumption on demand by contract", "use or consumption on energy supplier establishment", "use or consumption of fuel transaction type exportation", "fixed assets", "resale export", "resale icms exempt", "resale buyer under the same icmsSt tax rule", "transport of goods that don't need invoice (nf)"])
      unless validator.valid?(use_type)
        fail ArgumentError, "invalid value for 'use_type', must be one of #{validator.allowable_values}."
      end
      @use_type = use_type
    end

    # Custom attribute writer method with validation
    # @param [Object] process_scenario Value to be assigned
    def process_scenario=(process_scenario)
      if process_scenario.nil?
        fail ArgumentError, "process_scenario cannot be nil"
      end

      if process_scenario.to_s.length > 60
        fail ArgumentError, "invalid value for 'process_scenario', the character length must be smaller than or equal to 60."
      end

      @process_scenario = process_scenario
    end

    # Custom attribute writer method with validation
    # @param [Object] order_number Value to be assigned
    def order_number=(order_number)

      if !order_number.nil? && order_number.to_s.length > 15
        fail ArgumentError, "invalid value for 'order_number', the character length must be smaller than or equal to 15."
      end

      if !order_number.nil? && order_number.to_s.length < 1
        fail ArgumentError, "invalid value for 'order_number', the character length must be great than or equal to 1."
      end

      @order_number = order_number
    end

    # Custom attribute writer method with validation
    # @param [Object] order_item_number Value to be assigned
    def order_item_number=(order_item_number)

      if !order_item_number.nil? && order_item_number !~ Regexp.new(/[0-9]{1,6}/)
        fail ArgumentError, "invalid value for 'order_item_number', must conform to the pattern /[0-9]{1,6}/."
      end

      @order_item_number = order_item_number
    end

    # Custom attribute writer method with validation
    # @param [Object] fci_number Value to be assigned
    def fci_number=(fci_number)

      if !fci_number.nil? && fci_number !~ Regexp.new(/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/)
        fail ArgumentError, "invalid value for 'fci_number', must conform to the pattern /[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/."
      end

      @fci_number = fci_number
    end

    # Custom attribute writer method with validation
    # @param [Object] recopi_number Value to be assigned
    def recopi_number=(recopi_number)

      if !recopi_number.nil? && recopi_number.to_s.length > 20
        fail ArgumentError, "invalid value for 'recopi_number', the character length must be smaller than or equal to 20."
      end

      if !recopi_number.nil? && recopi_number !~ Regexp.new(/[0-9]{20}/)
        fail ArgumentError, "invalid value for 'recopi_number', must conform to the pattern /[0-9]{20}/."
      end

      @recopi_number = recopi_number
    end

    # Custom attribute writer method with validation
    # @param [Object] inf_ad_prod Value to be assigned
    def inf_ad_prod=(inf_ad_prod)

      if !inf_ad_prod.nil? && inf_ad_prod.to_s.length > 500
        fail ArgumentError, "invalid value for 'inf_ad_prod', the character length must be smaller than or equal to 500."
      end

      @inf_ad_prod = inf_ad_prod
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          line_code == o.line_code &&
          item_code == o.item_code &&
          avalara_goods_and_services_type == o.avalara_goods_and_services_type &&
          number_of_items == o.number_of_items &&
          returned_percentage_amount == o.returned_percentage_amount &&
          line_unit_price == o.line_unit_price &&
          line_amount == o.line_amount &&
          item_description == o.item_description &&
          line_taxed_discount == o.line_taxed_discount &&
          line_untaxed_discount == o.line_untaxed_discount &&
          use_type == o.use_type &&
          process_scenario == o.process_scenario &&
          cfop == o.cfop &&
          has_stock_impact == o.has_stock_impact &&
          has_finantial_impact == o.has_finantial_impact &&
          freight_amount == o.freight_amount &&
          insurance_amount == o.insurance_amount &&
          other_cost_amount == o.other_cost_amount &&
          ind_tot_type == o.ind_tot_type &&
          order_number == o.order_number &&
          order_item_number == o.order_item_number &&
          fci_number == o.fci_number &&
          recopi_number == o.recopi_number &&
          inf_ad_prod == o.inf_ad_prod &&
          vehicle == o.vehicle &&
          medicine == o.medicine &&
          weapon == o.weapon &&
          fuel == o.fuel &&
          entity_is_icms_substitute == o.entity_is_icms_substitute &&
          is_transport_icms_withheld == o.is_transport_icms_withheld &&
          icms_tax_relief == o.icms_tax_relief &&
          export == o.export &&
          di == o.di &&
          calculated_tax == o.calculated_tax
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [line_code, item_code, avalara_goods_and_services_type, number_of_items, returned_percentage_amount, line_unit_price, line_amount, item_description, line_taxed_discount, line_untaxed_discount, use_type, process_scenario, cfop, has_stock_impact, has_finantial_impact, freight_amount, insurance_amount, other_cost_amount, ind_tot_type, order_number, order_item_number, fci_number, recopi_number, inf_ad_prod, vehicle, medicine, weapon, fuel, entity_is_icms_substitute, is_transport_icms_withheld, icms_tax_relief, export, di, calculated_tax].hash
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
