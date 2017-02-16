package io.swagger.api;

import io.swagger.model.Agast;
import io.swagger.model.InlineResponse2001;
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
public interface AGASTApi  {

    @GET
    @Path("/agasts/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public Agast agastsCodeGet(@PathParam("code") String code);

    @POST
    @Path("/agasts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Create agast", tags={  })
    public InlineResponse201 createAgast(Agast body);

    @DELETE
    @Path("/agasts/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public  deleteAgast(@PathParam("code") String code);

    @GET
    @Path("/agasts")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    public List<List<InlineResponse2001>> getAgastList(@QueryParam("text")String text);

    @PUT
    @Path("/agasts/{code}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Update agast", tags={  })
    public  updateAgast(@PathParam("code") String code, Agast body);
}

