package io.swagger.api;

import io.swagger.model.CustomIcmsConfByState;
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
public interface CompanyICMSApi  {

    @GET
    @Path("/companies/{companyId}/icms")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<CustomIcmsConfByState>> companiesCompanyIdIcmsGet(@PathParam("companyId") String companyId, @HeaderParam("X-Pagination-Limit") Integer xPaginationLimit, @HeaderParam("X-Pagination-Current-Page") Integer xPaginationCurrentPage, @HeaderParam("X-Pagination-Sort") String xPaginationSort);

    @GET
    @Path("/companies/{companyId}/icms/{state}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public CustomIcmsConfByState companiesCompanyIdIcmsStateGet(@PathParam("companyId") String companyId, @PathParam("state") String state);

    @POST
    @Path("/companies/{companyId}/icms")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom ICMS tax for one company", tags={  })
    public InlineResponse201 createICMS(@PathParam("companyId") String companyId, CustomIcmsConfByState body);

    @DELETE
    @Path("/companies/{companyId}/icms/{state}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteCustomIcmsConfByState(@PathParam("companyId") String companyId, @PathParam("state") String state);

    @PUT
    @Path("/companies/{companyId}/icms/{state}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update custom agast for one company", tags={  })
    public  updateCustomIcmsConfByState(@PathParam("companyId") String companyId, @PathParam("state") String state, CustomIcmsConfByState body);
}

