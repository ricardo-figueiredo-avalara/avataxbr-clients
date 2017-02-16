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
package WWW::SwaggerClient::Object::LineForGoodsDi;

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
                                  class => 'LineForGoodsDi',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'customs_value' => {
    	datatype => 'double',
    	base_name => 'customsValue',
    	description => 'customs value, valor aduaneiro (II Block of NFe)',
    	format => '',
    	read_only => '',
    		},
    'di_number' => {
    	datatype => 'string',
    	base_name => 'diNumber',
    	description => 'Import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)',
    	format => '',
    	read_only => '',
    		},
    'register_date_di' => {
    	datatype => 'DateTime',
    	base_name => 'registerDateDI',
    	description => 'Register date of import declaration number, DI/DSI/DA/DRI-E (DI/DSI/DA/DRI-E)',
    	format => '',
    	read_only => '',
    		},
    'clearance_site' => {
    	datatype => 'string',
    	base_name => 'clearanceSite',
    	description => 'Clerance Site Local do desembaraço aduaneiro ',
    	format => '',
    	read_only => '',
    		},
    'clearance_state' => {
    	datatype => 'StateEnum',
    	base_name => 'clearanceState',
    	description => 'Clerance Site State Estado onde ocorrreu o desembaraço aduaneiro ',
    	format => '',
    	read_only => '',
    		},
    'clearance_date' => {
    	datatype => 'DateTime',
    	base_name => 'clearanceDate',
    	description => 'Clerance date',
    	format => '',
    	read_only => '',
    		},
    'transport_di_type' => {
    	datatype => 'string',
    	base_name => 'transportDIType',
    	description => '- &#39;1&#39; # Maritima - &#39;2&#39; # Fluvial - &#39;3&#39; # Lacustre - &#39;4&#39; # Aerea - &#39;5&#39; # Postal - &#39;6&#39; # Ferroviaria - &#39;7&#39; # Rodoviaria - &#39;8&#39; # Conduto - &#39;9&#39; # Meios Proprios - &#39;10&#39; # Entrada/Saida Ficta ',
    	format => '',
    	read_only => '',
    		},
    'afrmm_value' => {
    	datatype => 'double',
    	base_name => 'afrmmValue',
    	description => 'Aditional amount to freight to renew merchant marine, This decimal 13 integers and 2 decimals [Valor Adicional ao frete para renovação de marinha mercante] ',
    	format => '',
    	read_only => '',
    		},
    'intermediate_type' => {
    	datatype => 'string',
    	base_name => 'intermediateType',
    	description => '- &#39;1&#39; # On One&#39;s Own [1-por conta propria] - &#39;2&#39; # On Behalf And Order [2-por conta e ordem] - &#39;3&#39; # Order [3-encomenda] ',
    	format => '',
    	read_only => '',
    		},
    'buyer_federal_tax_id' => {
    	datatype => 'string',
    	base_name => 'buyerFederalTaxID',
    	description => 'Buyer federal tax id CNPJ do comprador ou encomendante ',
    	format => '',
    	read_only => '',
    		},
    'buyer_state' => {
    	datatype => 'StateEnum',
    	base_name => 'buyerState',
    	description => 'Buyer sate Estado do comprador ou encomendante ',
    	format => '',
    	read_only => '',
    		},
    'exporter_code' => {
    	datatype => 'string',
    	base_name => 'exporterCode',
    	description => 'Exporter code',
    	format => '',
    	read_only => '',
    		},
    'adi' => {
    	datatype => 'ARRAY[LineForGoodsAdi]',
    	base_name => 'adi',
    	description => 'aditional import declaration',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'customs_value' => 'double',
    'di_number' => 'string',
    'register_date_di' => 'DateTime',
    'clearance_site' => 'string',
    'clearance_state' => 'StateEnum',
    'clearance_date' => 'DateTime',
    'transport_di_type' => 'string',
    'afrmm_value' => 'double',
    'intermediate_type' => 'string',
    'buyer_federal_tax_id' => 'string',
    'buyer_state' => 'StateEnum',
    'exporter_code' => 'string',
    'adi' => 'ARRAY[LineForGoodsAdi]'
} );

__PACKAGE__->attribute_map( {
    'customs_value' => 'customsValue',
    'di_number' => 'diNumber',
    'register_date_di' => 'registerDateDI',
    'clearance_site' => 'clearanceSite',
    'clearance_state' => 'clearanceState',
    'clearance_date' => 'clearanceDate',
    'transport_di_type' => 'transportDIType',
    'afrmm_value' => 'afrmmValue',
    'intermediate_type' => 'intermediateType',
    'buyer_federal_tax_id' => 'buyerFederalTaxID',
    'buyer_state' => 'buyerState',
    'exporter_code' => 'exporterCode',
    'adi' => 'adi'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
