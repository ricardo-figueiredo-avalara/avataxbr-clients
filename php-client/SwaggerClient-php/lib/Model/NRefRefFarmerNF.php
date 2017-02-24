<?php
/**
 * NRefRefFarmerNF
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
 * NRefRefFarmerNF Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class NRefRefFarmerNF implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'NRef_refFarmerNF';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'state_cd' => '\Swagger\Client\Model\StateEnum',
        'yymm' => 'string',
        'federal_tax_id' => 'string',
        'state_tax_id' => 'string',
        'model' => 'string',
        'serie' => 'string',
        'number' => 'string'
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
        'state_cd' => 'stateCd',
        'yymm' => 'yymm',
        'federal_tax_id' => 'federalTaxId',
        'state_tax_id' => 'stateTaxId',
        'model' => 'model',
        'serie' => 'serie',
        'number' => 'number'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'state_cd' => 'setStateCd',
        'yymm' => 'setYymm',
        'federal_tax_id' => 'setFederalTaxId',
        'state_tax_id' => 'setStateTaxId',
        'model' => 'setModel',
        'serie' => 'setSerie',
        'number' => 'setNumber'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'state_cd' => 'getStateCd',
        'yymm' => 'getYymm',
        'federal_tax_id' => 'getFederalTaxId',
        'state_tax_id' => 'getStateTaxId',
        'model' => 'getModel',
        'serie' => 'getSerie',
        'number' => 'getNumber'
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

    const MODEL__04 = '04';
    const MODEL__01 = '01';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getModelAllowableValues()
    {
        return [
            self::MODEL__04,
            self::MODEL__01,
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
        $this->container['state_cd'] = isset($data['state_cd']) ? $data['state_cd'] : null;
        $this->container['yymm'] = isset($data['yymm']) ? $data['yymm'] : null;
        $this->container['federal_tax_id'] = isset($data['federal_tax_id']) ? $data['federal_tax_id'] : null;
        $this->container['state_tax_id'] = isset($data['state_tax_id']) ? $data['state_tax_id'] : null;
        $this->container['model'] = isset($data['model']) ? $data['model'] : null;
        $this->container['serie'] = isset($data['serie']) ? $data['serie'] : null;
        $this->container['number'] = isset($data['number']) ? $data['number'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['state_cd'] === null) {
            $invalid_properties[] = "'state_cd' can't be null";
        }
        if ($this->container['yymm'] === null) {
            $invalid_properties[] = "'yymm' can't be null";
        }
        if (!preg_match("/[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}/", $this->container['yymm'])) {
            $invalid_properties[] = "invalid value for 'yymm', must be conform to the pattern /[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}/.";
        }

        if ($this->container['federal_tax_id'] === null) {
            $invalid_properties[] = "'federal_tax_id' can't be null";
        }
        if (!preg_match("/[0-9]{14}/", $this->container['federal_tax_id'])) {
            $invalid_properties[] = "invalid value for 'federal_tax_id', must be conform to the pattern /[0-9]{14}/.";
        }

        if ($this->container['state_tax_id'] === null) {
            $invalid_properties[] = "'state_tax_id' can't be null";
        }
        if (!preg_match("/[0-9]{14}/", $this->container['state_tax_id'])) {
            $invalid_properties[] = "invalid value for 'state_tax_id', must be conform to the pattern /[0-9]{14}/.";
        }

        if ($this->container['model'] === null) {
            $invalid_properties[] = "'model' can't be null";
        }
        $allowed_values = ["04", "01"];
        if (!in_array($this->container['model'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'model', must be one of #{allowed_values}.";
        }

        if ($this->container['serie'] === null) {
            $invalid_properties[] = "'serie' can't be null";
        }
        if (!preg_match("/0|[1-9]{1}[0-9]{0,2}/", $this->container['serie'])) {
            $invalid_properties[] = "invalid value for 'serie', must be conform to the pattern /0|[1-9]{1}[0-9]{0,2}/.";
        }

        if ($this->container['number'] === null) {
            $invalid_properties[] = "'number' can't be null";
        }
        if (!preg_match("/[1-9]{1}[0-9]{0,8}/", $this->container['number'])) {
            $invalid_properties[] = "invalid value for 'number', must be conform to the pattern /[1-9]{1}[0-9]{0,8}/.";
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
        if ($this->container['state_cd'] === null) {
            return false;
        }
        if ($this->container['yymm'] === null) {
            return false;
        }
        if (!preg_match("/[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}/", $this->container['yymm'])) {
            return false;
        }
        if ($this->container['federal_tax_id'] === null) {
            return false;
        }
        if (!preg_match("/[0-9]{14}/", $this->container['federal_tax_id'])) {
            return false;
        }
        if ($this->container['state_tax_id'] === null) {
            return false;
        }
        if (!preg_match("/[0-9]{14}/", $this->container['state_tax_id'])) {
            return false;
        }
        if ($this->container['model'] === null) {
            return false;
        }
        $allowed_values = ["04", "01"];
        if (!in_array($this->container['model'], $allowed_values)) {
            return false;
        }
        if ($this->container['serie'] === null) {
            return false;
        }
        if (!preg_match("/0|[1-9]{1}[0-9]{0,2}/", $this->container['serie'])) {
            return false;
        }
        if ($this->container['number'] === null) {
            return false;
        }
        if (!preg_match("/[1-9]{1}[0-9]{0,8}/", $this->container['number'])) {
            return false;
        }
        return true;
    }


    /**
     * Gets state_cd
     * @return \Swagger\Client\Model\StateEnum
     */
    public function getStateCd()
    {
        return $this->container['state_cd'];
    }

    /**
     * Sets state_cd
     * @param \Swagger\Client\Model\StateEnum $state_cd State code of fiscal Document creator, farmer
     * @return $this
     */
    public function setStateCd($state_cd)
    {
        $this->container['state_cd'] = $state_cd;

        return $this;
    }

    /**
     * Gets yymm
     * @return string
     */
    public function getYymm()
    {
        return $this->container['yymm'];
    }

    /**
     * Sets yymm
     * @param string $yymm year and month of fiscal document creation
     * @return $this
     */
    public function setYymm($yymm)
    {

        if ((!preg_match("/[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}/", $yymm))) {
            throw new \InvalidArgumentException("invalid value for $yymm when calling NRefRefFarmerNF., must conform to the pattern /[0-9]{2}[0]{1}[1-9]{1}|[0-9]{2}[1]{1}[0-2]{1}/.");
        }

        $this->container['yymm'] = $yymm;

        return $this;
    }

    /**
     * Gets federal_tax_id
     * @return string
     */
    public function getFederalTaxId()
    {
        return $this->container['federal_tax_id'];
    }

    /**
     * Sets federal_tax_id
     * @param string $federal_tax_id fiscal document creator farmer federalTaxId
     * @return $this
     */
    public function setFederalTaxId($federal_tax_id)
    {

        if ((!preg_match("/[0-9]{14}/", $federal_tax_id))) {
            throw new \InvalidArgumentException("invalid value for $federal_tax_id when calling NRefRefFarmerNF., must conform to the pattern /[0-9]{14}/.");
        }

        $this->container['federal_tax_id'] = $federal_tax_id;

        return $this;
    }

    /**
     * Gets state_tax_id
     * @return string
     */
    public function getStateTaxId()
    {
        return $this->container['state_tax_id'];
    }

    /**
     * Sets state_tax_id
     * @param string $state_tax_id fiscal document creator, farmer stateTaxId
     * @return $this
     */
    public function setStateTaxId($state_tax_id)
    {

        if ((!preg_match("/[0-9]{14}/", $state_tax_id))) {
            throw new \InvalidArgumentException("invalid value for $state_tax_id when calling NRefRefFarmerNF., must conform to the pattern /[0-9]{14}/.");
        }

        $this->container['state_tax_id'] = $state_tax_id;

        return $this;
    }

    /**
     * Gets model
     * @return string
     */
    public function getModel()
    {
        return $this->container['model'];
    }

    /**
     * Sets model
     * @param string $model Document Fiscal model - '04' # FARMER DOCUMENT - '01' # DETACHED DOCUMENT - AVULSO
     * @return $this
     */
    public function setModel($model)
    {
        $allowed_values = array('04', '01');
        if ((!in_array($model, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'model', must be one of '04', '01'");
        }
        $this->container['model'] = $model;

        return $this;
    }

    /**
     * Gets serie
     * @return string
     */
    public function getSerie()
    {
        return $this->container['serie'];
    }

    /**
     * Sets serie
     * @param string $serie fiscal document serie
     * @return $this
     */
    public function setSerie($serie)
    {

        if ((!preg_match("/0|[1-9]{1}[0-9]{0,2}/", $serie))) {
            throw new \InvalidArgumentException("invalid value for $serie when calling NRefRefFarmerNF., must conform to the pattern /0|[1-9]{1}[0-9]{0,2}/.");
        }

        $this->container['serie'] = $serie;

        return $this;
    }

    /**
     * Gets number
     * @return string
     */
    public function getNumber()
    {
        return $this->container['number'];
    }

    /**
     * Sets number
     * @param string $number fiscal document number
     * @return $this
     */
    public function setNumber($number)
    {

        if ((!preg_match("/[1-9]{1}[0-9]{0,8}/", $number))) {
            throw new \InvalidArgumentException("invalid value for $number when calling NRefRefFarmerNF., must conform to the pattern /[1-9]{1}[0-9]{0,8}/.");
        }

        $this->container['number'] = $number;

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


