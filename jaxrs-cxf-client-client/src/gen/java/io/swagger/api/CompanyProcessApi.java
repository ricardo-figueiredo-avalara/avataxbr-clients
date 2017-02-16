package io.swagger.api;

import io.swagger.model.CustomProcessScenario;
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
public interface CompanyProcessApi  {

    @GET
    @Path("/companies/{companyId}/process/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public CustomProcessScenario companiesCompanyIdProcessCodeGet(@PathParam("companyId") String companyId, @PathParam("code") String code);

    @GET
    @Path("/companies/{companyId}/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<CustomProcessScenario>> companiesCompanyIdProcessGet(@PathParam("companyId") String companyId, @HeaderParam("X-Pagination-Limit") Integer xPaginationLimit, @HeaderParam("X-Pagination-Current-Page") Integer xPaginationCurrentPage, @HeaderParam("X-Pagination-Sort") String xPaginationSort);

    @POST
    @Path("/companies/{companyId}/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom process tax for one company", tags={  })
    public InlineResponse201 createCustomProcessScenario(@PathParam("companyId") String companyId, CustomProcessScenario body);

    @DELETE
    @Path("/companies/{companyId}/process/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteCustomProcessScenario(@PathParam("companyId") String companyId, @PathParam("code") String code);

    @PUT
    @Path("/companies/{companyId}/process/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update custom agast for one company", tags={  })
    public  updateCustomProcessScenario(@PathParam("companyId") String companyId, @PathParam("code") String code, CustomProcessScenario body);
}

