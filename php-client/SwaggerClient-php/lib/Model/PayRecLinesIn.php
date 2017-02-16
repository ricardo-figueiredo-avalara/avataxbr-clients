<?php
/**
 * PayRecLinesIn
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
 * PayRecLinesIn Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class PayRecLinesIn implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'PayRecLinesIn';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'line_code' => 'int',
        'line_type' => 'string',
        'item_code' => 'string',
        'item_description' => 'string',
        'item_doc_number' => 'string',
        'line_untaxed_penality' => 'double',
        'line_untaxed_discount' => 'double'
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
        'line_code' => 'lineCode',
        'line_type' => 'lineType',
        'item_code' => 'itemCode',
        'item_description' => 'itemDescription',
        'item_doc_number' => 'itemDocNumber',
        'line_untaxed_penality' => 'lineUntaxedPenality',
        'line_untaxed_discount' => 'lineUntaxedDiscount'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'line_code' => 'setLineCode',
        'line_type' => 'setLineType',
        'item_code' => 'setItemCode',
        'item_description' => 'setItemDescription',
        'item_doc_number' => 'setItemDocNumber',
        'line_untaxed_penality' => 'setLineUntaxedPenality',
        'line_untaxed_discount' => 'setLineUntaxedDiscount'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'line_code' => 'getLineCode',
        'line_type' => 'getLineType',
        'item_code' => 'getItemCode',
        'item_description' => 'getItemDescription',
        'item_doc_number' => 'getItemDocNumber',
        'line_untaxed_penality' => 'getLineUntaxedPenality',
        'line_untaxed_discount' => 'getLineUntaxedDiscount'
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

    const LINE_TYPE_INSTALLMENT = 'installment';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getLineTypeAllowableValues()
    {
        return [
            self::LINE_TYPE_INSTALLMENT,
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
        $this->container['line_code'] = isset($data['line_code']) ? $data['line_code'] : null;
        $this->container['line_type'] = isset($data['line_type']) ? $data['line_type'] : null;
        $this->container['item_code'] = isset($data['item_code']) ? $data['item_code'] : null;
        $this->container['item_description'] = isset($data['item_description']) ? $data['item_description'] : null;
        $this->container['item_doc_number'] = isset($data['item_doc_number']) ? $data['item_doc_number'] : null;
        $this->container['line_untaxed_penality'] = isset($data['line_untaxed_penality']) ? $data['line_untaxed_penality'] : null;
        $this->container['line_untaxed_discount'] = isset($data['line_untaxed_discount']) ? $data['line_untaxed_discount'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        $allowed_values = ["installment"];
        if (!in_array($this->container['line_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'line_type', must be one of #{allowed_values}.";
        }

        if ($this->container['item_code'] === null) {
            $invalid_properties[] = "'item_code' can't be null";
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
        $allowed_values = ["installment"];
        if (!in_array($this->container['line_type'], $allowed_values)) {
            return false;
        }
        if ($this->container['item_code'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets line_code
     * @return int
     */
    public function getLineCode()
    {
        return $this->container['line_code'];
    }

    /**
     * Sets line_code
     * @param int $line_code Installment number in this document
     * @return $this
     */
    public function setLineCode($line_code)
    {
        $this->container['line_code'] = $line_code;

        return $this;
    }

    /**
     * Gets line_type
     * @return string
     */
    public function getLineType()
    {
        return $this->container['line_type'];
    }

    /**
     * Sets line_type
     * @param string $line_type
     * @return $this
     */
    public function setLineType($line_type)
    {
        $allowed_values = array('installment');
        if (!is_null($line_type) && (!in_array($line_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'line_type', must be one of 'installment'");
        }
        $this->container['line_type'] = $line_type;

        return $this;
    }

    /**
     * Gets item_code
     * @return string
     */
    public function getItemCode()
    {
        return $this->container['item_code'];
    }

    /**
     * Sets item_code
     * @param string $item_code Bill transaction code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc.
     * @return $this
     */
    public function setItemCode($item_code)
    {
        $this->container['item_code'] = $item_code;

        return $this;
    }

    /**
     * Gets item_description
     * @return string
     */
    public function getItemDescription()
    {
        return $this->container['item_description'];
    }

    /**
     * Sets item_description
     * @param string $item_description Free description about this payment
     * @return $this
     */
    public function setItemDescription($item_description)
    {
        $this->container['item_description'] = $item_description;

        return $this;
    }

    /**
     * Gets item_doc_number
     * @return string
     */
    public function getItemDocNumber()
    {
        return $this->container['item_doc_number'];
    }

    /**
     * Sets item_doc_number
     * @param string $item_doc_number Installment number, when paid AS IS
     * @return $this
     */
    public function setItemDocNumber($item_doc_number)
    {
        $this->container['item_doc_number'] = $item_doc_number;

        return $this;
    }

    /**
     * Gets line_untaxed_penality
     * @return double
     */
    public function getLineUntaxedPenality()
    {
        return $this->container['line_untaxed_penality'];
    }

    /**
     * Sets line_untaxed_penality
     * @param double $line_untaxed_penality Penalty, usually because paid after due date
     * @return $this
     */
    public function setLineUntaxedPenality($line_untaxed_penality)
    {
        $this->container['line_untaxed_penality'] = $line_untaxed_penality;

        return $this;
    }

    /**
     * Gets line_untaxed_discount
     * @return double
     */
    public function getLineUntaxedDiscount()
    {
        return $this->container['line_untaxed_discount'];
    }

    /**
     * Sets line_untaxed_discount
     * @param double $line_untaxed_discount unconditional discounts
     * @return $this
     */
    public function setLineUntaxedDiscount($line_untaxed_discount)
    {
        $this->container['line_untaxed_discount'] = $line_untaxed_discount;

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


