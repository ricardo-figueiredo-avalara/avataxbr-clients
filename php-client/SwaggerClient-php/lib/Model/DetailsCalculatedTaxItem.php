<?php
/**
 * DetailsCalculatedTaxItem
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
 * DetailsCalculatedTaxItem Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class DetailsCalculatedTaxItem implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'DetailsCalculatedTaxItem';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'location_type' => 'string',
        'jurisdiction_name' => 'string',
        'jurisdiction_type' => 'string',
        'tax_type' => 'string',
        'rate_type' => 'string',
        'scenario' => 'string',
        'subtotal_taxable' => 'double',
        'rate' => 'double',
        'tax' => 'double',
        'exemption_code' => 'string',
        'significant_locations' => 'string[]',
        'tax_rule_type' => 'string',
        'source' => 'int',
        'cst_b' => 'string',
        'mod_bc' => 'string',
        'cst' => 'string'
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
        'location_type' => 'locationType',
        'jurisdiction_name' => 'jurisdictionName',
        'jurisdiction_type' => 'jurisdictionType',
        'tax_type' => 'taxType',
        'rate_type' => 'rateType',
        'scenario' => 'scenario',
        'subtotal_taxable' => 'subtotalTaxable',
        'rate' => 'rate',
        'tax' => 'tax',
        'exemption_code' => 'exemptionCode',
        'significant_locations' => 'significantLocations',
        'tax_rule_type' => 'taxRuleType',
        'source' => 'source',
        'cst_b' => 'cstB',
        'mod_bc' => 'modBC',
        'cst' => 'cst'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'location_type' => 'setLocationType',
        'jurisdiction_name' => 'setJurisdictionName',
        'jurisdiction_type' => 'setJurisdictionType',
        'tax_type' => 'setTaxType',
        'rate_type' => 'setRateType',
        'scenario' => 'setScenario',
        'subtotal_taxable' => 'setSubtotalTaxable',
        'rate' => 'setRate',
        'tax' => 'setTax',
        'exemption_code' => 'setExemptionCode',
        'significant_locations' => 'setSignificantLocations',
        'tax_rule_type' => 'setTaxRuleType',
        'source' => 'setSource',
        'cst_b' => 'setCstB',
        'mod_bc' => 'setModBc',
        'cst' => 'setCst'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'location_type' => 'getLocationType',
        'jurisdiction_name' => 'getJurisdictionName',
        'jurisdiction_type' => 'getJurisdictionType',
        'tax_type' => 'getTaxType',
        'rate_type' => 'getRateType',
        'scenario' => 'getScenario',
        'subtotal_taxable' => 'getSubtotalTaxable',
        'rate' => 'getRate',
        'tax' => 'getTax',
        'exemption_code' => 'getExemptionCode',
        'significant_locations' => 'getSignificantLocations',
        'tax_rule_type' => 'getTaxRuleType',
        'source' => 'getSource',
        'cst_b' => 'getCstB',
        'mod_bc' => 'getModBc',
        'cst' => 'getCst'
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

    const JURISDICTION_TYPE_CITY = 'city';
    const JURISDICTION_TYPE_STATE = 'state';
    const JURISDICTION_TYPE_COUNTRY = 'country';
    const TAX_TYPE_ICMS = 'icms';
    const TAX_TYPE_ICMS_ST = 'icmsSt';
    const TAX_TYPE_ICMS_ST_SD = 'icmsStSd';
    const TAX_TYPE_ICMS_PART_OWN = 'icmsPartOwn';
    const TAX_TYPE_ICMS_PART_DEST = 'icmsPartDest';
    const TAX_TYPE_ICMS_DIFA_FCP = 'icmsDifaFCP';
    const TAX_TYPE_ICMS_DIFA_DEST = 'icmsDifaDest';
    const TAX_TYPE_ICMS_DIFA_REMET = 'icmsDifaRemet';
    const TAX_TYPE_ICMS_RF = 'icmsRf';
    const TAX_TYPE_ICMS_DESON = 'icmsDeson';
    const TAX_TYPE_ICMS_CREDSN = 'icmsCredsn';
    const TAX_TYPE_PIS = 'pis';
    const TAX_TYPE_PIS_ST = 'pisSt';
    const TAX_TYPE_COFINS = 'cofins';
    const TAX_TYPE_COFINS_ST = 'cofinsSt';
    const TAX_TYPE_IPI = 'ipi';
    const TAX_TYPE_IPI_RETURNED = 'ipiReturned';
    const TAX_TYPE_II = 'ii';
    const TAX_TYPE_IOF = 'iof';
    const TAX_TYPE_APROXTRIB_STATE = 'aproxtribState';
    const TAX_TYPE_APROXTRIB_FED = 'aproxtribFed';
    const TAX_TYPE_APROXTRIB = 'aproxtrib';
    const TAX_RULE_TYPE_SELLER = 'SELLER';
    const TAX_RULE_TYPE_BUYER = 'BUYER';
    const TAX_RULE_TYPE_TRANSACTION = 'TRANSACTION';
    const TAX_RULE_TYPE_ITEM = 'ITEM';
    const TAX_RULE_TYPE_TAX = 'TAX';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getJurisdictionTypeAllowableValues()
    {
        return [
            self::JURISDICTION_TYPE_CITY,
            self::JURISDICTION_TYPE_STATE,
            self::JURISDICTION_TYPE_COUNTRY,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTaxTypeAllowableValues()
    {
        return [
            self::TAX_TYPE_ICMS,
            self::TAX_TYPE_ICMS_ST,
            self::TAX_TYPE_ICMS_ST_SD,
            self::TAX_TYPE_ICMS_PART_OWN,
            self::TAX_TYPE_ICMS_PART_DEST,
            self::TAX_TYPE_ICMS_DIFA_FCP,
            self::TAX_TYPE_ICMS_DIFA_DEST,
            self::TAX_TYPE_ICMS_DIFA_REMET,
            self::TAX_TYPE_ICMS_RF,
            self::TAX_TYPE_ICMS_DESON,
            self::TAX_TYPE_ICMS_CREDSN,
            self::TAX_TYPE_PIS,
            self::TAX_TYPE_PIS_ST,
            self::TAX_TYPE_COFINS,
            self::TAX_TYPE_COFINS_ST,
            self::TAX_TYPE_IPI,
            self::TAX_TYPE_IPI_RETURNED,
            self::TAX_TYPE_II,
            self::TAX_TYPE_IOF,
            self::TAX_TYPE_APROXTRIB_STATE,
            self::TAX_TYPE_APROXTRIB_FED,
            self::TAX_TYPE_APROXTRIB,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTaxRuleTypeAllowableValues()
    {
        return [
            self::TAX_RULE_TYPE_SELLER,
            self::TAX_RULE_TYPE_BUYER,
            self::TAX_RULE_TYPE_TRANSACTION,
            self::TAX_RULE_TYPE_ITEM,
            self::TAX_RULE_TYPE_TAX,
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
        $this->container['location_type'] = isset($data['location_type']) ? $data['location_type'] : null;
        $this->container['jurisdiction_name'] = isset($data['jurisdiction_name']) ? $data['jurisdiction_name'] : null;
        $this->container['jurisdiction_type'] = isset($data['jurisdiction_type']) ? $data['jurisdiction_type'] : null;
        $this->container['tax_type'] = isset($data['tax_type']) ? $data['tax_type'] : null;
        $this->container['rate_type'] = isset($data['rate_type']) ? $data['rate_type'] : null;
        $this->container['scenario'] = isset($data['scenario']) ? $data['scenario'] : null;
        $this->container['subtotal_taxable'] = isset($data['subtotal_taxable']) ? $data['subtotal_taxable'] : null;
        $this->container['rate'] = isset($data['rate']) ? $data['rate'] : null;
        $this->container['tax'] = isset($data['tax']) ? $data['tax'] : null;
        $this->container['exemption_code'] = isset($data['exemption_code']) ? $data['exemption_code'] : null;
        $this->container['significant_locations'] = isset($data['significant_locations']) ? $data['significant_locations'] : null;
        $this->container['tax_rule_type'] = isset($data['tax_rule_type']) ? $data['tax_rule_type'] : null;
        $this->container['source'] = isset($data['source']) ? $data['source'] : null;
        $this->container['cst_b'] = isset($data['cst_b']) ? $data['cst_b'] : null;
        $this->container['mod_bc'] = isset($data['mod_bc']) ? $data['mod_bc'] : null;
        $this->container['cst'] = isset($data['cst']) ? $data['cst'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        $allowed_values = ["city", "state", "country"];
        if (!in_array($this->container['jurisdiction_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'jurisdiction_type', must be one of #{allowed_values}.";
        }

        $allowed_values = ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof", "aproxtribState", "aproxtribFed", "aproxtrib"];
        if (!in_array($this->container['tax_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'tax_type', must be one of #{allowed_values}.";
        }

        $allowed_values = ["SELLER", "BUYER", "TRANSACTION", "ITEM", "TAX"];
        if (!in_array($this->container['tax_rule_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'tax_rule_type', must be one of #{allowed_values}.";
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
        $allowed_values = ["city", "state", "country"];
        if (!in_array($this->container['jurisdiction_type'], $allowed_values)) {
            return false;
        }
        $allowed_values = ["icms", "icmsSt", "icmsStSd", "icmsPartOwn", "icmsPartDest", "icmsDifaFCP", "icmsDifaDest", "icmsDifaRemet", "icmsRf", "icmsDeson", "icmsCredsn", "pis", "pisSt", "cofins", "cofinsSt", "ipi", "ipiReturned", "ii", "iof", "aproxtribState", "aproxtribFed", "aproxtrib"];
        if (!in_array($this->container['tax_type'], $allowed_values)) {
            return false;
        }
        $allowed_values = ["SELLER", "BUYER", "TRANSACTION", "ITEM", "TAX"];
        if (!in_array($this->container['tax_rule_type'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets location_type
     * @return string
     */
    public function getLocationType()
    {
        return $this->container['location_type'];
    }

    /**
     * Sets location_type
     * @param string $location_type This string captures the applicable location type. Location used for calc. Buyer or Seller
     * @return $this
     */
    public function setLocationType($location_type)
    {
        $this->container['location_type'] = $location_type;

        return $this;
    }

    /**
     * Gets jurisdiction_name
     * @return string
     */
    public function getJurisdictionName()
    {
        return $this->container['jurisdiction_name'];
    }

    /**
     * Sets jurisdiction_name
     * @param string $jurisdiction_name Jurisdiction used for calctax amount
     * @return $this
     */
    public function setJurisdictionName($jurisdiction_name)
    {
        $this->container['jurisdiction_name'] = $jurisdiction_name;

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
     * @param string $jurisdiction_type Type of jurisdiction
     * @return $this
     */
    public function setJurisdictionType($jurisdiction_type)
    {
        $allowed_values = array('city', 'state', 'country');
        if (!is_null($jurisdiction_type) && (!in_array($jurisdiction_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'jurisdiction_type', must be one of 'city', 'state', 'country'");
        }
        $this->container['jurisdiction_type'] = $jurisdiction_type;

        return $this;
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
     * @param string $tax_type Tax identificator
     * @return $this
     */
    public function setTaxType($tax_type)
    {
        $allowed_values = array('icms', 'icmsSt', 'icmsStSd', 'icmsPartOwn', 'icmsPartDest', 'icmsDifaFCP', 'icmsDifaDest', 'icmsDifaRemet', 'icmsRf', 'icmsDeson', 'icmsCredsn', 'pis', 'pisSt', 'cofins', 'cofinsSt', 'ipi', 'ipiReturned', 'ii', 'iof', 'aproxtribState', 'aproxtribFed', 'aproxtrib');
        if (!is_null($tax_type) && (!in_array($tax_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'tax_type', must be one of 'icms', 'icmsSt', 'icmsStSd', 'icmsPartOwn', 'icmsPartDest', 'icmsDifaFCP', 'icmsDifaDest', 'icmsDifaRemet', 'icmsRf', 'icmsDeson', 'icmsCredsn', 'pis', 'pisSt', 'cofins', 'cofinsSt', 'ipi', 'ipiReturned', 'ii', 'iof', 'aproxtribState', 'aproxtribFed', 'aproxtrib'");
        }
        $this->container['tax_type'] = $tax_type;

        return $this;
    }

    /**
     * Gets rate_type
     * @return string
     */
    public function getRateType()
    {
        return $this->container['rate_type'];
    }

    /**
     * Sets rate_type
     * @param string $rate_type Name of configuration rate
     * @return $this
     */
    public function setRateType($rate_type)
    {
        $this->container['rate_type'] = $rate_type;

        return $this;
    }

    /**
     * Gets scenario
     * @return string
     */
    public function getScenario()
    {
        return $this->container['scenario'];
    }

    /**
     * Sets scenario
     * @param string $scenario This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.
     * @return $this
     */
    public function setScenario($scenario)
    {
        $this->container['scenario'] = $scenario;

        return $this;
    }

    /**
     * Gets subtotal_taxable
     * @return double
     */
    public function getSubtotalTaxable()
    {
        return $this->container['subtotal_taxable'];
    }

    /**
     * Sets subtotal_taxable
     * @param double $subtotal_taxable This decimal captures how much of the lineAmount was taxable by this tax, calc base
     * @return $this
     */
    public function setSubtotalTaxable($subtotal_taxable)
    {
        $this->container['subtotal_taxable'] = $subtotal_taxable;

        return $this;
    }

    /**
     * Gets rate
     * @return double
     */
    public function getRate()
    {
        return $this->container['rate'];
    }

    /**
     * Sets rate
     * @param double $rate This decimal captures the tax rate for this tax.3.00 (3%)
     * @return $this
     */
    public function setRate($rate)
    {
        $this->container['rate'] = $rate;

        return $this;
    }

    /**
     * Gets tax
     * @return double
     */
    public function getTax()
    {
        return $this->container['tax'];
    }

    /**
     * Sets tax
     * @param double $tax This decimal captures how much of the lineAmount was taxable by this tax
     * @return $this
     */
    public function setTax($tax)
    {
        $this->container['tax'] = $tax;

        return $this;
    }

    /**
     * Gets exemption_code
     * @return string
     */
    public function getExemptionCode()
    {
        return $this->container['exemption_code'];
    }

    /**
     * Sets exemption_code
     * @param string $exemption_code This string is required if is exempt
     * @return $this
     */
    public function setExemptionCode($exemption_code)
    {
        $this->container['exemption_code'] = $exemption_code;

        return $this;
    }

    /**
     * Gets significant_locations
     * @return string[]
     */
    public function getSignificantLocations()
    {
        return $this->container['significant_locations'];
    }

    /**
     * Sets significant_locations
     * @param string[] $significant_locations This element captures the list of locations that contributed to the tax determination. for Service is Buyer and Seller Address
     * @return $this
     */
    public function setSignificantLocations($significant_locations)
    {
        $this->container['significant_locations'] = $significant_locations;

        return $this;
    }

    /**
     * Gets tax_rule_type
     * @return string
     */
    public function getTaxRuleType()
    {
        return $this->container['tax_rule_type'];
    }

    /**
     * Sets tax_rule_type
     * @param string $tax_rule_type This string with type of rule
     * @return $this
     */
    public function setTaxRuleType($tax_rule_type)
    {
        $allowed_values = array('SELLER', 'BUYER', 'TRANSACTION', 'ITEM', 'TAX');
        if (!is_null($tax_rule_type) && (!in_array($tax_rule_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'tax_rule_type', must be one of 'SELLER', 'BUYER', 'TRANSACTION', 'ITEM', 'TAX'");
        }
        $this->container['tax_rule_type'] = $tax_rule_type;

        return $this;
    }

    /**
     * Gets source
     * @return int
     */
    public function getSource()
    {
        return $this->container['source'];
    }

    /**
     * Sets source
     * @param int $source
     * @return $this
     */
    public function setSource($source)
    {
        $this->container['source'] = $source;

        return $this;
    }

    /**
     * Gets cst_b
     * @return string
     */
    public function getCstB()
    {
        return $this->container['cst_b'];
    }

    /**
     * Sets cst_b
     * @param string $cst_b
     * @return $this
     */
    public function setCstB($cst_b)
    {
        $this->container['cst_b'] = $cst_b;

        return $this;
    }

    /**
     * Gets mod_bc
     * @return string
     */
    public function getModBc()
    {
        return $this->container['mod_bc'];
    }

    /**
     * Sets mod_bc
     * @param string $mod_bc
     * @return $this
     */
    public function setModBc($mod_bc)
    {
        $this->container['mod_bc'] = $mod_bc;

        return $this;
    }

    /**
     * Gets cst
     * @return string
     */
    public function getCst()
    {
        return $this->container['cst'];
    }

    /**
     * Sets cst
     * @param string $cst
     * @return $this
     */
    public function setCst($cst)
    {
        $this->container['cst'] = $cst;

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

