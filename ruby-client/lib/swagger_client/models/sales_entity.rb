=begin
#BR16 - API

#This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'date'

module SwaggerClient

  class SalesEntity
    # SERVICE BUYER NAME OFFICIAL
    attr_accessor :name

    attr_accessor :type

    # Entity Email
    attr_accessor :email

    # CNPJ/CPF of Sales Buyer, if CPF pattern is '[0-9]{11}' if CNPJ pattern is '[0-9]{14}'
    attr_accessor :cnpjcpf

    # City Tax ID
    attr_accessor :city_tax_id

    # State Tax ID
    attr_accessor :state_tax_id

    # Suframa ID
    attr_accessor :suframa

    # Entity Phone
    attr_accessor :phone

    attr_accessor :tax_regime

    # Entity Special Tax Regime  - 'MEM' # Microempresa municipal - 'EST' # Estimativa - 'SPR' # Sociedade de profissionais - 'COP' # Cooperativa - 'MEI' # Microempresário Individual (MEI) - 'MPP' # Microempresário e Empresa de Pequeno Porte (ME EPP) 
    attr_accessor :special_tax_regime

    # Companies subject to rule follow same rule of Government
    attr_accessor :subject_to_srf1234

    # If Withholding ISS is required, independently the rules applied.
    attr_accessor :required_withholding_iss

    # technical note. Anota\\u00e7\\u00e3o de Responsabilidade T\\u00e9cnica-ART, estabelece que todos os contratos referentes à  execu\\u00e7\\u00e3o de servi\\u00e7os ou obras de Engenharia, Agronomia, Geologia, Geografia ou Meteorologia dever\\u00e3o ser objeto de anota\\u00e7\\u00e3o no Conselho Regional de Engenharia e Agronomia
    attr_accessor :art

    # PROCESS NUMBER TO ISS SUSPENDED FOR ADMINISTRATIVE PROCESS
    attr_accessor :admin_process

    # Business code. Código da obra OBRA
    attr_accessor :build_code

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
        :'name' => :'name',
        :'type' => :'type',
        :'email' => :'email',
        :'cnpjcpf' => :'cnpjcpf',
        :'city_tax_id' => :'cityTaxId',
        :'state_tax_id' => :'stateTaxId',
        :'suframa' => :'suframa',
        :'phone' => :'phone',
        :'tax_regime' => :'taxRegime',
        :'special_tax_regime' => :'specialTaxRegime',
        :'subject_to_srf1234' => :'subjectToSRF1234',
        :'required_withholding_iss' => :'requiredWithholdingISS',
        :'art' => :'art',
        :'admin_process' => :'adminProcess',
        :'build_code' => :'buildCode'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'name' => :'String',
        :'type' => :'EntityType',
        :'email' => :'String',
        :'cnpjcpf' => :'String',
        :'city_tax_id' => :'String',
        :'state_tax_id' => :'String',
        :'suframa' => :'String',
        :'phone' => :'String',
        :'tax_regime' => :'FederalTaxRegime',
        :'special_tax_regime' => :'String',
        :'subject_to_srf1234' => :'BOOLEAN',
        :'required_withholding_iss' => :'BOOLEAN',
        :'art' => :'String',
        :'admin_process' => :'String',
        :'build_code' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}){|(k,v), h| h[k.to_sym] = v}

      if attributes.has_key?(:'name')
        self.name = attributes[:'name']
      end

      if attributes.has_key?(:'type')
        self.type = attributes[:'type']
      end

      if attributes.has_key?(:'email')
        self.email = attributes[:'email']
      end

      if attributes.has_key?(:'cnpjcpf')
        self.cnpjcpf = attributes[:'cnpjcpf']
      end

      if attributes.has_key?(:'cityTaxId')
        self.city_tax_id = attributes[:'cityTaxId']
      end

      if attributes.has_key?(:'stateTaxId')
        self.state_tax_id = attributes[:'stateTaxId']
      end

      if attributes.has_key?(:'suframa')
        self.suframa = attributes[:'suframa']
      end

      if attributes.has_key?(:'phone')
        self.phone = attributes[:'phone']
      end

      if attributes.has_key?(:'taxRegime')
        self.tax_regime = attributes[:'taxRegime']
      end

      if attributes.has_key?(:'specialTaxRegime')
        self.special_tax_regime = attributes[:'specialTaxRegime']
      end

      if attributes.has_key?(:'subjectToSRF1234')
        self.subject_to_srf1234 = attributes[:'subjectToSRF1234']
      end

      if attributes.has_key?(:'requiredWithholdingISS')
        self.required_withholding_iss = attributes[:'requiredWithholdingISS']
      end

      if attributes.has_key?(:'art')
        self.art = attributes[:'art']
      end

      if attributes.has_key?(:'adminProcess')
        self.admin_process = attributes[:'adminProcess']
      end

      if attributes.has_key?(:'buildCode')
        self.build_code = attributes[:'buildCode']
      end

    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properies with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      if !@name.nil? && @name.to_s.length > 60
        invalid_properties.push("invalid value for 'name', the character length must be smaller than or equal to 60.")
      end

      if @type.nil?
        invalid_properties.push("invalid value for 'type', type cannot be nil.")
      end

      if !@email.nil? && @email.to_s.length > 60
        invalid_properties.push("invalid value for 'email', the character length must be smaller than or equal to 60.")
      end

      if !@cnpjcpf.nil? && @cnpjcpf !~ Regexp.new(/([!-ÿ]{0}|[!-ÿ]{5,20})?/)
        invalid_properties.push("invalid value for 'cnpjcpf', must conform to the pattern /([!-ÿ]{0}|[!-ÿ]{5,20})?/.")
      end

      if !@city_tax_id.nil? && @city_tax_id.to_s.length > 15
        invalid_properties.push("invalid value for 'city_tax_id', the character length must be smaller than or equal to 15.")
      end

      if !@state_tax_id.nil? && @state_tax_id !~ Regexp.new(/[0-9]{2,14}|ISENTO/)
        invalid_properties.push("invalid value for 'state_tax_id', must conform to the pattern /[0-9]{2,14}|ISENTO/.")
      end

      if !@suframa.nil? && @suframa !~ Regexp.new(/[0-9]{8,9}/)
        invalid_properties.push("invalid value for 'suframa', must conform to the pattern /[0-9]{8,9}/.")
      end

      if !@phone.nil? && @phone !~ Regexp.new(/[0-9]{6,14}/)
        invalid_properties.push("invalid value for 'phone', must conform to the pattern /[0-9]{6,14}/.")
      end

      if @tax_regime.nil?
        invalid_properties.push("invalid value for 'tax_regime', tax_regime cannot be nil.")
      end

      if !@art.nil? && @art.to_s.length > 15
        invalid_properties.push("invalid value for 'art', the character length must be smaller than or equal to 15.")
      end

      if !@admin_process.nil? && @admin_process.to_s.length > 30
        invalid_properties.push("invalid value for 'admin_process', the character length must be smaller than or equal to 30.")
      end

      if !@build_code.nil? && @build_code.to_s.length > 15
        invalid_properties.push("invalid value for 'build_code', the character length must be smaller than or equal to 15.")
      end

      return invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      return false if !@name.nil? && @name.to_s.length > 60
      return false if @type.nil?
      return false if !@email.nil? && @email.to_s.length > 60
      return false if !@cnpjcpf.nil? && @cnpjcpf !~ Regexp.new(/([!-ÿ]{0}|[!-ÿ]{5,20})?/)
      return false if !@city_tax_id.nil? && @city_tax_id.to_s.length > 15
      return false if !@state_tax_id.nil? && @state_tax_id !~ Regexp.new(/[0-9]{2,14}|ISENTO/)
      return false if !@suframa.nil? && @suframa !~ Regexp.new(/[0-9]{8,9}/)
      return false if !@phone.nil? && @phone !~ Regexp.new(/[0-9]{6,14}/)
      return false if @tax_regime.nil?
      special_tax_regime_validator = EnumAttributeValidator.new('String', ["MEM", "EST", "SPR", "COP", "MEI", "MPP"])
      return false unless special_tax_regime_validator.valid?(@special_tax_regime)
      return false if !@art.nil? && @art.to_s.length > 15
      return false if !@admin_process.nil? && @admin_process.to_s.length > 30
      return false if !@build_code.nil? && @build_code.to_s.length > 15
      return true
    end

    # Custom attribute writer method with validation
    # @param [Object] name Value to be assigned
    def name=(name)

      if !name.nil? && name.to_s.length > 60
        fail ArgumentError, "invalid value for 'name', the character length must be smaller than or equal to 60."
      end

      @name = name
    end

    # Custom attribute writer method with validation
    # @param [Object] email Value to be assigned
    def email=(email)

      if !email.nil? && email.to_s.length > 60
        fail ArgumentError, "invalid value for 'email', the character length must be smaller than or equal to 60."
      end

      @email = email
    end

    # Custom attribute writer method with validation
    # @param [Object] cnpjcpf Value to be assigned
    def cnpjcpf=(cnpjcpf)

      if !cnpjcpf.nil? && cnpjcpf !~ Regexp.new(/([!-ÿ]{0}|[!-ÿ]{5,20})?/)
        fail ArgumentError, "invalid value for 'cnpjcpf', must conform to the pattern /([!-ÿ]{0}|[!-ÿ]{5,20})?/."
      end

      @cnpjcpf = cnpjcpf
    end

    # Custom attribute writer method with validation
    # @param [Object] city_tax_id Value to be assigned
    def city_tax_id=(city_tax_id)

      if !city_tax_id.nil? && city_tax_id.to_s.length > 15
        fail ArgumentError, "invalid value for 'city_tax_id', the character length must be smaller than or equal to 15."
      end

      @city_tax_id = city_tax_id
    end

    # Custom attribute writer method with validation
    # @param [Object] state_tax_id Value to be assigned
    def state_tax_id=(state_tax_id)

      if !state_tax_id.nil? && state_tax_id !~ Regexp.new(/[0-9]{2,14}|ISENTO/)
        fail ArgumentError, "invalid value for 'state_tax_id', must conform to the pattern /[0-9]{2,14}|ISENTO/."
      end

      @state_tax_id = state_tax_id
    end

    # Custom attribute writer method with validation
    # @param [Object] suframa Value to be assigned
    def suframa=(suframa)

      if !suframa.nil? && suframa !~ Regexp.new(/[0-9]{8,9}/)
        fail ArgumentError, "invalid value for 'suframa', must conform to the pattern /[0-9]{8,9}/."
      end

      @suframa = suframa
    end

    # Custom attribute writer method with validation
    # @param [Object] phone Value to be assigned
    def phone=(phone)

      if !phone.nil? && phone !~ Regexp.new(/[0-9]{6,14}/)
        fail ArgumentError, "invalid value for 'phone', must conform to the pattern /[0-9]{6,14}/."
      end

      @phone = phone
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] special_tax_regime Object to be assigned
    def special_tax_regime=(special_tax_regime)
      validator = EnumAttributeValidator.new('String', ["MEM", "EST", "SPR", "COP", "MEI", "MPP"])
      unless validator.valid?(special_tax_regime)
        fail ArgumentError, "invalid value for 'special_tax_regime', must be one of #{validator.allowable_values}."
      end
      @special_tax_regime = special_tax_regime
    end

    # Custom attribute writer method with validation
    # @param [Object] art Value to be assigned
    def art=(art)

      if !art.nil? && art.to_s.length > 15
        fail ArgumentError, "invalid value for 'art', the character length must be smaller than or equal to 15."
      end

      @art = art
    end

    # Custom attribute writer method with validation
    # @param [Object] admin_process Value to be assigned
    def admin_process=(admin_process)

      if !admin_process.nil? && admin_process.to_s.length > 30
        fail ArgumentError, "invalid value for 'admin_process', the character length must be smaller than or equal to 30."
      end

      @admin_process = admin_process
    end

    # Custom attribute writer method with validation
    # @param [Object] build_code Value to be assigned
    def build_code=(build_code)

      if !build_code.nil? && build_code.to_s.length > 15
        fail ArgumentError, "invalid value for 'build_code', the character length must be smaller than or equal to 15."
      end

      @build_code = build_code
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          name == o.name &&
          type == o.type &&
          email == o.email &&
          cnpjcpf == o.cnpjcpf &&
          city_tax_id == o.city_tax_id &&
          state_tax_id == o.state_tax_id &&
          suframa == o.suframa &&
          phone == o.phone &&
          tax_regime == o.tax_regime &&
          special_tax_regime == o.special_tax_regime &&
          subject_to_srf1234 == o.subject_to_srf1234 &&
          required_withholding_iss == o.required_withholding_iss &&
          art == o.art &&
          admin_process == o.admin_process &&
          build_code == o.build_code
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [name, type, email, cnpjcpf, city_tax_id, state_tax_id, suframa, phone, tax_regime, special_tax_regime, subject_to_srf1234, required_withholding_iss, art, admin_process, build_code].hash
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