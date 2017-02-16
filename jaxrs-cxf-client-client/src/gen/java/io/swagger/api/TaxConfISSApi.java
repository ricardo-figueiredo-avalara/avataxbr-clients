package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.InlineResponse201;
import io.swagger.model.IssConfByCity;
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
public interface TaxConfISSApi  {

    @POST
    @Path("/taxconf/iss")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "create a new ISS Configuration", tags={  })
    public InlineResponse201 createIssConfByCity(IssConfByCity issConfByCity);

    @DELETE
    @Path("/taxconf/iss/{cityCode}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "disable a ISS by City Code.", tags={  })
    public  deleteIssConf(@PathParam("cityCode") BigDecimal cityCode);

    @GET
    @Path("/taxconf/iss/{cityCode}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "get ISS information by City Code.", tags={  })
    public List<List<IssConfByCity>> getIssConfByCity(@PathParam("cityCode") BigDecimal cityCode, @QueryParam("code")String code, @QueryParam("date")LocalDate date, @QueryParam("inactive")Boolean inactive);

    @GET
    @Path("/taxconf/iss")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "retrive list of ISS", tags={  })
    public List<List<IssConfByCity>> getIssList(@QueryParam("suffixcode")String suffixcode, @QueryParam("date")LocalDate date, @QueryParam("inactive")Boolean inactive);

    @PUT
    @Path("/taxconf/iss/{cityCode}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "update a ISS by City Code.", tags={  })
    public  updateIssConfByCity(@PathParam("cityCode") BigDecimal cityCode, IssConfByCity issConfByCity);
}

