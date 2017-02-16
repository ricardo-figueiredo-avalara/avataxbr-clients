package io.swagger.api;

import io.swagger.model.Message;
import io.swagger.model.TransactionForGoodsIn;
import io.swagger.model.TransactionForGoodsOut;
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
public interface GoodsCalculationsApi  {

    @POST
    @Path("/calculations?goods-purchase")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Calculation Method", tags={  })
    public TransactionForGoodsOut calculationsgoodsPurchasePost(@HeaderParam("Authorization") String authorization, TransactionForGoodsIn body);

    @POST
    @Path("/calculations?goods-sales")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Calculation Method", tags={  })
    public TransactionForGoodsOut calculationsgoodsSalesPost(@HeaderParam("Authorization") String authorization, TransactionForGoodsIn body);
}

