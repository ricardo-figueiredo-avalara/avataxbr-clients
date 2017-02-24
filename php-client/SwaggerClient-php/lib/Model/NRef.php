<?php
/**
 * NRef
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
 * NRef Class Doc Comment
 *
 * @category    Class */
 // @description Referenced Invoices The invoice can be one of this types, - &#39;refNFe - Eletronic Invoice&#39; - &#39;refCTE - Transport Invoice&#39; - &#39;refECF - Reatail Cupom&#39; - &#39;refNF  - Invoice model 1 or 1A&#39; - &#39;refFarmerNF - farmer invoice&#39;
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class NRef implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'NRef';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'type' => 'string',
        'ref_n_fe' => 'string',
        'ref_c_te' => 'string',
        'ref_ecf' => '\Swagger\Client\Model\NRefRefECF',
        'ref_nf' => '\Swagger\Client\Model\NRefRefNF',
        'ref_farmer_nf' => '\Swagger\Client\Model\NRefRefFarmerNF'
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
        'type' => 'type',
        'ref_n_fe' => 'refNFe',
        'ref_c_te' => 'refCTe',
        'ref_ecf' => 'refECF',
        'ref_nf' => 'refNF',
        'ref_farmer_nf' => 'refFarmerNF'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'type' => 'setType',
        'ref_n_fe' => 'setRefNFe',
        'ref_c_te' => 'setRefCTe',
        'ref_ecf' => 'setRefEcf',
        'ref_nf' => 'setRefNf',
        'ref_farmer_nf' => 'setRefFarmerNf'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'type' => 'getType',
        'ref_n_fe' => 'getRefNFe',
        'ref_c_te' => 'getRefCTe',
        'ref_ecf' => 'getRefEcf',
        'ref_nf' => 'getRefNf',
        'ref_farmer_nf' => 'getRefFarmerNf'
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

    const TYPE_REF_N_FE = 'refNFe';
    const TYPE_REF_CTE = 'refCTE';
    const TYPE_REF_ECF = 'refECF';
    const TYPE_REF_NF = 'refNF';
    const TYPE_REF_FARMER_NF = 'refFarmerNF';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getTypeAllowableValues()
    {
        return [
            self::TYPE_REF_N_FE,
            self::TYPE_REF_CTE,
            self::TYPE_REF_ECF,
            self::TYPE_REF_NF,
            self::TYPE_REF_FARMER_NF,
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
        $this->container['type'] = isset($data['type']) ? $data['type'] : null;
        $this->container['ref_n_fe'] = isset($data['ref_n_fe']) ? $data['ref_n_fe'] : null;
        $this->container['ref_c_te'] = isset($data['ref_c_te']) ? $data['ref_c_te'] : null;
        $this->container['ref_ecf'] = isset($data['ref_ecf']) ? $data['ref_ecf'] : null;
        $this->container['ref_nf'] = isset($data['ref_nf']) ? $data['ref_nf'] : null;
        $this->container['ref_farmer_nf'] = isset($data['ref_farmer_nf']) ? $data['ref_farmer_nf'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        $allowed_values = ["refNFe", "refCTE", "refECF", "refNF", "refFarmerNF"];
        if (!in_array($this->container['type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'type', must be one of #{allowed_values}.";
        }

        if (!is_null($this->container['ref_n_fe']) && (strlen($this->container['ref_n_fe']) > 44)) {
            $invalid_properties[] = "invalid value for 'ref_n_fe', the character length must be smaller than or equal to 44.";
        }

        if (!is_null($this->container['ref_n_fe']) && !preg_match("/[0-9]{44}/", $this->container['ref_n_fe'])) {
            $invalid_properties[] = "invalid value for 'ref_n_fe', must be conform to the pattern /[0-9]{44}/.";
        }

        if (!is_null($this->container['ref_c_te']) && (strlen($this->container['ref_c_te']) > 44)) {
            $invalid_properties[] = "invalid value for 'ref_c_te', the character length must be smaller than or equal to 44.";
        }

        if (!is_null($this->container['ref_c_te']) && !preg_match("/[0-9]{44}/", $this->container['ref_c_te'])) {
            $invalid_properties[] = "invalid value for 'ref_c_te', must be conform to the pattern /[0-9]{44}/.";
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
        $allowed_values = ["refNFe", "refCTE", "refECF", "refNF", "refFarmerNF"];
        if (!in_array($this->container['type'], $allowed_values)) {
            return false;
        }
        if (strlen($this->container['ref_n_fe']) > 44) {
            return false;
        }
        if (!preg_match("/[0-9]{44}/", $this->container['ref_n_fe'])) {
            return false;
        }
        if (strlen($this->container['ref_c_te']) > 44) {
            return false;
        }
        if (!preg_match("/[0-9]{44}/", $this->container['ref_c_te'])) {
            return false;
        }
        return true;
    }


    /**
     * Gets type
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     * @param string $type
     * @return $this
     */
    public function setType($type)
    {
        $allowed_values = array('refNFe', 'refCTE', 'refECF', 'refNF', 'refFarmerNF');
        if (!is_null($type) && (!in_array($type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'type', must be one of 'refNFe', 'refCTE', 'refECF', 'refNF', 'refFarmerNF'");
        }
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets ref_n_fe
     * @return string
     */
    public function getRefNFe()
    {
        return $this->container['ref_n_fe'];
    }

    /**
     * Sets ref_n_fe
     * @param string $ref_n_fe
     * @return $this
     */
    public function setRefNFe($ref_n_fe)
    {
        if (!is_null($ref_n_fe) && (strlen($ref_n_fe) > 44)) {
            throw new \InvalidArgumentException('invalid length for $ref_n_fe when calling NRef., must be smaller than or equal to 44.');
        }
        if (!is_null($ref_n_fe) && (!preg_match("/[0-9]{44}/", $ref_n_fe))) {
            throw new \InvalidArgumentException("invalid value for $ref_n_fe when calling NRef., must conform to the pattern /[0-9]{44}/.");
        }

        $this->container['ref_n_fe'] = $ref_n_fe;

        return $this;
    }

    /**
     * Gets ref_c_te
     * @return string
     */
    public function getRefCTe()
    {
        return $this->container['ref_c_te'];
    }

    /**
     * Sets ref_c_te
     * @param string $ref_c_te
     * @return $this
     */
    public function setRefCTe($ref_c_te)
    {
        if (!is_null($ref_c_te) && (strlen($ref_c_te) > 44)) {
            throw new \InvalidArgumentException('invalid length for $ref_c_te when calling NRef., must be smaller than or equal to 44.');
        }
        if (!is_null($ref_c_te) && (!preg_match("/[0-9]{44}/", $ref_c_te))) {
            throw new \InvalidArgumentException("invalid value for $ref_c_te when calling NRef., must conform to the pattern /[0-9]{44}/.");
        }

        $this->container['ref_c_te'] = $ref_c_te;

        return $this;
    }

    /**
     * Gets ref_ecf
     * @return \Swagger\Client\Model\NRefRefECF
     */
    public function getRefEcf()
    {
        return $this->container['ref_ecf'];
    }

    /**
     * Sets ref_ecf
     * @param \Swagger\Client\Model\NRefRefECF $ref_ecf
     * @return $this
     */
    public function setRefEcf($ref_ecf)
    {
        $this->container['ref_ecf'] = $ref_ecf;

        return $this;
    }

    /**
     * Gets ref_nf
     * @return \Swagger\Client\Model\NRefRefNF
     */
    public function getRefNf()
    {
        return $this->container['ref_nf'];
    }

    /**
     * Sets ref_nf
     * @param \Swagger\Client\Model\NRefRefNF $ref_nf
     * @return $this
     */
    public function setRefNf($ref_nf)
    {
        $this->container['ref_nf'] = $ref_nf;

        return $this;
    }

    /**
     * Gets ref_farmer_nf
     * @return \Swagger\Client\Model\NRefRefFarmerNF
     */
    public function getRefFarmerNf()
    {
        return $this->container['ref_farmer_nf'];
    }

    /**
     * Sets ref_farmer_nf
     * @param \Swagger\Client\Model\NRefRefFarmerNF $ref_farmer_nf
     * @return $this
     */
    public function setRefFarmerNf($ref_farmer_nf)
    {
        $this->container['ref_farmer_nf'] = $ref_farmer_nf;

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


