package io.swagger.api;

import io.swagger.model.AccountCompany;
import io.swagger.model.Body;
import io.swagger.model.InlineResponse201;
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
public interface AccountApi  {

    @GET
    @Path("/accounts/{accountId}/companies")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Companies by account", tags={  })
    public List<List<AccountCompany>> accountsAccountIdCompaniesGet(@PathParam("accountId") String accountId);

    @POST
    @Path("/accounts/{accountId}/companies")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create company and your data configuration", tags={  })
    public InlineResponse201 createAccountCompany(@PathParam("accountId") String accountId, Body body);
}

