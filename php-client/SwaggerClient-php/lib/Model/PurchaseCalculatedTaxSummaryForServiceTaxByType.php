<?php
/**
 * PurchaseCalculatedTaxSummaryForServiceTaxByType
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
 * PurchaseCalculatedTaxSummaryForServiceTaxByType Class Doc Comment
 *
 * @category    Class */
 // @description Object with summary of all taxes returned by engine
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class PurchaseCalculatedTaxSummaryForServiceTaxByType implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'PurchaseCalculatedTaxSummaryForService_taxByType';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'iss_rf' => '\Swagger\Client\Model\TaxByTypeSummaryForService',
        'pis_rf' => '\Swagger\Client\Model\TaxByTypeSummaryForService',
        'cofins_rf' => '\Swagger\Client\Model\TaxByTypeSummaryForService',
        'csll_rf' => '\Swagger\Client\Model\TaxByTypeSummaryForService',
        'irrf' => '\Swagger\Client\Model\TaxByTypeSummaryForService',
        'inss_rf' => '\Swagger\Client\Model\TaxByTypeSummaryForService',
        'inss_ar' => '\Swagger\Client\Model\TaxByTypeSummaryForService',
        'pis' => '\Swagger\Client\Model\TaxByTypeSummaryForService',
        'cofins' => '\Swagger\Client\Model\TaxByTypeSummaryForService'
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
        'iss_rf' => 'issRf',
        'pis_rf' => 'pisRf',
        'cofins_rf' => 'cofinsRf',
        'csll_rf' => 'csllRf',
        'irrf' => 'irrf',
        'inss_rf' => 'inssRf',
        'inss_ar' => 'inssAr',
        'pis' => 'pis',
        'cofins' => 'cofins'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'iss_rf' => 'setIssRf',
        'pis_rf' => 'setPisRf',
        'cofins_rf' => 'setCofinsRf',
        'csll_rf' => 'setCsllRf',
        'irrf' => 'setIrrf',
        'inss_rf' => 'setInssRf',
        'inss_ar' => 'setInssAr',
        'pis' => 'setPis',
        'cofins' => 'setCofins'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'iss_rf' => 'getIssRf',
        'pis_rf' => 'getPisRf',
        'cofins_rf' => 'getCofinsRf',
        'csll_rf' => 'getCsllRf',
        'irrf' => 'getIrrf',
        'inss_rf' => 'getInssRf',
        'inss_ar' => 'getInssAr',
        'pis' => 'getPis',
        'cofins' => 'getCofins'
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
        $this->container['iss_rf'] = isset($data['iss_rf']) ? $data['iss_rf'] : null;
        $this->container['pis_rf'] = isset($data['pis_rf']) ? $data['pis_rf'] : null;
        $this->container['cofins_rf'] = isset($data['cofins_rf']) ? $data['cofins_rf'] : null;
        $this->container['csll_rf'] = isset($data['csll_rf']) ? $data['csll_rf'] : null;
        $this->container['irrf'] = isset($data['irrf']) ? $data['irrf'] : null;
        $this->container['inss_rf'] = isset($data['inss_rf']) ? $data['inss_rf'] : null;
        $this->container['inss_ar'] = isset($data['inss_ar']) ? $data['inss_ar'] : null;
        $this->container['pis'] = isset($data['pis']) ? $data['pis'] : null;
        $this->container['cofins'] = isset($data['cofins']) ? $data['cofins'] : null;
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
     * Gets iss_rf
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getIssRf()
    {
        return $this->container['iss_rf'];
    }

    /**
     * Sets iss_rf
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $iss_rf
     * @return $this
     */
    public function setIssRf($iss_rf)
    {
        $this->container['iss_rf'] = $iss_rf;

        return $this;
    }

    /**
     * Gets pis_rf
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getPisRf()
    {
        return $this->container['pis_rf'];
    }

    /**
     * Sets pis_rf
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $pis_rf
     * @return $this
     */
    public function setPisRf($pis_rf)
    {
        $this->container['pis_rf'] = $pis_rf;

        return $this;
    }

    /**
     * Gets cofins_rf
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getCofinsRf()
    {
        return $this->container['cofins_rf'];
    }

    /**
     * Sets cofins_rf
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $cofins_rf
     * @return $this
     */
    public function setCofinsRf($cofins_rf)
    {
        $this->container['cofins_rf'] = $cofins_rf;

        return $this;
    }

    /**
     * Gets csll_rf
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getCsllRf()
    {
        return $this->container['csll_rf'];
    }

    /**
     * Sets csll_rf
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $csll_rf
     * @return $this
     */
    public function setCsllRf($csll_rf)
    {
        $this->container['csll_rf'] = $csll_rf;

        return $this;
    }

    /**
     * Gets irrf
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getIrrf()
    {
        return $this->container['irrf'];
    }

    /**
     * Sets irrf
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $irrf
     * @return $this
     */
    public function setIrrf($irrf)
    {
        $this->container['irrf'] = $irrf;

        return $this;
    }

    /**
     * Gets inss_rf
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getInssRf()
    {
        return $this->container['inss_rf'];
    }

    /**
     * Sets inss_rf
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $inss_rf
     * @return $this
     */
    public function setInssRf($inss_rf)
    {
        $this->container['inss_rf'] = $inss_rf;

        return $this;
    }

    /**
     * Gets inss_ar
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getInssAr()
    {
        return $this->container['inss_ar'];
    }

    /**
     * Sets inss_ar
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $inss_ar
     * @return $this
     */
    public function setInssAr($inss_ar)
    {
        $this->container['inss_ar'] = $inss_ar;

        return $this;
    }

    /**
     * Gets pis
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getPis()
    {
        return $this->container['pis'];
    }

    /**
     * Sets pis
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $pis
     * @return $this
     */
    public function setPis($pis)
    {
        $this->container['pis'] = $pis;

        return $this;
    }

    /**
     * Gets cofins
     * @return \Swagger\Client\Model\TaxByTypeSummaryForService
     */
    public function getCofins()
    {
        return $this->container['cofins'];
    }

    /**
     * Sets cofins
     * @param \Swagger\Client\Model\TaxByTypeSummaryForService $cofins
     * @return $this
     */
    public function setCofins($cofins)
    {
        $this->container['cofins'] = $cofins;

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


