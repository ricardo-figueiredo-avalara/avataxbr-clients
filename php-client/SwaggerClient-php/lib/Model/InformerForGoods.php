<?php
/**
 * InformerForGoods
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
 * InformerForGoods Class Doc Comment
 *
 * @category    Class */
 // @description Internal Type used to references all taxes.
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class InformerForGoods implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'InformerForGoods';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'header' => '\Swagger\Client\Model\HeaderForGoods',
        'line' => '\Swagger\Client\Model\LineForGoods',
        '_company' => '\Swagger\Client\Model\EntityInformerForGoods',
        '_entity' => '\Swagger\Client\Model\EntityInformerForGoods',
        'emitter' => '\Swagger\Client\Model\EntityInformerForGoods',
        'receiver' => '\Swagger\Client\Model\EntityInformerForGoods',
        'transporter' => '\Swagger\Client\Model\EntityInformerForGoods',
        'csts' => '\Swagger\Client\Model\InformerForGoodsCsts',
        'amount' => 'float',
        'discount' => 'float',
        'quantity' => 'float',
        'unit_price' => 'float',
        'freight_amount' => 'float',
        'insurance_amount' => 'float',
        'other_cost_amount' => 'float',
        'exempt_value' => 'float'
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
        'header' => 'header',
        'line' => 'line',
        '_company' => '_company',
        '_entity' => '_entity',
        'emitter' => 'emitter',
        'receiver' => 'receiver',
        'transporter' => 'transporter',
        'csts' => 'csts',
        'amount' => 'amount',
        'discount' => 'discount',
        'quantity' => 'quantity',
        'unit_price' => 'unitPrice',
        'freight_amount' => 'freightAmount',
        'insurance_amount' => 'insuranceAmount',
        'other_cost_amount' => 'otherCostAmount',
        'exempt_value' => 'exemptValue'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'header' => 'setHeader',
        'line' => 'setLine',
        '_company' => 'setCompany',
        '_entity' => 'setEntity',
        'emitter' => 'setEmitter',
        'receiver' => 'setReceiver',
        'transporter' => 'setTransporter',
        'csts' => 'setCsts',
        'amount' => 'setAmount',
        'discount' => 'setDiscount',
        'quantity' => 'setQuantity',
        'unit_price' => 'setUnitPrice',
        'freight_amount' => 'setFreightAmount',
        'insurance_amount' => 'setInsuranceAmount',
        'other_cost_amount' => 'setOtherCostAmount',
        'exempt_value' => 'setExemptValue'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'header' => 'getHeader',
        'line' => 'getLine',
        '_company' => 'getCompany',
        '_entity' => 'getEntity',
        'emitter' => 'getEmitter',
        'receiver' => 'getReceiver',
        'transporter' => 'getTransporter',
        'csts' => 'getCsts',
        'amount' => 'getAmount',
        'discount' => 'getDiscount',
        'quantity' => 'getQuantity',
        'unit_price' => 'getUnitPrice',
        'freight_amount' => 'getFreightAmount',
        'insurance_amount' => 'getInsuranceAmount',
        'other_cost_amount' => 'getOtherCostAmount',
        'exempt_value' => 'getExemptValue'
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
        $this->container['header'] = isset($data['header']) ? $data['header'] : null;
        $this->container['line'] = isset($data['line']) ? $data['line'] : null;
        $this->container['_company'] = isset($data['_company']) ? $data['_company'] : null;
        $this->container['_entity'] = isset($data['_entity']) ? $data['_entity'] : null;
        $this->container['emitter'] = isset($data['emitter']) ? $data['emitter'] : null;
        $this->container['receiver'] = isset($data['receiver']) ? $data['receiver'] : null;
        $this->container['transporter'] = isset($data['transporter']) ? $data['transporter'] : null;
        $this->container['csts'] = isset($data['csts']) ? $data['csts'] : null;
        $this->container['amount'] = isset($data['amount']) ? $data['amount'] : null;
        $this->container['discount'] = isset($data['discount']) ? $data['discount'] : null;
        $this->container['quantity'] = isset($data['quantity']) ? $data['quantity'] : null;
        $this->container['unit_price'] = isset($data['unit_price']) ? $data['unit_price'] : null;
        $this->container['freight_amount'] = isset($data['freight_amount']) ? $data['freight_amount'] : null;
        $this->container['insurance_amount'] = isset($data['insurance_amount']) ? $data['insurance_amount'] : null;
        $this->container['other_cost_amount'] = isset($data['other_cost_amount']) ? $data['other_cost_amount'] : null;
        $this->container['exempt_value'] = isset($data['exempt_value']) ? $data['exempt_value'] : null;
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
     * Gets header
     * @return \Swagger\Client\Model\HeaderForGoods
     */
    public function getHeader()
    {
        return $this->container['header'];
    }

    /**
     * Sets header
     * @param \Swagger\Client\Model\HeaderForGoods $header
     * @return $this
     */
    public function setHeader($header)
    {
        $this->container['header'] = $header;

        return $this;
    }

    /**
     * Gets line
     * @return \Swagger\Client\Model\LineForGoods
     */
    public function getLine()
    {
        return $this->container['line'];
    }

    /**
     * Sets line
     * @param \Swagger\Client\Model\LineForGoods $line
     * @return $this
     */
    public function setLine($line)
    {
        $this->container['line'] = $line;

        return $this;
    }

    /**
     * Gets _company
     * @return \Swagger\Client\Model\EntityInformerForGoods
     */
    public function getCompany()
    {
        return $this->container['_company'];
    }

    /**
     * Sets _company
     * @param \Swagger\Client\Model\EntityInformerForGoods $_company
     * @return $this
     */
    public function setCompany($_company)
    {
        $this->container['_company'] = $_company;

        return $this;
    }

    /**
     * Gets _entity
     * @return \Swagger\Client\Model\EntityInformerForGoods
     */
    public function getEntity()
    {
        return $this->container['_entity'];
    }

    /**
     * Sets _entity
     * @param \Swagger\Client\Model\EntityInformerForGoods $_entity
     * @return $this
     */
    public function setEntity($_entity)
    {
        $this->container['_entity'] = $_entity;

        return $this;
    }

    /**
     * Gets emitter
     * @return \Swagger\Client\Model\EntityInformerForGoods
     */
    public function getEmitter()
    {
        return $this->container['emitter'];
    }

    /**
     * Sets emitter
     * @param \Swagger\Client\Model\EntityInformerForGoods $emitter
     * @return $this
     */
    public function setEmitter($emitter)
    {
        $this->container['emitter'] = $emitter;

        return $this;
    }

    /**
     * Gets receiver
     * @return \Swagger\Client\Model\EntityInformerForGoods
     */
    public function getReceiver()
    {
        return $this->container['receiver'];
    }

    /**
     * Sets receiver
     * @param \Swagger\Client\Model\EntityInformerForGoods $receiver
     * @return $this
     */
    public function setReceiver($receiver)
    {
        $this->container['receiver'] = $receiver;

        return $this;
    }

    /**
     * Gets transporter
     * @return \Swagger\Client\Model\EntityInformerForGoods
     */
    public function getTransporter()
    {
        return $this->container['transporter'];
    }

    /**
     * Sets transporter
     * @param \Swagger\Client\Model\EntityInformerForGoods $transporter
     * @return $this
     */
    public function setTransporter($transporter)
    {
        $this->container['transporter'] = $transporter;

        return $this;
    }

    /**
     * Gets csts
     * @return \Swagger\Client\Model\InformerForGoodsCsts
     */
    public function getCsts()
    {
        return $this->container['csts'];
    }

    /**
     * Sets csts
     * @param \Swagger\Client\Model\InformerForGoodsCsts $csts
     * @return $this
     */
    public function setCsts($csts)
    {
        $this->container['csts'] = $csts;

        return $this;
    }

    /**
     * Gets amount
     * @return float
     */
    public function getAmount()
    {
        return $this->container['amount'];
    }

    /**
     * Sets amount
     * @param float $amount
     * @return $this
     */
    public function setAmount($amount)
    {
        $this->container['amount'] = $amount;

        return $this;
    }

    /**
     * Gets discount
     * @return float
     */
    public function getDiscount()
    {
        return $this->container['discount'];
    }

    /**
     * Sets discount
     * @param float $discount
     * @return $this
     */
    public function setDiscount($discount)
    {
        $this->container['discount'] = $discount;

        return $this;
    }

    /**
     * Gets quantity
     * @return float
     */
    public function getQuantity()
    {
        return $this->container['quantity'];
    }

    /**
     * Sets quantity
     * @param float $quantity
     * @return $this
     */
    public function setQuantity($quantity)
    {
        $this->container['quantity'] = $quantity;

        return $this;
    }

    /**
     * Gets unit_price
     * @return float
     */
    public function getUnitPrice()
    {
        return $this->container['unit_price'];
    }

    /**
     * Sets unit_price
     * @param float $unit_price
     * @return $this
     */
    public function setUnitPrice($unit_price)
    {
        $this->container['unit_price'] = $unit_price;

        return $this;
    }

    /**
     * Gets freight_amount
     * @return float
     */
    public function getFreightAmount()
    {
        return $this->container['freight_amount'];
    }

    /**
     * Sets freight_amount
     * @param float $freight_amount
     * @return $this
     */
    public function setFreightAmount($freight_amount)
    {
        $this->container['freight_amount'] = $freight_amount;

        return $this;
    }

    /**
     * Gets insurance_amount
     * @return float
     */
    public function getInsuranceAmount()
    {
        return $this->container['insurance_amount'];
    }

    /**
     * Sets insurance_amount
     * @param float $insurance_amount
     * @return $this
     */
    public function setInsuranceAmount($insurance_amount)
    {
        $this->container['insurance_amount'] = $insurance_amount;

        return $this;
    }

    /**
     * Gets other_cost_amount
     * @return float
     */
    public function getOtherCostAmount()
    {
        return $this->container['other_cost_amount'];
    }

    /**
     * Sets other_cost_amount
     * @param float $other_cost_amount
     * @return $this
     */
    public function setOtherCostAmount($other_cost_amount)
    {
        $this->container['other_cost_amount'] = $other_cost_amount;

        return $this;
    }

    /**
     * Gets exempt_value
     * @return float
     */
    public function getExemptValue()
    {
        return $this->container['exempt_value'];
    }

    /**
     * Sets exempt_value
     * @param float $exempt_value
     * @return $this
     */
    public function setExemptValue($exempt_value)
    {
        $this->container['exempt_value'] = $exempt_value;

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


