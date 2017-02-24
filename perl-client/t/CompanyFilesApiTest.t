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

use_ok('WWW::SwaggerClient::CompanyFilesApi');

my $api = WWW::SwaggerClient::CompanyFilesApi->new();
isa_ok($api, 'WWW::SwaggerClient::CompanyFilesApi');

#
# companies_company_id_nfse_certificate_delete test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $company_id2 = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_nfse_certificate_delete(company_id => $company_id, company_id2 => $company_id2);
}

#
# companies_company_id_nfse_certificate_get test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $company_id2 = undef; # replace NULL with a proper value
    my $peek = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_nfse_certificate_get(company_id => $company_id, company_id2 => $company_id2, peek => $peek);
}

#
# companies_company_id_nfse_certificate_post test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_nfse_certificate_post(company_id => $company_id, body => $body);
}

#
# companies_company_id_nfse_certificate_put test
#
{
    my $company_id = undef; # replace NULL with a proper value
    my $company_id2 = undef; # replace NULL with a proper value
    my $body = undef; # replace NULL with a proper value
    my $result = $api->companies_company_id_nfse_certificate_put(company_id => $company_id, company_id2 => $company_id2, body => $body);
}


1;
