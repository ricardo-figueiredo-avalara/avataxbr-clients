/* 
 * AvaTax Brazil
 *
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

package swagger

type NRefRefEcf struct {

	// ECF Sequential number that generated Cupom attached to NFe informar o número de ordem seqüencial do ECF que emitiu o Cupom Fiscal vinculado à NF-e 
	NECF string `json:"nECF,omitempty"`

	// Operational counter number attached to NFe Informar o Número do Contador de Ordem de Operação - COO vinculado à NF-e 
	NCOO string `json:"nCOO,omitempty"`

	// Fiscal document model - '2B' # coupon tax not ECF - '2C' # PDV coupon tax - '2D' # ECF coupon tax 
	ModECF string `json:"modECF,omitempty"`
}
