<?php
/**
 * LegalReason
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
 * LegalReason Class Doc Comment
 *
 * @category    Class */
 // @description Legal Reason (Fundamentação Legal): - &#39;name&#39; - &#39;description&#39; - &#39;scope&#39;
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class LegalReason implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'LegalReason';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'id' => 'string',
        'scope' => 'string',
        'disable' => 'bool',
        'description' => 'string',
        'name' => 'string',
        'legal_code' => 'string',
        'show_in_invoice' => 'string',
        'referenced_processes' => '\Swagger\Client\Model\LegalReasonReferencedProcesses[]',
        'tax_scope' => '\Swagger\Client\Model\LegalReasonTaxScope'
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
        'id' => 'id',
        'scope' => 'scope',
        'disable' => 'disable',
        'description' => 'description',
        'name' => 'name',
        'legal_code' => 'legalCode',
        'show_in_invoice' => 'showInInvoice',
        'referenced_processes' => 'referencedProcesses',
        'tax_scope' => 'taxScope'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'id' => 'setId',
        'scope' => 'setScope',
        'disable' => 'setDisable',
        'description' => 'setDescription',
        'name' => 'setName',
        'legal_code' => 'setLegalCode',
        'show_in_invoice' => 'setShowInInvoice',
        'referenced_processes' => 'setReferencedProcesses',
        'tax_scope' => 'setTaxScope'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'id' => 'getId',
        'scope' => 'getScope',
        'disable' => 'getDisable',
        'description' => 'getDescription',
        'name' => 'getName',
        'legal_code' => 'getLegalCode',
        'show_in_invoice' => 'getShowInInvoice',
        'referenced_processes' => 'getReferencedProcesses',
        'tax_scope' => 'getTaxScope'
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

    const SCOPE_GENERAL = 'general';
    const SCOPE_LINKED_TO = 'linkedTo';
    const SHOW_IN_INVOICE_COMPLEMENTARY_INFO_MESSAGE = 'complementaryInfoMessage';
    const SHOW_IN_INVOICE_FISCAL_INFO_MESSAGE = 'fiscalInfoMessage';
    const SHOW_IN_INVOICE_ITEM_INFO_MESSAGE = 'itemInfoMessage';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getScopeAllowableValues()
    {
        return [
            self::SCOPE_GENERAL,
            self::SCOPE_LINKED_TO,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getShowInInvoiceAllowableValues()
    {
        return [
            self::SHOW_IN_INVOICE_COMPLEMENTARY_INFO_MESSAGE,
            self::SHOW_IN_INVOICE_FISCAL_INFO_MESSAGE,
            self::SHOW_IN_INVOICE_ITEM_INFO_MESSAGE,
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
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['scope'] = isset($data['scope']) ? $data['scope'] : null;
        $this->container['disable'] = isset($data['disable']) ? $data['disable'] : null;
        $this->container['description'] = isset($data['description']) ? $data['description'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['legal_code'] = isset($data['legal_code']) ? $data['legal_code'] : null;
        $this->container['show_in_invoice'] = isset($data['show_in_invoice']) ? $data['show_in_invoice'] : null;
        $this->container['referenced_processes'] = isset($data['referenced_processes']) ? $data['referenced_processes'] : null;
        $this->container['tax_scope'] = isset($data['tax_scope']) ? $data['tax_scope'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['scope'] === null) {
            $invalid_properties[] = "'scope' can't be null";
        }
        $allowed_values = ["general", "linkedTo"];
        if (!in_array($this->container['scope'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'scope', must be one of #{allowed_values}.";
        }

        if ($this->container['description'] === null) {
            $invalid_properties[] = "'description' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalid_properties[] = "'name' can't be null";
        }
        $allowed_values = ["complementaryInfoMessage", "fiscalInfoMessage", "itemInfoMessage"];
        if (!in_array($this->container['show_in_invoice'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'show_in_invoice', must be one of #{allowed_values}.";
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
        if ($this->container['scope'] === null) {
            return false;
        }
        $allowed_values = ["general", "linkedTo"];
        if (!in_array($this->container['scope'], $allowed_values)) {
            return false;
        }
        if ($this->container['description'] === null) {
            return false;
        }
        if ($this->container['name'] === null) {
            return false;
        }
        $allowed_values = ["complementaryInfoMessage", "fiscalInfoMessage", "itemInfoMessage"];
        if (!in_array($this->container['show_in_invoice'], $allowed_values)) {
            return false;
        }
        return true;
    }


    /**
     * Gets id
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     * @param string $id Internal ID
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets scope
     * @return string
     */
    public function getScope()
    {
        return $this->container['scope'];
    }

    /**
     * Sets scope
     * @param string $scope Message scope. May be one of these. general - This message is not linked to any entity (agast/process/cfop) and will be applied to any item in a transacition. (Esta mensagem tem escopo geral, nao está relacionadas diretamente qualquer objeto.); linkedTo - This message is linked to an entity, and its processing will only occur when the context involves it. (Esta mensagens estão relacionadas diretamente a algum objeto como um AGAST por exemplo, um Processo ou uma CFOP.);
     * @return $this
     */
    public function setScope($scope)
    {
        $allowed_values = array('general', 'linkedTo');
        if ((!in_array($scope, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'scope', must be one of 'general', 'linkedTo'");
        }
        $this->container['scope'] = $scope;

        return $this;
    }

    /**
     * Gets disable
     * @return bool
     */
    public function getDisable()
    {
        return $this->container['disable'];
    }

    /**
     * Sets disable
     * @param bool $disable Set this message as no longer valid
     * @return $this
     */
    public function setDisable($disable)
    {
        $this->container['disable'] = $disable;

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
     * @param string $description Legal reason textual description;
     * @return $this
     */
    public function setDescription($description)
    {
        $this->container['description'] = $description;

        return $this;
    }

    /**
     * Gets name
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     * @param string $name Short name to this message
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets legal_code
     * @return string
     */
    public function getLegalCode()
    {
        return $this->container['legal_code'];
    }

    /**
     * Sets legal_code
     * @param string $legal_code this field inform the official code number
     * @return $this
     */
    public function setLegalCode($legal_code)
    {
        $this->container['legal_code'] = $legal_code;

        return $this;
    }

    /**
     * Gets show_in_invoice
     * @return string
     */
    public function getShowInInvoice()
    {
        return $this->container['show_in_invoice'];
    }

    /**
     * Sets show_in_invoice
     * @param string $show_in_invoice Optional. Show this message when used in Invoice (NFe, NFCe, others...). Where to show this.
     * @return $this
     */
    public function setShowInInvoice($show_in_invoice)
    {
        $allowed_values = array('complementaryInfoMessage', 'fiscalInfoMessage', 'itemInfoMessage');
        if (!is_null($show_in_invoice) && (!in_array($show_in_invoice, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'show_in_invoice', must be one of 'complementaryInfoMessage', 'fiscalInfoMessage', 'itemInfoMessage'");
        }
        $this->container['show_in_invoice'] = $show_in_invoice;

        return $this;
    }

    /**
     * Gets referenced_processes
     * @return \Swagger\Client\Model\LegalReasonReferencedProcesses[]
     */
    public function getReferencedProcesses()
    {
        return $this->container['referenced_processes'];
    }

    /**
     * Sets referenced_processes
     * @param \Swagger\Client\Model\LegalReasonReferencedProcesses[] $referenced_processes Referenced Process
     * @return $this
     */
    public function setReferencedProcesses($referenced_processes)
    {
        $this->container['referenced_processes'] = $referenced_processes;

        return $this;
    }

    /**
     * Gets tax_scope
     * @return \Swagger\Client\Model\LegalReasonTaxScope
     */
    public function getTaxScope()
    {
        return $this->container['tax_scope'];
    }

    /**
     * Sets tax_scope
     * @param \Swagger\Client\Model\LegalReasonTaxScope $tax_scope
     * @return $this
     */
    public function setTaxScope($tax_scope)
    {
        $this->container['tax_scope'] = $tax_scope;

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

