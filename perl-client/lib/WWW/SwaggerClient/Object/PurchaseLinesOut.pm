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
package WWW::SwaggerClient::Object::PurchaseLinesOut;

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
                                  class => 'PurchaseLinesOut',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'line_code' => {
    	datatype => 'int',
    	base_name => 'lineCode',
    	description => 'This string is a unique identifier for this line in the transaction',
    	format => '',
    	read_only => '',
    		},
    'item_code' => {
    	datatype => 'string',
    	base_name => 'itemCode',
    	description => 'This string is a code maintained by the client application to uniquely identify a product or service. It will likely be a SKU and is required for SST states.',
    	format => '',
    	read_only => '',
    		},
    'number_of_items' => {
    	datatype => 'double',
    	base_name => 'numberOfItems',
    	description => 'This decimal captures the number of individual items or units represented by this line. Digits after the decimal point are optional. This should always be positive. Quantity, default 1',
    	format => '',
    	read_only => '',
    		},
    'line_amount' => {
    	datatype => 'double',
    	base_name => 'lineAmount',
    	description => 'This decimal captures the total cost of this line. In its simplest form lineAmount &#x3D; (item price * numberOfItems).',
    	format => '',
    	read_only => '',
    		},
    'item_description' => {
    	datatype => 'string',
    	base_name => 'itemDescription',
    	description => 'This string captures the description of the item represented by this line, will be used LC 116',
    	format => '',
    	read_only => '',
    		},
    'line_taxed_discount' => {
    	datatype => 'double',
    	base_name => 'lineTaxedDiscount',
    	description => 'Conditional discount',
    	format => '',
    	read_only => '',
    		},
    'line_untaxed_discount' => {
    	datatype => 'double',
    	base_name => 'lineUntaxedDiscount',
    	description => 'Unconditional discount',
    	format => '',
    	read_only => '',
    		},
    'use_type' => {
    	datatype => 'string',
    	base_name => 'useType',
    	description => 'Type of entity use associated with this line - &#39;resale&#39; - &#39;production&#39; - &#39;use or consumption&#39; - &#39;fixed assets&#39; ',
    	format => '',
    	read_only => '',
    		},
    'tax_deductions' => {
    	datatype => 'SalesLinesOutTaxDeductions',
    	base_name => 'taxDeductions',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'avalara_goods_and_services_type' => {
    	datatype => 'string',
    	base_name => 'avalaraGoodsAndServicesType',
    	description => 'AGAST CODE for itemCode',
    	format => '',
    	read_only => '',
    		},
    'line_net_value' => {
    	datatype => 'double',
    	base_name => 'lineNetValue',
    	description => 'This decimal captures the value of lineAmount - lineTaxedDiscount - sum of withholding.',
    	format => '',
    	read_only => '',
    		},
    'calculated_tax' => {
    	datatype => 'PurchaseCalculatedTax',
    	base_name => 'calculatedTax',
    	description => '',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'line_code' => 'int',
    'item_code' => 'string',
    'number_of_items' => 'double',
    'line_amount' => 'double',
    'item_description' => 'string',
    'line_taxed_discount' => 'double',
    'line_untaxed_discount' => 'double',
    'use_type' => 'string',
    'tax_deductions' => 'SalesLinesOutTaxDeductions',
    'avalara_goods_and_services_type' => 'string',
    'line_net_value' => 'double',
    'calculated_tax' => 'PurchaseCalculatedTax'
} );

__PACKAGE__->attribute_map( {
    'line_code' => 'lineCode',
    'item_code' => 'itemCode',
    'number_of_items' => 'numberOfItems',
    'line_amount' => 'lineAmount',
    'item_description' => 'itemDescription',
    'line_taxed_discount' => 'lineTaxedDiscount',
    'line_untaxed_discount' => 'lineUntaxedDiscount',
    'use_type' => 'useType',
    'tax_deductions' => 'taxDeductions',
    'avalara_goods_and_services_type' => 'avalaraGoodsAndServicesType',
    'line_net_value' => 'lineNetValue',
    'calculated_tax' => 'calculatedTax'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
