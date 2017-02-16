package io.swagger.api;

import io.swagger.model.Body1;
import io.swagger.model.InlineResponse201;
import io.swagger.model.ItemSimple;
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
public interface CompanyItemServiceApi  {

    @PUT
    @Path("/companies/{companyId}/items/{code}/change-code")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  companiesCompanyIdItemsCodeChangeCodePut(@PathParam("companyId") String companyId, @PathParam("code") String code, Body1 body, @QueryParam("goods")String goods, @QueryParam("service")String service);

    @GET
    @Path("/companies/{companyId}/items/{code}?service")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public ItemSimple companiesCompanyIdItemsCodeserviceGet(@PathParam("companyId") String companyId, @PathParam("code") String code, @HeaderParam("Avalara-Product-Type") String avalaraProductType, @QueryParam("agast")String agast);

    @GET
    @Path("/companies/{companyId}/items?service")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<ItemSimple>> companiesCompanyIdItemsserviceGet(@PathParam("companyId") String companyId, @HeaderParam("Avalara-Product-Type") String avalaraProductType, @HeaderParam("X-Pagination-Limit") Integer xPaginationLimit, @HeaderParam("X-Pagination-Current-Page") Integer xPaginationCurrentPage, @HeaderParam("X-Pagination-Sort") String xPaginationSort, @QueryParam("code")String code, @QueryParam("agast")String agast);

    @POST
    @Path("/companies/{companyId}/items?service")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom agast for one company", tags={  })
    public InlineResponse201 createItemService(@PathParam("companyId") String companyId, ItemSimple body, @HeaderParam("Avalara-Product-Type") String avalaraProductType);

    @DELETE
    @Path("/companies/{companyId}/items/{code}?service")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteItemService(@PathParam("companyId") String companyId, @PathParam("code") String code, @HeaderParam("Avalara-Product-Type") String avalaraProductType);

    @PUT
    @Path("/companies/{companyId}/items/{code}?service")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update custom agast for one company", tags={  })
    public  updateItemService(@PathParam("companyId") String companyId, @PathParam("code") String code, ItemSimple body, @HeaderParam("Avalara-Product-Type") String avalaraProductType);
}

