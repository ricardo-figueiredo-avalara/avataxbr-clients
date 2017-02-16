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
package WWW::SwaggerClient::CompanyItemCPOMServiceApi;

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
# companies_company_id_items_code_cpom_city_code_get
#
# 
# 
# @param UUID $company_id Company ID (required)
# @param string $code Item Code (required)
# @param Number $city_code City Code (required)
{
    my $params = {
    'company_id' => {
        data_type => 'UUID',
        description => 'Company ID',
        required => '1',
    },
    'code' => {
        data_type => 'string',
        description => 'Item Code',
        required => '1',
    },
    'city_code' => {
        data_type => 'Number',
        description => 'City Code',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'companies_company_id_items_code_cpom_city_code_get' } = { 
    	summary => '',
        params => $params,
        returns => 'ItemCpom',
        };
}
# @return ItemCpom
#
sub companies_company_id_items_code_cpom_city_code_get {
    my ($self, %args) = @_;

    # verify the required parameter 'company_id' is set
    unless (exists $args{'company_id'}) {
      croak("Missing the required parameter 'company_id' when calling companies_company_id_items_code_cpom_city_code_get");
    }

    # verify the required parameter 'code' is set
    unless (exists $args{'code'}) {
      croak("Missing the required parameter 'code' when calling companies_company_id_items_code_cpom_city_code_get");
    }

    # verify the required parameter 'city_code' is set
    unless (exists $args{'city_code'}) {
      croak("Missing the required parameter 'city_code' when calling companies_company_id_items_code_cpom_city_code_get");
    }

    # parse inputs
    my $_resource_path = '/companies/{companyId}/items/{code}/cpom/{cityCode}';
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
    if ( exists $args{'company_id'}) {
        my $_base_variable = "{" . "companyId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'company_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'code'}) {
        my $_base_variable = "{" . "code" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'code'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'city_code'}) {
        my $_base_variable = "{" . "cityCode" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'city_code'});
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
    my $_response_object = $self->{api_client}->deserialize('ItemCpom', $response);
    return $_response_object;
}

