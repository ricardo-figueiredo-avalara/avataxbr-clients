<?php
/**
 * PccWithholdingMode
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
 * PccWithholdingMode Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class PccWithholdingMode implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'PccWithholdingMode';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'type' => 'string',
        'total_tax' => 'double',
        'pis_rf' => '\Swagger\Client\Model\TaxByTypeTax',
        'cofins_rf' => '\Swagger\Client\Model\TaxByTypeTax',
        'csll_rf' => '\Swagger\Client\Model\TaxByTypeTax'
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
        'type' => 'type',
        'total_tax' => 'totalTax',
        'pis_rf' => 'pisRf',
        'cofins_rf' => 'cofinsRf',
        'csll_rf' => 'csllRf'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'type' => 'setType',
        'total_tax' => 'setTotalTax',
        'pis_rf' => 'setPisRf',
        'cofins_rf' => 'setCofinsRf',
        'csll_rf' => 'setCsllRf'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'type' => 'getType',
        'total_tax' => 'getTotalTax',
        'pis_rf' => 'getPisRf',
        'cofins_rf' => 'getCofinsRf',
        'csll_rf' => 'getCsllRf'
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

    const TYPE_CSRF = 'CSRF';
    const TYPE_INDIVIDUAL = 'individual';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTypeAllowableValues()
    {
        return [
            self::TYPE_CSRF,
            self::TYPE_INDIVIDUAL,
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
        $this->container['type'] = isset($data['type']) ? $data['type'] : null;
        $this->container['total_tax'] = isset($data['total_tax']) ? $data['total_tax'] : null;
        $this->container['pis_rf'] = isset($data['pis_rf']) ? $data['pis_rf'] : null;
        $this->container['cofins_rf'] = isset($data['cofins_rf']) ? $data['cofins_rf'] : null;
        $this->container['csll_rf'] = isset($data['csll_rf']) ? $data['csll_rf'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        $allowed_values = ["CSRF", "individual"];
        if (!in_array($this->container['type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'type', must be one of #{allowed_values}.";
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
        $allowed_values = ["CSRF", "individual"];
        if (!in_array($this->container['type'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets type
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     * @param string $type Inform if this group of tax are calculated considering the threashold by PCC or Individualy (each tax separately)
     * @return $this
     */
    public function setType($type)
    {
        $allowed_values = array('CSRF', 'individual');
        if (!is_null($type) && (!in_array($type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'type', must be one of 'CSRF', 'individual'");
        }
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets total_tax
     * @return double
     */
    public function getTotalTax()
    {
        return $this->container['total_tax'];
    }

    /**
     * Sets total_tax
     * @param double $total_tax this attribute occurs only for CSRF type, When CRSF mode, this is sum of pisRf, CofinsRf and CsllRf
     * @return $this
     */
    public function setTotalTax($total_tax)
    {
        $this->container['total_tax'] = $total_tax;

        return $this;
    }

    /**
     * Gets pis_rf
     * @return \Swagger\Client\Model\TaxByTypeTax
     */
    public function getPisRf()
    {
        return $this->container['pis_rf'];
    }

    /**
     * Sets pis_rf
     * @param \Swagger\Client\Model\TaxByTypeTax $pis_rf
     * @return $this
     */
    public function setPisRf($pis_rf)
    {
        $this->container['pis_rf'] = $pis_rf;

        return $this;
    }

    /**
     * Gets cofins_rf
     * @return \Swagger\Client\Model\TaxByTypeTax
     */
    public function getCofinsRf()
    {
        return $this->container['cofins_rf'];
    }

    /**
     * Sets cofins_rf
     * @param \Swagger\Client\Model\TaxByTypeTax $cofins_rf
     * @return $this
     */
    public function setCofinsRf($cofins_rf)
    {
        $this->container['cofins_rf'] = $cofins_rf;

        return $this;
    }

    /**
     * Gets csll_rf
     * @return \Swagger\Client\Model\TaxByTypeTax
     */
    public function getCsllRf()
    {
        return $this->container['csll_rf'];
    }

    /**
     * Sets csll_rf
     * @param \Swagger\Client\Model\TaxByTypeTax $csll_rf
     * @return $this
     */
    public function setCsllRf($csll_rf)
    {
        $this->container['csll_rf'] = $csll_rf;

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


