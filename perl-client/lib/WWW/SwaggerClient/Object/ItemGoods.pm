=begin comment

AvaTax Brazil

The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
# Ref: https://github.com/swagger-api/swagger-codegen
#
package WWW::SwaggerClient::Object::ItemGoods;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use base ("Class::Accessor", "Class::Data::Inheritable");


#
#
#
# NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
# REF: https://github.com/swagger-api/swagger-codegen
#

=begin comment

AvaTax Brazil

The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
# Ref: https://github.com/swagger-api/swagger-codegen
#
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('swagger_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new object
sub new { 
    my ($class, %args) = @_; 

	my $self = bless {}, $class;
	
	foreach my $attribute (keys %{$class->attribute_map}) {
		my $args_key = $class->attribute_map->{$attribute};
		$self->$attribute( $args{ $args_key } );
	}
	
	return $self;
}  

# return perl hash
sub to_hash {
    return decode_json(JSON->new->convert_blessed->encode( shift ));
}

# used by JSON for serialization
sub TO_JSON { 
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }
    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use swagger_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->swagger_types} ) {
    	my $_json_attribute = $self->attribute_map->{$_key}; 
        if ($_type =~ /^array\[/i) { # array
            my $_subclass = substr($_type, 6, -1);
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
        	$log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }
  
    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);
        
    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::SwaggerClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => '',
                                  class => 'ItemGoods',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'company_id' => {
    	datatype => 'UUID',
    	base_name => 'companyId',
    	description => 'Company ID',
    	format => '',
    	read_only => '',
    		},
    'code' => {
    	datatype => 'string',
    	base_name => 'code',
    	description => 'ERP Code',
    	format => '',
    	read_only => '',
    		},
    'agast' => {
    	datatype => 'string',
    	base_name => 'agast',
    	description => 'Agast Code',
    	format => '',
    	read_only => '',
    		},
    'description' => {
    	datatype => 'string',
    	base_name => 'description',
    	description => 'Item Description',
    	format => '',
    	read_only => '',
    		},
    'seal_code' => {
    	datatype => 'string',
    	base_name => 'sealCode',
    	description => 'Seal Code for ipi tax control (código do selo para controle de IPI)',
    	format => '',
    	read_only => '',
    		},
    'n_fci' => {
    	datatype => 'string',
    	base_name => 'nFCI',
    	description => 'Importation content form number (Número de controle da FCI - Ficha de Conteúdo de Importação)',
    	format => '',
    	read_only => '',
    		},
    'is_icms_st_substitute' => {
    	datatype => 'boolean',
    	base_name => 'isIcmsStSubstitute',
    	description => 'this field inform that this merchandise or product is ICMS Substitute Must be used when the item is for resale and the company will assume the role of ICMS Substitute (wholesaler, retailer, distributor). Example: when Importing some product the company does not pay IcmsSt at the time of customs clearance but when selling sale the item. Deverá ser utilizado quando a empresa que irá vender a mercadoria sujeita ao ICMS ST for o SUBSTITUTO TRIBUTÁRIO (Distribuidor, atacadista e varejista), como por exemplo das mercadorias IMPORTADAS, neste sentido, a empresa não irá pagar o ICMS ST no desembaraço aduaneiro e irá recolher quando for vender as mesmas. ',
    	format => '',
    	read_only => '',
    		},
    'source' => {
    	datatype => 'string',
    	base_name => 'source',
    	description => '- &#39;0&#39; # National goods - except those treated in codes 3,4, 5 and 8 - &#39;1&#39; # Foreign goods - Imported directly by seller, except those in code 6 - &#39;2&#39; # Foreign goods - Acquired in the internal market (inside Brazil), except those in code 7 - &#39;3&#39; # National goods - Merchandise or goods with imported content above 40% and with less than or equal to 70% - &#39;4&#39; # National goods from production following &#39;standard basic processes&#39; as stablished by legislation (standard basic processes are devised to separate simple assembly from manufaturing processes) - &#39;5&#39; # National goods - Merchandise or goods with imported content equal or below 40% - &#39;6&#39; # Foreign goods - Directly imported by Seller, without a National Equivalent as listed by Comex and natural gas - &#39;7&#39; # Foreign goods - Acquired inside Brazil, without a National Equivalent  as listed by Comex and natural gas - &#39;8&#39; # National goods - Merchandise or goods with imported content above 70% ',
    	format => '',
    	read_only => '',
    		},
    'product_type' => {
    	datatype => 'string',
    	base_name => 'productType',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'manufacturer_equivalent' => {
    	datatype => 'boolean',
    	base_name => 'manufacturerEquivalent',
    	description => 'Item is merchandise but will be considered product',
    	format => '',
    	read_only => '',
    		},
    'appropriate_ip_icredit_when_in_going' => {
    	datatype => 'boolean',
    	base_name => 'appropriateIPIcreditWhenInGoing',
    	description => 'Inform that this item will have rights to aprropriate IPI credit',
    	format => '',
    	read_only => '',
    		},
    'usually_appropriate_piscofins_credit' => {
    	datatype => 'boolean',
    	base_name => 'usuallyAppropriatePISCOFINSCredit',
    	description => 'Subject to appropriate PIS/COFINS credit, when NO CUMULATIVE',
    	format => '',
    	read_only => '',
    		},
    'is_pis_cofins_estimated_credit' => {
    	datatype => 'boolean',
    	base_name => 'isPisCofinsEstimatedCredit',
    	description => 'The credit PIS/COFINS is subject to purchase form companies, but exist some exceptions, when the credit will be a estimated amount',
    	format => '',
    	read_only => '',
    		},
    'piscofins_revenue_type' => {
    	datatype => 'string',
    	base_name => 'piscofinsRevenueType',
    	description => '- &#39;01&#39; # Vinculada Exclusivamente a Receita Tributada no Mercado Interno - &#39;02&#39; # Exclusivamente a Receita Não Tributada no Mercado Interno - &#39;03&#39; # Exclusivamente a Receita de Exportação - &#39;04&#39; # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno - &#39;05&#39; # Vinculada a Receitas Tributadas no Mercado Interno e de Exportação - &#39;06&#39; # Vinculada a Receitas Não-Tributadas no Mercado Interno e de Exportação - &#39;07&#39; # Vinculada a Receitas Tributadas e Não-Tributadas no Mercado Interno, e de Exportação ',
    	format => '',
    	read_only => '',
    		},
    'icms_base_discount_for_mono_phase_social_contr' => {
    	datatype => 'double',
    	base_name => 'icmsBaseDiscountForMonoPhaseSocialContr',
    	description => 'Discount allowed on icms base when PIS/COFINS are Monophase',
    	format => '',
    	read_only => '',
    		},
    'cean' => {
    	datatype => 'string',
    	base_name => 'cean',
    	description => 'GTIN NUMBER',
    	format => '',
    	read_only => '',
    		},
    'nve' => {
    	datatype => 'string',
    	base_name => 'nve',
    	description => 'Nomenclatura de Valor aduaneio e Estatístico - NCM extension code',
    	format => '',
    	read_only => '',
    		},
    'sales_unit' => {
    	datatype => 'string',
    	base_name => 'salesUnit',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'sales_unit_ip_ifactor' => {
    	datatype => 'double',
    	base_name => 'salesUnitIPIfactor',
    	description => 'factor to convert sales quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)',
    	format => '',
    	read_only => '',
    		},
    'sales_unit_icmsfactor' => {
    	datatype => 'double',
    	base_name => 'salesUnitIcmsfactor',
    	description => 'factor to convert sales quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)',
    	format => '',
    	read_only => '',
    		},
    'sales_unit_icms_stfactor' => {
    	datatype => 'double',
    	base_name => 'salesUnitIcmsStfactor',
    	description => 'factor to convert sales quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)',
    	format => '',
    	read_only => '',
    		},
    'sales_unit_pis_cofinsfactor' => {
    	datatype => 'double',
    	base_name => 'salesUnitPisCofinsfactor',
    	description => 'factor to convert sales quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)',
    	format => '',
    	read_only => '',
    		},
    'purchase_unit' => {
    	datatype => 'string',
    	base_name => 'purchaseUnit',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'purchase_unit_ip_ifactor' => {
    	datatype => 'double',
    	base_name => 'purchaseUnitIPIfactor',
    	description => 'factor to convert purchase quantity to IPI taxable quantity when it is by SRF Statutory Retail Price (Pauta)',
    	format => '',
    	read_only => '',
    		},
    'purchase_unit_icmsfactor' => {
    	datatype => 'double',
    	base_name => 'purchaseUnitIcmsfactor',
    	description => 'factor to convert purchase quantity to ICMS taxable quantity when it is by SRF Statutory Retail Price (Pauta)',
    	format => '',
    	read_only => '',
    		},
    'purchase_unit_icms_stfactor' => {
    	datatype => 'double',
    	base_name => 'purchaseUnitIcmsStfactor',
    	description => 'factor to convert purchase quantity to ICMS-ST taxable quantity when it is by SRF Statutory Retail Price (Pauta)',
    	format => '',
    	read_only => '',
    		},
    'purchase_unit_pis_cofinsfactor' => {
    	datatype => 'double',
    	base_name => 'purchaseUnitPisCofinsfactor',
    	description => 'factor to convert purchase quantity to PIS/COFINS taxable quantity when it is by SRF Statutory Retail Price (Pauta)',
    	format => '',
    	read_only => '',
    		},
    'first_use' => {
    	datatype => 'boolean',
    	base_name => 'firstUse',
    	description => 'When the product is new, and will be retail, firt time that it exit it is subject to IPI',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'company_id' => 'UUID',
    'code' => 'string',
    'agast' => 'string',
    'description' => 'string',
    'seal_code' => 'string',
    'n_fci' => 'string',
    'is_icms_st_substitute' => 'boolean',
    'source' => 'string',
    'product_type' => 'string',
    'manufacturer_equivalent' => 'boolean',
    'appropriate_ip_icredit_when_in_going' => 'boolean',
    'usually_appropriate_piscofins_credit' => 'boolean',
    'is_pis_cofins_estimated_credit' => 'boolean',
    'piscofins_revenue_type' => 'string',
    'icms_base_discount_for_mono_phase_social_contr' => 'double',
    'cean' => 'string',
    'nve' => 'string',
    'sales_unit' => 'string',
    'sales_unit_ip_ifactor' => 'double',
    'sales_unit_icmsfactor' => 'double',
    'sales_unit_icms_stfactor' => 'double',
    'sales_unit_pis_cofinsfactor' => 'double',
    'purchase_unit' => 'string',
    'purchase_unit_ip_ifactor' => 'double',
    'purchase_unit_icmsfactor' => 'double',
    'purchase_unit_icms_stfactor' => 'double',
    'purchase_unit_pis_cofinsfactor' => 'double',
    'first_use' => 'boolean'
} );

__PACKAGE__->attribute_map( {
    'company_id' => 'companyId',
    'code' => 'code',
    'agast' => 'agast',
    'description' => 'description',
    'seal_code' => 'sealCode',
    'n_fci' => 'nFCI',
    'is_icms_st_substitute' => 'isIcmsStSubstitute',
    'source' => 'source',
    'product_type' => 'productType',
    'manufacturer_equivalent' => 'manufacturerEquivalent',
    'appropriate_ip_icredit_when_in_going' => 'appropriateIPIcreditWhenInGoing',
    'usually_appropriate_piscofins_credit' => 'usuallyAppropriatePISCOFINSCredit',
    'is_pis_cofins_estimated_credit' => 'isPisCofinsEstimatedCredit',
    'piscofins_revenue_type' => 'piscofinsRevenueType',
    'icms_base_discount_for_mono_phase_social_contr' => 'icmsBaseDiscountForMonoPhaseSocialContr',
    'cean' => 'cean',
    'nve' => 'nve',
    'sales_unit' => 'salesUnit',
    'sales_unit_ip_ifactor' => 'salesUnitIPIfactor',
    'sales_unit_icmsfactor' => 'salesUnitIcmsfactor',
    'sales_unit_icms_stfactor' => 'salesUnitIcmsStfactor',
    'sales_unit_pis_cofinsfactor' => 'salesUnitPisCofinsfactor',
    'purchase_unit' => 'purchaseUnit',
    'purchase_unit_ip_ifactor' => 'purchaseUnitIPIfactor',
    'purchase_unit_icmsfactor' => 'purchaseUnitIcmsfactor',
    'purchase_unit_icms_stfactor' => 'purchaseUnitIcmsStfactor',
    'purchase_unit_pis_cofinsfactor' => 'purchaseUnitPisCofinsfactor',
    'first_use' => 'firstUse'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
