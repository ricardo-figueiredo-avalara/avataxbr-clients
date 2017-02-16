<?php
/**
 * EntityInformerForGoods
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * BR16 - API
 *
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
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
 * EntityInformerForGoods Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class EntityInformerForGoods implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'EntityInformerForGoods';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'type' => '\Swagger\Client\Model\EntityType',
        'tax_regime' => '\Swagger\Client\Model\FederalTaxRegime',
        'federal_tax_regime' => '\Swagger\Client\Model\EntityInformerForGoodsFederalTaxRegime',
        'city_code' => 'string',
        'address' => '\Swagger\Client\Model\Address',
        'details' => 'object',
        'icms_tax_payer' => 'bool'
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
        'tax_regime' => 'taxRegime',
        'federal_tax_regime' => 'federalTaxRegime',
        'city_code' => 'cityCode',
        'address' => 'address',
        'details' => 'details',
        'icms_tax_payer' => 'icmsTaxPayer'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'type' => 'setType',
        'tax_regime' => 'setTaxRegime',
        'federal_tax_regime' => 'setFederalTaxRegime',
        'city_code' => 'setCityCode',
        'address' => 'setAddress',
        'details' => 'setDetails',
        'icms_tax_payer' => 'setIcmsTaxPayer'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'type' => 'getType',
        'tax_regime' => 'getTaxRegime',
        'federal_tax_regime' => 'getFederalTaxRegime',
        'city_code' => 'getCityCode',
        'address' => 'getAddress',
        'details' => 'getDetails',
        'icms_tax_payer' => 'getIcmsTaxPayer'
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
        $this->container['tax_regime'] = isset($data['tax_regime']) ? $data['tax_regime'] : null;
        $this->container['federal_tax_regime'] = isset($data['federal_tax_regime']) ? $data['federal_tax_regime'] : null;
        $this->container['city_code'] = isset($data['city_code']) ? $data['city_code'] : null;
        $this->container['address'] = isset($data['address']) ? $data['address'] : null;
        $this->container['details'] = isset($data['details']) ? $data['details'] : null;
        $this->container['icms_tax_payer'] = isset($data['icms_tax_payer']) ? $data['icms_tax_payer'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
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
        return true;
    }


    /**
     * Gets type
     * @return \Swagger\Client\Model\EntityType
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     * @param \Swagger\Client\Model\EntityType $type
     * @return $this
     */
    public function setType($type)
    {
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets tax_regime
     * @return \Swagger\Client\Model\FederalTaxRegime
     */
    public function getTaxRegime()
    {
        return $this->container['tax_regime'];
    }

    /**
     * Sets tax_regime
     * @param \Swagger\Client\Model\FederalTaxRegime $tax_regime
     * @return $this
     */
    public function setTaxRegime($tax_regime)
    {
        $this->container['tax_regime'] = $tax_regime;

        return $this;
    }

    /**
     * Gets federal_tax_regime
     * @return \Swagger\Client\Model\EntityInformerForGoodsFederalTaxRegime
     */
    public function getFederalTaxRegime()
    {
        return $this->container['federal_tax_regime'];
    }

    /**
     * Sets federal_tax_regime
     * @param \Swagger\Client\Model\EntityInformerForGoodsFederalTaxRegime $federal_tax_regime
     * @return $this
     */
    public function setFederalTaxRegime($federal_tax_regime)
    {
        $this->container['federal_tax_regime'] = $federal_tax_regime;

        return $this;
    }

    /**
     * Gets city_code
     * @return string
     */
    public function getCityCode()
    {
        return $this->container['city_code'];
    }

    /**
     * Sets city_code
     * @param string $city_code
     * @return $this
     */
    public function setCityCode($city_code)
    {
        $this->container['city_code'] = $city_code;

        return $this;
    }

    /**
     * Gets address
     * @return \Swagger\Client\Model\Address
     */
    public function getAddress()
    {
        return $this->container['address'];
    }

    /**
     * Sets address
     * @param \Swagger\Client\Model\Address $address
     * @return $this
     */
    public function setAddress($address)
    {
        $this->container['address'] = $address;

        return $this;
    }

    /**
     * Gets details
     * @return object
     */
    public function getDetails()
    {
        return $this->container['details'];
    }

    /**
     * Sets details
     * @param object $details
     * @return $this
     */
    public function setDetails($details)
    {
        $this->container['details'] = $details;

        return $this;
    }

    /**
     * Gets icms_tax_payer
     * @return bool
     */
    public function getIcmsTaxPayer()
    {
        return $this->container['icms_tax_payer'];
    }

    /**
     * Sets icms_tax_payer
     * @param bool $icms_tax_payer
     * @return $this
     */
    public function setIcmsTaxPayer($icms_tax_payer)
    {
        $this->container['icms_tax_payer'] = $icms_tax_payer;

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

