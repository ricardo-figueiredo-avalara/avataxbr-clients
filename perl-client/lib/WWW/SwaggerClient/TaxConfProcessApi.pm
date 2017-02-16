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
package WWW::SwaggerClient::TaxConfProcessApi;

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
# create_process
#
# create a new Process Type configuration
# 
# @param ProcessScenario $taxconfprocess The pet JSON you want to post (required)
{
    my $params = {
    'taxconfprocess' => {
        data_type => 'ProcessScenario',
        description => 'The pet JSON you want to post',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_process' } = { 
    	summary => 'create a new Process Type configuration',
        params => $params,
        returns => 'InlineResponse201',
        };
}
# @return InlineResponse201
#
sub create_process {
    my ($self, %args) = @_;

    # verify the required parameter 'taxconfprocess' is set
    unless (exists $args{'taxconfprocess'}) {
      croak("Missing the required parameter 'taxconfprocess' when calling create_process");
    }

    # parse inputs
    my $_resource_path = '/taxconf/process';
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

    my $_body_data;
    # body params
    if ( exists $args{'taxconfprocess'}) {
        $_body_data = $args{'taxconfprocess'};
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
    my $_response_object = $self->{api_client}->deserialize('InlineResponse201', $response);
    return $_response_object;
}

#
# delete_process
#
# disable a Process.
# 
# @param string $code Process Code (required)
{
    my $params = {
    'code' => {
        data_type => 'string',
        description => 'Process Code',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'delete_process' } = { 
    	summary => 'disable a Process.',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub delete_process {
    my ($self, %args) = @_;

    # verify the required parameter 'code' is set
    unless (exists $args{'code'}) {
      croak("Missing the required parameter 'code' when calling delete_process");
    }

    # parse inputs
    my $_resource_path = '/taxconf/process/{code}';
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

    # path params
    if ( exists $args{'code'}) {
        my $_base_variable = "{" . "code" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'code'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

#
# get_process
#
# get Process information.
# 
# @param string $code Process Code (required)
{
    my $params = {
    'code' => {
        data_type => 'string',
        description => 'Process Code',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_process' } = { 
    	summary => 'get Process information.',
        params => $params,
        returns => 'ProcessScenario',
        };
}
# @return ProcessScenario
#
sub get_process {
    my ($self, %args) = @_;

    # verify the required parameter 'code' is set
    unless (exists $args{'code'}) {
      croak("Missing the required parameter 'code' when calling get_process");
    }

    # parse inputs
    my $_resource_path = '/taxconf/process/{code}';
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

    # path params
    if ( exists $args{'code'}) {
        my $_base_variable = "{" . "code" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'code'});
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
    my $_response_object = $self->{api_client}->deserialize('ProcessScenario', $response);
    return $_response_object;
}

#
# get_process_list
#
# retrive list of Process.
# 
# @param string $account_id filter the configuration by accountID, if not informed, only the standard configuration will be returned  (optional)
# @param DateTime $date When informed return valid version configuration for this date  (optional)
# @param boolean $inactive return the inactive versions too  (optional)
{
    my $params = {
    'account_id' => {
        data_type => 'string',
        description => 'filter the configuration by accountID, if not informed, only the standard configuration will be returned ',
        required => '0',
    },
    'date' => {
        data_type => 'DateTime',
        description => 'When informed return valid version configuration for this date ',
        required => '0',
    },
    'inactive' => {
        data_type => 'boolean',
        description => 'return the inactive versions too ',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'get_process_list' } = { 
    	summary => 'retrive list of Process.',
        params => $params,
        returns => 'ARRAY[ProcessScenario]',
        };
}
# @return ARRAY[ProcessScenario]
#
sub get_process_list {
    my ($self, %args) = @_;

    # parse inputs
    my $_resource_path = '/taxconf/process';
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

    # query params
    if ( exists $args{'account_id'}) {
        $query_params->{'accountId'} = $self->{api_client}->to_query_value($args{'account_id'});
    }

    # query params
    if ( exists $args{'date'}) {
        $query_params->{'date'} = $self->{api_client}->to_query_value($args{'date'});
    }

    # query params
    if ( exists $args{'inactive'}) {
        $query_params->{'inactive'} = $self->{api_client}->to_query_value($args{'inactive'});
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
    my $_response_object = $self->{api_client}->deserialize('ARRAY[ProcessScenario]', $response);
    return $_response_object;
}

#
# update_process
#
# update a Process Type configuration
# 
# @param string $code Process Code (required)
# @param ProcessScenario $taxconfprocess The pet JSON you want to post (required)
{
    my $params = {
    'code' => {
        data_type => 'string',
        description => 'Process Code',
        required => '1',
    },
    'taxconfprocess' => {
        data_type => 'ProcessScenario',
        description => 'The pet JSON you want to post',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_process' } = { 
    	summary => 'update a Process Type configuration',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub update_process {
    my ($self, %args) = @_;

    # verify the required parameter 'code' is set
    unless (exists $args{'code'}) {
      croak("Missing the required parameter 'code' when calling update_process");
    }

    # verify the required parameter 'taxconfprocess' is set
    unless (exists $args{'taxconfprocess'}) {
      croak("Missing the required parameter 'taxconfprocess' when calling update_process");
    }

    # parse inputs
    my $_resource_path = '/taxconf/process/{code}';
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

    # path params
    if ( exists $args{'code'}) {
        my $_base_variable = "{" . "code" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'code'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    my $_body_data;
    # body params
    if ( exists $args{'taxconfprocess'}) {
        $_body_data = $args{'taxconfprocess'};
    }

    # authentication setting, if any
    my $auth_settings = [qw()];

    # make the API Call
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

1;
