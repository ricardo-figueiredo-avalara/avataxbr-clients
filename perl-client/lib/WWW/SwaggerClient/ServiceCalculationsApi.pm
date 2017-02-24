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
package WWW::SwaggerClient::ServiceCalculationsApi;

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
# calculations_account_account_id_company_company_code_transaction_type_document_code_get
#
# Retrieve transactions
# 
# @param string $authorization Bearer {auth} (required)
# @param UUID $account_id Account ID (required)
# @param string $company_code Company Code (required)
# @param string $transaction_type Transaction Type (sale, purchase, receipts or payment) (required)
# @param string $document_code Document Code (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'account_id' => {
        data_type => 'UUID',
        description => 'Account ID',
        required => '1',
    },
    'company_code' => {
        data_type => 'string',
        description => 'Company Code',
        required => '1',
    },
    'transaction_type' => {
        data_type => 'string',
        description => 'Transaction Type (sale, purchase, receipts or payment)',
        required => '1',
    },
    'document_code' => {
        data_type => 'string',
        description => 'Document Code',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'calculations_account_account_id_company_company_code_transaction_type_document_code_get' } = { 
    	summary => 'Retrieve transactions',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub calculations_account_account_id_company_company_code_transaction_type_document_code_get {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_get");
    }

    # verify the required parameter 'account_id' is set
    unless (exists $args{'account_id'}) {
      croak("Missing the required parameter 'account_id' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_get");
    }

    # verify the required parameter 'company_code' is set
    unless (exists $args{'company_code'}) {
      croak("Missing the required parameter 'company_code' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_get");
    }

    # verify the required parameter 'transaction_type' is set
    unless (exists $args{'transaction_type'}) {
      croak("Missing the required parameter 'transaction_type' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_get");
    }

    # verify the required parameter 'document_code' is set
    unless (exists $args{'document_code'}) {
      croak("Missing the required parameter 'document_code' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_get");
    }

    # parse inputs
    my $_resource_path = '/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}';
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
    if ( exists $args{'account_id'}) {
        my $_base_variable = "{" . "accountId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'account_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'company_code'}) {
        my $_base_variable = "{" . "companyCode" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'company_code'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'transaction_type'}) {
        my $_base_variable = "{" . "transactionType" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'transaction_type'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'document_code'}) {
        my $_base_variable = "{" . "documentCode" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'document_code'});
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
# calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post
#
# Promote a calculation to transaction
# 
# @param string $authorization Bearer {auth} (required)
# @param UUID $account_id Account ID (required)
# @param string $company_code Company Code (required)
# @param string $transaction_type Transaction Type (sale, purchase, receipts or payment) (required)
# @param string $document_code Document Code (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'account_id' => {
        data_type => 'UUID',
        description => 'Account ID',
        required => '1',
    },
    'company_code' => {
        data_type => 'string',
        description => 'Company Code',
        required => '1',
    },
    'transaction_type' => {
        data_type => 'string',
        description => 'Transaction Type (sale, purchase, receipts or payment)',
        required => '1',
    },
    'document_code' => {
        data_type => 'string',
        description => 'Document Code',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post' } = { 
    	summary => 'Promote a calculation to transaction',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post");
    }

    # verify the required parameter 'account_id' is set
    unless (exists $args{'account_id'}) {
      croak("Missing the required parameter 'account_id' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post");
    }

    # verify the required parameter 'company_code' is set
    unless (exists $args{'company_code'}) {
      croak("Missing the required parameter 'company_code' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post");
    }

    # verify the required parameter 'transaction_type' is set
    unless (exists $args{'transaction_type'}) {
      croak("Missing the required parameter 'transaction_type' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post");
    }

    # verify the required parameter 'document_code' is set
    unless (exists $args{'document_code'}) {
      croak("Missing the required parameter 'document_code' when calling calculations_account_account_id_company_company_code_transaction_type_document_code_transactions_post");
    }

    # parse inputs
    my $_resource_path = '/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions';
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

    # path params
    if ( exists $args{'account_id'}) {
        my $_base_variable = "{" . "accountId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'account_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'company_code'}) {
        my $_base_variable = "{" . "companyCode" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'company_code'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'transaction_type'}) {
        my $_base_variable = "{" . "transactionType" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'transaction_type'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'document_code'}) {
        my $_base_variable = "{" . "documentCode" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'document_code'});
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
# calculations_account_account_id_company_company_code_transaction_type_get
#
# Retrieve transactions
# 
# @param string $authorization Bearer {auth} (required)
# @param UUID $account_id Account ID (required)
# @param string $company_code Company Code (required)
# @param string $transaction_type Transaction Type (sale, purchase, receipts or payment) (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'account_id' => {
        data_type => 'UUID',
        description => 'Account ID',
        required => '1',
    },
    'company_code' => {
        data_type => 'string',
        description => 'Company Code',
        required => '1',
    },
    'transaction_type' => {
        data_type => 'string',
        description => 'Transaction Type (sale, purchase, receipts or payment)',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'calculations_account_account_id_company_company_code_transaction_type_get' } = { 
    	summary => 'Retrieve transactions',
        params => $params,
        returns => undef,
        };
}
# @return void
#
sub calculations_account_account_id_company_company_code_transaction_type_get {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling calculations_account_account_id_company_company_code_transaction_type_get");
    }

    # verify the required parameter 'account_id' is set
    unless (exists $args{'account_id'}) {
      croak("Missing the required parameter 'account_id' when calling calculations_account_account_id_company_company_code_transaction_type_get");
    }

    # verify the required parameter 'company_code' is set
    unless (exists $args{'company_code'}) {
      croak("Missing the required parameter 'company_code' when calling calculations_account_account_id_company_company_code_transaction_type_get");
    }

    # verify the required parameter 'transaction_type' is set
    unless (exists $args{'transaction_type'}) {
      croak("Missing the required parameter 'transaction_type' when calling calculations_account_account_id_company_company_code_transaction_type_get");
    }

    # parse inputs
    my $_resource_path = '/calculations/account/{accountId}/company/{companyCode}/{transactionType}';
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
    if ( exists $args{'account_id'}) {
        my $_base_variable = "{" . "accountId" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'account_id'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'company_code'}) {
        my $_base_variable = "{" . "companyCode" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'company_code'});
        $_resource_path =~ s/$_base_variable/$_base_value/g;
    }

    # path params
    if ( exists $args{'transaction_type'}) {
        my $_base_variable = "{" . "transactionType" . "}";
        my $_base_value = $self->{api_client}->to_path_value($args{'transaction_type'});
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
# calculationsservice_payment_post
#
# Calculation Method
# 
# @param string $authorization Bearer {auth} (required)
# @param PaymentTransactionIn $body Transaction Message (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'body' => {
        data_type => 'PaymentTransactionIn',
        description => 'Transaction Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'calculationsservice_payment_post' } = { 
    	summary => 'Calculation Method',
        params => $params,
        returns => 'PaymentTransactionOut',
        };
}
# @return PaymentTransactionOut
#
sub calculationsservice_payment_post {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling calculationsservice_payment_post");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling calculationsservice_payment_post");
    }

    # parse inputs
    my $_resource_path = '/calculations?service-payment';
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
    my $_response_object = $self->{api_client}->deserialize('PaymentTransactionOut', $response);
    return $_response_object;
}

