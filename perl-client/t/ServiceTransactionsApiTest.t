=begin comment

AvaTax Brazil

The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end comment

=cut

#
# NOTE: This class is auto generated by Swagger Codegen
# Please update the test cases below to test the API endpoints.
# Ref: https://github.com/swagger-api/swagger-codegen
#
use Test::More tests => 1; #TODO update number of test cases
use Test::Exception;

use lib 'lib';
use strict;
use warnings;

use_ok('WWW::SwaggerClient::ServiceTransactionsApi');

my $api = WWW::SwaggerClient::ServiceTransactionsApi->new();
isa_ok($api, 'WWW::SwaggerClient::ServiceTransactionsApi');

#
# transactions_account_account_id_company_company_code_transaction_type_document_code_get test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $account_id = undef; # replace NULL with a proper value
    my $company_code = undef; # replace NULL with a proper value
    my $transaction_type = undef; # replace NULL with a proper value
    my $document_code = undef; # replace NULL with a proper value
    my $result = $api->transactions_account_account_id_company_company_code_transaction_type_document_code_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code);
}

#
# transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $account_id = undef; # replace NULL with a proper value
    my $company_code = undef; # replace NULL with a proper value
    my $transaction_type = undef; # replace NULL with a proper value
    my $document_code = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->transactions_account_account_id_company_company_code_transaction_type_document_code_state_transitions_post(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type, document_code => $document_code, body => $body);
}

#
# transactions_account_account_id_company_company_code_transaction_type_get test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $account_id = undef; # replace NULL with a proper value
    my $company_code = undef; # replace NULL with a proper value
    my $transaction_type = undef; # replace NULL with a proper value
    my $result = $api->transactions_account_account_id_company_company_code_transaction_type_get(authorization => $authorization, account_id => $account_id, company_code => $company_code, transaction_type => $transaction_type);
}

#
# transactionsservice_payment_post test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->transactionsservice_payment_post(authorization => $authorization, body => $body);
}

#
# transactionsservice_purchase_post test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->transactionsservice_purchase_post(authorization => $authorization, body => $body);
}

#
# transactionsservice_receipt_post test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->transactionsservice_receipt_post(authorization => $authorization, body => $body);
}

#
# transactionsservice_sales_post test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->transactionsservice_sales_post(authorization => $authorization, body => $body);
}


1;
