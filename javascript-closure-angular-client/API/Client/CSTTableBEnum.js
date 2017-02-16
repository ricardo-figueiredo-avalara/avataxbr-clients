goog.provide('API.Client.CSTTableBEnum');

/**
 * Use to determined how the tax is applicable and calculated. It may define and exemption, a tax base reduction, identify that a special rate is applicable (not the rate itself). - '00' # Taxed in its totality - '10' # Taxed and subject to tax substitution (ICMS ST) - '20' # Taxed with Tax Base Reduction - '30' # Exempt /Not Taxed and subject to tax Substitution (ICMS#ST) - '40' # Tax Exempt - '41' # Not Taxed - '50' # Taxes Suspended - '51' # Taxes Diferred - '60' # ICMS Tax already collected through Substituition (ICMS ST) - '70' # Taxed with Tax Base Reduction and subject to Tax Subsititution (ICMS ST) - '90' # Others 
 * @record
 */
API.Client.CSTTableBEnum = function() {}