#
# companies_company_id_items_code_cpom_get
#
# 
# 
# @param UUID $company_id Company ID (required)
# @param string $code Item Code (required)
# @param int $x_pagination_limit The per page limit. Currently set to 10 but subject to change at any time (max 100). (optional, default to 10)
# @param int $x_pagination_current_page The current page. Defaults to 1. (optional, default to 1)
# @param string $x_pagination_sort  (optional)
{
    my $params = {
    'company_id' => {
        data_type => 'UUID',
        description => 'Company ID',
        required => '1',
    },
    'code' => {
        data_type => 'string',
        description => 'Item Code',
        required => '1',
    },
    'x_pagination_limit' => {
        data_type => 'int',
        description => 'The per page limit. Currently set to 10 but subject to change at any time (max 100).',
        required => '0',
    },
    'x_pagination_current_page' => {
        data_type => 'int',
        description => 'The current page. Defaults to 1.',
        required => '0',
    },
    'x_pagination_sort' => {
        data_type => 'string',
        description => '',
        required => '0',
    },
    };
    __PACKAGE__->method_documentation->{ 'companies_company_id_items_code_cpom_get' } = { 
    	summary => '',
        params => $params,
        returns => 'ARRAY[ItemCpom]',
        };
}
# @return ARRAY[ItemCpom]
#
sub companies_company_id_items_code_cpom_get {
    my ($self, %args) = @_;

    # verify the required parameter 'company_id' is set
    unless (exists $args{'company_id'}) {
      croak("Missing the required parameter 'company_id' when calling companies_company_id_items_code_cpom_get");
    }

    # verify the required parameter 'code' is set
    unless (exists $args{'code'}) {
      croak("Missing the required parameter 'code' when calling companies_company_id_items_code_cpom_get");
    }

    # parse inputs
    my $_resource_path = '/companies/{companyId}/items/{code}/cpom';
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
    if ( exists $args{'x_pagination_limit'}) {
        $header_params->{'X-Pagination-Limit'} = $self->{api_client}->to_header_value($args{'x_pagination_limit'});
    }

    # header params
    if ( exists $args{'x_pagination_current_page'}) {
        $header_params->{'X-Pagination-Current-Page'} = $self->{api_client}->to_header_value($args{'x_pagination_current_page'});
    }

    # header params
    if ( exists $args{'x_pagination_sort'}) {
        $header_params->{'X-Pagination-Sort'} = $self->{api_client}->to_header_value($args{'x_pagination_sort'});
    }

    # path params
    if ( exists $args{'company_id'}) {
        my $_base_variable = "{" . "companyId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'company_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

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
    my $_response_object = $self->{api_client}->deserialize('ARRAY[ItemCpom]', $response);
    return $_response_object;
}

#
# create_item_cpom
#
# Create custom agast for one company
# 
# @param UUID $company_id Company ID (required)
# @param string $code Item Code (required)
# @param ItemCpom $body Transaction Message (required)
{
    my $params = {
    'company_id' => {
        data_type => 'UUID',
        description => 'Company ID',
        required => '1',
    },
    'code' => {
        data_type => 'string',
        description => 'Item Code',
        required => '1',
    },
    'body' => {
        data_type => 'ItemCpom',
        description => 'Transaction Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'create_item_cpom' } = { 
    	summary => 'Create custom agast for one company',
        params => $params,
        returns => 'InlineResponse201',
        };
}
# @return InlineResponse201
#
sub create_item_cpom {
    my ($self, %args) = @_;

    # verify the required parameter 'company_id' is set
    unless (exists $args{'company_id'}) {
      croak("Missing the required parameter 'company_id' when calling create_item_cpom");
    }

    # verify the required parameter 'code' is set
    unless (exists $args{'code'}) {
      croak("Missing the required parameter 'code' when calling create_item_cpom");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling create_item_cpom");
    }

    # parse inputs
    my $_resource_path = '/companies/{companyId}/items/{code}/cpom';
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

    # path params
    if ( exists $args{'company_id'}) {
        my $_base_variable = "{" . "companyId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'company_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'code'}) {
        my $_base_variable = "{" . "code" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'code'});
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
    my $_response_object = $self->{api_client}->deserialize('InlineResponse201', $response);
    return $_response_object;
}

#
# delete_item_cpom
#
# 
# 
# @param UUID $company_id Company ID (required)
# @param string $code Item Code (required)
# @param Number $city_code City Code (required)
{
    my $params = {
    'company_id' => {
        data_type => 'UUID',
        description => 'Company ID',
        required => '1',
    },
    'code' => {
        data_type => 'string',
        description => 'Item Code',
        required => '1',
    },
    'city_code' => {
        data_type => 'Number',
        description => 'City Code',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'delete_item_cpom' } = { 
    	summary => '',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub delete_item_cpom {
    my ($self, %args) = @_;

    # verify the required parameter 'company_id' is set
    unless (exists $args{'company_id'}) {
      croak("Missing the required parameter 'company_id' when calling delete_item_cpom");
    }

    # verify the required parameter 'code' is set
    unless (exists $args{'code'}) {
      croak("Missing the required parameter 'code' when calling delete_item_cpom");
    }

    # verify the required parameter 'city_code' is set
    unless (exists $args{'city_code'}) {
      croak("Missing the required parameter 'city_code' when calling delete_item_cpom");
    }

    # parse inputs
    my $_resource_path = '/companies/{companyId}/items/{code}/cpom/{cityCode}';
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
    if ( exists $args{'company_id'}) {
        my $_base_variable = "{" . "companyId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'company_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'code'}) {
        my $_base_variable = "{" . "code" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'code'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'city_code'}) {
        my $_base_variable = "{" . "cityCode" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'city_code'});
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
# update_item_cpom
#
# Update custom agast for one company
# 
# @param UUID $company_id Company ID (required)
# @param string $code Item Code (required)
# @param Number $city_code City Code (required)
# @param ItemCpom $body Transaction Message (required)
{
    my $params = {
    'company_id' => {
        data_type => 'UUID',
        description => 'Company ID',
        required => '1',
    },
    'code' => {
        data_type => 'string',
        description => 'Item Code',
        required => '1',
    },
    'city_code' => {
        data_type => 'Number',
        description => 'City Code',
        required => '1',
    },
    'body' => {
        data_type => 'ItemCpom',
        description => 'Transaction Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'update_item_cpom' } = { 
    	summary => 'Update custom agast for one company',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub update_item_cpom {
    my ($self, %args) = @_;

    # verify the required parameter 'company_id' is set
    unless (exists $args{'company_id'}) {
      croak("Missing the required parameter 'company_id' when calling update_item_cpom");
    }

    # verify the required parameter 'code' is set
    unless (exists $args{'code'}) {
      croak("Missing the required parameter 'code' when calling update_item_cpom");
    }

    # verify the required parameter 'city_code' is set
    unless (exists $args{'city_code'}) {
      croak("Missing the required parameter 'city_code' when calling update_item_cpom");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling update_item_cpom");
    }

    # parse inputs
    my $_resource_path = '/companies/{companyId}/items/{code}/cpom/{cityCode}';
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
    if ( exists $args{'company_id'}) {
        my $_base_variable = "{" . "companyId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'company_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'code'}) {
        my $_base_variable = "{" . "code" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'code'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'city_code'}) {
        my $_base_variable = "{" . "cityCode" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'city_code'});
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
    $self->{api_client}->call_api($_resource_path, $_method,
                                           $query_params, $form_params,
                                           $header_params, $_body_data, $auth_settings);
    return;
}

1;