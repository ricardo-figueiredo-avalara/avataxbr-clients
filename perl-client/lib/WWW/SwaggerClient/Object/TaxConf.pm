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
package WWW::SwaggerClient::Object::TaxConf;

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
                                  class => 'TaxConf',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'code' => {
    	datatype => 'string',
    	base_name => 'code',
    	description => 'main unique identificator',
    	format => '',
    	read_only => '',
    		},
    'stock_impact' => {
    	datatype => 'boolean',
    	base_name => 'stockImpact',
    	description => 'Inform that the process has inventory impact.',
    	format => '',
    	read_only => '',
    		},
    'financial_impact' => {
    	datatype => 'boolean',
    	base_name => 'financialImpact',
    	description => 'Inform that the process has financial impact.',
    	format => '',
    	read_only => '',
    		},
    'cst_ipi' => {
    	datatype => 'string',
    	base_name => 'cstIPI',
    	description => 'Inform if this process is subject to IPI taxation on output process - &#39;50&#39; # Saída Tributada - &#39;51&#39; # Saída Tributável com Alíquota Zero - &#39;52&#39; # Saída Isenta - &#39;53&#39; # Saída Não-Tributada - &#39;54&#39; # Saída Imune ',
    	format => '',
    	read_only => '',
    		},
    'ipi_legal_tax_class' => {
    	datatype => 'string',
    	base_name => 'ipiLegalTaxClass',
    	description => 'Legal tax classificação for IPI (enquadramento) When the processo has CST IPI 52 or 54, is mandatory inform Reason Code, see Anexo XIV - Código de Enquadramento Legal do IPI from  http://www.nfe.fazenda.gov.br/portal/exibirArquivo.aspx?conteudo&#x3D;mCnJajU4BKU&#x3D; ',
    	format => '',
    	read_only => '',
    		},
    'accruable_pis_taxation' => {
    	datatype => 'string',
    	base_name => 'accruablePISTaxation',
    	description => 'Inform if this item by nature is subject to PIS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE ',
    	format => '',
    	read_only => '',
    		},
    'pis_exempt_legal_reason_code' => {
    	datatype => 'string',
    	base_name => 'pisExemptLegalReasonCode',
    	description => 'When exempt, taxable with zero, suspended, not taxable, this field holds the official code number',
    	format => '',
    	read_only => '',
    		},
    'pis_exempt_legal_reason' => {
    	datatype => 'string',
    	base_name => 'pisExemptLegalReason',
    	description => 'When specifi reason, this field has the description',
    	format => '',
    	read_only => '',
    		},
    'accruable_cofins_taxation' => {
    	datatype => 'string',
    	base_name => 'accruableCOFINSTaxation',
    	description => 'Inform if this item by nature is subject to COFINS taxation or exempt - &#39;T&#39; # TAXABLE - &#39;Z&#39; # TAXABLE WITH RATE&#x3D;0.00 - &#39;E&#39; # EXEMPT - &#39;H&#39; # SUSPENDED - &#39;N&#39; # NO TAXABLE ',
    	format => '',
    	read_only => '',
    		},
    'cofins_exempt_legal_reason_code' => {
    	datatype => 'string',
    	base_name => 'cofinsExemptLegalReasonCode',
    	description => 'When exempt, taxable with zero, suspended, not taxable, this field holds the official code number',
    	format => '',
    	read_only => '',
    		},
    'cofins_exempt_legal_reason' => {
    	datatype => 'string',
    	base_name => 'cofinsExemptLegalReason',
    	description => 'When specifi reason, this field has the description',
    	format => '',
    	read_only => '',
    		},
    'allow_ip_icredit_when_in_going' => {
    	datatype => 'boolean',
    	base_name => 'allowIPIcreditWhenInGoing',
    	description => 'Inform that the process allow IPI credit to Input process',
    	format => '',
    	read_only => '',
    		},
    'icms_conf' => {
    	datatype => 'ARRAY[IcmsTaxConf]',
    	base_name => 'icmsConf',
    	description => 'the map key is state code',
    	format => '',
    	read_only => '',
    		},
});

__PACKAGE__->swagger_types( {
    'code' => 'string',
    'stock_impact' => 'boolean',
    'financial_impact' => 'boolean',
    'cst_ipi' => 'string',
    'ipi_legal_tax_class' => 'string',
    'accruable_pis_taxation' => 'string',
    'pis_exempt_legal_reason_code' => 'string',
    'pis_exempt_legal_reason' => 'string',
    'accruable_cofins_taxation' => 'string',
    'cofins_exempt_legal_reason_code' => 'string',
    'cofins_exempt_legal_reason' => 'string',
    'allow_ip_icredit_when_in_going' => 'boolean',
    'icms_conf' => 'ARRAY[IcmsTaxConf]'
} );

__PACKAGE__->attribute_map( {
    'code' => 'code',
    'stock_impact' => 'stockImpact',
    'financial_impact' => 'financialImpact',
    'cst_ipi' => 'cstIPI',
    'ipi_legal_tax_class' => 'ipiLegalTaxClass',
    'accruable_pis_taxation' => 'accruablePISTaxation',
    'pis_exempt_legal_reason_code' => 'pisExemptLegalReasonCode',
    'pis_exempt_legal_reason' => 'pisExemptLegalReason',
    'accruable_cofins_taxation' => 'accruableCOFINSTaxation',
    'cofins_exempt_legal_reason_code' => 'cofinsExemptLegalReasonCode',
    'cofins_exempt_legal_reason' => 'cofinsExemptLegalReason',
    'allow_ip_icredit_when_in_going' => 'allowIPIcreditWhenInGoing',
    'icms_conf' => 'icmsConf'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
