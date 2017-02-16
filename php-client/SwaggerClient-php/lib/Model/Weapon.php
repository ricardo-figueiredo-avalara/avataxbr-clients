<?php
/**
 * Weapon
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
 * Weapon Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class Weapon implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'Weapon';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'weapon_restriction_type' => 'string',
        'serie_number' => 'string',
        'gun_barrel_serie_number' => 'string',
        'weapon_description' => 'string'
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
        'weapon_restriction_type' => 'weaponRestrictionType',
        'serie_number' => 'serieNumber',
        'gun_barrel_serie_number' => 'gunBarrelSerieNumber',
        'weapon_description' => 'weaponDescription'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'weapon_restriction_type' => 'setWeaponRestrictionType',
        'serie_number' => 'setSerieNumber',
        'gun_barrel_serie_number' => 'setGunBarrelSerieNumber',
        'weapon_description' => 'setWeaponDescription'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'weapon_restriction_type' => 'getWeaponRestrictionType',
        'serie_number' => 'getSerieNumber',
        'gun_barrel_serie_number' => 'getGunBarrelSerieNumber',
        'weapon_description' => 'getWeaponDescription'
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

    const WEAPON_RESTRICTION_TYPE__0 = '0';
    const WEAPON_RESTRICTION_TYPE__1 = '1';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getWeaponRestrictionTypeAllowableValues()
    {
        return [
            self::WEAPON_RESTRICTION_TYPE__0,
            self::WEAPON_RESTRICTION_TYPE__1,
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
        $this->container['weapon_restriction_type'] = isset($data['weapon_restriction_type']) ? $data['weapon_restriction_type'] : null;
        $this->container['serie_number'] = isset($data['serie_number']) ? $data['serie_number'] : null;
        $this->container['gun_barrel_serie_number'] = isset($data['gun_barrel_serie_number']) ? $data['gun_barrel_serie_number'] : null;
        $this->container['weapon_description'] = isset($data['weapon_description']) ? $data['weapon_description'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['weapon_restriction_type'] === null) {
            $invalid_properties[] = "'weapon_restriction_type' can't be null";
        }
        $allowed_values = ["0", "1"];
        if (!in_array($this->container['weapon_restriction_type'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'weapon_restriction_type', must be one of #{allowed_values}.";
        }

        if ($this->container['serie_number'] === null) {
            $invalid_properties[] = "'serie_number' can't be null";
        }
        if ((strlen($this->container['serie_number']) > 15)) {
            $invalid_properties[] = "invalid value for 'serie_number', the character length must be smaller than or equal to 15.";
        }

        if ($this->container['gun_barrel_serie_number'] === null) {
            $invalid_properties[] = "'gun_barrel_serie_number' can't be null";
        }
        if ((strlen($this->container['gun_barrel_serie_number']) > 15)) {
            $invalid_properties[] = "invalid value for 'gun_barrel_serie_number', the character length must be smaller than or equal to 15.";
        }

        if ($this->container['weapon_description'] === null) {
            $invalid_properties[] = "'weapon_description' can't be null";
        }
        if ((strlen($this->container['weapon_description']) > 256)) {
            $invalid_properties[] = "invalid value for 'weapon_description', the character length must be smaller than or equal to 256.";
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
        if ($this->container['weapon_restriction_type'] === null) {
            return false;
        }
        $allowed_values = ["0", "1"];
        if (!in_array($this->container['weapon_restriction_type'], $allowed_values)) {
            return false;
        }
        if ($this->container['serie_number'] === null) {
            return false;
        }
        if (strlen($this->container['serie_number']) > 15) {
            return false;
        }
        if ($this->container['gun_barrel_serie_number'] === null) {
            return false;
        }
        if (strlen($this->container['gun_barrel_serie_number']) > 15) {
            return false;
        }
        if ($this->container['weapon_description'] === null) {
            return false;
        }
        if (strlen($this->container['weapon_description']) > 256) {
            return false;
        }
        return true;
    }


    /**
     * Gets weapon_restriction_type
     * @return string
     */
    public function getWeaponRestrictionType()
    {
        return $this->container['weapon_restriction_type'];
    }

    /**
     * Sets weapon_restriction_type
     * @param string $weapon_restriction_type - '0' # restrict use - '1' # public use
     * @return $this
     */
    public function setWeaponRestrictionType($weapon_restriction_type)
    {
        $allowed_values = array('0', '1');
        if ((!in_array($weapon_restriction_type, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'weapon_restriction_type', must be one of '0', '1'");
        }
        $this->container['weapon_restriction_type'] = $weapon_restriction_type;

        return $this;
    }

    /**
     * Gets serie_number
     * @return string
     */
    public function getSerieNumber()
    {
        return $this->container['serie_number'];
    }

    /**
     * Sets serie_number
     * @param string $serie_number
     * @return $this
     */
    public function setSerieNumber($serie_number)
    {
        if ((strlen($serie_number) > 15)) {
            throw new \InvalidArgumentException('invalid length for $serie_number when calling Weapon., must be smaller than or equal to 15.');
        }

        $this->container['serie_number'] = $serie_number;

        return $this;
    }

    /**
     * Gets gun_barrel_serie_number
     * @return string
     */
    public function getGunBarrelSerieNumber()
    {
        return $this->container['gun_barrel_serie_number'];
    }

    /**
     * Sets gun_barrel_serie_number
     * @param string $gun_barrel_serie_number Barrel's serial number. Número de série do cano
     * @return $this
     */
    public function setGunBarrelSerieNumber($gun_barrel_serie_number)
    {
        if ((strlen($gun_barrel_serie_number) > 15)) {
            throw new \InvalidArgumentException('invalid length for $gun_barrel_serie_number when calling Weapon., must be smaller than or equal to 15.');
        }

        $this->container['gun_barrel_serie_number'] = $gun_barrel_serie_number;

        return $this;
    }

    /**
     * Gets weapon_description
     * @return string
     */
    public function getWeaponDescription()
    {
        return $this->container['weapon_description'];
    }

    /**
     * Sets weapon_description
     * @param string $weapon_description weapon description
     * @return $this
     */
    public function setWeaponDescription($weapon_description)
    {
        if ((strlen($weapon_description) > 256)) {
            throw new \InvalidArgumentException('invalid length for $weapon_description when calling Weapon., must be smaller than or equal to 256.');
        }

        $this->container['weapon_description'] = $weapon_description;

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

