package io.swagger.api;

import io.swagger.model.Body4;
import io.swagger.model.InlineResponse2003;
import io.swagger.model.Message;
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
public interface InvoiceContingencyApi  {

    @DELETE
    @Path("/invoices/contingency/{state}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Invoice Drop Contingency per State", tags={  })
    public  invoiceDropContingency(@PathParam("state") String state);

    @PUT
    @Path("/invoices/contingency/{state}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Invoice Set Contingency per State", tags={  })
    public  invoiceSetContingency(@PathParam("state") String state, Body4 body);

    @GET
    @Path("/invoices/contingency/{state}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Invoice Verify Contingency per State", tags={  })
    public InlineResponse2003 invoiceVerifyContingency(@PathParam("state") String state);
}

