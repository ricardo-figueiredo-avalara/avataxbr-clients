package io.swagger.api;

import io.swagger.model.Message;
import io.swagger.model.PaymentTransactionIn;
import io.swagger.model.PaymentTransactionOut;
import io.swagger.model.PurchaseTransactionIn;
import io.swagger.model.PurchaseTransactionOut;
import io.swagger.model.ReceiptTransactionIn;
import io.swagger.model.ReceiptTransactionOut;
import io.swagger.model.SalesTransactionIn;
import io.swagger.model.SalesTransactionOut;
import io.swagger.model.ValidationError;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/")
@Api(value = "/", description = "")
public interface ServiceCalculationsApi  {

    @GET
    @Path("/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve transactions", tags={  })
    public  calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeGet(@HeaderParam("Authorization") String authorization, @PathParam("accountId") String accountId, @PathParam("companyCode") String companyCode, @PathParam("transactionType") String transactionType, @PathParam("documentCode") String documentCode);

    @POST
    @Path("/calculations/account/{accountId}/company/{companyCode}/{transactionType}/{documentCode}/transactions")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Promote a calculation to transaction", tags={  })
    public  calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeDocumentCodeTransactionsPost(@HeaderParam("Authorization") String authorization, @PathParam("accountId") String accountId, @PathParam("companyCode") String companyCode, @PathParam("transactionType") String transactionType, @PathParam("documentCode") String documentCode);

    @GET
    @Path("/calculations/account/{accountId}/company/{companyCode}/{transactionType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve transactions", tags={  })
    public  calculationsAccountAccountIdCompanyCompanyCodeTransactionTypeGet(@HeaderParam("Authorization") String authorization, @PathParam("accountId") String accountId, @PathParam("companyCode") String companyCode, @PathParam("transactionType") String transactionType);

    @POST
    @Path("/calculations?service-payment")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Calculation Method", tags={  })
    public PaymentTransactionOut calculationsservicePaymentPost(@HeaderParam("Authorization") String authorization, PaymentTransactionIn body);

    @POST
    @Path("/calculations?service-purchase")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Calculation Method", tags={  })
    public PurchaseTransactionOut calculationsservicePurchasePost(@HeaderParam("Authorization") String authorization, PurchaseTransactionIn body);

    @POST
    @Path("/calculations?service-receipt")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Calculation Method", tags={  })
    public ReceiptTransactionOut calculationsserviceReceiptPost(@HeaderParam("Authorization") String authorization, ReceiptTransactionIn body);

    @POST
    @Path("/calculations?service-sales")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Calculation Method", tags={  })
    public SalesTransactionOut calculationsserviceSalesPost(@HeaderParam("Authorization") String authorization, SalesTransactionIn body);
}

