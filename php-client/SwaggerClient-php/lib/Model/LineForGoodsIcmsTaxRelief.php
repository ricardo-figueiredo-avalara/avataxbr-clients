<?php
/**
 * LineForGoodsIcmsTaxRelief
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
 * LineForGoodsIcmsTaxRelief Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class LineForGoodsIcmsTaxRelief implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'LineForGoods_icmsTaxRelief';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'icms_tax_relief_reason_code' => 'int',
        'icms_relief_tax_rate' => 'double',
        'icms_relief_tax_amount' => 'double'
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
        'icms_tax_relief_reason_code' => 'icmsTaxReliefReasonCode',
        'icms_relief_tax_rate' => 'icmsReliefTaxRate',
        'icms_relief_tax_amount' => 'icmsReliefTaxAmount'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'icms_tax_relief_reason_code' => 'setIcmsTaxReliefReasonCode',
        'icms_relief_tax_rate' => 'setIcmsReliefTaxRate',
        'icms_relief_tax_amount' => 'setIcmsReliefTaxAmount'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'icms_tax_relief_reason_code' => 'getIcmsTaxReliefReasonCode',
        'icms_relief_tax_rate' => 'getIcmsReliefTaxRate',
        'icms_relief_tax_amount' => 'getIcmsReliefTaxAmount'
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
        $this->container['icms_tax_relief_reason_code'] = isset($data['icms_tax_relief_reason_code']) ? $data['icms_tax_relief_reason_code'] : null;
        $this->container['icms_relief_tax_rate'] = isset($data['icms_relief_tax_rate']) ? $data['icms_relief_tax_rate'] : null;
        $this->container['icms_relief_tax_amount'] = isset($data['icms_relief_tax_amount']) ? $data['icms_relief_tax_amount'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['icms_tax_relief_reason_code'] === null) {
            $invalid_properties[] = "'icms_tax_relief_reason_code' can't be null";
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
        if ($this->container['icms_tax_relief_reason_code'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets icms_tax_relief_reason_code
     * @return int
     */
    public function getIcmsTaxReliefReasonCode()
    {
        return $this->container['icms_tax_relief_reason_code'];
    }

    /**
     * Sets icms_tax_relief_reason_code
     * @param int $icms_tax_relief_reason_code When item transaction subject to desoneration, this is the reason code - 1 # Táxi; - 3 # Produtor Agropecuário; - 4 # Frotista/Locadora; - 5 # Diplomático/Consular; - 6 # Utilitários e Motocicletas da Amazônia Ocidental e Áreas de Livre Comércio (Resolução 714/88 e 790/94 – CONTRAN e suas alterações); - 7 # SUFRAMA; - 8 # Venda a órgão Público; - 9 # Outros - 10 # Deficiente Condutor - 11 # Deficiente não condutor - 12 # Fomento agropecuário - 16 # Olimpíadas Rio 2016
     * @return $this
     */
    public function setIcmsTaxReliefReasonCode($icms_tax_relief_reason_code)
    {
        $this->container['icms_tax_relief_reason_code'] = $icms_tax_relief_reason_code;

        return $this;
    }

    /**
     * Gets icms_relief_tax_rate
     * @return double
     */
    public function getIcmsReliefTaxRate()
    {
        return $this->container['icms_relief_tax_rate'];
    }

    /**
     * Sets icms_relief_tax_rate
     * @param double $icms_relief_tax_rate ICMS Tax base rate discount  (desconto na base do ICMS referetne a desoneração)
     * @return $this
     */
    public function setIcmsReliefTaxRate($icms_relief_tax_rate)
    {
        $this->container['icms_relief_tax_rate'] = $icms_relief_tax_rate;

        return $this;
    }

    /**
     * Gets icms_relief_tax_amount
     * @return double
     */
    public function getIcmsReliefTaxAmount()
    {
        return $this->container['icms_relief_tax_amount'];
    }

    /**
     * Sets icms_relief_tax_amount
     * @param double $icms_relief_tax_amount Amount for Icms Relief (desoneração)
     * @return $this
     */
    public function setIcmsReliefTaxAmount($icms_relief_tax_amount)
    {
        $this->container['icms_relief_tax_amount'] = $icms_relief_tax_amount;

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

