<?php
/**
 * AgastExtendForSefaz
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
 * AgastExtendForSefaz Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class AgastExtendForSefaz implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'AgastExtendForSefaz';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'hs_code' => 'string',
        'ex' => 'int',
        'cest' => 'string',
        'cean' => 'string',
        'nve' => 'string',
        'unit' => 'string',
        'unit_taxable' => 'string',
        'n_fci' => 'string'
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
        'hs_code' => 'hsCode',
        'ex' => 'ex',
        'cest' => 'cest',
        'cean' => 'cean',
        'nve' => 'nve',
        'unit' => 'unit',
        'unit_taxable' => 'unitTaxable',
        'n_fci' => 'nFCI'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'hs_code' => 'setHsCode',
        'ex' => 'setEx',
        'cest' => 'setCest',
        'cean' => 'setCean',
        'nve' => 'setNve',
        'unit' => 'setUnit',
        'unit_taxable' => 'setUnitTaxable',
        'n_fci' => 'setNFci'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'hs_code' => 'getHsCode',
        'ex' => 'getEx',
        'cest' => 'getCest',
        'cean' => 'getCean',
        'nve' => 'getNve',
        'unit' => 'getUnit',
        'unit_taxable' => 'getUnitTaxable',
        'n_fci' => 'getNFci'
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
        $this->container['hs_code'] = isset($data['hs_code']) ? $data['hs_code'] : null;
        $this->container['ex'] = isset($data['ex']) ? $data['ex'] : null;
        $this->container['cest'] = isset($data['cest']) ? $data['cest'] : null;
        $this->container['cean'] = isset($data['cean']) ? $data['cean'] : null;
        $this->container['nve'] = isset($data['nve']) ? $data['nve'] : null;
        $this->container['unit'] = isset($data['unit']) ? $data['unit'] : null;
        $this->container['unit_taxable'] = isset($data['unit_taxable']) ? $data['unit_taxable'] : null;
        $this->container['n_fci'] = isset($data['n_fci']) ? $data['n_fci'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if (!is_null($this->container['hs_code']) && (strlen($this->container['hs_code']) > 8)) {
            $invalid_properties[] = "invalid value for 'hs_code', the character length must be smaller than or equal to 8.";
        }

        if (!is_null($this->container['cest']) && !preg_match("/[0-9]{7}/", $this->container['cest'])) {
            $invalid_properties[] = "invalid value for 'cest', must be conform to the pattern /[0-9]{7}/.";
        }

        if (!is_null($this->container['cean']) && !preg_match("/[0-9]{0}|[0-9]{8}|[0-9]{12,14}/", $this->container['cean'])) {
            $invalid_properties[] = "invalid value for 'cean', must be conform to the pattern /[0-9]{0}|[0-9]{8}|[0-9]{12,14}/.";
        }

        if (!is_null($this->container['nve']) && !preg_match("/[A-Z]{2}[0-9]{4}/", $this->container['nve'])) {
            $invalid_properties[] = "invalid value for 'nve', must be conform to the pattern /[A-Z]{2}[0-9]{4}/.";
        }

        if (!is_null($this->container['unit']) && (strlen($this->container['unit']) > 6)) {
            $invalid_properties[] = "invalid value for 'unit', the character length must be smaller than or equal to 6.";
        }

        if (!is_null($this->container['unit_taxable']) && (strlen($this->container['unit_taxable']) > 6)) {
            $invalid_properties[] = "invalid value for 'unit_taxable', the character length must be smaller than or equal to 6.";
        }

        if (!is_null($this->container['n_fci']) && !preg_match("/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/", $this->container['n_fci'])) {
            $invalid_properties[] = "invalid value for 'n_fci', must be conform to the pattern /[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/.";
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
        if (strlen($this->container['hs_code']) > 8) {
            return false;
        }
        if (!preg_match("/[0-9]{7}/", $this->container['cest'])) {
            return false;
        }
        if (!preg_match("/[0-9]{0}|[0-9]{8}|[0-9]{12,14}/", $this->container['cean'])) {
            return false;
        }
        if (!preg_match("/[A-Z]{2}[0-9]{4}/", $this->container['nve'])) {
            return false;
        }
        if (strlen($this->container['unit']) > 6) {
            return false;
        }
        if (strlen($this->container['unit_taxable']) > 6) {
            return false;
        }
        if (!preg_match("/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/", $this->container['n_fci'])) {
            return false;
        }
        return true;
    }


    /**
     * Gets hs_code
     * @return string
     */
    public function getHsCode()
    {
        return $this->container['hs_code'];
    }

    /**
     * Sets hs_code
     * @param string $hs_code harmonized code, NCM or LC 116
     * @return $this
     */
    public function setHsCode($hs_code)
    {
        if (!is_null($hs_code) && (strlen($hs_code) > 8)) {
            throw new \InvalidArgumentException('invalid length for $hs_code when calling AgastExtendForSefaz., must be smaller than or equal to 8.');
        }

        $this->container['hs_code'] = $hs_code;

        return $this;
    }

    /**
     * Gets ex
     * @return int
     */
    public function getEx()
    {
        return $this->container['ex'];
    }

    /**
     * Sets ex
     * @param int $ex hsCode Exception for IPI tax
     * @return $this
     */
    public function setEx($ex)
    {
        $this->container['ex'] = $ex;

        return $this;
    }

    /**
     * Gets cest
     * @return string
     */
    public function getCest()
    {
        return $this->container['cest'];
    }

    /**
     * Sets cest
     * @param string $cest tax substitution code - Codigo especificador da Substuicao Tributaria
     * @return $this
     */
    public function setCest($cest)
    {

        if (!is_null($cest) && (!preg_match("/[0-9]{7}/", $cest))) {
            throw new \InvalidArgumentException("invalid value for $cest when calling AgastExtendForSefaz., must conform to the pattern /[0-9]{7}/.");
        }

        $this->container['cest'] = $cest;

        return $this;
    }

    /**
     * Gets cean
     * @return string
     */
    public function getCean()
    {
        return $this->container['cean'];
    }

    /**
     * Sets cean
     * @param string $cean GTIN NUMBER
     * @return $this
     */
    public function setCean($cean)
    {

        if (!is_null($cean) && (!preg_match("/[0-9]{0}|[0-9]{8}|[0-9]{12,14}/", $cean))) {
            throw new \InvalidArgumentException("invalid value for $cean when calling AgastExtendForSefaz., must conform to the pattern /[0-9]{0}|[0-9]{8}|[0-9]{12,14}/.");
        }

        $this->container['cean'] = $cean;

        return $this;
    }

    /**
     * Gets nve
     * @return string
     */
    public function getNve()
    {
        return $this->container['nve'];
    }

    /**
     * Sets nve
     * @param string $nve Nomenclatura de Valor aduaneio e Estatístico - NCM extension code
     * @return $this
     */
    public function setNve($nve)
    {

        if (!is_null($nve) && (!preg_match("/[A-Z]{2}[0-9]{4}/", $nve))) {
            throw new \InvalidArgumentException("invalid value for $nve when calling AgastExtendForSefaz., must conform to the pattern /[A-Z]{2}[0-9]{4}/.");
        }

        $this->container['nve'] = $nve;

        return $this;
    }

    /**
     * Gets unit
     * @return string
     */
    public function getUnit()
    {
        return $this->container['unit'];
    }

    /**
     * Sets unit
     * @param string $unit Sales Unit
     * @return $this
     */
    public function setUnit($unit)
    {
        if (!is_null($unit) && (strlen($unit) > 6)) {
            throw new \InvalidArgumentException('invalid length for $unit when calling AgastExtendForSefaz., must be smaller than or equal to 6.');
        }

        $this->container['unit'] = $unit;

        return $this;
    }

    /**
     * Gets unit_taxable
     * @return string
     */
    public function getUnitTaxable()
    {
        return $this->container['unit_taxable'];
    }

    /**
     * Sets unit_taxable
     * @param string $unit_taxable Sales Taxable Unit
     * @return $this
     */
    public function setUnitTaxable($unit_taxable)
    {
        if (!is_null($unit_taxable) && (strlen($unit_taxable) > 6)) {
            throw new \InvalidArgumentException('invalid length for $unit_taxable when calling AgastExtendForSefaz., must be smaller than or equal to 6.');
        }

        $this->container['unit_taxable'] = $unit_taxable;

        return $this;
    }

    /**
     * Gets n_fci
     * @return string
     */
    public function getNFci()
    {
        return $this->container['n_fci'];
    }

    /**
     * Sets n_fci
     * @param string $n_fci Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)
     * @return $this
     */
    public function setNFci($n_fci)
    {

        if (!is_null($n_fci) && (!preg_match("/[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/", $n_fci))) {
            throw new \InvalidArgumentException("invalid value for $n_fci when calling AgastExtendForSefaz., must conform to the pattern /[A-F0-9]{8}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{4}-[A-F0-9]{12}/.");
        }

        $this->container['n_fci'] = $n_fci;

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


