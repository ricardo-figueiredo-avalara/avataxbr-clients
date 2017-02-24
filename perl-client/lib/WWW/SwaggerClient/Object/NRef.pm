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
package WWW::SwaggerClient::Object::NRef;

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
#Referenced Invoices The invoice can be one of this types, - &#39;refNFe - Eletronic Invoice&#39; - &#39;refCTE - Transport Invoice&#39; - &#39;refECF - Reatail Cupom&#39; - &#39;refNF  - Invoice model 1 or 1A&#39; - &#39;refFarmerNF - farmer invoice&#39; 
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



__PACKAGE__->class_documentation({description => 'Referenced Invoices The invoice can be one of this types, - &#39;refNFe - Eletronic Invoice&#39; - &#39;refCTE - Transport Invoice&#39; - &#39;refECF - Reatail Cupom&#39; - &#39;refNF  - Invoice model 1 or 1A&#39; - &#39;refFarmerNF - farmer invoice&#39; ',
                                  class => 'NRef',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'type' => {
    	datatype => 'string',
    	base_name => 'type',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'ref_n_fe' => {
    	datatype => 'string',
    	base_name => 'refNFe',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'ref_c_te' => {
    	datatype => 'string',
    	base_name => 'refCTe',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'ref_ecf' => {
    	datatype => 'NRefRefECF',
    	base_name => 'refECF',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'ref_nf' => {
    	datatype => 'NRefRefNF',
    	base_name => 'refNF',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'ref_farmer_nf' => {
    	datatype => 'NRefRefFarmerNF',
    	base_name => 'refFarmerNF',
    	description => '',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'type' => 'string',
    'ref_n_fe' => 'string',
    'ref_c_te' => 'string',
    'ref_ecf' => 'NRefRefECF',
    'ref_nf' => 'NRefRefNF',
    'ref_farmer_nf' => 'NRefRefFarmerNF'
} );

__PACKAGE__->attribute_map( {
    'type' => 'type',
    'ref_n_fe' => 'refNFe',
    'ref_c_te' => 'refCTe',
    'ref_ecf' => 'refECF',
    'ref_nf' => 'refNF',
    'ref_farmer_nf' => 'refFarmerNF'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
