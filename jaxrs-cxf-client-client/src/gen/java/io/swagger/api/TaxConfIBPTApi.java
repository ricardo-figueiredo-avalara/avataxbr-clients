package io.swagger.api;

import io.swagger.model.IbptConf;
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
public interface TaxConfIBPTApi  {

    @POST
    @Path("/taxconf/ibpt")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "create a new Process Type configuration", tags={  })
    public InlineResponse201 createIbptConf(IbptConf taxconfprocess);

    @DELETE
    @Path("/taxconf/ibpt/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "disable a IBPT.", tags={  })
    public  deleteIbptConf(@PathParam("code") String code);

    @GET
    @Path("/taxconf/ibpt/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "get IBPT information.", tags={  })
    public IbptConf getIbptConf(@PathParam("code") String code);

    @GET
    @Path("/taxconf/ibpt")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "retrive list of IBPT.", tags={  })
    public List<List<IbptConf>> getIbptConfList(@QueryParam("accountId")String accountId, @QueryParam("date")LocalDate date, @QueryParam("inactive")Boolean inactive);

    @PUT
    @Path("/taxconf/ibpt/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "update a Process Type configuration", tags={  })
    public  updateIbptConf(@PathParam("code") String code, IbptConf taxconfprocess);
}