#
# calculationsservice_purchase_post
#
# Calculation Method
# 
# @param string $authorization Bearer {auth} (required)
# @param PurchaseTransactionIn $body Transaction Message (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'body' => {
        data_type => 'PurchaseTransactionIn',
        description => 'Transaction Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'calculationsservice_purchase_post' } = { 
    	summary => 'Calculation Method',
        params => $params,
        returns => 'PurchaseTransactionOut',
        };
}
# @return PurchaseTransactionOut
#
sub calculationsservice_purchase_post {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling calculationsservice_purchase_post");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling calculationsservice_purchase_post");
    }

    # parse inputs
    my $_resource_path = '/calculations?service-purchase';
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
    my $_response_object = $self->{api_client}->deserialize('PurchaseTransactionOut', $response);
    return $_response_object;
}

#
# calculationsservice_receipt_post
#
# Calculation Method
# 
# @param string $authorization Bearer {auth} (required)
# @param ReceiptTransactionIn $body Transaction Message (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'body' => {
        data_type => 'ReceiptTransactionIn',
        description => 'Transaction Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'calculationsservice_receipt_post' } = { 
    	summary => 'Calculation Method',
        params => $params,
        returns => 'ReceiptTransactionOut',
        };
}
# @return ReceiptTransactionOut
#
sub calculationsservice_receipt_post {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling calculationsservice_receipt_post");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling calculationsservice_receipt_post");
    }

    # parse inputs
    my $_resource_path = '/calculations?service-receipt';
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
    my $_response_object = $self->{api_client}->deserialize('ReceiptTransactionOut', $response);
    return $_response_object;
}

#
# calculationsservice_sales_post
#
# Calculation Method
# 
# @param string $authorization Bearer {auth} (required)
# @param SalesTransactionIn $body Transaction Message (required)
{
    my $params = {
    'authorization' => {
        data_type => 'string',
        description => 'Bearer {auth}',
        required => '1',
    },
    'body' => {
        data_type => 'SalesTransactionIn',
        description => 'Transaction Message',
        required => '1',
    },
    };
    __PACKAGE__->method_documentation->{ 'calculationsservice_sales_post' } = { 
    	summary => 'Calculation Method',
        params => $params,
        returns => 'SalesTransactionOut',
        };
}
# @return SalesTransactionOut
#
sub calculationsservice_sales_post {
    my ($self, %args) = @_;

    # verify the required parameter 'authorization' is set
    unless (exists $args{'authorization'}) {
      croak("Missing the required parameter 'authorization' when calling calculationsservice_sales_post");
    }

    # verify the required parameter 'body' is set
    unless (exists $args{'body'}) {
      croak("Missing the required parameter 'body' when calling calculationsservice_sales_post");
    }

    # parse inputs
    my $_resource_path = '/calculations?service-sales';
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
    my $_response_object = $self->{api_client}->deserialize('SalesTransactionOut', $response);
    return $_response_object;
}

1;
