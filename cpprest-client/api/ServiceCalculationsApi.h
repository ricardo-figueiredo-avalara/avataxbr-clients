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

/*
 * ServiceCalculationsApi.h
 *
 * 
 */

#ifndef ServiceCalculationsApi_H_
#define ServiceCalculationsApi_H_


#include "ApiClient.h"

#include "Message.h"
#include "PaymentTransactionIn.h"
#include "PaymentTransactionOut.h"
#include "PurchaseTransactionIn.h"
#include "PurchaseTransactionOut.h"
#include "ReceiptTransactionIn.h"
#include "ReceiptTransactionOut.h"
#include "SalesTransactionIn.h"
#include "SalesTransactionOut.h"
#include "UUID.h"
#include "ValidationError.h"
#include <cpprest/details/basic_types.h>

namespace io {
namespace swagger {
namespace client {
namespace api {

using namespace io::swagger::client::model;

class  ServiceCalculationsApi
{
public:
    ServiceCalculationsApi( std::shared_ptr<ApiClient> apiClient );
    virtual ~ServiceCalculationsApi();
    /// <summary>
    /// Retrieve transactions
    /// </summary>
    /// <remarks>
    /// Retrieve a single transaction
    /// </remarks>
    /// <param name="authorization">Bearer {auth}</param>/// <param name="accountId">Account ID</param>/// <param name="companyCode">Company Code</param>/// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param>/// <param name="documentCode">Document Code</param>
    pplx::task<void> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(utility::string_t authorization, std::shared_ptr<UUID> accountId, utility::string_t companyCode, utility::string_t transactionType, utility::string_t documentCode);
    /// <summary>
    /// Promote a calculation to transaction
    /// </summary>
    /// <remarks>
    /// Promote a calculation to transaction
    /// </remarks>
    /// <param name="authorization">Bearer {auth}</param>/// <param name="accountId">Account ID</param>/// <param name="companyCode">Company Code</param>/// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param>/// <param name="documentCode">Document Code</param>
    pplx::task<void> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(utility::string_t authorization, std::shared_ptr<UUID> accountId, utility::string_t companyCode, utility::string_t transactionType, utility::string_t documentCode);
    /// <summary>
    /// Retrieve transactions
    /// </summary>
    /// <remarks>
    /// Retrieve a list of transactions
    /// </remarks>
    /// <param name="authorization">Bearer {auth}</param>/// <param name="accountId">Account ID</param>/// <param name="companyCode">Company Code</param>/// <param name="transactionType">Transaction Type (sale, purchase, receipts or payment)</param>
    pplx::task<void> calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(utility::string_t authorization, std::shared_ptr<UUID> accountId, utility::string_t companyCode, utility::string_t transactionType);
    /// <summary>
    /// Calculation Method
    /// </summary>
    /// <remarks>
    /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
    /// </remarks>
    /// <param name="authorization">Bearer {auth}</param>/// <param name="body">Transaction Message</param>
    pplx::task<std::shared_ptr<PaymentTransactionOut>> calculationsservicePaymentPost(utility::string_t authorization, std::shared_ptr<PaymentTransactionIn> body);
    /// <summary>
    /// Calculation Method
    /// </summary>
    /// <remarks>
    /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
    /// </remarks>
    /// <param name="authorization">Bearer {auth}</param>/// <param name="body">Transaction Message</param>
    pplx::task<std::shared_ptr<PurchaseTransactionOut>> calculationsservicePurchasePost(utility::string_t authorization, std::shared_ptr<PurchaseTransactionIn> body);
    /// <summary>
    /// Calculation Method
    /// </summary>
    /// <remarks>
    /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned.
    /// </remarks>
    /// <param name="authorization">Bearer {auth}</param>/// <param name="body">Transaction Message</param>
    pplx::task<std::shared_ptr<ReceiptTransactionOut>> calculationsserviceReceiptPost(utility::string_t authorization, std::shared_ptr<ReceiptTransactionIn> body);
    /// <summary>
    /// Calculation Method
    /// </summary>
    /// <remarks>
    /// Refer to the business rules below, for an outline view of Tax Determination Process as a whole, showing a beginning-to-end process making use of the specific UseCases and discriminating all required attributes and data to be returned. Accept all transactions type (Sale, Purchase, Payment and Receipt), the format and message type are desbribed above in each &#39;calculations-&lt;type&gt;&#39;.
    /// </remarks>
    /// <param name="authorization">Bearer {auth}</param>/// <param name="body">Transaction Message</param>
    pplx::task<std::shared_ptr<SalesTransactionOut>> calculationsserviceSalesPost(utility::string_t authorization, std::shared_ptr<SalesTransactionIn> body);

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ServiceCalculationsApi_H_ */

