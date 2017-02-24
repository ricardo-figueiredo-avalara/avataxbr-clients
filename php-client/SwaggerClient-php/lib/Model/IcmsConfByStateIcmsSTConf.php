<?php
/**
 * IcmsConfByStateIcmsSTConf
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
 * IcmsConfByStateIcmsSTConf Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class IcmsConfByStateIcmsSTConf implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'IcmsConfByState_icmsSTConf';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'has_reduction_of_mva_for_simples' => 'bool',
        'reduction_of_mva_for_simples' => 'double',
        'calc_mode' => 'string',
        'mva_rate' => 'double',
        'icms_st_base_discount' => 'double',
        'srp' => 'double',
        'srp_unit' => 'string'
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
        'has_reduction_of_mva_for_simples' => 'hasReductionOfMVAForSimples',
        'reduction_of_mva_for_simples' => 'reductionOfMVAForSimples',
        'calc_mode' => 'calcMode',
        'mva_rate' => 'mvaRate',
        'icms_st_base_discount' => 'icmsStBaseDiscount',
        'srp' => 'srp',
        'srp_unit' => 'srpUnit'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'has_reduction_of_mva_for_simples' => 'setHasReductionOfMvaForSimples',
        'reduction_of_mva_for_simples' => 'setReductionOfMvaForSimples',
        'calc_mode' => 'setCalcMode',
        'mva_rate' => 'setMvaRate',
        'icms_st_base_discount' => 'setIcmsStBaseDiscount',
        'srp' => 'setSrp',
        'srp_unit' => 'setSrpUnit'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'has_reduction_of_mva_for_simples' => 'getHasReductionOfMvaForSimples',
        'reduction_of_mva_for_simples' => 'getReductionOfMvaForSimples',
        'calc_mode' => 'getCalcMode',
        'mva_rate' => 'getMvaRate',
        'icms_st_base_discount' => 'getIcmsStBaseDiscount',
        'srp' => 'getSrp',
        'srp_unit' => 'getSrpUnit'
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

    const CALC_MODE_BYMVARATE = 'BYMVARATE';
    const CALC_MODE_SRP = 'SRP';
    const CALC_MODE_MSRP = 'MSRP';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getCalcModeAllowableValues()
    {
        return [
            self::CALC_MODE_BYMVARATE,
            self::CALC_MODE_SRP,
            self::CALC_MODE_MSRP,
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
        $this->container['has_reduction_of_mva_for_simples'] = isset($data['has_reduction_of_mva_for_simples']) ? $data['has_reduction_of_mva_for_simples'] : null;
        $this->container['reduction_of_mva_for_simples'] = isset($data['reduction_of_mva_for_simples']) ? $data['reduction_of_mva_for_simples'] : null;
        $this->container['calc_mode'] = isset($data['calc_mode']) ? $data['calc_mode'] : null;
        $this->container['mva_rate'] = isset($data['mva_rate']) ? $data['mva_rate'] : null;
        $this->container['icms_st_base_discount'] = isset($data['icms_st_base_discount']) ? $data['icms_st_base_discount'] : null;
        $this->container['srp'] = isset($data['srp']) ? $data['srp'] : null;
        $this->container['srp_unit'] = isset($data['srp_unit']) ? $data['srp_unit'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        $allowed_values = ["BYMVARATE", "SRP", "MSRP"];
        if (!in_array($this->container['calc_mode'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'calc_mode', must be one of #{allowed_values}.";
        }

        if (!is_null($this->container['srp_unit']) && (strlen($this->container['srp_unit']) > 6)) {
            $invalid_properties[] = "invalid value for 'srp_unit', the character length must be smaller than or equal to 6.";
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
        $allowed_values = ["BYMVARATE", "SRP", "MSRP"];
        if (!in_array($this->container['calc_mode'], $allowed_values)) {
            return false;
        }
        if (strlen($this->container['srp_unit']) > 6) {
            return false;
        }
        return true;
    }


    /**
     * Gets has_reduction_of_mva_for_simples
     * @return bool
     */
    public function getHasReductionOfMvaForSimples()
    {
        return $this->container['has_reduction_of_mva_for_simples'];
    }

    /**
     * Sets has_reduction_of_mva_for_simples
     * @param bool $has_reduction_of_mva_for_simples inform that substituted is tax regime Simplified the operation MVA will be reduced
     * @return $this
     */
    public function setHasReductionOfMvaForSimples($has_reduction_of_mva_for_simples)
    {
        $this->container['has_reduction_of_mva_for_simples'] = $has_reduction_of_mva_for_simples;

        return $this;
    }

    /**
     * Gets reduction_of_mva_for_simples
     * @return double
     */
    public function getReductionOfMvaForSimples()
    {
        return $this->container['reduction_of_mva_for_simples'];
    }

    /**
     * Sets reduction_of_mva_for_simples
     * @param double $reduction_of_mva_for_simples mva reduction when substituted is tax regime Simplified.
     * @return $this
     */
    public function setReductionOfMvaForSimples($reduction_of_mva_for_simples)
    {
        $this->container['reduction_of_mva_for_simples'] = $reduction_of_mva_for_simples;

        return $this;
    }

    /**
     * Gets calc_mode
     * @return string
     */
    public function getCalcMode()
    {
        return $this->container['calc_mode'];
    }

    /**
     * Sets calc_mode
     * @param string $calc_mode how this ICMS-ST will be calculed for itens linked to this configuration
     * @return $this
     */
    public function setCalcMode($calc_mode)
    {
        $allowed_values = array('BYMVARATE', 'SRP', 'MSRP');
        if (!is_null($calc_mode) && (!in_array($calc_mode, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'calc_mode', must be one of 'BYMVARATE', 'SRP', 'MSRP'");
        }
        $this->container['calc_mode'] = $calc_mode;

        return $this;
    }

    /**
     * Gets mva_rate
     * @return double
     */
    public function getMvaRate()
    {
        return $this->container['mva_rate'];
    }

    /**
     * Sets mva_rate
     * @param double $mva_rate ICMS-ST mva rate to define calc base
     * @return $this
     */
    public function setMvaRate($mva_rate)
    {
        $this->container['mva_rate'] = $mva_rate;

        return $this;
    }

    /**
     * Gets icms_st_base_discount
     * @return double
     */
    public function getIcmsStBaseDiscount()
    {
        return $this->container['icms_st_base_discount'];
    }

    /**
     * Sets icms_st_base_discount
     * @param double $icms_st_base_discount ICMS rate - Redução da BC ICMS ST (%)
     * @return $this
     */
    public function setIcmsStBaseDiscount($icms_st_base_discount)
    {
        $this->container['icms_st_base_discount'] = $icms_st_base_discount;

        return $this;
    }

    /**
     * Gets srp
     * @return double
     */
    public function getSrp()
    {
        return $this->container['srp'];
    }

    /**
     * Sets srp
     * @param double $srp SRP or MSRP amount base for this ICMS-ST configuration
     * @return $this
     */
    public function setSrp($srp)
    {
        $this->container['srp'] = $srp;

        return $this;
    }

    /**
     * Gets srp_unit
     * @return string
     */
    public function getSrpUnit()
    {
        return $this->container['srp_unit'];
    }

    /**
     * Sets srp_unit
     * @param string $srp_unit unit used to srv amount value
     * @return $this
     */
    public function setSrpUnit($srp_unit)
    {
        if (!is_null($srp_unit) && (strlen($srp_unit) > 6)) {
            throw new \InvalidArgumentException('invalid length for $srp_unit when calling IcmsConfByStateIcmsSTConf., must be smaller than or equal to 6.');
        }

        $this->container['srp_unit'] = $srp_unit;

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


