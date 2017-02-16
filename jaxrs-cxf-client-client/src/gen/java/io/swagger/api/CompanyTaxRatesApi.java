package io.swagger.api;

import io.swagger.model.CustomTaxTypeRate;
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
public interface CompanyTaxRatesApi  {

    @GET
    @Path("/companies/{companyId}/taxrates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<CustomTaxTypeRate>> companiesCompanyIdTaxratesGet(@PathParam("companyId") String companyId, @HeaderParam("X-Pagination-Limit") Integer xPaginationLimit, @HeaderParam("X-Pagination-Current-Page") Integer xPaginationCurrentPage, @HeaderParam("X-Pagination-Sort") String xPaginationSort);

    @GET
    @Path("/companies/{companyId}/taxrates/{taxType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public CustomTaxTypeRate companiesCompanyIdTaxratesTaxTypeGet(@PathParam("companyId") String companyId, @PathParam("taxType") String taxType);

    @POST
    @Path("/companies/{companyId}/taxrates")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom agast for one company", tags={  })
    public InlineResponse201 createCustomTaxes(@PathParam("companyId") String companyId, CustomTaxTypeRate body);

    @DELETE
    @Path("/companies/{companyId}/taxrates/{taxType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteCustomTaxes(@PathParam("companyId") String companyId, @PathParam("taxType") String taxType);

    @PUT
    @Path("/companies/{companyId}/taxrates/{taxType}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update custom agast for one company", tags={  })
    public  updateCustomTaxes(@PathParam("companyId") String companyId, @PathParam("taxType") String taxType, CustomTaxTypeRate body);
}

