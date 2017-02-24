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

use_ok('WWW::SwaggerClient::CompanyItemGoodsApi');

my $api = WWW::SwaggerClient::CompanyItemGoodsApi->new();
isa_ok($api, 'WWW::SwaggerClient::CompanyItemGoodsApi');

#
# companies_company_id_items_code_change_code_put test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $goods = undef; # replace NULL with a proper value
    my $service = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_items_code_change_code_put(company_id => $company_id, code => $code, body => $body, goods => $goods, service => $service);
}

#
# companies_company_id_items_codegoods_get test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $avalara_product_type = undef; # replace NULL with a proper value
    my $agast = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_items_codegoods_get(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type, agast => $agast);
}

#
# companies_company_id_itemsgoods_get test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $avalara_product_type = undef; # replace NULL with a proper value
    my $x_pagination_limit = undef; # replace NULL with a proper value
    my $x_pagination_current_page = undef; # replace NULL with a proper value
    my $x_pagination_sort = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $agast = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_itemsgoods_get(company_id => $company_id, avalara_product_type => $avalara_product_type, x_pagination_limit => $x_pagination_limit, x_pagination_current_page => $x_pagination_current_page, x_pagination_sort => $x_pagination_sort, code => $code, agast => $agast);
}

#
# create_item test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $avalara_product_type = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->create_item(company_id => $company_id, avalara_product_type => $avalara_product_type, body => $body);
}

#
# delete_item test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $avalara_product_type = undef; # replace NULL with a proper value
    my $result = $api->delete_item(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type);
}

#
# update_item test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $code = undef; # replace NULL with a proper value
    my $avalara_product_type = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->update_item(company_id => $company_id, code => $code, avalara_product_type => $avalara_product_type, body => $body);
}


1;
