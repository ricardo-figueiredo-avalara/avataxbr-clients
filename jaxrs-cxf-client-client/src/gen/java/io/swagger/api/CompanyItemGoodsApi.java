package io.swagger.api;

import io.swagger.model.Body1;
import io.swagger.model.InlineResponse201;
import io.swagger.model.ItemGoods;
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
public interface CompanyItemGoodsApi  {

    @PUT
    @Path("/companies/{companyId}/items/{code}/change-code")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  companiesCompanyIdItemsCodeChangeCodePut(@PathParam("companyId") String companyId, @PathParam("code") String code, Body1 body, @QueryParam("goods")String goods, @QueryParam("service")String service);

    @GET
    @Path("/companies/{companyId}/items/{code}?goods")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public ItemGoods companiesCompanyIdItemsCodegoodsGet(@PathParam("companyId") String companyId, @PathParam("code") String code, @HeaderParam("Avalara-Product-Type") String avalaraProductType, @QueryParam("agast")String agast);

    @GET
    @Path("/companies/{companyId}/items?goods")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<ItemGoods>> companiesCompanyIdItemsgoodsGet(@PathParam("companyId") String companyId, @HeaderParam("Avalara-Product-Type") String avalaraProductType, @HeaderParam("X-Pagination-Limit") Integer xPaginationLimit, @HeaderParam("X-Pagination-Current-Page") Integer xPaginationCurrentPage, @HeaderParam("X-Pagination-Sort") String xPaginationSort, @QueryParam("code")String code, @QueryParam("agast")String agast);

    @POST
    @Path("/companies/{companyId}/items?goods")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create custom agast for one company", tags={  })
    public InlineResponse201 createItem(@PathParam("companyId") String companyId, @HeaderParam("Avalara-Product-Type") String avalaraProductType, ItemGoods body);

    @DELETE
    @Path("/companies/{companyId}/items/{code}?goods")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteItem(@PathParam("companyId") String companyId, @PathParam("code") String code, @HeaderParam("Avalara-Product-Type") String avalaraProductType);

    @PUT
    @Path("/companies/{companyId}/items/{code}?goods")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update custom agast for one company", tags={  })
    public  updateItem(@PathParam("companyId") String companyId, @PathParam("code") String code, @HeaderParam("Avalara-Product-Type") String avalaraProductType, ItemGoods body);
}

