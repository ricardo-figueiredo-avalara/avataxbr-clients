package io.swagger.api;

import io.swagger.model.Message;
import io.swagger.model.SefazDisableRangeIn;
import io.swagger.model.SefazInvoiceBasicStatus;
import io.swagger.model.SefazItDeleteIn;
import io.swagger.model.SefazItGetOut;
import io.swagger.model.SefazItPutIn;
import io.swagger.model.SefazPostOut;
import io.swagger.model.TransactionForSefazGoods;
import io.swagger.model.TransactionForSefazGoodsList;
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
public interface InvoiceSEFAZApi  {

    @DELETE
    @Path("/invoices/sefaz")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Disable Range e-Invoice", tags={  })
    public SefazInvoiceBasicStatus invoicesSefazDelete(@HeaderParam("Authorization") String authorization, SefazDisableRangeIn body);

    @DELETE
    @Path("/invoices/sefaz/{key}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Cancel invoice", tags={  })
    public SefazInvoiceBasicStatus invoicesSefazKeyDelete(@HeaderParam("Authorization") String authorization, @PathParam("key") String key, SefazItDeleteIn body);

    @GET
    @Path("/invoices/sefaz/{key}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve invoice", tags={  })
    public SefazItGetOut invoicesSefazKeyGet(@HeaderParam("Authorization") String authorization, @PathParam("key") String key);

    @GET
    @Path("/invoices/sefaz/{key}/lookup")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve invoice", tags={  })
    public TransactionForSefazGoodsList invoicesSefazKeyLookupGet(@HeaderParam("Authorization") String authorization, @PathParam("key") String key);

    @PUT
    @Path("/invoices/sefaz/{key}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Fix Letter", tags={  })
    public SefazInvoiceBasicStatus invoicesSefazKeyPut(@HeaderParam("Authorization") String authorization, @PathParam("key") String key, SefazItPutIn body);

    @POST
    @Path("/invoices/sefaz")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Send an e-Invoice", tags={  })
    public SefazPostOut invoicesSefazPost(@HeaderParam("Authorization") String authorization, List<TransactionForSefazGoods> body);

    @GET
    @Path("/invoices/sefaz/status")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Status of SEFAZ Server", tags={  })
    public String invoicesSefazStatusGet(@HeaderParam("Authorization") String authorization);
}

