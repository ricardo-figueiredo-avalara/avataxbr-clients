<?php
/**
 * PaymentTransactionOut
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
 * PaymentTransactionOut Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class PaymentTransactionOut implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'PaymentTransactionOut';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'header' => '\Swagger\Client\Model\PayRecHeader',
        'lines' => '\Swagger\Client\Model\PayRecLinesOut[]',
        'calculated_tax_summary' => '\Swagger\Client\Model\PayRecCalculatedTaxSummaryForService',
        'processing_info' => '\Swagger\Client\Model\ProcessingInfo'
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
        'lines' => 'lines',
        'calculated_tax_summary' => 'calculatedTaxSummary',
        'processing_info' => 'processingInfo'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'header' => 'setHeader',
        'lines' => 'setLines',
        'calculated_tax_summary' => 'setCalculatedTaxSummary',
        'processing_info' => 'setProcessingInfo'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'header' => 'getHeader',
        'lines' => 'getLines',
        'calculated_tax_summary' => 'getCalculatedTaxSummary',
        'processing_info' => 'getProcessingInfo'
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
        $this->container['lines'] = isset($data['lines']) ? $data['lines'] : null;
        $this->container['calculated_tax_summary'] = isset($data['calculated_tax_summary']) ? $data['calculated_tax_summary'] : null;
        $this->container['processing_info'] = isset($data['processing_info']) ? $data['processing_info'] : null;
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
     * @return \Swagger\Client\Model\PayRecHeader
     */
    public function getHeader()
    {
        return $this->container['header'];
    }

    /**
     * Sets header
     * @param \Swagger\Client\Model\PayRecHeader $header
     * @return $this
     */
    public function setHeader($header)
    {
        $this->container['header'] = $header;

        return $this;
    }

    /**
     * Gets lines
     * @return \Swagger\Client\Model\PayRecLinesOut[]
     */
    public function getLines()
    {
        return $this->container['lines'];
    }

    /**
     * Sets lines
     * @param \Swagger\Client\Model\PayRecLinesOut[] $lines
     * @return $this
     */
    public function setLines($lines)
    {
        $this->container['lines'] = $lines;

        return $this;
    }

    /**
     * Gets calculated_tax_summary
     * @return \Swagger\Client\Model\PayRecCalculatedTaxSummaryForService
     */
    public function getCalculatedTaxSummary()
    {
        return $this->container['calculated_tax_summary'];
    }

    /**
     * Sets calculated_tax_summary
     * @param \Swagger\Client\Model\PayRecCalculatedTaxSummaryForService $calculated_tax_summary
     * @return $this
     */
    public function setCalculatedTaxSummary($calculated_tax_summary)
    {
        $this->container['calculated_tax_summary'] = $calculated_tax_summary;

        return $this;
    }

    /**
     * Gets processing_info
     * @return \Swagger\Client\Model\ProcessingInfo
     */
    public function getProcessingInfo()
    {
        return $this->container['processing_info'];
    }

    /**
     * Sets processing_info
     * @param \Swagger\Client\Model\ProcessingInfo $processing_info
     * @return $this
     */
    public function setProcessingInfo($processing_info)
    {
        $this->container['processing_info'] = $processing_info;

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


