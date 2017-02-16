package io.swagger.api;

import io.swagger.model.Company;
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
public interface CompanyApi  {

    @GET
    @Path("/companies")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Retrieve Companies by account", tags={  })
    public List<List<Company>> companiesGet();

    @POST
    @Path("/companies")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create company and your data configuration", tags={  })
    public Company createCompany(Company body);

    @DELETE
    @Path("/accounts/{accountId}/companies/{companyId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteAccountCompany(@PathParam("accountId") String accountId, @PathParam("companyId") String companyId);

    @DELETE
    @Path("/companies/{companyId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteCompany(@PathParam("companyId") String companyId, @PathParam("companyId") String companyId2);

    @GET
    @Path("/companies/{companyId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Get company information and your data configuration", tags={  })
    public Company infoCompany(@PathParam("companyId") String companyId);

    @PUT
    @Path("/companies/{companyId}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update company information and your data configuration", tags={  })
    public  updateCompany(@PathParam("companyId") String companyId, Company body);
}

