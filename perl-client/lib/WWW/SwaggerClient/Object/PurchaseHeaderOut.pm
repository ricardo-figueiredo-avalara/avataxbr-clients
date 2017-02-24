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
package WWW::SwaggerClient::Object::PurchaseHeaderOut;

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
                                  class => 'PurchaseHeaderOut',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'account_id' => {
    	datatype => 'string',
    	base_name => 'accountId',
    	description => 'This string is a UUID issued by Avalara to identify the Avalara account that owns the company identified by the companyCode on the next line.',
    	format => '',
    	read_only => '',
    		},
    'company_code' => {
    	datatype => 'string',
    	base_name => 'companyCode',
    	description => 'This string is a code maintained by the client application to uniquely identify the company for which this transaction is being recorded. It is unique within the context of an Account. It will be limited to 60 characters when creating a Company',
    	format => '',
    	read_only => '',
    		},
    'transaction_type' => {
    	datatype => 'string',
    	base_name => 'transactionType',
    	description => 'This string indicates the type of transaction for which tax should be calculated. - &#39;Sale&#39; - &#39;Purchase&#39; - &#39;Payment&#39; - &#39;Receipt&#39; ',
    	format => '',
    	read_only => '',
    		},
    'document_code' => {
    	datatype => 'string',
    	base_name => 'documentCode',
    	description => 'This string is a code maintained by the client application to uniquely identify a document in the client&#39;s systems. It will typically be an invoice number, sales order, receipt number, returned merchandise authorization number, etc. When has this field, the transaction will be stored',
    	format => '',
    	read_only => '',
    		},
    'currency' => {
    	datatype => 'string',
    	base_name => 'currency',
    	description => 'currency code / transactions must be in Brazilian Reais \&quot;BRL\&quot;',
    	format => '',
    	read_only => '',
    		},
    'transaction_date' => {
    	datatype => 'DateTime',
    	base_name => 'transactionDate',
    	description => 'This string is the transaction date in ISO 8601 format (which may be different from the date the tax calculation is performed)',
    	format => '',
    	read_only => '',
    		},
    'tax_calculation_date' => {
    	datatype => 'DateTime',
    	base_name => 'taxCalculationDate',
    	description => 'accrual date, This string is the date, in ISO 8601 format, on which tax is to be calculated for this transaction (normally tax is calculated on the date the transaction is performed as captured in the transactionDate field). This is useful for layaways and other deferred transactions.',
    	format => '',
    	read_only => '',
    		},
    'company_location' => {
    	datatype => 'string',
    	base_name => 'companyLocation',
    	description => 'This string contains a previously configured company code which may also have codes needed for tax return purposes. These codes are maintained through the customer portal. Main company address identity',
    	format => '',
    	read_only => '',
    		},
    'vendor_code' => {
    	datatype => 'string',
    	base_name => 'vendorCode',
    	description => 'This string is a code maintained by the client application to uniquely identify the party with whom the company (identified by companyCode) is transacting. It is unique within the context of an Account.',
    	format => '',
    	read_only => '',
    		},
    'purchase_order_number' => {
    	datatype => 'string',
    	base_name => 'purchaseOrderNumber',
    	description => 'The number of Purchase Order',
    	format => '',
    	read_only => '',
    		},
    'entity' => {
    	datatype => 'PurchaseEntity',
    	base_name => 'entity',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'payment' => {
    	datatype => 'PurchaseHeaderOutPayment',
    	base_name => 'payment',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'taxes_config' => {
    	datatype => 'PurchaseTaxesConfig',
    	base_name => 'taxesConfig',
    	description => '',
    	format => '',
    	read_only => '',
    		},
    'default_locations' => {
    	datatype => 'PurchaseDefaultLocations',
    	base_name => 'defaultLocations',
    	description => '',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'account_id' => 'string',
    'company_code' => 'string',
    'transaction_type' => 'string',
    'document_code' => 'string',
    'currency' => 'string',
    'transaction_date' => 'DateTime',
    'tax_calculation_date' => 'DateTime',
    'company_location' => 'string',
    'vendor_code' => 'string',
    'purchase_order_number' => 'string',
    'entity' => 'PurchaseEntity',
    'payment' => 'PurchaseHeaderOutPayment',
    'taxes_config' => 'PurchaseTaxesConfig',
    'default_locations' => 'PurchaseDefaultLocations'
} );

__PACKAGE__->attribute_map( {
    'account_id' => 'accountId',
    'company_code' => 'companyCode',
    'transaction_type' => 'transactionType',
    'document_code' => 'documentCode',
    'currency' => 'currency',
    'transaction_date' => 'transactionDate',
    'tax_calculation_date' => 'taxCalculationDate',
    'company_location' => 'companyLocation',
    'vendor_code' => 'vendorCode',
    'purchase_order_number' => 'purchaseOrderNumber',
    'entity' => 'entity',
    'payment' => 'payment',
    'taxes_config' => 'taxesConfig',
    'default_locations' => 'defaultLocations'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
