package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse201;
import io.swagger.model.ItemCpom;
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
public interface CompanyItemCPOMServiceApi  {

    @GET
    @Path("/companies/{companyId}/items/{code}/cpom/{cityCode}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public ItemCpom companiesCompanyIdItemsCodeCpomCityCodeGet(@PathParam("companyId") String companyId, @PathParam("code") String code, @PathParam("cityCode") BigDecimal cityCode);

    @GET
    @Path("/companies/{companyId}/items/{code}/cpom")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<ItemCpom>> companiesCompanyIdItemsCodeCpomGet(@PathParam("companyId") String companyId, @PathParam("code") String code, @HeaderParam("X-Pagination-Limit") Integer xPaginationLimit, @HeaderParam("X-Pagination-Current-Page") Integer xPaginationCurrentPage, @HeaderParam("X-Pagination-Sort") String xPaginationSort);

    @POST
    @Path("/companies/{companyId}/items/{code}/cpom")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom agast for one company", tags={  })
    public InlineResponse201 createItemCPOM(@PathParam("companyId") String companyId, @PathParam("code") String code, ItemCpom body);

    @DELETE
    @Path("/companies/{companyId}/items/{code}/cpom/{cityCode}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteItemCPOM(@PathParam("companyId") String companyId, @PathParam("code") String code, @PathParam("cityCode") BigDecimal cityCode);

    @PUT
    @Path("/companies/{companyId}/items/{code}/cpom/{cityCode}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update custom agast for one company", tags={  })
    public  updateItemCPOM(@PathParam("companyId") String companyId, @PathParam("code") String code, @PathParam("cityCode") BigDecimal cityCode, ItemCpom body);
}

