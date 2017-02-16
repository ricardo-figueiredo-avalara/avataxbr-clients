package io.swagger.api;

import io.swagger.model.CustomAgast;
import io.swagger.model.InlineResponse2001;
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
public interface CompanyAGASTApi  {

    @GET
    @Path("/companies/{companyId}/agasts/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public CustomAgast companiesCompanyIdAgastsCodeGet(@PathParam("companyId") String companyId, @PathParam("code") String code, @QueryParam("parent")String parent);

    @GET
    @Path("/companies/{companyId}/agasts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<InlineResponse2001>> companiesCompanyIdAgastsGet(@PathParam("companyId") String companyId, @QueryParam("text")String text, @HeaderParam("X-Pagination-Limit") Integer xPaginationLimit, @HeaderParam("X-Pagination-Current-Page") Integer xPaginationCurrentPage, @HeaderParam("X-Pagination-Sort") String xPaginationSort, @QueryParam("agast")String agast, @QueryParam("parent")String parent);

    @POST
    @Path("/companies/{companyId}/agasts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom agast for one company", tags={  })
    public InlineResponse201 createCustomAgast(@PathParam("companyId") String companyId, CustomAgast body, @QueryParam("text")String text);

    @DELETE
    @Path("/companies/{companyId}/agasts/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteAgast(@PathParam("companyId") String companyId, @PathParam("code") String code);

    @PUT
    @Path("/companies/{companyId}/agasts/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update custom agast for one company", tags={  })
    public  updateCustomAgast(@PathParam("companyId") String companyId, @PathParam("code") String code, CustomAgast body);
}

