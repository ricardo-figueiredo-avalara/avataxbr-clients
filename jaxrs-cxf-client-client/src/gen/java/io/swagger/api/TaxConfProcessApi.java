package io.swagger.api;

import io.swagger.model.InlineResponse201;
import org.joda.time.LocalDate;
import io.swagger.model.Message;
import io.swagger.model.ProcessScenario;
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
public interface TaxConfProcessApi  {

    @POST
    @Path("/taxconf/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "create a new Process Type configuration", tags={  })
    public InlineResponse201 createProcess(ProcessScenario taxconfprocess);

    @DELETE
    @Path("/taxconf/process/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "disable a Process.", tags={  })
    public  deleteProcess(@PathParam("code") String code);

    @GET
    @Path("/taxconf/process/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "get Process information.", tags={  })
    public ProcessScenario getProcess(@PathParam("code") String code);

    @GET
    @Path("/taxconf/process")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "retrive list of Process.", tags={  })
    public List<List<ProcessScenario>> getProcessList(@QueryParam("accountId")String accountId, @QueryParam("date")LocalDate date, @QueryParam("inactive")Boolean inactive);

    @PUT
    @Path("/taxconf/process/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "update a Process Type configuration", tags={  })
    public  updateProcess(@PathParam("code") String code, ProcessScenario taxconfprocess);
}

