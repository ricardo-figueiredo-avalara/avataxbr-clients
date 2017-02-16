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
package WWW::SwaggerClient::InvoiceSEFAZApi;

require 5.6.0;
use strict;
use warnings;
use utf8; 
use Exporter;
use Carp qw( croak );
use Log::Any qw($log);

use WWW::SwaggerClient::ApiClient;
use WWW::SwaggerClient::Configuration;

use base "Class::Data::Inheritable";

__PACKAGE__->mk_classdata('method_documentation' => {});

sub new {
    my $class   = shift;
    my (%self) = (
        'api_client' => WWW::SwaggerClient::ApiClient->instance,
        @_
    );

    #my $self = {
    #    #api_client => $options->{api_client}
    #    api_client => $default_api_client
    #}; 

    bless \%self, $class;

}


#
# invoices_sefaz_delete
#
# Disable Range e-Invoice
# 
# @param string $authorization Bearer {auth} (required)
# @param SefazDisableRangeIn $body Disable Range e-Invoice (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'body' => {
        data_type => 'SefazDisableRangeIn',
        description => 'Disable Range e-Invoice',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'invoices_sefaz_delete' } = { 
    	summary => 'Disable Range e-Invoice',
        params => $params,
        returns => 'SefazInvoiceBasicStatus',
        };
}
# @return SefazInvoiceBasicStatus
#
sub invoices_sefaz_delete {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling invoices_sefaz_delete");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling invoices_sefaz_delete");
    }

    # parse inputs
    my $_resource_path = '/invoices/sefaz';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'body'}) {
        $_body_data = $args{'body'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('SefazInvoiceBasicStatus', $response);
    return $_response_object;
}

#
# invoices_sefaz_key_delete
#
# Cancel invoice
# 
# @param string $authorization Bearer {auth} (required)
# @param string $key Invoice Key (required)
# @param SefazItDeleteIn $body Cancel Message (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'key' => {
        data_type => 'string',
        description => 'Invoice Key',
        required => '1',
    },
    'body' => {
        data_type => 'SefazItDeleteIn',
        description => 'Cancel Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'invoices_sefaz_key_delete' } = { 
    	summary => 'Cancel invoice',
        params => $params,
        returns => 'SefazInvoiceBasicStatus',
        };
}
# @return SefazInvoiceBasicStatus
#
sub invoices_sefaz_key_delete {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling invoices_sefaz_key_delete");
    }

    # verify the required parameter 'key' is set
    unless (exists $args{'key'}) {
      croak("Missing the required parameter 'key' when calling invoices_sefaz_key_delete");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling invoices_sefaz_key_delete");
    }

    # parse inputs
    my $_resource_path = '/invoices/sefaz/{key}';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'DELETE';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # path params
    if ( exists $args{'key'}) {
        my $_base_variable = "{" . "key" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'key'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'body'}) {
        $_body_data = $args{'body'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('SefazInvoiceBasicStatus', $response);
    return $_response_object;
}

#
# invoices_sefaz_key_get
#
# Retrieve invoice
# 
# @param string $authorization Bearer {auth} (required)
# @param string $key Invoice Key (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'key' => {
        data_type => 'string',
        description => 'Invoice Key',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'invoices_sefaz_key_get' } = { 
    	summary => 'Retrieve invoice',
        params => $params,
        returns => 'SefazItGetOut',
        };
}
# @return SefazItGetOut
#
sub invoices_sefaz_key_get {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling invoices_sefaz_key_get");
    }

    # verify the required parameter 'key' is set
    unless (exists $args{'key'}) {
      croak("Missing the required parameter 'key' when calling invoices_sefaz_key_get");
    }

    # parse inputs
    my $_resource_path = '/invoices/sefaz/{key}';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # path params
    if ( exists $args{'key'}) {
        my $_base_variable = "{" . "key" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'key'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('SefazItGetOut', $response);
    return $_response_object;
}

