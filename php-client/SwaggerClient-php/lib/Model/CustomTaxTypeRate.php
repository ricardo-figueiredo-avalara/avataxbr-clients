<?php
/**
 * CustomTaxTypeRate
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
 * CustomTaxTypeRate Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class CustomTaxTypeRate implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'CustomTaxTypeRate';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'tax_type' => '\Swagger\Client\Model\TaxType',
        'tax_model' => 'string',
        'rate' => 'double',
        'srv_amount' => 'double',
        'quantity_unid_base' => 'string',
        'specialization_type' => 'string',
        'exemption_reason_code' => 'string',
        'custom_exemption_reason_description' => 'string',
        'withholding' => '\Swagger\Client\Model\TaxTypeRateWithholding',
        'company_id' => 'string'
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
        'tax_model' => 'taxModel',
        'rate' => 'rate',
        'srv_amount' => 'srvAmount',
        'quantity_unid_base' => 'quantityUnidBase',
        'specialization_type' => 'specializationType',
        'exemption_reason_code' => 'exemptionReasonCode',
        'custom_exemption_reason_description' => 'customExemptionReasonDescription',
        'withholding' => 'withholding',
        'company_id' => 'companyId'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'tax_type' => 'setTaxType',
        'tax_model' => 'setTaxModel',
        'rate' => 'setRate',
        'srv_amount' => 'setSrvAmount',
        'quantity_unid_base' => 'setQuantityUnidBase',
        'specialization_type' => 'setSpecializationType',
        'exemption_reason_code' => 'setExemptionReasonCode',
        'custom_exemption_reason_description' => 'setCustomExemptionReasonDescription',
        'withholding' => 'setWithholding',
        'company_id' => 'setCompanyId'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'tax_type' => 'getTaxType',
        'tax_model' => 'getTaxModel',
        'rate' => 'getRate',
        'srv_amount' => 'getSrvAmount',
        'quantity_unid_base' => 'getQuantityUnidBase',
        'specialization_type' => 'getSpecializationType',
        'exemption_reason_code' => 'getExemptionReasonCode',
        'custom_exemption_reason_description' => 'getCustomExemptionReasonDescription',
        'withholding' => 'getWithholding',
        'company_id' => 'getCompanyId'
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

    const TAX_MODEL_RATE = 'rate';
    const TAX_MODEL_SRF = 'srf';
    const SPECIALIZATION_TYPE_BASIC = 'basic';
    const SPECIALIZATION_TYPE_MONOPHASE = 'monophase';
    const SPECIALIZATION_TYPE_TAX_SUBSTITUTION = 'taxSubstitution';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTaxModelAllowableValues()
    {
        return [
            self::TAX_MODEL_RATE,
            self::TAX_MODEL_SRF,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getSpecializationTypeAllowableValues()
    {
        return [
            self::SPECIALIZATION_TYPE_BASIC,
            self::SPECIALIZATION_TYPE_MONOPHASE,
            self::SPECIALIZATION_TYPE_TAX_SUBSTITUTION,
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
        $this->container['tax_model'] = isset($data['tax_model']) ? $data['tax_model'] : null;
        $this->container['rate'] = isset($data['rate']) ? $data['rate'] : null;
        $this->container['srv_amount'] = isset($data['srv_amount']) ? $data['srv_amount'] : null;
        $this->container['quantity_unid_base'] = isset($data['quantity_unid_base']) ? $data['quantity_unid_base'] : null;
        $this->container['specialization_type'] = isset($data['specialization_type']) ? $data['specialization_type'] : null;
        $this->container['exemption_reason_code'] = isset($data['exemption_reason_code']) ? $data['exemption_reason_code'] : null;
        $this->container['custom_exemption_reason_description'] = isset($data['custom_exemption_reason_description']) ? $data['custom_exemption_reason_description'] : null;
        $this->container['withholding'] = isset($data['withholding']) ? $data['withholding'] : null;
        $this->container['company_id'] = isset($data['company_id']) ? $data['company_id'] : null;
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
        if ($this->container['tax_model'] === null) {
            $invalid_properties[] = "'tax_model' can't be null";
        }
        $allowed_values = ["rate", "srf"];
        if (!in_array($this->container['tax_model'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'tax_model', must be one of #{allowed_values}.";
        }

        if (!is_null($this->container['quantity_unid_base']) && (strlen($this->container['quantity_unid_base']) > 6)) {
            $invalid_properties[] = "invalid value for 'quantity_unid_base', the character length must be smaller than or equal to 6.";
        }

        $allowed_values = ["basic", "monophase", "taxSubstitution"];
        if (!in_array($this->container['specialization_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'specialization_type', must be one of #{allowed_values}.";
        }

        if ($this->container['company_id'] === null) {
            $invalid_properties[] = "'company_id' can't be null";
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
        if ($this->container['tax_model'] === null) {
            return false;
        }
        $allowed_values = ["rate", "srf"];
        if (!in_array($this->container['tax_model'], $allowed_values)) {
            return false;
        }
        if (strlen($this->container['quantity_unid_base']) > 6) {
            return false;
        }
        $allowed_values = ["basic", "monophase", "taxSubstitution"];
        if (!in_array($this->container['specialization_type'], $allowed_values)) {
            return false;
        }
        if ($this->container['company_id'] === null) {
            return false;
        }
        return true;
    }


    /**
     * Gets tax_type
     * @return \Swagger\Client\Model\TaxType
     */
    public function getTaxType()
    {
        return $this->container['tax_type'];
    }

    /**
     * Sets tax_type
     * @param \Swagger\Client\Model\TaxType $tax_type
     * @return $this
     */
    public function setTaxType($tax_type)
    {
        $this->container['tax_type'] = $tax_type;

        return $this;
    }

    /**
     * Gets tax_model
     * @return string
     */
    public function getTaxModel()
    {
        return $this->container['tax_model'];
    }

    /**
     * Sets tax_model
     * @param string $tax_model Tax can be calculated by rate or by quantity
     * @return $this
     */
    public function setTaxModel($tax_model)
    {
        $allowed_values = array('rate', 'srf');
        if ((!in_array($tax_model, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'tax_model', must be one of 'rate', 'srf'");
        }
        $this->container['tax_model'] = $tax_model;

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
     * @param double $rate Specific tax rate ex 3.5 (3.5%)
     * @return $this
     */
    public function setRate($rate)
    {
        $this->container['rate'] = $rate;

        return $this;
    }

    /**
     * Gets srv_amount
     * @return double
     */
    public function getSrvAmount()
    {
        return $this->container['srv_amount'];
    }

    /**
     * Sets srv_amount
     * @param double $srv_amount Specific tax rate ex 3.5 (3.5%)
     * @return $this
     */
    public function setSrvAmount($srv_amount)
    {
        $this->container['srv_amount'] = $srv_amount;

        return $this;
    }

    /**
     * Gets quantity_unid_base
     * @return string
     */
    public function getQuantityUnidBase()
    {
        return $this->container['quantity_unid_base'];
    }

    /**
     * Sets quantity_unid_base
     * @param string $quantity_unid_base
     * @return $this
     */
    public function setQuantityUnidBase($quantity_unid_base)
    {
        if (!is_null($quantity_unid_base) && (strlen($quantity_unid_base) > 6)) {
            throw new \InvalidArgumentException('invalid length for $quantity_unid_base when calling CustomTaxTypeRate., must be smaller than or equal to 6.');
        }

        $this->container['quantity_unid_base'] = $quantity_unid_base;

        return $this;
    }

    /**
     * Gets specialization_type
     * @return string
     */
    public function getSpecializationType()
    {
        return $this->container['specialization_type'];
    }

    /**
     * Sets specialization_type
     * @param string $specialization_type
     * @return $this
     */
    public function setSpecializationType($specialization_type)
    {
        $allowed_values = array('basic', 'monophase', 'taxSubstitution');
        if (!is_null($specialization_type) && (!in_array($specialization_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'specialization_type', must be one of 'basic', 'monophase', 'taxSubstitution'");
        }
        $this->container['specialization_type'] = $specialization_type;

        return $this;
    }

    /**
     * Gets exemption_reason_code
     * @return string
     */
    public function getExemptionReasonCode()
    {
        return $this->container['exemption_reason_code'];
    }

    /**
     * Sets exemption_reason_code
     * @param string $exemption_reason_code UUID Reference to an item in the LegalReason store.
     * @return $this
     */
    public function setExemptionReasonCode($exemption_reason_code)
    {
        $this->container['exemption_reason_code'] = $exemption_reason_code;

        return $this;
    }

    /**
     * Gets custom_exemption_reason_description
     * @return string
     */
    public function getCustomExemptionReasonDescription()
    {
        return $this->container['custom_exemption_reason_description'];
    }

    /**
     * Sets custom_exemption_reason_description
     * @param string $custom_exemption_reason_description Optional textual reason description, to be used when reason codes are generic (i.e. reason code 999 = Other).
     * @return $this
     */
    public function setCustomExemptionReasonDescription($custom_exemption_reason_description)
    {
        $this->container['custom_exemption_reason_description'] = $custom_exemption_reason_description;

        return $this;
    }

    /**
     * Gets withholding
     * @return \Swagger\Client\Model\TaxTypeRateWithholding
     */
    public function getWithholding()
    {
        return $this->container['withholding'];
    }

    /**
     * Sets withholding
     * @param \Swagger\Client\Model\TaxTypeRateWithholding $withholding
     * @return $this
     */
    public function setWithholding($withholding)
    {
        $this->container['withholding'] = $withholding;

        return $this;
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


