<?php
/**
 * TaxConf
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
 * TaxConf Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class TaxConf implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'TaxConf';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'code' => 'string',
        'stock_impact' => 'bool',
        'financial_impact' => 'bool',
        'cst_ipi' => 'string',
        'ipi_legal_tax_class' => 'string',
        'accruable_pis_taxation' => 'string',
        'pis_exempt_legal_reason_code' => 'string',
        'pis_exempt_legal_reason' => 'string',
        'accruable_cofins_taxation' => 'string',
        'cofins_exempt_legal_reason_code' => 'string',
        'cofins_exempt_legal_reason' => 'string',
        'allow_ip_icredit_when_in_going' => 'bool',
        'icms_conf' => '\Swagger\Client\Model\IcmsTaxConf[]'
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
        'code' => 'code',
        'stock_impact' => 'stockImpact',
        'financial_impact' => 'financialImpact',
        'cst_ipi' => 'cstIPI',
        'ipi_legal_tax_class' => 'ipiLegalTaxClass',
        'accruable_pis_taxation' => 'accruablePISTaxation',
        'pis_exempt_legal_reason_code' => 'pisExemptLegalReasonCode',
        'pis_exempt_legal_reason' => 'pisExemptLegalReason',
        'accruable_cofins_taxation' => 'accruableCOFINSTaxation',
        'cofins_exempt_legal_reason_code' => 'cofinsExemptLegalReasonCode',
        'cofins_exempt_legal_reason' => 'cofinsExemptLegalReason',
        'allow_ip_icredit_when_in_going' => 'allowIPIcreditWhenInGoing',
        'icms_conf' => 'icmsConf'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'code' => 'setCode',
        'stock_impact' => 'setStockImpact',
        'financial_impact' => 'setFinancialImpact',
        'cst_ipi' => 'setCstIpi',
        'ipi_legal_tax_class' => 'setIpiLegalTaxClass',
        'accruable_pis_taxation' => 'setAccruablePisTaxation',
        'pis_exempt_legal_reason_code' => 'setPisExemptLegalReasonCode',
        'pis_exempt_legal_reason' => 'setPisExemptLegalReason',
        'accruable_cofins_taxation' => 'setAccruableCofinsTaxation',
        'cofins_exempt_legal_reason_code' => 'setCofinsExemptLegalReasonCode',
        'cofins_exempt_legal_reason' => 'setCofinsExemptLegalReason',
        'allow_ip_icredit_when_in_going' => 'setAllowIpIcreditWhenInGoing',
        'icms_conf' => 'setIcmsConf'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'code' => 'getCode',
        'stock_impact' => 'getStockImpact',
        'financial_impact' => 'getFinancialImpact',
        'cst_ipi' => 'getCstIpi',
        'ipi_legal_tax_class' => 'getIpiLegalTaxClass',
        'accruable_pis_taxation' => 'getAccruablePisTaxation',
        'pis_exempt_legal_reason_code' => 'getPisExemptLegalReasonCode',
        'pis_exempt_legal_reason' => 'getPisExemptLegalReason',
        'accruable_cofins_taxation' => 'getAccruableCofinsTaxation',
        'cofins_exempt_legal_reason_code' => 'getCofinsExemptLegalReasonCode',
        'cofins_exempt_legal_reason' => 'getCofinsExemptLegalReason',
        'allow_ip_icredit_when_in_going' => 'getAllowIpIcreditWhenInGoing',
        'icms_conf' => 'getIcmsConf'
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

    const CST_IPI__50 = '50';
    const CST_IPI__51 = '51';
    const CST_IPI__52 = '52';
    const CST_IPI__53 = '53';
    const CST_IPI__54 = '54';
    const ACCRUABLE_PIS_TAXATION_T = 'T';
    const ACCRUABLE_PIS_TAXATION_Z = 'Z';
    const ACCRUABLE_PIS_TAXATION_E = 'E';
    const ACCRUABLE_PIS_TAXATION_H = 'H';
    const ACCRUABLE_PIS_TAXATION_N = 'N';
    const ACCRUABLE_COFINS_TAXATION_T = 'T';
    const ACCRUABLE_COFINS_TAXATION_Z = 'Z';
    const ACCRUABLE_COFINS_TAXATION_E = 'E';
    const ACCRUABLE_COFINS_TAXATION_H = 'H';
    const ACCRUABLE_COFINS_TAXATION_N = 'N';
    

    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getCstIpiAllowableValues()
    {
        return [
            self::CST_IPI__50,
            self::CST_IPI__51,
            self::CST_IPI__52,
            self::CST_IPI__53,
            self::CST_IPI__54,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getAccruablePisTaxationAllowableValues()
    {
        return [
            self::ACCRUABLE_PIS_TAXATION_T,
            self::ACCRUABLE_PIS_TAXATION_Z,
            self::ACCRUABLE_PIS_TAXATION_E,
            self::ACCRUABLE_PIS_TAXATION_H,
            self::ACCRUABLE_PIS_TAXATION_N,
        ];
    }
    
    /**
     * Gets allowable values of the enum
     * @return string[]
     */
    public function getAccruableCofinsTaxationAllowableValues()
    {
        return [
            self::ACCRUABLE_COFINS_TAXATION_T,
            self::ACCRUABLE_COFINS_TAXATION_Z,
            self::ACCRUABLE_COFINS_TAXATION_E,
            self::ACCRUABLE_COFINS_TAXATION_H,
            self::ACCRUABLE_COFINS_TAXATION_N,
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
        $this->container['code'] = isset($data['code']) ? $data['code'] : null;
        $this->container['stock_impact'] = isset($data['stock_impact']) ? $data['stock_impact'] : null;
        $this->container['financial_impact'] = isset($data['financial_impact']) ? $data['financial_impact'] : null;
        $this->container['cst_ipi'] = isset($data['cst_ipi']) ? $data['cst_ipi'] : null;
        $this->container['ipi_legal_tax_class'] = isset($data['ipi_legal_tax_class']) ? $data['ipi_legal_tax_class'] : null;
        $this->container['accruable_pis_taxation'] = isset($data['accruable_pis_taxation']) ? $data['accruable_pis_taxation'] : null;
        $this->container['pis_exempt_legal_reason_code'] = isset($data['pis_exempt_legal_reason_code']) ? $data['pis_exempt_legal_reason_code'] : null;
        $this->container['pis_exempt_legal_reason'] = isset($data['pis_exempt_legal_reason']) ? $data['pis_exempt_legal_reason'] : null;
        $this->container['accruable_cofins_taxation'] = isset($data['accruable_cofins_taxation']) ? $data['accruable_cofins_taxation'] : null;
        $this->container['cofins_exempt_legal_reason_code'] = isset($data['cofins_exempt_legal_reason_code']) ? $data['cofins_exempt_legal_reason_code'] : null;
        $this->container['cofins_exempt_legal_reason'] = isset($data['cofins_exempt_legal_reason']) ? $data['cofins_exempt_legal_reason'] : null;
        $this->container['allow_ip_icredit_when_in_going'] = isset($data['allow_ip_icredit_when_in_going']) ? $data['allow_ip_icredit_when_in_going'] : null;
        $this->container['icms_conf'] = isset($data['icms_conf']) ? $data['icms_conf'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        if ($this->container['code'] === null) {
            $invalid_properties[] = "'code' can't be null";
        }
        if ((strlen($this->container['code']) > 40)) {
            $invalid_properties[] = "invalid value for 'code', the character length must be smaller than or equal to 40.";
        }

        $allowed_values = ["50", "51", "52", "53", "54"];
        if (!in_array($this->container['cst_ipi'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'cst_ipi', must be one of #{allowed_values}.";
        }

        $allowed_values = ["T", "Z", "E", "H", "N"];
        if (!in_array($this->container['accruable_pis_taxation'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'accruable_pis_taxation', must be one of #{allowed_values}.";
        }

        if (!is_null($this->container['pis_exempt_legal_reason_code']) && (strlen($this->container['pis_exempt_legal_reason_code']) > 3)) {
            $invalid_properties[] = "invalid value for 'pis_exempt_legal_reason_code', the character length must be smaller than or equal to 3.";
        }

        if (!is_null($this->container['pis_exempt_legal_reason']) && (strlen($this->container['pis_exempt_legal_reason']) > 1024)) {
            $invalid_properties[] = "invalid value for 'pis_exempt_legal_reason', the character length must be smaller than or equal to 1024.";
        }

        $allowed_values = ["T", "Z", "E", "H", "N"];
        if (!in_array($this->container['accruable_cofins_taxation'], $allowed_values)) {
            $invalid_properties[] = "invalid value for 'accruable_cofins_taxation', must be one of #{allowed_values}.";
        }

        if (!is_null($this->container['cofins_exempt_legal_reason_code']) && (strlen($this->container['cofins_exempt_legal_reason_code']) > 3)) {
            $invalid_properties[] = "invalid value for 'cofins_exempt_legal_reason_code', the character length must be smaller than or equal to 3.";
        }

        if (!is_null($this->container['cofins_exempt_legal_reason']) && (strlen($this->container['cofins_exempt_legal_reason']) > 1024)) {
            $invalid_properties[] = "invalid value for 'cofins_exempt_legal_reason', the character length must be smaller than or equal to 1024.";
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
        if ($this->container['code'] === null) {
            return false;
        }
        if (strlen($this->container['code']) > 40) {
            return false;
        }
        $allowed_values = ["50", "51", "52", "53", "54"];
        if (!in_array($this->container['cst_ipi'], $allowed_values)) {
            return false;
        }
        $allowed_values = ["T", "Z", "E", "H", "N"];
        if (!in_array($this->container['accruable_pis_taxation'], $allowed_values)) {
            return false;
        }
        if (strlen($this->container['pis_exempt_legal_reason_code']) > 3) {
            return false;
        }
        if (strlen($this->container['pis_exempt_legal_reason']) > 1024) {
            return false;
        }
        $allowed_values = ["T", "Z", "E", "H", "N"];
        if (!in_array($this->container['accruable_cofins_taxation'], $allowed_values)) {
            return false;
        }
        if (strlen($this->container['cofins_exempt_legal_reason_code']) > 3) {
            return false;
        }
        if (strlen($this->container['cofins_exempt_legal_reason']) > 1024) {
            return false;
        }
        return true;
    }


    /**
     * Gets code
     * @return string
     */
    public function getCode()
    {
        return $this->container['code'];
    }

    /**
     * Sets code
     * @param string $code main unique identificator
     * @return $this
     */
    public function setCode($code)
    {
        if ((strlen($code) > 40)) {
            throw new \InvalidArgumentException('invalid length for $code when calling TaxConf., must be smaller than or equal to 40.');
        }

        $this->container['code'] = $code;

        return $this;
    }

    /**
     * Gets stock_impact
     * @return bool
     */
    public function getStockImpact()
    {
        return $this->container['stock_impact'];
    }

    /**
     * Sets stock_impact
     * @param bool $stock_impact Inform that the process has inventory impact.
     * @return $this
     */
    public function setStockImpact($stock_impact)
    {
        $this->container['stock_impact'] = $stock_impact;

        return $this;
    }

    /**
     * Gets financial_impact
     * @return bool
     */
    public function getFinancialImpact()
    {
        return $this->container['financial_impact'];
    }

    /**
     * Sets financial_impact
     * @param bool $financial_impact Inform that the process has financial impact.
     * @return $this
     */
    public function setFinancialImpact($financial_impact)
    {
        $this->container['financial_impact'] = $financial_impact;

        return $this;
    }

    /**
     * Gets cst_ipi
     * @return string
     */
    public function getCstIpi()
    {
        return $this->container['cst_ipi'];
    }

    /**
     * Sets cst_ipi
     * @param string $cst_ipi Inform if this process is subject to IPI taxation on output process - '50' # Saída Tributada - '51' # Saída Tributável com Alíquota Zero - '52' # Saída Isenta - '53' # Saída Não-Tributada - '54' # Saída Imune
     * @return $this
     */
    public function setCstIpi($cst_ipi)
    {
        $allowed_values = array('50', '51', '52', '53', '54');
        if (!is_null($cst_ipi) && (!in_array($cst_ipi, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'cst_ipi', must be one of '50', '51', '52', '53', '54'");
        }
        $this->container['cst_ipi'] = $cst_ipi;

        return $this;
    }

    /**
     * Gets ipi_legal_tax_class
     * @return string
     */
    public function getIpiLegalTaxClass()
    {
        return $this->container['ipi_legal_tax_class'];
    }

    /**
     * Sets ipi_legal_tax_class
     * @param string $ipi_legal_tax_class Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo=mCnJajU4BKU=
     * @return $this
     */
    public function setIpiLegalTaxClass($ipi_legal_tax_class)
    {
        $this->container['ipi_legal_tax_class'] = $ipi_legal_tax_class;

        return $this;
    }

    /**
     * Gets accruable_pis_taxation
     * @return string
     */
    public function getAccruablePisTaxation()
    {
        return $this->container['accruable_pis_taxation'];
    }

    /**
     * Sets accruable_pis_taxation
     * @param string $accruable_pis_taxation Inform if this item by nature is subject to PIS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE
     * @return $this
     */
    public function setAccruablePisTaxation($accruable_pis_taxation)
    {
        $allowed_values = array('T', 'Z', 'E', 'H', 'N');
        if (!is_null($accruable_pis_taxation) && (!in_array($accruable_pis_taxation, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'accruable_pis_taxation', must be one of 'T', 'Z', 'E', 'H', 'N'");
        }
        $this->container['accruable_pis_taxation'] = $accruable_pis_taxation;

        return $this;
    }

    /**
     * Gets pis_exempt_legal_reason_code
     * @return string
     */
    public function getPisExemptLegalReasonCode()
    {
        return $this->container['pis_exempt_legal_reason_code'];
    }

    /**
     * Sets pis_exempt_legal_reason_code
     * @param string $pis_exempt_legal_reason_code When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
     * @return $this
     */
    public function setPisExemptLegalReasonCode($pis_exempt_legal_reason_code)
    {
        if (!is_null($pis_exempt_legal_reason_code) && (strlen($pis_exempt_legal_reason_code) > 3)) {
            throw new \InvalidArgumentException('invalid length for $pis_exempt_legal_reason_code when calling TaxConf., must be smaller than or equal to 3.');
        }

        $this->container['pis_exempt_legal_reason_code'] = $pis_exempt_legal_reason_code;

        return $this;
    }

    /**
     * Gets pis_exempt_legal_reason
     * @return string
     */
    public function getPisExemptLegalReason()
    {
        return $this->container['pis_exempt_legal_reason'];
    }

    /**
     * Sets pis_exempt_legal_reason
     * @param string $pis_exempt_legal_reason When specifi reason, this field has the description
     * @return $this
     */
    public function setPisExemptLegalReason($pis_exempt_legal_reason)
    {
        if (!is_null($pis_exempt_legal_reason) && (strlen($pis_exempt_legal_reason) > 1024)) {
            throw new \InvalidArgumentException('invalid length for $pis_exempt_legal_reason when calling TaxConf., must be smaller than or equal to 1024.');
        }

        $this->container['pis_exempt_legal_reason'] = $pis_exempt_legal_reason;

        return $this;
    }

    /**
     * Gets accruable_cofins_taxation
     * @return string
     */
    public function getAccruableCofinsTaxation()
    {
        return $this->container['accruable_cofins_taxation'];
    }

    /**
     * Sets accruable_cofins_taxation
     * @param string $accruable_cofins_taxation Inform if this item by nature is subject to COFINS taxation or exempt - 'T' # TAXABLE - 'Z' # TAXABLE WITH RATE=0.00 - 'E' # EXEMPT - 'H' # SUSPENDED - 'N' # NO TAXABLE
     * @return $this
     */
    public function setAccruableCofinsTaxation($accruable_cofins_taxation)
    {
        $allowed_values = array('T', 'Z', 'E', 'H', 'N');
        if (!is_null($accruable_cofins_taxation) && (!in_array($accruable_cofins_taxation, $allowed_values))) {
            throw new \InvalidArgumentException("Invalid value for 'accruable_cofins_taxation', must be one of 'T', 'Z', 'E', 'H', 'N'");
        }
        $this->container['accruable_cofins_taxation'] = $accruable_cofins_taxation;

        return $this;
    }

    /**
     * Gets cofins_exempt_legal_reason_code
     * @return string
     */
    public function getCofinsExemptLegalReasonCode()
    {
        return $this->container['cofins_exempt_legal_reason_code'];
    }

    /**
     * Sets cofins_exempt_legal_reason_code
     * @param string $cofins_exempt_legal_reason_code When exempt, taxable with zero, suspended, not taxable, this field holds the official code number
     * @return $this
     */
    public function setCofinsExemptLegalReasonCode($cofins_exempt_legal_reason_code)
    {
        if (!is_null($cofins_exempt_legal_reason_code) && (strlen($cofins_exempt_legal_reason_code) > 3)) {
            throw new \InvalidArgumentException('invalid length for $cofins_exempt_legal_reason_code when calling TaxConf., must be smaller than or equal to 3.');
        }

        $this->container['cofins_exempt_legal_reason_code'] = $cofins_exempt_legal_reason_code;

        return $this;
    }

    /**
     * Gets cofins_exempt_legal_reason
     * @return string
     */
    public function getCofinsExemptLegalReason()
    {
        return $this->container['cofins_exempt_legal_reason'];
    }

    /**
     * Sets cofins_exempt_legal_reason
     * @param string $cofins_exempt_legal_reason When specifi reason, this field has the description
     * @return $this
     */
    public function setCofinsExemptLegalReason($cofins_exempt_legal_reason)
    {
        if (!is_null($cofins_exempt_legal_reason) && (strlen($cofins_exempt_legal_reason) > 1024)) {
            throw new \InvalidArgumentException('invalid length for $cofins_exempt_legal_reason when calling TaxConf., must be smaller than or equal to 1024.');
        }

        $this->container['cofins_exempt_legal_reason'] = $cofins_exempt_legal_reason;

        return $this;
    }

    /**
     * Gets allow_ip_icredit_when_in_going
     * @return bool
     */
    public function getAllowIpIcreditWhenInGoing()
    {
        return $this->container['allow_ip_icredit_when_in_going'];
    }

    /**
     * Sets allow_ip_icredit_when_in_going
     * @param bool $allow_ip_icredit_when_in_going Inform that the process allow IPI credit to Input process
     * @return $this
     */
    public function setAllowIpIcreditWhenInGoing($allow_ip_icredit_when_in_going)
    {
        $this->container['allow_ip_icredit_when_in_going'] = $allow_ip_icredit_when_in_going;

        return $this;
    }

    /**
     * Gets icms_conf
     * @return \Swagger\Client\Model\IcmsTaxConf[]
     */
    public function getIcmsConf()
    {
        return $this->container['icms_conf'];
    }

    /**
     * Sets icms_conf
     * @param \Swagger\Client\Model\IcmsTaxConf[] $icms_conf the map key is state code
     * @return $this
     */
    public function setIcmsConf($icms_conf)
    {
        $this->container['icms_conf'] = $icms_conf;

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


