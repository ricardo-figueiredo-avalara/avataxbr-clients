<?php
/**
 * ItemSimple
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
 * ItemSimple Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class ItemSimple implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'ItemSimple';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'company_id' => 'string',
        'code' => 'string',
        'agast' => 'string',
        'description' => 'string'
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
        'company_id' => 'companyId',
        'code' => 'code',
        'agast' => 'agast',
        'description' => 'description'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'company_id' => 'setCompanyId',
        'code' => 'setCode',
        'agast' => 'setAgast',
        'description' => 'setDescription'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'company_id' => 'getCompanyId',
        'code' => 'getCode',
        'agast' => 'getAgast',
        'description' => 'getDescription'
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
        $this->container['company_id'] = isset($data['company_id']) ? $data['company_id'] : null;
        $this->container['code'] = isset($data['code']) ? $data['code'] : null;
        $this->container['agast'] = isset($data['agast']) ? $data['agast'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['company_id'] === null) {
            $invalid_properties[] = "'company_id' can't be null";
        }
        if ($this->container['code'] === null) {
            $invalid_properties[] = "'code' can't be null";
        }
        if ((strlen($this->container['code']) > 60)) {
            $invalid_properties[] = "invalid value for 'code', the character length must be smaller than or equal to 60.";
        }

        if ($this->container['agast'] === null) {
            $invalid_properties[] = "'agast' can't be null";
        }
        if ((strlen($this->container['agast']) > 60)) {
            $invalid_properties[] = "invalid value for 'agast', the character length must be smaller than or equal to 60.";
        }

        if (!is_null($this->container['description']) && (strlen($this->container['description']) > 60)) {
            $invalid_properties[] = "invalid value for 'description', the character length must be smaller than or equal to 60.";
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
        if ($this->container['company_id'] === null) {
            return false;
        }
        if ($this->container['code'] === null) {
            return false;
        }
        if (strlen($this->container['code']) > 60) {
            return false;
        }
        if ($this->container['agast'] === null) {
            return false;
        }
        if (strlen($this->container['agast']) > 60) {
            return false;
        }
        if (strlen($this->container['description']) > 60) {
            return false;
        }
        return true;
    }


    /**
     * Gets company_id
     * @return string
     */
    public function getCompanyId()
    {
        return $this->container['company_id'];
    }

    /**
     * Sets company_id
     * @param string $company_id Company ID
     * @return $this
     */
    public function setCompanyId($company_id)
    {
        $this->container['company_id'] = $company_id;

        return $this;
    }

    /**
     * Gets code
     * @return string
     */
    public function getCode()
    {
        return $this->container['code'];
    }

    /**
     * Sets code
     * @param string $code ERP Code
     * @return $this
     */
    public function setCode($code)
    {
        if ((strlen($code) > 60)) {
            throw new \InvalidArgumentException('invalid length for $code when calling ItemSimple., must be smaller than or equal to 60.');
        }

        $this->container['code'] = $code;

        return $this;
    }

    /**
     * Gets agast
     * @return string
     */
    public function getAgast()
    {
        return $this->container['agast'];
    }

    /**
     * Sets agast
     * @param string $agast Agast Code
     * @return $this
     */
    public function setAgast($agast)
    {
        if ((strlen($agast) > 60)) {
            throw new \InvalidArgumentException('invalid length for $agast when calling ItemSimple., must be smaller than or equal to 60.');
        }

        $this->container['agast'] = $agast;

        return $this;
    }

    /**
     * Gets description
     * @return string
     */
    public function getDescription()
    {
        return $this->container['description'];
    }

    /**
     * Sets description
     * @param string $description Item Description
     * @return $this
     */
    public function setDescription($description)
    {
        if (!is_null($description) && (strlen($description) > 60)) {
            throw new \InvalidArgumentException('invalid length for $description when calling ItemSimple., must be smaller than or equal to 60.');
        }

        $this->container['description'] = $description;

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


