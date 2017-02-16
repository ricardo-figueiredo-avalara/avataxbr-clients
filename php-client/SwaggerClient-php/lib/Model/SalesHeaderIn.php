<?php
/**
 * SalesHeaderIn
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
 * SalesHeaderIn Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class SalesHeaderIn implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'SalesHeaderIn';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'account_id' => 'string',
        'company_code' => 'string',
        'transaction_type' => 'string',
        'document_code' => 'string',
        'currency' => 'string',
        'transaction_date' => '\DateTime',
        'tax_calculation_date' => '\DateTime',
        'company_location' => 'string',
        'customer_code' => 'string',
        'purchase_order_number' => 'string',
        'rps_number' => 'int',
        'rps_serie' => 'string',
        'discrimination_in' => 'string',
        'entity' => '\Swagger\Client\Model\SalesEntity',
        'payment' => '\Swagger\Client\Model\SalesHeaderInPayment',
        'taxes_config' => '\Swagger\Client\Model\SalesTaxesConfig',
        'default_locations' => '\Swagger\Client\Model\SalesDefaultLocations'
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
        'account_id' => 'accountId',
        'company_code' => 'companyCode',
        'transaction_type' => 'transactionType',
        'document_code' => 'documentCode',
        'currency' => 'currency',
        'transaction_date' => 'transactionDate',
        'tax_calculation_date' => 'taxCalculationDate',
        'company_location' => 'companyLocation',
        'customer_code' => 'customerCode',
        'purchase_order_number' => 'purchaseOrderNumber',
        'rps_number' => 'rpsNumber',
        'rps_serie' => 'rpsSerie',
        'discrimination_in' => 'discriminationIn',
        'entity' => 'entity',
        'payment' => 'payment',
        'taxes_config' => 'taxesConfig',
        'default_locations' => 'defaultLocations'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'account_id' => 'setAccountId',
        'company_code' => 'setCompanyCode',
        'transaction_type' => 'setTransactionType',
        'document_code' => 'setDocumentCode',
        'currency' => 'setCurrency',
        'transaction_date' => 'setTransactionDate',
        'tax_calculation_date' => 'setTaxCalculationDate',
        'company_location' => 'setCompanyLocation',
        'customer_code' => 'setCustomerCode',
        'purchase_order_number' => 'setPurchaseOrderNumber',
        'rps_number' => 'setRpsNumber',
        'rps_serie' => 'setRpsSerie',
        'discrimination_in' => 'setDiscriminationIn',
        'entity' => 'setEntity',
        'payment' => 'setPayment',
        'taxes_config' => 'setTaxesConfig',
        'default_locations' => 'setDefaultLocations'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'account_id' => 'getAccountId',
        'company_code' => 'getCompanyCode',
        'transaction_type' => 'getTransactionType',
        'document_code' => 'getDocumentCode',
        'currency' => 'getCurrency',
        'transaction_date' => 'getTransactionDate',
        'tax_calculation_date' => 'getTaxCalculationDate',
        'company_location' => 'getCompanyLocation',
        'customer_code' => 'getCustomerCode',
        'purchase_order_number' => 'getPurchaseOrderNumber',
        'rps_number' => 'getRpsNumber',
        'rps_serie' => 'getRpsSerie',
        'discrimination_in' => 'getDiscriminationIn',
        'entity' => 'getEntity',
        'payment' => 'getPayment',
        'taxes_config' => 'getTaxesConfig',
        'default_locations' => 'getDefaultLocations'
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

    const TRANSACTION_TYPE_SALE = 'Sale';
    const TRANSACTION_TYPE_PURCHASE = 'Purchase';
    const TRANSACTION_TYPE_PAYMENT = 'Payment';
    const TRANSACTION_TYPE_RECEIPT = 'Receipt';
    const CURRENCY_BRL = 'BRL';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTransactionTypeAllowableValues()
    {
        return [
            self::TRANSACTION_TYPE_SALE,
            self::TRANSACTION_TYPE_PURCHASE,
            self::TRANSACTION_TYPE_PAYMENT,
            self::TRANSACTION_TYPE_RECEIPT,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getCurrencyAllowableValues()
    {
        return [
            self::CURRENCY_BRL,
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
        $this->container['account_id'] = isset($data['account_id']) ? $data['account_id'] : null;
        $this->container['company_code'] = isset($data['company_code']) ? $data['company_code'] : null;
        $this->container['transaction_type'] = isset($data['transaction_type']) ? $data['transaction_type'] : null;
        $this->container['document_code'] = isset($data['document_code']) ? $data['document_code'] : null;
        $this->container['currency'] = isset($data['currency']) ? $data['currency'] : null;
        $this->container['transaction_date'] = isset($data['transaction_date']) ? $data['transaction_date'] : null;
        $this->container['tax_calculation_date'] = isset($data['tax_calculation_date']) ? $data['tax_calculation_date'] : null;
        $this->container['company_location'] = isset($data['company_location']) ? $data['company_location'] : null;
        $this->container['customer_code'] = isset($data['customer_code']) ? $data['customer_code'] : null;
        $this->container['purchase_order_number'] = isset($data['purchase_order_number']) ? $data['purchase_order_number'] : null;
        $this->container['rps_number'] = isset($data['rps_number']) ? $data['rps_number'] : null;
        $this->container['rps_serie'] = isset($data['rps_serie']) ? $data['rps_serie'] : '0';
        $this->container['discrimination_in'] = isset($data['discrimination_in']) ? $data['discrimination_in'] : null;
        $this->container['entity'] = isset($data['entity']) ? $data['entity'] : null;
        $this->container['payment'] = isset($data['payment']) ? $data['payment'] : null;
        $this->container['taxes_config'] = isset($data['taxes_config']) ? $data['taxes_config'] : null;
        $this->container['default_locations'] = isset($data['default_locations']) ? $data['default_locations'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['account_id'] === null) {
            $invalid_properties[] = "'account_id' can't be null";
        }
        if ($this->container['company_code'] === null) {
            $invalid_properties[] = "'company_code' can't be null";
        }
        if ((strlen($this->container['company_code']) > 60)) {
            $invalid_properties[] = "invalid value for 'company_code', the character length must be smaller than or equal to 60.";
        }

        if ($this->container['transaction_type'] === null) {
            $invalid_properties[] = "'transaction_type' can't be null";
        }
        $allowed_values = ["Sale", "Purchase", "Payment", "Receipt"];
        if (!in_array($this->container['transaction_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'transaction_type', must be one of #{allowed_values}.";
        }

        if ($this->container['currency'] === null) {
            $invalid_properties[] = "'currency' can't be null";
        }
        $allowed_values = ["BRL"];
        if (!in_array($this->container['currency'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'currency', must be one of #{allowed_values}.";
        }

        if ($this->container['transaction_date'] === null) {
            $invalid_properties[] = "'transaction_date' can't be null";
        }
        if ($this->container['company_location'] === null) {
            $invalid_properties[] = "'company_location' can't be null";
        }
        if ((strlen($this->container['company_location']) > 64)) {
            $invalid_properties[] = "invalid value for 'company_location', the character length must be smaller than or equal to 64.";
        }

        if ($this->container['customer_code'] === null) {
            $invalid_properties[] = "'customer_code' can't be null";
        }
        if (!is_null($this->container['discrimination_in']) && (strlen($this->container['discrimination_in']) > 1000)) {
            $invalid_properties[] = "invalid value for 'discrimination_in', the character length must be smaller than or equal to 1000.";
        }

        if (!is_null($this->container['discrimination_in']) && (strlen($this->container['discrimination_in']) < 1)) {
            $invalid_properties[] = "invalid value for 'discrimination_in', the character length must be bigger than or equal to 1.";
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
        if ($this->container['account_id'] === null) {
            return false;
        }
        if ($this->container['company_code'] === null) {
            return false;
        }
        if (strlen($this->container['company_code']) > 60) {
            return false;
        }
        if ($this->container['transaction_type'] === null) {
            return false;
        }
        $allowed_values = ["Sale", "Purchase", "Payment", "Receipt"];
        if (!in_array($this->container['transaction_type'], $allowed_values)) {
            return false;
        }
        if ($this->container['currency'] === null) {
            return false;
        }
        $allowed_values = ["BRL"];
        if (!in_array($this->container['currency'], $allowed_values)) {
            return false;
        }
        if ($this->container['transaction_date'] === null) {
            return false;
        }
        if ($this->container['company_location'] === null) {
            return false;
        }
        if (strlen($this->container['company_location']) > 64) {
            return false;
        }
        if ($this->container['customer_code'] === null) {
            return false;
        }
        if (strlen($this->container['discrimination_in']) > 1000) {
            return false;
        }
        if (strlen($this->container['discrimination_in']) < 1) {
            return false;
        }
        return true;
    }


    /**
     * Gets account_id
     * @return string
     */
    public function getAccountId()
    {
        return $this->container['account_id'];
    }

    /**
     * Sets account_id
     * @param string $account_id This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.
     * @return $this
     */
    public function setAccountId($account_id)
    {
        $this->container['account_id'] = $account_id;

        return $this;
    }

    /**
     * Gets company_code
     * @return string
     */
    public function getCompanyCode()
    {
        return $this->container['company_code'];
    }

    /**
     * Sets company_code
     * @param string $company_code This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company
     * @return $this
     */
    public function setCompanyCode($company_code)
    {
        if ((strlen($company_code) > 60)) {
            throw new \InvalidArgumentException('invalid length for $company_code when calling SalesHeaderIn., must be smaller than or equal to 60.');
        }

        $this->container['company_code'] = $company_code;

        return $this;
    }

    /**
     * Gets transaction_type
     * @return string
     */
    public function getTransactionType()
    {
        return $this->container['transaction_type'];
    }

    /**
     * Sets transaction_type
     * @param string $transaction_type This string indicates the type of transaction for which tax should be calculated. - 'Sale' - 'Purchase' - 'Payment' - 'Receipt'
     * @return $this
     */
    public function setTransactionType($transaction_type)
    {
        $allowed_values = array('Sale', 'Purchase', 'Payment', 'Receipt');
        if ((!in_array($transaction_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'transaction_type', must be one of 'Sale', 'Purchase', 'Payment', 'Receipt'");
        }
        $this->container['transaction_type'] = $transaction_type;

        return $this;
    }

    /**
     * Gets document_code
     * @return string
     */
    public function getDocumentCode()
    {
        return $this->container['document_code'];
    }

    /**
     * Sets document_code
     * @param string $document_code This string is a code maintained by the client application to uniquely identify a document in the client's systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored
     * @return $this
     */
    public function setDocumentCode($document_code)
    {
        $this->container['document_code'] = $document_code;

        return $this;
    }

    /**
     * Gets currency
     * @return string
     */
    public function getCurrency()
    {
        return $this->container['currency'];
    }

    /**
     * Sets currency
     * @param string $currency currency code / transactions must be in Brazilian Reais \"BRL\"
     * @return $this
     */
    public function setCurrency($currency)
    {
        $allowed_values = array('BRL');
        if ((!in_array($currency, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'currency', must be one of 'BRL'");
        }
        $this->container['currency'] = $currency;

        return $this;
    }

    /**
     * Gets transaction_date
     * @return \DateTime
     */
    public function getTransactionDate()
    {
        return $this->container['transaction_date'];
    }

    /**
     * Sets transaction_date
     * @param \DateTime $transaction_date This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)
     * @return $this
     */
    public function setTransactionDate($transaction_date)
    {
        $this->container['transaction_date'] = $transaction_date;

        return $this;
    }

    /**
     * Gets tax_calculation_date
     * @return \DateTime
     */
    public function getTaxCalculationDate()
    {
        return $this->container['tax_calculation_date'];
    }

    /**
     * Sets tax_calculation_date
     * @param \DateTime $tax_calculation_date accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.
     * @return $this
     */
    public function setTaxCalculationDate($tax_calculation_date)
    {
        $this->container['tax_calculation_date'] = $tax_calculation_date;

        return $this;
    }

    /**
     * Gets company_location
     * @return string
     */
    public function getCompanyLocation()
    {
        return $this->container['company_location'];
    }

    /**
     * Sets company_location
     * @param string $company_location This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity
     * @return $this
     */
    public function setCompanyLocation($company_location)
    {
        if ((strlen($company_location) > 64)) {
            throw new \InvalidArgumentException('invalid length for $company_location when calling SalesHeaderIn., must be smaller than or equal to 64.');
        }

        $this->container['company_location'] = $company_location;

        return $this;
    }

    /**
     * Gets customer_code
     * @return string
     */
    public function getCustomerCode()
    {
        return $this->container['customer_code'];
    }

    /**
     * Sets customer_code
     * @param string $customer_code This string is a code maintained by the client application and recorded in Customer Portal to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of a Company.
     * @return $this
     */
    public function setCustomerCode($customer_code)
    {
        $this->container['customer_code'] = $customer_code;

        return $this;
    }

    /**
     * Gets purchase_order_number
     * @return string
     */
    public function getPurchaseOrderNumber()
    {
        return $this->container['purchase_order_number'];
    }

    /**
     * Sets purchase_order_number
     * @param string $purchase_order_number The number of Purchase Order
     * @return $this
     */
    public function setPurchaseOrderNumber($purchase_order_number)
    {
        $this->container['purchase_order_number'] = $purchase_order_number;

        return $this;
    }

    /**
     * Gets rps_number
     * @return int
     */
    public function getRpsNumber()
    {
        return $this->container['rps_number'];
    }

    /**
     * Sets rps_number
     * @param int $rps_number Provisional receipt services, sequencial number maintained by the client application, unique by serie
     * @return $this
     */
    public function setRpsNumber($rps_number)
    {
        $this->container['rps_number'] = $rps_number;

        return $this;
    }

    /**
     * Gets rps_serie
     * @return string
     */
    public function getRpsSerie()
    {
        return $this->container['rps_serie'];
    }

    /**
     * Sets rps_serie
     * @param string $rps_serie set name identifier for rps number sequency.
     * @return $this
     */
    public function setRpsSerie($rps_serie)
    {
        $this->container['rps_serie'] = $rps_serie;

        return $this;
    }

    /**
     * Gets discrimination_in
     * @return string
     */
    public function getDiscriminationIn()
    {
        return $this->container['discrimination_in'];
    }

    /**
     * Sets discrimination_in
     * @param string $discrimination_in Service discrimination, free description about service
     * @return $this
     */
    public function setDiscriminationIn($discrimination_in)
    {
        if (!is_null($discrimination_in) && (strlen($discrimination_in) > 1000)) {
            throw new \InvalidArgumentException('invalid length for $discrimination_in when calling SalesHeaderIn., must be smaller than or equal to 1000.');
        }
        if (!is_null($discrimination_in) && (strlen($discrimination_in) < 1)) {
            throw new \InvalidArgumentException('invalid length for $discrimination_in when calling SalesHeaderIn., must be bigger than or equal to 1.');
        }

        $this->container['discrimination_in'] = $discrimination_in;

        return $this;
    }

    /**
     * Gets entity
     * @return \Swagger\Client\Model\SalesEntity
     */
    public function getEntity()
    {
        return $this->container['entity'];
    }

    /**
     * Sets entity
     * @param \Swagger\Client\Model\SalesEntity $entity
     * @return $this
     */
    public function setEntity($entity)
    {
        $this->container['entity'] = $entity;

        return $this;
    }

    /**
     * Gets payment
     * @return \Swagger\Client\Model\SalesHeaderInPayment
     */
    public function getPayment()
    {
        return $this->container['payment'];
    }

    /**
     * Sets payment
     * @param \Swagger\Client\Model\SalesHeaderInPayment $payment
     * @return $this
     */
    public function setPayment($payment)
    {
        $this->container['payment'] = $payment;

        return $this;
    }

    /**
     * Gets taxes_config
     * @return \Swagger\Client\Model\SalesTaxesConfig
     */
    public function getTaxesConfig()
    {
        return $this->container['taxes_config'];
    }

    /**
     * Sets taxes_config
     * @param \Swagger\Client\Model\SalesTaxesConfig $taxes_config
     * @return $this
     */
    public function setTaxesConfig($taxes_config)
    {
        $this->container['taxes_config'] = $taxes_config;

        return $this;
    }

    /**
     * Gets default_locations
     * @return \Swagger\Client\Model\SalesDefaultLocations
     */
    public function getDefaultLocations()
    {
        return $this->container['default_locations'];
    }

    /**
     * Sets default_locations
     * @param \Swagger\Client\Model\SalesDefaultLocations $default_locations
     * @return $this
     */
    public function setDefaultLocations($default_locations)
    {
        $this->container['default_locations'] = $default_locations;

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


