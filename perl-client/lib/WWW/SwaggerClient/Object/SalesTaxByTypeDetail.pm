=begin comment

BR16 - API

This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by the swagger code generator program. 
# Do not edit the class manually.
# Ref: https://github.com/swagger-api/swagger-codegen
#
package WWW::SwaggerClient::Object::SalesTaxByTypeDetail;

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

BR16 - API

This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

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
                                  class => 'SalesTaxByTypeDetail',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'location_type' => {
    	datatype => 'string',
    	base_name => 'locationType',
    	description => 'This string captures the applicable location type. Location used for calc. Buyer or Seller',
    	format => '',
    	read_only => '',
    		},
    'jurisdiction_name' => {
    	datatype => 'string',
    	base_name => 'jurisdictionName',
    	description => 'Jurisdiction used for calctax amount',
    	format => '',
    	read_only => '',
    		},
    'jurisdiction_type' => {
    	datatype => 'string',
    	base_name => 'jurisdictionType',
    	description => 'Type of jurisdiction - &#39;city&#39; - &#39;state&#39; - &#39;country&#39; ',
    	format => '',
    	read_only => '',
    		},
    'tax_type' => {
    	datatype => 'string',
    	base_name => 'taxType',
    	description => 'Tax identificator - &#39;aproxtribCity&#39; - &#39;aproxtribFed&#39; - &#39;pis&#39; - &#39;pisRf&#39; - &#39;cofins&#39; - &#39;cofinsRf&#39; - &#39;csll&#39; - &#39;csllRf&#39; - &#39;irrf&#39; - &#39;inss&#39; - &#39;inssRf&#39; - &#39;iss&#39; - &#39;issRf&#39; - &#39;irpj&#39; ',
    	format => '',
    	read_only => '',
    		},
    'rate_type' => {
    	datatype => 'string',
    	base_name => 'rateType',
    	description => 'Name of configuration rate',
    	format => '',
    	read_only => '',
    		},
    'scenario' => {
    	datatype => 'string',
    	base_name => 'scenario',
    	description => 'This string captures the transaction scenario used to calculate the tax for this tax type. Scenarios are specific to the tax type. This field provides information about how the tax engine interpreted the transaction information that was passed in.',
    	format => '',
    	read_only => '',
    		},
    'subtotal_taxable' => {
    	datatype => 'double',
    	base_name => 'subtotalTaxable',
    	description => 'This decimal captures how much of the lineAmount was taxable by this tax, calc base',
    	format => '',
    	read_only => '',
    		},
    'subtotal_exempt' => {
    	datatype => 'double',
    	base_name => 'subtotalExempt',
    	description => 'This decimal captures how much of the lineAmount was non-taxed. This is simply the line amount minus the taxable.',
    	format => '',
    	read_only => '',
    		},
    'rate' => {
    	datatype => 'double',
    	base_name => 'rate',
    	description => 'This decimal captures the tax rate for this tax.3.00 (3%)',
    	format => '',
    	read_only => '',
    		},
    'tax' => {
    	datatype => 'double',
    	base_name => 'tax',
    	description => 'This decimal captures how much of the lineAmount was taxable by this tax',
    	format => '',
    	read_only => '',
    		},
    'exemption_code' => {
    	datatype => 'string',
    	base_name => 'exemptionCode',
    	description => 'This string is required if is exempt',
    	format => '',
    	read_only => '',
    		},
    'significant_locations' => {
    	datatype => 'ARRAY[string]',
    	base_name => 'significantLocations',
    	description => 'This element captures the list of locations that contributed to the tax determination. for BR16 Service is Buyer and Seller Address',
    	format => '',
    	read_only => '',
    		},
    'tax_rule_type' => {
    	datatype => 'string',
    	base_name => 'taxRuleType',
    	description => 'This string with type of rule - &#39;SELLER&#39; - &#39;BUYER&#39; - &#39;TRANSACTION&#39; - &#39;ITEM&#39; - &#39;TAX&#39; ',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'location_type' => 'string',
    'jurisdiction_name' => 'string',
    'jurisdiction_type' => 'string',
    'tax_type' => 'string',
    'rate_type' => 'string',
    'scenario' => 'string',
    'subtotal_taxable' => 'double',
    'subtotal_exempt' => 'double',
    'rate' => 'double',
    'tax' => 'double',
    'exemption_code' => 'string',
    'significant_locations' => 'ARRAY[string]',
    'tax_rule_type' => 'string'
} );

__PACKAGE__->attribute_map( {
    'location_type' => 'locationType',
    'jurisdiction_name' => 'jurisdictionName',
    'jurisdiction_type' => 'jurisdictionType',
    'tax_type' => 'taxType',
    'rate_type' => 'rateType',
    'scenario' => 'scenario',
    'subtotal_taxable' => 'subtotalTaxable',
    'subtotal_exempt' => 'subtotalExempt',
    'rate' => 'rate',
    'tax' => 'tax',
    'exemption_code' => 'exemptionCode',
    'significant_locations' => 'significantLocations',
    'tax_rule_type' => 'taxRuleType'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
