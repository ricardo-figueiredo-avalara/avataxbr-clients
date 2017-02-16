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

import * as models from './models';

export interface AgastCodeType {
    /**
     * - 'NCM' - 'NBS' - 'LC116' - 'SERVICE UNREGULATED' 
     */
    code?: number;

    name?: AgastCodeType.NameEnum;

}
export namespace AgastCodeType {
    export enum NameEnum {
        NCM = <any> 'NCM',
        NBS = <any> 'NBS',
        LC116 = <any> 'LC116',
        SERVICEUNREGULATED = <any> 'SERVICE UNREGULATED'
    }
}
