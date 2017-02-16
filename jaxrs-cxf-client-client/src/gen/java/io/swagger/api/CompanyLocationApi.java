package io.swagger.api;

import io.swagger.model.InlineResponse201;
import io.swagger.model.Location;
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
public interface CompanyLocationApi  {

    @GET
    @Path("/companies/{companyId}/locations/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public Location companiesCompanyIdLocationsCodeGet(@PathParam("companyId") String companyId, @PathParam("code") String code);

    @GET
    @Path("/companies/{companyId}/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<Location>> companiesCompanyIdLocationsGet(@PathParam("companyId") String companyId, @HeaderParam("X-Pagination-Limit") Integer xPaginationLimit, @HeaderParam("X-Pagination-Current-Page") Integer xPaginationCurrentPage, @HeaderParam("X-Pagination-Sort") String xPaginationSort);

    @POST
    @Path("/companies/{companyId}/locations")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create new location for company", tags={  })
    public InlineResponse201 createLocation(@PathParam("companyId") String companyId, Location body);

    @DELETE
    @Path("/companies/{companyId}/locations/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteLocation(@PathParam("companyId") String companyId, @PathParam("code") String code);

    @PUT
    @Path("/companies/{companyId}/locations/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update location for company", tags={  })
    public  updateLocation(@PathParam("companyId") String companyId, @PathParam("code") String code, Location body);
}

