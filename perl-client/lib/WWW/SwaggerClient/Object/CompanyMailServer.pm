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
package WWW::SwaggerClient::Object::CompanyMailServer;

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
                                  class => 'CompanyMailServer',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'user' => {
    	datatype => 'string',
    	base_name => 'user',
    	description => 'User for login on email server',
    	format => '',
    	read_only => '',
    		},
    'password' => {
    	datatype => 'string',
    	base_name => 'password',
    	description => 'Password to login on email server',
    	format => '',
    	read_only => '',
    		},
    'smtp_address' => {
    	datatype => 'string',
    	base_name => 'smtpAddress',
    	description => 'smtp address to email server',
    	format => '',
    	read_only => '',
    		},
    'port' => {
    	datatype => 'int',
    	base_name => 'port',
    	description => 'port',
    	format => '',
    	read_only => '',
    		},
    'email_from' => {
    	datatype => 'string',
    	base_name => 'emailFrom',
    	description => 'email address to identify the sender e-mail, to send a XML and DANFE',
    	format => '',
    	read_only => '',
    		},
    'protocol' => {
    	datatype => 'string',
    	base_name => 'protocol',
    	description => 'protocol SSL or TLS',
    	format => '',
    	read_only => '',
    		},
    'templatemessage_to_email' => {
    	datatype => 'string',
    	base_name => 'templatemessageToEmail',
    	description => 'Message to add to email body',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'user' => 'string',
    'password' => 'string',
    'smtp_address' => 'string',
    'port' => 'int',
    'email_from' => 'string',
    'protocol' => 'string',
    'templatemessage_to_email' => 'string'
} );

__PACKAGE__->attribute_map( {
    'user' => 'user',
    'password' => 'password',
    'smtp_address' => 'smtpAddress',
    'port' => 'port',
    'email_from' => 'emailFrom',
    'protocol' => 'protocol',
    'templatemessage_to_email' => 'templatemessageToEmail'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
