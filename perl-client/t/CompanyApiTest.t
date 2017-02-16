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

use_ok('WWW::SwaggerClient::CompanyApi');

my $api = WWW::SwaggerClient::CompanyApi->new();
isa_ok($api, 'WWW::SwaggerClient::CompanyApi');

#
# companies_get test
#
{
    my $result = $api->companies_get();
}

#
# create_company test
#
{
    my $body = undef; # replace NULL with a proper value
    my $result = $api->create_company(body => $body);
}

#
# delete_account_company test
#
{
    my $account_id = undef; # replace NULL with a proper value
    my $company_id = undef; # replace NULL with a proper value
    my $result = $api->delete_account_company(account_id => $account_id, company_id => $company_id);
}

#
# delete_company test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $company_id2 = undef; # replace NULL with a proper value
    my $result = $api->delete_company(company_id => $company_id, company_id2 => $company_id2);
}

#
# info_company test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $result = $api->info_company(company_id => $company_id);
}

#
# update_company test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->update_company(company_id => $company_id, body => $body);
}


1;
