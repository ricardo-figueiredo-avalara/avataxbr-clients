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
package WWW::SwaggerClient::GoodsTransactionsApi;

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
# transactionsgoods_purchase_post
#
# Transaction Method
# 
# @param string $authorization Bearer {auth} (required)
# @param TransactionForGoodsIn $body Transaction Message (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'body' => {
        data_type => 'TransactionForGoodsIn',
        description => 'Transaction Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'transactionsgoods_purchase_post' } = { 
    	summary => 'Transaction Method',
        params => $params,
        returns => 'TransactionForGoodsOut',
        };
}
# @return TransactionForGoodsOut
#
sub transactionsgoods_purchase_post {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling transactionsgoods_purchase_post");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling transactionsgoods_purchase_post");
    }

    # parse inputs
    my $_resource_path = '/transactions?goods-purchase';
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
    my $_response_object = $self->{api_client}->deserialize('TransactionForGoodsOut', $response);
    return $_response_object;
}

#
# transactionsgoods_sales_post
#
# Transaction Method
# 
# @param string $authorization Bearer {auth} (required)
# @param TransactionForGoodsIn $body Transaction Message (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'body' => {
        data_type => 'TransactionForGoodsIn',
        description => 'Transaction Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'transactionsgoods_sales_post' } = { 
    	summary => 'Transaction Method',
        params => $params,
        returns => 'TransactionForGoodsOut',
        };
}
# @return TransactionForGoodsOut
#
sub transactionsgoods_sales_post {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling transactionsgoods_sales_post");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling transactionsgoods_sales_post");
    }

    # parse inputs
    my $_resource_path = '/transactions?goods-sales';
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
    my $_response_object = $self->{api_client}->deserialize('TransactionForGoodsOut', $response);
    return $_response_object;
}

1;
