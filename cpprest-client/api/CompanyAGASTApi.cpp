/**
 * AvaTax Brazil
 * The Avatax-Brazil API exposes the most commonly services available for interacting with the AvaTax-Brazil services, allowing calculation of taxes, issuing electronic invoice documents and modifying existing transactions when allowed by tax authorities.  This API is exclusively for use by business with a physical presence in Brazil.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


#include "CompanyAGASTApi.h"
#include "IHttpBody.h"
#include "JsonBody.h"
#include "MultipartFormData.h"

#include <unordered_set>

#include <boost/algorithm/string/replace.hpp>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

CompanyAGASTApi::CompanyAGASTApi( std::shared_ptr<ApiClient> apiClient )
    : m_ApiClient(apiClient)
{
}

CompanyAGASTApi::~CompanyAGASTApi()
{
}

pplx::task<std::shared_ptr<CustomAgast>> CompanyAGASTApi::companiesCompanyIdAgastsCodeGet(std::shared_ptr<UUID> companyId, utility::string_t code, utility::string_t parent)
{
    

    std::shared_ptr<ApiConfiguration> apiConfiguration( m_ApiClient->getConfiguration() );
    utility::string_t path = U("/companies/{companyId}/agasts/{code}");
    boost::replace_all(path, U("{") U("companyId") U("}"), ApiClient::parameterToString(companyId));
boost::replace_all(path, U("{") U("code") U("}"), ApiClient::parameterToString(code));

    std::map<utility::string_t, utility::string_t> queryParams;
    std::map<utility::string_t, utility::string_t> headerParams( apiConfiguration->getDefaultHeaders() );
    std::map<utility::string_t, utility::string_t> formParams;
    std::map<utility::string_t, std::shared_ptr<HttpContent>> fileParams;

    std::unordered_set<utility::string_t> responseHttpContentTypes;
    responseHttpContentTypes.insert( U("application/json") );

    utility::string_t responseHttpContentType;

    // use JSON if possible
    if ( responseHttpContentTypes.size() == 0 )
    {
        responseHttpContentType = U("application/json");
    }
    // JSON
    else if ( responseHttpContentTypes.find(U("application/json")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("application/json");
    }
    // multipart formdata
    else if( responseHttpContentTypes.find(U("multipart/form-data")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("multipart/form-data");
    }
    else
    {
        throw ApiException(400, U("CompanyAGASTApi->companiesCompanyIdAgastsCodeGet does not produce any supported media type"));
    }

    headerParams[U("Accept")] = responseHttpContentType;

    std::unordered_set<utility::string_t> consumeHttpContentTypes;
    consumeHttpContentTypes.insert( U("application/json") );

    
    {
        queryParams[U("parent")] = ApiClient::parameterToString(parent);
    }

    std::shared_ptr<IHttpBody> httpBody;
    utility::string_t requestHttpContentType;

    // use JSON if possible
    if ( consumeHttpContentTypes.size() == 0 || consumeHttpContentTypes.find(U("application/json")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("application/json");
    }
    // multipart formdata
    else if( consumeHttpContentTypes.find(U("multipart/form-data")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("multipart/form-data");
    }
    else
    {
        throw ApiException(415, U("CompanyAGASTApi->companiesCompanyIdAgastsCodeGet does not consume any supported media type"));
    }

    //Set the request content type in the header.
    headerParams[U("Content-Type")] = requestHttpContentType;


    return m_ApiClient->callApi(path, U("GET"), queryParams, httpBody, headerParams, formParams, fileParams, requestHttpContentType)
    .then([=](web::http::http_response response)
    {
        // 1xx - informational : OK
        // 2xx - successful       : OK
        // 3xx - redirection   : OK
        // 4xx - client error  : not OK
        // 5xx - client error  : not OK
        if (response.status_code() >= 400)
        {
            throw ApiException(response.status_code()
                , U("error calling companiesCompanyIdAgastsCodeGet: ") + response.reason_phrase()
                , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
        }

        // check response content type
        if(response.headers().has(U("Content-Type")))
        {
            utility::string_t contentType = response.headers()[U("Content-Type")];
            if( contentType.find(responseHttpContentType) == std::string::npos )
            {
                throw ApiException(500
                    , U("error calling companiesCompanyIdAgastsCodeGet: unexpected response type: ") + contentType
                    , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
            }
        }

        return response.extract_string();
    })
    .then([=](utility::string_t response)
    {
        std::shared_ptr<CustomAgast> result(new CustomAgast());

        if(responseHttpContentType == U("application/json"))
        {
            web::json::value json = web::json::value::parse(response);

            result->fromJson(json);
        }
        // else if(responseHttpContentType == U("multipart/form-data"))
        // {
        // TODO multipart response parsing
        // }
        else
        {
            throw ApiException(500
                , U("error calling findPetsByStatus: unsupported response type"));
        }

        return result;
    });
}
pplx::task<std::vector<std::shared_ptr<Inline_response_200_1>>> CompanyAGASTApi::companiesCompanyIdAgastsGet(std::shared_ptr<UUID> companyId, utility::string_t text, int32_t xPaginationLimit, int32_t xPaginationCurrentPage, utility::string_t xPaginationSort, utility::string_t agast, utility::string_t parent)
{
    

    std::shared_ptr<ApiConfiguration> apiConfiguration( m_ApiClient->getConfiguration() );
    utility::string_t path = U("/companies/{companyId}/agasts");
    boost::replace_all(path, U("{") U("companyId") U("}"), ApiClient::parameterToString(companyId));

    std::map<utility::string_t, utility::string_t> queryParams;
    std::map<utility::string_t, utility::string_t> headerParams( apiConfiguration->getDefaultHeaders() );
    std::map<utility::string_t, utility::string_t> formParams;
    std::map<utility::string_t, std::shared_ptr<HttpContent>> fileParams;

    std::unordered_set<utility::string_t> responseHttpContentTypes;
    responseHttpContentTypes.insert( U("application/json") );

    utility::string_t responseHttpContentType;

    // use JSON if possible
    if ( responseHttpContentTypes.size() == 0 )
    {
        responseHttpContentType = U("application/json");
    }
    // JSON
    else if ( responseHttpContentTypes.find(U("application/json")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("application/json");
    }
    // multipart formdata
    else if( responseHttpContentTypes.find(U("multipart/form-data")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("multipart/form-data");
    }
    else
    {
        throw ApiException(400, U("CompanyAGASTApi->companiesCompanyIdAgastsGet does not produce any supported media type"));
    }

    headerParams[U("Accept")] = responseHttpContentType;

    std::unordered_set<utility::string_t> consumeHttpContentTypes;
    consumeHttpContentTypes.insert( U("application/json") );

    
    {
        queryParams[U("text")] = ApiClient::parameterToString(text);
    }
    
    {
        headerParams[U("X-Pagination-Limit")] = ApiClient::parameterToString(xPaginationLimit);
    }
    
    {
        headerParams[U("X-Pagination-Current-Page")] = ApiClient::parameterToString(xPaginationCurrentPage);
    }
    
    {
        headerParams[U("X-Pagination-Sort")] = ApiClient::parameterToString(xPaginationSort);
    }
    
    {
        queryParams[U("agast")] = ApiClient::parameterToString(agast);
    }
    
    {
        queryParams[U("parent")] = ApiClient::parameterToString(parent);
    }

    std::shared_ptr<IHttpBody> httpBody;
    utility::string_t requestHttpContentType;

    // use JSON if possible
    if ( consumeHttpContentTypes.size() == 0 || consumeHttpContentTypes.find(U("application/json")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("application/json");
    }
    // multipart formdata
    else if( consumeHttpContentTypes.find(U("multipart/form-data")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("multipart/form-data");
    }
    else
    {
        throw ApiException(415, U("CompanyAGASTApi->companiesCompanyIdAgastsGet does not consume any supported media type"));
    }

    //Set the request content type in the header.
    headerParams[U("Content-Type")] = requestHttpContentType;


    return m_ApiClient->callApi(path, U("GET"), queryParams, httpBody, headerParams, formParams, fileParams, requestHttpContentType)
    .then([=](web::http::http_response response)
    {
        // 1xx - informational : OK
        // 2xx - successful       : OK
        // 3xx - redirection   : OK
        // 4xx - client error  : not OK
        // 5xx - client error  : not OK
        if (response.status_code() >= 400)
        {
            throw ApiException(response.status_code()
                , U("error calling companiesCompanyIdAgastsGet: ") + response.reason_phrase()
                , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
        }

        // check response content type
        if(response.headers().has(U("Content-Type")))
        {
            utility::string_t contentType = response.headers()[U("Content-Type")];
            if( contentType.find(responseHttpContentType) == std::string::npos )
            {
                throw ApiException(500
                    , U("error calling companiesCompanyIdAgastsGet: unexpected response type: ") + contentType
                    , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
            }
        }

        return response.extract_string();
    })
    .then([=](utility::string_t response)
    {
        std::vector<std::shared_ptr<Inline_response_200_1>> result;

        if(responseHttpContentType == U("application/json"))
        {
            web::json::value json = web::json::value::parse(response);

            for( auto& item : json.as_array() )
            {
                std::shared_ptr<Inline_response_200_1> itemObj(new Inline_response_200_1());
                itemObj->fromJson(item);
                result.push_back(itemObj);
                
            }
            
        }
        // else if(responseHttpContentType == U("multipart/form-data"))
        // {
        // TODO multipart response parsing
        // }
        else
        {
            throw ApiException(500
                , U("error calling findPetsByStatus: unsupported response type"));
        }

        return result;
    });
}
pplx::task<std::shared_ptr<Inline_response_201>> CompanyAGASTApi::createCustomAgast(std::shared_ptr<UUID> companyId, std::shared_ptr<CustomAgast> body, utility::string_t text)
{
    
    // verify the required parameter 'body' is set
    if (body == nullptr)
    {
        throw ApiException(400, U("Missing required parameter 'body' when calling CompanyAGASTApi->createCustomAgast"));
    }
    

    std::shared_ptr<ApiConfiguration> apiConfiguration( m_ApiClient->getConfiguration() );
    utility::string_t path = U("/companies/{companyId}/agasts");
    boost::replace_all(path, U("{") U("companyId") U("}"), ApiClient::parameterToString(companyId));

    std::map<utility::string_t, utility::string_t> queryParams;
    std::map<utility::string_t, utility::string_t> headerParams( apiConfiguration->getDefaultHeaders() );
    std::map<utility::string_t, utility::string_t> formParams;
    std::map<utility::string_t, std::shared_ptr<HttpContent>> fileParams;

    std::unordered_set<utility::string_t> responseHttpContentTypes;
    responseHttpContentTypes.insert( U("application/json") );

    utility::string_t responseHttpContentType;

    // use JSON if possible
    if ( responseHttpContentTypes.size() == 0 )
    {
        responseHttpContentType = U("application/json");
    }
    // JSON
    else if ( responseHttpContentTypes.find(U("application/json")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("application/json");
    }
    // multipart formdata
    else if( responseHttpContentTypes.find(U("multipart/form-data")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("multipart/form-data");
    }
    else
    {
        throw ApiException(400, U("CompanyAGASTApi->createCustomAgast does not produce any supported media type"));
    }

    headerParams[U("Accept")] = responseHttpContentType;

    std::unordered_set<utility::string_t> consumeHttpContentTypes;
    consumeHttpContentTypes.insert( U("application/json") );

    
    {
        queryParams[U("text")] = ApiClient::parameterToString(text);
    }

    std::shared_ptr<IHttpBody> httpBody;
    utility::string_t requestHttpContentType;

    // use JSON if possible
    if ( consumeHttpContentTypes.size() == 0 || consumeHttpContentTypes.find(U("application/json")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("application/json");
        web::json::value json;

        json = ModelBase::toJson(body);

        httpBody = std::shared_ptr<IHttpBody>( new JsonBody( json ) );
    }
    // multipart formdata
    else if( consumeHttpContentTypes.find(U("multipart/form-data")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("multipart/form-data");
        std::shared_ptr<MultipartFormData> multipart(new MultipartFormData);
                if(body.get())
        {
            body->toMultipart(multipart, U("body"));
        }

        httpBody = multipart;
        requestHttpContentType += U("; boundary=") + multipart->getBoundary();
    }
    else
    {
        throw ApiException(415, U("CompanyAGASTApi->createCustomAgast does not consume any supported media type"));
    }

    //Set the request content type in the header.
    headerParams[U("Content-Type")] = requestHttpContentType;


    return m_ApiClient->callApi(path, U("POST"), queryParams, httpBody, headerParams, formParams, fileParams, requestHttpContentType)
    .then([=](web::http::http_response response)
    {
        // 1xx - informational : OK
        // 2xx - successful       : OK
        // 3xx - redirection   : OK
        // 4xx - client error  : not OK
        // 5xx - client error  : not OK
        if (response.status_code() >= 400)
        {
            throw ApiException(response.status_code()
                , U("error calling createCustomAgast: ") + response.reason_phrase()
                , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
        }

        // check response content type
        if(response.headers().has(U("Content-Type")))
        {
            utility::string_t contentType = response.headers()[U("Content-Type")];
            if( contentType.find(responseHttpContentType) == std::string::npos )
            {
                throw ApiException(500
                    , U("error calling createCustomAgast: unexpected response type: ") + contentType
                    , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
            }
        }

        return response.extract_string();
    })
    .then([=](utility::string_t response)
    {
        std::shared_ptr<Inline_response_201> result(new Inline_response_201());

        if(responseHttpContentType == U("application/json"))
        {
            web::json::value json = web::json::value::parse(response);

            result->fromJson(json);
        }
        // else if(responseHttpContentType == U("multipart/form-data"))
        // {
        // TODO multipart response parsing
        // }
        else
        {
            throw ApiException(500
                , U("error calling findPetsByStatus: unsupported response type"));
        }

        return result;
    });
}
pplx::task<void> CompanyAGASTApi::deleteAgast(std::shared_ptr<UUID> companyId, utility::string_t code)
{
    

    std::shared_ptr<ApiConfiguration> apiConfiguration( m_ApiClient->getConfiguration() );
    utility::string_t path = U("/companies/{companyId}/agasts/{code}");
    boost::replace_all(path, U("{") U("companyId") U("}"), ApiClient::parameterToString(companyId));
boost::replace_all(path, U("{") U("code") U("}"), ApiClient::parameterToString(code));

    std::map<utility::string_t, utility::string_t> queryParams;
    std::map<utility::string_t, utility::string_t> headerParams( apiConfiguration->getDefaultHeaders() );
    std::map<utility::string_t, utility::string_t> formParams;
    std::map<utility::string_t, std::shared_ptr<HttpContent>> fileParams;

    std::unordered_set<utility::string_t> responseHttpContentTypes;
    responseHttpContentTypes.insert( U("application/json") );

    utility::string_t responseHttpContentType;

    // use JSON if possible
    if ( responseHttpContentTypes.size() == 0 )
    {
        responseHttpContentType = U("application/json");
    }
    // JSON
    else if ( responseHttpContentTypes.find(U("application/json")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("application/json");
    }
    // multipart formdata
    else if( responseHttpContentTypes.find(U("multipart/form-data")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("multipart/form-data");
    }
    else
    {
        throw ApiException(400, U("CompanyAGASTApi->deleteAgast does not produce any supported media type"));
    }

    headerParams[U("Accept")] = responseHttpContentType;

    std::unordered_set<utility::string_t> consumeHttpContentTypes;
    consumeHttpContentTypes.insert( U("application/json") );


    std::shared_ptr<IHttpBody> httpBody;
    utility::string_t requestHttpContentType;

    // use JSON if possible
    if ( consumeHttpContentTypes.size() == 0 || consumeHttpContentTypes.find(U("application/json")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("application/json");
    }
    // multipart formdata
    else if( consumeHttpContentTypes.find(U("multipart/form-data")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("multipart/form-data");
    }
    else
    {
        throw ApiException(415, U("CompanyAGASTApi->deleteAgast does not consume any supported media type"));
    }

    //Set the request content type in the header.
    headerParams[U("Content-Type")] = requestHttpContentType;


    return m_ApiClient->callApi(path, U("DELETE"), queryParams, httpBody, headerParams, formParams, fileParams, requestHttpContentType)
    .then([=](web::http::http_response response)
    {
        // 1xx - informational : OK
        // 2xx - successful       : OK
        // 3xx - redirection   : OK
        // 4xx - client error  : not OK
        // 5xx - client error  : not OK
        if (response.status_code() >= 400)
        {
            throw ApiException(response.status_code()
                , U("error calling deleteAgast: ") + response.reason_phrase()
                , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
        }

        // check response content type
        if(response.headers().has(U("Content-Type")))
        {
            utility::string_t contentType = response.headers()[U("Content-Type")];
            if( contentType.find(responseHttpContentType) == std::string::npos )
            {
                throw ApiException(500
                    , U("error calling deleteAgast: unexpected response type: ") + contentType
                    , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
            }
        }

        return response.extract_string();
    })
    .then([=](utility::string_t response)
    {
        return void();
    });
}
pplx::task<void> CompanyAGASTApi::updateCustomAgast(std::shared_ptr<UUID> companyId, utility::string_t code, std::shared_ptr<CustomAgast> body)
{
    
    // verify the required parameter 'body' is set
    if (body == nullptr)
    {
        throw ApiException(400, U("Missing required parameter 'body' when calling CompanyAGASTApi->updateCustomAgast"));
    }
    

    std::shared_ptr<ApiConfiguration> apiConfiguration( m_ApiClient->getConfiguration() );
    utility::string_t path = U("/companies/{companyId}/agasts/{code}");
    boost::replace_all(path, U("{") U("companyId") U("}"), ApiClient::parameterToString(companyId));
boost::replace_all(path, U("{") U("code") U("}"), ApiClient::parameterToString(code));

    std::map<utility::string_t, utility::string_t> queryParams;
    std::map<utility::string_t, utility::string_t> headerParams( apiConfiguration->getDefaultHeaders() );
    std::map<utility::string_t, utility::string_t> formParams;
    std::map<utility::string_t, std::shared_ptr<HttpContent>> fileParams;

    std::unordered_set<utility::string_t> responseHttpContentTypes;
    responseHttpContentTypes.insert( U("application/json") );

    utility::string_t responseHttpContentType;

    // use JSON if possible
    if ( responseHttpContentTypes.size() == 0 )
    {
        responseHttpContentType = U("application/json");
    }
    // JSON
    else if ( responseHttpContentTypes.find(U("application/json")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("application/json");
    }
    // multipart formdata
    else if( responseHttpContentTypes.find(U("multipart/form-data")) != responseHttpContentTypes.end() )
    {
        responseHttpContentType = U("multipart/form-data");
    }
    else
    {
        throw ApiException(400, U("CompanyAGASTApi->updateCustomAgast does not produce any supported media type"));
    }

    headerParams[U("Accept")] = responseHttpContentType;

    std::unordered_set<utility::string_t> consumeHttpContentTypes;
    consumeHttpContentTypes.insert( U("application/json") );


    std::shared_ptr<IHttpBody> httpBody;
    utility::string_t requestHttpContentType;

    // use JSON if possible
    if ( consumeHttpContentTypes.size() == 0 || consumeHttpContentTypes.find(U("application/json")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("application/json");
        web::json::value json;

        json = ModelBase::toJson(body);

        httpBody = std::shared_ptr<IHttpBody>( new JsonBody( json ) );
    }
    // multipart formdata
    else if( consumeHttpContentTypes.find(U("multipart/form-data")) != consumeHttpContentTypes.end() )
    {
        requestHttpContentType = U("multipart/form-data");
        std::shared_ptr<MultipartFormData> multipart(new MultipartFormData);
                if(body.get())
        {
            body->toMultipart(multipart, U("body"));
        }

        httpBody = multipart;
        requestHttpContentType += U("; boundary=") + multipart->getBoundary();
    }
    else
    {
        throw ApiException(415, U("CompanyAGASTApi->updateCustomAgast does not consume any supported media type"));
    }

    //Set the request content type in the header.
    headerParams[U("Content-Type")] = requestHttpContentType;


    return m_ApiClient->callApi(path, U("PUT"), queryParams, httpBody, headerParams, formParams, fileParams, requestHttpContentType)
    .then([=](web::http::http_response response)
    {
        // 1xx - informational : OK
        // 2xx - successful       : OK
        // 3xx - redirection   : OK
        // 4xx - client error  : not OK
        // 5xx - client error  : not OK
        if (response.status_code() >= 400)
        {
            throw ApiException(response.status_code()
                , U("error calling updateCustomAgast: ") + response.reason_phrase()
                , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
        }

        // check response content type
        if(response.headers().has(U("Content-Type")))
        {
            utility::string_t contentType = response.headers()[U("Content-Type")];
            if( contentType.find(responseHttpContentType) == std::string::npos )
            {
                throw ApiException(500
                    , U("error calling updateCustomAgast: unexpected response type: ") + contentType
                    , std::make_shared<std::stringstream>(response.extract_utf8string(true).get()));
            }
        }

        return response.extract_string();
    })
    .then([=](utility::string_t response)
    {
        return void();
    });
}

}
}
}
}

