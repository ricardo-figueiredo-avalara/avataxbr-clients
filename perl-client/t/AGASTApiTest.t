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

use_ok('WWW::SwaggerClient::AGASTApi');

my $api = WWW::SwaggerClient::AGASTApi->new();
isa_ok($api, 'WWW::SwaggerClient::AGASTApi');

#
# agasts_code_get test
#
{
    my $code = undef; # replace NULL with a proper value
    my $result = $api->agasts_code_get(code => $code);
}

#
# create_agast test
#
{
    my $body = undef; # replace NULL with a proper value
    my $result = $api->create_agast(body => $body);
}

#
# delete_agast test
#
{
    my $code = undef; # replace NULL with a proper value
    my $result = $api->delete_agast(code => $code);
}

#
# get_agast_list test
#
{
    my $text = undef; # replace NULL with a proper value
    my $result = $api->get_agast_list(text => $text);
}

#
# update_agast test
#
{
    my $code = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->update_agast(code => $code, body => $body);
}


1;
