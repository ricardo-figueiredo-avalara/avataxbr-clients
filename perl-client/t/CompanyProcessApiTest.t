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

use_ok('WWW::SwaggerClient::CompanyProcessApi');

my $api = WWW::SwaggerClient::CompanyProcessApi->new();
isa_ok($api, 'WWW::SwaggerClient::CompanyProcessApi');

#
# companies_company_id_process_code_get test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_process_code_get(company_id => $company_id, code => $code);
}

#
# companies_company_id_process_get test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $x_pagination_limit = undef; # replace NULL with a proper value
    my $x_pagination_current_page = undef; # replace NULL with a proper value
    my $x_pagination_sort = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_process_get(company_id => $company_id, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort);
}

#
# create_custom_process_scenario test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->create_custom_process_scenario(company_id => $company_id, body => $body);
}

#
# delete_custom_process_scenario test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $result = $api->delete_custom_process_scenario(company_id => $company_id, code => $code);
}

#
# update_custom_process_scenario test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->update_custom_process_scenario(company_id => $company_id, code => $code, body => $body);
}


1;
