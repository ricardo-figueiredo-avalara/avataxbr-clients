package io.swagger.api;

import io.swagger.model.CfopConf;
import io.swagger.model.InlineResponse201;
import org.joda.time.LocalDate;
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
public interface TaxConfCFOPApi  {

    @POST
    @Path("/taxconf/cfop")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "create a new CFOP configuration", tags={  })
    public InlineResponse201 createCfop(CfopConf body);

    @DELETE
    @Path("/taxconf/cfop/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "disable a CFOP.", tags={  })
    public  deleteCfop(@PathParam("code") String code);

    @GET
    @Path("/taxconf/cfop/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "get CFOP information.", tags={  })
    public CfopConf getCfop(@PathParam("code") String code);

    @GET
    @Path("/taxconf/cfop")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "retrive list of CFOP.", tags={  })
    public List<List<CfopConf>> getCfopList(@QueryParam("suffixcode")String suffixcode, @QueryParam("date")LocalDate date, @QueryParam("inactive")Boolean inactive);

    @PUT
    @Path("/taxconf/cfop/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "update a CFOP configuration", tags={  })
    public  updateCfop(@PathParam("code") String code, CfopConf taxconfcfop);
}