#
# invoices_sefaz_key_lookup_get
#
# Retrieve invoice
# 
# @param string $authorization Bearer {auth} (required)
# @param string $key Invoice Key (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'key' => {
        data_type => 'string',
        description => 'Invoice Key',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'invoices_sefaz_key_lookup_get' } = { 
    	summary => 'Retrieve invoice',
        params => $params,
        returns => 'TransactionForSefazGoodsList',
        };
}
# @return TransactionForSefazGoodsList
#
sub invoices_sefaz_key_lookup_get {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling invoices_sefaz_key_lookup_get");
    }

    # verify the required parameter 'key' is set
    unless (exists $args{'key'}) {
      croak("Missing the required parameter 'key' when calling invoices_sefaz_key_lookup_get");
    }

    # parse inputs
    my $_resource_path = '/invoices/sefaz/{key}/lookup';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # path params
    if ( exists $args{'key'}) {
        my $_base_variable = "{" . "key" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'key'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('TransactionForSefazGoodsList', $response);
    return $_response_object;
}

#
# invoices_sefaz_key_put
#
# Fix Letter
# 
# @param string $authorization Bearer {auth} (required)
# @param string $key Invoice Key (required)
# @param SefazItPutIn $body Fix Message (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'key' => {
        data_type => 'string',
        description => 'Invoice Key',
        required => '1',
    },
    'body' => {
        data_type => 'SefazItPutIn',
        description => 'Fix Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'invoices_sefaz_key_put' } = { 
    	summary => 'Fix Letter',
        params => $params,
        returns => 'SefazInvoiceBasicStatus',
        };
}
# @return SefazInvoiceBasicStatus
#
sub invoices_sefaz_key_put {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling invoices_sefaz_key_put");
    }

    # verify the required parameter 'key' is set
    unless (exists $args{'key'}) {
      croak("Missing the required parameter 'key' when calling invoices_sefaz_key_put");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling invoices_sefaz_key_put");
    }

    # parse inputs
    my $_resource_path = '/invoices/sefaz/{key}';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'PUT';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    # path params
    if ( exists $args{'key'}) {
        my $_base_variable = "{" . "key" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'key'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'body'}) {
        $_body_data = $args{'body'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('SefazInvoiceBasicStatus', $response);
    return $_response_object;
}

#
# invoices_sefaz_post
#
# Send an e-Invoice
# 
# @param string $authorization Bearer {auth} (required)
# @param ARRAY[TransactionForSefazGoods] $body Invoices (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'body' => {
        data_type => 'ARRAY[TransactionForSefazGoods]',
        description => 'Invoices',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'invoices_sefaz_post' } = { 
    	summary => 'Send an e-Invoice',
        params => $params,
        returns => 'SefazPostOut',
        };
}
# @return SefazPostOut
#
sub invoices_sefaz_post {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling invoices_sefaz_post");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling invoices_sefaz_post");
    }

    # parse inputs
    my $_resource_path = '/invoices/sefaz';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'POST';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    my $_body_data;
    # body params
    if ( exists $args{'body'}) {
        $_body_data = $args{'body'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('SefazPostOut', $response);
    return $_response_object;
}

#
# invoices_sefaz_status_get
#
# Retrieve Status of SEFAZ Server
# 
# @param string $authorization Bearer {auth} (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'invoices_sefaz_status_get' } = { 
    	summary => 'Retrieve Status of SEFAZ Server',
        params => $params,
        returns => 'string',
        };
}
# @return string
#
sub invoices_sefaz_status_get {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling invoices_sefaz_status_get");
    }

    # parse inputs
    my $_resource_path = '/invoices/sefaz/status';
    $_resource_path =~ s/{format}/json/; # default format to json

    my $_method = 'GET';
    my $query_params = {};
    my $header_params = {};
    my $form_params = {};

    # 'Accept' and 'Content-Type' header
    my $_header_accept = $self->{api_client}->select_header_accept('application/json');
    if ($_header_accept) {
        $header_params->{'Accept'} = $_header_accept;
    }
    $header_params->{'Content-Type'} = $self->{api_client}->select_header_content_type('application/json');

    # header params
    if ( exists $args{'authorization'}) {
        $header_params->{'Authorization'} = $self->{api_client}->to_header_value($args{'authorization'});
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    my $response = $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    if (!$response) {
        return;
    }
    my $_response_object = $self->{api_client}->deserialize('string', $response);
    return $_response_object;
}

1;