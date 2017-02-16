/**
 * BR16 - API
 * This documentation is about service accessories that will compose the product BR16, this services are essencial to maintenance and configuration of accounts
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

/// <reference path="api.d.ts" />

namespace API.Client {
    'use strict';

    export interface Medicine {
        "loteNumber": string;

        /**
         * This is a decimal type with 11 digits including 3 decimal positions.
         */
        "loteQuantity": number;

        "manufactotyDate": Date;

        "expirationDate": Date;

        /**
         * This is a decimal type with 15 digits including 2 decimal positions.  Max value to end user.
         */
        "maxValueToEndUser": number;

    }

}
