=begin comment

BR16 - API

This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts

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

use_ok('WWW::SwaggerClient::GoodsTransactionsApi');

my $api = WWW::SwaggerClient::GoodsTransactionsApi->new();
isa_ok($api, 'WWW::SwaggerClient::GoodsTransactionsApi');

#
# transactionsgoods_purchase_post test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->transactionsgoods_purchase_post(authorization => $authorization, body => $body);
}

#
# transactionsgoods_sales_post test
#
{
    my $authorization = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->transactionsgoods_sales_post(authorization => $authorization, body => $body);
}


1;
