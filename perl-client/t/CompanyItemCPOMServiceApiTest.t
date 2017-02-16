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

use_ok('WWW::SwaggerClient::CompanyItemCPOMServiceApi');

my $api = WWW::SwaggerClient::CompanyItemCPOMServiceApi->new();
isa_ok($api, 'WWW::SwaggerClient::CompanyItemCPOMServiceApi');

#
# companies_company_id_items_code_cpom_city_code_get test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $city_code = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_items_code_cpom_city_code_get(company_id => $company_id, code => $code, city_code => $city_code);
}

#
# companies_company_id_items_code_cpom_get test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $x_pagination_limit = undef; # replace NULL with a proper value
    my $x_pagination_current_page = undef; # replace NULL with a proper value
    my $x_pagination_sort = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_items_code_cpom_get(company_id => $company_id, code => $code, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort);
}

#
# create_item_cpom test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->create_item_cpom(company_id => $company_id, code => $code, body => $body);
}

#
# delete_item_cpom test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $city_code = undef; # replace NULL with a proper value
    my $result = $api->delete_item_cpom(company_id => $company_id, code => $code, city_code => $city_code);
}

#
# update_item_cpom test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $city_code = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->update_item_cpom(company_id => $company_id, code => $code, city_code => $city_code, body => $body);
}


1;
