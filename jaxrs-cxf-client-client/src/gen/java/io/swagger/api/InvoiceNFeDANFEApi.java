package io.swagger.api;

import java.io.File;
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
public interface InvoiceNFeDANFEApi  {

    @GET
    @Path("/invoices/nfe/{key}")
    @Consumes({ "application/json" })
    @Produces({ "application/pdf" })
    @ApiOperation(value = "Retrieve Danfe", tags={  })
    public File nfePrint(@HeaderParam("Authorization") String authorization, @PathParam("key") String key);
}

