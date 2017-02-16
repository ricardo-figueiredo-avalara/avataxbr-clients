<?php
/**
 * LegalReasonTaxScope
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
 * LegalReasonTaxScope Class Doc Comment
 *
 * @category    Class */
 // @description Filter this message application to specified tax cases. - taxtype - jurisdictionType
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class LegalReasonTaxScope implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'LegalReason_taxScope';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'tax_type' => 'string',
        'specialized_tax_type' => 'string',
        'jurisdiction_type' => 'string',
        'jurisdiction_ibge_code' => 'string'
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
        'tax_type' => 'taxType',
        'specialized_tax_type' => 'specializedTaxType',
        'jurisdiction_type' => 'jurisdictionType',
        'jurisdiction_ibge_code' => 'jurisdictionIbgeCode'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'tax_type' => 'setTaxType',
        'specialized_tax_type' => 'setSpecializedTaxType',
        'jurisdiction_type' => 'setJurisdictionType',
        'jurisdiction_ibge_code' => 'setJurisdictionIbgeCode'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'tax_type' => 'getTaxType',
        'specialized_tax_type' => 'getSpecializedTaxType',
        'jurisdiction_type' => 'getJurisdictionType',
        'jurisdiction_ibge_code' => 'getJurisdictionIbgeCode'
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

    const TAX_TYPE_NONE = 'NONE';
    const TAX_TYPE_INSS = 'INSS';
    const TAX_TYPE_IRRF = 'IRRF';
    const TAX_TYPE_IRPJ = 'IRPJ';
    const TAX_TYPE_PIS = 'PIS';
    const TAX_TYPE_COFINS = 'COFINS';
    const TAX_TYPE_CSLL = 'CSLL';
    const TAX_TYPE_IPI = 'IPI';
    const TAX_TYPE_ICMS = 'ICMS';
    const TAX_TYPE_II = 'II';
    const TAX_TYPE_IOF = 'IOF';
    const TAX_TYPE_ISS = 'ISS';
    const TAX_TYPE_APROXTOTALTAX = 'APROXTOTALTAX';
    const SPECIALIZED_TAX_TYPE_ICMS = 'icms';
    const SPECIALIZED_TAX_TYPE_ICMS_ST = 'icmsSt';
    const SPECIALIZED_TAX_TYPE_ICMS_ST_SD = 'icmsStSd';
    const SPECIALIZED_TAX_TYPE_ICMS_PART_OWN = 'icmsPartOwn';
    const SPECIALIZED_TAX_TYPE_ICMS_PART_DEST = 'icmsPartDest';
    const SPECIALIZED_TAX_TYPE_ICMS_DIFA_FCP = 'icmsDifaFCP';
    const SPECIALIZED_TAX_TYPE_ICMS_DIFA_DEST = 'icmsDifaDest';
    const SPECIALIZED_TAX_TYPE_ICMS_DIFA_REMET = 'icmsDifaRemet';
    const SPECIALIZED_TAX_TYPE_ICMS_RF = 'icmsRf';
    const SPECIALIZED_TAX_TYPE_ICMS_DESON = 'icmsDeson';
    const SPECIALIZED_TAX_TYPE_ICMS_CREDSN = 'icmsCredsn';
    const SPECIALIZED_TAX_TYPE_PIS = 'pis';
    const SPECIALIZED_TAX_TYPE_PIS_ST = 'pisSt';
    const SPECIALIZED_TAX_TYPE_COFINS = 'cofins';
    const SPECIALIZED_TAX_TYPE_COFINS_ST = 'cofinsSt';
    const SPECIALIZED_TAX_TYPE_IPI = 'ipi';
    const SPECIALIZED_TAX_TYPE_IPI_RETURNED = 'ipiReturned';
    const SPECIALIZED_TAX_TYPE_II = 'ii';
    const SPECIALIZED_TAX_TYPE_IOF = 'iof';
    const JURISDICTION_TYPE_NONE = 'NONE';
    const JURISDICTION_TYPE_CITY = 'City';
    const JURISDICTION_TYPE_STATE = 'State';
    const JURISDICTION_TYPE_COUNTRY = 'Country';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTaxTypeAllowableValues()
    {
        return [
            self::TAX_TYPE_NONE,
            self::TAX_TYPE_INSS,
            self::TAX_TYPE_IRRF,
            self::TAX_TYPE_IRPJ,
            self::TAX_TYPE_PIS,
            self::TAX_TYPE_COFINS,
            self::TAX_TYPE_CSLL,
            self::TAX_TYPE_IPI,
            self::TAX_TYPE_ICMS,
            self::TAX_TYPE_II,
            self::TAX_TYPE_IOF,
            self::TAX_TYPE_ISS,
            self::TAX_TYPE_APROXTOTALTAX,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getSpecializedTaxTypeAllowableValues()
    {
        return [
            self::SPECIALIZED_TAX_TYPE_ICMS,
            self::SPECIALIZED_TAX_TYPE_ICMS_ST,
            self::SPECIALIZED_TAX_TYPE_ICMS_ST_SD,
            self::SPECIALIZED_TAX_TYPE_ICMS_PART_OWN,
            self::SPECIALIZED_TAX_TYPE_ICMS_PART_DEST,
            self::SPECIALIZED_TAX_TYPE_ICMS_DIFA_FCP,
            self::SPECIALIZED_TAX_TYPE_ICMS_DIFA_DEST,
            self::SPECIALIZED_TAX_TYPE_ICMS_DIFA_REMET,
            self::SPECIALIZED_TAX_TYPE_ICMS_RF,
            self::SPECIALIZED_TAX_TYPE_ICMS_DESON,
            self::SPECIALIZED_TAX_TYPE_ICMS_CREDSN,
            self::SPECIALIZED_TAX_TYPE_PIS,
            self::SPECIALIZED_TAX_TYPE_PIS_ST,
            self::SPECIALIZED_TAX_TYPE_COFINS,
            self::SPECIALIZED_TAX_TYPE_COFINS_ST,
            self::SPECIALIZED_TAX_TYPE_IPI,
            self::SPECIALIZED_TAX_TYPE_IPI_RETURNED,
            self::SPECIALIZED_TAX_TYPE_II,
            self::SPECIALIZED_TAX_TYPE_IOF,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getJurisdictionTypeAllowableValues()
    {
        return [
            self::JURISDICTION_TYPE_NONE,
            self::JURISDICTION_TYPE_CITY,
            self::JURISDICTION_TYPE_STATE,
            self::JURISDICTION_TYPE_COUNTRY,
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
        $this->container['tax_type'] = isset($data['tax_type']) ? $data['tax_type'] : null;
        $this->container['specialized_tax_type'] = isset($data['specialized_tax_type']) ? $data['specialized_tax_type'] : null;
        $this->container['jurisdiction_type'] = isset($data['jurisdiction_type']) ? $data['jurisdiction_type'] : null;
        $this->container['jurisdiction_ibge_code'] = isset($data['jurisdiction_ibge_code']) ? $data['jurisdiction_ibge_code'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['tax_type'] === null) {
            $invalid_properties[] = "'tax_type' can't be null";
        }
        $allowed_values = ["NONE", "INSS", "IRRF", "IRPJ", "PIS", "COFINS", "CSLL", "IPI", "ICMS", "II", "IOF", "ISS", "APROXTOTALTAX"];
        if (!in_array($this->container['tax_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'tax_type', must be one of #{allowed_values}.";
        }

        $allowed_values = ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof"];
        if (!in_array($this->container['specialized_tax_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'specialized_tax_type', must be one of #{allowed_values}.";
        }

        if ($this->container['jurisdiction_type'] === null) {
            $invalid_properties[] = "'jurisdiction_type' can't be null";
        }
        $allowed_values = ["NONE", "City", "State", "Country"];
        if (!in_array($this->container['jurisdiction_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'jurisdiction_type', must be one of #{allowed_values}.";
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
        if ($this->container['tax_type'] === null) {
            return false;
        }
        $allowed_values = ["NONE", "INSS", "IRRF", "IRPJ", "PIS", "COFINS", "CSLL", "IPI", "ICMS", "II", "IOF", "ISS", "APROXTOTALTAX"];
        if (!in_array($this->container['tax_type'], $allowed_values)) {
            return false;
        }
        $allowed_values = ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof"];
        if (!in_array($this->container['specialized_tax_type'], $allowed_values)) {
            return false;
        }
        if ($this->container['jurisdiction_type'] === null) {
            return false;
        }
        $allowed_values = ["NONE", "City", "State", "Country"];
        if (!in_array($this->container['jurisdiction_type'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets tax_type
     * @return string
     */
    public function getTaxType()
    {
        return $this->container['tax_type'];
    }

    /**
     * Sets tax_type
     * @param string $tax_type This is the Tax Type to apply legal messages. - 'NONE' - 'INSS' - 'IRRF' - 'IRPJ' - 'PIS' - 'COFINS' - 'CSLL' - 'IPI' - 'ICMS' - 'II' - 'IOF' - 'ISS' - 'APROXTOTALTAX'
     * @return $this
     */
    public function setTaxType($tax_type)
    {
        $allowed_values = array('NONE', 'INSS', 'IRRF', 'IRPJ', 'PIS', 'COFINS', 'CSLL', 'IPI', 'ICMS', 'II', 'IOF', 'ISS', 'APROXTOTALTAX');
        if ((!in_array($tax_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'tax_type', must be one of 'NONE', 'INSS', 'IRRF', 'IRPJ', 'PIS', 'COFINS', 'CSLL', 'IPI', 'ICMS', 'II', 'IOF', 'ISS', 'APROXTOTALTAX'");
        }
        $this->container['tax_type'] = $tax_type;

        return $this;
    }

    /**
     * Gets specialized_tax_type
     * @return string
     */
    public function getSpecializedTaxType()
    {
        return $this->container['specialized_tax_type'];
    }

    /**
     * Sets specialized_tax_type
     * @param string $specialized_tax_type These are the specific tax types to which a message may be applied - 'icms' - 'icmsSt' - 'icmsStSd' - 'icmsPartOwn' - 'icmsPartDest' - 'icmsDifaFCP' - 'icmsDifaDest' - 'icmsDifaRemet' - 'icmsRf' - 'icmsDeson' - 'icmsCredsn' - 'pis' - 'pisSt' - 'cofins' - 'cofinsSt' - 'ipi' - 'ipiReturned' - 'ii' - 'iof'
     * @return $this
     */
    public function setSpecializedTaxType($specialized_tax_type)
    {
        $allowed_values = array('icms', 'icmsSt', 'icmsStSd', 'icmsPartOwn', 'icmsPartDest', 'icmsDifaFCP', 'icmsDifaDest', 'icmsDifaRemet', 'icmsRf', 'icmsDeson', 'icmsCredsn', 'pis', 'pisSt', 'cofins', 'cofinsSt', 'ipi', 'ipiReturned', 'ii', 'iof');
        if (!is_null($specialized_tax_type) && (!in_array($specialized_tax_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'specialized_tax_type', must be one of 'icms', 'icmsSt', 'icmsStSd', 'icmsPartOwn', 'icmsPartDest', 'icmsDifaFCP', 'icmsDifaDest', 'icmsDifaRemet', 'icmsRf', 'icmsDeson', 'icmsCredsn', 'pis', 'pisSt', 'cofins', 'cofinsSt', 'ipi', 'ipiReturned', 'ii', 'iof'");
        }
        $this->container['specialized_tax_type'] = $specialized_tax_type;

        return $this;
    }

    /**
     * Gets jurisdiction_type
     * @return string
     */
    public function getJurisdictionType()
    {
        return $this->container['jurisdiction_type'];
    }

    /**
     * Sets jurisdiction_type
     * @param string $jurisdiction_type Types of jurisdiction - 'NONE' - 'City' - 'State' - 'Country'
     * @return $this
     */
    public function setJurisdictionType($jurisdiction_type)
    {
        $allowed_values = array('NONE', 'City', 'State', 'Country');
        if ((!in_array($jurisdiction_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'jurisdiction_type', must be one of 'NONE', 'City', 'State', 'Country'");
        }
        $this->container['jurisdiction_type'] = $jurisdiction_type;

        return $this;
    }

    /**
     * Gets jurisdiction_ibge_code
     * @return string
     */
    public function getJurisdictionIbgeCode()
    {
        return $this->container['jurisdiction_ibge_code'];
    }

    /**
     * Sets jurisdiction_ibge_code
     * @param string $jurisdiction_ibge_code Code to identify the Jurisdiction
     * @return $this
     */
    public function setJurisdictionIbgeCode($jurisdiction_ibge_code)
    {
        $this->container['jurisdiction_ibge_code'] = $jurisdiction_ibge_code;

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

