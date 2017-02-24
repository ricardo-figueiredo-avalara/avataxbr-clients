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
package WWW::SwaggerClient::Object::SalesTaxesConfig;

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
                                  class => 'SalesTaxesConfig',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'accruable_cofins_taxation' => {
    	datatype => 'string',
    	base_name => 'accruableCOFINSTaxation',
    	description => 'There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings. - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE ',
    	format => '',
    	read_only => '',
    		},
    'accruable_csll_taxation' => {
    	datatype => 'string',
    	base_name => 'accruableCSLLTaxation',
    	description => 'There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be CSLL exempt.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - T TAXABLE - E EXEMPT ',
    	format => '',
    	read_only => '',
    		},
    'accruable_pis_taxation' => {
    	datatype => 'string',
    	base_name => 'accruablePISTaxation',
    	description => 'There are cases where both Seller, Buyer and items are taxable but a special situation still exists that forces the transaction to be exempt specially for PIS and COFINS.  This attribute will allow users to identify such scenarios and trigger the exemption in spite of all other settings.  - &#39;T&#39; # TAXABLE - &#39;N&#39; # NOT TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;S&#39; # SPECIFIC RATE ',
    	format => '',
    	read_only => '',
    		},
    'accruable_cofins_exemp_code_taxation' => {
    	datatype => 'string',
    	base_name => 'accruableCOFINSExempCodeTaxation',
    	description => 'This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption',
    	format => '',
    	read_only => '',
    		},
    'accruable_pis_exemp_code_taxation' => {
    	datatype => 'string',
    	base_name => 'accruablePISExempCodeTaxation',
    	description => 'This is a code available by Receita Federal for reason of the exemption, When Code is 999 the User system need send the custom reason to Exemption',
    	format => '',
    	read_only => '',
    		},
    'withholding_cofins' => {
    	datatype => 'boolean',
    	base_name => 'withholdingCOFINS',
    	description => 'Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.',
    	format => '',
    	read_only => '',
    		},
    'withholding_csll' => {
    	datatype => 'boolean',
    	base_name => 'withholdingCSLL',
    	description => 'Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.',
    	format => '',
    	read_only => '',
    		},
    'withholding_irrf' => {
    	datatype => 'boolean',
    	base_name => 'withholdingIRRF',
    	description => 'Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.',
    	format => '',
    	read_only => '',
    		},
    'withholding_pis' => {
    	datatype => 'boolean',
    	base_name => 'withholdingPIS',
    	description => 'Support Buyer Tax Liability identifier for Federal Withholding Taxes. Each buyer may be subject/liable to withhold the following taxes independent to one another. The seller must be able to inform which Tax impacts the transaction based on a direct equivalency in the service item accrual. i.e. (The service item must be taxed by a given tax and the buyer must liable for the same tax withholding in order for the transaction to be taxable). To differentiate from the accrued taxes under the same acronyms the withholding taxes are followed by WH (this is a convention created for the sake of understanding and communicating the requirements. If false spite of all other settings.',
    	format => '',
    	read_only => '',
    		},
    'withhold_irrf_exempt_reason_taxation' => {
    	datatype => 'string',
    	base_name => 'withholdIRRFExemptReasonTaxation',
    	description => 'When property withholdingIRRF is false is mandatory inform the reason',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'accruable_cofins_taxation' => 'string',
    'accruable_csll_taxation' => 'string',
    'accruable_pis_taxation' => 'string',
    'accruable_cofins_exemp_code_taxation' => 'string',
    'accruable_pis_exemp_code_taxation' => 'string',
    'withholding_cofins' => 'boolean',
    'withholding_csll' => 'boolean',
    'withholding_irrf' => 'boolean',
    'withholding_pis' => 'boolean',
    'withhold_irrf_exempt_reason_taxation' => 'string'
} );

__PACKAGE__->attribute_map( {
    'accruable_cofins_taxation' => 'accruableCOFINSTaxation',
    'accruable_csll_taxation' => 'accruableCSLLTaxation',
    'accruable_pis_taxation' => 'accruablePISTaxation',
    'accruable_cofins_exemp_code_taxation' => 'accruableCOFINSExempCodeTaxation',
    'accruable_pis_exemp_code_taxation' => 'accruablePISExempCodeTaxation',
    'withholding_cofins' => 'withholdingCOFINS',
    'withholding_csll' => 'withholdingCSLL',
    'withholding_irrf' => 'withholdingIRRF',
    'withholding_pis' => 'withholdingPIS',
    'withhold_irrf_exempt_reason_taxation' => 'withholdIRRFExemptReasonTaxation'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
