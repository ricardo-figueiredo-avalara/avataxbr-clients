<?php
/**
 * LineForGoodsDi
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * LineForGoodsDi Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class LineForGoodsDi implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'LineForGoods_di';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'customs_value' => 'double',
        'di_number' => 'string',
        'register_date_di' => '\DateTime',
        'clearance_site' => 'string',
        'clearance_state' => '\Swagger\Client\Model\StateEnum',
        'clearance_date' => '\DateTime',
        'transport_di_type' => 'string',
        'afrmm_value' => 'double',
        'intermediate_type' => 'string',
        'buyer_federal_tax_id' => 'string',
        'buyer_state' => '\Swagger\Client\Model\StateEnum',
        'exporter_code' => 'string',
        'adi' => '\Swagger\Client\Model\LineForGoodsAdi[]'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'customs_value' => 'customsValue',
        'di_number' => 'diNumber',
        'register_date_di' => 'registerDateDI',
        'clearance_site' => 'clearanceSite',
        'clearance_state' => 'clearanceState',
        'clearance_date' => 'clearanceDate',
        'transport_di_type' => 'transportDIType',
        'afrmm_value' => 'afrmmValue',
        'intermediate_type' => 'intermediateType',
        'buyer_federal_tax_id' => 'buyerFederalTaxID',
        'buyer_state' => 'buyerState',
        'exporter_code' => 'exporterCode',
        'adi' => 'adi'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'customs_value' => 'setCustomsValue',
        'di_number' => 'setDiNumber',
        'register_date_di' => 'setRegisterDateDi',
        'clearance_site' => 'setClearanceSite',
        'clearance_state' => 'setClearanceState',
        'clearance_date' => 'setClearanceDate',
        'transport_di_type' => 'setTransportDiType',
        'afrmm_value' => 'setAfrmmValue',
        'intermediate_type' => 'setIntermediateType',
        'buyer_federal_tax_id' => 'setBuyerFederalTaxId',
        'buyer_state' => 'setBuyerState',
        'exporter_code' => 'setExporterCode',
        'adi' => 'setAdi'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'customs_value' => 'getCustomsValue',
        'di_number' => 'getDiNumber',
        'register_date_di' => 'getRegisterDateDi',
        'clearance_site' => 'getClearanceSite',
        'clearance_state' => 'getClearanceState',
        'clearance_date' => 'getClearanceDate',
        'transport_di_type' => 'getTransportDiType',
        'afrmm_value' => 'getAfrmmValue',
        'intermediate_type' => 'getIntermediateType',
        'buyer_federal_tax_id' => 'getBuyerFederalTaxId',
        'buyer_state' => 'getBuyerState',
        'exporter_code' => 'getExporterCode',
        'adi' => 'getAdi'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    const TRANSPORT_DI_TYPE__1 = '1';
    const TRANSPORT_DI_TYPE__2 = '2';
    const TRANSPORT_DI_TYPE__3 = '3';
    const TRANSPORT_DI_TYPE__4 = '4';
    const TRANSPORT_DI_TYPE__5 = '5';
    const TRANSPORT_DI_TYPE__6 = '6';
    const TRANSPORT_DI_TYPE__7 = '7';
    const TRANSPORT_DI_TYPE__8 = '8';
    const TRANSPORT_DI_TYPE__9 = '9';
    const TRANSPORT_DI_TYPE__10 = '10';
    const INTERMEDIATE_TYPE__1 = '1';
    const INTERMEDIATE_TYPE__2 = '2';
    const INTERMEDIATE_TYPE__3 = '3';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTransportDiTypeAllowableValues()
    {
        return [
            self::TRANSPORT_DI_TYPE__1,
            self::TRANSPORT_DI_TYPE__2,
            self::TRANSPORT_DI_TYPE__3,
            self::TRANSPORT_DI_TYPE__4,
            self::TRANSPORT_DI_TYPE__5,
            self::TRANSPORT_DI_TYPE__6,
            self::TRANSPORT_DI_TYPE__7,
            self::TRANSPORT_DI_TYPE__8,
            self::TRANSPORT_DI_TYPE__9,
            self::TRANSPORT_DI_TYPE__10,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getIntermediateTypeAllowableValues()
    {
        return [
            self::INTERMEDIATE_TYPE__1,
            self::INTERMEDIATE_TYPE__2,
            self::INTERMEDIATE_TYPE__3,
        ];
    }
    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['customs_value'] = isset($data['customs_value']) ? $data['customs_value'] : null;
        $this->container['di_number'] = isset($data['di_number']) ? $data['di_number'] : null;
        $this->container['register_date_di'] = isset($data['register_date_di']) ? $data['register_date_di'] : null;
        $this->container['clearance_site'] = isset($data['clearance_site']) ? $data['clearance_site'] : null;
        $this->container['clearance_state'] = isset($data['clearance_state']) ? $data['clearance_state'] : null;
        $this->container['clearance_date'] = isset($data['clearance_date']) ? $data['clearance_date'] : null;
        $this->container['transport_di_type'] = isset($data['transport_di_type']) ? $data['transport_di_type'] : null;
        $this->container['afrmm_value'] = isset($data['afrmm_value']) ? $data['afrmm_value'] : null;
        $this->container['intermediate_type'] = isset($data['intermediate_type']) ? $data['intermediate_type'] : null;
        $this->container['buyer_federal_tax_id'] = isset($data['buyer_federal_tax_id']) ? $data['buyer_federal_tax_id'] : null;
        $this->container['buyer_state'] = isset($data['buyer_state']) ? $data['buyer_state'] : null;
        $this->container['exporter_code'] = isset($data['exporter_code']) ? $data['exporter_code'] : null;
        $this->container['adi'] = isset($data['adi']) ? $data['adi'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['di_number'] === null) {
            $invalid_properties[] = "'di_number' can't be null";
        }
        if ((strlen($this->container['di_number']) > 12)) {
            $invalid_properties[] = "invalid value for 'di_number', the character length must be smaller than or equal to 12.";
        }

        if ((strlen($this->container['di_number']) < 1)) {
            $invalid_properties[] = "invalid value for 'di_number', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['register_date_di'] === null) {
            $invalid_properties[] = "'register_date_di' can't be null";
        }
        if ($this->container['clearance_site'] === null) {
            $invalid_properties[] = "'clearance_site' can't be null";
        }
        if ((strlen($this->container['clearance_site']) > 60)) {
            $invalid_properties[] = "invalid value for 'clearance_site', the character length must be smaller than or equal to 60.";
        }

        if ((strlen($this->container['clearance_site']) < 1)) {
            $invalid_properties[] = "invalid value for 'clearance_site', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['clearance_state'] === null) {
            $invalid_properties[] = "'clearance_state' can't be null";
        }
        if ($this->container['transport_di_type'] === null) {
            $invalid_properties[] = "'transport_di_type' can't be null";
        }
        $allowed_values = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"];
        if (!in_array($this->container['transport_di_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'transport_di_type', must be one of #{allowed_values}.";
        }

        if ($this->container['intermediate_type'] === null) {
            $invalid_properties[] = "'intermediate_type' can't be null";
        }
        $allowed_values = ["1", "2", "3"];
        if (!in_array($this->container['intermediate_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'intermediate_type', must be one of #{allowed_values}.";
        }

        if (!is_null($this->container['buyer_federal_tax_id']) && !preg_match("/[0-9]{14}/", $this->container['buyer_federal_tax_id'])) {
            $invalid_properties[] = "invalid value for 'buyer_federal_tax_id', must be conform to the pattern /[0-9]{14}/.";
        }

        if (!is_null($this->container['exporter_code']) && (strlen($this->container['exporter_code']) > 60)) {
            $invalid_properties[] = "invalid value for 'exporter_code', the character length must be smaller than or equal to 60.";
        }

        if (!is_null($this->container['exporter_code']) && (strlen($this->container['exporter_code']) < 1)) {
            $invalid_properties[] = "invalid value for 'exporter_code', the character length must be bigger than or equal to 1.";
        }

        if ($this->container['adi'] === null) {
            $invalid_properties[] = "'adi' can't be null";
        }
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        if ($this->container['di_number'] === null) {
            return false;
        }
        if (strlen($this->container['di_number']) > 12) {
            return false;
        }
        if (strlen($this->container['di_number']) < 1) {
            return false;
        }
        if ($this->container['register_date_di'] === null) {
            return false;
        }
        if ($this->container['clearance_site'] === null) {
            return false;
        }
        if (strlen($this->container['clearance_site']) > 60) {
            return false;
        }
        if (strlen($this->container['clearance_site']) < 1) {
            return false;
        }
        if ($this->container['clearance_state'] === null) {
            return false;
        }
        if ($this->container['transport_di_type'] === null) {
            return false;
        }
        $allowed_values = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"];
        if (!in_array($this->container['transport_di_type'], $allowed_values)) {
            return false;
        }
        if ($this->container['intermediate_type'] === null) {
            return false;
        }
        $allowed_values = ["1", "2", "3"];
        if (!in_array($this->container['intermediate_type'], $allowed_values)) {
            return false;
        }
        if (!preg_match("/[0-9]{14}/", $this->container['buyer_federal_tax_id'])) {
            return false;
        }
        if (strlen($this->container['exporter_code']) > 60) {
            return false;
        }
        if (strlen($this->container['exporter_code']) < 1) {
            return false;
        }
        if ($this->container['adi'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets customs_value
     * @return double
     */
    public function getCustomsValue()
    {
        return $this->container['customs_value'];
    }

    /**
     * Sets customs_value
     * @param double $customs_value customs value, valor aduaneiro (II Block of NFe)
     * @return $this
     */
    public function setCustomsValue($customs_value)
    {
        $this->container['customs_value'] = $customs_value;

        return $this;
    }

    /**
     * Gets di_number
     * @return string
     */
    public function getDiNumber()
    {
        return $this->container['di_number'];
    }

    /**
     * Sets di_number
     * @param string $di_number Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
     * @return $this
     */
    public function setDiNumber($di_number)
    {
        if ((strlen($di_number) > 12)) {
            throw new \InvalidArgumentException('invalid length for $di_number when calling LineForGoodsDi., must be smaller than or equal to 12.');
        }
        if ((strlen($di_number) < 1)) {
            throw new \InvalidArgumentException('invalid length for $di_number when calling LineForGoodsDi., must be bigger than or equal to 1.');
        }

        $this->container['di_number'] = $di_number;

        return $this;
    }

    /**
     * Gets register_date_di
     * @return \DateTime
     */
    public function getRegisterDateDi()
    {
        return $this->container['register_date_di'];
    }

    /**
     * Sets register_date_di
     * @param \DateTime $register_date_di Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)
     * @return $this
     */
    public function setRegisterDateDi($register_date_di)
    {
        $this->container['register_date_di'] = $register_date_di;

        return $this;
    }

    /**
     * Gets clearance_site
     * @return string
     */
    public function getClearanceSite()
    {
        return $this->container['clearance_site'];
    }

    /**
     * Sets clearance_site
     * @param string $clearance_site Clerance Site Local do desembaraço aduaneiro
     * @return $this
     */
    public function setClearanceSite($clearance_site)
    {
        if ((strlen($clearance_site) > 60)) {
            throw new \InvalidArgumentException('invalid length for $clearance_site when calling LineForGoodsDi., must be smaller than or equal to 60.');
        }
        if ((strlen($clearance_site) < 1)) {
            throw new \InvalidArgumentException('invalid length for $clearance_site when calling LineForGoodsDi., must be bigger than or equal to 1.');
        }

        $this->container['clearance_site'] = $clearance_site;

        return $this;
    }

    /**
     * Gets clearance_state
     * @return \Swagger\Client\Model\StateEnum
     */
    public function getClearanceState()
    {
        return $this->container['clearance_state'];
    }

    /**
     * Sets clearance_state
     * @param \Swagger\Client\Model\StateEnum $clearance_state Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro
     * @return $this
     */
    public function setClearanceState($clearance_state)
    {
        $this->container['clearance_state'] = $clearance_state;

        return $this;
    }

    /**
     * Gets clearance_date
     * @return \DateTime
     */
    public function getClearanceDate()
    {
        return $this->container['clearance_date'];
    }

    /**
     * Sets clearance_date
     * @param \DateTime $clearance_date Clerance date
     * @return $this
     */
    public function setClearanceDate($clearance_date)
    {
        $this->container['clearance_date'] = $clearance_date;

        return $this;
    }

    /**
     * Gets transport_di_type
     * @return string
     */
    public function getTransportDiType()
    {
        return $this->container['transport_di_type'];
    }

    /**
     * Sets transport_di_type
     * @param string $transport_di_type - '1' # Maritima - '2' # Fluvial - '3' # Lacustre - '4' # Aerea - '5' # Postal - '6' # Ferroviaria - '7' # Rodoviaria - '8' # Conduto - '9' # Meios Proprios - '10' # Entrada/Saida Ficta
     * @return $this
     */
    public function setTransportDiType($transport_di_type)
    {
        $allowed_values = array('1', '2', '3', '4', '5', '6', '7', '8', '9', '10');
        if ((!in_array($transport_di_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'transport_di_type', must be one of '1', '2', '3', '4', '5', '6', '7', '8', '9', '10'");
        }
        $this->container['transport_di_type'] = $transport_di_type;

        return $this;
    }

    /**
     * Gets afrmm_value
     * @return double
     */
    public function getAfrmmValue()
    {
        return $this->container['afrmm_value'];
    }

    /**
     * Sets afrmm_value
     * @param double $afrmm_value Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante]
     * @return $this
     */
    public function setAfrmmValue($afrmm_value)
    {
        $this->container['afrmm_value'] = $afrmm_value;

        return $this;
    }

    /**
     * Gets intermediate_type
     * @return string
     */
    public function getIntermediateType()
    {
        return $this->container['intermediate_type'];
    }

    /**
     * Sets intermediate_type
     * @param string $intermediate_type - '1' # On One's Own [1-por conta propria] - '2' # On Behalf And Order [2-por conta e ordem] - '3' # Order [3-encomenda]
     * @return $this
     */
    public function setIntermediateType($intermediate_type)
    {
        $allowed_values = array('1', '2', '3');
        if ((!in_array($intermediate_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'intermediate_type', must be one of '1', '2', '3'");
        }
        $this->container['intermediate_type'] = $intermediate_type;

        return $this;
    }

    /**
     * Gets buyer_federal_tax_id
     * @return string
     */
    public function getBuyerFederalTaxId()
    {
        return $this->container['buyer_federal_tax_id'];
    }

    /**
     * Sets buyer_federal_tax_id
     * @param string $buyer_federal_tax_id Buyer federal tax id CNPJ do comprador ou encomendante
     * @return $this
     */
    public function setBuyerFederalTaxId($buyer_federal_tax_id)
    {

        if (!is_null($buyer_federal_tax_id) && (!preg_match("/[0-9]{14}/", $buyer_federal_tax_id))) {
            throw new \InvalidArgumentException("invalid value for $buyer_federal_tax_id when calling LineForGoodsDi., must conform to the pattern /[0-9]{14}/.");
        }

        $this->container['buyer_federal_tax_id'] = $buyer_federal_tax_id;

        return $this;
    }

    /**
     * Gets buyer_state
     * @return \Swagger\Client\Model\StateEnum
     */
    public function getBuyerState()
    {
        return $this->container['buyer_state'];
    }

    /**
     * Sets buyer_state
     * @param \Swagger\Client\Model\StateEnum $buyer_state Buyer sate Estado do comprador ou encomendante
     * @return $this
     */
    public function setBuyerState($buyer_state)
    {
        $this->container['buyer_state'] = $buyer_state;

        return $this;
    }

    /**
     * Gets exporter_code
     * @return string
     */
    public function getExporterCode()
    {
        return $this->container['exporter_code'];
    }

    /**
     * Sets exporter_code
     * @param string $exporter_code Exporter code
     * @return $this
     */
    public function setExporterCode($exporter_code)
    {
        if (!is_null($exporter_code) && (strlen($exporter_code) > 60)) {
            throw new \InvalidArgumentException('invalid length for $exporter_code when calling LineForGoodsDi., must be smaller than or equal to 60.');
        }
        if (!is_null($exporter_code) && (strlen($exporter_code) < 1)) {
            throw new \InvalidArgumentException('invalid length for $exporter_code when calling LineForGoodsDi., must be bigger than or equal to 1.');
        }

        $this->container['exporter_code'] = $exporter_code;

        return $this;
    }

    /**
     * Gets adi
     * @return \Swagger\Client\Model\LineForGoodsAdi[]
     */
    public function getAdi()
    {
        return $this->container['adi'];
    }

    /**
     * Sets adi
     * @param \Swagger\Client\Model\LineForGoodsAdi[] $adi aditional import declaration
     * @return $this
     */
    public function setAdi($adi)
    {
        $this->container['adi'] = $adi;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


