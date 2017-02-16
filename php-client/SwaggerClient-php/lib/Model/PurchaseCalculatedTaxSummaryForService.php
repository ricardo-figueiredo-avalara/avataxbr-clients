<?php
/**
 * PurchaseCalculatedTaxSummaryForService
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
 * PurchaseCalculatedTaxSummaryForService Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class PurchaseCalculatedTaxSummaryForService implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'PurchaseCalculatedTaxSummaryForService';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'number_of_lines' => 'int',
        'subtotal' => 'double',
        'total_tax' => 'double',
        'grand_total' => 'double',
        'tax_by_type' => '\Swagger\Client\Model\PurchaseCalculatedTaxSummaryForServiceTaxByType'
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
        'number_of_lines' => 'numberOfLines',
        'subtotal' => 'subtotal',
        'total_tax' => 'totalTax',
        'grand_total' => 'grandTotal',
        'tax_by_type' => 'taxByType'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'number_of_lines' => 'setNumberOfLines',
        'subtotal' => 'setSubtotal',
        'total_tax' => 'setTotalTax',
        'grand_total' => 'setGrandTotal',
        'tax_by_type' => 'setTaxByType'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'number_of_lines' => 'getNumberOfLines',
        'subtotal' => 'getSubtotal',
        'total_tax' => 'getTotalTax',
        'grand_total' => 'getGrandTotal',
        'tax_by_type' => 'getTaxByType'
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
        $this->container['number_of_lines'] = isset($data['number_of_lines']) ? $data['number_of_lines'] : null;
        $this->container['subtotal'] = isset($data['subtotal']) ? $data['subtotal'] : null;
        $this->container['total_tax'] = isset($data['total_tax']) ? $data['total_tax'] : null;
        $this->container['grand_total'] = isset($data['grand_total']) ? $data['grand_total'] : null;
        $this->container['tax_by_type'] = isset($data['tax_by_type']) ? $data['tax_by_type'] : null;
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
     * Gets number_of_lines
     * @return int
     */
    public function getNumberOfLines()
    {
        return $this->container['number_of_lines'];
    }

    /**
     * Sets number_of_lines
     * @param int $number_of_lines Count of lines
     * @return $this
     */
    public function setNumberOfLines($number_of_lines)
    {
        $this->container['number_of_lines'] = $number_of_lines;

        return $this;
    }

    /**
     * Gets subtotal
     * @return double
     */
    public function getSubtotal()
    {
        return $this->container['subtotal'];
    }

    /**
     * Sets subtotal
     * @param double $subtotal sum of all line tax attribute
     * @return $this
     */
    public function setSubtotal($subtotal)
    {
        $this->container['subtotal'] = $subtotal;

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
     * @param double $total_tax sum of all line lineAmount attribute
     * @return $this
     */
    public function setTotalTax($total_tax)
    {
        $this->container['total_tax'] = $total_tax;

        return $this;
    }

    /**
     * Gets grand_total
     * @return double
     */
    public function getGrandTotal()
    {
        return $this->container['grand_total'];
    }

    /**
     * Sets grand_total
     * @param double $grand_total sum of all line lineAmount attribute - sum of all line tax attribute - sum of all line lineTaxedDiscount attribute
     * @return $this
     */
    public function setGrandTotal($grand_total)
    {
        $this->container['grand_total'] = $grand_total;

        return $this;
    }

    /**
     * Gets tax_by_type
     * @return \Swagger\Client\Model\PurchaseCalculatedTaxSummaryForServiceTaxByType
     */
    public function getTaxByType()
    {
        return $this->container['tax_by_type'];
    }

    /**
     * Sets tax_by_type
     * @param \Swagger\Client\Model\PurchaseCalculatedTaxSummaryForServiceTaxByType $tax_by_type
     * @return $this
     */
    public function setTaxByType($tax_by_type)
    {
        $this->container['tax_by_type'] = $tax_by_type;

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


