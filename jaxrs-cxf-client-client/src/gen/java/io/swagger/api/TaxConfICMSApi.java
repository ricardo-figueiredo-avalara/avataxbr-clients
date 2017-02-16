package io.swagger.api;

import io.swagger.model.IcmsConfByState;
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
public interface TaxConfICMSApi  {

    @POST
    @Path("/taxconf/icms/{state}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "create a new ICMS Configuration", tags={  })
    public InlineResponse201 createIcmsconfstate(@PathParam("state") String state, IcmsConfByState icmsConfState);

    @DELETE
    @Path("/taxconf/icms/{state}/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "disable a ICMS by State.", tags={  })
    public  deleteIcmsConf(@PathParam("state") String state, @PathParam("code") String code);

    @GET
    @Path("/taxconf/icms/{state}/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "get ICMS information by State.", tags={  })
    public List<List<IcmsConfByState>> getIcmsConfByState(@PathParam("state") String state, @PathParam("code") String code);

    @GET
    @Path("/taxconf/icms/{state}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "retrive list of ICMS.", tags={  })
    public List<List<IcmsConfByState>> getIcmsList(@PathParam("state") String state, @QueryParam("suffixcode")String suffixcode, @QueryParam("date")LocalDate date, @QueryParam("inactive")Boolean inactive);

    @GET
    @Path("/taxconf/icms-search/")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "retrive list of ICMS.", tags={  })
    public List<List<IcmsConfByState>> getIcmsList_1(@QueryParam("text")String text, @QueryParam("state")String state);

    @PUT
    @Path("/taxconf/icms/{state}/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "update a IcmsConf State,", tags={  })
    public  updateIcmsconfstate(@PathParam("state") String state, @PathParam("code") String code, IcmsConfByState icmsConfState);
}

