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
package WWW::SwaggerClient::Object::Entity;

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
                                  class => 'Entity',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'name' => {
    	datatype => 'string',
    	base_name => 'name',
    	description => 'Entity name, official name (Razão Social)',
    	format => '',
    	read_only => '',
    		},
    'role' => {
    	datatype => 'string',
    	base_name => 'role',
    	description => '- &#39;transporter&#39; - &#39;sender&#39; # REMETENTE - &#39;dispatcher&#39; # EXPEDITOR - &#39;receiver&#39; # RECEIVER - &#39;addressee&#39; # DESTINATÁRIO - &#39;other&#39; # OUTRO ',
    	format => '',
    	read_only => '',
    		},
    'type' => {
    	datatype => 'EntityType',
    	base_name => 'type',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'federal_tax_id' => {
    	datatype => 'string',
    	base_name => 'federalTaxId',
    	description => 'CNPJ/CPF of Sales Buyer, if CPF pattern is &#39;[0-9]{11}&#39; if CNPJ pattern is &#39;[0-9]{14}&#39;',
    	format => '',
    	read_only => '',
    		},
    'city_tax_id' => {
    	datatype => 'string',
    	base_name => 'cityTaxId',
    	description => 'City Tax ID',
    	format => '',
    	read_only => '',
    		},
    'state_tax_id' => {
    	datatype => 'string',
    	base_name => 'stateTaxId',
    	description => 'State Tax ID',
    	format => '',
    	read_only => '',
    		},
    'suframa' => {
    	datatype => 'string',
    	base_name => 'suframa',
    	description => 'Suframa ID',
    	format => '',
    	read_only => '',
    		},
    'phone' => {
    	datatype => 'string',
    	base_name => 'phone',
    	description => 'Entity Phone',
    	format => '',
    	read_only => '',
    		},
    'tax_regime' => {
    	datatype => 'string',
    	base_name => 'taxRegime',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'email' => {
    	datatype => 'string',
    	base_name => 'email',
    	description => 'Entity Email',
    	format => '',
    	read_only => '',
    		},
    'subject_to_srf1234' => {
    	datatype => 'boolean',
    	base_name => 'subjectToSRF1234',
    	description => 'Companies subject to follow same rules of Government entities (Instrução Normativa: SRF1234)',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'name' => 'string',
    'role' => 'string',
    'type' => 'EntityType',
    'federal_tax_id' => 'string',
    'city_tax_id' => 'string',
    'state_tax_id' => 'string',
    'suframa' => 'string',
    'phone' => 'string',
    'tax_regime' => 'string',
    'email' => 'string',
    'subject_to_srf1234' => 'boolean'
} );

__PACKAGE__->attribute_map( {
    'name' => 'name',
    'role' => 'role',
    'type' => 'type',
    'federal_tax_id' => 'federalTaxId',
    'city_tax_id' => 'cityTaxId',
    'state_tax_id' => 'stateTaxId',
    'suframa' => 'suframa',
    'phone' => 'phone',
    'tax_regime' => 'taxRegime',
    'email' => 'email',
    'subject_to_srf1234' => 'subjectToSRF1234'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
